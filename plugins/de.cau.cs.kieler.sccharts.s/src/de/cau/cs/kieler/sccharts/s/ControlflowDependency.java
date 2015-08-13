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

/**
 * This class holds a control flow dependency between an SCCharts State and another SCCharts State.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 * 
 */
public class ControlflowDependency extends Dependency {

    /**
     * Create a new control flow dependency edge.
     */
    public ControlflowDependency() {
    }

    // -------------------------------------------------------------------------

    /**
     * Create a new control flow dependency edge between two dependency nodes.
     * 
     * @param nodeDependeing
     *            the node dependeing
     * @param nodeToDependOn
     *            the node to depend on
     */
    public ControlflowDependency(DependencyNode nodeDependeing, DependencyNode nodeToDependOn) {
        super(nodeDependeing, nodeToDependOn);
    }

    // -------------------------------------------------------------------------

}
