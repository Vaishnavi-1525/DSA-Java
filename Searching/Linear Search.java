import java.util.*;

public class Main {
    public static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {7, 12, 9, 11, 3};
        System.out.println("Array Elements: " + Arrays.toString(arr));

        System.out.print("Enter Search Element: ");
        int search = scanner.nextInt();

        int result = linearSearch(arr, search);
        if (result >= 0) {
            System.out.println("Element Found at index " + result);
        } else {
            System.out.println("Element Not Found!");
        }
        //Time Complexity - Best case: Best case: O(1)
        // Space Complexity - O(1)
        scanner.close();
    }
}
