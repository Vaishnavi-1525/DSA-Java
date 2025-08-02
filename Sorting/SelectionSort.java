import java.util.*;

public class SelectionSort {

    // Method to perform selection sort on an array
    public void selection_sort(int arr[]) {
        // Traverse through all array elements except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index as the minimum
            int min_index = i;

            // Check for the smallest element in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; // Update the index of the smallest element
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Ask the user to enter size of array
        System.out.println("Enter the size of array");
        int size = s.nextInt();

        // Create an array of given size
        int[] arr = new int[size];

        // Ask user to input array elements
        System.out.println("Enter the " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        // Display the array before sorting
        System.out.println("Array Before Selection Sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Create object and sort the array
        SelectionSort obj = new SelectionSort();
        obj.selection_sort(arr);

        // Display the array after sorting
        System.out.println("Array After Selection Sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
