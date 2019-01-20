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
import java.util.List
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors

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

    private static val SPECIFICATION_RESULT_PATTERN = Pattern.compile("-- (specification|invariant) (.*) is (true|false)")
    private static val STATE_PATTERN = Pattern.compile("-> State:(.*)<-")
    private static val VARIABLE_ASSIGNMENT_PATTERN = Pattern.compile("([a-zA-Z_][a-zA-Z_0-9]*)\\s*=\\s*([a-zA-Z_0-9.-]*)")
    private static val LOOP_START_PATTERN = Pattern.compile("-- Loop starts here")
    private static val LOOP_START_KTRACE_LABEL_NAME = Pattern.compile("loop_start")
    private static val ISSUE_IN_FILE_PATTERN = Pattern.compile("(.*)file(.*): line (\\d+):(.*)")
    private static val TERMINATED_BY_SIGNAL_PATTERN = Pattern.compile("nuXmv terminated by a signal")
    
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
        
        val issueInFileMatcher = ISSUE_IN_FILE_PATTERN.matcher(trimmedLine)
        val terminatedBySignalMatcher = TERMINATED_BY_SIGNAL_PATTERN.matcher(trimmedLine)
        if(issueInFileMatcher.matches || terminatedBySignalMatcher.matches) {
            throw new Exception(trimmedLine)
        }
        
        val specificationResultMatcher = SPECIFICATION_RESULT_PATTERN.matcher(trimmedLine)
        if(specificationResultMatcher.matches) {
            // a specification result ends the last counterexample
            parseTarget = ParseTarget.SPEC_RESULT
            currentCounterexample = null
            currentCounterexampleState = null
            
            val formula =  specificationResultMatcher.group(2)
            val trueOrFalse = specificationResultMatcher.group(3)
            if(trueOrFalse == "true") {
                passedSpecs.add(formula)
            } else if(trueOrFalse == "false") {
                currentCounterexample = new NuxmvCounterexample(formula)
                counterexamples.add(currentCounterexample)
                parseTarget = ParseTarget.COUNTEREXAMPLE
            } else {
                // This should never happen
                throw new Exception("Inconsistent specification result state")
            }
        } else if (parseTarget == ParseTarget.COUNTEREXAMPLE) {
            // Find the start of the next state
            val stateMatcher = STATE_PATTERN.matcher(trimmedLine)
            if(stateMatcher.matches) {
                currentCounterexampleState = new NuxmvCounterexampleState()
                currentCounterexample.states.add(currentCounterexampleState)
            } else {
                val variableAssignmentMatcher = VARIABLE_ASSIGNMENT_PATTERN.matcher(trimmedLine)
                if(variableAssignmentMatcher.matches) {
                    // Add this variable assignment to the current counterexample state
                    val variable = variableAssignmentMatcher.group(1)
                    val expression = variableAssignmentMatcher.group(2)
                    currentCounterexampleState.variableMappings.put(variable, expression)    
                } else {
                    val loopStartMatcher = LOOP_START_PATTERN.matcher(trimmedLine)
                    if(loopStartMatcher.matches) {
                        // In the nuXmv output, the label is added before the state that starts the counterexample.
                        // Thus, the next state that will be created has to be prepended with the loop_start label in ktrace. 
                        currentCounterexample.loopStartStateIndex = currentCounterexample.states.size
                    }
                }
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
        private var int loopStartStateIndex = -1
        
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
        
        public def void loopStartState() {
            
        }
        
        private static def String toKExpression(String smvExpression) {
            // TODO: duplicate of SmvCodeGeneratorSpecificationModule.toKExpression, but cannot import from there
            return smvExpression.toString.replace("=", "==").replace("&","&&").replace("|","||")
                                     .replace("FALSE","false").replace("TRUE","true")
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
