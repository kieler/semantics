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
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGenerator

/**
 * Java Code Processor
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class JavaCodeGenerator extends CCodeGenerator {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.java"
    }
    
    override getName() {
        "Java Code"
    }
    
    override SCGCodeGeneratorModule createCodeGenetatorModule() {
        return injector.getInstance(JavaCodeGeneratorModule)
    }
}

