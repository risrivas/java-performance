package com.rishi;

/**
 * Created by rishi on 13/06/2021
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*TimeUnit.SECONDS.sleep(20L);
        System.out.println("starting the work now");*/

        long start = System.currentTimeMillis();

        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);

        long end = System.currentTimeMillis();
        System.out.printf("%nElapsed time was %d ms%n", (end - start));
    }
}
