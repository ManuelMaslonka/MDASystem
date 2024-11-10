package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountBuilder;
import com.maslonka.mda.system.account.domain.account.AccountRequest;
import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDtoBuilder;
import com.maslonka.mda.system.account.domainapi.dto.AccountRequestDomainDto;

public interface AccountDomainMapper {

    static AccountDomainDto toDto(Account account) {
        return AccountDomainDtoBuilder.anAccountDto()
                .withId(account.getId())
                .withTypeOfAccount(TypeOfAccountDomainMapper.toDto(account.getTypeOfAccount()))
                .withBalance(BalanceDomainMapper.toDto(account.getBalance()))
                .build();
    }

    static Account toEntity(AccountDomainDto account) {
        return AccountBuilder.Account()
                .balance(BalanceDomainMapper.toEntity(account.balance()))
                .typeOfAccount(TypeOfAccountDomainMapper.toEntity(account.typeOfAccount()))
                .build();
    }

    static AccountRequest toEntity(AccountRequestDomainDto account) {
        return new AccountRequest(TypeOfAccountDomainMapper.toEntity(account.typeOfAccount()), BalanceDomainMapper.toEntity(account.balance()));
    }

}
