package com.maslonka.mda.system.customer.domain.customer;

import com.maslonka.mda.system.customer.domain.utills.ValueObject;

import static com.maslonka.mda.system.customer.domain.utills.Constants.EMAIL_REGEX;

public record Email(
        String value
) implements ValueObject<Email> {

    public Email {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Email is required");
        }
        if (!value.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("Email is invalid");
        }
    }

    @Override
    public boolean sameValueAs(Email other) {
        return this.equals(other);
    }

}
