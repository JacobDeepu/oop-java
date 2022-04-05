public class GCExample {
    public void finalize() {
        System.out.println("Object garbage collected");
    }

    public static void main(String args[]) {
        GCExample gcExample = new GCExample();
        gcExample = null;
        System.gc();
    }
}
