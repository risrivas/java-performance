package softleaks;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class ProcessCustomerTask implements Runnable {
    private CustomerManager cm;

    public ProcessCustomerTask(CustomerManager cm) {
        this.cm = cm;
    }

    @Override
    public void run() {
        while (true) {
            Optional<Customer> customer = cm.getNextCustomer();
            if (customer.isEmpty()) {
                //no customers in queue so pause for half a second
                try {
                    TimeUnit.MILLISECONDS.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //Processing takes place here
            }
        }
    }

}
