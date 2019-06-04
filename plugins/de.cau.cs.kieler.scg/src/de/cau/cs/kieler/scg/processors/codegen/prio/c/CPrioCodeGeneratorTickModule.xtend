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
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.annotations.IntAnnotation
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorLogicModule

/**
 * Java Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CPrioCodeGeneratorTickModule extends CCodeGeneratorTickModule {
    
    @Inject extension AnnotationsExtensions
    @Inject extension CPrioCodeSerializeHRExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGControlFlowExtensions      
    
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
            
       super.generateInit
       
       setNewCodeStringBuilder(pSB.append(code))        
    }
    
    override generate() {

    }
    
    override generateDone() {
        code.append("}\n")
    }
    
}