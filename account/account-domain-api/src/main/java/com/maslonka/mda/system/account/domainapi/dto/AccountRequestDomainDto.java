package com.maslonka.mda.system.account.domainapi.dto;

public record AccountRequestDomainDto(
        TypeOfAccountDomainDto typeOfAccount,
        BalanceDomainDto balance
) {
}
