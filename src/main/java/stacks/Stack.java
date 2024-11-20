package stacks;

public interface Stack<T> {
    /**
     * Adds an element to the top of the stack.
     * @param element the element to add.
     */
    void push(T element);

    /**
     * Removes and returns the top element of the stack.
     * @return the removed element.
     */
    T pop();

    /**
     * Returns the top element of the stack without removing it.
     * @return the top element.
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();
}

