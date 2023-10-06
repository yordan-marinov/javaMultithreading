public class ThreadExample6Join {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 5; i++) {
                sleep(100);
                System.out.println("Running.... " + i);
            }
        };
        Thread myThread = new Thread(runnable, "MyThread");
//        thread.setDaemon(true);
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread is exiting!!!!");
    }


    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
