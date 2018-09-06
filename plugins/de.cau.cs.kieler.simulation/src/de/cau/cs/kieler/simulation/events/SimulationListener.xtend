/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.events

import de.cau.cs.kieler.simulation.SimulationContext
import java.util.Observable
import java.util.Observer
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Interface that notifies about the simulation.
 * 
 * @author aas
 *
 */
interface SimulationListener extends Observer {
    
    static val disabledListeners = newHashSet()
    
    def isEnabled() {
        return !disabledListeners.contains(this)
    }
    
    def setEnabled(boolean enabled) {
        if (enabled) {
            disabledListeners.remove(this)
        } else if (canBeDisabled) {
            disabledListeners.add(this)
        }
    }
    
    def boolean canBeDisabled() {
        return true
    }

    override update(Observable o, Object arg) {
        if (isEnabled) {
            if (o instanceof SimulationContext && arg instanceof SimulationEvent) {
                update(o as SimulationContext, arg as SimulationEvent)
            }
        }
    }
    
    /**
     * Notifies about a simulation event.
     * Implementing classes should check the type of the event via instanceof to filter for the relevant events.
     * 
     * @param e The event
     */
    public def void update(SimulationContext ctx, SimulationEvent e)
    
    /**
     * Returns a user readable name for this listener.
     * This name may not contain a comma,
     * since it can be stored with other names in a comma separated string.
     */
    public def String getName()
}
