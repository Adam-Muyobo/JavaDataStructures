
# Java Data Structures Implementation

This repository contains implementations of fundamental and commonly used data structures in Java. Each data structure is designed with a focus on modularity, readability, and practical use cases.

## **Project Structure**

```
JavaDataStructures/
├── src/
│   ├── Arrays/
│   ├── LinkedLists/
│   ├── Stacks/
│   ├── Queues/
│   ├── Deques/
│   ├── Trees/
│   ├── Graphs/
│   ├── Heaps/
│   ├── HashTables/
│   ├── Sets/
│   ├── Strings/
│   ├── Matrices/
│   └── Maps/
├── test/
│   └── DataStructureTests/ (Unit tests for each data structure)
├── .idea/ (IntelliJ project configuration files)
├── pom.xml (For Maven dependencies, if applicable)
└── README.md
```

## **Implemented Data Structures**

### **1. Arrays**
- Dynamic array implementation supporting addition, insertion, removal, and retrieval of elements.

### **2. Linked Lists**
- Singly Linked List
- Doubly Linked List
- Circular Linked List

### **3. Stacks**
- Array-based Stack
- Linked List-based Stack

### **4. Queues**
- Array-based Queue
- Linked List-based Queue
- Circular Queue
- Priority Queue

### **5. Deques**
- Double-ended queue supporting addition and removal from both ends.

### **6. Trees**
- Binary Tree
- Binary Search Tree (BST)
- AVL Tree (Self-balancing BST)

### **7. Graphs**
- Adjacency List Representation
- Adjacency Matrix Representation
- Depth First Search (DFS)
- Breadth First Search (BFS)

### **8. Heaps**
- Min-Heap
- Max-Heap

### **9. Hash Tables**
- Basic Hash Table with collision handling (Chaining)

### **10. Sets**
- Set implementation using hashing.

### **11. Strings**
- String manipulation operations (e.g., palindrome check, reversal, character counting).

### **12. Matrices**
- Matrix operations including addition and multiplication.

### **13. Maps**
- Map implementation supporting basic key-value pair operations.

## **Setup Instructions**

### Prerequisites
- Install **IntelliJ IDEA**.
- Ensure **Java Development Kit (JDK)** is installed (JDK 8 or higher).

### Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/Adam-Muyobo/JavaDataStructures.git
   ```
2. Open IntelliJ IDEA.
3. Select **File > Open**, and navigate to the cloned project directory.
4. Build the project using IntelliJ's build tools.

### Running the Program
- Navigate to the `src/` directory.
- Open the desired data structure implementation file.
- Right-click the file and select **Run** to execute.

### Running Tests
- Test classes are located in the `test/` directory.
- To run all tests, right-click the `test/` folder and select **Run 'All Tests'**.

## **Future Enhancements**
- Add advanced data structures like Tries and Segment Trees.
- Include more real-world applications for each data structure.

## **Contributing**
Contributions are welcome! If you would like to suggest enhancements or report issues, feel free to open an issue or submit a pull request.

## **License**
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
