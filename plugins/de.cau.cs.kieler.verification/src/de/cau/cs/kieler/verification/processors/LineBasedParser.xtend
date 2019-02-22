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
import java.io.FileReader
import java.io.StringReader
import org.eclipse.core.resources.IFile
import java.io.File
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
abstract class LineBasedParser {
    
    @Accessors private boolean stopParsing
    
    public def void parse(String text) {
        val reader = new BufferedReader(new StringReader(text))
        parse(reader)
    }
    
    public def void parse(File file) {
        val fileReader = new FileReader(file.absolutePath)
        val bufferedReader = new BufferedReader(fileReader)
        parse(bufferedReader)
    }
    
    public def void parse(IFile file) {
        val fileReader = new FileReader(file.location.toOSString)
        val bufferedReader = new BufferedReader(fileReader)
        parse(bufferedReader)
    }
    
    public def void parse(BufferedReader reader) {
        var line = reader.readLine()
        while(line !== null && !stopParsing) {
            parseLine(line)
            line = reader.readLine()
        }
    }
    
    abstract protected def void parseLine(String line)
}