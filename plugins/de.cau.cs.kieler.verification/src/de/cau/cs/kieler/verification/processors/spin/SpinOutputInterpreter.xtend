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

import de.cau.cs.kieler.verification.processors.LineBasedParser
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
class SpinOutputInterpreter extends LineBasedParser {
    
    @Accessors(PUBLIC_GETTER) private boolean wroteTrail
    
    private static val WROTE_TRAIL_PATTERN = Pattern.compile('''.*wrote (.*)\.pml\.trail*''')
    private static val ERROR_PATTERN = Pattern.compile('''.*error:.*''', Pattern.CASE_INSENSITIVE)
    
    new(String processOutput) {
        if(processOutput.isNullOrEmpty) {
            throw new Exception("spin output is empty")
        }
        parse(processOutput)
    }
    
    override parseLine(String line) {
        val trimmedLine = line.trim
        
        // TODO: check that "never claim" has + when checking ltl formula
        
        if(!wroteTrail) {
            val wroteTrailMatcher = WROTE_TRAIL_PATTERN.matcher(trimmedLine)
            if(wroteTrailMatcher.matches) {
                wroteTrail = true
            } else {
                val errorMatcher = ERROR_PATTERN.matcher(trimmedLine)
                if(errorMatcher.matches) {
                    throw new Exception(line)
                }    
            }
        }
    }
}
