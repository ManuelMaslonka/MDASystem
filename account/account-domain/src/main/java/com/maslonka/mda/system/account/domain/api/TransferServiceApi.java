package com.maslonka.mda.system.account.domain.api;

import com.maslonka.mda.system.account.domain.DomainAccountFacade;
import com.maslonka.mda.system.account.domain.mapper.TransactionRequestDomainMapper;
import com.maslonka.mda.system.account.domain.transaction.TransactionRequest;
import com.maslonka.mda.system.account.domainapi.transaction.TransactionApi;
import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;

public class TransferServiceApi implements TransactionApi {
    private final DomainAccountFacade domainAccountFacade;

    public TransferServiceApi(DomainAccountFacade domainAccountFacade) {
        this.domainAccountFacade = domainAccountFacade;
    }


    @Override
    public void Transaction(TransactionRequestDomainDto transactionRequestDomainDto) {
        TransactionRequest transactionRequest = TransactionRequestDomainMapper.toEntity(transactionRequestDomainDto);
        domainAccountFacade.processTransaction(transactionRequest);
    }
}
