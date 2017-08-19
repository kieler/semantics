/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.hooks;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.Component;
import de.cau.cs.kieler.cview.model.cViewModel.Connection;

/**
 * @author cmot
 *
 */
public interface ICViewAnalysis {

    /**
     * Define the name for this connection analysis hook.
     * 
     * @return the name
     */
    String getName();

    /**
     * Define an id for this connection analysis hook.
     * 
     * @return the name
     */
    String getId();

    /**
     * Initialize this connection analysis hook. Called once for all components before
     * createConnections have been called.
     * 
     * @param model
     */
    void initialize(CViewModel model, IProgressMonitor monitor);

    /**
     * Create more connections based on the traversed component and the overall model. Return null
     * if no connections shall be created.
     * 
     * @param component
     * @param model
     * @return
     */
    List<Connection> createConnections(Component component, CViewModel model, IProgressMonitor monitor);

    /**
     * Wrapup this connection analysis hook. Called once for all components after createConnections
     * have been called.
     * 
     * @param model
     */
    void wrapup(CViewModel model, IProgressMonitor monitor);
    
    /**
     * Return the priority of the analysis which is used to order all analyses that will be run
     * by the CView. Note that a higher number means that the analysis will run earlier. The
     * default shall be 0. A priority can also be negative. If there are two or more analyses
     * with the same priority, then the order is undefined. 
     * @return
     */
    int priority();

}
