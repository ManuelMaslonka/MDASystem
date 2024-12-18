package com.maslonka.mda.system.customer.domainapi.dto;

public record CustomerUpdateRequestDomainDto(
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
