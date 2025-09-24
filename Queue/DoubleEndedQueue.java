import java.util.Scanner;

class Deque
{
    private int size;
    private int front, rear;
    private int[] deque;

    // Constructor
    public Deque(int size) 
    {
        this.size = size;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if deque is full
    public boolean isFull() 
    {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    // Check if deque is empty
    public boolean isEmpty() 
    {
        return (front == -1);
    }

    // Insert element at front   O(1)
    public void insertFront(int data)
    {
        if (isFull())
        {
            System.out.println("⚠️ Deque is Full! Cannot insert " + data);
            return;
        }
        if (front == -1) 
        { // First element
            front = 0;
            rear = 0;
        }
        else if (front == 0) 
        {
            front = size - 1; // Wrap around
        } 
        else 
        {
            front--;
        }
        deque[front] = data;
        System.out.println("✅ " + data + " inserted at FRONT");
    }

    // Insert element at rear   O(1)
    public void insertRear(int data)
    {
        if (isFull()) 
        {
            System.out.println("⚠️ Deque is Full! Cannot insert " + data);
            return;
        }
        if (front == -1) 
        { // First element
            front = 0;
            rear = 0;
        } 
        else if (rear == size - 1) 
        {
            rear = 0; // Wrap around
        } 
        else 
        {
            rear++;
        }
        deque[rear] = data;
        System.out.println("✅ " + data + " inserted at REAR");
    }

    // Delete element from front   O(1)
    public void deleteFront() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Deque is Empty! Nothing to delete");
            return;
        }
        System.out.println("🗑 " + deque[front] + " deleted from FRONT");
        if (front == rear) 
        { // Only one element
            front = -1;
            rear = -1;
        } 
        else if (front == size - 1) 
        {
            front = 0; // Wrap around
        }
        else 
        {
            front++;
        }
    }

    // Delete element from rear   O(1)
    public void deleteRear()
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Deque is Empty! Nothing to delete");
            return;
        }
        System.out.println("🗑 " + deque[rear] + " deleted from REAR");
        if (front == rear) 
        { // Only one element
            front = -1;
            rear = -1;
        } 
        else if (rear == 0)
        {
            rear = size - 1; // Wrap around
        }
        else 
        {
            rear--;
        }
    }

    // Get front element   O(1)
    public void getFront() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Deque is Empty!");
        } 
        else 
        {
            System.out.println("🔎 Front Element = " + deque[front]);
        }
    }

    // Get rear element   O(1)
    public void getRear()
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Deque is Empty!");
        } 
        else 
        {
            System.out.println("🔎 Rear Element = " + deque[rear]);
        }
    }

    // Display deque   O(n)
    public void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("⚠️ Deque is Empty!");
            return;
        }
        System.out.print("📌 Deque Elements: ");
        int i = front;
        while (true) 
        {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class DoubleEndedQueue
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Deque: ");
        int n = sc.nextInt();

        DoubleEndedQueue dq = new DoubleEndedQueue(n);

        int choice;
        do 
{
            System.out.println("\n===== Deque Menu =====");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at Rear");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from Rear");
            System.out.println("5. Get Front Element");
            System.out.println("6. Get Rear Element");
            System.out.println("7. Display Deque");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
{
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    int val1 = sc.nextInt();
                    dq.insertFront(val1);
                    break;

                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    int val2 = sc.nextInt();
                    dq.insertRear(val2);
                    break;

                case 3:
                    dq.deleteFront();
                    break;

                case 4:
                    dq.deleteRear();
                    break;

                case 5:
                    dq.getFront();
                    break;

                case 6:
                    dq.getRear();
                    break;

                case 7:
                    dq.display();
                    break;

                case 8:
                    System.out.println("🚪 Exiting program...");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 8);

        /*
           Time Complexity:
             - Enqueue/Dequeue (Insert/Delete) → O(1)
             - Peek (Front/Rear) → O(1)
             - Display → O(n)

           Space Complexity: O(n)
        */
    }
}
