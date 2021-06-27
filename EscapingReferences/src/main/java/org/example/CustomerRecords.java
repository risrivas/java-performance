package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    // Strategy 2 - return duplicating copy
    public Map<String, Customer> getCustomers() {
        return new HashMap<>(this.records);
    }

    // Strategy 1 - use iterator
    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }

}
