package com.refactoring.Etapa4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String email;
    private final List<Address> addresses = new ArrayList<>();

    public User(String name, String email) {
        this.name  = Objects.requireNonNull(name,  "name não pode ser nulo");
        this.email = Objects.requireNonNull(email, "email não pode ser nulo");
    }


    public String getName()  { return name;  }
    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "name não pode ser nulo");
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "email não pode ser nulo");
    }


    public void addAddress(Address address) {
        addresses.add(Objects.requireNonNull(address, "address não pode ser nulo"));
    }


    public boolean removeAddress(Address address) {
        return addresses.remove(address);
    }


    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }
}
