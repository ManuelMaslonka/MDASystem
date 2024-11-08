package com.maslonka.mda.system.customer.accountapi;

import com.maslonka.mda.system.account.domainapi.AccountApi;
import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDto;
import com.maslonka.mda.system.customer.accountapi.dto.CustomerAccountDto;
import com.maslonka.mda.system.customer.accountapi.mapper.CustomerAccountMapper;

public class AccountServiceApi implements CustomerAccountApi {

    private final AccountApi accountApi;

    public AccountServiceApi(AccountApi accountServiceApi) {
        this.accountApi = accountServiceApi;
    }

    public CustomerAccountDto read(Long accountId) {
        AccountDomainDto read = accountApi.read(accountId);
        return CustomerAccountMapper.toDto(read);
    }
}
