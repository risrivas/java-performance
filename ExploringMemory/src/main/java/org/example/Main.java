package org.example;

/**
 * Created by rishi on 23/06/2021
 */
public class Main {

    public static void calculate(int calcValue) {
        calcValue *= 100;
    }

    public static void main(String[] args) {
        int localVal = 5;
        calculate(localVal);
        System.out.println(localVal);
    }

}
