package com.maslonka.mda.system.account.domain.account;

import com.maslonka.mda.system.account.domain.utills.ValueObject;

public enum TypeOfAccount implements ValueObject<TypeOfAccount> {
    SAVINGS, CURRENT, FIXED_DEPOSIT;

    @Override
    public boolean sameValueAs(TypeOfAccount other) {
        return this.equals(other);
    }
}
