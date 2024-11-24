package com.maslonka.mda.system.account.domainapi.transaction;

import com.maslonka.mda.system.account.domainapi.transaction.dto.TransactionRequestDomainDto;

public interface TransactionApi {

    void Transaction(TransactionRequestDomainDto transactionRequestDomainDto);

}
