import java.util.Scanner;

// Improved Stack program using array
public class ImprovedStack {

    private int arr[];    // Array to store stack elements
    private int top;      // Top of stack
    private int capacity; // Maximum size of stack

    // Constructor to initialize stack
    public ImprovedStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Function to add element (Push) - Time Complexity: O(1)
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot add element.");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack.");
        }
    }

    // Function to remove element (Pop) - Time Complexity: O(1)
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No element to remove.");
        } else {
            System.out.println("Popped element: " + arr[top--]);
        }
    }

    // Function to see top element (Peek) - Time Complexity: O(1)
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    // Function to display stack visually - Time Complexity: O(n)
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements (top -> bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println("| " + arr[i] + " |");
            }
            System.out.println("-----");
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        ImprovedStack stack = new ImprovedStack(size);

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
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
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
        // Space Complexity: O(n)
    }
}
