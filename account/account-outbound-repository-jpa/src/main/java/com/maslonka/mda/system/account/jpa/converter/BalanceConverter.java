package com.maslonka.mda.system.account.jpa.converter;

import jakarta.persistence.Converter;
import jakarta.persistence.AttributeConverter;
import sk.maslonka.mda.system.account.domain.account.Balance;

import java.math.BigDecimal;

@Converter(autoApply = true)
public class BalanceConverter implements AttributeConverter<Balance, BigDecimal> {

    @Override
    public BigDecimal convertToDatabaseColumn(Balance balance) {
        if (balance == null) {
            return null;
        }
        return BigDecimal.valueOf(balance.getAmount().doubleValue());
    }

    @Override
    public Balance convertToEntityAttribute(BigDecimal amount) {
        if (amount == null) {
            return null;
        }
        return new Balance(amount);
    }
}
