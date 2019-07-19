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
import com.google.common.base.Stopwatch
import java.util.concurrent.TimeUnit
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.simulation.internal.processor.DynamicTickInput
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.core.definitions.DynamicTicks
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DynamicTickMode extends TimedSimulationMode implements ISimulationListener {
    
    private var boolean async = false
    private var volatile boolean playing = false
    private var volatile boolean paused = false
    private var volatile boolean fire = false
    @Accessors(PUBLIC_GETTER)
    private var long sleepT = 0
    private val deltaT = Stopwatch.createUnstarted
    private val offTime = Stopwatch.createUnstarted
    
    override getName() {
        "Dynamic"
    }
    
    override start(boolean async) {
        super.start(async)
        // Add dynamic tick input provider
        val root = context.system.processors as ProcessorGroup
        root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
            id = DynamicTickInput.ID
        ])
        // Async
        this.async = async
        if (async) {
            context.addObserver(this)
        }
        playing = false
        paused = false
    }
    
    override stop() {
        super.stop
        if (deltaT.running) deltaT.stop
        playing = false
        paused = false
        // Remove dynamic tick input provider
        val root = context.system.processors as ProcessorGroup
        root.processors.removeIf[DynamicTickInput.ID.equals(id)]
        // Async
        this.async = false
        context.deleteObserver(this)
    }
    
    override play() {
        playing = true
        paused = false
        fire = true
        deltaT.start
    }
    
    override isPlaying() {
        return playing
    }
    
    override supportsPlaying() {
        return true
    }
    
    override pause() {
        if (deltaT.running) deltaT.stop
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
        context.startEnvironment.setProperty(DynamicTickInput.DELTA_T, deltaT.elapsed(TimeUnit.MILLISECONDS))
        if (deltaT.running) deltaT.stop
        offTime.start
        fire = false
        val success = context.controller.performInternalStep
        if (success && !async) {
            prepareSleep
        }
        return success
    }
    
    override supportsStepping() {
        return true
    }
    
    override timerExpired() {
        if (fire) {
            step()
        }
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (async && ctx !== null && ctx.mode == this) {
            if (e instanceof SimulationControlEvent) {
                if (e.operation == SimulationOperation.STEP) {
                    prepareSleep
                }
            }
        }
    }
    
    private def prepareSleep() {
        // Read SleepT
        val entry = context.dataPool.entries.get(DynamicTicks.SLEEP_T)
        if (entry !== null && entry.rawValue !== null && entry.rawValue.isJsonPrimitive && entry.rawValue.asJsonPrimitive.isNumber) {
            sleepT = DynamicTicks.sleepTtoMilliseconds(entry.rawValue.asJsonPrimitive.asNumber)
        }
        
        val off = offTime.elapsed(TimeUnit.MILLISECONDS)
        offTime.reset
        deltaT.reset
        if (playing) deltaT.start
        
        remainingTime.set(sleepT - off)
        fire = true
    }
    
    def double getDeltaT() {
        return deltaT.elapsed(TimeUnit.MILLISECONDS) as double / 1000
    }
    
    def double getSleepT() {
        return sleepT as double / 1000
    }
    
}