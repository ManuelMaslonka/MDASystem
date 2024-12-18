package com.maslonka.mda.system.customer.domain;

import com.maslonka.mda.system.customer.domain.accountapi.CustomerAccountApi;
import com.maslonka.mda.system.customer.domain.customer.Customer;
import com.maslonka.mda.system.customer.domain.customer.CustomerService;
import com.maslonka.mda.system.customer.domain.mapper.CustomerDomainMapper;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerRequestDomainDto;
import com.maslonka.mda.system.customer.domainapi.dto.CustomerUpdateRequestDomainDto;

public class DomainCustomerFacade {

    private final CustomerService customerService;
    private final CustomerAccountApi accountApi;

    public DomainCustomerFacade(CustomerService customerService, CustomerAccountApi accountApi) {
        this.customerService = customerService;
        this.accountApi = accountApi;
    }

    public CustomerDomainDto read(Long customerId) {
        Customer customer = customerService.read(customerId);
        return CustomerDomainMapper.toEntity(customer);
    }

    public void create(CustomerRequestDomainDto customer) {
        customerService.create(CustomerDomainMapper.toEntity(customer));
    }

    public void update(CustomerUpdateRequestDomainDto customer) {
        customerService.update(CustomerDomainMapper.toEntity(customer));
    }

    public void delete(Long customerId) {
        customerService.delete(customerId);
    }

    public void addAccount(Long customerId, Long accountId) {
        boolean exists = accountApi.exists(accountId);
        if (exists) {
            customerService.addAccount(customerId, accountId);
        } else {
            throw new IllegalArgumentException("Account does not exist");
        }
    }

    public void removeAccount(Long customerId, Long accountId) {
        customerService.removeAccount(customerId, accountId);
    }
}
