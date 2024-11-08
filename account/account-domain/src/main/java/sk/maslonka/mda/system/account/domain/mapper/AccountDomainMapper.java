package sk.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDtoBuilder;
import com.maslonka.mda.system.account.domainapi.dto.AccountRequestDomainDto;
import com.maslonka.mda.system.account.domainapi.dto.TypeOfAccountDomainDto;
import sk.maslonka.mda.system.account.domain.account.Account;
import sk.maslonka.mda.system.account.domain.account.AccountBuilder;
import sk.maslonka.mda.system.account.domain.account.AccountRequest;

public abstract class AccountDomainMapper {

    public static AccountDomainDto toDto(Account account) {
        return AccountDomainDtoBuilder.anAccountDto()
                .withId(account.getId())
                .withTypeOfAccount(TypeOfAccountDomainDto.valueOf(account.getTypeOfAccount().name()))
                .withBalance(BalanceDomainMapper.toDto(account.getBalance()))
                .build();
    }

    public static Account toEntity(AccountDomainDto account) {
        return AccountBuilder.Account()
                .balance(BalanceDomainMapper.toEntity(account.balance()))
                .typeOfAccount(TypeOfAccountDomainMapper.toEntity(account.typeOfAccount()))
                .build();
    }

    public static AccountRequest toEntity(AccountRequestDomainDto account) {
        return new AccountRequest(TypeOfAccountDomainMapper.toEntity(account.typeOfAccount()), BalanceDomainMapper.toEntity(account.balance()));
    }

}
