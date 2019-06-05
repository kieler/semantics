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
package de.cau.cs.kieler.scg.processors.codegen.prio.c

import com.google.inject.Inject
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorStructModule
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Java Code Generator Struct Module
 * 
 * Handles the creation of the data struct.
 * 
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 * 
 */
class CPrioCodeGeneratorStructModule extends CCodeGeneratorStructModule {
    
    @Accessors @Inject CPrioCodeSerializeHRExtensions CPrioserializer
    
    override configure() {
        serializer = CPrioserializer
    }     
    
    override protected separator() {
        "->"
    } 
    
    override generateInit() {
        code.append("#define false 0\n")
        code.append("#define true 1\n")
        code.append("typedef int bool;\n\n")
        
        super.generateInit
    }
}