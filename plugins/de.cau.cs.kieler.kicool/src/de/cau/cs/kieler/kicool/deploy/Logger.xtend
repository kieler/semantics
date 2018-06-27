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
package de.cau.cs.kieler.kicool.deploy

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets
import java.io.UnsupportedEncodingException

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class Logger extends PrintStream {
    
    static val charset = StandardCharsets.UTF_8
    
    new() throws UnsupportedEncodingException {
        super(new ByteArrayOutputStream, true, charset.name)
    }
    
    def closeLog(String logFileName) {
        val cc = new CodeContainer => [add(logFileName, new String((this.out as ByteArrayOutputStream).toByteArray, charset))]
        this.out.close
        this.close
        return cc
    }  
}