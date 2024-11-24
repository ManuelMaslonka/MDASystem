package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domain.transaction.TransactionType;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionTypeDomainDto;

public interface TransactionTypeDomainMapper {

    static TransactionType toEntity(TransactionTypeDomainDto transactionType) {
        return TransactionType.valueOf(transactionType.name());
    }

    static TransactionTypeDomainDto toDto(TransactionType transactionType) {
        return TransactionTypeDomainDto.valueOf(transactionType.name());
    }

}
