// Circular Linked List in Java
class Node {
    int data;        // The value of the node
    Node next;       // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;   // Head of the list

    // Insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head; // Points to itself
            return;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;
    }

    // Display all nodes
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("(back to head)");
    }

    // Delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        Node current = head;
        Node prev = null;

        // If head node needs to be deleted
        if (head.data == value) {

            // If only one node
            if (head.next == head) {
                head = null;
                return;
            }

            // Find last node
            while (current.next != head) {
                current = current.next;
            }

            current.next = head.next;
            head = head.next;
            return;
        }

        // Delete other nodes
        do {
            prev = current;
            current = current.next;

            if (current.data == value) {
                prev.next = current.next;
                return;
            }
        } while (current != head);
    }

    // Search for a value
    public boolean search(int value) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == value) return true;
            current = current.next;
        } while (current != head);

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Insert nodes
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Circular Linked List: ");
        list.display(); // 10 -> 20 -> 30 -> (back to head)

        // Delete a node
        list.deleteByValue(20);
        System.out.print("After Deletion: ");
        list.display(); // 10 -> 30 -> (back to head)

        // Search for a value
        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 50: " + list.search(50)); // false
    }
}
