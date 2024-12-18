package com.maslonka.mda.system.customer.jpa.convectors;

import com.maslonka.mda.system.customer.domain.customer.Address;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AddressConverter implements AttributeConverter<Address, String> {

    @Override
    public String convertToDatabaseColumn(Address address) {
        if (address == null) {
            return null;
        }
        return String.join(",", address.getStreet(), address.getCity(), address.getState(), address.getZipCode(), address.getCountry());
    }

    @Override
    public Address convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isBlank()) {
            return null;
        }
        String[] parts = dbData.split(",");
        return new Address(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }
}
