package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.account.Balance;

public class TransactionFactory {

    private final AccountService accountService;

    public TransactionFactory(AccountService accountService) {
        this.accountService = accountService;
    }

    Transaction createTransaction(TransactionType type, Long sourceAccount, Long destinationAccount, Balance amount) {
        return switch (type) {
            case DEPOSIT -> depositTransaction(sourceAccount, amount);
            case WITHDRAW -> withdrawTransaction(sourceAccount, amount);
            case TRANSFER -> transferTransaction(sourceAccount, destinationAccount, amount);
        };
    }

    private Transaction transferTransaction(Long sourceAccountId, Long destinationAccountId, Balance amount) {
        Account sourceAccount = accountService.read(sourceAccountId);
        Account destinationAccount = accountService.read(destinationAccountId);
        return new TransferTransaction(sourceAccount, destinationAccount, amount);
    }

    private Transaction withdrawTransaction(Long sourceAccountId, Balance amount) {
        Account sourceAccount = accountService.read(sourceAccountId);
        return new WithdrawTransaction(sourceAccount, amount);
    }

    private Transaction depositTransaction(Long sourceAccountId, Balance amount) {
        Account sourceAccount = accountService.read(sourceAccountId);
        return new DepositTransaction(sourceAccount, amount);
    }

}
