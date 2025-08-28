# 🌀 Sorting Algorithms in Java

Sorting algorithms are used to **arrange elements in a particular order** (ascending or descending).  
They are widely used in searching, optimization, and data analysis.

## 📌 Contents
- [Bubble Sort](BubbleSort.java)  
- [Insertion Sort](InsertionSort.java)  
- [Selection Sort](SelectionSort.java)  
- [Merge Sort](MergeSort.java)  
- [Quick Sort](QuickSort.java)

---

## ⏱ Time & Space Complexity

| Algorithm       | Best Case   | Worst Case  | Average Case | Space  |
|-----------------|-------------|-------------|--------------|--------|
| Bubble Sort     | O(n)        | O(n²)       | O(n²)        | O(1)   |
| Insertion Sort  | O(n)        | O(n²)       | O(n²)        | O(1)   |
| Selection Sort  | O(n²)       | O(n²)       | O(n²)        | O(1)   |
| Merge Sort      | O(n log n)  | O(n log n)  | O(n log n)   | O(n)   |
| Quick Sort      | O(n log n)  | O(n²)       | O(n log n)   | O(log n) |

---

## 📝 Notes
- **Bubble & Selection Sort** are simple but inefficient for large inputs.  
- **Insertion Sort** works well for **small or nearly sorted arrays**.  
- **Merge Sort** is stable & efficient (O(n log n)) but uses extra space.  
- **Quick Sort** is very fast in practice but can degrade to O(n²) if pivot is chosen poorly.
