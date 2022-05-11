package softleaks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Customer> customers = new ArrayList<>();
        while (true) {
            final Customer c = new Customer("Matt");
            customers.add(c);
            if (customers.size() > 10000) {
                customers.subList(0, 5000).clear();
            }
        }
    }
}
