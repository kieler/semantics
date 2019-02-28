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

import com.google.common.collect.BiMap
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.processors.ssa.DominatorTree
import javax.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class IOPreserverExtensions {

    // -------------------------------------------------------------------------
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    @Inject extension SSACoreExtensions
    @Inject extension MergeExpressionExtension
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension KEffectsExtensions
    @Inject extension SCGManipulationExtensions
    static val sCGFactory = ScgFactory.eINSTANCE

    // -------------------------------------------------------------------------
    
    public static val OUTPUT_PRESERVER = "scg.ssa.output.preserver"
    public static val INPUT_PRESERVER = "scg.ssa.input.preserver"
    public static val REGISTER = "scg.ssa.delay.register"
    public static val TERM = "scg.ssa.delay.term"
    
    // -------------------------------------------------------------------------
    
    def preprocessIO(SCGraph scg, Entry entryNode, BiMap<ValuedObject, VariableDeclaration> ssaDecl) {
        if (scg.isDelayed) {
            // Create Registers
            for (entry : ssaDecl.entrySet.filter[!value.input]) {
                entry.value.valuedObjects += createValuedObject(entry.key.name + "reg") => [
                    markRegister
                ]
            }
        } else {
            entryNode.exit.preserveOutput(scg)
        }
    }

    def postprocessIO(SCGraph scg, Entry entryNode, BiMap<ValuedObject, VariableDeclaration> ssaDecl, Multimap<ValuedObject, Assignment> preserveAsm) {
        if (scg.isDelayed) {
            // Delete unused Registers
            val use = scg.uses
            for (decl : ssaDecl.entrySet.filter[it.key.variableDeclaration.output == false].map[value]) {
                decl.valuedObjects.removeIf[isRegister && use.get(it).empty]
                preserveAsm.values.removeIf[valuedObject.eContainer === null]
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
                val termExitAsm = sCGFactory.createAssignment => [
                    valuedObject = term
                    expression = createBoolValue(true)
                ]
                scg.nodes += termExitAsm
                for (cf : entryNode.exit.incomingLinks.immutableCopy) {
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
                    if (prev === null) {
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
    
    def optimizeIO(SCGraph scg) {
        // Find self assignment
        val rems = scg.nodes.filter(Assignment).filter[isOutputPreserver].filter[
            if (expression instanceof ValuedObjectReference) {
                return valuedObject == (expression as ValuedObjectReference).valuedObject
            }
            return false
        ].toList
        // Fix controlflow
//        for (rem : rems) {
//            rem.incoming.toList.forEach[target = rem.next.target]
//            rem.next.remove
//        }
        // Remove
//        scg.nodes.removeAll(rems)
    }
    
    def createPreservingAssignments(SCGraph scg, DominatorTree dt, Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, VariableDeclaration> ssaDecl, boolean scheduleUpdates) {
        val map = LinkedHashMultimap.create
        if (scg.isDelayed) {
            for (entry : ssaDecl.entrySet.filter[value.valuedObjects.exists[isRegister]].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)]) {
                val vo = entry.key
                val nodes = scg.nodes.filter(Assignment).filter[valuedObject == vo].map[it as Node].toList
                if (!nodes.empty) {
                    map.put(vo, sCGFactory.createAssignment => [
                        valuedObject = entry.value.valuedObjects.findFirst[isRegister]
                        expression = nodes.head.createMergeExpression(nodes, vo, ssaReferences, ssaDecl, dt, scheduleUpdates)
                    ])
                } else {
                    map.put(vo, sCGFactory.createAssignment => [
                        val reg = entry.value.valuedObjects.findFirst[isRegister]
                        valuedObject = reg
                        expression = createOperatorExpression => [
                            operator = OperatorType.PRE
                            subExpressions.add(reg.reference)
                        ]
                    ])
                }
            }
            for (iovo : ssaDecl.entrySet.filter[key.variableDeclaration.input && key.variableDeclaration.output].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)].map[key]) {
                map.put(iovo, sCGFactory.createAssignment => [
                    valuedObject = iovo
                    val nodes = scg.nodes.filter(Assignment).filter[valuedObject == iovo].map[it as Node].toList
                    if (nodes.empty) {
                        expression = iovo.reference
                    } else {
                        expression = nodes.head.createMergeExpression(nodes, iovo, ssaReferences, ssaDecl, dt, false)
                    }
                ])
            }
            for (entry : ssaDecl.entrySet.filter[!key.variableDeclaration.input && key.variableDeclaration.output && value.valuedObjects.exists[isRegister]].sortBy[(value.eContainer as SCGraph).declarations.indexOf(value)]) {
                map.put(entry.key, sCGFactory.createAssignment => [
                    valuedObject = entry.key
                    expression = entry.value.valuedObjects.findFirst[isRegister].reference
                ])
            }
        }
        return map
    }
    
    private def preserveOutput(Node node, SCGraph scg) {
        if(!node.basicBlock.deadBlock) {
            for (decl : scg.variableDeclarations.reverseView.filter[output]) {
                for (vo : decl.valuedObjects.reverseView) {
                    // Create self assignment which will not be renamed
                    val asm = sCGFactory.createAssignment => [
                        valuedObject = vo
                        expression = vo.reference
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
    
    // -------------------------------------
    // General
    
    def createInputPreservingAssignments(SCGraph scg, Entry entry, boolean onlyForWrittenInputs) {
        val positions = <Node>newArrayList(entry)
        val isDefined = <ValuedObject>newHashSet
        for (n : scg.nodes) {
            if (onlyForWrittenInputs && n instanceof Assignment && (n as Assignment).valuedObject !== null) {
                isDefined += (n as Assignment).valuedObject
            } else if (n instanceof Depth) {
                positions += n
            }
        }
        for (node : positions) {
            for (decl : scg.variableDeclarations.reverseView.filter[input && !isSSA]) {
                for (vo : decl.valuedObjects.reverseView) {
                    if (!onlyForWrittenInputs || isDefined.contains(vo)) {
                        // Create self assignment which will not be renamed
                        val asm = sCGFactory.createAssignment => [
                            valuedObject = vo
                            expression = vo.reference
                            markInputPreserver
                        ]
                        val sb = node.schedulingBlock
                        sb.nodes.add(sb.nodes.indexOf(node) + 1, asm)
                        scg.nodes.add(scg.nodes.indexOf(node) + 1, asm)
                        // Insert after
                        val next = node.allNext.head
                        asm.createControlFlow.target = next.target
                        next.target = asm
                    }
                }
            }
        }
    }
    
    
    def removeInputPreservingAssignments(SCGraph scg) {
        val uses = scg.uses
        for (n : scg.nodes.filter(Assignment).filter[isInputPreserver].toList) {
            val origVO = (n.expression as ValuedObjectReference).valuedObject
            for (use : uses.get(n.valuedObject)) {
                use.eAllContents.filter(ValuedObjectReference).filter[valuedObject == n.valuedObject].forEach[valuedObject = origVO]
            }
            n.removeNode(true)
        }
    }
    
    // -------------------------------------

    def isInputPreserver(Node node) {
        return node.hasAnnotation(INPUT_PRESERVER)
    }
    
    def markInputPreserver(Assignment asm) {
        asm.annotations += createTagAnnotation => [
            name = INPUT_PRESERVER
        ]
    }
    
    def isOutputPreserver(Node node) {
        return node.hasAnnotation(OUTPUT_PRESERVER)
    }
    
    def markOutputPreserver(Assignment asm) {
        asm.annotations += createTagAnnotation => [
            name = OUTPUT_PRESERVER
        ]
    }
    
    def isRegister(ValuedObject vo) {
        return vo.hasAnnotation(REGISTER)
    }
    
    def markRegister(ValuedObject vo) {
        vo.annotations += createTagAnnotation => [
            name = REGISTER
        ]
    }
    
    def isTerm(ValuedObject vo) {
        return vo.hasAnnotation(TERM)
    }
    
    def markTerm(ValuedObject vo) {
        vo.annotations += createTagAnnotation => [
            name = TERM
        ]
    }
}
