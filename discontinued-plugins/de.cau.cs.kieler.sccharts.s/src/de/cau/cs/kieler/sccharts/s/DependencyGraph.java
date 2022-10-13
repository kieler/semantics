/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.s;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds all data dependency nodes and all data and control flow dependencies for an
 * SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 * 
 */
public class DependencyGraph {

    /** The dependencies. */
    List<Dependency> dependencies;

    /** The dependency nodes. */
    List<DependencyNode> dependencyNodes;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dependency graph consisting of a bunch of dependency nodes (representation
     * SCChart states) and a bunch of dependency edges between these nodes.
     */
    public DependencyGraph() {
        dependencies = new ArrayList<Dependency>();
        dependencyNodes = new ArrayList<DependencyNode>();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all dependency edges between dependency nodes. These could be of type DataDependency or
     * ControlFlowDependency.
     * 
     * @return the dependencies
     */
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all dependency nodes.
     * 
     * @return the dependency nodes
     */
    public List<DependencyNode> getDependencyNodes() {
        return dependencyNodes;
    }

    // -------------------------------------------------------------------------

}
