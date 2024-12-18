package com.maslonka.mda.system.customer.domain.mapper;

import com.maslonka.mda.system.customer.domainapi.dto.CustomerDomainDto;
import com.maslonka.mda.system.customer.rest.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)public interface CustomerDomainDtoMapper {

    // Hlavné mapovacie metódy
    CustomerDomainDto toEntity(CustomerDto customerDto);
    CustomerDto toDto(CustomerDomainDto customerDomainDto);

    // OffsetDateTime ↔ String
    default String map(OffsetDateTime value) {
        return value != null ? value.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME) : null;
    }

    default OffsetDateTime map(String value) {
        return value != null ? OffsetDateTime.parse(value, DateTimeFormatter.ISO_OFFSET_DATE_TIME) : null;
    }
}
