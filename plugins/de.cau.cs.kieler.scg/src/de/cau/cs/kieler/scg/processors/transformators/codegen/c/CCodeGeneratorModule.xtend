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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.codegen.CodeGeneratorModule
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    @Accessors var SCGCodeGeneratorModule struct
    @Accessors var SCGCodeGeneratorModule tick
    @Accessors var SCGCodeGeneratorModule reset 
    @Accessors var SCGCodeGeneratorModule logic
    
    new(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap
    ) {
        super(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap)
        
        struct = new CCodeGeneratorStructModule(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap)  
    }
    
    override generateInit() {
        struct.generateInit
    }
    
    override generate() {
        struct.generate
    }
    
    
    override generateDone() {
        struct.generateDone
    }
    
}