import java.util.Scanner;

class SimpleQueue {
    int[] queue;
    int front, rear, size;

    public SimpleQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int value) {         //Time Complexity- 0(1)
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) front = 0;
            rear++;
            queue[rear] = value;
            System.out.println(value + " added to the queue.");
        }
    }

    public void dequeue() {         //Time Complexity- 0(1)
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(queue[front] + " removed from the queue.");
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void display() {         //Time Complexity- 0(n)
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleQueue q = new SimpleQueue(5);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }

               //Time Complexity -: Worst-case [O(m⋅n)]
               //Space Complexity- 0(n)
    }
}
