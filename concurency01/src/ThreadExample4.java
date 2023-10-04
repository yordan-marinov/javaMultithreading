public class ThreadExample4 {

    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> System.out.println("Hello from the my lambda runnable in this new thread.")
        );

        thread.start();
    }
}
