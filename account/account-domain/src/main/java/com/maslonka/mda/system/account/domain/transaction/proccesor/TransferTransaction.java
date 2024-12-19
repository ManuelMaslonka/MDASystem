package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.Balance;
import com.maslonka.mda.system.account.domain.transaction.Transaction;

import java.util.Objects;

public class TransferTransaction extends Transaction {

    private Account accountSource;
    private Account accountDestination;
    private Balance balance;

    public TransferTransaction() {
    }

    TransferTransaction(Account accountSource, Account accountDestination, Balance balance) {
        this.accountSource = Objects.requireNonNull(accountSource, "accountSourceId cannot be null");
        this.accountDestination = Objects.requireNonNull(accountDestination, "accountDestinationId cannot be null");
        this.balance = Objects.requireNonNull(balance, "balance cannot be null");
    }

    @Deprecated
    public TransferTransaction(Long id, Account accountSource, Account accountDestination, Balance balance) {
        super(id);
        this.accountSource = accountSource;
        this.accountDestination = accountDestination;
        this.balance = balance;
    }

    public Account getAccountSource() {
        return accountSource;
    }

    public Account getAccountDestination() {
        return accountDestination;
    }

    public Balance getBalance() {
        return balance;
    }

    @Override
    public void execute() {
        accountSource.getBalance().subtractAmount(balance.getAmount());
        accountDestination.getBalance().addAmount(balance.getAmount());
    }
}
