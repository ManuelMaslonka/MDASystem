package com.maslonka.mda.system.customer.domain.controller;

import com.maslonka.mda.system.customer.domain.mapper.CustomerDomainDtoMapper;
import com.maslonka.mda.system.customer.domain.mapper.CustomerRequestDomainDtoMapper;
import com.maslonka.mda.system.customer.domainapi.CustomerApi;
import com.maslonka.mda.system.customer.rest.api.CustomersRestApi;
import com.maslonka.mda.system.customer.rest.dto.AddAccountRequestDto;
import com.maslonka.mda.system.customer.rest.dto.CustomerDto;
import com.maslonka.mda.system.customer.rest.dto.CustomerRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class CustomerRestController implements CustomersRestApi {

    private static final URI BASE_URI = URI.create("/api/v1/customers");

    private final CustomerApi customerApi;

    private final CustomerDomainDtoMapper customerDomainDtoMapper;
    private final CustomerRequestDomainDtoMapper customerRequestDomainDtoMapper;

    public CustomerRestController(
            CustomerApi customerApi, CustomerDomainDtoMapper customerDomainDtoMapper,
            CustomerRequestDomainDtoMapper customerRequestDomainDtoMapper
    ) {
        this.customerApi = customerApi;
        this.customerDomainDtoMapper = customerDomainDtoMapper;
        this.customerRequestDomainDtoMapper = customerRequestDomainDtoMapper;
    }

    @Override
    public ResponseEntity<Void> addAccount(AddAccountRequestDto addAccountRequestDto) {
        customerApi.addAccount(addAccountRequestDto.getCustomerId(), addAccountRequestDto.getAccountId());
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> createCustomer(CustomerRequestDto customerRequestDto) {
        customerApi.create(customerRequestDomainDtoMapper.toEntity(customerRequestDto));
        return ResponseEntity.created(BASE_URI).build();
    }

    @Override
    public ResponseEntity<CustomerDto> getCustomer(Long id) {
        return ResponseEntity.ok(customerDomainDtoMapper.toDto(customerApi.read(id)));
    }
}
