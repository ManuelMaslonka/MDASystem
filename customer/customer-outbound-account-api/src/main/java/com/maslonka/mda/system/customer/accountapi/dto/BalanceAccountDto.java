package com.maslonka.mda.system.customer.accountapi.dto;

import java.math.BigDecimal;

public record BalanceAccountDto(
        BigDecimal amount
) {
}
