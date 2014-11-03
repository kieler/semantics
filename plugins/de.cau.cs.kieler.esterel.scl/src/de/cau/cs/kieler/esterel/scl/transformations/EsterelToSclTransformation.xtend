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

/**
 * @author krat
 *
 */
enum PreemptiveStm {
    ABORT,
    WEAK_IMMEDIATE_ABORT,
    SUSPEND
}

class EsterelToSclTransformation extends Transformation {

    // Global variables
    var LinkedList<ValuedObject> variables

    // Label at the end of currently transformed thread
    var String curLabel

    // Saves nesting of nested preemptive constructs
    var Stack<PreemptiveStm> preemptives
    var Stack<String> endLabels
    var Stack<Expression> exprs
    var Stack<ValuedObject> flags;
    var Stack<PreemptiveElement> preemption;

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelMap

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    // KiCo
    override EObject transform(EObject eObject, KielerCompilerContext contex) {
        return transform(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }

    public def Program transform(de.cau.cs.kieler.esterel.esterel.Program esterelProgram) {
        System.out.println("Transforming to SCL...")
        
        // Initialize class variables
        variables = new LinkedList<ValuedObject>
        curLabel = "f_term"
        preemptives = new Stack
        endLabels = new Stack
        exprs = new Stack
        flags = new Stack
        labelMap = HashMultimap.create()
        
        // Create the SCL program
        val program = SclFactory::eINSTANCE.createProgram()

        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        transformDeclaration(esterelMod.interface.intSignalDecls.head)
        // Transform signals to bool variables
        for (sigs : esterelMod.interface.intSignalDecls) {
            val decl = createDeclaration => [
                input = sigs instanceof Input
                output = sigs instanceof Output
                type = ValueType::BOOL
            ]
            for (sig : sigs.signals) {
                val variable = createValuedObject(sig.name)
                variables.add(variable)
                decl.valuedObjects.add(variable)
            }
            program.declarations.add(decl)
        }
        


        // Body transformations
        val body = SclFactory::eINSTANCE.createStatementSequence
        for (stm : esterelMod.body.statements) {
            body.statements.addAll(transformStm(stm).statements);
        }

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
        System.out.println("Transformed")
        program
    }

    /*
     * Creates thread to set output signals to false at the start
     * of every tick
     */
    def de.cau.cs.kieler.scl.scl.Thread handleOutputs(EList<Declaration> decls, ValuedObject f_term, Boolean isLocal) {
        val th = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel

        th.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        for (decl : decls) {
            if ((decl.output == true && decl.input == false) || isLocal) {
                for (value : decl.valuedObjects) {
                    th.statements.add(createStmFromInstr(createAssignment(value, createBoolValue(false))))
                }
            }
        }

        th.statements.add(
            createStmFromInstr(
                ifThenGoto(
                    createOperatorExpression(OperatorType::NOT) => [
                        subExpressions.add(
                            KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                valuedObject = f_term
                            ])], l, false)))

        th
    }

    /*
     * Transformation rules
     */
    /*
     * emit s
     */
    def dispatch StatementSequence transformStm(Emit emit) {
        val variable = getValuedObject(variables, emit.signal.name)

        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]

        val op = createOperatorExpression(OperatorType::OR) => [
            add(variableRef)
            add(createBoolValue(true))
        ]

        createSseq(createStmFromInstr(createAssignment(variable, op)))
    }

    /*
     * p || q
     */
    def dispatch StatementSequence transformStm(Parallel par) {
        val sclPar = SclFactory::eINSTANCE.createParallel

        // Save label of parent thread
        val oldEnd = curLabel
        for (th : par.list) {
            val l = createFreshLabel
            curLabel = l
            sclPar.threads.add(
                SclFactory::eINSTANCE.createThread => [
                    statements.addAll(transformStm(th).statements)
                    statements.add(
                        SclFactory::eINSTANCE.createEmptyStatement => [
                            label = l
                        ])
                ])
        }
        curLabel = oldEnd
        val res = createSseq(createStmFromInstr(sclPar))
        res.statements.addAll(handlePreemtion(null, preemptives.length - 1).statements)

        res
    }

    /*
     * p; q
     */
    def dispatch StatementSequence transformStm(Sequence seq) {
        SclFactory::eINSTANCE.createStatementSequence => [
            for (stm : seq.list) {
                statements.addAll(transformStm(stm).statements)
            }
        ]
    }

    /*
     * await (immediate) s
     */
    def dispatch StatementSequence transformStm(Await await) {
        if (await.body instanceof AwaitCase) {
            val sSeq = SclFactory::eINSTANCE.createStatementSequence
            val l = createFreshLabel
            sSeq.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            val presentCases = transformStm(awaitToPresentCase(await.body as AwaitCase))

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
            return handleAwaitInstance(await.body as AwaitInstance)
        }
    }

    /*
     * Await instance
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await) {
        val stmSeq = SclFactory::eINSTANCE.createStatementSequence

        val l = createFreshLabel

        stmSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        if (!await.delay.isImmediate) {
            stmSeq.statements.addAll(createSclPause.statements)
        }

        val gotoStm = SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ]
        ]

        val b = createOperatorExpression(OperatorType::NOT) => [
            subExpressions.add(transformExp(await.delay.event.expr))
        ]

        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = b
            if (await.delay.isImmediate) {
                statements.addAll(createSclPause.statements)
            }
            statements.add(gotoStm)
        ]

        stmSeq.statements.add(
            SclFactory::eINSTANCE.createInstructionStatement => [
                instruction = cond
            ])

        stmSeq
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
    def dispatch StatementSequence transformStm(Loop loop) {
        // loop p each s
        if (loop.end != null) {
            return handleLoopEach(loop, (loop.end as LoopDelay).delay)
        }
        
        val l = createFreshLabel

        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        stmSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        stmSeq.statements.addAll(transformStm(loop.body.statement).statements)

        // TODO Remove pseudo conditional when scg unreachable code is fixed
        stmSeq.statements.add(
            createStmFromInstr(
                SclFactory::eINSTANCE.createConditional => [
                    expression = createBoolValue(true)
                    statements.add(
                        createStmFromInstr(
                            SclFactory::eINSTANCE.createGoto => [
                                targetLabel = l
                            ]))
                ]))

        stmSeq
    }
    
    /*
     * loop p each s
     * Simply transforms the loop each to kernel statements and transforms them to SCL
     */
    def StatementSequence handleLoopEach(Loop loop, DelayExpr s) {
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
        return transformStm(newLoop)
    }
    
    /*
     * every s do p
     * Simply transforms the every to kernel statements and transforms them to SCL
     */
     def dispatch StatementSequence transformStm(EveryDo everyDo) {
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

        return transformStm(stm)
    }

    /*
     * pause
     */
    def dispatch StatementSequence transformStm(Pause pause) {
        return createSclPause
    }
    
    /*
     * Creates an scl pause statement with respect to surrounding preemption
     */
     def StatementSequence createSclPause() {
         return handlePreemtion(SclFactory::eINSTANCE.createPause, preemptives.length - 1)
     }

    /*
     * Iterates through stack containing information about nesting of abort and suspend.
     * Is used for pause creation to respect right order of preemptive gotos
     */
    def StatementSequence handlePreemtion(Instruction instr, int i) {
        if (i < 0) {
            if (instr == null) {
                return SclFactory::eINSTANCE.createStatementSequence
            } else {
                createSseq(createStmFromInstr(instr))
            }
        } else {
            if (preemptives.get(i) == PreemptiveStm.ABORT) {
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                    if (labelMap.get(curLabel).contains(endLabels.get(i))) {
                        statements.add(
                            createStmFromInstr(ifThenGoto(transformExp(exprs.get(i)), endLabels.get(i), true)))
                    } else {
                        statements.add(createStmFromInstr(ifThenGoto(transformExp(exprs.get(i)), curLabel, true)))
                    }
                ]
            } else if (preemptives.get(i) == PreemptiveStm.SUSPEND && instr != null) {
                val l = createFreshLabel
                return SclFactory::eINSTANCE.createStatementSequence => [
                    statements.add(
                        SclFactory::eINSTANCE.createEmptyStatement => [
                            label = l
                        ])
                    statements.addAll(handlePreemtion(instr, i - 1).statements)
                    statements.add(createStmFromInstr(ifThenGoto(transformExp(exprs.get(i)), l, true)))
                ]
            } else if (preemptives.get(i) == PreemptiveStm.WEAK_IMMEDIATE_ABORT) {
                System.out.println("Weaky")

                val cond = SclFactory::eINSTANCE.createConditional => [
                    expression = transformExp(exprs.get(i))
                    statements.add(
                        createStmFromInstr(
                            SclFactory::eINSTANCE.createAssignment => [
                                valuedObject = flags.get(i)
                                expression = or(
                                    KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                                        valuedObject = flags.get(i)
                                    ], createBoolValue(true))
                            ]))
                    if (labelMap.get(curLabel).contains(endLabels.get(i))) {
                        statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                            targetLabel = endLabels.get(i)
                        ]))
                    } else {
                        statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                            targetLabel = curLabel
                        ]))
                    }
                ];
                return SclFactory::eINSTANCE.createStatementSequence => [

                        statements.add(createStmFromInstr(cond))
                        statements.addAll(handlePreemtion(instr, i - 1).statements)
                ]
            } else {
                return SclFactory::eINSTANCE.createStatementSequence
            }
        }
    }

    /*
     * nothing
     */
    def dispatch StatementSequence transformStm(Nothing nothing) {
        SclFactory::eINSTANCE.createStatementSequence
    }

    /*
     * halt
     */
    def dispatch StatementSequence transformStm(Halt halt) {
        val l = createFreshLabel
        SclFactory::eINSTANCE.createStatementSequence => [
            statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            statements.addAll(createSclPause.statements)
            statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createGoto => [
                        targetLabel = l
                    ]))
        ]
    }

    /*
     * [ ... ]
     */
    def dispatch StatementSequence transformStm(Block block) {
        transformStm(block.statement)
    }

    /*
     * present
     */
    def dispatch StatementSequence transformStm(Present pres) {

        //present s then p (else q)
        if (pres.body instanceof PresentEventBody) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                expression = transformExp((pres.body as PresentEventBody).event.expression)
                if ((pres.body as PresentEventBody).thenPart != null) {
                    statements.addAll(transformStm((pres.body as PresentEventBody).thenPart.statement).statements)
                }
                if (pres.elsePart != null) {
                    elseStatements.addAll(transformStm(pres.elsePart.statement).statements)
                }
            ]
            return createSseq(createStmFromInstr(cond))

        }
        //present case s do ...
        else if (pres.body instanceof PresentCaseList) {
            val cond = handleCaseList((pres.body as PresentCaseList).cases, 0, pres.elsePart)
            return createSseq(createStmFromInstr(cond))
        }
    }

    /*
     * Creates nested conditional equivalent to cases list
     */
    def Conditional handleCaseList(EList<PresentCase> cases, int idx, ElsePart elsePart) {
        if (cases.length > idx + 1) {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression)
                statements.addAll(transformStm(cases.get(idx).statement).statements)
                elseStatements.addAll(createStmFromInstr(handleCaseList(cases, idx + 1, elsePart)))
            ]
        } else {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression)
                statements.addAll(transformStm(cases.get(idx).statement).statements)
                if (elsePart != null) {
                    elseStatements.addAll(transformStm(elsePart.statement).statements)
                }
            ]
        }
    }

    /*
     * signal s in p end
     * TODO sometimes behaves strange; maybe xtext parsing error?
     */
    def dispatch StatementSequence transformStm(LocalSignalDecl signal) {
        val sScope = SclFactory::eINSTANCE.createStatementScope

        val decl = createDeclaration => [
            type = ValueType::BOOL
        ]
        System.out.println("Variables: " + variables)
        System.out.println("Size: " + variables.length)
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(s.name)
            decl.valuedObjects.add(obj)
            variables.add(obj)
        }

        System.out.println("Variables: " + variables)
        System.out.println("Size: " + variables.length)
        // indicates if signal body has terminated
        val f_term = createValuedObject(uniqueName(variables, "f_term"))
        variables.add(f_term)

        sScope.declarations.add(decl)

        // Add reset thread for signals       
        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(sScope.declarations, f_term, true))
        par.threads.add(
            SclFactory::eINSTANCE.createThread => [
                statements.addAll(transformStm(signal.statement).statements)
                statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
            ])
        sScope.declarations.add(KExpressionsFactory::eINSTANCE.createDeclaration => [
            valuedObjects.add(f_term);
            type = ValueType::BOOL
        ])
        sScope.statements.add(createStmFromInstr(par))

        createSseq(createStmFromInstr(sScope));
    }

    /*
     * abort p when s
     * TODO merge weak and strong abort
     */
    def dispatch StatementSequence transformStm(Abort abort) {
        if (abort.body instanceof WeakAbortBody && ((abort.body as AbortInstance).delay.isImmediate)) {
            System.out.println("Weak Immediate Abort " + abort.statement)
            val l = createFreshLabel
            labelMap.put(curLabel, l)
    
            val f_wa = createValuedObject(uniqueName(variables, "f_wa"))
            pushPreemtive(PreemptiveStm.WEAK_IMMEDIATE_ABORT, (abort.body as AbortInstance).delay.event.expr, l, f_wa)
    
            val ret = SclFactory::eINSTANCE.createStatementScope
            // TODO should also not be overwritten by local signal declarations within abort body...
            ret.declarations.add(KExpressionsFactory::eINSTANCE.createDeclaration => [
                type = ValueType::BOOL;
                valuedObjects.add(f_wa)
            ])
    
//            if ((abort.body as AbortInstance).delay.isImmediate) {
//                ret.statements.add(
//                    createStmFromInstr(ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr), l, true)))
//            }
    
            ret.statements.addAll(transformStm(abort.statement).statements)
            popPreemtive
    
            ret.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
    
            return ret
        }
        
        System.out.println("Abort " + abort.statement)
        val l = createFreshLabel
        labelMap.put(curLabel, l)

        pushPreemtive(PreemptiveStm.ABORT, (abort.body as AbortInstance).delay.event.expr, l, null)

        val ret = SclFactory::eINSTANCE.createStatementSequence

        if ((abort.body as AbortInstance).delay.isImmediate) {
            ret.statements.add(
                createStmFromInstr(ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr), l, true)))
        }

        ret.statements.addAll(transformStm(abort.statement).statements)
        popPreemtive

        ret.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])

        ret
    }

    /*
      * suspend p when s
      * TODO immediate broken
      */
    def dispatch StatementSequence transformStm(Suspend susp) {
        pushPreemtive(PreemptiveStm.SUSPEND, susp.delay.event.expr, null, null)
        val res = SclFactory::eINSTANCE.createStatementSequence

        if (susp.delay.isImmediate) {
            val l = createFreshLabel
            res.statements.add(
                SclFactory::eINSTANCE.createEmptyStatement => [
                    label = l
                ])
            res.statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createConditional => [
                        expression = transformExp(susp.delay.event.expr)
                        statements.addAll(createSclPause.statements)
                        statements.add(
                            createStmFromInstr(
                                SclFactory::eINSTANCE.createGoto => [
                                    targetLabel = l
                                ]))]))
        }

        res.statements.addAll(transformStm(susp.statement).statements)
        popPreemtive

        res
    }

    /*
     * Transform Expression
     */
    def de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression exp) {
        if (exp instanceof OperatorExpression) {
            System.out.println("transformExp: OperatorExpression")
            return transformOperatorExp(exp as OperatorExpression)
        } else if (exp instanceof ValuedObjectReference) {
            System.out.println("transformExp: ValuedObjectReference")
            return transformValObjRef(exp as ValuedObjectReference)
        }

        System.out.println("transformExp: Unknown Expression: " + exp)
        createExpression
    }

    def de.cau.cs.kieler.core.kexpressions.OperatorExpression transformOperatorExp(OperatorExpression exp) {

        //TODO beautify; complete
        val opType = switch exp.operator {
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::NOT: OperatorType::NOT
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::AND: OperatorType::AND
            case de.cau.cs.kieler.esterel.kexpressions.OperatorType::OR: OperatorType::OR
        }
        System.out.println("exptype :" + opType)
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = opType
            for (subExp : exp.subExpressions) {
                subExpressions.add(transformExp(subExp))
            }
        ]
    }

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformCompExp(ComplexExpression comp) {
        if (comp instanceof ValuedObjectReference) {
            transformValObjRef(comp as ValuedObjectReference)
        }
    }

    def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformValObjRef(ValuedObjectReference ref) {
        getValuedObjectRef(variables, ref.valuedObject.name)
    }

    /*
      * Push preemptive informations on stacks
      * TODO use triple or something
      */
//    def pushPreemtive(PreemptiveStm stm, Expression expr, String label, ValuedObject flag) {
//        preemptives.push(stm)
//        exprs.push(expr)
//        endLabels.push(label)
//        flags.push(flag);
//    }
//
//    def popPreemtive() {
//        preemptives.pop()
//        exprs.pop()
//        endLabels.pop()
//        flags.pop()
//    }

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
