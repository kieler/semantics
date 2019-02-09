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
 package de.cau.cs.kieler.verification.processors.spin

import de.cau.cs.kieler.scg.processors.transformators.codegen.promela.PromelaCodeGeneratorModuleBase
import de.cau.cs.kieler.verification.VerificationPropertyCounterexample
import de.cau.cs.kieler.verification.processors.LineBasedParser
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
class SpinTrailInterpreter extends LineBasedParser {
    
    @Accessors(PUBLIC_GETTER) private VerificationPropertyCounterexample counterexample
    
    @Accessors(PUBLIC_GETTER) private String formulaName
    @Accessors(PUBLIC_GETTER) private String failedAssertion
    
    private static val LTL_SPEC_PATTERN = Pattern.compile('''ltl (.*): (.*)''')
    private static val FAILED_ASSERTION_PATTERN = Pattern.compile('''.*text of failed assertion: assert\((.*)\)''')
    private static val TICK_START_PATTERN = Pattern.compile('''.*\[«PromelaCodeGeneratorModuleBase.TICK_END_FLAG_NAME» = 0\]''')
    private static val TICK_END_PATTERN = Pattern.compile('''.*\[«PromelaCodeGeneratorModuleBase.TICK_END_FLAG_NAME» = 1\]''')
    private static val LOOP_START_PATTERN = Pattern.compile('''.*<<<<<START OF CYCLE>>>>>''')
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
                counterexample = new VerificationPropertyCounterexample()
            }
            counterexample.createNextState
        } else if(tickEndMatcher.matches) {
            counterexample.currentState = null
        } else if(counterexample !== null && counterexample.currentState !== null) {
            val variableAssignmentMatcher = VARIABLE_ASSIGNMENT_PATTERN.matcher(trimmedLine)
            if(variableAssignmentMatcher.matches) {
                val variable = variableAssignmentMatcher.group(1)
                val expression = variableAssignmentMatcher.group(2)
                counterexample.currentState.variableMappings.put(variable, expression)
            }
        }
        
        // Find start of loop
        val loopStartMatcher = LOOP_START_PATTERN.matcher(trimmedLine)
        if(loopStartMatcher.matches) {
            // Next state starts the loop
            counterexample.loopStartStateIndex = counterexample.size
        }
    }
}
