import java.util.Scanner;

public class BubbleSort {

    // Method to perform Bubble Sort
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if current element is greater than next
                if (arr[j] > arr[j + 1]) {
                    // Swapping using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("\nArray Before Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Creating object and calling sort
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);

        System.out.println("\n\nArray After Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Time Complexity: O(n^2) in worst case
        // Space Complexity: O(1) - in-place sorting
    }
}
