# 🧵 Linked List in Java

A **Linked List** is a linear data structure where elements (nodes) are stored in **non-contiguous memory locations**.
Each node contains **data** and a **reference (pointer)** to the next (and sometimes previous) node.

Linked Lists provide efficient **insertions** and **deletions**, especially in the middle of the list.

---

## 🧩 Types of Linked List

1. [Singly Linked List](SimpleQueue.java)

- Each node has data + next pointer

- Traversal is possible only in one direction (forward)

- Used in stacks, queues, and hash chains

2. [Doubly Linked List](DoublyLinkedList.java)

- Node has data, next, and prev pointers

- Allows traversal in both directions

- Easier deletion and insertion at both ends

3. [Circular Linked List](#)

- Last node points back to the head

- Forms a loop structure

- Ideal for round-robin scheduling

---

## ⚡ Operations & Complexity

|   Operation    |Singly |	Doubly |	Description     |

|-----------------------------------------------------|

|Insert at end   |  O(n) |   O(n)	 | Add node at tail |

|Delete by value |	O(n) |	 O(n)	 | Remove a specific node |

|Search	         |  O(n) |   O(n)	 | Find value in the list |

|Display	       |  O(n) |   O(n)	 | Print all nodes |

---

## Space Complexity:

- Singly Linked List → O(n)

- Doubly Linked List → O(n) extra space due to prev pointer

---

## 📝 Notes

- Linked Lists are dynamic in size (unlike arrays).

- No memory wastage; memory allocated only when nodes are created.

- Deletion and insertion are faster than arrays but searching is slower.

- Useful in real-time applications like navigation, music playlists, undo-redo systems, and LRU cache.
