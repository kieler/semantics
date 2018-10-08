/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.mode

import com.google.inject.Inject
import de.cau.cs.kieler.simulation.SimulationContext
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class SimulationMode {
    
    @Inject
    @Accessors(PUBLIC_GETTER)
    protected var SimulationContext context
    
    // ---------------------------------------------
    
    def String getName()
    
    // ---------------------------------------------
    
    def void start(boolean async)
        
    def void stop()
        
    def void play()
    
    def boolean isPlaying()
    
    def boolean supportsPlaying()
    
    def void pause()
    
    def boolean isPaused()
    
    def boolean supportsPausing()
    
    def boolean step()
    
    def boolean supportsStepping()
    
    // ---------------------------------------------

}