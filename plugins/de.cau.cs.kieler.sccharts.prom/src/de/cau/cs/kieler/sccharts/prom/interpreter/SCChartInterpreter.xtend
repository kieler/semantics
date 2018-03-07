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

import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.templates.VariableInterfaceType
import java.util.Random

/**
 * @author aas
 *
 */
class SCChartInterpreter {
    extension static SCChartsStateExtensions scchartsStateExtensions = new SCChartsStateExtensions
    
    @Accessors
    private val State rootState
    @Accessors
    protected val List<Variable> variables = newArrayList
    @Accessors
    protected val Set<State> currentStates = newHashSet
    
    new(State rootState) {
        this.rootState = rootState
        // Set current states to initial states
        val initialStates = rootState.getInitialStates
        currentStates.addAll(initialStates)
        // Find variables
        val decls = rootState.eAllContents.filter(VariableDeclaration).toList
        for(decl : decls) {
            var Object simValue = getDefaultValue(decl)
            val interfaceTypes = VariableInterfaceType.getInterfaceTypes(decl.isInput, decl.isOutput, true)
            for(valuedObject : decl.valuedObjects) {
                val simVariable = new Variable(valuedObject.name, simValue)
                simVariable.interfaceTypes = interfaceTypes
                variables.add(simVariable)
            }
        }
    }
    
    private def Object getDefaultValue(VariableDeclaration decl) {
        switch(decl.type) {
            case BOOL: {
                return false
            }
            case DOUBLE: {
                return 0f
            }
            case FLOAT: {
                return 0f
            }
            case INT: {
                return 0
            }
            case STRING: {
                return ""
            }
            case UNSIGNED: {
                return 0
            }
            default: {
                return null
            }
        }
    }
    
    public def void tick() {
        // Add scchart logic here with state transitions and applying effects on the variables
        for(v : variables) {
            v.value = !(v.value == true)
        }
    }
}