/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide

import de.cau.cs.kieler.simulation.SimulationContext
import java.util.Collection
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 */
interface ISimulationListenerProvider {
    
    /**
     * Provide static simulation listeners.
     */
    def Collection<ISimulationListener> getListeners()
    
    /**
     * Invoked to handle exceptions
     */
    def void handleError(Exception e) {}
    
    /**
     * Invoked to pre process an new simulation instance before start.
     */
    def void prepareNewSimulation(SimulationContext simulation) {}
}