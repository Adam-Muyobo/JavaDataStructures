package linkedLists;

public interface LinkedList<T> {
    /**
     * Adds an element to the beginning of the list.
     * @param element the element to add.
     */
    void addFirst(T element);

    /**
     * Adds an element to the end of the list.
     * @param element the element to add.
     */
    void addLast(T element);

    /**
     * Removes and returns the first element of the list.
     * @return the removed element.
     */
    T removeFirst();

    /**
     * Removes and returns the last element of the list.
     * @return the removed element.
     */
    T removeLast();

    /**
     * Retrieves the element at the specified index.
     * @param index the position of the element to retrieve.
     * @return the element at the specified index.
     */
    T get(int index);

    /**
     * Returns the number of elements in the list.
     * @return the size of the list.
     */
    int size();
}

