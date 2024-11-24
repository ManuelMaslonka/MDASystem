package com.maslonka.mda.system.account.domain.account;

import com.maslonka.mda.system.account.domain.utills.AggregateRoot;

import java.util.Objects;

public class Account implements AggregateRoot<Long> {

    private Long id;
    private TypeOfAccount typeOfAccount;
    private Balance balance;

    public Account() {
    }

    Account(TypeOfAccount typeOfAccount, Balance balance) {
        this.typeOfAccount = Objects.requireNonNull(typeOfAccount, "typeOfAccount cannot be null");
        this.balance = Objects.requireNonNull(balance, "balance cannot be null");
    }

    @Deprecated
    public Account(Long id, TypeOfAccount typeOfAccount, Balance balance) {
        this.id = id;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
    }

    @Override
    public Long getId() {
        return id;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Account(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
}
