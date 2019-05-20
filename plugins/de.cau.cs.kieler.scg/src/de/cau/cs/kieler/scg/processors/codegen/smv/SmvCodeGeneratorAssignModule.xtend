/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.smv

import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorAssignModule extends SmvCodeGeneratorModuleBase {

    override generateInit() {
    }
    
    override generate() {
        incIndentationLevel
        appendIndentedLine("ASSIGN")
        
        // Define _GO
        appendIndentedLine('''init(«GO_GUARD») := TRUE;''')
        appendIndentedLine('''next(«GO_GUARD») := FALSE;''')
        code.append("\n")
        // Define pre guards
        val smvCodeGeneratorModule = parent as SmvCodeGeneratorModule
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(SmvCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preVariableName = entry.key
                val origVariableName = smvCodeGeneratorModule.getOriginalVariableName(preVariableName)
                val initValue = if(variableInformation.type == ValueType.INT) "0" else "FALSE"
                appendIndentedLine('''init(«preVariableName») := «initValue»;''')
                appendIndentedLine('''next(«preVariableName») := «origVariableName»;''')
                code.append("\n")
            }
        }
    }

    override generateDone() {
    }
}
