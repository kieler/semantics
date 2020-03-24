/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing.processor

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.testing.SimulationResult
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.simulation.testing.TraceSimulation
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.util.List

/**
 * @author als
 */
class TraceSimulator extends Processor<SimulationContext, SimulationResult> {
    
    public static val ID = "de.cau.cs.kieler.simulation.testing.trace.sim"
    
    public static val IProperty<List<TraceFile>> TRACES = 
        new Property<List<TraceFile>>("de.cau.cs.kieler.simulation.testing.traces", null)
    
    override getId() {
        ID
    }
    
    override getName() {
        "Trace Simulator"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        // Prepare traces
        var Iterable<TraceFile> traces = getProperty(TRACES)
        if (traces === null && compilationContext.originalModel instanceof TestModelData) {
            val data = compilationContext.originalModel as TestModelData
            traces = data.tracePaths.filter[
                it.toFile.isFile && (it.fileName.toString.endsWith("eso") || it.fileName.toString.endsWith("ktrace"))
            ].map[
                TraceFileUtil.loadTraceFile(it.toFile)
            ]
        }
        
        // Run simulation
        if (traces !== null) {
            val runner = new TraceSimulation(model, traces)        
            model = runner.simulate()
        } else {
            model = new SimulationResult(model)
        }
    }
    
}