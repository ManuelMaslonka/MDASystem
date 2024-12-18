package com.maslonka.mda.system.customer.domain.customer;

import com.maslonka.mda.system.customer.domain.utills.ValueObject;

public class Address implements ValueObject<Address> {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address() {
    }

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean sameValueAs(Address other) {
        return other != null && street.equals(other.street) && city.equals(other.city) && state.equals(other.state)
                && zipCode.equals(other.zipCode) && country.equals(other.country);
    }
}
