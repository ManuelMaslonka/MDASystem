package com.maslonka.mda.system.account.domain.transaction.request;

import com.maslonka.mda.system.account.domain.account.Balance;


public record DepositRequest(Long accountId, Balance amount) implements TransactionRequest {}
