package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.utills.AggregateRoot;

public abstract class Transaction implements AggregateRoot<Long> {

    private Long id;

    public Transaction() {
    }

    public Transaction(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    protected abstract void execute();
}
