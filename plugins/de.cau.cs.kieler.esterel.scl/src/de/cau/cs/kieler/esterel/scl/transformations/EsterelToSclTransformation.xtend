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

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {

    // Global variables
    var LinkedList<ValuedObject> variables

    // Label at the end of currently transformed thread
    var String curLabel

    // Saves nesting of preemptive constructs
    var Stack<PreemptiveElement> preemption;

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelMap

    // List of exit signals and the corresponding label
    var Multimap<ISignal, ValuedObject> exitMap

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
        return transformProgram(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }

    public def Program transformProgram(de.cau.cs.kieler.esterel.esterel.Program esterelProgram) {
        System.out.println("Transforming to SCL...")

        // Initialize class variables
        variables = new LinkedList<ValuedObject>
        curLabel = "f_term"
        preemption = new Stack
        labelMap = HashMultimap.create()
        exitMap = HashMultimap.create()

        // Create the SCL program
        val program = SclFactory::eINSTANCE.createProgram()

        // Only the first module is considered
        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        transformDeclaration(esterelMod.interface.intSignalDecls, program)

        // TODO better
        for (decl : program.declarations) {
            variables.addAll(decl.valuedObjects)
        }

        // Body transformations
        val body = SclFactory::eINSTANCE.createStatementSequence
        esterelMod.body.statements.forEach[transformStm(body)]

        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName(variables, "f_term"))
        val decl = createDeclaration => [
            type = ValueType::BOOL
            valuedObjects.add(f_term)
        ]
        program.declarations.add(decl)

        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(program.declarations, f_term, false))
        par.threads.add(
            SclFactory::eINSTANCE.createThread => [
                statements.addAll(body.statements)
                statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
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
    def Thread handleOutputs(EList<Declaration> decls, ValuedObject f_term, Boolean isLocal) {
        val sSeq = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel

        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        for (decl : decls) {
            if ((decl.output == true && decl.input == false) || isLocal) {
                for (value : decl.valuedObjects) {
                    sSeq.statements.add(createStmFromInstr(createAssignment(value, createBoolValue(false))))
                }
            }
        }

        sSeq.statements.add(
            createStmFromInstr(
                ifThenGoto(
                    createOperatorExpression(OperatorType::NOT) => [
                        subExpressions.add(
                            KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                valuedObject = f_term
                            ])], l, false)))

        sSeq
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
        val variable = getValuedObject(variables, emit.signal.name)
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]

        // Unvalued Emit
        if (emit.expr == null) {
            val op = createOperatorExpression(OperatorType::OR) => [
                add(variableRef)
                add(createBoolValue(true))
            ]

            sSeq.statements.add(createStmFromInstr(createAssignment(variable, op)))
        }
        // Valued Emit
        else {
            sSeq.statements.add(createStmFromInstr(createAssignment(variable, transformExp(emit.expr, variables))))
        }

        sSeq
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

            newSclThread.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            sclPar.threads.add(newSclThread);
        }
        curLabel = oldEnd
        sSeq.statements.add(createStmFromInstr(sclPar))
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
        val delayedFlag = createValuedObject(uniqueName(variables, "f_immediate"))
        delayedFlag.initialValue = createBoolValue(false)
        variables.add(delayedFlag)

        val sScope = SclFactory::eINSTANCE.createStatementScope => [
            declarations.add(
                KExpressionsFactory::eINSTANCE.createDeclaration => [
                    valuedObjects.add(delayedFlag)
                    type = ValueType::BOOL
                ])
        ]

        sScope.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l_start
            ])

        for (singleCase : awaitCase.cases) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                if (!singleCase.delay.isImmediate) {
                    expression = createOperatorExpression(OperatorType::AND) => [
                        add(transformExp(singleCase.delay.event.expr, variables))
                        add(delayedFlag.createValuedObjectRef)
                    ]
                } else {
                    expression = transformExp(singleCase.delay.event.expr, variables)
                }
                statements.addAll(transformStm(singleCase.statement, createSseq).statements)
                statements.add(
                    createStmFromInstr(
                        SclFactory::eINSTANCE.createGoto => [
                            targetLabel = l_end
                        ]))
            ]
            sScope.statements.add(createStmFromInstr(cond))
        }

        sScope.createSclPause
        sScope.statements.add(createStmFromInstr(createAssignment(delayedFlag, createBoolValue(true))))
        sScope.statements.add(
            createStmFromInstr(
                SclFactory::eINSTANCE.createGoto => [
                    targetLabel = l_start
                ]))

        sScope.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l_end
            ])

        sSeq.statements.add(createStmFromInstr(sScope))
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

        val gotoStm = createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ])

        val b = createOperatorExpression(OperatorType::NOT) => [
            subExpressions.add(transformExp(await.delay.event.expr, variables))
        ]

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = b
            if (await.delay.isImmediate) {
                statements.addAll(createSclPause(createSseq).statements)
            }
            statements.add(gotoStm)
        ]

        sSeq.statements.add(createStmFromInstr(cond))

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

        // TODO Remove pseudo conditional when scg unreachable code is fixed
        sSeq.statements.add(
            createStmFromInstr(
                SclFactory::eINSTANCE.createConditional => [
                    expression = createBoolValue(true)
                    statements.add(createGotoStm(l))
                ]))
                
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
            System.out.println(everyDo.delay.event.expr)
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
     * TODO thread as argument
     */
    def StatementSequence createSclPause(StatementSequence sSeq) {
        return handlePreemtion(SclFactory::eINSTANCE.createPause, preemption.length - 1, sSeq)
    }

    /*
     * Iterates through stack containing information about nesting of abort and suspend.
     * Is used for pause creation to respect right order of preemptive gotos
     * TODO thread as argument
     * TODO some lambda stuff
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
        handlePreemtion(instr, i - 1, sSeq)
        if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
            sSeq.statements.add(
                createStmFromInstr(
                    ifThenGoto(transformExp(preemption.get(i).expression, variables), preemption.get(i).endLabel,
                        true)))
        } else {
            sSeq.statements.add(
                createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, variables), curLabel, true)))
        }

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
            createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, variables), l, true)))

        sSeq
    }

    /*
     * Handler for pause for weak immediate abort
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleWeakImmediateAbortPause(Instruction instr, int i, StatementSequence sSeq) {

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = transformExp(preemption.get(i).expression, variables)
            statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createAssignment => [
                        valuedObject = preemption.get(i).flag
                        expression = or(
                            KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                valuedObject = preemption.get(i).flag
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
     * Handler for join for weak immediate abort
     * @param instr The instruction to be handled
     * @param i Position in preemptive stack to be handled
     */
    def StatementSequence handleWeakImmediateAbortJoin(Instruction instr, int i, StatementSequence sSeq) {
        sSeq.statements.addAll(handlePreemtion(instr, i - 1, sSeq).statements)
        val f_wa_ref = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = preemption.get(i).flag
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
                expression = transformExp((pres.body as PresentEventBody).event.expression, variables)
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
                expression = transformExp(cases.get(idx).event.expression, variables)
                statements.addAll(transformStm(cases.get(idx).statement, createSseq).statements)
                elseStatements.addAll(createStmFromInstr(handleCaseList(cases, idx + 1, elsePart)))
            ]
        } else {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression, variables)
                statements.addAll(transformStm(cases.get(idx).statement, createSseq).statements)
                if (elsePart != null) {
                    elseStatements.addAll(transformStm(elsePart.statement, createSseq).statements)
                }
            ]
        }
    }

    /*
     * signal s in p end
     * TODO sometimes behaves strange; maybe xtext parsing error?
     */
    def dispatch StatementSequence transformStm(LocalSignalDecl signal, StatementSequence sSeq) {
        val sScope = SclFactory::eINSTANCE.createStatementScope

        val decl = createDeclaration => [
            type = ValueType::BOOL
        ]
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(s.name)
            decl.valuedObjects.add(obj)
            variables.add(obj)
        }

        // indicates if signal body has terminated
        val f_term = createValuedObject(uniqueName(variables, "f_term"))
        variables.add(f_term)

        sScope.declarations.add(decl)

        // Add reset thread for signals       
        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(sScope.declarations, f_term, true))
        par.threads.add(
            SclFactory::eINSTANCE.createThread => [
                val list = createSseq
                transformStm(signal.statement, list)
                statements.addAll(list.statements)
                statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
            ])
        sScope.declarations.add(
            KExpressionsFactory::eINSTANCE.createDeclaration => [
                valuedObjects.add(f_term);
                type = ValueType::BOOL
            ])
        sScope.statements.add(createStmFromInstr(par))

        sSeq.statements.add(createStmFromInstr(sScope))
        sSeq
    }

    /*
     * abort p when s
     * TODO merge weak and strong abort
     */
    def dispatch StatementSequence transformStm(Abort abort, StatementSequence sSeq) {

        val l = createFreshLabel
        labelMap.put(curLabel, l)

        // Weak immediate abort
        if (abort.body instanceof WeakAbortInstance && ((abort.body as AbortInstance).delay.isImmediate)) {
            System.out.println("Weak Immediate Abort " + abort.statement)

            val f_wa = createValuedObject(uniqueName(variables, "f_wa"))
            val abortExpr = (abort.body as AbortInstance).delay.event.expr
            preemption.push(new PreemptiveElement("WEAK_IMMEDIATE_ABORT", l, abortExpr, f_wa))

            val ret = SclFactory::eINSTANCE.createStatementScope

            // TODO should also not be overwritten by local signal declarations within abort body...
            ret.declarations.add(
                KExpressionsFactory::eINSTANCE.createDeclaration => [
                    type = ValueType::BOOL;
                    valuedObjects.add(f_wa)
                ])

            transformStm(abort.statement, ret)

            sSeq.statements.add(createStmFromInstr(ret))

        // Strong abort
        } else {
            System.out.println("Abort " + abort.statement)

            preemption.push(new PreemptiveElement("ABORT", l, (abort.body as AbortInstance).delay.event.expr, null))

            if ((abort.body as AbortInstance).delay.isImmediate) {
                sSeq.statements.add(
                    createStmFromInstr(
                        ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr, variables), l, true)))
            }

            transformStm(abort.statement, sSeq)
        }
        preemption.pop
        System.out.println("Ret " + sSeq.statements.length)
        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])
        sSeq
    }

    /*
      * suspend p when s
      */
    def dispatch StatementSequence transformStm(Suspend susp, StatementSequence sSeq) {
        if (susp.delay.isImmediate) {
            val l = createFreshLabel
            sSeq.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            sSeq.statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createConditional => [
                        expression = transformExp(susp.delay.event.expr, variables)
                        statements.addAll(createSclPause.statements)
                        statements.add(
                            createStmFromInstr(
                                SclFactory::eINSTANCE.createGoto => [
                                    targetLabel = l
                                ]))]))
        }

        preemption.push(new PreemptiveElement("SUSPEND", null, susp.delay.event.expr, null))
        transformStm(susp.statement, sSeq)
        preemption.pop

        sSeq
    }

    /*
     * Trap s in p end
     * TODO more than one trapdecl?
     * TODO implement
     */
    def dispatch StatementSequence transformStm(Trap trap, StatementSequence sSeq) {
        System.out.println("It's a trap")
        System.out.println("Decl List: " + trap.trapDeclList.trapDecls)

        //        System.out.println("Decl List: " + trap.trapHandler.head.trapExpr) //null
        val sScope = SclFactory::eINSTANCE.createStatementScope

        val f_s = createValuedObject(uniqueName(variables, trap.trapDeclList.trapDecls.head.name))
        variables.add(f_s);
        val l = createFreshLabel

        // TODO should also not be overwritten by local signal declarations within abort body...
        sScope.declarations.add(
            KExpressionsFactory::eINSTANCE.createDeclaration => [
                type = ValueType::BOOL;
                f_s.initialValue = createBoolValue(false)
                valuedObjects.add(f_s)
            ])

        preemption.push(new PreemptiveElement("TRAP", l, null, f_s))

        //TODO support more than one signal declaration
        exitMap.put(trap.trapDeclList.trapDecls.head, f_s)
        trap.statement.transformStm(sSeq)
        preemption.pop

        return sSeq
    }

    def dispatch StatementSequence transformStm(Exit exit, StatementSequence sSeq) {
        val variable = exitMap.get(exit.trap).head
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]
        val op = createOperatorExpression(OperatorType::OR) => [
            add(variableRef)
            add(createBoolValue(true))
        ]

        sSeq.statements.add(createStmFromInstr(createAssignment(variable, op)))

        return null
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
