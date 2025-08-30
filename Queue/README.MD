# 🗂 Queue in Java

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.  
It means the **first element inserted is the first one to be removed**.  
Queues are widely used in scheduling tasks, handling requests, printer spooling, and **breadth-first search (BFS)**.

---

## 📌 Contents
- Simple Queue (Array Implementation)  
- ⏱ Time & Space Complexity  
- Sample Usage  

---

## ⚡ Operations & Complexity

| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| Enqueue   | O(1)           | Add element at the rear |
| Dequeue   | O(1)           | Remove element from the front |
| Display   | O(n)           | Print all elements from front to rear |

**Space Complexity:** O(n) (for storing n elements in the queue)

---

## 📝 Notes
- **Enqueue**: Adds an element at the rear of the queue.  
- **Dequeue**: Removes the element from the front of the queue.  
- **Display**: Prints all elements in the queue from front to rear.  
- Properly handles **empty** and **full** queue conditions.  

---

## 🚀 How to Run
1. Compile the program:
```bash
javac SimpleQueue.java
