package com.maslonka.mda.system.customer.domain.customer;

import com.maslonka.mda.system.customer.domain.utills.ValueObject;

public record FullName(String firstName, String lastName) implements ValueObject<FullName> {

    public FullName {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name is required");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is required");
        }
    }

    @Override
    public boolean sameValueAs(FullName other) {
        return this.equals(other);
    }
}
