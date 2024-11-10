package com.maslonka.mda.system.account.domain.account;

import com.maslonka.mda.system.account.domain.utills.AggregateRoot;

public class Account implements AggregateRoot<Long> {

    private Long id;
    private TypeOfAccount typeOfAccount;
    private Balance balance;

    public Account() {
    }

    public Account(TypeOfAccount typeOfAccount, Balance balance) {
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
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
