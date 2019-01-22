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
 package de.cau.cs.kieler.sccharts.verification.processor

import de.cau.cs.kieler.kicool.compilation.VariableStore
import java.io.BufferedReader
import java.io.StringReader
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
class SpinOutputInterpreter {
    
    @Accessors(PUBLIC_GETTER) SpinCounterexample counterexample
    @Accessors(PUBLIC_GETTER) String passedSpec
    
    BufferedReader reader
    String currentLine
    SpinCounterexample currentCounterexample
    SpinCounterexampleState currentCounterexampleState
    
    new(String processOutput) {
        if(processOutput.isNullOrEmpty) {
            throw new Exception("spin process returned nothing")
        }
        parse(processOutput)
    }
    
    private def void parse(String text) {
        reader = new BufferedReader(new StringReader(text))
        readNextLine()
        while(currentLine !== null) {
            parseCurrentLine()
            readNextLine()
        } 
    }
    
    private def void parseCurrentLine() {
        val trimmedLine = currentLine.trim
        
    }
    
    private def void readNextLine() {
        currentLine = reader.readLine()
    }
    
    public static class SpinCounterexample {
        @Accessors(PUBLIC_GETTER) private val String spec
        private val states = <SpinCounterexampleState>newArrayList
        private var int loopStartStateIndex = -1
        
        private static val LOOP_START_KTRACE_LABEL_NAME = "loop_start"
        
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
                        inputVariableMapping += '''«variable» = «expression» '''
                    }
                    if(variable.isOutput(store)) {
                        outputVariableMapping += '''«variable» = «expression» '''
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
        
        private static def boolean isInput(String variable, VariableStore store) {
            return store?.variables?.get(variable)?.head?.isInput
        }
        
        private static def boolean isOutput(String variable, VariableStore store) {
            return store?.variables?.get(variable)?.head?.isOutput
        }
    }
    
    private static class SpinCounterexampleState {
        private val variableMappings = <String,String>newHashMap
    }
}
