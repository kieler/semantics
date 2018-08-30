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

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ManualMode extends SimulationMode {
    
    override getName() {
        "Manual"
    }    
    
    override start(boolean async) {
        // nothing
    }
    
    override stop() {
        // nothing
    }
    
    override play() {
        // nothing
    }
    
    override isPlaying() {
        return false
    }
    
    override supportsPlaying() {
        return false
    }
    
    override pause() {
        // nothing
    }
    
    override isPaused() {
        return false
    }
    
    override supportsPausing() {
        return false
    }
    
    override step() {
        context.controller.performInternalStep
    }
    
    override supportsStepping() {
        return true
    }
}