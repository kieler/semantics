/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.codegen.sc;

/**
 * An enumerator class for enumerating adjacent vertices in a graph.
 * 
 * @kieler.rating 2010-06-14 yellow
 * 
 * @author <a href="mailto:schnoor@ti.informatik.uni-kiel.de">Henning Schnoor</a>
 * @author contributions by tam
 * @version 1.0, 06/23/09
 */
public class Enumerator {

    /**
     * The index of the last adjacent vertex that we returned.
     */
    private int lastReturnedVertex;

    /**
     * The graph which we are working with.
     */

    private Graph g;

    /**
     * The vertex whose neighbours we enumerate.
     */

    private int searchVertex;

    /**
     * Constructs a new enumerator that enumerates the values of a given array of integers.
     * 
     * @param graph
     *            the graph
     * 
     * @param vertex
     *            the vertex
     * 
     */
    public Enumerator(final Graph graph, final int vertex) {

        g = graph;
        if (vertex < 0 || vertex >= g.numberOfVertices()) {
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

        for (int index = lastReturnedVertex + 1; index < g.numberOfVertices(); index++) {
            if (g.hasEdge(searchVertex, index)) {
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
     */
    public int next() {

        for (int index = lastReturnedVertex + 1; index < g.numberOfVertices(); index++) {
            if (g.hasEdge(searchVertex, index)) {
                lastReturnedVertex = index;
                return index;
            }
        }

        String errorMessage = "Empty enumerator.";
        throw new IllegalArgumentException(errorMessage);
    }

}
