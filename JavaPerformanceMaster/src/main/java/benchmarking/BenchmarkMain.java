package benchmarking;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class BenchmarkMain {

    public static void main(String[] args) throws InterruptedException {
        NumberChecker nc = new NumberChecker();

        // warmup period
        for (int i = 1; i < 10000; i++) {
            nc.isPrime2(i);
        }

        TimeUnit.SECONDS.sleep(2L);

        System.out.println("warmup finished, now measuring");

        Instant start = Instant.now();
        for (int i = 1; i < 50000; i++) {
            nc.isPrime2(i);
        }
        Instant finish = Instant.now();
        System.out.printf("Time taken~>%d milliseconds%n", Duration.between(start, finish).toMillis());
    }
}
