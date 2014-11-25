/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitInstance
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.LocalSignal
import de.cau.cs.kieler.esterel.esterel.LoopEach
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import de.cau.cs.kieler.esterel.esterel.LoopDelay
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.DelayEvent
import de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentCase
import de.cau.cs.kieler.esterel.esterel.ElsePart
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.kexpressions.Input
import de.cau.cs.kieler.esterel.kexpressions.Output
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression
import de.cau.cs.kieler.esterel.kexpressions.Signal
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.StatementScope
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import java.util.LinkedList
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.esterel.esterel.AbortInstance
import de.cau.cs.kieler.esterel.esterel.Suspend
import java.util.Stack
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.esterel.WeakAbort
import de.cau.cs.kieler.esterel.esterel.WeakAbortBody
import de.cau.cs.kieler.esterel.esterel.WeakAbortInstance
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl
import java.util.ArrayList
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.Sustain
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.util.KExpressionsAdapterFactory
import de.cau.cs.kieler.core.kexpressions.CombineOperator

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {

    // Label at the end of currently transformed thread
    var String curLabel

    // Saves nesting of preemptive constructs
    var Stack<PreemptiveElement> preemption;

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelMap

    // List of exit signals and the corresponding label
    var HashMap<ISignal, ValuedObject> exitMap

    // List of all locally used variables, used to add them as global declaration after transformation
    var LinkedList<Declaration> localDeclarations

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var LinkedList<Pair<String, ValuedObject>> signalMap
    
    // Maps valued variables to signal
    var HashMap<ValuedObject, Pair<ValuedObject, OperatorType>> valuedMap

    // Flag indicating if optimized transformations should be used
    var boolean opt

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    @Inject
    extension TransformInterface

    @Inject
    extension TransformExpression

    // KiCo
    override EObject transform(EObject eObject, KielerCompilerContext contex) {
        opt = false;
        return transformProgram(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }

    def EObject transformOpt(EObject eObject, KielerCompilerContext contex) {
        opt = true;
        return transformProgram(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }

    public def Program transformProgram(de.cau.cs.kieler.esterel.esterel.Program esterelProgram) {
        System.out.println("Transforming to SCL...")

        // Label at the end of the currently transformed thread if not root thread
        curLabel = null

        // Stack containing information about nesting of preemption
        preemption = new Stack

        // Multimap containing information if certain label is in a thread
        labelMap = HashMultimap.create()

        // Contains informations about which exit expression is represented by which flag
        exitMap = new HashMap<ISignal, ValuedObject>()

        // Local declarated variables/flags
        localDeclarations = new LinkedList<Declaration>

        // Variables are stored as a LinkedList. Signals are keys, the first signal in the returned
        // list for a key is the current variable representing a (local) signal
        signalMap = new LinkedList<Pair<String, ValuedObject>>
        
        valuedMap = new HashMap<ValuedObject, Pair<ValuedObject, OperatorType>>()

        // Does the program terminate?
        var boolean termTmp = true
        if (opt) {
            termTmp = esterelProgram.checkTerminate
        }
        val terminates = termTmp;

        // Create the SCL program
        val program = SclFactory::eINSTANCE.createProgram()

        // Only the first module is considered
        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        valuedMap = transformDeclaration(esterelMod.interface.intSignalDecls, program)

        // Save all declarated valuedObjects to the signalMap
        program.declarations.forEach[valuedObjects.forEach[signalMap.add(it.name -> it)]]

        // Body transformations
        val sSeq = SclFactory::eINSTANCE.createStatementSequence
        esterelMod.body.statements.forEach[transformStm(sSeq)]

        // Add local variable declarations
        program.declarations.addAll(localDeclarations)

        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName(signalMap, "f_term"))
        if (!opt || terminates) {
            f_term.initialValue = createBoolValue(false)
            val decl = createDeclaration => [
                type = ValueType::BOOL
                valuedObjects.add(f_term)
            ]
            program.declarations.add(decl)
        }

        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(program.declarations, f_term, false, terminates))
        par.threads.add(
            SclFactory::eINSTANCE.createThread => [
                statements.addAll(sSeq.statements)
                if (!opt || terminates) {
                    statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
                }
            ])
        program.statements.add(createStmFromInstr(par))

        // Reset labelcount
        resetLabelCount

        // Return the transformed program 
        System.out.println("Transformation to SCL finished")
        program
    }

    /*
     * Creates thread to set output signals to false at the start
     * of every tick
     */
    def Thread handleOutputs(EList<Declaration> decls, ValuedObject f_term, Boolean isLocal, boolean terms) {
        val th = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel

        th.addLabel(l)

        for (decl : decls) {
            if (((decl.output && !decl.input) || isLocal)) {
                for (value : decl.valuedObjects) {
                    th.statements.add(createStmFromInstr(createAssignment(value, createBoolValue(false))))
                }
            }
        }

        if (!opt || terms) {
            th.statements.add(
                createStmFromInstr(
                    ifThenGoto(
                        createOperatorExpression(OperatorType::NOT) => [
                            subExpressions.add(
                                KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                    valuedObject = f_term
                                ])], l, false)))
        } else if (opt && !terms) {
            th.createSclPause
            th.addGoto(l)
        }

        th
    }

    /*
     * Transformation rules
     */
    /*
     * emit s
     */
    def dispatch StatementSequence transformStm(Emit emit, StatementSequence sSeq) {

        //Expression...
        System.out.println("Emit: " + emit.expr)

        // Get the LAST defined valued object (with respect to local signals)
        val variable = signalMap.filter[it.key == emit.signal.name].last.value
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]

        val op = createOperatorExpression(OperatorType::OR) => [
            add(variableRef)
            add(createBoolValue(true))
        ]

        // "emits" the signal by setting it to true
        val setSignal = createStmFromInstr(createAssignment(variable, op))
        
        // Unvalued emit
        if (emit.expr == null) {
            sSeq.statements.add(setSignal)
        }

        // Valued Emit
        else if (emit.expr != null) {
            val s_val = valuedMap.get(variable).key
            val combine = valuedMap.get(variable).value
            val sclExpr = emit.expr.transformExp(signalMap)
            System.out.println("Variable Ref: " + variableRef)
            val cond = SclFactory::eINSTANCE.createConditional => [
                expression = variableRef
                statements += createStmFromInstr(SclFactory::eINSTANCE.createAssignment => [
                    expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                        operator = OperatorType::AND//combine
                        subExpressions.add(createValuedObjectRef(s_val))
                        subExpressions.add(sclExpr)
                    ]
                    valuedObject = s_val
                ])
                System.out.println("s_val: " + s_val)
                System.out.println("op: " + op)
                elseStatements.add(createStmFromInstr(createAssignment(s_val, createBoolValue(true))))
                System.out.println("s_val2: " + s_val)
                System.out.println("op2: " + op)
//                elseStatements.add(createStmFromInstr(createAssignment(s_val, sclExpr)))                
            ]
            sSeq.statements += cond.createStmFromInstr
        }

        sSeq
    }

    /*
     * sustain s
     */
    def dispatch StatementSequence transformStm(Sustain sustain, StatementSequence sSeq) {
        val l = createFreshLabel

        sSeq.addLabel(l)
        val emit = EsterelFactory::eINSTANCE.createEmit => [
            signal = sustain.signal
            expr = sustain.expression
            tick = sustain.tick
        ]
        transformStm(emit, sSeq)
        sSeq.createSclPause
        sSeq.addGoto(l)
         
        sSeq;
    }

    /*
     * p || q
     */
    def dispatch StatementSequence transformStm(Parallel par, StatementSequence sSeq) {
        val sclPar = SclFactory::eINSTANCE.createParallel

        // Save label of parent thread
        val oldEnd = curLabel
        for (thread : par.list) {
            val l = createFreshLabel
            curLabel = l

            val newSclThread = SclFactory::eINSTANCE.createThread
            transformStm(thread, newSclThread)

            newSclThread.addLabel(l)
            sclPar.threads.add(newSclThread);
        }
        curLabel = oldEnd
        sSeq.statements.add(createStmFromInstr(sclPar))

        // Insert some stuff after join for preemptive statements
        handlePreemtion(null, preemption.length - 1, sSeq)

        sSeq
    }

    /*
     * p; q
     */
    def dispatch StatementSequence transformStm(Sequence seq, StatementSequence sSeq) {
        seq.list.forEach[transformStm(sSeq)]

        sSeq
    }

    /*
     * await (immediate) s
     */
    def dispatch StatementSequence transformStm(Await await, StatementSequence sSeq) {
        if (await.body instanceof AwaitCase) {
            return handleAwaitCase((await.body as AwaitCase), sSeq)
        } else if (await.body instanceof AwaitInstance) {
            return handleAwaitInstance(await.body as AwaitInstance, sSeq)
        }
    }

    /*
     * Await Case
     * Cases are handled in a "break" style; if a case is taken, a goto to the end of the
     * statement is taken
     */
    def StatementSequence handleAwaitCase(AwaitCase awaitCase, StatementSequence sSeq) {
        val l_start = createFreshLabel
        val l_end = createFreshLabel

        // Flag indicating, if also delayed await cases may be taken
        val delayedFlag = createValuedObject(uniqueName(signalMap, "f_immediate"))
        delayedFlag.initialValue = createBoolValue(false)
        signalMap.add(delayedFlag.name -> delayedFlag)

        localDeclarations += KExpressionsFactory::eINSTANCE.createDeclaration => [
            valuedObjects.add(delayedFlag)
            output = true
            type = ValueType::BOOL
        ]

        sSeq.addLabel(l_start)

        for (singleCase : awaitCase.cases) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                if (!singleCase.delay.isImmediate) {
                    expression = createOperatorExpression(OperatorType::AND) => [
                        add(transformExp(singleCase.delay.event.expr, signalMap))
                        add(delayedFlag.createValuedObjectRef)
                    ]
                } else {
                    expression = transformExp(singleCase.delay.event.expr, signalMap)
                }
                statements.addAll(transformStm(singleCase.statement, createSseq).statements)
                statements.add(createGotoStm(l_end))
            ]
            sSeq.statements.add(createStmFromInstr(cond))
        }

        sSeq.createSclPause
        val op = createOperatorExpression(OperatorType::OR) => [
            add(createValuedObjectRef(delayedFlag))
            add(createBoolValue(true))
        ]
        sSeq.statements.add(createStmFromInstr(createAssignment(delayedFlag, op)))
        sSeq.addGoto(l_start)
        sSeq.addLabel(l_end)

        sSeq
    }

    /*
     * Await instance
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await, StatementSequence sSeq) {
        val l = createFreshLabel

        sSeq.addLabel(l)

        if (!await.delay.isImmediate) {
            sSeq.createSclPause
        }

        val b = createOperatorExpression(OperatorType::NOT) => [
            subExpressions.add(transformExp(await.delay.event.expr, signalMap))
        ]

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = b
            if (await.delay.isImmediate) {
                statements.addAll(createSclPause(createSseq).statements)
            }
            statements.add(createGotoStm(l))
        ]

        sSeq.statements += createStmFromInstr(cond)

        sSeq
    }

    /*
     * loop p end
     */
    def dispatch StatementSequence transformStm(Loop loop, StatementSequence sSeq) {

        // loop p each s
        if (loop.end instanceof LoopDelay) {
            return handleLoopEach(loop, (loop.end as LoopDelay).delay, sSeq)
        }

        val l = createFreshLabel

        sSeq.addLabel(l)

        transformStm(loop.body.statement, sSeq)

        sSeq.addGoto(l)

        // TODO Remove pseudo conditional when scg unreachable code is fixed
        //        sSeq.statements.add(
        //            createStmFromInstr(
        //                SclFactory::eINSTANCE.createConditional => [
        //                    expression = createBoolValue(true)
        //                    statements.add(createGotoStm(l))
        //                ]))
        sSeq
    }

    /*
     * loop p each s
     * Simply transforms the loop each to kernel statements and transforms them to SCL
     */
    def StatementSequence handleLoopEach(Loop loop, DelayExpr s, StatementSequence sSeq) {
        val newLoop = EsterelFactory::eINSTANCE.createLoop => [
            body = EsterelFactory::eINSTANCE.createLoopBody => [
                statement = EsterelFactory::eINSTANCE.createAbort => [
                    body = EsterelFactory::eINSTANCE.createAbortInstance => [
                        delay = EsterelFactory::eINSTANCE.createDelayExpr => [
                            event = EsterelFactory::eINSTANCE.createDelayEvent => [
                                expr = s.event.expr
                            ]
                        ]
                    ]
                    statement = EsterelFactory::eINSTANCE.createSequence => [
                        list.add(loop.body.statement)
                        list.add(EsterelFactory::eINSTANCE.createHalt)
                    ]
                ]
            ]
        ]
        return transformStm(newLoop, sSeq)
    }

    /*
     * every s do p
     * Simply transforms the every to kernel statements and transforms them to SCL
     */
    def dispatch StatementSequence transformStm(EveryDo everyDo, StatementSequence sSeq) {
        val stm = EsterelFactory::eINSTANCE.createSequence => [
            list.add(
                EsterelFactory::eINSTANCE.createAwait => [
                    body = EsterelFactory::eINSTANCE.createAwaitInstance => [
                        delay = EcoreUtil.copy(everyDo.delay)
                    ]
                ])
            list.add(
                EsterelFactory::eINSTANCE.createLoop => [
                    body = EsterelFactory::eINSTANCE.createLoopBody => [
                        statement = everyDo.statement
                    ]
                    end = EsterelFactory::eINSTANCE.createLoopDelay => [
                        delay = everyDo.delay
                    ]
                ])
        ]

        return transformStm(stm, sSeq)
    }

    /*
     * pause
     */
    def dispatch StatementSequence transformStm(Pause pause, StatementSequence sSeq) {
        sSeq.createSclPause

        sSeq
    }

    /*
     * Creates an scl pause statement with respect to surrounding preemption
     */
    def StatementSequence createSclPause(StatementSequence sSeq) {
        return handlePreemtion(SclFactory::eINSTANCE.createPause, preemption.length - 1, sSeq)
    }

    /*
     * Iterates through stack containing information about nesting of abort and suspend.
     * Is used for pause creation to respect right order of preemptive gotos
     */
    def StatementSequence handlePreemtion(Instruction instr, int i, StatementSequence sSeq) {

        // Add the instruction
        if (i < 0) {
            if (instr == null) {
                return sSeq
            } else {
                sSeq.statements.add(createStmFromInstr(instr))
                return sSeq
            }
        } else {

            // Handle Abort
            if (preemption.get(i).type == "ABORT") {
                return handleAbort(instr, i, sSeq)

            // Handle Suspend; suspend does not manipulate joins, so instr should not be null
            } else if (preemption.get(i).type == "SUSPEND" && instr != null) {
                return handleSuspend(instr, i, sSeq)

            // Handle weak immediate abort for Pause statements
            } else if (preemption.get(i).type == "WEAK_IMMEDIATE_ABORT" && instr != null) {
                return handleWeakImmediateAbortPause(instr, i, sSeq)

            // Handle weak immediate abort for join
            } else if (preemption.get(i).type == "WEAK_IMMEDIATE_ABORT" && instr == null) {
                return handleWeakImmediateAbortJoin(instr, i, sSeq)

            // Handle weak delayed abort for Pause statements
            } else if (preemption.get(i).type == "WEAK_DELAYED_ABORT" && instr != null) {
                return handleWeakAbortPause(instr, i, sSeq)

            // Handle weak delayed abort for join
            } else if (preemption.get(i).type == "WEAK_DELAYED_ABORT" && instr == null) {
                return handleWeakAbortJoin(instr, i, sSeq)

            // Handle trap
            } else if (preemption.get(i).type == "TRAP") {
                return handleTrap(instr, i, sSeq)
            } else {
                return sSeq
            }
        }
    }

    /*
     * Handler for strong abortion
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleAbort(Instruction instr, int i, StatementSequence sSeq) {
        if (instr != null)
            handlePreemtion(instr, i - 1, sSeq)

        if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
            sSeq.statements.add(
                createStmFromInstr(
                    ifThenGoto(transformExp(preemption.get(i).expression, signalMap), preemption.get(i).endLabel,
                        true)))
        } else {
            sSeq.statements.add(
                createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, signalMap), curLabel, true)))
        }

        if (instr == null)
            handlePreemtion(instr, i - 1, sSeq)

        sSeq
    }

    /*
     * Handler for weak delayed abortion
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     * TODO test, depth not set for every single thread
     */
    def StatementSequence handleWeakAbortPause(Instruction instr, int i, StatementSequence sSeq) {
        val f_wa = preemption.get(i).flag1.createValuedObjectRef
        val f_depth = preemption.get(i).flag2.createValuedObjectRef
        System.out.println("FWA: " + f_wa)
        sSeq.add(
            SclFactory::eINSTANCE.createConditional => [
                statements.add(
                    createStmFromInstr(
                        createAssignment(f_wa.valuedObject,
                            createOperatorExpression(OperatorType::OR) => [
                                add(EcoreUtil.copy(f_wa))
                                add(createBoolValue(true))
                            ])))
                expression = and(preemption.get(i).expression.transformExp(signalMap), f_depth)
                statements.add(createGotoj(preemption.get(i).endLabel, curLabel, labelMap))
            ])

        handlePreemtion(instr, i - 1, sSeq)

        sSeq.add(createAssignment(preemption.get(i).flag2, createBoolValue(true)))

        sSeq
    }

    /*
     * Handler for weak delayed abortion
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleWeakAbortJoin(Instruction instr, int i, StatementSequence sSeq) {
        handlePreemtion(instr, i - 1, sSeq)

        sSeq.add(
            SclFactory::eINSTANCE.createConditional => [
                expression = preemption.get(i).flag1.createValuedObjectRef
                statements.add(createGotoj(preemption.get(i).endLabel, curLabel, labelMap))
            ])

        sSeq
    }

    /*
     * Handler for strong suspend
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleSuspend(Instruction instr, int i, StatementSequence sSeq) {
        val l = createFreshLabel
        sSeq.addLabel(l)
        handlePreemtion(instr, i - 1, sSeq)
        sSeq.statements.add(
            createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, signalMap), l, true)))

        sSeq
    }

    /*
     * Handler for pause for weak immediate abort
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleWeakImmediateAbortPause(Instruction instr, int i, StatementSequence sSeq) {

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = transformExp(preemption.get(i).expression, signalMap)
            statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createAssignment => [
                        valuedObject = preemption.get(i).flag1
                        expression = or(
                            KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                valuedObject = preemption.get(i).flag1
                            ], createBoolValue(true))
                    ]))
            if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
                statements.add(createGotoStm(preemption.get(i).endLabel))
            } else {
                statements.add(createGotoStm(curLabel))
            }
        ];
        sSeq.statements.add(createStmFromInstr(cond))
        handlePreemtion(instr, i - 1, sSeq)

        sSeq
    }

    /*
     * Handler for traps
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleTrap(Instruction instr, int i, StatementSequence sSeq) {

        // Handling join
        if (instr == null)
            handlePreemtion(instr, i - 1, sSeq)

        val flagRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = preemption.get(i).flag1
        ]
        if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
            sSeq.statements.add(createStmFromInstr(ifThenGoto(flagRef, preemption.get(i).endLabel, true)))
        } else {
            sSeq.statements.add(createStmFromInstr(ifThenGoto(flagRef, curLabel, true)))
        }

        // Handling pause
        if (instr != null)
            handlePreemtion(instr, i - 1, sSeq)

        sSeq
    }

    /*
     * Handler for join for weak immediate abort
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleWeakImmediateAbortJoin(Instruction instr, int i, StatementSequence sSeq) {

        // TODO addall needed?
        sSeq.statements.addAll(handlePreemtion(instr, i - 1, sSeq).statements)
        val f_wa_ref = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = preemption.get(i).flag1
        ]
        if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
            sSeq.statements.add(
                createStmFromInstr(ifThenGoto(f_wa_ref, preemption.get(i).endLabel, true)))
        } else {
            sSeq.statements.add(createStmFromInstr(ifThenGoto(f_wa_ref, curLabel, true)))
        }

        sSeq
    }

    /*
     * nothing
     */
    def dispatch StatementSequence transformStm(Nothing nothing, StatementSequence sSeq) {
        sSeq
    }

    /*
     * halt
     */
    def dispatch StatementSequence transformStm(Halt halt, StatementSequence sSeq) {
        val l = createFreshLabel
        sSeq.addLabel(l)
        sSeq.createSclPause
        sSeq.addGoto(l)

        sSeq
    }

    /*
     * [ ... ]
     */
    def dispatch StatementSequence transformStm(Block block, StatementSequence sSeq) {
        transformStm(block.statement, sSeq)
    }

    /*
     * present
     * 
     * TODO test
     */
    def dispatch StatementSequence transformStm(Present pres, StatementSequence sSeq) {

        //present s then p (else q)
        if (pres.body instanceof PresentEventBody) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                expression = transformExp((pres.body as PresentEventBody).event.expression, signalMap)
                if ((pres.body as PresentEventBody).thenPart != null) {
                    val thenPart = SclFactory::eINSTANCE.createStatementSequence

                    //TODO maybe bad...
                    transformStm((pres.body as PresentEventBody).thenPart.statement, thenPart)
                    statements.addAll(thenPart.statements)
                }
                if (pres.elsePart != null) {
                    val elsePart = SclFactory::eINSTANCE.createStatementSequence
                    transformStm(pres.elsePart.statement, elsePart)
                    elseStatements.addAll(elsePart.statements)
                }
            ]
            sSeq.statements.add(createStmFromInstr(cond))

            return sSeq
        }
        //present case s do ...
        else if (pres.body instanceof PresentCaseList) {
            val cond = handleCaseList((pres.body as PresentCaseList).cases, 0, pres.elsePart)
            sSeq.statements.add(createStmFromInstr(cond))
            return sSeq
        }
    }

    /*
     * Creates nested conditional equivalent to cases list
     */
    def Conditional handleCaseList(EList<PresentCase> cases, int idx, ElsePart elsePart) {
        if (cases.length > idx + 1) {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression, signalMap)
                statements.addAll(transformStm(cases.get(idx).statement, createSseq).statements)
                elseStatements.addAll(createStmFromInstr(handleCaseList(cases, idx + 1, elsePart)))
            ]
        } else {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression, signalMap)
                statements.addAll(transformStm(cases.get(idx).statement, createSseq).statements)
                if (elsePart != null) {
                    elseStatements.addAll(transformStm(elsePart.statement, createSseq).statements)
                }
            ]
        }
    }

    /*
     * signal s in p end
     */
    def dispatch StatementSequence transformStm(LocalSignalDecl signal, StatementSequence sSeq) {
        val decl = createDeclaration => [
            type = ValueType::BOOL
            output = true
        ]
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(uniqueName(signalMap, s.name))
            decl.valuedObjects.add(obj)
            signalMap.add(s.name -> obj)
        }
        localDeclarations.add(decl)

        transformStm(signal.statement, sSeq)
        (signal.signalList as LocalSignal).signal.forEach[signalMap.removeLast]

        sSeq
    }

    /*
     * abort p when s
     * TODO merge weak and strong abort
     * TODO add weak delayed abort
     */
    def dispatch StatementSequence transformStm(Abort abort, StatementSequence sSeq) {

        val l = createFreshLabel
        labelMap.put(curLabel, l)
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Weak immediate abort
        if (abort.body instanceof WeakAbortInstance && ((abort.body as AbortInstance).delay.isImmediate)) {
            System.out.println("Weak Immediate Abort " + abort.statement)

            val f_wa = createValuedObject(uniqueName(signalMap, "f_wa"))
            f_wa.initialValue = createBoolValue(false);
            preemption.push(new PreemptiveElement("WEAK_IMMEDIATE_ABORT", l, abortExpr, f_wa, null))

            localDeclarations.add(
                KExpressionsFactory::eINSTANCE.createDeclaration => [
                    type = ValueType::BOOL;
                    output = true
                    valuedObjects.add(f_wa)
                ])

            transformStm(abort.statement, sSeq)

        // Weak delayed abort
        } else if (abort.body instanceof WeakAbortInstance) {

            // TODO implement
            val f_wa = createValuedObject(uniqueName(signalMap, "f_wa"))
            val f_depth = createValuedObject(uniqueName(signalMap, "f_depth"))
            preemption.push(new PreemptiveElement("WEAK_DELAYED_ABORT", l, abortExpr, f_wa, f_depth))

            localDeclarations.add(
                KExpressionsFactory::eINSTANCE.createDeclaration => [
                    type = ValueType::BOOL;
                    output = true
                    valuedObjects.add(f_wa)
                    valuedObjects.add(f_depth)
                ])

            transformStm(abort.statement, sSeq)

        // Strong abort
        } else {
            System.out.println("Abort " + abort.statement)

            preemption.push(new PreemptiveElement("ABORT", l, abortExpr, null, null))

            if ((abort.body as AbortInstance).delay.isImmediate) {
                sSeq.statements.add(
                    createStmFromInstr(
                        ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr, signalMap), l, true)))
            }

            transformStm(abort.statement, sSeq)
        }
        preemption.pop
        sSeq.addLabel(l)

        sSeq
    }

    /*
      * suspend p when s
      */
    def dispatch StatementSequence transformStm(Suspend susp, StatementSequence sSeq) {
        if (susp.delay.isImmediate) {
            val l = createFreshLabel
            sSeq.addLabel(l)

            sSeq.statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createConditional => [
                        expression = transformExp(susp.delay.event.expr, signalMap)
                        statements.addAll(createSclPause.statements)
                        statements.add(createGotoStm(l))]))
        }

        preemption.push(new PreemptiveElement("SUSPEND", null, susp.delay.event.expr, null, null))
        transformStm(susp.statement, sSeq)
        preemption.pop

        sSeq
    }

    /*
     * Trap s in p end
     */
    def dispatch StatementSequence transformStm(Trap trap, StatementSequence sSeq) {
        System.out.println("It's a trap")

        val f_s = createValuedObject(uniqueName(signalMap, trap.trapDeclList.trapDecls.head.name))
        signalMap.add(f_s.name -> f_s);
        val l = createFreshLabel
        labelMap.put(curLabel, l)

        localDeclarations.add(
            KExpressionsFactory::eINSTANCE.createDeclaration => [
                type = ValueType::BOOL;
                output = true
                f_s.initialValue = createBoolValue(false)
                valuedObjects.add(f_s)
            ])

        preemption.push(new PreemptiveElement("TRAP", l, null, f_s, null))

        for (decl : trap.trapDeclList.trapDecls) {
            exitMap.put(decl, f_s)
        }
        trap.statement.transformStm(sSeq)
        preemption.pop

        sSeq.addLabel(l)

        sSeq
    }

    def dispatch StatementSequence transformStm(Exit exit, StatementSequence sSeq) {
        val variable = exitMap.get(exit.trap)
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]
        val op = createOperatorExpression(OperatorType::OR) => [
            add(variableRef)
            add(createBoolValue(true))
        ]

        sSeq.statements.add(createStmFromInstr(createAssignment(variable, op)))

        val l = preemption.filter[flag1 == variable].head.endLabel

        // Just tmp; remove if unreachable node bug fixed
        //        sSeq.statements.add(createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
        //            expression = createBoolValue(true)
        sSeq.statements.add(createGotoj(l, curLabel, labelMap))

        //        ]))
        return sSeq
    }

    override getDependencies() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

    override getId() {
        "ESTERELTOSCL"
    }

    override getName() {
        "SCL"
    }
}
