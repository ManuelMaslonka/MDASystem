package com.maslonka.mda.system.customer.domain.accountapi;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.customer.domain.accountapi.dto.CustomerAccountDto;
import com.maslonka.mda.system.customer.domain.accountapi.mapper.CustomerAccountMapper;

import java.util.List;

public class OutboundAccountServiceApi implements AccountServiceApi {

    private final AccountApi accountApi;

    public OutboundAccountServiceApi(AccountApi accountServiceApi) {
        this.accountApi = accountServiceApi;
    }

    public CustomerAccountDto read(Long accountId) {
        AccountDomainDto read = accountApi.read(accountId);
        return CustomerAccountMapper.toDto(read);
    }

    @Override
    public List<CustomerAccountDto> read(List<Long> accountIds) {
        return  CustomerAccountMapper.toDto(accountApi.read(accountIds));
    }

    @Override
    public boolean exists(Long accountId) {
        return accountApi.exists(accountId);
    }
}
