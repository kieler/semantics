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
 * DataComponents implementing this interface may receive
 * information prior to each simulation run.
 * 
 * @author soh
 */
public interface IAutomatedObserver extends IAutomatedComponent {
       
    /** Identifier for the model file. */
    String MODEL_FILE = "Model file";
    /** Identifier for the iteration. */
    String ITERATION = "Iteration";
    /** Identifier for the execution file. */
    String EXEC_FILE = "Execution file";
    /** Identifier for the status of the execution. */
    String STATUS = "Status";

    /**
     * Give the component information.
     * This at least contains the following properties:
     * {@link #MODEL_FILE}
     * {@link #ITERATION}
     * {@link #EXEC_FILE}
     * 
     * 
     * @param properties some info
     */
    void setParameters(List<KiemProperty> properties);

}
