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

/**
 * Interface for components that want to interact
 * with the automated execution plugin.
 * 
 * @author soh
 */
public interface IAutomatedComponent {
    
    
    /**
     * Ask the component if it wants to do another run.
     * This causes the entire execution to be executed again
     * with an incremented index.
     * 
     * @return true if the component wants another run.
     */
    boolean wantsAnotherRun();

}
