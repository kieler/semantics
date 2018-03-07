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
package de.cau.cs.kieler.sccharts.prom.interpreter

import com.google.common.io.Files
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.handlers.DefaultSimulator
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SCChartsInterpreter extends DefaultSimulator {
    
    /**
     * The path to the model.
     * This can be an absolute file system path, an absolute path in the workspace
     * or a project relative path. For a project relative path, the configuration file must be in the same project as the executable. 
     */
    public val modelPath = new ConfigurableAttribute("file", null, #[String])
    
    /** 
     * The file handle to be interpreted
     */
    @Accessors
    private var IFile modelFileHandle
    
    /**
     * The name of the model in the simulation.
     */
    private var String modelName
    
    private var SCCharts sccharts
    
    private val List<SCChartInterpreter> scchartInterpreters = newArrayList
    
    /**
     * The operation of this data handler
     */
    public val operation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[operation]
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize(DataPool pool) {
        // Load the model
        sccharts = ModelImporter.load(modelFile) as SCCharts
        if(sccharts === null) {
            throw new Exception("Cannot load scchart from file '"+modelPath.stringValue+"'")
        }
        // Prepare interpretation
        for(rootState : sccharts.rootStates)  {
            val scchartInterpreter = new SCChartInterpreter(rootState)
            scchartInterpreters.add(scchartInterpreter)
        }
        // Create a model in the data pool
        modelName = getUniqueModelName(pool, Files.getNameWithoutExtension(modelFile.name))
        val model = new Model(modelName)
        val allVariables = scchartInterpreters.map[it.variables.map[it.clone]].flatten
        model.addAllVariables(allVariables)
        pool.addModel(model)
    }
    
    /**
     * Performs an interpretation step.
     */
    private def void write(DataPool pool) {
        // Set interpreter variables to the values in the pool
        val model = pool.findModel(modelName)
        for(interpreter : scchartInterpreters) {
            for(interpreterVariable : interpreter.variables) {
                val variable = model.getVariable(interpreterVariable.name)
                if(variable != null) {
                    interpreterVariable.value = variable.value 
                }
            }
        }
        // Perform tick
        for(interpreter : scchartInterpreters) {
            interpreter.tick()
        }
        // Update pool variables with values after tick
        for(interpreter : scchartInterpreters) {
            for(interpreterVariable : interpreter.variables) {
                val variable = model.getVariable(interpreterVariable.name)
                if(variable != null) {
                    variable.value = interpreterVariable.value 
                }
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "scc"
    }
    
    /**
     * Returns the model file handle, possibly loaded from the model path of the configuration.
     * 
     * @return the file handle of the model, or null if none
     */
    private def IFile getModelFile() {
        if(modelFileHandle == null && modelPath.isDefined) {
            modelFileHandle = getIFile(modelPath.stringValue)
        }
        return modelFileHandle
    }
}