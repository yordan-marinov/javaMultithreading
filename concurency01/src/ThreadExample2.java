public class ThreadExample2 {
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello from my runnable..");
            System.out.println("Bye bye from my runnable!");
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
