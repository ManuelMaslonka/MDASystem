package com.maslonka.mda.system.customer.domain.mapper;

import com.maslonka.mda.system.customer.domainapi.dto.CustomerRequestDomainDto;
import com.maslonka.mda.system.customer.rest.dto.CustomerRequestDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerRequestDomainDtoMapper {
    CustomerRequestDomainDto toEntity(CustomerRequestDto customerRequestDto);

    CustomerRequestDto toDto(CustomerRequestDomainDto customerRequestDomainDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CustomerRequestDomainDto partialUpdate(
            CustomerRequestDto customerRequestDto, @MappingTarget CustomerRequestDomainDto customerRequestDomainDto);
}
