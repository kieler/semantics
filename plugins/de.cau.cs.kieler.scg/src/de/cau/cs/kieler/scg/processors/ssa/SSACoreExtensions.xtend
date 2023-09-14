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
package de.cau.cs.kieler.scg.processors.ssa

import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.processors.SCGAnnotations

import static de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static de.cau.cs.kieler.scg.processors.ssa.SSAFunction.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension java.lang.Character.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSACoreExtensions {

    // -------------------------------------------------------------------------
    
    public static val SSA = SCGAnnotations.ANNOTATION_SSA //"de.cau.cs.kieler.scg.ssa"
    public static val ANNOTATION_IGNORE_DECLARATION = "de.cau.cs.kieler.scg.ssa.ignore"
    
    // -------------------------------------------------------------------------
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    @Inject extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    @Inject extension KEffectsExtensions
    
    // -------------------------------------------------------------------------

    def isSSA(Annotatable anno) {
        return anno.hasAnnotation(SSA)
    }

    def isSSA(Annotatable anno, SSAFunction function) {
        return anno.annotations.filter(StringAnnotation).exists[it.name == SSA && it.values.head == function.id]
    }
    
    def <T extends Annotatable> T unmarkSSA(T anno) {
        anno.annotations.removeIf[name == SSA]
        return anno
    }    
    
    def <T extends Annotatable> T markSSA(T anno) {
        anno.unmarkSSA
        anno.annotations += createTagAnnotation => [
            name = SSA
        ]
        return anno
    }

    def <T extends Annotatable> T markSSA(T anno, SSAFunction function) {
        anno.unmarkSSA
        anno.createStringAnnotation(SSA, function.id)
        return anno
    }
    
    def <T extends Annotatable> T markSSADecl(T anno, ValuedObject vo) {
        anno.unmarkSSA
        anno.annotations += createReferenceAnnotation => [
            name = SSA
            it.object = vo
        ]
        return anno
    }
    
    def ssaOrigVO(Declaration decl) {
        val origAnno = decl.annotations.findFirst[it.name == SSA && it instanceof ReferenceAnnotation]
        if (origAnno !== null) {
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
        for (decl : scg.variableDeclarations.filter[isSSA]) {
            if (!decl.input || decl.valuedObjects.size > 1) {
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
    }
        
    def createSSADeclarations(SCGraph scg) {
        val ssaDecl = HashBiMap.create(scg.declarations.size)
        for (decl : scg.declarations.filter(VariableDeclaration).filter[
            !hasAnnotation(ANNOTATION_IGNORE_DECLARATION) 
            && !(it instanceof ClassDeclaration)
        ].toList) {
            for (vo : decl.valuedObjects) {
                ssaDecl.put(vo, createDeclaration => [
                    // Same interface modifiers
                    input = decl.input
                    output = decl.output
                    type = decl.type
                    
                    scg.declarations += it
                    trace(it, decl, vo)
                    markSSADecl(vo)
                    
                    valuedObjects += vo.copy
                ])
            }
        }
        return ssaDecl
    }
    
    def SSADeclarations(SCGraph scg) {
        return scg.declarations.filter(VariableDeclaration).filter[isSSA]
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
    
    /**
     * Remove unused ssa versions.
     */
    def removeUnusedSSAVersions(SCGraph scg) {
        val use = scg.uses
        val def = scg.defs
        for (decl : scg.declarations.filter[isSSA]) {//input == false && output == false
            decl.valuedObjects.removeIf[!isRegister && !isTerm && (use.get(it).empty || use.get(it).forall[hasAnnotation("dead")]) && !def.containsKey(it)]
        }
        scg.removeUnusedSSADeclarations 
    }
    
    /**
     * Remove unused ssa versions.
     */
    def removeSingleSSAVersions(SCGraph scg) {
        val uses = scg.uses
        val defs = scg.allDefs
        for (decl : scg.declarations.filter[isSSA && valuedObjects.size == 1]) {
            val vo = decl.valuedObjects.head
            val origVO = decl.ssaOrigVO
            uses.get(vo).forEach[eContents.filter(Expression).head.allReferences.filter[valuedObject == vo].forEach[valuedObject = origVO]]
            defs.get(vo).forEach[valuedObject = origVO]
            decl.valuedObjects.clear
        }
        scg.removeUnusedSSADeclarations 
    }
    
    def removeUnusedSSADeclarations(SCGraph scg) {
        scg.declarations.removeIf[if (it instanceof VariableDeclaration) input == false && output == false && it.valuedObjects.empty else false]
    }
    
    def getAllDefs(SCGraph scg) {
        val def = HashMultimap.<ValuedObject, Assignment>create
        // Analyse graph for defs
        for (node : scg.nodes.filter(Assignment).filter[valuedObject !== null]) {
            def.put(node.valuedObject, node)
        }
        return def;
    }
   
    def getDefs(SCGraph scg) {
        if (!scg.isSSA) {
            throw new IllegalArgumentException("Given SCG is not in SSA form")
        }
        val def = <ValuedObject, Assignment>newHashMap
        // Analyse graph for defs
        for (node : scg.nodes.filter(Assignment).filter[valuedObject !== null]) {
            def.put(node.valuedObject, node)
        }
        return def;
    }
    
    def getUses(SCGraph scg) {
        if (!scg.isSSA) {
            throw new IllegalArgumentException("Given SCG is not in SSA form")
        }
        val use = HashMultimap.<ValuedObject, Node>create
        // Analyse graph for uses
        for (node : scg.nodes) {
            if (node instanceof Assignment) {
                node.expression.allReferences.map[valuedObject].forEach [
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
