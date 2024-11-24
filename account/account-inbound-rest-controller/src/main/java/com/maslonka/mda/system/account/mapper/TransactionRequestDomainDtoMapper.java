package com.maslonka.mda.system.account.mapper;

import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;
import com.maslonka.mda.system.account.rest.dto.TransactionRequestDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransactionRequestDomainDtoMapper {
    TransactionRequestDomainDto toEntity(TransactionRequestDto transactionRequestDto);

    TransactionRequestDto toDto(TransactionRequestDomainDto transactionRequestDomainDto);
}
