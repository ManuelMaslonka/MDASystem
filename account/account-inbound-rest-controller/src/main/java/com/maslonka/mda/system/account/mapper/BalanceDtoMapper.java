package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.domainapi.dto.BalanceDomainDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BalanceDtoMapper {
    BalanceDomainDto toEntity(com.maslonka.mda.system.account.rest.dto.BalanceDto balanceDto);

    com.maslonka.mda.system.account.rest.dto.BalanceDto toDto(BalanceDomainDto balanceDomainDto);

}
