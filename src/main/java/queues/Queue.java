package queues;

public interface Queue<T> {
    /**
     * Adds an element to the end of the queue.
     * @param element the element to add.
     */
    void enqueue(T element);

    /**
     * Removes and returns the element at the front of the queue.
     * @return the removed element.
     */
    T dequeue();

    /**
     * Returns the element at the front of the queue without removing it.
     * @return the front element.
     */
    T peek();

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the current number of elements in the queue.
     * @return the size of the queue.
     */
    int size();
}

