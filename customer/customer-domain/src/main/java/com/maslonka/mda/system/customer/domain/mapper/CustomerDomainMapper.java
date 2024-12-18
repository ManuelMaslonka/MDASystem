package com.maslonka.mda.system.customer.domain.mapper;

import com.maslonka.mda.system.customer.domain.customer.Customer;
import com.maslonka.mda.system.customer.domain.customer.CustomerRequest;
import com.maslonka.mda.system.customer.domain.customer.CustomerUpdateRequest;
import com.maslonka.mda.system.customer.domainapi.dto.*;

public interface CustomerDomainMapper {

    static CustomerDomainDto toEntity(Customer customer) {
        return CustomerDomainDtoBuilder.aCustomerDomainDto()
                .id(customer.getId().toString())
                .firstName(customer.getFullName().firstName())
                .lastName(customer.getFullName().lastName())
                .email(customer.getEmail().value())
                .phoneNumber(customer.getPhoneNumber().value())
                .street(customer.getAddress().getStreet())
                .city(customer.getAddress().getCity())
                .state(customer.getAddress().getState())
                .zipCode(customer.getAddress().getZipCode())
                .country(customer.getAddress().getCountry())
                .accountIds(customer.getAccountIds())
                .build();
    }

    static CustomerRequestDomainDto toEntity(CustomerRequest customer) {
        return CustomerRequestDomainDtoBuilder.aCustomerRequestDomainDto()
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .phoneNumber(customer.phoneNumber())
                .street(customer.street())
                .city(customer.city())
                .state(customer.state())
                .zipCode(customer.zipCode())
                .country(customer.country())
                .build();
    }

    static CustomerRequest toEntity(CustomerDomainDto customer) {
        return new CustomerRequest(customer.firstName(), customer.lastName(), customer.email(), customer.phoneNumber(), customer.street(), customer.city(), customer.state(), customer.zipCode(), customer.country());
    }

    static CustomerRequest toEntity(CustomerRequestDomainDto customer) {
        return new CustomerRequest(customer.firstName(), customer.lastName(), customer.email(), customer.phoneNumber(), customer.street(), customer.city(), customer.state(), customer.zipCode(), customer.country());
    }

    static CustomerUpdateRequest toEntity(CustomerUpdateRequestDomainDto customer) {
        return new CustomerUpdateRequest(customer.customerId(), customer.firstName(), customer.lastName(), customer.email(), customer.phoneNumber(), customer.street(), customer.city(), customer.state(), customer.zipCode(), customer.country());
    }
}
