import java.util.*;

public class Main {

    // Binary Search Method
    public static int binary(int arr[], int search) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (search < arr[mid]) {
                end = mid - 1;
            } else if (search > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Element found
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {2, 3, 6, 9, 12};

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.println(num);
        }

        System.out.print("Enter Search Element: ");
        int search = s.nextInt();

        int result = binary(arr, search);
        if (result >= 0) {
            System.out.println("Element Found at index: " + result);
        } else {
            System.out.println("Element Not Found!");
        }
        
        s.close();

     //Time Complexity -O(log n)
    //Space Complexity - 0(1)
    }
}
