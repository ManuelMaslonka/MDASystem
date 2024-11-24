package com.maslonka.mda.system.account.domain.api;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountRequestDomainDto;
import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountRequest;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.mapper.AccountDomainMapper;

public class AccountServiceApi implements AccountApi {

    private final AccountService accountService;

    public AccountServiceApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public AccountDomainDto read(Long accountId) {
        Account account = accountService.read(accountId);
        return AccountDomainMapper.toDto(account);
    }

    @Override
    public void create(AccountRequestDomainDto account) {
        AccountRequest accountEntity = AccountDomainMapper.toEntity(account);
        accountService.create(accountEntity);
    }

    @Override
    public void update(AccountDomainDto account) {
        Account accountEntity = AccountDomainMapper.toEntity(account);
        accountService.update(accountEntity);
    }

    @Override
    public void delete(Long accountId) {
        accountService.delete(accountId);
    }
}
