package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountDtoMapper {
    AccountDomainDto toEntity(com.maslonka.mda.system.account.rest.dto.AccountDto accountDto);

    com.maslonka.mda.system.account.rest.dto.AccountDto toDto(AccountDomainDto accountDomainDto);

}
