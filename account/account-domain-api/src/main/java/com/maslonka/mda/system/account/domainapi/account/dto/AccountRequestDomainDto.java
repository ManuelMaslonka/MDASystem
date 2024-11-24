package com.maslonka.mda.system.account.domainapi.account.dto;

public record AccountRequestDomainDto(
        TypeOfAccountDomainDto typeOfAccount,
        BalanceDomainDto balance
) {
}
