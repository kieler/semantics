/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.compiler.dependencies;

/**
 * An edge in the dependency graph.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr 
 */
public class Edge {

    private Node node;
    private int delay;

    /**
     * @param n taget node
     * @param del
     *            of this dependency
     */
    public Edge(final Node n, final int del) {
        super();
        this.node = n;
        this.delay = del;
    }

    /**
     * @return delay of this dependency
     */
    public int getDelay() {
        return delay;
    }

    /**
     * @return corresponding node
     */
    public Node getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "->" + node;
    }
}
