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
package de.cau.cs.kieler.sim.kiem.automated.data;

/**
 * The result for a single DataComponent (that implements the IAutomatedProducer
 * interface). It contains at least the components name and a list of values
 * that the component wants to publish.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class ComponentResult extends AbstractResult {

    /** The name of the component. */
    private String name;

    // --------------------------------------------------------------------------

    /**
     * Create a new Component result.
     * 
     * @param componentName
     *            the name of the component
     */
    public ComponentResult(final String componentName) {
        super();
        this.name = componentName;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the name of this component.
     * 
     * @return the name of the component
     */
    public String getName() {
        return name;
    }
}
