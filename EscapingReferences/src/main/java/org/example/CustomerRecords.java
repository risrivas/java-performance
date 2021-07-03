package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        records = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {
        // Strategy 2 - return duplicating copy
        // return new HashMap<>(records);

        // Strategy 3 (best) - return unmodifiable copy
        return Collections.unmodifiableMap(records);
        // Java 10+ version
        // return Map.copyOf(records);
    }

    // Strategy 1 - use iterator
    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }

    public ReadonlyCustomer find(String name) {
        // return records.get(name);
        // use copy constructor
        return new Customer(records.get(name));
    }

}
