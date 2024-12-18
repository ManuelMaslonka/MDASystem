package com.maslonka.mda.system.customer.domainapi.dto;

public final class CustomerRequestDomainDtoBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private CustomerRequestDomainDtoBuilder() {
    }

    public static CustomerRequestDomainDtoBuilder aCustomerRequestDomainDto() {
        return new CustomerRequestDomainDtoBuilder();
    }

    public CustomerRequestDomainDtoBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerRequestDomainDtoBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerRequestDomainDtoBuilder email(String email) {
        this.email = email;
        return this;
    }

    public CustomerRequestDomainDtoBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CustomerRequestDomainDtoBuilder street(String street) {
        this.street = street;
        return this;
    }

    public CustomerRequestDomainDtoBuilder city(String city) {
        this.city = city;
        return this;
    }

    public CustomerRequestDomainDtoBuilder state(String state) {
        this.state = state;
        return this;
    }

    public CustomerRequestDomainDtoBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public CustomerRequestDomainDtoBuilder country(String country) {
        this.country = country;
        return this;
    }

    public CustomerRequestDomainDto build() {
        return new CustomerRequestDomainDto(firstName, lastName, email, phoneNumber, street, city, state, zipCode, country);
    }
}
