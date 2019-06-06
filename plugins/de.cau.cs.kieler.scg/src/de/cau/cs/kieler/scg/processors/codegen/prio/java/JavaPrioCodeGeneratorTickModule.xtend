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

import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorTickModule
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.annotations.IntAnnotation
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorLogicModule
import de.cau.cs.kieler.scg.processors.codegen.prio.c.CPrioCodeGeneratorTickModule
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData

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
class JavaPrioCodeGeneratorTickModule extends CPrioCodeGeneratorTickModule {
    
    @Inject extension AnnotationsExtensions
    @Inject extension JavaPrioCodeSerializeHRExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGControlFlowExtensions      
    
    @Accessors @Inject JavaPrioCodeSerializeHRExtensions javaSerializer
    
    @Accessors var JavaPrioCodeGeneratorStructModule struct
    @Accessors var JavaPrioCodeGeneratorLogicModule logic
    @Accessors var JavaPrioCodeGeneratorModule module
    
    override configure() {
        struct = (parent as JavaPrioCodeGeneratorModule).struct as JavaPrioCodeGeneratorStructModule
        logic = (parent as JavaPrioCodeGeneratorModule).logic as JavaPrioCodeGeneratorLogicModule
        module = parent as JavaPrioCodeGeneratorModule
    }    
    
    override generateInit() {
        code.appendInd("@Override\n")
        code.appendInd("public void ").append(getName)
        code.append("()")
        code.append(" {\n")
        
        incIndentation
        code.appendInd("setupTick();\n")
        code.appendInd("while (!isTickDone()) {\n")
        incIndentation
        code.appendInd("switch (state()) {\n")
        incIndentation
        struct.initialState = module.programName + "Entry"
        struct.states.add(struct.initialState)
        code.appendInd("case " + module.programName + "Entry: \n")
        incIndentation
        
        // Start translation of the first node
        val head = scg.nodes.filter(Entry).head
        struct.startPriority = (head.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                        as IntAnnotation).value        
    }
    
    override generate() {

    }
    
    override generateDone() {
        decIndentation
        code.appendInd("}\n")
        decIndentation
        code.appendInd("}\n")
        decIndentation
        code.appendInd("}\n")
        decIndentation
        code.appendInd("}\n")
    }
    
}