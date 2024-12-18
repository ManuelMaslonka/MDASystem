package com.maslonka.mda.system.customer.domain.accountapi.dto;

import com.maslonka.mda.system.account.domainapi.account.dto.TypeOfAccountDomainDto;

public record CustomerAccountDto(
        Long id, TypeOfAccountDomainDto typeOfAccount, BalanceAccountDto balance
) {
}
