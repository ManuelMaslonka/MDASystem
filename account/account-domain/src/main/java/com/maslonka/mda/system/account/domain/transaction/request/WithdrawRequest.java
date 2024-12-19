package com.maslonka.mda.system.account.domain.transaction.request;

import com.maslonka.mda.system.account.domain.account.Balance;

public record WithdrawRequest(Long accountId, Balance amount) implements TransactionRequest {
}
