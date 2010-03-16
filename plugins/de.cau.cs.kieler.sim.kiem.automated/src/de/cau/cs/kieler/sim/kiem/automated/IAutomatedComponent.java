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
package de.cau.cs.kieler.sim.kiem.automated;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Interface for components that want to interact with the automated execution
 * plugin.
 * 
 * @author soh
 * @kieler.rating 2010-03-16 yellow ctr, tam
 */
public interface IAutomatedComponent {

    /** Identifier for the model file. */
    String MODEL_FILE = "Model file";
    /** Identifier for the iteration. */
    String ITERATION = "Iteration";

    /**
     * Give the component information. This at least contains the following
     * properties: {@link #MODEL_FILE} gotten from IPath.toOSString()
     * {@link #ITERATION} as an integer starting with 0 of course
     * 
     * 
     * @param properties
     *            some info
     * @throws KiemInitializationException
     *             if something went wrong while initializing the component
     */
    void setParameters(List<KiemProperty> properties)
            throws KiemInitializationException;

    /**
     * Getter for the list of model file extensions that are supported by the
     * component. Combinations of model files with execution files that don't
     * have at least one supporting component will not be executed.
     * 
     * If the component returns null or an empty list it will not be taken into
     * consideration for determining which model file should be executed.
     * However it will still be part of the execution. Thus it isn't necessary
     * for components to return something here if another component in the
     * schedule returns a list of extensions.
     * 
     * @return the list of supported model file extensions
     */
    String[] getSupportedExtensions();

    /**
     * Ask the component if it wants to do more runs. This causes the entire
     * execution to be executed again as many times as the components specified.
     * 
     * @return the number of additional runs
     */
    int wantsMoreRuns();

    /**
     * Ask the component if it wants to do more steps. This causes the entire
     * execution to perform at least as many steps as the components specified.
     * 
     * @return the number of additional steps
     */
    int wantsMoreSteps();

}
