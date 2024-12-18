package com.maslonka.mda.system.customer.jpa.convectors;

import com.maslonka.mda.system.customer.domain.customer.FullName;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class FullNameConverter implements AttributeConverter<FullName, String> {

    @Override
    public String convertToDatabaseColumn(FullName fullName) {
        return fullName == null ? null : fullName.firstName() + " " + fullName.lastName();
    }

    @Override
    public FullName convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isBlank()) {
            return null;
        }
        String[] parts = dbData.split(" ");
        return new FullName(parts[0], parts[1]);
    }
}
