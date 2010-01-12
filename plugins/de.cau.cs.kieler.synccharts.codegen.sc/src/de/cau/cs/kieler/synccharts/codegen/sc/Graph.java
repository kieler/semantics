package de.cau.cs.kieler.synccharts.codegen.sc;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * An implementation of an unweighted, directed graph using an adjacency matrix or an adjacency list
 * for encoding the set of edges.
 */
public class Graph {
    /**
     * Two types of edges for special use. Default should be STRONG_EDGE.
     */
    public static final int NO_EDGE = 0;
    public static final int STRONG_EDGE = 1;
    public static final int WEAK_EDGE = -1;

    /**
     * The number of vertices of this graph.
     */
    int numberOfVertices;

    /**
     * The number of edges of this graph.
     */
    int numberOfEdges;

    /**
     * A boolean to differ between list and matrix
     */
    boolean list;

    /**
     * The adjacency matrix encoding the set of edges of this graph.
     */
    int[][] adjacencyMatrix;

    /**
     * The adjacency list encoding the set of edges of this graph.
     */
    ArrayList<ArrayList<Integer>> adjacencyList;

    /**
     * Constructs a new unweighted, directed graph with <code>n</code> vertices and no edges. Use
     * <code>addEdge(int, int, int)</code> in order to add edges.
     * 
     * @param n
     *            the number of vertices of the new graph
     * @param isList
     *            specifies if the graph is represented in a list or a matrix. If isList is true the
     *            representation is a list.
     * 
     * @exception IllegalArgumentException
     *                if <code>n</code> is less than zero
     * @see #addEdge(int, int)
     */
    public Graph(int n, boolean isList) throws IllegalArgumentException {

        // adjacency list or adjacency matrix?
        list = isList;

        // check the passed number of vertices
        if (n < 1) {
            String errorMessage = "n must be greater than or equal to 1.";

            throw new IllegalArgumentException(errorMessage);
        }

        // remember the number of vertices of this graph
        numberOfVertices = n;

        // initially there are no edges
        numberOfEdges = 0;

        if (list) {
            adjacencyList = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < numberOfVertices; i++) {
                adjacencyList.add(new ArrayList<Integer>());
            }
        } else {
            adjacencyMatrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    adjacencyMatrix[i][j] = NO_EDGE;
                }
            }
        }

    }

    /**
     * Returns an enumeration of adjacent vertices of the graph.
     * 
     * @param <code>i</code> the number of the vertex
     * 
     * @return an enumeration of all vertices that are adjacent to i
     * 
     * @exception IllegalArgumentException
     *                if <code>i</code> is an illegal vertex number
     */
    public Enumerator enumerateAdjacentVertices(int i) throws IllegalArgumentException {
        return new Enumerator(this, i);
    }

    /**
     * Adds an edge between the vertices with the indices <code>i</code> and <code>j</code> to this
     * graph.
     * 
     * @param i
     *            the index of the vertex the new edge starts at
     * @param j
     *            the index of the vertex the new edge points to
     * 
     * @param edgeType
     *            the type of an edge (STRONG_EDGE, WEAK_EDGE or NO_EDGE)
     * 
     * @exception IllegalArgumentException
     *                if <code>i</code> or <code>j</code> are not between 0 and the number of
     *                vertices of this graph
     */
    public void addEdge(int i, int j, int edgeType) throws IllegalArgumentException {
        // check the passed vertex indizes
        if (i < 0 || i >= numberOfVertices || j < 0 || j >= numberOfVertices) {
            String errorMessage = "Allows vertex indizes are 0.." + (numberOfVertices - 1) + ".";

            throw new IllegalArgumentException(errorMessage);
        }

        /*
         * update the number of edges if there has been no edge between the passed vertices yet,
         * only
         */

        // add Edge
        if (list) {
            if (!adjacencyList.get(i).contains(j)) {
                numberOfEdges++;
            }
            adjacencyList.get(i).add(j);
        } else {
            if (adjacencyMatrix[i][j] == NO_EDGE) {
                numberOfEdges++;
            }
            adjacencyMatrix[i][j] = edgeType;
        }
    }

    /**
     * Returns the number of edges of this graph.
     * 
     * @return the number of edges of this graph
     */
    public int numberOfEdges() {
        return numberOfEdges;
    }

    /**
     * Returns the number of vertices of this graph.
     * 
     * @return the number of vertices of this graph
     */
    public int numberOfVertices() {
        return numberOfVertices;
    }

    /**
     * Returns true, if there is an edge between the vertices with the indices <code>i</code> and
     * <code>j</code> within this graph, and false otherwise.
     * 
     * @param i
     *            the index of the start vertex to check
     * @param j
     *            the index of the end vertex to check
     * @return true, if there is an edge between the vertices with the indices <code>i</code> and
     *         <code>j</code> within this graph, and<br>
     *         false, otherwise
     * @exception IllegalArgumentException
     *                if <code>i</code> or <code>j</code> are not between 0 and the number of
     *                vertices of this graph
     */
    public boolean hasEdge(int i, int j) throws IllegalArgumentException {
        // check the passed vertex indizes
        if (i < 0 || i >= numberOfVertices || j < 0 || j >= numberOfVertices) {
            String errorMessage = "Allowed vertex indizes are 0.." + (numberOfVertices - 1) + ".";

            throw new IllegalArgumentException(errorMessage);
        }

        if (list) {
            return (adjacencyList.get(i).contains(j));
        } else {
            return (!(adjacencyMatrix[i][j] == NO_EDGE));
        }
    }

    /**
     * Returns the degree of a vertex <code>i</code>, i.e., the number of vertices. which are
     * adjacent to <code>i</code>,
     * 
     * @param i
     *            the index of the vertex
     * 
     * @return the number of vertices that are adjacent to <code>i</code>
     * 
     * @exception IllegalArgumentException
     *                if <code>i</code> is not between 0 and the number of vertices of this graph
     */
    public int degree(int i) {
        // check the passed vertex indizes
        if (i < 0 || i >= numberOfVertices) {
            String errorMessage = "Allowed vertex indizes are 0.." + (numberOfVertices - 1) + ".";

            throw new IllegalArgumentException(errorMessage);
        }
        int result = 0;
        if (list) {
            result = adjacencyList.get(i).size();
        } else {
            for (int index = 0; index < numberOfVertices; index++) {
                if (hasEdge(i, index)) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * Prints the Graph in a simple way to the console.
     */
    public void print() {
        if (list) {
            for (int i = 0; i < numberOfVertices; i++) {
                System.out.println(adjacencyList.get(i));
            }
        } else {
            for (int i = 0; i < numberOfVertices; i++) {
                for (int j = 0; j < numberOfVertices; j++) {
                    System.out.print(adjacencyMatrix[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }

    /**
     * returns an integer array with a list of predecessor vertices
     * (just implemented for adjacency lists)
     * 
     * @return an integer array with a list of predecessor vertices.
     */
    private int[] predecessorList() {
        int[] result = new int[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            int count = 0;
            for (int j = 0; j < numberOfVertices; j++) {
                if (adjacencyList.get(j).contains(i)) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    
    /**
     * returns a linked list with the topological sort of the graph
     * (just implemented for adjacency lists)
     * 
     * @return a linked list with the topological sort of the graph
     */
    public LinkedList<Integer> topologicalSort() {
        LinkedList<Integer> result = new LinkedList<Integer>();
        int[] predecessorList = predecessorList();
        // one loop for each node
        for (int i = 0; i < numberOfVertices; i++) {
            int source = -1;
            // find source node
            for (int j = 0; j < numberOfVertices; j++) {
                if (predecessorList[j] == 0) {
                    source = j;
                }
            }
            predecessorList[source] = -1;
            // remove all predecessor dependencies of source
            for (int j : adjacencyList.get(source)) {
                predecessorList[j]--;
            }
            result.add(source);
        }
        return result;
    }
}
