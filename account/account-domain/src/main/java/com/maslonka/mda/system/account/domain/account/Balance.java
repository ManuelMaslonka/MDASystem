package com.maslonka.mda.system.account.domain.account;

import com.maslonka.mda.system.account.domain.utills.ValueObject;

import java.math.BigDecimal;

public class Balance implements ValueObject<Balance> {
    private BigDecimal amount;

    public Balance(BigDecimal amount) {
        this.amount = amount;
    }

    public Balance() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean sameValueAs(Balance other) {
        return other != null && amount.equals(other.amount);
    }
}
