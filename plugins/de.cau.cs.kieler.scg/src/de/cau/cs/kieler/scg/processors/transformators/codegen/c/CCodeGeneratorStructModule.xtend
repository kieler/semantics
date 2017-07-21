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

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import com.google.inject.Inject
import de.cau.cs.kieler.scg.codegen.SCG2CSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorStructModule extends SCGCodeGeneratorModule {
    
    @Inject extension SCG2CSerializeHRExtensions
    
    val structName = "TickData"
    val guardType = "char"
    
    new(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap
    ) {
        super(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap)
    }
    
    def getName() {
        structName + baseName + suffix
    }
    
    override generateInit() {
        code.append("typedef struct {\n")
    }
    
    override generate() {
        for (declaration : scg.declarations) {
            if (declaration instanceof VariableDeclaration) {
                code.append(indentation + declaration.type)
                code.append(";\n")
            }
        }
    }
    
    override generateDone() {
        code.append("} ").append(getName).append(";\n")
    }
    
}