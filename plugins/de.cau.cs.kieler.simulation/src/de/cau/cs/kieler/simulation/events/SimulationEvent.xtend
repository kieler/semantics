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

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.SimulationContext
import org.eclipse.xtend.lib.annotations.ToString

/**
 * Base class for simulation events
 * 
 * @author aas
 *
 */
@FinalFieldsConstructor
@ToString
class SimulationEvent {
    
    /**
     * The context.
     */
    @Accessors 
    val SimulationContext context
    
    /**
     * A message for the user.
     */
    @Accessors
    var String message

}
