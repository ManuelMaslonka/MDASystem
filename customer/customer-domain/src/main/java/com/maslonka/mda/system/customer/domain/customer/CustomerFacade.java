package com.maslonka.mda.system.customer.domain.customer;

public class CustomerFacade implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerFactory customerFactory;

    public CustomerFacade(CustomerRepository customerRepository, CustomerFactory customerFactory) {
        this.customerRepository = customerRepository;
        this.customerFactory = customerFactory;
    }

    @Override
    public void create(CustomerRequest request) {
        Customer customer = CustomerFactory.create(request);
        customerRepository.create(customer);
    }

    @Override
    public Customer read(Long customerId) {
        return customerRepository.read(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public Customer update(CustomerUpdateRequest request) {
        Customer updateCustomer = customerFactory.update(request);
        customerRepository.update(updateCustomer);
        return updateCustomer;
    }

    @Override
    public void delete(Long customerId) {
        customerRepository.delete(customerId);
    }

    @Override
    public void addAccount(Long customerId, Long accountId) {
        Customer customer = customerRepository.read(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.addAccountId(accountId);
        customerRepository.update(customer);
    }

    @Override
    public void removeAccount(Long customerId, Long accountId) {
        customerRepository.read(customerId).orElseThrow(() -> new RuntimeException("Customer not found")).removeAccountId(accountId);
    }
}
