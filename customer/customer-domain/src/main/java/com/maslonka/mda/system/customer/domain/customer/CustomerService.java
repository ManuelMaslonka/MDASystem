package com.maslonka.mda.system.customer.domain.customer;

public interface CustomerService {
    Customer read(Long customerId);
    Customer update(CustomerUpdateRequest request);
    void create(CustomerRequest request);
    void delete(Long customerId);
    void addAccount(Long customerId, Long accountId);
    void removeAccount(Long customerId, Long accountId);
}
