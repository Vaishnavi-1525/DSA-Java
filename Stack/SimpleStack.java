import java.util.Scanner;

// Simple Stack program using array
public class SimpleStack {

    // Stack data
    private int arr[];       // Array to store stack elements
    private int top;         // Top of stack
    private int capacity;    // Maximum size of stack

    // Constructor to initialize stack
    public SimpleStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Function to add element (Push) Time Complexity - O(1)
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow (No space to add)");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    // Function to remove element (Pop) Time Complexity - O(1)
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow (No element to remove)");
        } else {
            System.out.println("Popped element is: " + arr[top--]);
        }
    }

    // Function to see top element (Peek) Time Complexity - O(1)
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }

    // Function to display stack elements Time Complexity - O(n)
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Create stack of size 5
        SimpleStack stack = new SimpleStack(5);

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int element = s.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        s.close();


      //Space Complexity → O(n)

      
    }
}
