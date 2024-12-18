package com.maslonka.mda.system.customer.jpa.convectors;

import com.maslonka.mda.system.customer.domain.customer.PhoneNumber;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PhoneNumberConverter implements AttributeConverter<PhoneNumber, String> {

    @Override
    public String convertToDatabaseColumn(PhoneNumber phoneNumber) {
        return phoneNumber == null ? null : phoneNumber.value();
    }

    @Override
    public PhoneNumber convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new PhoneNumber(dbData);
    }
}
