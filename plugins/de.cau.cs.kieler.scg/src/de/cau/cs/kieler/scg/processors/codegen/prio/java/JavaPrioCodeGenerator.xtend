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
package de.cau.cs.kieler.scg.processors.codegen.prio.java

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator
import de.cau.cs.kieler.annotations.Pragmatable

/**
 * Java Prio Code Processor
 * Migrated from SJTransformation
 * 
 * @author ssm
 * @kieler.design 2019-06-09 proposed 
 * @kieler.rating 2019-06-09 proposed yellow 

 * 
 */
class JavaPrioCodeGenerator extends CCodeGenerator {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.prio.java"
    }
    
    override getName() {
        "Java Prio Code"
    }
    
    override SCGCodeGeneratorModule createCodeGeneratorModule() {
        return injector.getInstance(JavaPrioCodeGeneratorModule)
    }
    
    override processCustomNaming(Pragmatable pragmatable) {
        // Actually, we are in a class. Deactivate custom naming for now.
    }
}

