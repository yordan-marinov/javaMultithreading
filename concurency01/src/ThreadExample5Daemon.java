public class ThreadExample5Daemon {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                String name = Thread.currentThread().getName();
                System.out.println("Running ...... name: " + name);
            }
        };

        Thread myThread = new Thread(runnable, "My Thread");
//        myThread.setDaemon(true);
        myThread.start();

        sleep(3100);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
