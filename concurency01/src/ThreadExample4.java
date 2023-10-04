public class ThreadExample4 {

    public static void main(String[] args) {

        Runnable runnable = () -> {

            String name = Thread.currentThread().getName();
            System.out.println("Hello from the thread with the name: " + name);
        };

        Thread thread = new Thread(
                () -> {
                    Thread.currentThread().setName("My Tread with new name");
                    String name = Thread.currentThread().getName();
                    System.out.println("Hello from the my lambda runnable in this new thread with the new name: " + name);
                }
        );

        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
