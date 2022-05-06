package softleaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class CustomerManager {

    private final List<Customer> customers = new ArrayList<>();
    private int nextAvalailbleId = 0;

    public void addCustomer(Customer customer) {
        synchronized (this) {
            customer.setId(nextAvalailbleId);
            synchronized (customers) {
                customers.add(customer);
            }
            nextAvalailbleId++;
        }
    }

    public Optional<Customer> getNextCustomer() {
        synchronized (customers) {
            if (!customers.isEmpty()) {
                return Optional.of(customers.remove(0));
            }
        }
        return Optional.empty();
    }

    public void howManyCustomers() {
        final int size = customers.size();
        System.out.println("" + new Date() + " Customers in queue : " + size + " of " + nextAvalailbleId);
    }

}
