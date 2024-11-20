package arrays;

public interface Array<T> {
    /**
     * Adds an element to the end of the array.
     * @param element the element to add.
     */
    void add(T element);

    /**
     * Inserts an element at the specified index.
     * @param index the position where the element will be inserted.
     * @param element the element to insert.
     */
    void insert(int index, T element);

    /**
     * Retrieves the element at the specified index.
     * @param index the position of the element to retrieve.
     * @return the element at the specified index.
     */
    T get(int index);

    /**
     * Removes the element at the specified index.
     * @param index the position of the element to remove.
     */
    void remove(int index);

    /**
     * Returns the current number of elements in the array.
     * @return the size of the array.
     */
    int size();
}
