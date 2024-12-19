package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.Transaction;
import com.maslonka.mda.system.account.domain.transaction.request.DepositRequest;

public class DepositTransactionProcessor implements TransactionProcessor<DepositRequest> {

    private final AccountService service;

    public DepositTransactionProcessor(AccountService service) {
        this.service = service;
    }

    @Override
    public Transaction process(DepositRequest request) {
        Account account = service.read(request.accountId());
        return new DepositTransaction(account, request.amount());
    }
}
