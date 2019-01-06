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

import java.io.BufferedReader
import java.io.StringReader
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * @author aas
 */
class NuxmvOutputInterpreter {
    
    @Accessors(PUBLIC_GETTER) private List<NuxmvCounterexample> counterexamples = newArrayList
    @Accessors(PUBLIC_GETTER) private List<String> passedSpecs = newArrayList
    
    BufferedReader reader
    String currentLine
    NuxmvCounterexample currentCounterexample
    NuxmvCounterexampleState currentCounterexampleState
    ParseTarget parseTarget = ParseTarget.SPEC_RESULT
    
    static val specificationCommentText = "-- specification"
    static val invariantCommentText = "-- invariant"
    static val isTrueText = "is true"
    static val isFalseText = "is false"
    static val stateStartText = "-> State:"
    static val stateEndText = "<-"
    static val variableAssignmentRegex = "[a-zA-Z_][a-zA-Z_0-9]*\\s*=\\s*[a-zA-Z_0-9.-]*"
    
    private enum ParseTarget {
        SPEC_RESULT,
        COUNTEREXAMPLE
    }
    
    new(String processOutput) {
        if(processOutput.isNullOrEmpty) {
            throw new Exception("nuXmv process returned nothing")
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
        var int specificationNameStart = -1
        var int specificationNameEnd = -1
        if(trimmedLine.startsWith(specificationCommentText)) {
            specificationNameStart = specificationCommentText.length
        }
        if(trimmedLine.startsWith(invariantCommentText)) {
            specificationNameStart = invariantCommentText.length
        }
        if(specificationNameStart >= 0) {
            // a specification result can also be the end of a counterexample
            parseTarget = ParseTarget.SPEC_RESULT
            currentCounterexample = null
            currentCounterexampleState = null
            if(trimmedLine.endsWith(isTrueText)) {
                specificationNameEnd = trimmedLine.length - isTrueText.length
                val spec = trimmedLine.substring(specificationNameStart, specificationNameEnd)
                passedSpecs.add(spec)
            } else if(trimmedLine.endsWith(isFalseText)) {
                specificationNameEnd = trimmedLine.length - isFalseText.length
                val spec = trimmedLine.substring(specificationNameStart, specificationNameEnd)
                readNextLine()
                // this specification does not hold, so prepare for counterexample
                currentCounterexample = new NuxmvCounterexample(spec)
                counterexamples.add(currentCounterexample)
                parseTarget = ParseTarget.COUNTEREXAMPLE
            }
        } else if (parseTarget == ParseTarget.COUNTEREXAMPLE) {
            // Find the start of the next state
            if(trimmedLine.startsWith(stateStartText) && trimmedLine.endsWith(stateEndText)) {
                currentCounterexampleState = new NuxmvCounterexampleState()
                currentCounterexample.states.add(currentCounterexampleState)
            } else if(trimmedLine.matches(variableAssignmentRegex)) {
                // Add this variable assignment to the current counterexample state
                val variable = trimmedLine.substring(0, trimmedLine.indexOf('=')).trim
                val expression = trimmedLine.substring(trimmedLine.indexOf('=')+1, trimmedLine.length).trim
                currentCounterexampleState.variableMappings.put(variable, expression)
            }
        }
    }
    
    private def void readNextLine() {
        currentLine = reader.readLine()
    }
    
    public def List<String> getFailedSpecs() {
        return counterexamples.map[it.spec].toList
    }
    
    public static class NuxmvCounterexample {
        @Accessors(PUBLIC_GETTER) private val String spec
        private val states = <NuxmvCounterexampleState>newArrayList
         
        new(String spec) {
            this.spec = spec
        }
        
        public def String getKtrace(VariableStore store) {
            val sb = new StringBuilder()
            for(state : states) {
                var inputVariableMapping = ""
                var outputVariableMapping = ""
                for(variableMapping : state.variableMappings.entrySet) {
                    val variable = variableMapping.key
                    val expression = variableMapping.value
                    if(variable.isInput(store)) {
                        inputVariableMapping += '''«variable» = «expression.toKtraceExpression» '''
                    }
                    if(variable.isOutput(store)) {
                        outputVariableMapping += '''«variable» = «expression.toKtraceExpression» '''
                    }
                }
                sb.append(inputVariableMapping)
                if(!outputVariableMapping.isNullOrEmpty) {
                    sb.append("=> ").append(outputVariableMapping)
                }
                sb.append(";")
            }
            return sb.toString
        }
        
        private static def String toKtraceExpression(String exp) {
            return exp.replace("FALSE","false").replace("TRUE","true").replace("|","||").replace("&","&&")
        }
        
        private static def boolean isInput(String variable, VariableStore store) {
            return store?.variables?.get(variable)?.head?.isInput
        }
        
        private static def boolean isOutput(String variable, VariableStore store) {
            return store?.variables?.get(variable)?.head?.isOutput
        }
    }
    
    private static class NuxmvCounterexampleState {
        private val variableMappings = <String,String>newHashMap
    }
}
