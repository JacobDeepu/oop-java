class ThreadEven extends Thread {
    public void run() {
        System.out.println("even numbers are :\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

class ThreadOdd extends Thread {
    public void run() {
        System.out.println("odd numbers are :\n");
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 1) {
                System.out.println(i + " ");
            }
        }
    }
}

class ThreadExample {
    public static void main(String[] args) {

        ThreadEven t1 = new ThreadEven();
        ThreadOdd t2 = new ThreadOdd();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}