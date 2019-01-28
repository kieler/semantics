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
 package de.cau.cs.kieler.verification.processors

import de.cau.cs.kieler.kicool.compilation.VariableStore
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.verification.processors.SpinTrailInterpreter.SpinCounterexample

/**
 * @author aas
 */
class SpinTrailInterpreter extends LineBasedParser {
    
    @Accessors(PUBLIC_GETTER) private SpinCounterexample counterexample
    
    @Accessors(PUBLIC_GETTER) private String formulaName
    @Accessors(PUBLIC_GETTER) private String failedAssertion
    
    private SpinCounterexampleState currentCounterexampleState
    
    // TODO: duplicate of PromelaCodeGeneratorModuleBase but cannot import from there 
    private static val TICK_END_FLAG_NAME = "tickend"
    
    private static val LTL_SPEC_PATTERN = Pattern.compile('''ltl (.*): (.*)''')
    private static val FAILED_ASSERTION_PATTERN = Pattern.compile('''.*text of failed assertion: assert\((.*)\)''')
    private static val TICK_START_PATTERN = Pattern.compile('''.*\[«TICK_END_FLAG_NAME» = 0\]''')
    private static val TICK_END_PATTERN = Pattern.compile('''.*\[«TICK_END_FLAG_NAME» = 1\]''')
    private static val LOOP_START_PATTERN = Pattern.compile('''<<<<<START OF CYCLE>>>>>''')
    private static val VARIABLE_ASSIGNMENT_PATTERN = Pattern.compile('''.*\[([a-zA-Z_][a-zA-Z_0-9]*)\s*=\s*([a-zA-Z_0-9.-]*)\]''')
    
    new(String processOutput) {
        if(processOutput.isNullOrEmpty) {
            throw new Exception("spin trace is empty")
        }
        parse(processOutput)
    }
    
    override parseLine(String line) {
        val trimmedLine = line.trim
        
        // Get LTL formula from output
        if(formulaName === null) {
            val ltlSpecMatcher = LTL_SPEC_PATTERN.matcher(trimmedLine)
            if(ltlSpecMatcher.matches) {
                formulaName = ltlSpecMatcher.group(1)
            }   
        }
        
        // Get failed assertion from output
        if(failedAssertion === null) {
            val failedAssertionMatcher = FAILED_ASSERTION_PATTERN.matcher(trimmedLine)
            if(failedAssertionMatcher.matches) {
                failedAssertion = failedAssertionMatcher.group(1)
            }   
        }
        
        // Parse ticks
        val tickStartMatcher = TICK_START_PATTERN.matcher(trimmedLine)
        val tickEndMatcher = TICK_END_PATTERN.matcher(trimmedLine)
        if(tickStartMatcher.matches) {
            if(counterexample === null) {
                counterexample = new SpinCounterexample()
            }
            currentCounterexampleState = new SpinCounterexampleState
            counterexample.states.add(currentCounterexampleState)
        } else if(tickEndMatcher.matches) {
            currentCounterexampleState = null
        } else if(currentCounterexampleState !== null) {
            val variableAssignmentMatcher = VARIABLE_ASSIGNMENT_PATTERN.matcher(trimmedLine)
            if(variableAssignmentMatcher.matches) {
                val variable = variableAssignmentMatcher.group(1)
                val expression = variableAssignmentMatcher.group(2)
                currentCounterexampleState.variableMappings.put(variable, expression)
            }
        }
        
        // Find start of loop
        val loopStartMatcher = LOOP_START_PATTERN.matcher(trimmedLine)
        if(loopStartMatcher.matches) {
            val index = counterexample.states.size
            counterexample.loopStartStateIndex = index
        }
    }
    
    public static class SpinCounterexample {
        private val states = <SpinCounterexampleState>newArrayList
        private var int loopStartStateIndex = -1
        
        private static val LOOP_START_KTRACE_LABEL_NAME = "loop_start"
        
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
