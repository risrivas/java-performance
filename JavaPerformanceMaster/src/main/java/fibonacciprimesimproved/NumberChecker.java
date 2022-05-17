package fibonacciprimesimproved;

public class NumberChecker {

    public Boolean isPrime(Integer testNumber) {
        int maxToCheck = (int) Math.sqrt(testNumber);
        for (Integer i = 2; i < maxToCheck; i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }


}
