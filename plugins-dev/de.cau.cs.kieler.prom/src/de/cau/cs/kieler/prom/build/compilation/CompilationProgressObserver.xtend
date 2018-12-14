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
package de.cau.cs.kieler.prom.build.compilation

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.prom.console.PromConsole
import java.util.Observable
import java.util.Observer
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IFile
import de.cau.cs.kieler.prom.console.ConsoleStyle

/**
 * Updates a progress monitor to show progress of a KiCo compilation.
 * 
 * @author aas
 *
 */
class CompilationProgressObserver implements Observer {
    /**
     * The monitor
     */
    var IProgressMonitor monitor
    /**
     * The file that is compiled
     */
    var IFile compiledFile
    
    /**
     * The start times of the different compilation phases
     */
    val startTimeMap = <String, Long> newHashMap
    /**
     * The duration of the different compilation phases
     */
    val durationTimeMap = <String, Long> newHashMap
    
    /**
     * Constructor
     * 
     * @param monitor The monitor
     * @param compiledFile The file that is compiled
     */
    new(IProgressMonitor monitor, IFile compiledFile) {
        this.monitor = monitor
        this.compiledFile = compiledFile
    }
    
    /**
     * Updates the monitor
     */
    override update(Observable o, Object arg) {
        val context = o as CompilationContext
        if(context === null
           || monitor === null
           || compiledFile === null
           || !(arg instanceof AbstractProcessorNotification)) {
            return
        }
        val processorNotification = arg as AbstractProcessorNotification
        // Cancel the build if requested
        if(monitor.canceled) {
            PromConsole.buildConsole.info("Build canceled by the user")
            // Cancel all processors
            for(processor : context.processorInstancesSequence) {
                processor.cancelCompilation
            }
        }
        // Show progress of compilation
        val currentProcessor = processorNotification.processorInstance
        val currentProcessorIndex = context.processorInstancesSequence.indexOf(currentProcessor)
        val processorCount = context.processorInstancesSequence.size
        switch(processorNotification) {
            ProcessorStart : {
                // Show the progress in the monitor
                monitor.subTask("Compiling '"+compiledFile.name+"' \n"
                              + "Starting processor "+(currentProcessorIndex+1)+"/"+processorCount+": "
                              + "'"+currentProcessor.name+"'")
                startTimeMap.put(currentProcessor.name, System.currentTimeMillis)
            }
            ProcessorFinished : {
                monitor.subTask("Compiling '"+compiledFile.name+"' \n"
                              + "Finished processor "+(currentProcessorIndex+1)+"/"+processorCount+": "
                              + "'"+currentProcessor.name+"'")
                // Check how long the processor took
                val startTime = startTimeMap.getOrDefault(currentProcessor.name, -1l)
                val duration = System.currentTimeMillis - startTime
                durationTimeMap.put(currentProcessor.name, duration)
                if(startTime > 0) {
//                    println("'"+currentProcessor.name + "' took " + duration + " ms")
                }
            }
        }
    }
}