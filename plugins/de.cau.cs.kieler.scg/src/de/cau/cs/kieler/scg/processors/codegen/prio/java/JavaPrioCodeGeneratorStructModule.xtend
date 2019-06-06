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
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import de.cau.cs.kieler.scg.processors.codegen.java.JavaCodeGeneratorStructModule
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions

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
class JavaPrioCodeGeneratorStructModule extends JavaCodeGeneratorStructModule {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Accessors @Inject JavaPrioCodeSerializeHRExtensions javaPrioSerializer
    
    @Accessors var List<String> states = <String> newLinkedList
    @Accessors var String initialState
    @Accessors var int startPriority
    @Accessors var int maxPriority
    
    override configure() {
        serializer = javaPrioSerializer
    }     
    
    override protected separator() {
        ""
    } 
    
    override generateInit() {
        super.generateInit()
    }
    
    override generateDone() {
        addStates
        
        val superCall = "  super(State." + initialState + ", " + startPriority + ", " + maxPriority + ");\n";
        createConstructor(scg.declarations, (parent as JavaPrioCodeGeneratorModule).getProgramName, 
            superCall, serializer
        )
    }    
    
    protected def void addStates() {
        code.appendInd("public static enum State {\n")
        incIndentation
        for(state : states) {
            code.appendInd(state)
            if(!states.last.equals(state)) {
                code.append(", ")
            }
            code.append("\n")
        }
        decIndentation
        code.appendInd("}\n")
    }    
    

    
}