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
package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.ExecutableContainerWrapper
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.simulation.internal.processor.CheckTrace
import de.cau.cs.kieler.simulation.internal.processor.ReadTrace
import de.cau.cs.kieler.simulation.internal.processor.TraceProcessor
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import java.io.PrintStream
import java.util.Collections
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate

import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension de.cau.cs.kieler.kicool.compilation.internal.ContextPopulation.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.SystemTransformation.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationContext extends CompilationContext implements SimulationControls, ExecutableContainerWrapper {

    public static val IProperty<Integer> REACTION_TIMEOUT_IN_SECONDS = 
        new Property<Integer>("de.cau.cs.kieler.simulation.timeout", 2)
    public static val IProperty<Integer> MAX_HISTORY_LENGTH = 
        new Property<Integer>("de.cau.cs.kieler.simulation.history.length", 100)
        
    public static val DEFAULT_SIMULATION_SYSTEM = "de.cau.cs.kieler.internal.simulation"
            
    @Delegate
    @Accessors
    val SimulationController controller
    @Accessors
    val SimulationHistory history = new SimulationHistory
    @Accessors
    val List<Simulatable> models = newArrayList
    @Accessors
    var PrintStream outputStream = System.out 
    @Accessors
    var PrintStream errorStream = System.err
    @Accessors
    val List<String> simulationPrintOutput = Collections.synchronizedList(<String>newArrayList)
    @Accessors(PUBLIC_GETTER)
    var DataPool dataPool = new DataPool
    val DataPool initialDataPool = dataPool
    @Accessors(PUBLIC_GETTER)
    var int stepNumber = 0

    new() {
        controller = new SimulationController(this)
        setUpSystem()
    }
    new(CompilationContext parentContext, Environment parentEnvironment) {
        this()
        startEnvironment.setProperty(Environment.PRECEEDING_COMPILATION_CONTEXT, parentContext)
        startEnvironment.copyProperties(parentEnvironment)
        setUpSystem()
    }
    
    private def setUpSystem() {
        startEnvironment.setProperty(INPLACE, false)        
        startEnvironment.setProperty(ONGOING_WORKING_COPY, false)
        startEnvironment.setProperty(ORIGINAL_MODEL, null)
        startEnvironment.setProperty(COMPILATION_CONTEXT, this)
        startEnvironment.setProperty(UNIQUE_NAME_CACHE_ENABLED, false)
        startEnvironment.setProperty(UNIQUE_NAME_CACHE, null)
        
        originalSystem = KiCoolRegistration.getSystemById(DEFAULT_SIMULATION_SYSTEM)
        transformSystem()
        originalModel = dataPool
        
        EnvironmentPropertyHolder.processEnvironmentConfig(startEnvironment, system.config)
    }
    
    def getSourceCompilationContext() {
        return startEnvironment.getProperty(Environment.PRECEEDING_COMPILATION_CONTEXT)
    }

    package def initialize() {
        history.maxLength = startEnvironment.getProperty(MAX_HISTORY_LENGTH)
    }
    
    package def resetState() {
        history.clear
        stepNumber = 0
        dataPool = initialDataPool
        
        TraceProcessor.resetTraceInformation(this)
    }    
    
    def addModel(Simulatable sim) {
        models.add(sim)
    }
    
    def getModels() {
        return models.unmodifiableView
    }

    def setTrace(Trace trace, boolean check, boolean allowLoops) {
        val root = system.processors as ProcessorGroup
        if (trace === null) {
            // Remove trace processors
            root.processors.removeIf[
                ReadTrace.ID.equals(id) || CheckTrace.ID.equals(id)
            ]
        } else {
            if (!root.processors.exists[ReadTrace.ID.equals(id)]) {
                // Add reader processor
                root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                    id = ReadTrace.ID
                ])
            }
            if (!root.processors.exists[CheckTrace.ID.equals(id)]) {
                // Add check processor
                root.processors.add(KiCoolFactory.eINSTANCE.createProcessorReference => [
                    id = CheckTrace.ID
                ])
            }
            TraceProcessor.prepareTraceInformation(this, trace, allowLoops)
            startEnvironment.setProperty(CheckTrace.MATCH, check)
        }
    }
    
    override compileAsynchronously() {
        throw new UnsupportedOperationException("SimulationContext does not support classical compilation!")
    }
    
    override compile() {
        throw new UnsupportedOperationException("SimulationContext does not support classical compilation!")
    }

    package def void performInternalStep() {
        populateContext
        originalModel = dataPool
        
        super.compile()
        
        stepNumber++
        if (stepNumber < 0) {
            throw new IllegalStateException("Interger overflow in step counter :(")
        }
        dataPool = processorInstancesSequence.last.targetModel as DataPool
        history.add(dataPool)
        
        if (hasErrors) {
            for (error : allErrors) {
                errorStream.println("Error in simulation: " + error.message)
            }
        }
    }
    
    override getExecutableContainer() {
        this.models.filter(SimulationModelWrapper).head?.executableContainer
    }
    
}