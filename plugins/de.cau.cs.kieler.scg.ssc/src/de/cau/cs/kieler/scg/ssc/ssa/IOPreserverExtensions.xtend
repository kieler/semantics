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

import com.google.common.collect.BiMap
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import javax.inject.Inject

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class IOPreserverExtensions {

    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension SCGControlFlowExtensions
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension SSACacheExtensions
    @Inject
    extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    
    @Inject
    extension SSACoreExtensions
        @Inject
    extension MergeExpressionExtension
    
        @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension KExpressionsCreateExtensions   

    // -------------------------------------------------------------------------
    public static val OUTPUT_PRESERVER = "scg.ssa.output.preserver"
    public static val REGISTER = "scg.ssa.delay.register"
    public static val TERM = "scg.ssa.delay.term"
    // -------------------------------------------------------------------------
    def preprocessIO(SCGraph scg, Entry entryNode, BiMap<ValuedObject, Declaration> ssaDecl) {
        if (scg.isDelayed) {
            // Create Registers
            for (entry : ssaDecl.entrySet) {
                entry.value.valuedObjects += createValuedObject(entry.key.name + "reg") => [
                    markRegister
                ]
            }
        } else {
            entryNode.exit.preserveOutput(scg)
        }
    }

    private def preserveOutput(Node node, SCGraph scg) {
        if(!node.basicBlock.deadBlock) {
            for (decl : scg.declarations.reverseView.filter[output]) {
                for (vo : decl.valuedObjects.reverseView) {
                    // Create self assignment which will not be renamed
                    val asm = createAssignment => [
                        valuedObject = vo
                        assignment = vo.reference
                        markOutputPreserver
                    ]
                    val sb = node.schedulingBlock
                    sb.nodes.add(sb.nodes.indexOf(node), asm)
                    scg.nodes.add(scg.nodes.indexOf(node), asm)
                    // Insert before
                    node.allPrevious.toList.forEach[target = asm]
                    asm.createControlFlow.target = node
                }
            }
        }
    }
    
    def createPreservingAssignments(SCGraph scg, KielerCompilerContext context, Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl) {
        val map = LinkedHashMultimap.create
        if (scg.isDelayed) {
            for (entry : ssaDecl.entrySet.filter[value.valuedObjects.exists[isRegister]].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)]) {
                val vo = entry.key
                val nodes = scg.nodes.filter(Assignment).filter[valuedObject == vo].map[it as Node].toList
                if (!nodes.empty) {
                    map.put(vo, createAssignment => [
                        valuedObject = entry.value.valuedObjects.findFirst[isRegister]
                        assignment = nodes.head.createMergeExpression(nodes, vo, ssaReferences, ssaDecl, context)
                    ])
                }
            }
            for (iovo : ssaDecl.entrySet.filter[key.declaration.input && key.declaration.output].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)].map[key]) {
                map.put(iovo, createAssignment => [
                    valuedObject = iovo
                    val nodes = scg.nodes.filter(Assignment).filter[valuedObject == iovo].map[it as Node].toList
                    if (nodes.empty) {
                        assignment = iovo.reference
                    } else {
                        assignment = nodes.head.createMergeExpression(nodes, iovo, ssaReferences, ssaDecl, context)
                    }
                ])
            }
            for (entry : ssaDecl.entrySet.filter[!key.declaration.input && key.declaration.output && value.valuedObjects.exists[isRegister]].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)]) {
                map.put(entry.key, createAssignment => [
                    valuedObject = entry.key
                    assignment = entry.value.valuedObjects.findFirst[isRegister].reference
                ])
            }
        }
        return map
    }
    
    
    def postprocessIO(SCGraph scg, Entry entryNode, BiMap<ValuedObject, Declaration> ssaDecl, Multimap<ValuedObject, Assignment> preserveAsm, KielerCompilerContext context) {
        if (scg.isDelayed) {
            // Delete unused Registers
            val use = context.getUse(scg)
            for (decl : ssaDecl.entrySet.filter[it.key.declaration.output == false].map[value]) {
                decl.valuedObjects.removeIf[isRegister && use.get(it).empty]
                preserveAsm.values.removeIf[valuedObject.eContainer == null]
            }
            // In any register exists
            if (ssaDecl.values.exists[valuedObjects.exists[isRegister]]) {
                // Create preserver loop
                val entry = createEntry
                val exit = createExit
                entry.exit = exit
                val fork = createFork
                val join = createJoin
                fork.join = join
                entry.createControlFlow.target = fork
                join.createControlFlow.target = exit
                scg.nodes.add(0, entry)
                scg.nodes.add(1, fork)
                scg.nodes.addAll(join, exit)
                
                // Add term variable
                val term = createValuedObject("term") => [
                    markTerm
                ]
                scg.declarations += createDeclaration => [
                    type = ValueType.PURE
                    valuedObjects += term
                ]
                
                // Add program
                fork.createControlFlow.target = entryNode
                val termExitAsm = createAssignment => [
                    valuedObject = term
                    assignment = createBoolValue(true)
                ]
                scg.nodes += termExitAsm
                for (cf : entryNode.exit.incoming.immutableCopy) {
                    cf.target = termExitAsm
                }
                termExitAsm.createControlFlow.target = entryNode.exit
                entryNode.exit.createControlFlow.target = join
                
                // Add Control Thread
                val cEntry = createEntry
                val cExit = createExit
                cEntry.exit = cExit
                fork.createControlFlow.target = cEntry
                cExit.createControlFlow.target = join
                scg.nodes.addAll(cEntry, cExit)
                
                var Assignment prev = null
                // Preserving Assignments
                for (asm : preserveAsm.values) {
                    if (prev == null) {
                        cEntry.createControlFlow.target = asm
                    } else {
                        prev.createControlFlow.target = asm
                    }
                    scg.nodes += asm
                    prev = asm
                }
                                
                // Termination check
                val termCond = createConditional => [
                    condition = createOperatorExpression(OperatorType.NOT) => [
                        subExpressions += term.reference
                    ]
                    
                    // Pause
                    val surf = createSurface
                    val depth = createDepth
                    surf.depth = depth
                    scg.nodes.addAll(surf, depth)
                    depth.createControlFlow.target = cEntry.next.target
                    
                    then = createControlFlow => [target = surf]
                    ^else = createControlFlow => [target = cExit]
                ]
                prev.createControlFlow.target = termCond
                scg.nodes += termCond
            }
        }
    }

    def isOutputPreserver(Assignment asm) {
        return asm.hasAnnotation(OUTPUT_PRESERVER)
    }
    
    private def markOutputPreserver(Assignment asm) {
        asm.annotations += createAnnotation => [
            name = OUTPUT_PRESERVER
        ]
    }
    
    def isRegister(ValuedObject vo) {
        return vo.hasAnnotation(REGISTER)
    }
    
    private def markRegister(ValuedObject vo) {
        vo.annotations += createAnnotation => [
            name = REGISTER
        ]
    }
    
    def isTerm(ValuedObject vo) {
        return vo.hasAnnotation(TERM)
    }
    
    private def markTerm(ValuedObject vo) {
        vo.annotations += createAnnotation => [
            name = TERM
        ]
    }
}
