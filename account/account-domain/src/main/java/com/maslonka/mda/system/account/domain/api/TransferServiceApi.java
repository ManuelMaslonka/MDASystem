package com.maslonka.mda.system.account.domain.api;

import com.maslonka.mda.system.account.domain.DomainFacade;
import com.maslonka.mda.system.account.domain.mapper.TransactionRequestDomainMapper;
import com.maslonka.mda.system.account.domain.transaction.TransactionRequest;
import com.maslonka.mda.system.account.domainapi.transaction.TransactionApi;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;

public class TransferServiceApi implements TransactionApi {
    private final DomainFacade domainFacade;

    public TransferServiceApi(DomainFacade domainFacade) {
        this.domainFacade = domainFacade;
    }


    @Override
    public void Transaction(TransactionRequestDomainDto transactionRequestDomainDto) {
        TransactionRequest transactionRequest = TransactionRequestDomainMapper.toEntity(transactionRequestDomainDto);
        domainFacade.processTransaction(transactionRequest);
    }
}
