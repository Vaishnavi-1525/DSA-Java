# 🧵 Linked List in Java

A **Linked List** is a linear data structure where elements (nodes) are stored in **non-contiguous memory locations**.
Each node contains **data** and a **reference (pointer)** to the next (and sometimes previous) node.

Linked Lists provide efficient **insertions** and **deletions**, especially in the middle of the list.

---

## 🧩 Types of Linked List

1. [Singly Linked List](SinglyLinkedList.java)

- Each node has data + next pointer

- Traversal is possible only in one direction (forward)

- Last node points to null

- Uses less memory than doubly linked list

- Used in stacks, queues, hash chaining

2. [Doubly Linked List](DoublyLinkedList.java)

- Node has data, next, and prev pointers

- Allows traversal in both directions

- Easier deletion and insertion at both ends

- First node’s prev is null, Last node’s next is null

- Used in navigation systems, undo/redo operations

3. [Circular Singly Linked List](CircularSinglyLinkedList.java)

- Each node contains data + next pointer

- Last node’s next points to the head

- No node points to null

- Traversal can start from any node

- Used in round-robin scheduling, multiplayer games

4. [Circular Doubly Linked List](CircularDoublyLinkedList.java)

- Each node contains data + next + previous pointers

- Last node’s next points to head

- Head’s prev points to last node

- Traversal is possible in both directions

- Used in music playlists, browser tabs

 
---

## ⚡ Operations & Complexity

| Operation           | Singly | Doubly | Description              |
|---------------------|--------|--------|--------------------------|
| Insert at Beginning | O(1)   | O(1)   | Add node at head         |
| Insert at end       | O(n)   | O(1)   | Add node at tail         |
| Delete by Beginning | O(1)   | O(1)   | Remove a specific node   |
| Delete by value     | O(n)   | O(n)   | Remove a specific node   |
| Search              | O(n)   | O(n)   | Find value in the list   |
| Display             | O(n)   | O(n)   | Print all nodes          |


---

## Space Complexity:

- Singly Linked List → O(n)

- Doubly Linked List → O(n) 

- Circular Singly Linked List → O(1)

- Circular Doubly Linked List → O(1)
  
---

## 📝 Notes

- Linked Lists are dynamic in size (unlike arrays).

- No memory wastage; memory allocated only when nodes are created.

- Deletion and insertion are faster than arrays but searching is slower.

- Useful in real-time applications like navigation, music playlists, undo-redo systems, and LRU cache.
