# 🗂 Stack in Java

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
It means the last element inserted is the first one to be removed.  
Stacks are widely used in **function calls, expression evaluation, undo/redo features, and backtracking**.

---

## ⏱ Time & Space Complexity

| Operation | Complexity |
|-----------|------------|
| Push      | O(1) |
| Pop       | O(1) |
| Peek      | O(1) |
| Display   | O(n) |

**Space Complexity** → O(n) (for storing `n` elements in the stack)

---

## 📚 Types of Stack
1. **Array-based Stack**  
   - Uses a fixed-size array to store elements.  
   - **Pros:** Simple and fast.  
   - **Cons:** Limited size, may overflow.  

2. **Linked List-based Stack**  
   - Uses a dynamic linked list.  
   - **Pros:** Can grow dynamically, no overflow (limited by memory).  
   - **Cons:** Extra memory for pointers, slightly slower.
  
   ---

   ## 📝 Notes
- **Push** adds an element to the top of the stack.  
- **Pop** removes the top element.  
- **Peek** shows the top element without removing it.  
- **Display** prints all stack elements from top to bottom.  
- **isEmpty()** Checks if the stack is empty.  
- **isFull()** Checks if the stack is full (for fixed-size stacks).
  
---

## 🛠️ Applications
- Function call management in recursion.  
- Undo/Redo in text editors.  
- Expression evaluation (infix, postfix, prefix).  
- Backtracking algorithms (e.g., maze solving).

---



## 🖥️ Sample Output

 Enter the size of the stack: 5

 --- Stack Menu ---
 1. Push
 2. Pop
 3. Peek
 4. Display
 5. Exit
 Enter your choice: 1
 Enter element to push: 10
 10 pushed into stack.
 Enter your choice: 1
 Enter element to push: 20
 20 pushed into stack.
 Enter your choice: 4
 Stack elements (top -> bottom):
  | 20 |
  | 10 |
 -----
