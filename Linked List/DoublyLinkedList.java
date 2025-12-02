class Node {
    int data;     // Value of the node
    Node next;    // Pointer to the next node
    Node prev;    // Pointer to the previous node

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;  // Head of the list

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
        newNode.prev = current; // Important for DLL
    }

    // Display list forward
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display list backward
    public void displayBackward() {
        if (head == null) return;

        // Move to last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If head is to be deleted
        if (head.data == value) {
            head = head.next;
            if (head != null) head.prev = null; // Update prev
            return;
        }

        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
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
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert nodes
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.displayForward();   // Forward: 10 <-> 20 <-> 30 <-> null
        list.displayBackward();  // Backward: 30 <-> 20 <-> 10 <-> null

        // Delete a value
        list.deleteByValue(20);
        list.displayForward();   // Forward: 10 <-> 30 <-> null

        // Search
        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 50: " + list.search(50)); // false
    }
}
