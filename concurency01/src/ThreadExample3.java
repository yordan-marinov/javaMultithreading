public class ThreadExample3 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello from the anonymous runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
