package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.proccesor.DepositTransactionProcessor;
import com.maslonka.mda.system.account.domain.transaction.proccesor.TransactionProcessor;
import com.maslonka.mda.system.account.domain.transaction.proccesor.TransferTransactionProcessor;
import com.maslonka.mda.system.account.domain.transaction.proccesor.WithdrawTransactionProcessor;
import com.maslonka.mda.system.account.domain.transaction.request.DepositRequest;
import com.maslonka.mda.system.account.domain.transaction.request.TransactionRequest;
import com.maslonka.mda.system.account.domain.transaction.request.TransferRequest;
import com.maslonka.mda.system.account.domain.transaction.request.WithdrawRequest;

import java.util.HashMap;
import java.util.Map;


public class TransactionFactory {

    private final Map<Class<? extends TransactionRequest>, TransactionProcessor<?>> processors = new HashMap<>();

    public TransactionFactory(AccountService accountService) {
        processors.put(DepositRequest.class, new DepositTransactionProcessor(accountService));
        processors.put(WithdrawRequest.class, new WithdrawTransactionProcessor(accountService));
        processors.put(TransferRequest.class, new TransferTransactionProcessor(accountService));
    }

    @SuppressWarnings("unchecked")
    public <T extends TransactionRequest> Transaction createTransaction(T request) {
        TransactionProcessor<T> processor = (TransactionProcessor<T>) processors.get(request.getClass());
        if (processor == null) {
            throw new IllegalArgumentException("No processor found for request type: " + request.getClass());
        }
        return processor.process(request);
    }
}
