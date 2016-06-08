/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa

import com.google.common.collect.HashBiMap
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.SCGraph

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSACoreExtensions {

    // -------------------------------------------------------------------------
    
    public static val SSA = "de.cau.cs.kieler.scg.ssc.ssa"
    
    // -------------------------------------------------------------------------

    @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension KExpressionsCreateExtensions   
    
    @Inject
    extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    
    // -------------------------------------------------------------------------

    def isSSA(Annotatable anno) {
        return anno.hasAnnotation(SSA)
    }

    def isSSA(Annotatable anno, SSAFunction function) {
        return anno.annotations.filter(StringAnnotation).exists[it.name == SSA && it.values.head == function.id]
    }
    
    def <T extends Annotatable> T markSSA(T anno) {
        anno.annotations.removeIf[name == SSA]
        anno.annotations += createAnnotation => [
            name = SSA
        ]
        return anno
    }

    def <T extends Annotatable> T markSSA(T anno, SSAFunction function) {
        anno.annotations.removeIf[name == SSA]
        anno.createStringAnnotation(SSA, function.id)
        return anno
    }
    
    def createFunction(SSAFunction function) {
        return createFunctionCall => [
            functionName = function.symbol
        ]
    }
    
    def ssaParameterFunction(FunctionCall fc, SSAFunction function) {
        return fc.parameters.findFirst [
            expression instanceof FunctionCall && (expression as FunctionCall).functionName == function.symbol
        ]?.expression as FunctionCall
    }
    
    def updateSSAVersions(SCGraph scg) {
        for (decl : scg.declarations.filter[isSSA]) {
            for (vo : decl.valuedObjects.indexed) {
                // TODO handle variable names which contain numbers
                vo.value.name = vo.value.name.replaceAll("[0-9]*$", "") + vo.key
            }
        }
    }
    
    def createSSADeclarations(SCGraph scg) {
        val ssaDecl = HashBiMap.create(scg.declarations.size)
        for (decl : scg.declarations) {
            for (vo : decl.valuedObjects) {
                ssaDecl.put(vo, createDeclaration => [
                    markSSA
                    type = decl.type
                    valuedObjects += vo.copy
                ])
            }
        }
        scg.declarations.addAll(ssaDecl.values)
        return ssaDecl
    }
    
    def int SSAVersion(Parameter param) {
        return (param.expression as ValuedObjectReference).SSAVersion
    }
    
    def int SSAVersion(ValuedObjectReference ref) {
        return ref.valuedObject.SSAVersion
    } 
    
    def int SSAVersion(ValuedObject vo) {
        return (vo.eContainer as Declaration).valuedObjects.indexOf(vo)
    } 
    
    def removeUnusedSSADeclarations(SCGraph scg) {
        // TODO remove unused declarations maybe fix rename vo initalization expression
        // TODO keep pause preserve values in mind
//        for (decl : scg.declarations) {
//            if (decl.valuedObjects.size > 1) {
//                val decl = declPair.key.eContainer as Declaration
//                decl.valuedObjects.remove(declPair.key)
//                if (decl.valuedObjects.empty) {
//                    scg.declarations.remove(decl)
//                }
//            } else {
//                declPair.value.valuedObjects.head.name = declPair.key.name
//                val decl = declPair.key.eContainer as Declaration
//                decl.valuedObjects.remove(declPair.key)
//                if (decl.valuedObjects.empty) {
//                    scg.declarations.remove(decl)
//                }
//            }
//        } 
        scg.declarations.removeIf[it.valuedObjects.empty]    
    }
}