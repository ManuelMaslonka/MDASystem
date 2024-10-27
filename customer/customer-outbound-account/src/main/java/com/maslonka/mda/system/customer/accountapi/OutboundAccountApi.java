package com.maslonka.mda.system.customer.accountapi;

import com.maslonka.mda.system.account.accountapi.AccountApi;
import org.springframework.stereotype.Service;
import sk.maslonka.mda.system.account.domain.account.Account;
import sk.maslonka.mda.system.account.domain.account.AccountRequest;

@Service
public class OutboundAccountApi implements AccountApi {

    private final AccountApi accountApi;

    public OutboundAccountApi(AccountApi accountApi) {
        this.accountApi = accountApi;
    }

    @Override
    public Account read(Long accountId) {
        return accountApi.read(accountId);
    }

    @Override
    public void update(Account account) {
        accountApi.update(account);
    }

    @Override
    public void create(AccountRequest account) {
        accountApi.create(account);
    }

    @Override
    public void delete(Long accountId) {
        accountApi.delete(accountId);
    }
}
