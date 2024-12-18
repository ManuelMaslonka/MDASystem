package com.maslonka.mda.system.customer.domainapi;

import com.maslonka.mda.system.customer.domainapi.dto.AccountCustomerDomainDto;

import java.util.List;

public interface AccountApi {
    AccountCustomerDomainDto read(Long accountId);
    boolean exists(Long accountId);
    List<AccountCustomerDomainDto> readAll();
}
