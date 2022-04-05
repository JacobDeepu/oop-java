public class ThreadPriority extends Thread {
    public void run() {
        System.out.println("Thread started");
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        System.out.println("Priority of the thread one is : " + t1.getPriority());
        System.out.println("Priority of the thread two is : " + t2.getPriority());
        System.out.println("Priority of the thread three is : " + t3.getPriority());

        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("Priority of the thread one after changing: " + t1.getPriority());
        System.out.println("Priority of the thread two after changing: " + t2.getPriority());
        System.out.println("Priority of the thread three after changing: " + t3.getPriority());

        System.out.println("Currently Executing The Thread: " + Thread.currentThread().getName());

        System.out.println("Priority of the main thread is: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread is: " + Thread.currentThread().getPriority());

    }
}