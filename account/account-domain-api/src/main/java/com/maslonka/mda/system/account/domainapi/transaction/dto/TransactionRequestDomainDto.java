package com.maslonka.mda.system.account.domainapi.transaction.dto;

import com.maslonka.mda.system.account.domainapi.account.dto.BalanceDomainDto;

public record TransactionRequestDomainDto(
        TransactionTypeDomainDto transactionType,
        Long accountSource,
        Long accountDestination,
        BalanceDomainDto amount
) {
}
