package de.cau.cs.kieler.synccharts.codegen.sc;

/**
 * An enumerator class for enumerating adjacent vertices in a graph.
 * 
 * @author <a href="mailto:schnoor@ti.informatik.uni-kiel.de">Henning Schnoor</a>
 * @version 1.0, 06/23/09
 */
public class Enumerator {

    /**
     * The index of the last adjacent vertex that we returned
     */
    private int lastReturnedVertex;

    /**
     * The graph which we are working with
     */

    private Graph G;

    /**
     * The vertex whose neighbours we enumerate.
     */

    private int searchVertex;

    /**
     * Constructs a new enumerator that enumerates the values of a given array of integers.
     * 
     * @param values
     *            the sequence of integers to be enumerated
     * 
     * @exception IllegalArgumentException
     *                if <code>i</code> is not between 0 and the number of vertices of this graph
     */
    public Enumerator(Graph Gr, int vertex) throws IllegalArgumentException {

        G = Gr;
        if (vertex < 0 || vertex >= G.numberOfVertices()) {
            String errorMessage = "Illegal vertex number.";

            throw new IllegalArgumentException(errorMessage);
        }

        // We did not return any vertex yet
        lastReturnedVertex = -1;
        searchVertex = vertex;
    }

    /**
     * Checks whether there is one more item to enumerate.
     * 
     * @return true if and only if there is another item to enumerate.
     * 
     */
    public boolean itemsLeft() {

        for (int index = lastReturnedVertex + 1; index < G.numberOfVertices(); index++) {
            if (G.hasEdge(searchVertex, index)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns the next item in the enumeration.
     * 
     * @return the next item in the enumeration.
     * 
     * @exception IllegalArgumentException
     *                if there is no further element to return
     */
    public int next() throws IllegalArgumentException {

        for (int index = lastReturnedVertex + 1; index < G.numberOfVertices(); index++) {
            if (G.hasEdge(searchVertex, index)) {
                lastReturnedVertex = index;
                return index;
            }
        }

        String errorMessage = "Empty enumerator.";
        throw new IllegalArgumentException(errorMessage);
    }

}
