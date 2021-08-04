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

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import java.util.Map

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
        rootModel.fixClassNameClashes
    }
    
    override createCodeGeneratorModule() {
        return injector.getInstance(CCodeGeneratorModule)
    }
    
    protected def fixClassNameClashes(SCGraphs rootModel) {
        for (scg : rootModel.scgs.ignoreMethods) {
            val classDecls = scg.eAllContents.filter(ClassDeclaration).filter[!host].toList
            // hierachical names
            for (decl : classDecls) {
                var parent = decl.eContainer
                while (parent instanceof ClassDeclaration) {
                    decl.name = parent.name + "_" + decl.name
                    parent = parent.eContainer
                }
                decl.name = scg.name + "_" + decl.name
            }
            // Fix clashes
            val names = newHashSet
            for (decl : classDecls) {
                if (names.contains(decl.name)) {
                    var idx = 1
                    while (names.contains(decl.name + idx)) {
                        idx++
                    }
                    decl.name = decl.name + idx
                    names += decl.name
                } else {
                    names += decl.name
                }
            }
            // Fix method names
            for (decl : classDecls) {
                for (m : decl.declarations.filter(MethodDeclaration)) {
                    m.valuedObjects.head.name = decl.name + "_" + m.valuedObjects.head.name
                }
            }
            // Fix root method names
            for (m : scg.declarations.filter(MethodDeclaration)) {
                m.valuedObjects.head.name = scg.name + "_" + m.valuedObjects.head.name
            }
        }
    }

}

