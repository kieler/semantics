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

import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.base.Preconditions.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class PeriodicMode extends TimedSimulationMode {
    
    public static val MINIMUM = 0
    public static val MAXIMUM = Integer.MAX_VALUE
    public static var DEFAULT = 100
    
    private var boolean playing = false
    private var boolean paused = false
    @Accessors(PUBLIC_GETTER)
    private var long period = DEFAULT
    
    override getName() {
        "Periodic"
    }
    
    override start(boolean async) {
        super.start(async)
        remainingTime.set(period)
        playing = false
        paused = false
    }
    
    override stop() {
        super.stop
        playing = false
        paused = false
    }
    
    override play() {
        playing = true
        paused = false
    }
    
    override isPlaying() {
        return playing
    }
    
    override supportsPlaying() {
        return true
    }
    
    override pause() {
        playing = false
        paused = true
    }
    
    override isPaused() {
        return paused
    }
    
    override supportsPausing() {
        return true
    }
    
    override step() {
        context.controller.performInternalStep
    }
    
    override supportsStepping() {
        return true
    }
    
    override timerExpired() {
        step()
        remainingTime.set(period)
    }
    
    def setPeriod(long newPeriod) {
        checkArgument(newPeriod >= 0, "New period must be greater or equals zero")
        period = newPeriod
        if (getRemainingTime > newPeriod) {
            remainingTime.set(newPeriod)
        }
    }
}

