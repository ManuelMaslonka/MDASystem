package com.maslonka.mda.system.account.controller;

import com.maslonka.mda.system.account.domainapi.transaction.TransactionApi;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;
import com.maslonka.mda.system.account.mapper.TransactionRequestDomainDtoMapper;
import com.maslonka.mda.system.account.rest.api.TransactionsRestApi;
import com.maslonka.mda.system.account.rest.dto.TransactionRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController implements TransactionsRestApi {
    private final TransactionApi transactionApi;
    private final TransactionRequestDomainDtoMapper transactionRequestDomainDtoMapper;

    public TransactionController(TransactionApi transactionApi, TransactionRequestDomainDtoMapper transactionRequestDomainDtoMapper) {
        this.transactionApi = transactionApi;
        this.transactionRequestDomainDtoMapper = transactionRequestDomainDtoMapper;
    }

    @Override
    public ResponseEntity<Void> processTransaction(TransactionRequestDto transactionRequestDto) {
        TransactionRequestDomainDto entity = transactionRequestDomainDtoMapper.toEntity(transactionRequestDto);
        transactionApi.Transaction(entity);
        return ResponseEntity.ok().build();
    }
}
