package com.maslonka.mda.system.account.domain.transaction.request;

public sealed interface TransactionRequest permits DepositRequest, WithdrawRequest, TransferRequest {}
