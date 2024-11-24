package com.maslonka.mda.system.customer.accountapi;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.customer.accountapi.dto.CustomerAccountDto;
import com.maslonka.mda.system.customer.accountapi.mapper.CustomerAccountMapper;

public class OutboundAccountApi implements CustomerAccountApi {

    private final AccountApi accountApi;

    public OutboundAccountApi(AccountApi accountServiceApi) {
        this.accountApi = accountServiceApi;
    }

    public CustomerAccountDto read(Long accountId) {
        AccountDomainDto read = accountApi.read(accountId);
        return CustomerAccountMapper.toDto(read);
    }
}
