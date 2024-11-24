package com.maslonka.mda.system.account.controller;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountRequestDomainDto;
import com.maslonka.mda.system.account.mapper.AccountDtoMapper;
import com.maslonka.mda.system.account.mapper.AccountRequestDtoMapper;
import com.maslonka.mda.system.account.rest.api.AccountsRestApi;
import com.maslonka.mda.system.account.rest.dto.AccountDto;
import com.maslonka.mda.system.account.rest.dto.AccountRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class AccountController implements AccountsRestApi {

    private final AccountApi accountServiceApi;
    private final AccountDtoMapper accountDtoMapper;
    private final AccountRequestDtoMapper accountRequestDtoMapper;

    public AccountController(AccountApi accountServiceApi, AccountDtoMapper accountDtoMapper, AccountRequestDtoMapper accountRequestDtoMapper) {
        this.accountServiceApi = accountServiceApi;
        this.accountDtoMapper = accountDtoMapper;
        this.accountRequestDtoMapper = accountRequestDtoMapper;
    }

    @Override
    public ResponseEntity<Void> createAccount(AccountRequestDto accountRequestDto) {
        AccountRequestDomainDto accountRequestDomainDto = accountRequestDtoMapper.toEntity(accountRequestDto);
        accountServiceApi.create(accountRequestDomainDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(accountRequestDomainDto).toUri();
        return ResponseEntity.created(location).build();
    }

    @Override
    public ResponseEntity<AccountDto> getAccount(Long id) {
        return ResponseEntity.ok(accountDtoMapper.toDto(accountServiceApi.read(id)));
    }
}
