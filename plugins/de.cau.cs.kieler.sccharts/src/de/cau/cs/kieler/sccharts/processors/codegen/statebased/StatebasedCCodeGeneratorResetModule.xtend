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
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import static extension de.cau.cs.kieler.sccharts.processors.codegen.statebased.StatebasedCCodeGeneratorStructModule.*

/**
 * C Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
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
        code.add(
            "void ", getName, "(", struct.getName, " *", struct.getVariableName, ")"
        )
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.add(
            " {", NL
        )
    }
    
    override generate() {
        for (cfr : struct.rootRegions) {
            var prefix = STRUCT_VARIABLE_NAME
            prefix += "->"
            prefix += struct.getRegionName(cfr)
            prefix += "."
             
            setInterface(prefix, cfr)
            
            code.add(
                "  ", 
                STRUCT_VARIABLE_NAME,
                "->",
                struct.getRegionName(cfr),
                ".",
                REGION_ACTIVE_STATE,
                " = ",
                struct.getStateName(cfr.states.filter[ initial ].head),
                ";", NL
            )
        }
    }
    
    override generateDone() {
        code.add(
            "}", NL
        )
    }
    
    protected def void setInterface(String prefix, ControlflowRegion cfr) {
        code.add(
            "  ",
            prefix,
            REGION_INTERFACE_NAME,
            " = &(",
            STRUCT_VARIABLE_NAME,
            "->",
            REGION_INTERFACE_NAME,
            ");", NL
        )
        
        val hierarchicalStates = cfr.states.filter[ isHierarchical ]
        for (cfr2 : hierarchicalStates.map[ regions ].flatten.filter(ControlflowRegion)) {
            var prefix2 = prefix
            prefix2 += struct.getRegionName(cfr2) 
            prefix2 += "."
            setInterface(prefix2, cfr2)
        }
    }
    
    
}