/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions

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
class StatebasedCCodeGeneratorResetModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension SCChartsStateExtensions
    
    static val RESET_NAME = "reset"
    
    @Inject StatebasedCCodeGeneratorStructModule struct
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
    }    
    
    def getName() {
        RESET_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append(" *").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
        
//        indent 
//        code.append(struct.getVariableName).append("->").append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = 1;\n")
//        indent
//        code.append(struct.getVariableName).append("->").append(AbstractGuardTransformation.TERM_GUARD_NAME).append(" = 0;\n")
    }
    
    override generate() {
        for (cfr : struct.rootRegions) {
            var prefix = StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME
            prefix += "->"
            prefix += struct.getRegionName(cfr)
            prefix += "."
             
            setInterface(prefix, cfr)
            
            code.append("  ")
            code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
            code.append("->")
            code.append(struct.getRegionName(cfr))
            code.append(".")
            code.append(StatebasedCCodeGeneratorStructModule.REGION_ACTIVE_STATE)
            code.append(" = ")
            code.append(struct.getStateName(cfr.states.filter[ initial ].head))
            code.append(";\n")
        }
    }
    
    override generateDone() {
        code.append("}\n")
    }
    
    protected def void setInterface(String prefix, ControlflowRegion cfr) {
        code.append("  ")
        code.append(prefix)
        code.append(StatebasedCCodeGeneratorStructModule.REGION_INTERFACE_NAME)
        code.append(" = &(")
        code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
        code.append("->")
        code.append(StatebasedCCodeGeneratorStructModule.REGION_INTERFACE_NAME)
        code.append(");\n")
        
        val hierarchicalStates = cfr.states.filter[ isHierarchical ]
        for (cfr2 : hierarchicalStates.map[ regions ].flatten.filter(ControlflowRegion)) {
            var prefix2 = prefix
            prefix2 += struct.getRegionName(cfr2) 
            prefix2 += "."
            setInterface(prefix2, cfr2)
        }
    }
    
    
}