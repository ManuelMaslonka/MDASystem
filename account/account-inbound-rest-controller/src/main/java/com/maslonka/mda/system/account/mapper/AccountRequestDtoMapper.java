package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.domainapi.dto.AccountRequestDomainDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountRequestDtoMapper {
    AccountRequestDomainDto toEntity(com.maslonka.mda.system.account.rest.dto.AccountRequestDto accountRequestDto);

    com.maslonka.mda.system.account.rest.dto.AccountRequestDto toDto(AccountRequestDomainDto accountRequestDomainDto);

}
