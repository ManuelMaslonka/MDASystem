package com.maslonka.mda.system.customer.accountapi.mapper;

import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDto;
import com.maslonka.mda.system.customer.accountapi.dto.BalanceAccountDto;
import com.maslonka.mda.system.customer.accountapi.dto.CustomerAccountDto;

public abstract class CustomerAccountMapper {

    CustomerAccountMapper() {
    }

    public static CustomerAccountDto toDto(AccountDomainDto accountDomainDto) {
        return new CustomerAccountDto(
                accountDomainDto.id(),
                accountDomainDto.typeOfAccount(),
                new BalanceAccountDto(accountDomainDto.balance().amount())
        );
    }

}
