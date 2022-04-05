public class OddEven extends Thread {
    int num;

    public OddEven(int x) {
        this.num = x;
    }

    public void run() {
        for (int i = num; i <= 100; i = i + 2) {
            try {
                Thread.sleep(0);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        OddEven odd = new OddEven(1);
        OddEven even = new OddEven(2);
        odd.start();
        try {
            odd.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
        even.start();
    }
}
