package com.maslonka.mda.system.account.accountapi;

import sk.maslonka.mda.system.account.domain.account.Account;
import sk.maslonka.mda.system.account.domain.account.AccountRequest;
import sk.maslonka.mda.system.account.domain.account.AccountService;

public class AccountServiceApi implements AccountApi {

    private final AccountService accountService;

    public AccountServiceApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Account read(Long accountId) {
        return accountService.read(accountId);
    }

    @Override
    public void update(Account account) {
        accountService.update(account);
    }

    @Override
    public void create(AccountRequest account) {
        accountService.create(account);
    }

    @Override
    public void delete(Long accountId) {
        accountService.delete(accountId);
    }
}
