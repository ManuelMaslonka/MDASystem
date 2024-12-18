package com.maslonka.mda.system.customer.domain.customer;

import java.time.LocalDateTime;
import java.util.Set;

public class CustomerFactory {

    private final CustomerRepository customerRepository;

    public CustomerFactory(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static Customer create(CustomerRequest request) {
        return CustomerBuilder.aCustomer()
                .fullName(new FullName(request.firstName(), request.lastName()))
                .email(new Email(request.email()))
                .address(new Address(request.street(), request.city(), request.state(), request.zipCode(), request.country()))
                .phoneNumber(new PhoneNumber(request.phoneNumber()))
                .created(LocalDateTime.now())
                .updated(LocalDateTime.now())
                .accountIds(Set.of())
                .build();
    }

    public Customer update(CustomerUpdateRequest request) {
        long id = Long.parseLong(request.customerId());
        Customer oldCustomer = customerRepository.read(id).orElseThrow(() -> new RuntimeException("Customer not found"));

        Customer updatedCustomer = CustomerBuilder.aCustomer()
                .fullName(new FullName(request.firstName(), request.lastName()))
                .email(new Email(request.email()))
                .address(new Address(request.street(), request.city(), request.state(), request.zipCode(), request.country()))
                .phoneNumber(new PhoneNumber(request.phoneNumber()))
                .created(oldCustomer.getCreated())
                .updated(LocalDateTime.now())
                .accountIds(oldCustomer.getAccountIds())
                .build();
        customerRepository.update(updatedCustomer);
        return updatedCustomer;
    }
}
