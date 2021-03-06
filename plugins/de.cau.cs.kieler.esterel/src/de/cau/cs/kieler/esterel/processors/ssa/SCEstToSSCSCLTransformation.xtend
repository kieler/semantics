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
package de.cau.cs.kieler.esterel.processors.ssa

import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.LocalVariableDeclaration
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.UnEmit
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.Scope
import de.cau.cs.kieler.scl.Thread
import java.util.List

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * This class contains methods to transform an Kernel SC Esterel program to SCL using signal notation.
 * 
 * @author als
 * 
 */
class SCEstToSSCSCLTransformation extends Processor<EsterelProgram, SCLProgram> implements Traceable {
    
    static val strict = false
    public static val ARTIFICIAL_JOIN = "ARTIFICIAL_JOIN"
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.ssa.ssc.scest2scl"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return ID
    }

    override getName() {
        return "SCC SCL"
    }

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        setModel(getModel.transformProgram)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension EsterelExtensions
    
    static val sCLFactory = SCLFactory.eINSTANCE
    extension SCLFactory = SCLFactory.eINSTANCE
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE

    val signalVOMapping = <Signal, ValuedObject>newHashMap()
    val trapLabel = <Signal, Label>newHashMap()
    val exits = HashBiMap.<Goto, Assignment>create
    val trapHirarchy = <Label>newLinkedList
    val outerTraps = <Goto, List<Label>>newHashMap()
    val parallelExits = HashMultimap.<Assignment, Pair<Label, Assignment>>create
    var Declaration suspendDecl = null
    var Declaration exitDecl = null

    /**
     * Main transformation method.
     * 
     * @param esterelProgram The Esterel program to transform
     * @return The transformed SCL program
     */
    public def SCLProgram transformProgram(EsterelProgram sourceEsterelProgram) {
        signalVOMapping.clear
        trapLabel.clear
        exits.clear
        trapHirarchy.clear
        outerTraps.clear
        parallelExits.clear

        // Check if naming conventions are satisfied
//        sourceEsterelProgram.validateNames
        // Create the SCL program
        val sclProgram = createSCLProgram
        creationalTransformation(sourceEsterelProgram, sclProgram)
        

        if (sourceEsterelProgram.modules.size > 1) {
            environment.errors.add("Cannot handle Esterel programs with multiple modules!")
        }
        
        val module = sourceEsterelProgram.modules.head
        val sclModule = createModule.trace(module)
        sclProgram.modules += sclModule
        sclModule.name = module.name

        // Interface transformations
        if (module.signalDeclarations.size > module.declarations.size) {
            environment.errors.add("Can only handle Esterel programs with signal declarations!")
        }
        for (decl : module.signalDeclarations) {
            sclModule.declarations += createVariableDeclaration(ValueType.PURE) => [
                it.trace(decl)
                signal = true
                input = decl.input
                output = decl.output
                for (sig : decl.signals) {
                    if (sig.type !== ValueType.PURE) {
                        if (strict) {
                            environment.errors.add("Can only handle Esterel programs with pure signals!")
                        } else {
                            environment.warnings.add("Can only handle Esterel programs with pure signals, valued signal will be treated pure!")
                        }
                    }
                    valuedObjects += createValuedObject(sig.name) => [
                        it.trace(sig)
                        signalVOMapping.put(sig, it)
                    ]
                }
            ]

        }

        // Special Decl
        suspendDecl = createVariableDeclaration(ValueType.PURE) => [
            signal = true
            annotations += createTagAnnotation => [
                name = SSACoreExtensions.ANNOTATION_IGNORE_DECLARATION
            ]
            annotations += createTagAnnotation => [
                name = "suspend"
            ]
        ]
        exitDecl = createVariableDeclaration(ValueType.PURE) => [
            signal = true
            annotations += createTagAnnotation => [
                name = SSACoreExtensions.ANNOTATION_IGNORE_DECLARATION
            ]
            annotations += createTagAnnotation => [
                name = "exit"
            ]
        ]

        // Translate program
        module.statements.forEach[translate(sclModule)]
        
        // Add or skip suspend decl
        if (!suspendDecl.valuedObjects.empty) {
            sclModule.declarations += suspendDecl
            suspendDecl.valuedObjects.forEach [ vo, i |
                vo.name = vo.name + i
            ]
        }
        // Add or skip exit decl
        if (!exitDecl.valuedObjects.empty) {
            sclModule.declarations += exitDecl
            exitDecl.valuedObjects.groupBy[name].values.filter[size > 1].forEach [
                forEach[ vo, i |
                    vo.name = vo.name + i
                ]
            ]
        }

        // Added join jumps for concurrent exits 
        for (exit : exits.entrySet.sortBy[outerTraps.get(it.key).size]) {
            val endTrap = exit.key.target
            val threadHierarchy = <Thread>newLinkedList
            var parent = exit.key.eContainer
            while (parent !== null) {
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
                val join_asm = sCLFactory.createAssignment.trace(exit.key) => [
                    valuedObject = createValuedObject => [
                        name = "join_" + exit.value.valuedObject.name.substring(5)
                        exitDecl.valuedObjects += it
                    ]
                    expression = createBoolValue(true)
                    annotations += createTagAnnotation => [name = ARTIFICIAL_JOIN]
                ]
                val join_label = createLabel.trace(exit.key) => [
                    name = "join_" + exit.value.valuedObject.name.substring(5)
                ]
                val exit_scope = exit.key.eContainer as Scope
                exit_scope.statements.add(exit_scope.statements.indexOf(exit.key), join_label)
                exit_scope.statements.add(exit_scope.statements.indexOf(exit.key), join_asm)
                val allConcThreads = newLinkedList
                for (t : threadHierarchy) {
                    allConcThreads.addAll((t.eContainer as Parallel).threads.filter[it != t])
                }
                for (t : allConcThreads) {
                    for (pause : t.eAllContents.filter(Pause).toList) {
                        val scope = pause.eContainer as Scope
                        scope.statements.add(scope.statements.indexOf(pause), createConditional => [
                            expression = exit.value.valuedObject.reference
                            statements += createGoto => [
                                target = join_label
                                annotations += createTagAnnotation => [
                                    name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                                ]
                            ]
                        ])
                    }
                    for (goto : t.eAllContents.filter(Goto).filter[
                        exits.containsKey(it) && outerTraps.get(it).size > outerTraps.get(exit.key).size
                    ].toList) {
                        val scope = goto.eContainer as Scope
                        scope.statements.add(scope.statements.indexOf(goto), createConditional => [
                            expression = exit.value.valuedObject.reference
                            statements += createGoto => [
                                target = join_label
                                annotations += createTagAnnotation => [
                                    name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                                ]
                            ]
                        ])
                    }
//                    for (pexit : t.eAllContents.filter(Goto).filter[target != exit.key.target && exits.containsKey(it) && !outerTraps.get(exit.key).contains(it.target)].toList) {
//                        parallelExits.put(exits.get(pexit), new Pair(join_label, join_asm))
//                    }
                    t.statements.add(createConditional => [
                        expression = exit.value.valuedObject.reference
                        statements += createGoto => [
                            target = join_label
                            annotations += createTagAnnotation => [
                                name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                            ]
                        ]
                    ])
                }
            }
        }
//        // Apply trap hierarchy to exits
//        for (exit : parallelExits.entries) {
//            val scope = exit.key.eContainer as Scope
//            scope.statements.add(scope.statements.indexOf(exit.key)+1, createConditional => [
//                expression = exit.value.value.valuedObject.reference
//                statements += createGoto => [
//                    target = exit.value.key
//                    annotations += createAnnotation => [
//                        name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
//                    ]
//                ]
//            ])
//        }

        // Make unique labels
        sclModule.eAllContents.filter(Label).groupBy[name].values.forEach [
            it.forEach [ label, idx |
                label.name = label.name + idx
            ]
        ]

        return sclProgram
    }

    def ValuedObject vo(Signal signal) {
        signalVOMapping.get(signal)
    }

    def ValuedObject vo(ValuedObject vo) {
        if (vo instanceof Signal) {
            return vo.vo
        } else {        
            if (strict) {
                environment.errors.add("Reference to non-pure signals are not supported!")
            } else {
                environment.warnings.add("Replaced reference to non-pure signals by tick!")
            }
            return null
        }
    }

    def dispatch Scope translate(Nothing nothing, Scope scope) {
        return scope
    }

    def dispatch Scope translate(Pause pause, Scope scope) {
        scope.statements += createPause.trace(pause)
        return scope
    }

    def dispatch Scope translate(Block block, Scope scope) {
        block.statements.forEach[translate(scope)]
        return scope
    }

    def dispatch Scope translate(EsterelParallel parallel, Scope scope) {
        scope.statements += createParallel.trace(parallel) => [
            for (esterelThread : parallel.threads) {
                threads += createThread.trace(esterelThread) => [ t |
                    esterelThread.statements.forEach[translate(t)]
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
        loop.statements.forEach[translate(scope)]
        scope.statements += createGoto.trace(loop) => [
            target = label
        ]
        return scope
    }

    def dispatch Scope translate(LocalSignalDeclaration lsig, Scope scope) {
        scope.statements += createScopeStatement => [
            it.trace(lsig)
            declarations += createVariableDeclaration(ValueType.PURE).trace(lsig) => [
                it.signal = true
                for (localSignal : lsig.valuedObjects.filter(Signal)) {
                    valuedObjects += createValuedObject => [
                        it.trace(localSignal)
                        it.name = localSignal.name
                        signalVOMapping.put(localSignal, it)
                        // implicit reset
                        scope.statements += sCLFactory.createAssignment => [ asm |
                            asm.trace(lsig)
                            asm.valuedObject = it
                            asm.expression = createBoolValue(false)
                        ]
                    ]
                }
            ]
            lsig.statements.forEach[translate(scope)]
        ]
        return scope
    }
    
    def dispatch Scope translate(LocalVariableDeclaration lvar, Scope scope) {
        if (strict) {
            environment.errors.add("Cannot handle Esterel programs with local variables!")
        } else {
            environment.warnings.add("Ignored local variable decarations!")
        }
        return scope
    }
    
    def dispatch Scope translate(Assignment asm, Scope scope) {
        if (strict) {
            environment.errors.add("Cannot handle Esterel programs with variable assignments!")
        } else {
            environment.warnings.add("Ignored variable assignment!")
        }
        return scope
    }

    def dispatch Scope translate(Emit emit, Scope scope) {
        scope.statements += sCLFactory.createAssignment => [
            it.trace(emit)
            valuedObject = emit.signal.vo
            expression = createBoolValue(true)
        ]
        return scope
    }

    def dispatch Scope translate(UnEmit unemit, Scope scope) {
        scope.statements += sCLFactory.createAssignment => [
            it.trace(unemit)
            valuedObject = unemit.signal.vo
            expression = createBoolValue(false)
        ]
        return scope
    }

    def dispatch Scope translate(Present present, Scope scope) {
        if (!present.cases.nullOrEmpty) {
            throw new IllegalArgumentException("Can only handle Esterel programs with present case!")
        }
        // No cases
        scope.statements += createConditional => [ cond |
            cond.trace(present, present)
            cond.expression = translateExpr(present.expression)
            present.statements.forEach[translate(cond)]
            if (!present.elseStatements.nullOrEmpty) {
                cond.^else = createElseScope.trace(present)
                present.elseStatements.forEach[translate(cond.^else)]
            }
        ]

        return scope
    }

    def dispatch Scope translate(Suspend suspend, Scope scope) {
        scope.statements += sCLFactory.createAssignment.trace(suspend) => [
            val vo = createValuedObject("suspend").trace(suspend)
            suspendDecl.valuedObjects += vo
            valuedObject = vo
            expression = suspend.delay.expression.translateExpr
        ]
        suspend.statements.forEach[translate(scope)]
        return scope
    }

    def dispatch Scope translate(Trap trap, Scope scope) {
        val label = createLabel.trace(trap) => [
            name = "trap"
        ]
        trap.trapSignals.forEach [
            trapLabel.put(it, label)
        ]
        trapHirarchy.push(label)
        trap.statements.forEach[translate(scope)]
        trapHirarchy.pop
        scope.statements += label

        return scope
    }

    def dispatch Scope translate(Exit exit, Scope scope) {
        val exitAsm = sCLFactory.createAssignment.trace(exit) => [
            valuedObject = createValuedObject => [
                name = "exit_" + exit.trap.name
                exitDecl.valuedObjects += it
            ]
            expression = createBoolValue(true)
        ]
        val goto = createGoto.trace(exit) => [
            target = trapLabel.get(exit.trap)
            annotations += createTagAnnotation => [
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
        if (strict) {
            return expr.valuedObject.vo.reference
        } else {
            val vo = expr.valuedObject.vo
            if (vo === null) {
                return createBoolValue(true)
            }
            return vo.reference
        }
        
    }

    def dispatch Expression translateExpr(OperatorExpression expr) {
        return createOperatorExpression(expr.operator) => [
            if (operator == OperatorType.BITWISE_AND) operator = OperatorType.LOGICAL_AND
            if (operator == OperatorType.BITWISE_OR) operator = OperatorType.LOGICAL_OR
            it.trace(expr)
            subExpressions.addAll(expr.subExpressions.map[translateExpr])
        ]
    }

    def dispatch Expression translateExpr(Expression expr) {
        return null
    }
}
