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
package de.cau.cs.kieler.kicool.compilation

import java.io.File
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A container for executable files including the correct way to start it.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@FinalFieldsConstructor
class ExecutableContainer {
    
    @Accessors
    val File file
    @Accessors(PUBLIC_GETTER)
    protected var boolean isExecutableFile = true
    
    def getProcessBuilder() {
        new ProcessBuilder(file.toString)
    }
    
}

class ExecutableJarContainer extends ExecutableContainer {
    
    new(File file) {
        super(file)
        isExecutableFile = false
    }
    
    override getProcessBuilder() {
        var jarPath = file.toString
        if (jarPath.contains(" ")) jarPath = "\"" + jarPath + "\""
        new ProcessBuilder("java", "-jar", jarPath)
    }  
}