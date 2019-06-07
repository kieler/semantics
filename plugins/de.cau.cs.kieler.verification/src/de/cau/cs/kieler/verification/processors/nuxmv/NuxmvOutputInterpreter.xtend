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
 package de.cau.cs.kieler.verification.processors.nuxmv

import de.cau.cs.kieler.verification.VerificationPropertyCounterexample
import de.cau.cs.kieler.verification.codegen.SmvCodeGeneratorExtensions
import de.cau.cs.kieler.verification.processors.LineBasedParser
import java.util.List
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
class NuxmvOutputInterpreter extends LineBasedParser {
    
    @Accessors(PUBLIC_GETTER) private val List<NuxmvCounterexample> counterexamples = newArrayList
    @Accessors(PUBLIC_GETTER) private val List<String> passedSpecs = newArrayList
    
    private NuxmvCounterexample currentCounterexample
    private ParseTarget parseTarget = ParseTarget.SPEC_RESULT

    private static val SPECIFICATION_RESULT_PATTERN = Pattern.compile('''.*-- (Property|LTL specification|specification|invariant) (.*) is (true|false).*''')
    private static val STATE_PATTERN = Pattern.compile('''.*-> State:(.*)<-''')
    private static val VARIABLE_ASSIGNMENT_PATTERN = Pattern.compile('''([a-zA-Z_][a-zA-Z_0-9]*)\s*=\s*([a-zA-Z_0-9.-]*)''')
    private static val LOOP_START_PATTERN = Pattern.compile('''.*-- Loop starts here''')
    private static val ISSUE_IN_FILE_PATTERN = Pattern.compile('''(.*)file(.*): line (\d+):(.*)''')
    private static val TERMINATED_BY_SIGNAL_PATTERN = Pattern.compile('''.*nuXmv terminated by a signal''')
    
    private var boolean parseCounterexamples = true
    
    private enum ParseTarget {
        SPEC_RESULT,
        COUNTEREXAMPLE
    }
    
    new(String processOutput, boolean parseCounterexamples) {
        if(processOutput.isNullOrEmpty) {
            throw new Exception("nuXmv output is empty")
        }
        this.parseCounterexamples = parseCounterexamples
        parse(processOutput)
    }
    
    override parseLine(String line) {
        val trimmedLine = line.trim
        
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
            
            val formula = specificationResultMatcher.group(2)
            val trueOrFalse = specificationResultMatcher.group(3)
            if(trueOrFalse == "true") {
                passedSpecs.add(formula)
            } else if(trueOrFalse == "false") {
                currentCounterexample = new NuxmvCounterexample(formula)
                counterexamples.add(currentCounterexample)
                parseTarget = ParseTarget.COUNTEREXAMPLE
            } else {
                // This should never happen
                throw new Exception('''Inconsistent specification result state (expected true or false, but got line: «line»)''')
            }
        } else if (parseCounterexamples && parseTarget == ParseTarget.COUNTEREXAMPLE) {
            // Find the start of the next state
            val stateMatcher = STATE_PATTERN.matcher(trimmedLine)
            if(stateMatcher.matches) {
                currentCounterexample.createNextState
            } else {
                val variableAssignmentMatcher = VARIABLE_ASSIGNMENT_PATTERN.matcher(trimmedLine)
                if(variableAssignmentMatcher.matches) {
                    // Add this variable assignment to the current counterexample state
                    val variable = variableAssignmentMatcher.group(1)
                    val expression = variableAssignmentMatcher.group(2)
                    currentCounterexample.currentState.variableMappings.put(variable, expression)
                } else {
                    val loopStartMatcher = LOOP_START_PATTERN.matcher(trimmedLine)
                    if(loopStartMatcher.matches) {
                        // From the NuSMV manual:
                        // " In the case of a looping trace, if the next state to be printed is the same
                        // as the last state in the trace,
                        // a line is printed stating that this is the point where the loop begins. "
                        // --> first and last state of loop are the same. Thus loop in ktrace must start one tick later.
                        // --> The state after the next starts the loop in the ktrace.
                        currentCounterexample.loopStartStateIndex = currentCounterexample.size+1 
                    }
                }
            }
        }
    }
    
    public def List<String> getFailedSpecs() {
        return counterexamples.map[it.spec].toList
    }
    
    public static class NuxmvCounterexample extends VerificationPropertyCounterexample{
    
        new(String spec) {
            super(spec)
        }
        
        override toKExpression(String exp) {
            return SmvCodeGeneratorExtensions.toKExpression(exp)
        }
    }
}
