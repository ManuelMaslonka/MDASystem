package com.maslonka.mda.system.customer.domain.customer;

import com.maslonka.mda.system.customer.domain.utills.AggregateRoot;

import java.time.LocalDateTime;
import java.util.Set;

public class Customer implements AggregateRoot<Long> {

    private Long id;
    private FullName fullName;
    private Email email;
    private Address address;
    private PhoneNumber phoneNumber;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Set<Long> accountIds;

    public Customer() {
    }

    Customer(FullName fullName, Email email, Address address, PhoneNumber phoneNumber, LocalDateTime created, LocalDateTime updated,
             Set<Long> accountIds) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.created = created;
        this.updated = updated;
        this.accountIds = accountIds;
    }

    @Deprecated(forRemoval = false)
    public Customer(Long id, FullName fullName, Email email, Address address, PhoneNumber phoneNumber, LocalDateTime created, LocalDateTime updated,
                    Set<Long> accountIds) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.created = created;
        this.updated = updated;
        this.accountIds = accountIds;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public Set<Long> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(Set<Long> accountIds) {
        this.accountIds = accountIds;
    }

    public void addAccountId(Long accountId) {
        accountIds.add(accountId);
    }

    public void removeAccountId(Long accountId) {
        accountIds.remove(accountId);
    }

    @Override
    public Long getId() {
        return id;
    }
}
