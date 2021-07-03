package org.example;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        // records.getCustomers().clear();
        // records.find("John").setName("Jane");

        ReadonlyCustomer c = records.find("John");
        Customer customer = (Customer) c;
        customer.setName("Jane");

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }

        System.out.println(records.find("John"));

        /*for (Customer next : records) {
            System.out.println(next);
        }

        Iterator<Customer> it = records.iterator();
        it.next();
        it.remove();

        for (Customer next : records) {
            System.out.println(next);
        }*/
    }

}
