public class SecSmall {
    public static void main(String[] args) {
        int small;
        int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    small = a[i];
                    a[i] = a[j];
                    a[j] = small;
                }
            }
        }
        System.out.println("Smallest element is " + a[1]);
    }
}
