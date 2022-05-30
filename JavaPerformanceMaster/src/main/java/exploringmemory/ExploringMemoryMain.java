package exploringmemory;

public class ExploringMemoryMain {

    public static void calculate(int calcValue) {
        calcValue *= 100;
    }

    public static void main(String[] args) {
        final int localVal = 5;
        calculate(localVal);
        System.out.println(localVal);
    }

}
