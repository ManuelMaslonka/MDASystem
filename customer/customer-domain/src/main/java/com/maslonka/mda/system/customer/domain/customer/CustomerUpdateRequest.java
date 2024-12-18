package com.maslonka.mda.system.customer.domain.customer;

public record CustomerUpdateRequest(
        String customerId,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String street,
        String city,
        String state,
        String zipCode,
        String country
) {
}