import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello from the main tread");
        Thread thread = new Thread();
        thread.start();
    }
}
