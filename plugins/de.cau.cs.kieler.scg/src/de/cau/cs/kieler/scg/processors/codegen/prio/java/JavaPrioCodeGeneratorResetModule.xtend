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

import de.cau.cs.kieler.scg.processors.codegen.prio.c.CPrioCodeGeneratorResetModule

/**
 * Java Prio Code Generator Reset Module
 * Migrated from SJTransformation
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2019-06-09 proposed 
 * @kieler.rating 2019-06-09 proposed yellow 
 * 
 */
class JavaPrioCodeGeneratorResetModule extends CPrioCodeGeneratorResetModule {
    
    override generateInit() {
        code.appendInd("public void ").append(getName)
        code.append("()")
        
        code.append(" {")
    }    
    
    override generate() {}
    
    override generateDone() {
        code.append("}\n")
    }
        
}