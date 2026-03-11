class MyThreads extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycle {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println("State after creation: " + t1.getState());

        t1.start();

        System.out.println("State after start: " + t1.getState());

        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        System.out.println("State after execution: " + t1.getState());
    }
}
