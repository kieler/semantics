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
package de.cau.cs.kieler.sim.kiem;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Interface for components that want to interact with the automated execution
 * plugin.
 * 
 * @author soh
 */
public interface IAutomatedComponent {

    /** Identifier for the model file. */
    String MODEL_FILE = "Model file";
    /** Identifier for the iteration. */
    String ITERATION = "Iteration";
    /** Identifier for the status of the execution. */
    String STATUS = "Status";

    /**
     * Give the component information. This at least contains the following
     * properties: {@link #MODEL_FILE} gotten from IPath.toOSString()
     * {@link #ITERATION} as an integer starting with 0 of course
     * 
     * 
     * @param properties
     *            some info
     */
    void setParameters(List<KiemProperty> properties);

    /**
     * Ask the component if it wants to do another run. This causes the entire
     * execution to be executed again with an incremented index.
     * 
     * @return true if the component wants another run.
     * @deprecated use wantsMoreRuns() instead
     */
    @Deprecated
    boolean wantsAnotherRun();

    /**
     * Ask the component if it wants to do another step. As soon as all
     * components answer with false the execution is stopped, the producers are
     * asked to supply data and the components will be asked if they want
     * another run.
     * 
     * @return true if another step should be performed
     * @deprecated use wantsMoreSteps() instead
     */
    @Deprecated
    boolean wantsNextStep();

    /**
     * Ask the component if it wants to do more runs. This causes the entire
     * execution to be executed again as many times as the components specified.
     * 
     * @return the number of additional runs
     */
    // int wantsMoreRuns();

    /**
     * Ask the component if it wants to do more steps. This causes the entire
     * execution to perform at least as many steps as the components specified.
     * 
     * @return the number of additional steps
     */
    // int wantsMoreSteps();

}
