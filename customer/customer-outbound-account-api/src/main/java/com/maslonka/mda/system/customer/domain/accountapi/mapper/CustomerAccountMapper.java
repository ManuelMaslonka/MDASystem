package com.maslonka.mda.system.customer.domain.accountapi.mapper;

import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.customer.domain.accountapi.dto.BalanceAccountDto;
import com.maslonka.mda.system.customer.domain.accountapi.dto.CustomerAccountDto;

import java.util.List;

public interface CustomerAccountMapper {

    static CustomerAccountDto toDto(AccountDomainDto accountDomainDto) {
        return new CustomerAccountDto(
                accountDomainDto.id(),
                accountDomainDto.typeOfAccount(),
                new BalanceAccountDto(accountDomainDto.balance().amount())
        );
    }

    static List<CustomerAccountDto> toDto(List<AccountDomainDto> accountDomainDtos) {
        return accountDomainDtos.stream()
                .map(CustomerAccountMapper::toDto)
                .toList();
    }

}
