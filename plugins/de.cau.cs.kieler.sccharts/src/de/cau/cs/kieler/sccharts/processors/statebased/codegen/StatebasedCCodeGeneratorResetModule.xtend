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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import static extension de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeGeneratorStructModule.*
import de.cau.cs.kieler.sccharts.State
import org.eclipse.xtend.lib.annotations.Accessors

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
    
    @Inject StatebasedCCodeGeneratorStructModule struct
    
    @Accessors(PUBLIC_GETTER) var StringBuilder rootStateInit
    @Accessors var int maxRootstatePriority = 0
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
    }    
    
    override generateInit() {
        rootStateInit = new StringBuilder
        
        code.add(
            MLC(getName + "() sets the program to its initial state.", 
                "You should call " + getName + "() at least once at the start of the application.",
                "Additionally, you can always reset the actual status to the initial configuration ",
                "to restart the application."
            ),
            
            "void ", getName, "(", struct.getName, " *", struct.getVariableName, ")"
        )
        
        struct.forwardDeclarations.append(code).append(";\n\n")
        
        code.add(
            " {", NL
        )
    }
    
    override generate() {
        for (cfr : rootState.regions.filter(ControlflowRegion)) {
            var prefix = STRUCT_CONTEXT_NAME
            prefix += "->"
            prefix += struct.getContextVariableName(cfr)
            prefix += "."
             
            setInterface(prefix, cfr)
        }
        
        code.add(NL, rootStateInit)
    }
    
    override generateDone() {
        code.add(IFC(!leanMode, "  ", CONTEXT_DATA_NAME, "->", REGION_ACTIVE_PRIORITY, " = ", maxRootstatePriority, ";", NL))
        code.add("  ", STRUCT_CONTEXT_NAME, "->", REGION_THREADSTATUS, " = ", THREAD_STATUS_RUNNING, ";", NL)
        code.add(
            "}", NL
        )
    }
    
    protected def void setInterface(String prefix, ControlflowRegion cfr) {
        code.add(
            "  ",
            prefix,
            struct.getRegionIfaceName,
            " = &(",
            STRUCT_CONTEXT_NAME,
            "->",
            struct.getRegionIfaceName,
            ");", NL
        )
        
        val hierarchicalStates = cfr.states.filter[ isHierarchical ]
        for (cfr2 : hierarchicalStates.map[ regions ].flatten.filter(ControlflowRegion)) {
            var prefix2 = prefix
            prefix2 += struct.getContextVariableName(cfr2) 
            prefix2 += "."
            setInterface(prefix2, cfr2)
        }
    }
}