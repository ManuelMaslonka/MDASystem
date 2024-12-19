package com.maslonka.mda.system.account.domain.transaction.proccesor;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.Balance;
import com.maslonka.mda.system.account.domain.transaction.Transaction;

import java.util.Objects;

public class WithdrawTransaction extends Transaction {

    private Account account;
    private Balance balance;

    public WithdrawTransaction() {
    }

    WithdrawTransaction(Account account, Balance balance) {
        this.account = Objects.requireNonNull(account, "account cannot be null");
        this.balance = Objects.requireNonNull(balance, "balance cannot be null");
    }

    @Deprecated
    public WithdrawTransaction(Long id, Account account, Balance balance) {
        super(id);
        this.account = account;
        this.balance = balance;
    }

    public Account getAccount() {
        return account;
    }

    public Balance getBalance() {
        return balance;
    }

    @Override
    public void execute() {
        account.getBalance().subtractAmount(balance.getAmount());
    }
}