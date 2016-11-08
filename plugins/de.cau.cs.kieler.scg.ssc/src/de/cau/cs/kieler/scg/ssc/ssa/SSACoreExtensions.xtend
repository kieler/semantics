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
import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.ssc.features.SSAFeature

import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension java.lang.Character.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSACoreExtensions {

    // -------------------------------------------------------------------------
    
    public static val SSA = "de.cau.cs.kieler.scg.ssa"
    
    // -------------------------------------------------------------------------
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    @Inject extension AnnotationsExtensions
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
    
    def <T extends Annotatable> T markSSADecl(T anno, ValuedObject vo) {
        anno.annotations.removeIf[name == SSA]
        anno.annotations += createReferenceAnnotation => [
            name = SSA
            it.object = vo
        ]
        return anno
    }
    
    def ssaOrigVO(Declaration decl) {
        val origAnno = decl.annotations.findFirst[it.name == SSA && it instanceof ReferenceAnnotation]
        if (origAnno != null) {
            return (origAnno as ReferenceAnnotation).object as ValuedObject
        } else {
            return null
        }
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
        val names = newHashSet
        for (decl : scg.declarations.filter[!isSSA]) {
            for (vo : decl.valuedObjects) {
                names += vo.name
            }
        }
        for (decl : scg.declarations.filter[isSSA]) {
            for (vo : decl.valuedObjects.filter[!isRegister && !isTerm].indexed) {
                val origName = decl.ssaOrigVO.name
                var newName = new StringBuilder(origName + vo.key)
                if (origName.charAt(origName.length - 1).isDigit) {
                    newName.insert(origName.length, '_')
                }
                while(names.contains(newName.toString)) {
                    newName.insert(origName.length, '_')
                }
                if (vo.value.isSSA(COMBINE)) {
                    newName.append("up")
                }
                vo.value.name = newName.toString
            }
        }
    }
        
    def createSSADeclarations(SCGraph scg) {
        val ssaDecl = HashBiMap.create(scg.declarations.size)
        val newDecl = newArrayList // Preserve Order
        for (decl : scg.declarations) {
            for (vo : decl.valuedObjects) {
                ssaDecl.put(vo, createDeclaration => [
                    markSSADecl(vo)
                    type = decl.type
                    valuedObjects += vo.copy
                    newDecl.add(it)
                ])
            }
        }
        scg.declarations.addAll(newDecl)
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
    
    def isDelayed(SCGraph scg) {
        return scg.nodes.exists[it instanceof Surface]
    }
    
    def isUpdate(Assignment asm) {
        return asm.eAllContents.filter(ValuedObjectReference).exists[valuedObject == asm.valuedObject]
    }
    
        /**
     * Remove unused ssa versions.
     */
    def removeUnusedSSAVersions(SCGraph scg) {
        val use = scg.uses
        val def = scg.defs
        for (decl : scg.declarations.filter[input == false && output == false]) {
            decl.valuedObjects.removeIf[!isRegister && !isTerm && use.get(it).empty && !def.containsKey(it)]
        }
        scg.removeUnusedSSADeclarations 
    }
    
    def removeUnusedSSADeclarations(SCGraph scg) {
        scg.declarations.removeIf[input == false && output == false && it.valuedObjects.empty]
    }
   
   
    def getDefs(SCGraph scg) {
        if (!scg.hasAnnotation(SSAFeature.ID)) {
            throw new IllegalArgumentException("Given SCG is not in SSA form")
        }
        val def = <ValuedObject, Assignment>newHashMap
        // Analyse graph for defs
        for (node : scg.nodes.filter(Assignment)) {
            def.put(node.valuedObject, node)
        }
        return def;
    }
    
    def getUses(SCGraph scg) {
        if (!scg.hasAnnotation(SSAFeature.ID)) {
            throw new IllegalArgumentException("Given SCG is not in SSA form")
        }
        val use = HashMultimap.<ValuedObject, Node>create
        // Analyse graph for uses
        for (node : scg.nodes) {
            if (node instanceof Assignment) {
                node.assignment.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            } else if (node instanceof Conditional) {
                node.condition.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            }
        }
        return use
    }
}