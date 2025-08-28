# 🗂 Stack in Java

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
It means the last element inserted is the first one to be removed.  
Stacks are widely used in **function calls, expression evaluation, undo/redo features, and backtracking**.

---

## 📌 Contents
- [Simple Stack (Array Implementation)](SimpleStack.java)

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

## 📝 Notes
- **Push** adds an element to the top of the stack.  
- **Pop** removes the top element.  
- **Peek** shows the top element without removing it.  
- **Display** prints all stack elements from top to bottom.  

---

## 🚀 How to Run
```bash
javac SimpleStack.java
java SimpleStack
