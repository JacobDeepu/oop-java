import java.util.Scanner;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;
        int i;
        for (i = n / 2 - 1; i >= 0; i--) {
            heaps(arr, n, i);
        }
        for (i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heaps(arr, i, 0);
        }
    }

    void heaps(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heaps(arr, n, largest);
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HeapSort obj = new HeapSort();
        obj.sort(arr);
        System.out.println("Sorted array:");
        obj.printArray(arr);

    }
}
