import java.util.Scanner;

class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    // Constructor
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1) % size == front;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Insert element  Time Complexity -: O(1)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("⚠️ Queue is Full! Cannot insert " + data);
            return;
        }
        if (front == -1) front = 0; // First element
        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println("✅ " + data + " inserted into queue");
    }

    // Delete element   Time Complexity -: O(1)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("⚠️ Queue is Empty! Nothing to delete");
            return;
        }
        System.out.println("🗑 " + queue[front] + " deleted from queue");
        if (front == rear) { // Only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Peek front element   Time Complexity -: O(1)
    public void peek() {
        if (isEmpty()) {
            System.out.println("⚠️ Queue is Empty!");
        } else {
            System.out.println("🔎 Front Element = " + queue[front]);
        }
    }

    // Display queue    Time Complexity -: O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("⚠️ Queue is Empty!");
            return;
        }
        System.out.print("📌 Queue Elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Circular Queue: ");
        int n = sc.nextInt();

        CircularQueue cq = new CircularQueue(n);

        int choice;
        do {
            System.out.println("\n===== Circular Queue Menu =====");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    cq.enqueue(val);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.peek();
                    break;

                case 4:
                    cq.display();
                    break;

                case 5:
                    System.out.println("🚪 Exiting program...");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 5);

      
  Time Complexity -: O(n)
  Space Complexity = O(n)
      
    }
}
