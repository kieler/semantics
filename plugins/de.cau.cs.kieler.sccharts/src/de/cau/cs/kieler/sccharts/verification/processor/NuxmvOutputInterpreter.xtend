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

/**
 * @author aas
 */
class NuxmvOutputInterpreter {
    
    @Accessors(PUBLIC_GETTER) private List<Counterexample> counterexamples = newArrayList
    @Accessors(PUBLIC_GETTER) private List<String> passedSpecs = newArrayList
    
    BufferedReader reader
    String currentLine
    boolean skipReadNextLine
    
    static val specificationCommentText = "-- specification"
    static val invariantCommentText = "-- invariant"
    static val isTrueText = "is true"
    static val isFalseText = "is false"
        
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
            if(skipReadNextLine) {
                skipReadNextLine = false
            } else {
                readNextLine()
            }
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
            if(trimmedLine.endsWith(isTrueText)) {
                specificationNameEnd = trimmedLine.length - isTrueText.length
                val spec = trimmedLine.substring(specificationNameStart, specificationNameEnd)
                passedSpecs.add(spec)
            } else if(trimmedLine.endsWith(isFalseText)) {
                specificationNameEnd = trimmedLine.length - isFalseText.length
                val spec = trimmedLine.substring(specificationNameStart, specificationNameEnd)
                readNextLine()
                val counterexample = new Counterexample(spec)
                counterexamples.add(counterexample)
                parseFailedSpecCounterexample(counterexample)
            }
        }
    }
    
    private def void parseFailedSpecCounterexample(Counterexample counterexample) {
        val trimmedLine = currentLine.trim
        // Check for end of trace, which should be the start of the next specification result
        if(trimmedLine.startsWith(specificationCommentText) || trimmedLine.startsWith(invariantCommentText)) {
            if(trimmedLine.endsWith(isTrueText) || trimmedLine.endsWith(isFalseText)) {
                skipReadNextLine = true
                return
            }
        }
        counterexample.builder.append(trimmedLine).append("\n")
    }
    
    private def void readNextLine() {
        currentLine = reader.readLine()
    }
    
    public def List<String> getFailedSpecs() {
        return counterexamples.map[it.spec].toList
    }
    
    public static class Counterexample {
        @Accessors(PUBLIC_GETTER) private val String spec
        private val builder = new StringBuilder()
        
        new(String spec) {
            this.spec = spec
        }
        
        public def String getCode() {
            return builder.toString()
        }
    }
}
