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

import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorTickModule
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.IntAnnotation
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * C Prio Code Generator Tick Module
 * Migrated from SCLPTransformation
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2019-06-09 proposed 
 * @kieler.rating 2019-06-09 proposed yellow 
 * 
 */
class CPrioCodeGeneratorTickModule extends CCodeGeneratorTickModule {
    
    @Inject extension AnnotationsExtensions
    
    @Accessors @Inject CPrioCodeSerializeHRExtensions serializer
    
    override configure() {
        struct = (parent as CPrioCodeGeneratorModule).struct as CPrioCodeGeneratorStructModule
        logic = (parent as CPrioCodeGeneratorModule).logic as CPrioCodeGeneratorLogicModule
    }    
    
    override generateInit() {
        val maxPID = (scg.getAnnotation("maxPrioID") as IntAnnotation).value
        
        val pSB = new StringBuilder 
        
        pSB.append("#define _SC_NOTRACE\n")
           .append("#define _SC_NO_SIGNALS2VARS\n")
           .append("#define _SC_ID_MAX " + maxPID + "\n\n")
           .append("#include \"scl.h\"\n")
           .append("#include \"sc.h\"\n")
           .append("#include \"sc-generic.h\"\n\n")
            
        code.append("int ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
       
       setNewCodeStringBuilder(pSB.append(code))        
    }
    
    override generate() {

    }
    
    override generateDone() {
        code.appendInd("tickreturn();\n")
        code.append("}\n")
    }
    
}