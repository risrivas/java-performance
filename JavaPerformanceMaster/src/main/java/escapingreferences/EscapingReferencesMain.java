package escapingreferences;

import escapingreferences.customerImpl.Customer;
import escapingreferences.customers.CustomerRecords;
import escapingreferences.customers.ReadonlyCustomer;

public class EscapingReferencesMain {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        for (ReadonlyCustomer next : records.getCustomers().values()) {
            System.out.println(next);
        }

        // records.getCustomers().clear();
        // records.find("John").setName("Rishi");
    }

}
