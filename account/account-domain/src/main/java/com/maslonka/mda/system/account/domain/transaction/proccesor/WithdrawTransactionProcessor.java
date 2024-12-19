package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.Transaction;
import com.maslonka.mda.system.account.domain.transaction.request.WithdrawRequest;

public class WithdrawTransactionProcessor implements TransactionProcessor<WithdrawRequest> {

    private final AccountService service;

    public WithdrawTransactionProcessor(AccountService service) {
        this.service = service;
    }

    @Override
    public Transaction process(WithdrawRequest request) {
        Account account = service.read(request.accountId());
        return new WithdrawTransaction(account, request.amount());
    }
}
