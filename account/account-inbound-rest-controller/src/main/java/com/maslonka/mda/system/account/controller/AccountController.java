package com.maslonka.mda.system.account.controller;

import com.maslonka.mda.system.account.mapper.AccountMapper;
import com.maslonka.mda.system.account.mapper.AccountRequestMapper;
import com.maslonka.mda.system.account.rest.api.AccountsApi;
import com.maslonka.mda.system.account.rest.dto.AccountDto;
import com.maslonka.mda.system.account.rest.dto.AccountRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.maslonka.mda.system.account.domain.account.Account;
import sk.maslonka.mda.system.account.domain.account.AccountFacade;
import sk.maslonka.mda.system.account.domain.account.AccountRequest;

import java.net.URI;

@RestController
public class AccountController implements AccountsApi {

    private final AccountFacade accountFacade;

    private final AccountMapper accountMapper;
    private final AccountRequestMapper accountRequestMapper;


    public AccountController(AccountFacade accountFacade, AccountMapper accountMapper, AccountRequestMapper accountRequestMapper) {
        this.accountFacade = accountFacade;
        this.accountMapper = accountMapper;
        this.accountRequestMapper = accountRequestMapper;
    }

    @Override
    public ResponseEntity<Void> createAccount(AccountRequestDto accountRequestDto) {
        AccountRequest account = accountRequestMapper.toEntity(accountRequestDto);
        accountFacade.create(account);
        URI location = URI.create("/accounts/");
        return ResponseEntity.created(location).build();
    }

    @Override
    public ResponseEntity<AccountDto> getAccount(Long id) {
        AccountDto accountDto = accountMapper.toDto(accountFacade.read(id));
        return ResponseEntity.ok(accountDto);
    }
}
