package com.maslonka.mda.system.customer.domain.customer;

public record PhoneNumber(
        String value
) {

    public PhoneNumber {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Phone number is required");
        }
    }

}
