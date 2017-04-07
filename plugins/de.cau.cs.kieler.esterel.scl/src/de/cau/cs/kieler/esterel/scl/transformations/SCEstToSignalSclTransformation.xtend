/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.LocalSignal
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.UnEmit
import de.cau.cs.kieler.esterel.features.EsterelFeature
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.Input
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.Output
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scl.features.SCLFeatures
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Scope
import de.cau.cs.kieler.scl.scl.Thread
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import java.util.List

/**
 * This class contains methods to transform an Esterel program to SCL using signal notation.
 * 
 * @author als
 * 
 */
class SCEstToSignalSclTransformation extends AbstractProductionTransformation implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "esterel.sigscl"
    }

    override getName() {
        return "Signal SCL"
    }

    override getProducedFeatureId() {
        return SCLFeatures.BASIC_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(EsterelFeature.BASIC_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension KExpressionsCreateExtensions
    
    extension SclFactory = SclFactory.eINSTANCE
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE

    val signalVOMapping = <ISignal, ValuedObject>newHashMap()
    val trapLabel = <ISignal, Label>newHashMap()
    val exits = HashBiMap.<Goto, Assignment>create
    val trapHirarchy = <Label>newLinkedList
    val outerTraps = <Goto, List<Label>>newHashMap()
    val parallelExits = HashMultimap.<Assignment, Pair<Label, Assignment>>create
    var Declaration suspendDecl = null
    var Declaration exitDecl = null

    /**
     * Generic transformation method for KiCo.
     */
    override transform(EObject eObject) {
        return (transformProgram(eObject as Program)) // .optimizeAll) 
    }

    /**
     * Main transformation method.
     * 
     * @param esterelProgram The Esterel program to transform
     * @return The transformed SCL program
     */
    public def SCLProgram transformProgram(Program sourceEsterelProgram) {
        signalVOMapping.clear
        trapLabel.clear
        exits.clear
        trapHirarchy.clear
        outerTraps.clear
        parallelExits.clear

        // Check if naming conventions are satisfied
//        sourceEsterelProgram.validateNames
        // Create the SCL program
        val targetSclProgram = createSCLProgram
        creationalTransformation(sourceEsterelProgram, targetSclProgram)

        if (sourceEsterelProgram.modules.size > 1) {
            throw new IllegalArgumentException("Cannot handle Esterel programs with multiple modules!")
        }
        val module = sourceEsterelProgram.modules.head
        targetSclProgram.name = module.name

        // Interface transformations
        if (module.interface != null) {
            if (!module.interface.intSensorDecls.nullOrEmpty) {
                throw new IllegalArgumentException("Cannot handle Esterel programs with sensors!")
            }
            if (!module.interface.intConstantDecls.nullOrEmpty) {
                throw new IllegalArgumentException("Cannot handle Esterel programs with constants!")
            }
            module.interface.intSignalDecls.forEach [ interfaceDecl |
                targetSclProgram.declarations += createDeclaration(ValueType.PURE) => [
                    it.trace(interfaceDecl)
                    for (sig : interfaceDecl.signals) {
                        input = interfaceDecl instanceof Input || interfaceDecl instanceof InputOutput
                        output = interfaceDecl instanceof Output || interfaceDecl instanceof InputOutput
                        if (sig.channelDescr != null) {
                            throw new IllegalArgumentException("Can only handle Esterel programs with pure signals!")
                        }
                        valuedObjects += createValuedObject(sig.name) => [
                            it.trace(sig)
                            signalVOMapping.put(sig, it)
                        ]
                    }
                ]
            ]
        }

        // Special Decl
        suspendDecl = createDeclaration(ValueType.PURE) => [
            annotations += createStringAnnotation => [
                name = "ignore"
            ]
            annotations += createStringAnnotation => [
                name = "suspend"
            ]
        ]
        exitDecl = createDeclaration(ValueType.PURE) => [
            annotations += createStringAnnotation => [
                name = "ignore"
            ]
            annotations += createStringAnnotation => [
                name = "exit"
            ]
        ]

        // Translate program
        module.body.statements.forEach[translate(targetSclProgram)]
        
        // Add or skip suspend decl
        if (!suspendDecl.valuedObjects.empty) {
            targetSclProgram.declarations += suspendDecl
            suspendDecl.valuedObjects.forEach [ vo, i |
                vo.name = vo.name + i
            ]
        }
        // Add or skip exit decl
        if (!exitDecl.valuedObjects.empty) {
            targetSclProgram.declarations += exitDecl
            exitDecl.valuedObjects.groupBy[name].values.filter[size > 1].forEach [
                forEach[ vo, i |
                    vo.name = vo.name + i
                ]
            ]
        }

        // Added join jumps for concurrent exits 
        for (exit : exits.entrySet) {
            val endTrap = exit.key.target
            val threadHierarchy = newLinkedList()
            var parent = exit.key.eContainer
            while (parent != null) {
                if (parent instanceof Thread) {
                    if (parent.eAllContents.exists[it == endTrap]) {
                        parent = null
                    } else {
                        threadHierarchy.add(parent as Thread)
                        parent = parent.eContainer
                    }
                } else {
                    parent = parent.eContainer
                }
            }
            // if exit is concurrent exit with join of other threads
            if (!threadHierarchy.empty) {
                val join_asm = createAssignment.trace(exit.key) => [
                    valuedObject = createValuedObject => [
                        name = "join_" + exit.value.valuedObject.name.substring(5)
                        exitDecl.valuedObjects += it
                    ]
                    expression = createBoolValue(true)
                ]
                val join_label = createLabel.trace(exit.key) => [
                    name = "join_" + exit.value.valuedObject.name.substring(5)
                ]
                val exit_scope = exit.key.eContainer as Scope
                exit_scope.statements.add(exit_scope.statements.indexOf(exit.key), join_label)
                exit_scope.statements.add(exit_scope.statements.indexOf(exit.key), join_asm)
                val allConcThreads = newLinkedList
                for (t : threadHierarchy) {
                    allConcThreads.addAll((t.eContainer as de.cau.cs.kieler.scl.scl.Parallel).threads.filter[it != t])
                }
                for (t : allConcThreads) {
                    for (pause : t.eAllContents.filter(de.cau.cs.kieler.scl.scl.Pause).toList) {
                        val scope = pause.eContainer as Scope
                        scope.statements.add(scope.statements.indexOf(pause), createConditional => [
                            expression = exit.value.valuedObject.reference
                            statements += createGoto => [
                                target = join_label
                                annotations += createStringAnnotation => [
                                    name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                                ]
                            ]
                        ])
                    }
                    for (pexit : t.eAllContents.filter(Goto).filter[target != exit.key.target && exits.containsKey(it) && !outerTraps.get(exit.key).contains(it.target)].toList) {
                        parallelExits.put(exits.get(pexit), new Pair(join_label, join_asm))
                    }
                    t.statements.add(createConditional => [
                        expression = exit.value.valuedObject.reference
                        statements += createGoto => [
                            target = join_label
                            annotations += createStringAnnotation => [
                                name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                            ]
                        ]
                    ])
                }
            }
        }
        // Apply trap hierarchy to exits
        for (exit : parallelExits.entries) {
            val scope = exit.key.eContainer as Scope
            scope.statements.add(scope.statements.indexOf(exit.key)+1, createConditional => [
                expression = exit.value.value.valuedObject.reference
                statements += createGoto => [
                    target = exit.value.key
                    annotations += createStringAnnotation => [
                        name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                    ]
                ]
            ])
        }

        // Make unique labels
        targetSclProgram.eAllContents.filter(Label).groupBy[name].values.forEach [
            it.forEach [ label, idx |
                label.name = label.name + idx
            ]
        ]

        return targetSclProgram
    }

    def ValuedObject vo(ISignal signal) {
        signalVOMapping.get(signal)
    }

    def ValuedObject vo(de.cau.cs.kieler.esterel.kexpressions.ValuedObject vo) {
        if (vo instanceof ISignal) {
            return vo.vo
        } else {
            throw new IllegalArgumentException("Can only handle Esterel programs with pure signals!")
        }
    }

    def dispatch Scope translate(Nothing nothing, Scope scope) {
        return scope
    }

    def dispatch Scope translate(Pause pause, Scope scope) {
        scope.statements += createPause.trace(pause)
        return scope
    }

    def dispatch Scope translate(Sequence seq, Scope scope) {
        seq.list.forEach[translate(scope)]
        seq.trace(scope)
        return scope
    }

    def dispatch Scope translate(Block block, Scope scope) {
        block.statement.translate(scope)
        return scope
    }

    def dispatch Scope translate(Parallel parallel, Scope scope) {
        scope.statements += createParallel.trace(parallel) => [
            for (esterelThread : parallel.list) {
                threads += createThread.trace(parallel) => [
                    esterelThread.translate(it)
                ]
            }
        ]
        return scope
    }

    def dispatch Scope translate(Loop loop, Scope scope) {
        val label = createLabel => [
            it.trace(loop)
            name = "loop"
        ]
        scope.statements += label
        loop.body.statement.translate(scope)
        scope.statements += createGoto.trace(loop) => [
            target = label
        ]
        return scope
    }

    def dispatch Scope translate(LocalSignalDecl lsig, Scope scope) {
        scope.statements += createScopeStatement => [
            it.trace(lsig)
            declarations += createDeclaration(ValueType.PURE).trace(lsig) => [
                for (localSignal : (lsig.signalList as LocalSignal).signal) {
                    valuedObjects += createValuedObject => [
                        it.trace(localSignal)
                        it.name = localSignal.name
                        signalVOMapping.put(localSignal, it)
                        // implicit reset
                        scope.statements += createAssignment => [ asm |
                            asm.trace(lsig)
                            asm.valuedObject = it
                            asm.expression = createBoolValue(false)
                        ]
                    ]
                }
            ]
            lsig.statement.translate(it)
        ]
        return scope
    }

    def dispatch Scope translate(Emit emit, Scope scope) {
        scope.statements += createAssignment => [
            it.trace(emit)
            valuedObject = emit.signal.vo
            expression = createBoolValue(true)
        ]
        return scope
    }

    def dispatch Scope translate(UnEmit unemit, Scope scope) {
        scope.statements += createAssignment => [
            it.trace(unemit)
            valuedObject = unemit.signal.vo
            expression = createBoolValue(false)
        ]
        return scope
    }

    def dispatch Scope translate(Present present, Scope scope) {
        // No cases
        val body = present.body
        if (body instanceof PresentEventBody) {
            scope.statements += createConditional => [
                it.trace(present, present.body)
                expression = translateExpr(body.event.expression)
                if (body.thenPart != null) {
                    body.thenPart.statement.translate(it)
                }
                if (present.elsePart != null) {
                    ^else = createElseScope
                    present.elsePart.trace(^else)
                    present.elsePart.statement.translate(^else)
                }
            ]
        } // present case s do ...
        else if (present.body instanceof PresentCaseList) {
            throw new IllegalArgumentException("Can only handle Esterel programs with present case!")
        }
        return scope
    }

    def dispatch Scope translate(Suspend suspend, Scope scope) {
        scope.statements += createAssignment.trace(suspend) => [
            val vo = createValuedObject("suspend").trace(suspend)
            suspendDecl.valuedObjects += vo
            valuedObject = vo
            expression = suspend.delay.event.expr.translateExpr
        ]
        suspend.statement.translate(scope)
        return scope
    }

    def dispatch Scope translate(Trap trap, Scope scope) {
        val label = createLabel.trace(trap) => [
            name = "trap"
        ]
        trap.trapDeclList.trapDecls.forEach [
            trapLabel.put(it, label)
        ]
        trapHirarchy.push(label)
        trap.statement.translate(scope)
        trapHirarchy.pop
        scope.statements += label

        return scope
    }

    def dispatch Scope translate(Exit exit, Scope scope) {
        val exitAsm = createAssignment.trace(exit) => [
            valuedObject = createValuedObject => [
                name = "exit_" + exit.trap.name
                exitDecl.valuedObjects += it
            ]
            expression = createBoolValue(true)
        ]
        val goto = createGoto.trace(exit) => [
            target = trapLabel.get(exit.trap)
            annotations += createStringAnnotation => [
                name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
            ]
        ]
        exits.put(goto, exitAsm)
        outerTraps.put(goto, newArrayList(trapHirarchy.drop(1)))
        scope.statements += exitAsm
        scope.statements += goto
        return scope
    }

    def dispatch Expression translateExpr(ValuedObjectReference expr) {
        return expr.valuedObject.vo.reference
    }

    def dispatch Expression translateExpr(OperatorExpression expr) {
        return createOperatorExpression(expr.operator.translateOP) => [
            it.trace(expr)
            subExpressions.addAll(expr.subExpressions.map[translateExpr])
        ]
    }

    def dispatch Expression translateExpr(de.cau.cs.kieler.esterel.kexpressions.Expression expr) {
        return null
    }

    private def OperatorType translateOP(de.cau.cs.kieler.esterel.kexpressions.OperatorType o) {
        return switch (o) {
            case AND: OperatorType.BITWISE_AND
            case OR: OperatorType.BITWISE_OR
            default: OperatorType.getByName(o.getName)
        }
    }
}
