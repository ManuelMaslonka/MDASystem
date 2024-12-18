package com.maslonka.mda.system.customer.domain.customer;

import java.time.LocalDateTime;
import java.util.Set;

public final class CustomerBuilder {
    private FullName fullName;
    private Email email;
    private Address address;
    private PhoneNumber phoneNumber;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Set<Long> accountIds;

    private CustomerBuilder() {
    }

    public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }

    public CustomerBuilder fullName(FullName fullName) {
        this.fullName = fullName;
        return this;
    }

    public CustomerBuilder email(Email email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder phoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CustomerBuilder created(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public CustomerBuilder updated(LocalDateTime updated) {
        this.updated = updated;
        return this;
    }

    public CustomerBuilder accountIds(Set<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public Customer build() {
        return new Customer(fullName, email, address, phoneNumber, created, updated, accountIds);
    }
}
