package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountBuilder;
import com.maslonka.mda.system.account.domain.account.AccountRequest;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDtoBuilder;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountRequestDomainDto;

import java.util.List;

public interface AccountDomainMapper {

    static AccountDomainDto toDto(Account account) {
        return AccountDomainDtoBuilder.AccountDto()
                .Id(account.getId())
                .typeOfAccount(TypeOfAccountDomainMapper.toDto(account.getTypeOfAccount()))
                .balance(BalanceDomainMapper.toDto(account.getBalance()))
                .build();
    }

    static List<AccountDomainDto> toDto(List<Account> accounts) {
        return accounts.stream()
                .map(AccountDomainMapper::toDto)
                .toList();
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
