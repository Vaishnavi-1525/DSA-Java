import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    /**
     * Recursive QuickSort method.
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quick(arr, low, pivotIndex - 1);  // Sort left subarray
            quick(arr, pivotIndex + 1, high); // Sort right subarray
        }
    }

    /**
     * Places pivot element at the correct position and arranges smaller elements on the left and larger on the right.
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     * @return The index position of the pivot.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nBefore Quick Sort: " + Arrays.toString(arr));
        quick(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(arr));

        scanner.close();

 //Time Complexity: Best Case: O(n log n) / Worst Case: O(n^2)
 //Space Complexity - 	O(log n)
 
    }
}
