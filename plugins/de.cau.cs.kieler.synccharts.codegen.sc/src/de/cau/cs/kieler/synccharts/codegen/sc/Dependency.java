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
package de.cau.cs.kieler.synccharts.codegen.sc;

import de.cau.cs.kieler.synccharts.State;

/**
 * A dependency is a type which contains two tuples and a type. The tuples represents two states
 * (the first and the second one) and the type differentiates between control flow dependencies,
 * hierarchical dependencies and signal dependencies.
 * 
 * @author tam
 * 
 */
public class Dependency {
    private StatePlusTransition first;
    private StatePlusTransition second;
    private Integer dependencyType;

    /**
     * The constructor with two tuples and a type.
     * 
     * @param firstState
     *            tuple of the first state
     * @param secondState
     *            tuple of the second state
     * @param type
     *            type of the dependency
     */
    public Dependency(final StatePlusTransition firstState,
            final StatePlusTransition secondState, final int type) {
        first = firstState;
        second = secondState;
        dependencyType = type;
    }

    /**
     * The constructor without parameters.
     */
    public Dependency() {
        first = null;
        second = null;
        dependencyType = 0;
    }

    /**
     * Returns the first state tuple.
     * 
     * @return first state tuple
     */
    public StatePlusTransition getFirstState() {
        return first;
    }

    /**
     * Returns the second state tuple.
     * 
     * @return second state tuple
     */
    public StatePlusTransition getSecondState() {
        return second;
    }

    /**
     * Returns the type of the dependency.
     * 
     * @return dependency type
     */
    public int getDependencyType() {
        return dependencyType;
    }

    /**
     * Sets the first state tuple.
     * 
     * @param firstState
     *            first state tuple
     */
    public void setFirstStateTupel(final StatePlusTransition firstState) {
        first = firstState;
    }

    /**
     * Sets the second state tuple.
     * 
     * @param secondState
     *            second state tuple
     */
    public void setSecondStateTupel(final StatePlusTransition secondState) {
        second = secondState;
    }

    /**
     * Sets the type of the dependency.
     * 
     * @param type
     *            type of the dependency
     */
    public void setDependencyType(final int type) {
        dependencyType = type;
    }

    @Override
    public boolean equals(final Object other) {
        if (other instanceof Dependency) {
            Dependency dep = (Dependency) other;
            boolean boolObject1 = dep.first.equals(first);
            boolean boolObject2 = dep.second.equals(second);
            boolean boolObject3 = dep.dependencyType.equals(dependencyType);
            return (boolObject1 && boolObject2 && boolObject3);
        } else {
            return false;
        }
    }
}
