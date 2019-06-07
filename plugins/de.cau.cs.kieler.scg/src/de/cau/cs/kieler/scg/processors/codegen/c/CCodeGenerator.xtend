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

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import java.util.Map
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

/**
 * C Code Processor
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGenerator extends AbstractCodeGenerator<SCGraphs, SCGraph> {
    
    @Inject extension PragmaExtensions
    @Inject extension SCGMethodExtensions
    @Inject Injector injector
    
    public static val IProperty<Boolean> DEBUG_COMMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.codegen", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.c"
    }
    
    override getName() {
        "C Code"
    }
    
    override createModuleMap(SCGraphs rootModel, Map<SCGraph, CodeGeneratorModule<SCGraphs, SCGraph>> moduleMap) {
        for (scg : rootModel.scgs.ignoreMethods.indexed) {
            
            if (scg.key > 0) {
                environment.setProperty(CODE_NAMING_MAGIC, PRAGMA_CODE_NAMING_MAGIC_SUFFIX)
            }
            
            val generatorModule = createCodeGeneratorModule.configure(scg.value.name, rootModel, scg.value, this, moduleMap, 
                scg.value.name, null, null
            )
            moduleMap.put(scg.value, generatorModule)
            generatorModule.suffix = hostcodeSafeName(scg.value.name)
        }
    }
    
    override preProcess(SCGraphs rootModel) {
        if (rootModel.hasPragma("debug")) {
            environment.setProperty(DEBUG_COMMENTS, true)
        }
    }
    
    override createCodeGeneratorModule() {
        return injector.getInstance(CCodeGeneratorModule)
    }

}

