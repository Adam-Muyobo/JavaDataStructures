package trees;

public interface Tree<T> {
    /**
     * Inserts a value into the tree.
     * @param value the value to insert.
     */
    void insert(T value);

    /**
     * Checks if a value exists in the tree.
     * @param value the value to search for.
     * @return true if the value exists, false otherwise.
     */
    boolean search(T value);

    /**
     * Deletes a value from the tree.
     * @param value the value to delete.
     */
    void delete(T value);

    /**
     * Performs an in-order traversal of the tree.
     * Processes nodes in sorted order (left, root, right).
     */
    void inOrderTraversal();

    /**
     * Performs a pre-order traversal of the tree.
     * Processes nodes in the order: root, left, right.
     */
    void preOrderTraversal();

    /**
     * Performs a post-order traversal of the tree.
     * Processes nodes in the order: left, right, root.
     */
    void postOrderTraversal();
}

