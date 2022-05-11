package softleaks;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class GenerateCustomerTask implements Runnable {
    private CustomerManager cm;

    public GenerateCustomerTask(CustomerManager cm) {
        this.cm = cm;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //This is just to slow things down so we can see what's going on!
                TimeUnit.MILLISECONDS.sleep(2L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = UUID.randomUUID().toString();
            Customer c = new Customer(name);
            cm.addCustomer(c);
        }
    }
}



