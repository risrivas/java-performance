package org.example;

public class Customer implements ReadonlyCustomer {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    // Copy Constructor
    public Customer(ReadonlyCustomer c) {
        this.name = c.getName();
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
