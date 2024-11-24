package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.account.Balance;

public record TransactionRequest(
        TransactionType transactionType,
        Long accountSource,
        Long accountDestination,
        Balance amount
) {
}
