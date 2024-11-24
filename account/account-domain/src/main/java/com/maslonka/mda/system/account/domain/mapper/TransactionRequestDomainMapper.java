package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domain.transaction.TransactionRequest;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;

public interface TransactionRequestDomainMapper {

    static TransactionRequest toEntity(TransactionRequestDomainDto transactionRequestDomainDto) {
        return new TransactionRequest(
                TransactionTypeDomainMapper.toEntity(transactionRequestDomainDto.transactionType()),
                transactionRequestDomainDto.accountSource(),
                transactionRequestDomainDto.accountDestination(),
                BalanceDomainMapper.toEntity(transactionRequestDomainDto.amount())
        );
    }

    static TransactionRequestDomainDto toDto(TransactionRequest transactionRequest) {
        return new TransactionRequestDomainDto(
                TransactionTypeDomainMapper.toDto(transactionRequest.transactionType()),
                transactionRequest.accountSource(),
                transactionRequest.accountDestination(),
                BalanceDomainMapper.toDto(transactionRequest.amount())
        );
    }

}
