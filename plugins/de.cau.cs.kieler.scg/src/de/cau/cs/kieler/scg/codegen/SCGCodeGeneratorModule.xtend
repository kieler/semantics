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
package de.cau.cs.kieler.scg.codegen

import de.cau.cs.kieler.scg.codegen.CodeGeneratorModule
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class SCGCodeGeneratorModule extends CodeGeneratorModule {
    
    static val serializer = new SCG2CSerializeHRExtensions    
    
    @Accessors var SCGraphs sCGraphs
    @Accessors var SCGraph scg
    @Accessors var Processor<SCGraphs, CodeContainer> processorInstance
    @Accessors var Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap
    @Accessors var SCGCodeGeneratorModule parent
    
    new(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super(baseName)
        this.sCGraphs = sCGraphs
        this.scg = scg
        this.processorInstance = processorInstance
        this.codeGeneratorModuleMap = codeGeneratorModuleMap
        this.parent = parent
    }
    
    abstract def void generateInit()
    
    abstract def void generate()
    
    abstract def void generateDone()
    
    protected def serializeHR(Object object) {
        serializer.serializeHR(object)
    }  
}