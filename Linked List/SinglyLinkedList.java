// Singly Linked List in Java
class Node {
    int data;   // The value of the node
    Node next;  // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head; // Head of the list

    // Insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Display all nodes
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If head needs to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Delete the node
        }
    }

    // Search for a value
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert nodes
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Linked List: ");
        list.display(); // 10 -> 20 -> 30 -> null

        // Delete a node
        list.deleteByValue(20);
        System.out.print("After Deletion: ");
        list.display(); // 10 -> 30 -> null

        // Search for a value
        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 50: " + list.search(50)); // false
    }
}
