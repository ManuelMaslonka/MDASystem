package com.maslonka.mda.system.account.domain.transaction;

public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionFactory transactionFactory;

    public TransactionService(TransactionRepository transactionRepository, TransactionFactory transactionFactory) {
        this.transactionRepository = transactionRepository;
        this.transactionFactory = transactionFactory;
    }

    public void processTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = transactionFactory.createTransaction(
                transactionRequest.transactionType(),
                transactionRequest.accountSource(),
                transactionRequest.accountDestination(),
                transactionRequest.amount()
        );
        transaction.execute();
        transactionRepository.create(transaction);
    }
}
