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

import com.google.common.base.Stopwatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicLong
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class TimedSimulationMode extends SimulationMode {
    
    protected var TimedSimulationModeCountDown countDown
    protected var remainingTime = new AtomicLong(0)
    
    override start(boolean async) {
        countDown = new TimedSimulationModeCountDown(this)
        countDown.start
    }
    
    override stop() {
        countDown?.interrupt
    }
    
    def getRemainingTime() {
        remainingTime.get
    }
    
    abstract def void timerExpired();

}

@FinalFieldsConstructor
class TimedSimulationModeCountDown extends Thread {
    
    public static val long SLEEP_MSEC = 50
    val TimedSimulationMode mode
    
    override run() {
        name = this.class.simpleName
        val stopwatch = Stopwatch.createUnstarted
        while (mode.context.running) {
            // work, sleep and loop
            try {
                if (mode.playing) {
                    var time = mode.remainingTime.get
                    if (time > 0) {
                        time = mode.remainingTime.addAndGet(-stopwatch.elapsed(TimeUnit.MILLISECONDS))
                    }
                    if (time <= 0) {
                        mode.timerExpired
                    }
                    stopwatch.reset
                    stopwatch.start
                } else if (stopwatch.running) {
                    stopwatch.reset
                }
                Thread.sleep(SLEEP_MSEC)
            } catch (InterruptedException ie) {
                // stop
                return
            }
        }
    }
}