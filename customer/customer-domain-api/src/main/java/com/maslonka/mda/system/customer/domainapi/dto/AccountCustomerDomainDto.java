package com.maslonka.mda.system.customer.domainapi.dto;

public record AccountCustomerDomainDto(
        Long id,
        String typeOfAccount,
        String balance
) {
}
