class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }
    public void run() {
        System.out.println("Thread " + threadName + " is starting.");
        try {
            Thread.sleep(500); // Suspend thread for 500 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " is terminating.");
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Main thread is starting.");
        MyRunnable[] runnables = new MyRunnable[5];
        Thread[] threads = new Thread[5];

        // Create threads and start them
        for (int i = 0; i < 5; i++) {
            runnables[i] = new MyRunnable("Thread-" + (i + 1));
            threads[i] = new Thread(runnables[i]);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < 5; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread is terminating.");
    }
}
