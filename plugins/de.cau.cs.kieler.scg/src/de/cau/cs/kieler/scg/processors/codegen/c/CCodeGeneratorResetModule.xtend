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
package de.cau.cs.kieler.scg.processors.codegen.c

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import com.google.inject.Inject
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions

import static de.cau.cs.kieler.kicool.compilation.VariableStore.*
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.Exit
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/**
 * C Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class CCodeGeneratorResetModule extends SCGCodeGeneratorModule {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject CCodeGeneratorStructModule struct
    @Accessors @Inject CCodeSerializeHRExtensions serializer
    
    override configure() {
        struct = (parent as CCodeGeneratorModule).struct as CCodeGeneratorStructModule
    }    
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
    }
    
    override generate() {
        indent 
        code.append(struct.getVariableName).append("->").append(SimpleGuardExpressions.GO_GUARD_NAME).append(" = 1;\n")
        indent
        code.append(struct.getVariableName).append("->").append(SimpleGuardExpressions.TERM_GUARD_NAME).append(" = 0;\n")     
        
        generateResetSCGVariables(serializer)
        
        generateVariableStoreResetVariables   
    }
    
    override generateDone() {
        code.append("}\n")
    }
    
    protected def generateResetSCGVariables(extension CCodeSerializeHRExtensions serializer) {
        val resetSCG = moduleObject.nodes.findFirst[ it instanceof Entry ].asEntry.resetSCG
        if (resetSCG === null) return;
        
        valuedObjectPrefix = struct.getVariableName + struct.separator
        var node = resetSCG.nodes.head.asEntry.next.target
        while (!(node instanceof Exit)) {
            indent
            code.append(node.serializeHR).append(";\n")  
            
            node = node.asNode.allNext.map[target].head
        }
        valuedObjectPrefix = ""
    }
    
    protected def generateVariableStoreResetVariables() {
        val variableStore = VariableStore.getVariableStore(processorInstance.environment)
        
        for (vk : variableStore.variables.keySet) {
            if (variableStore.variables.get(vk).exists[ properties.contains(RESET) ]) {
                indent
                code.append(struct.getVariableName).append("->").append(vk).append(" = 0;\n")
            }
        }
    }
    
}