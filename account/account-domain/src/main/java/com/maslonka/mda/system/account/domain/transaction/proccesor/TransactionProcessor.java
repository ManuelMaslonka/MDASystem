package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.transaction.Transaction;
import com.maslonka.mda.system.account.domain.transaction.request.TransactionRequest;

public interface TransactionProcessor<T extends TransactionRequest> {
    Transaction process(T request);
}
