package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.rest.dto.AccountRequestDto;
import org.mapstruct.*;
import sk.maslonka.mda.system.account.domain.account.AccountRequest;

@Mapper(
        uses = {BalanceMapper.class},
        unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountRequestMapper {

    AccountRequest toEntity(AccountRequestDto accountRequestDto);

    AccountRequestDto toDto(AccountRequest accountRequest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AccountRequest partialUpdate(AccountRequestDto accountRequestDto,
                                 @MappingTarget AccountRequest accountRequest);
}
