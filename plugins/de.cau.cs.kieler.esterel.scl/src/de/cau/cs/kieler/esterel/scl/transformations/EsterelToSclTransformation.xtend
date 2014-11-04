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

        // Create the SCL program
        val program = SclFactory::eINSTANCE.createProgram()

        // Only the first module is considered
        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        // transformDeclarations for old version
        transformDeclaration(esterelMod.interface.intSignalDecls, program)
        System.out.println("Declarations: " + program.declarations)

        // TODO better
        for (decl : program.declarations) {
            variables.addAll(decl.valuedObjects)
        }

        // Body transformations
        val body = SclFactory::eINSTANCE.createStatementSequence
        esterelMod.body.statements.forEach [transformStm(body)]
//        for (stm : esterelMod.body.statements) {
//            transformStm(stm, body);
//        }

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
            val newSseq = SclFactory::eINSTANCE.createStatementSequence
            transformStm(thread, newSseq)
            val newSclThread = SclFactory::eINSTANCE.createThread => [
                statements.addAll(newSseq.statements)
            ]

            newSclThread.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            sclPar.threads.add(newSclThread);
        }
        curLabel = oldEnd
        sSeq.statements.add(createStmFromInstr(sclPar))
        sSeq.statements.addAll(handlePreemtion(null, preemption.length - 1).statements)

        sSeq
    }

    /*
     * p; q
     */
    def dispatch StatementSequence transformStm(Sequence seq, StatementSequence sSeq) {
        for (stm : seq.list) {
            transformStm(stm, sSeq)
        }

        sSeq
    }

    /*
     * await (immediate) s
     */
    def dispatch StatementSequence transformStm(Await await, StatementSequence sSeq) {
        if (await.body instanceof AwaitCase) {

            //            val sSeq = SclFactory::eINSTANCE.createStatementSequence
            val l = createFreshLabel
            sSeq.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            val presentCases = transformStm(awaitToPresentCase(await.body as AwaitCase), createSseq)

            // Loop if no case was taken
            // TODO beautify
            ((presentCases.statements.head as InstructionStatement).instruction as Conditional).elseStatements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createGoto => [
                        targetLabel = l
                    ]))

            sSeq.statements.addAll(presentCases.statements)
            return sSeq
        } else if (await.body instanceof AwaitInstance) {
            return handleAwaitInstance(await.body as AwaitInstance, sSeq)
        }
    }

    /*
     * Await instance
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await, StatementSequence sSeq) {

        //        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        val l = createFreshLabel

        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        if (!await.delay.isImmediate) {
            sSeq.statements.addAll(createSclPause.statements)
        }

        val gotoStm = SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ]
        ]

        val b = createOperatorExpression(OperatorType::NOT) => [
            subExpressions.add(transformExp(await.delay.event.expr, variables))
        ]

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = b
            if (await.delay.isImmediate) {
                statements.addAll(createSclPause.statements)
            }
            statements.add(gotoStm)
        ]

        sSeq.statements.add(
            SclFactory::eINSTANCE.createInstructionStatement => [
                instruction = cond
            ])

        sSeq
    }

    /*
     * Creates a present case from await case
     */
    def Present awaitToPresentCase(AwaitCase cases) {
        val pres = EsterelFactory::eINSTANCE.createPresent
        val body = EsterelFactory::eINSTANCE.createPresentCaseList

        for (singleCase : cases.cases) {
            body.cases.add(
                EsterelFactory::eINSTANCE.createPresentCase => [
                    event = EsterelFactory::eINSTANCE.createPresentEvent => [
                        expression = singleCase.delay.event.expr
                    ]
                    statement = singleCase.statement
                ])
        }
        pres.body = body

        pres
    }

    /*
     * loop p end
     */
    def dispatch StatementSequence transformStm(Loop loop, StatementSequence sSeq) {

        // loop p each s
        if (loop.end != null) {
            return handleLoopEach(loop, (loop.end as LoopDelay).delay, sSeq)
        }

        val l = createFreshLabel

        //        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])
        transformStm(loop.body.statement, sSeq)

        // TODO Remove pseudo conditional when scg unreachable code is fixed
        sSeq.statements.add(
            createStmFromInstr(
                SclFactory::eINSTANCE.createConditional => [
                    expression = createBoolValue(true)
                    statements.add(
                        createStmFromInstr(
                            SclFactory::eINSTANCE.createGoto => [
                                targetLabel = l
                            ]))
                ]))
        System.out.println("4")
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
        System.out.println(everyDo.delay)
        System.out.println(everyDo.delay.event)
        System.out.println(everyDo.delay.event.expr)
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
        sSeq.statements.addAll(createSclPause.statements)
        return sSeq
    }

    /*
     * Creates an scl pause statement with respect to surrounding preemption
     * TODO thread as argument
     */
    def StatementSequence createSclPause() {
        return handlePreemtion(SclFactory::eINSTANCE.createPause, preemption.length - 1)
    }

    /*
     * Iterates through stack containing information about nesting of abort and suspend.
     * Is used for pause creation to respect right order of preemptive gotos
     * TODO thread as argument
     * TODO some lambda stuff
     * TODO divide
     */
    def StatementSequence handlePreemtion(Instruction instr, int i) {
        // Add the instruction
        if (i < 0) {
            if (instr == null) {
                return SclFactory::eINSTANCE.createStatementSequence
            } else {
                createSseq(createStmFromInstr(instr))
            }
        } else {
            // Handle Abort
            if (preemption.get(i).type == "ABORT") {
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                    if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
                        statements.add(
                            createStmFromInstr(
                                ifThenGoto(transformExp(preemption.get(i).expression, variables), preemption.get(i).endLabel, true)))
                    } else {
                        statements.add(
                            createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, variables), curLabel, true)))
                    }
                ]
            // Handle Suspend; suspend does not manipulate joins, so instr should not be null
            } else if (preemption.get(i).type == "SUSPEND" && instr != null) {
                val l = createFreshLabel
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.add(
                        SclFactory::eINSTANCE.createEmptyStatement => [
                            label = l
                        ])
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                    statements.add(createStmFromInstr(ifThenGoto(transformExp(preemption.get(i).expression, variables), l, true)))
                ]
            // Handle weak immediate abort for Pause statements
            } else if (preemption.get(i).type == "WEAK_IMMEDIATE_ABORT" && instr != null) {
                System.out.println("Weaky")

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
                        statements.add(
                            createStmFromInstr(
                                SclFactory::eINSTANCE.createGoto => [
                                    targetLabel = preemption.get(i).endLabel
                                ]))
                    } else {
                        statements.add(
                            createStmFromInstr(
                                SclFactory::eINSTANCE.createGoto => [
                                    targetLabel = curLabel
                                ]))
                    }
                ];
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.add(createStmFromInstr(cond))
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                ]
            // Handle weak immediate abort for join
            } else if (preemption.get(i).type == "WEAK_IMMEDIATE_ABORT" && instr == null) {
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                    val f_wa_ref = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                        valuedObject = preemption.get(i).flag
                                    ]
                    if (labelMap.get(curLabel).contains(preemption.get(i).endLabel)) {
                        statements.add(
                            createStmFromInstr(
                                ifThenGoto(
                                    f_wa_ref, preemption.get(i).endLabel, true)))
                    } else {
                        statements.add(
                            createStmFromInstr(ifThenGoto(f_wa_ref, curLabel, true)))
                    }
                ]
            } else {
                return SclFactory::eINSTANCE.createStatementSequence
            }
        }
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
        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])
        sSeq.statements.addAll(createSclPause.statements)
        sSeq.statements.add(
            createStmFromInstr(
                SclFactory::eINSTANCE.createGoto => [
                    targetLabel = l
                ]))
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
            preemption.push(
                new PreemptiveElement("WEAK_IMMEDIATE_ABORT", l, abortExpr, f_wa))

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
                    createStmFromInstr(ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr, variables), l, true)))
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

        val sScope = SclFactory::eINSTANCE.createStatementScope

        val f_s = createValuedObject(uniqueName(variables, trap.trapDeclList.trapDecls.head.name))
        variables.add(f_s);

        // TODO should also not be overwritten by local signal declarations within abort body...
        sScope.declarations.add(
            KExpressionsFactory::eINSTANCE.createDeclaration => [
                type = ValueType::BOOL;
                f_s.initialValue = createBoolValue(false)
                valuedObjects.add(f_s)
            ])

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
