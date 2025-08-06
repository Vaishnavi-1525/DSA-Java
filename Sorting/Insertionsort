import java.util.Scanner;

public class InsertionSort {

    // Method to perform insertion sort
    void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // Shift elements of the sorted portion that are greater than current
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert the current element at the correct position
            arr[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        // Create and populate the array
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display array before sorting
        System.out.println("\nBefore Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sort the array
        InsertionSort sorter = new InsertionSort();
        sorter.insertion(arr);

        // Display array after sorting
        System.out.println("\n\nAfter Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();

//Time Complexity - O(n)
//Space Complexity - O(1)
    }
}
