package com.maslonka.mda.system.customer.domainapi.dto;

import java.util.Set;

public final class CustomerDomainDtoBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String createdAt;
    private String updatedAt;
    private Set<Long> accountIds;

    private CustomerDomainDtoBuilder() {
    }

    public static CustomerDomainDtoBuilder aCustomerDomainDto() {
        return new CustomerDomainDtoBuilder();
    }

    public CustomerDomainDtoBuilder id(String id) {
        this.id = id;
        return this;
    }

    public CustomerDomainDtoBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDomainDtoBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDomainDtoBuilder email(String email) {
        this.email = email;
        return this;
    }

    public CustomerDomainDtoBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CustomerDomainDtoBuilder street(String street) {
        this.street = street;
        return this;
    }

    public CustomerDomainDtoBuilder city(String city) {
        this.city = city;
        return this;
    }

    public CustomerDomainDtoBuilder state(String state) {
        this.state = state;
        return this;
    }

    public CustomerDomainDtoBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public CustomerDomainDtoBuilder country(String country) {
        this.country = country;
        return this;
    }

    public CustomerDomainDtoBuilder createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomerDomainDtoBuilder updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public CustomerDomainDtoBuilder accountIds(Set<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public CustomerDomainDto build() {
        return new CustomerDomainDto(id, firstName, lastName, email, phoneNumber, street, city, state, zipCode, country, createdAt, updatedAt, accountIds);
    }
}
