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

import java.io.BufferedReader
import java.io.StringReader

/**
 * @author aas
 */
abstract class LineBasedParser {
    
    protected def void parse(String text) {
        val reader = new BufferedReader(new StringReader(text))
        parse(reader)
    }
    
    private def void parse(BufferedReader reader) {
        var line = reader.readLine()
        while(line !== null) {
            parseLine(line)
            line = reader.readLine()
        }
    }
    
    abstract protected def void parseLine(String line)
}