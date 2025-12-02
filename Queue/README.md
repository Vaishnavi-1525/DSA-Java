# 🗂 Queue in Java

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.  
It means the **first element inserted is the first one to be removed**.  
Queues are widely used in scheduling tasks, handling requests, printer spooling, and **breadth-first search (BFS)**.

---

## 🧩 Types of Queue  

1.  [Simple Queue](SimpleQueue.java)  
   - Follows FIFO (First In, First Out) order.  
   - Insertion happens at the rear, deletion at the front.  

2.  [Circular Queue](CircularQueue.java) 
   - The last position connects back to the first, forming a circle.  
   - Efficient memory utilization as unused spaces are reused.  

3.  [Priority Queue](PriorityQueue.java)  
   - Each element has a priority assigned.  
   - Higher-priority elements are dequeued before lower-priority ones.  

4.  [Double-Ended Queue (Deque)](DoubleEndedQueue.java) 
   - Allows insertion and deletion at both front and rear ends.  
   - More flexible compared to a simple queue.  


---

## ⚡ Operations & Complexity

| Operation | Time Complexity| Description |
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


