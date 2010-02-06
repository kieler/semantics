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

import java.util.HashSet;
import java.util.Set;

/**
 * A node, ie, a variable in the Dependency graph. A node has in- and outgoing edges and a variable.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 * 
 */
public class DepNode {

    private String name;

    private Integer prio = null;

    // in- and out-going transitions
    private Set<DepEdge> in = new HashSet<DepEdge>();
    private Set<DepEdge> out = new HashSet<DepEdge>();

    /**
     * @param n
     *            name of the new node
     */
    public DepNode(final String n) {
        this.name = n;
    }

    /**
     * @param e
     *            new in-going edge
     */
    public void addIn(final DepEdge e) {
        in.add(e);
    }

    /**
     * @param e
     *            new outgoing edge
     */
    public void addOut(final DepEdge e) {
        out.add(e);
    }

    /**
     * @return set of ingoing edges
     */
    public Set<DepEdge> getIn() {
        return in;
    }

    /**
     * @return name of the node
     */
    public String getName() {
        return name;
    }

    /**
     * @return set of out-going edges
     */
    public Set<DepEdge> getOut() {
        return out;
    }

    /**
     * @return true if the node is an input variable (source node)
     */
    public boolean isInput() {
        return in.isEmpty();
    }

    /**
     * @return true if the node is an output variable (sink node)
     */
    public boolean isOutput() {
        return out.isEmpty();
    }

    /**
     * @param n
     *            node to test
     * @return true, if names are equal
     */
    public boolean isEqual(final DepNode n) {
        return this.name.equals(n.name);
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * @return priority of this node
     */
    public int getPrio() {
        if (prio == null) {
            prio = 0;
            for (final DepEdge e : in) {
                final int p = e.getNode().getPrio();
                if (prio < p + 1) {
                    prio = p + 1;
                }
            }
        }
        return prio;
    }
}
