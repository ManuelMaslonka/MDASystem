package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.rest.dto.AccountDto;
import org.mapstruct.*;
import sk.maslonka.mda.system.account.domain.account.Account;

@Mapper(
        uses = {BalanceMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface AccountMapper {
    Account toEntity(AccountDto accountDto);

    AccountDto toDto(Account account);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Account partialUpdate(
            com.maslonka.mda.system.account.rest.dto.AccountDto accountDto, @MappingTarget Account account);
}
