package com.maslonka.mda.system.account.domain.transaction.request;

import com.maslonka.mda.system.account.domain.account.Balance;

public record TransferRequest(Long accountSourceId, Long accountDestinationId, Balance amount) implements TransactionRequest {
}
