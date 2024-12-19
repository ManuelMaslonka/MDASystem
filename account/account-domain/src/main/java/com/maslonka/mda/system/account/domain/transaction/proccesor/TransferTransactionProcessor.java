package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.Transaction;
import com.maslonka.mda.system.account.domain.transaction.request.TransferRequest;

public class TransferTransactionProcessor implements TransactionProcessor<TransferRequest> {

    private final AccountService service;

    public TransferTransactionProcessor(AccountService service) {
        this.service = service;
    }

    @Override
    public Transaction process(TransferRequest request) {
        Account source = service.read(request.accountSourceId());
        Account target = service.read(request.accountDestinationId());
        return new TransferTransaction(source, target, request.amount());
    }
}
