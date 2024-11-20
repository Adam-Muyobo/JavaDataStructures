package deques;

public interface Deque<T> {
    /**
     * Adds an element to the front of the deque.
     * @param element the element to add.
     */
    void addFirst(T element);

    /**
     * Adds an element to the back of the deque.
     * @param element the element to add.
     */
    void addLast(T element);

    /**
     * Removes and returns the element at the front of the deque.
     * @return the removed element.
     */
    T removeFirst();

    /**
     * Removes and returns the element at the back of the deque.
     * @return the removed element.
     */
    T removeLast();

    /**
     * Returns the element at the front of the deque without removing it.
     * @return the front element.
     */
    T peekFirst();

    /**
     * Returns the element at the back of the deque without removing it.
     * @return the back element.
     */
    T peekLast();

    /**
     * Checks if the deque is empty.
     * @return true if the deque is empty, false otherwise.
     */
    boolean isEmpty();
}

