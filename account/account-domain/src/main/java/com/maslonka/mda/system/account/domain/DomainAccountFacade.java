package com.maslonka.mda.system.account.domain;

import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.TransactionRequest;
import com.maslonka.mda.system.account.domain.transaction.TransactionService;

public class DomainAccountFacade {
    private final AccountService accountService;
    private final TransactionService transactionService;

    public DomainAccountFacade(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    public void processTransaction(TransactionRequest transactionRequest) {
        transactionService.processTransaction(transactionRequest);
    }
}