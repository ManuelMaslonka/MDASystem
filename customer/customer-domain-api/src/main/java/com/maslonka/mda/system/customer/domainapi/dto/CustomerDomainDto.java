package com.maslonka.mda.system.customer.domainapi.dto;

import java.util.Set;

public record CustomerDomainDto(
        String id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String street,
        String city,
        String state,
        String zipCode,
        String country,
        String createdAt,
        String updatedAt,
        Set<Long> accountIds
) {
}
