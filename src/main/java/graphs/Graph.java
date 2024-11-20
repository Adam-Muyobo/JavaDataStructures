package graphs;

public interface Graph<T> {
    /**
     * Adds a vertex to the graph.
     * @param value the value of the vertex to add.
     */
    void addVertex(T value);

    /**
     * Adds an edge between two vertices.
     * @param from the starting vertex of the edge.
     * @param to the ending vertex of the edge.
     */
    void addEdge(T from, T to);

    /**
     * Checks if there is an edge between two vertices.
     * @param from the starting vertex.
     * @param to the ending vertex.
     * @return true if an edge exists, false otherwise.
     */
    boolean hasEdge(T from, T to);

    /**
     * Removes an edge between two vertices.
     * @param from the starting vertex.
     * @param to the ending vertex.
     */
    void removeEdge(T from, T to);

    /**
     * Displays the graph (e.g., as an adjacency list or matrix).
     */
    void display();
}

