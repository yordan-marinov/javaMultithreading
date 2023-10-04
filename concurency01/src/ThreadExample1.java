public class ThreadExample1{

    public static class MyThread extends Thread {

        public void run() {
            System.out.println("My thread is running....");
            System.out.println("My thread is finishing!");
        }
    }


    public static void main(String[] args) {
        System.out.println("Print line from main before thread.");

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Print line from the main method after the thread.");
    }
}
