// Circular Doubly Linked List in Java

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularDoublyLinkedList {
    Node head;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println("(back to head)");
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == value) {

                // Only one node
                if (current.next == current) {
                    head = null;
                    return;
                }

                current.prev.next = current.next;
                current.next.prev = current.prev;

                if (current == head) {
                    head = current.next;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    // Search
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

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        // Insert
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Circular Doubly Linked List: ");
        list.display();

        // Delete
        list.deleteByValue(20);
        System.out.print("After Deletion: ");
        list.display();

        // Search
        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 50: " + list.search(50));
    }
}
