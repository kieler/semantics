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
import de.cau.cs.kieler.simulation.events.SimulationListener
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.ide.preferences.SimulationPreferences
import org.eclipse.jface.preference.IPreferenceStore

/**
 * @author sdo
 * 
 */
class SimulationIDE {

    public static var SimulationContext currentSimulation

    @Accessors(PUBLIC_GETTER)
    private static var listeners = <SimulationListener>newHashSet()
    @Accessors
    private static var boolean canRestartSimulation = false
    
    @Accessors(PUBLIC_GETTER)
    static val environmentDefaults = new SimulationPreferences

    static def initialize(SimulationListener cleaner, SimulationListener errorReporter, IPreferenceStore preferences) {
        listeners = <SimulationListener>newHashSet(cleaner, errorReporter)
        environmentDefaults.store = preferences
    }

    static def stopAndRemoveSimulation() {
        // Stop
        if (currentSimulation !== null) {
            if (currentSimulation.running) {
                currentSimulation.stop
            }

            // Remove Listeners
            for (listener : listeners) {
                currentSimulation.deleteObserver(listener)
            }
        }

        currentSimulation = null
        canRestartSimulation = false
    }

    static def registerObserver(SimulationListener listener) {
        listeners += listener
        if (currentSimulation !== null) {
            currentSimulation.addObserver(listener)
        }
    }

    static def getObservers() {
        listeners.unmodifiableView
    }

    static def startSimulation(SimulationContext context) {
        stopAndRemoveSimulation
        
        currentSimulation = context
        
        // Add Listeners
        for (listener : listeners) {
            currentSimulation.addObserver(listener)
        }
        
        // TODO connect to preference page
        currentSimulation.startEnvironment.copyProperties(environmentDefaults)
    }
}
