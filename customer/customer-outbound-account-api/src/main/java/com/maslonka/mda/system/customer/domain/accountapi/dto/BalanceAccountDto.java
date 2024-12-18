package com.maslonka.mda.system.customer.domain.accountapi.dto;

import java.math.BigDecimal;

public record BalanceAccountDto(
        BigDecimal amount
) {
}
