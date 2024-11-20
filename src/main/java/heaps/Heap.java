package heaps;

public interface Heap<T extends Comparable<T>> {
    /**
     * Inserts an element into the heap.
     * @param value the value to insert.
     */
    void insert(T value);

    /**
     * Extracts the root element (minimum for MinHeap or maximum for MaxHeap).
     * @return the extracted root element.
     */
    T extract();

    /**
     * Retrieves the root element without removing it.
     * @return the root element.
     */
    T peek();

    /**
     * Returns the current size of the heap.
     * @return the number of elements in the heap.
     */
    int size();

    /**
     * Checks if the heap is empty.
     * @return true if the heap is empty, false otherwise.
     */
    boolean isEmpty();
}

