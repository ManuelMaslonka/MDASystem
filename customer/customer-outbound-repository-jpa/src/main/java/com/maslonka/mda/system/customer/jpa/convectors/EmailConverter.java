package com.maslonka.mda.system.customer.jpa.convectors;

import com.maslonka.mda.system.customer.domain.customer.Email;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmailConverter implements AttributeConverter<Email, String> {

    @Override
    public String convertToDatabaseColumn(Email email) {
        return email == null ? null : email.value();
    }

    @Override
    public Email convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Email(dbData);
    }
}
