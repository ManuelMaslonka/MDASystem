package com.maslonka.mda.system.account.domain.account;

import com.maslonka.mda.system.account.domain.utills.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class Balance implements ValueObject<Balance> {
    private BigDecimal amount;

    public Balance(BigDecimal amount) {
        this.amount = Objects.requireNonNull(amount, "amount cannot be null");
    }

    public Balance() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void addAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("amount cannot be negative"); // TODO implement new bussiness exception
        }
        this.amount = this.amount.add(amount);
    }

    public void subtractAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("amount cannot be negative"); // TODO implement new bussiness exception
        }
        if (this.amount.compareTo(amount) < 0) {
            throw new IllegalArgumentException("amount cannot be negative"); // TODO implement new bussiness exception
        }
        if (this.amount.subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("amount cannot be negative"); // TODO implement new bussiness exception
        }
        this.amount = this.amount.subtract(amount);
    }

    @Override
    public boolean sameValueAs(Balance other) {
        return other != null && amount.equals(other.amount);
    }
}
