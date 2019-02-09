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
package de.cau.cs.kieler.verification

import de.cau.cs.kieler.kicool.compilation.VariableStore
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
public class VerificationPropertyCounterexample {
    @Accessors(PUBLIC_GETTER) private val String spec
    @Accessors private var int loopStartStateIndex = -1
    private val states = <VerificationPropertyCounterexampleState>newArrayList
    
    @Accessors VerificationPropertyCounterexampleState currentState
    
    private static val LOOP_START_KTRACE_LABEL_NAME = "loop_start"

    new () {
        spec = null
    }

    new(String spec) {
        this.spec = spec
    }
    
    public def String getKtrace(VariableStore store) {
        val sb = new StringBuilder()
        for(stateIndexPair : states.indexed) {
            val index = stateIndexPair.key
            val state = stateIndexPair.value
            var inputVariableMapping = ""
            var outputVariableMapping = ""
            for(variableMapping : state.variableMappings.entrySet) {
                val variable = variableMapping.key
                val expression = variableMapping.value
                if(variable.isInput(store)) {
                    inputVariableMapping += '''«variable» = «expression.toKExpression» '''
                }
                if(variable.isOutput(store)) {
                    outputVariableMapping += '''«variable» = «expression.toKExpression» '''
                }
            }
            
            if(loopStartStateIndex >= 0 && index == loopStartStateIndex) {
                sb.append('''«LOOP_START_KTRACE_LABEL_NAME»:''').append("\n")
            }
            sb.append(inputVariableMapping)
            if(!outputVariableMapping.isNullOrEmpty) {
                sb.append("=> ").append(outputVariableMapping)
            }
            if(loopStartStateIndex >= 0 && index == states.size - 1) {
                sb.append('''goto «LOOP_START_KTRACE_LABEL_NAME»''')
            }
            sb.append(";\n")
        }
        return sb.toString
    }
    
    public def VerificationPropertyCounterexampleState createNextState() {
        currentState = new VerificationPropertyCounterexampleState()
        states.add(currentState)
        return currentState
    }
    
    public def void setCurrentStateAsLoopStart() {
        loopStartStateIndex = states.size
    }
    
    public def int size() {
        return states.size
    }
    
    protected def String toKExpression(String exp) {
        return exp
    }
    
    private static def boolean isInput(String variable, VariableStore store) {
        return store?.variables?.get(variable)?.head?.isInput
    }
    
    private static def boolean isOutput(String variable, VariableStore store) {
        return store?.variables?.get(variable)?.head?.isOutput
    }
}
