package matrices;

public interface Matrix {
    /**
     * Retrieves the value at the specified row and column.
     * @param row the row index.
     * @param column the column index.
     * @return the value at the specified position.
     */
    int getValue(int row, int column);

    /**
     * Sets a value at the specified row and column.
     * @param row the row index.
     * @param column the column index.
     * @param value the value to set.
     */
    void setValue(int row, int column, int value);

    /**
     * Returns the number of rows in the matrix.
     * @return the number of rows.
     */
    int getRowCount();

    /**
     * Returns the number of columns in the matrix.
     * @return the number of columns.
     */
    int getColumnCount();

    /**
     * Adds another matrix to this matrix.
     * @param other the matrix to add.
     * @return a new matrix representing the sum.
     */
    Matrix add(Matrix other);

    /**
     * Multiplies this matrix by another matrix.
     * @param other the matrix to multiply with.
     * @return a new matrix representing the product.
     */
    Matrix multiply(Matrix other);
}

