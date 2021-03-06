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
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.inject.Inject
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorResetModule
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions

import static de.cau.cs.kieler.kicool.compilation.VariableStore.*
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/**
 * Java Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 * 
 */
class JavaCodeGeneratorResetModule extends CCodeGeneratorResetModule {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject JavaCodeGeneratorStructModule struct
    @Inject JavaCodeSerializeHRExtensions javaSerializer
    
    override configure() {
        struct = (parent as JavaCodeGeneratorModule).struct as JavaCodeGeneratorStructModule
    }    
    
    override generateInit() {
        indent
        code.append("public void ").append(getName)
        code.append("(")
        code.append(")")
        
        code.append(" {\n")
    }
    
    override generate() {
        indent(2) 
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.GO_GUARD_NAME).append(" = true;\n")
        indent(2)
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.TERM_GUARD_NAME).append(" = false;\n")
        
        generateResetSCGVariables(javaSerializer)
        
        generateVariableStoreResetVariables
    }    
    
    override generateDone() {
        indent
        code.append("}\n")
    }
    
    override generateResetSCGVariables(extension CCodeSerializeHRExtensions serializer) {
        val resetSCG = moduleObject.nodes.findFirst[ it instanceof Entry ].asEntry.resetSCG
        if (resetSCG === null) return;
        
        var node = resetSCG.nodes.head.asEntry.next.target
        while (!(node instanceof Exit)) {
            indent(2)
            code.append(node.serializeHR).append(";\n")  
            
            node = node.asNode.allNext.map[target].head
        }
    }    
 
    override generateVariableStoreResetVariables() {
        val variableStore = VariableStore.getVariableStore(processorInstance.environment)
        
        for (vk : variableStore.variables.keySet) {
            if (variableStore.variables.get(vk).exists[ properties.contains(RESET) ]) {
                indent(2)
                code.append(struct.getVariableName).append(struct.separator).append(vk).append(" = false;\n")
            }
        }
    }
    
}