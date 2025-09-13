import java.util.Scanner;

class PriorityQueue 
{
    private int size;
    private int[] queue;
    private int rear;

    // Constructor
    public PriorityQueue(int size) 
    {
        this.size = size;
        queue = new int[size];
        rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() 
    {
        return rear == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Insert element with priority (Here, smaller value = higher priority)
    // Time Complexity: O(n)
    public void enqueue(int data) 
    {
        if (isFull()) 
        {
            System.out.println("⚠️ Queue is Full! Cannot insert " + data);
            return;
        }

        int i;
        for (i = rear; i >= 0; i--) 
        {
            if (data < queue[i]) { // shift elements to maintain priority order
                queue[i + 1] = queue[i];
            } else {
                break;
            }
        }
        queue[i + 1] = data;
        rear++;
        System.out.println("✅ " + data + " inserted into Priority Queue");
    }

    // Delete highest priority element (smallest value)
    // Time Complexity: O(1)
    public void dequeue() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Queue is Empty! Nothing to delete");
            return;
        }
        System.out.println("🗑 " + queue[0] + " deleted from Priority Queue");
        for (int i = 0; i < rear; i++)
        {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    // Peek element with highest priority
    // Time Complexity: O(1)
    public void peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Queue is Empty!");
        } else 
        {
            System.out.println("🔎 Highest Priority Element = " + queue[0]);
        }
    }

    // Display queue
    // Time Complexity: O(n)
    public void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Queue is Empty!");
            return;
        }
        System.out.print("📌 Priority Queue Elements: ");
        for (int i = 0; i <= rear; i++) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Priority Queue: ");
        int n = sc.nextInt();

        PriorityQueue pq = new PriorityQueue(n);

        int choice;
        do 
        {
            System.out.println("\n===== Priority Queue Menu =====");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete Highest Priority)");
            System.out.println("3. Peek (Highest Priority Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    pq.enqueue(val);
                    break;

                case 2:
                    pq.dequeue();
                    break;

                case 3:
                    pq.peek();
                    break;

                case 4:
                    pq.display();
                    break;

                case 5:
                    System.out.println("🚪 Exiting program...");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 5);

        // Time Complexity:
        // Enqueue: O(n) | Dequeue: O(1) | Peek: O(1) | Display: O(n)
        // Space Complexity: O(n)
    }
}
