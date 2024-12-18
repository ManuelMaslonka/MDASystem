package com.maslonka.mda.system.customer.domainapi;

import com.maslonka.mda.system.customer.domainapi.dto.CustomerDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerRequestDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerUpdateRequestDomainDto;

/**
 * Customer API for managing customer data.
 * @author Manuel Mašlonka
 */
public interface CustomerApi {

    CustomerDomainDto read(Long customerId);

    void create(CustomerRequestDomainDto customer);

    void update(CustomerUpdateRequestDomainDto customer);

    void delete(Long customerId);

    void addAccount(Long customerId, Long accountId);

    void removeAccount(Long customerId, Long accountId);

}
