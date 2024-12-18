package com.maslonka.mda.system.customer.domain.api;

import com.maslonka.mda.system.customer.domain.DomainCustomerFacade;
import com.maslonka.mda.system.customer.domainapi.CustomerApi;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerRequestDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerUpdateRequestDomainDto;

public class CustomerServiceApi implements CustomerApi {

    private final DomainCustomerFacade domainCustomerFacade;

    public CustomerServiceApi(DomainCustomerFacade domainCustomerFacade) {
        this.domainCustomerFacade = domainCustomerFacade;
    }


    @Override
    public CustomerDomainDto read(Long customerId) {
        return domainCustomerFacade.read(customerId);
    }

    @Override
    public void create(CustomerRequestDomainDto customer) {
        domainCustomerFacade.create(customer);
    }

    @Override
    public void update(CustomerUpdateRequestDomainDto customer) {
        domainCustomerFacade.update(customer);
    }

    @Override
    public void delete(Long customerId) {
        domainCustomerFacade.delete(customerId);
    }

    @Override
    public void addAccount(Long customerId, Long accountId) {
        domainCustomerFacade.addAccount(customerId, accountId);
    }

    @Override
    public void removeAccount(Long customerId, Long accountId) {
        domainCustomerFacade.removeAccount(customerId, accountId);
    }
}
