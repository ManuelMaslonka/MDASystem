package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.rest.dto.BalanceDto;
import org.mapstruct.*;
import sk.maslonka.mda.system.account.domain.account.Balance;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BalanceMapper {
    Balance toEntity(BalanceDto balanceDto);

    BalanceDto toDto(Balance balance);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Balance partialUpdate(BalanceDto balanceDto,
                          @MappingTarget Balance balance);
}
