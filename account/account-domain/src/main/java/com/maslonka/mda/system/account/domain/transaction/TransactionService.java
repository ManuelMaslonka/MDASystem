package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.transaction.request.TransactionRequest;

public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionFactory transactionFactory;

    public TransactionService(TransactionRepository transactionRepository, TransactionFactory transactionFactory) {
        this.transactionRepository = transactionRepository;
        this.transactionFactory = transactionFactory;
    }

    public void processTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = transactionFactory.createTransaction(transactionRequest);
        transaction.execute();
        transactionRepository.create(transaction);
    }
}
