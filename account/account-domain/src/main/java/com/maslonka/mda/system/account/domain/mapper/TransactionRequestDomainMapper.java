package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domain.transaction.request.DepositRequest;
import com.maslonka.mda.system.account.domain.transaction.request.TransactionRequest;
import com.maslonka.mda.system.account.domain.transaction.request.TransferRequest;
import com.maslonka.mda.system.account.domain.transaction.request.WithdrawRequest;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;

public interface TransactionRequestDomainMapper {

    static TransactionRequest toEntity(TransactionRequestDomainDto dto) {
        return switch (dto.transactionType()) {
            case DEPOSIT -> new DepositRequest(
                    dto.accountSource(),
                    BalanceDomainMapper.toEntity(dto.amount())
            );
            case WITHDRAW -> new WithdrawRequest(
                    dto.accountSource(),
                    BalanceDomainMapper.toEntity(dto.amount())
            );
            case TRANSFER -> new TransferRequest(
                    dto.accountSource(),
                    dto.accountDestination(),
                    BalanceDomainMapper.toEntity(dto.amount())
            );
        };
    }

}
