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
package de.cau.cs.kieler.scg.processors.codegen.python

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorResetModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions

import static de.cau.cs.kieler.kicool.compilation.VariableStore.*

/**
 * Python Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author als
 * 
 */
class PythonCodeGeneratorResetModule extends CCodeGeneratorResetModule {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject PythonCodeGeneratorStructModule struct
    @Inject PythonCodeSerializeHRExtensions pythonSerializer
    
    override configure() {
        struct = (parent as PythonCodeGeneratorModule).struct as PythonCodeGeneratorStructModule
    }    
    
    override generateInit() {
        indent(1)
        code.append("def ").append(getName).append("(self):\n")
    }
    
    override generate() {
        indent(2) 
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.GO_GUARD_NAME).append(" = True\n")
        indent(2)
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.TERM_GUARD_NAME).append(" = False\n")
        
        generateResetSCGVariables(pythonSerializer)
        
        generateVariableStoreResetVariables
    }    
    
    override generateDone() {
        indent(0)
        code.append("\n")
    }
    
    override generateResetSCGVariables(extension CCodeSerializeHRExtensions serializer) {
        val resetSCG = moduleObject.nodes.findFirst[ it instanceof Entry ].asEntry.resetSCG
        if (resetSCG === null) return;
        
        var node = resetSCG.nodes.head.asEntry.next.target
        while (!(node instanceof Exit)) {
            indent(2)
            code.append(node.serializeHR).append("\n")  
            
            node = node.asNode.allNext.map[target].head
        }
    }    
 
    override generateVariableStoreResetVariables() {
        val variableStore = VariableStore.getVariableStore(processorInstance.environment)
        
        for (vk : variableStore.variables.keySet) {
            if (variableStore.variables.get(vk).exists[ properties.contains(RESET) ]) {
                indent(2)
                code.append(struct.getVariableName).append(struct.separator).append(vk).append(" = False\n")
            }
        }
    }
    
}