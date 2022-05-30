package memorytest1;

public class MemoryExercise1Comments {

    public static void main(String args[]) {
        MemoryExercise1Comments main = new MemoryExercise1Comments();
        main.start();
        // answer should be AZB
    }

    public void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.print(container.getInitial()); // B
    }

    public void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder = initial2;
        System.out.print(initialHolder.getInitial()); // A
        System.out.print(newInitial); // Z
    }

}
