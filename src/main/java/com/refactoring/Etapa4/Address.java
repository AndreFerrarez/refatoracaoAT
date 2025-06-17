package com.refactoring.Etapa4;

import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String country;

    public Address(String street, String city, String zipCode, String country) {
        this.street  = Objects.requireNonNull(street, "street não pode ser nulo");
        this.city    = Objects.requireNonNull(city,   "city não pode ser nulo");
        this.zipCode = Objects.requireNonNull(zipCode,"zipCode não pode ser nulo");
        this.country = Objects.requireNonNull(country,"country não pode ser nulo");
    }

    public String getStreet()  { return street;  }
    public String getCity()    { return city;    }
    public String getZipCode() { return zipCode; }
    public String getCountry() { return country; }

    @Override
    public String toString() {
        return street + ", " + city + " – " + zipCode + " (" + country + ")";
    }
}
