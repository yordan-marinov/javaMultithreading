public class StoppableRunnable implements Runnable{

    private boolean stopRequest = false;

    public synchronized boolean isStopRequested() {
        return this.stopRequest;
    }

    public synchronized void requestStop() {
        this.stopRequest = true;
    }

    private void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void run() {
        System.out.println("StoppableRunnable is running...");
        while (!isStopRequested()) {
            sleep(1000);
            System.out.println(".......");
        }
        System.out.println("StoppableRunnable is stopped!!!!!");
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread my_thread = new Thread(stoppableRunnable, "My Thread");
        my_thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(">>>Before Requesting the stopping ");
        stoppableRunnable.requestStop();
        System.out.println(">>>> After Requesting the stopping ");
    }
}
