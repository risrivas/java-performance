package performanceexample1;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by rishi on 13/06/2021
 */
public class PerformanceExample1Main {

    public static void main(String[] args) throws InterruptedException {
        /*TimeUnit.SECONDS.sleep(20L);
        System.out.println("starting the work now");*/

        Instant start = Instant.now();

        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);

        Instant finish = Instant.now();
        System.out.printf("Time taken~>%d milliseconds%n", Duration.between(start, finish).toMillis());

    }
}
