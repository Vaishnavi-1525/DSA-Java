🗂 Queue in Java

A Queue is a linear data structure that follows the FIFO (First In, First Out) principle.
It means the first element inserted is the first one to be removed.
Queues are widely used in scheduling tasks, handling requests, printer spooling, and breadth-first search (BFS).

📌 Contents

Simple Queue (Array Implementation)

⏱ Time & Space Complexity

Operation Complexity
Operation	Complexity
Enqueue	O(1)
Dequeue	O(1)
Display	O(n)

Space Complexity → O(n) (for storing n elements in the queue)

📝 Notes

Enqueue: Adds an element to the rear of the queue.

Dequeue: Removes the element from the front of the queue.

Display: Prints all elements from front to rear.

Handles empty and full queue conditions.

🚀 How to Run
javac SimpleQueue.java
java SimpleQueue

🖥 Sample Output
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter choice: 1
Enter value to add: 10
10 added to the queue.

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter choice: 3
Queue elements: 10
