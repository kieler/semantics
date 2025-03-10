/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.python

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator

/**
 * Python Code Processor
 * 
 * @author als
 * 
 */
class PythonCodeGenerator extends CCodeGenerator {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.python"
    }
    
    override getName() {
        "Python Code"
    }
    
    override SCGCodeGeneratorModule createCodeGeneratorModule() {
        return injector.getInstance(PythonCodeGeneratorModule)
    }
}

