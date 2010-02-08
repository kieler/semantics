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
 * A dependency is a type which contains two tuples and a type. The tuples
 * represents two states (the first and the second one) and the type
 * differentiates between control flow dependencies, hierarchical
 * dependencies and signal dependencies.
 * 
 * @author tam
 * 
 */
public class Dependency {
	private Tuple<State, Integer> firstStateTupel;
	private Tuple<State, Integer> secondStateTupel;
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
	public Dependency(final Tuple<State, Integer> firstState,
			final Tuple<State, Integer> secondState, final int type) {
		firstStateTupel = firstState;
		secondStateTupel = secondState;
		dependencyType = type;
	}

	/**
	 * The constructor without parameters.
	 */
	public Dependency() {
		firstStateTupel = null;
		secondStateTupel = null;
		dependencyType = 0;
	}

	/**
	 * Returns the first state tuple.
	 * 
	 * @return first state tuple
	 */
	public Tuple<State, Integer> getFirstStateTupel() {
		return firstStateTupel;
	}

	/**
	 * Returns the second state tuple.
	 * 
	 * @return second state tuple
	 */
	public Tuple<State, Integer> getSecondStateTupel() {
		return secondStateTupel;
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
	 * @param stateTupel
	 *            first state tuple
	 */
	public void setFirstStateTupel(final Tuple<State, Integer> stateTupel) {
		firstStateTupel = stateTupel;
	}

	/**
	 * Sets the second state tuple.
	 * 
	 * @param stateTupel
	 *            second state tuple
	 */
	public void setSecondStateTupel(final Tuple<State, Integer> stateTupel) {
		secondStateTupel = stateTupel;
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
}
