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
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.esterel.esterel.AbortCase
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import de.cau.cs.kieler.esterel.esterel.Assignment
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.ProcCall
import de.cau.cs.kieler.esterel.esterel.DoUpto
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.DoWatching
import de.cau.cs.kieler.esterel.esterel.WeakSuspend

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {

    // The currently transformed Esterel program
    //    var Program currProgram
    // Label at the end of currently transformed thread
    var String curLabel

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelMap

    // List of exit signals and the corresponding label
    var HashMap<ISignal, Pair<ValuedObject, String>> exitMap

    // List of all variables (var v in p end) used
    var protected LinkedList<String> localVars

    // List of all locally used variables, used to add them as global declaration after transformation
    var protected LinkedList<Declaration> localDeclarations

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var protected LinkedList<Pair<String, ValuedObject>> signalMap

    // Maps valued variables to signal
    var protected HashMap<ValuedObject, ValuedObject> valuedMap
    
    // State variables for weak suspension
    var LinkedList<Pair<Integer, String>> waStates
    
    // Flag indicating if optimized transformations should be used
    var boolean opt

    // List of transformation function to manipulate pauses and join
    var Stack<(StatementSequence)=>StatementSequence> pauseTransformation
    var Stack<(StatementSequence)=>StatementSequence> joinTransformation

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
        return transformProgram(eObject as Program) as EObject
    }

    def EObject transformOpt(EObject eObject, KielerCompilerContext contex) {
        opt = true;
        return transformProgram(eObject as Program) as EObject
    }

    public def SCLProgram transformProgram(Program esterelProgram) {
        System.out.println("Transforming to SCL...")

        //        currProgram = esterelProgram
        // Label at the end of the currently transformed thread if not root thread
        curLabel = "root"

        // Multimap containing information if certain label is in a thread
        labelMap = HashMultimap.create()

        localVars = new LinkedList<String>

        // Contains informations about which exit expression is represented by which flag
        exitMap = new HashMap<ISignal, Pair<ValuedObject, String>>()

        // Local declarated variables/flags
        localDeclarations = new LinkedList<Declaration>

        // Variables are stored as a LinkedList. Signals are keys, the first signal in the returned
        // list for a key is the current variable representing a (local) signal
        signalMap = new LinkedList<Pair<String, ValuedObject>>

        valuedMap = new HashMap<ValuedObject, ValuedObject>()
        
        waStates = new LinkedList<Pair<Integer, String>>

        pauseTransformation = new Stack<(StatementSequence)=>StatementSequence>
        joinTransformation = new Stack<(StatementSequence)=>StatementSequence>

        // Check if naming conventions are satisfied
        esterelProgram.validateNames
        
        // Does the program terminate?
        var boolean termTmp = true
        if (opt) {
            termTmp = esterelProgram.checkTerminate
        }
        val terminates = termTmp;

        // Create the SCL program
        val program = SclFactory::eINSTANCE.createSCLProgram()

        // Only the first module is considered
        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        transformInterface(esterelMod.interface, program)

        // Body transformations
        val sSeq = SclFactory::eINSTANCE.createStatementSequence
        sSeq.addLabel("root")
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
        par.threads.add(handleOutputs(program.declarations, f_term, terminates))
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
    def Thread handleOutputs(EList<Declaration> decls, ValuedObject f_term, boolean terms) {
        val th = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel

        th.addLabel(l)

        for (decl : decls) {
            if (((decl.output && !decl.input))) {
                for (valObj : decl.valuedObjects) {

                    if (valObj.type == ValueType::BOOL && valuedMap.values.findFirst[v|v == valObj] == null) {
                        th.statements.add(createStmFromInstr(createAssignment(valObj, createBoolValue(false))))
                    }
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

        // Get the LAST defined valued object (with respect to local signals)
        // Put ignore local variable declarations
        val variable = signalMap.filter[!localVars.contains(it.value.name)].findLast[it.key == emit.signal.name].value
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
            return sSeq
        }

        // Valued Emit
        if (emit.expr != null) {
            val s_val = valuedMap.get(variable)
            var de.cau.cs.kieler.core.kexpressions.Expression sclExprVar

            if (emit.expr instanceof ConstantExpression) {
                sclExprVar = emit.expr.transformExp(s_val.type.toString)
            } else {
                sclExprVar = emit.expr.transformExp(signalMap)
            }

            val sclExpr = sclExprVar

            if (s_val.combineOperator.value != 0) {
                val cond = SclFactory::eINSTANCE.createConditional => [
                    expression = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                        valuedObject = variable
                    ]
                    statements += createStmFromInstr(
                        SclFactory::eINSTANCE.createAssignment => [
                            expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                operator = OperatorType::get(s_val.combineOperator.toString)
                                subExpressions.add(createValuedObjectRef(s_val))
                                subExpressions.add(EcoreUtil.copy(sclExpr))
                            ]
                            valuedObject = s_val
                        ])
                    elseStatements.add(setSignal)
                    elseStatements.add(createStmFromInstr(createAssignment(s_val, sclExpr)))
                ]
                sSeq.statements += cond.createStmFromInstr
            }
            // Valued emit without combine function
            else {
                sSeq.statements.add(setSignal)
                sSeq.statements.add(createStmFromInstr(createAssignment(s_val, sclExpr)))
            }
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
            sclPar.threads.add(newSclThread)
        }
        curLabel = oldEnd
        sSeq.statements.add(createStmFromInstr(sclPar))

        // Insert some stuff after join for preemptive statements
        val join = SclFactory::eINSTANCE.createStatementSequence
        for (f : joinTransformation) {
            f.apply(join)
        }
        sSeq.statements += join.statements

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
            handleAwaitCase((await.body as AwaitCase), sSeq)
        } else if (await.body instanceof AwaitInstance) {
            handleAwaitInstance(await.body as AwaitInstance, sSeq)
        }

        sSeq
    }

    /*
     * Await Case
     * Cases are handled in a "break" style; if a case is taken, a goto to the end of the
     * statement is taken
     */
    def StatementSequence handleAwaitCase(AwaitCase awaitCase, StatementSequence sSeq) {
        val l_start = createFreshLabel
        val l_restart = createFreshLabel
        val l_end = createFreshLabel

        // Flag indicating, if also delayed await cases may be taken
        val delayedFlag = createFreshVar("f_depth", ValueType::BOOL)
        delayedFlag.initialValue = createBoolValue(false)

        sSeq.addLabel(l_start)

        for (singleCase : awaitCase.cases) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                // Additional check for f_depth
                if (!singleCase.delay.isImmediate) {
                    expression = createOperatorExpression(OperatorType::AND) => [
                        add(transformExp(singleCase.delay.event.expr, signalMap))
                        add(delayedFlag.createValuedObjectRef)
                    ]
                // Simple check for expression
                } else {
                    expression = transformExp(singleCase.delay.event.expr, signalMap)
                }
            ]
            
            // If there is an additional delay expression (case n x do) add counting integer
            if (singleCase.delay.expr != null) {
                // i count occurences of the signal
                val counter = createFreshVar("i", ValueType::INT)
                counter.initialValue = createIntValue(0)
        
             // Increment counter if guard holds
             cond.statements += incrementInt(counter)
             // Check counting condition
             val countCondition = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                 operator = OperatorType::GT
                 if (singleCase.delay.expr instanceof ConstantExpression) {
                     subExpressions += singleCase.delay.expr.transformExp("int")
                 } else {
                     subExpressions += singleCase.delay.expr.transformExp(signalMap)
                 }
                 subExpressions += counter.createValuedObjectRef
             ]
             cond.statements.add(createStmFromInstr(ifThenGoto(countCondition, l_restart, true)))
            }
            // Possible "do" block
            if (singleCase.statement != null)
                cond.statements.addAll(transformStm(singleCase.statement, createSseq).statements)
            cond.statements.add(createGotoStm(l_end))
            sSeq.statements.add(createStmFromInstr(cond))
        }
        sSeq.addLabel(l_restart)
        sSeq.createSclPause
        
        // Set depth flag
        sSeq.statements.add(createStmFromInstr(createAssignment(delayedFlag, createBoolValue(true))))
        sSeq.addGoto(l_start)
        sSeq.addLabel(l_end)

        sSeq
    }

    /*
     * Await instance
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await, StatementSequence sSeq) {

        // await 0 a should do nothing
        if ((await.delay.expr instanceof ConstantExpression) && (await.delay.expr as ConstantExpression).value == "0") {
            return sSeq
        }

        val l = createFreshLabel

        sSeq.addLabel(l)
        labelMap.put(curLabel, l)

        if (!await.delay.isImmediate) {
            sSeq.createSclPause
        }

        // Wait several times, e.g. await 5 a
        // i counts
        val i = createValuedObject(uniqueName(signalMap, "i"))
        if (await.delay.expr != null) {
            signalMap.add(i.name -> i);

            localDeclarations.add(
                KExpressionsFactory::eINSTANCE.createDeclaration => [
                    type = ValueType::INT;
                    i.initialValue = createIntValue(0)
                    valuedObjects.add(i)
                ])

            // if a present increment counter
            // if await n tick just increment it
            if (await.delay.event.expr != null) {
                val condTimes = SclFactory::eINSTANCE.createConditional => [
                    expression = transformExp(await.delay.event.expr, signalMap)
                    statements.add(incrementInt(i))
                ]
                sSeq.add(condTimes)

            } else {
                sSeq.add(incrementInt(i))
            }
        }

        // This is probably not an await tick
        var de.cau.cs.kieler.core.kexpressions.OperatorExpression b
        if (await.delay.event.expr != null) {
            b = createOperatorExpression(OperatorType::NOT) => [
                subExpressions.add(transformExp(await.delay.event.expr, signalMap))
            ]
        }
        val bVal = b

        val cond = SclFactory::eINSTANCE.createConditional => [
            // The counter has to be at the specified value
            if (await.delay.expr != null) {

                expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                    operator = OperatorType::GT
                    if (await.delay.expr instanceof ConstantExpression)
                        subExpressions += await.delay.expr.transformExp("int")
                    else {
                        subExpressions += await.delay.expr.transformExp(signalMap)
                    }
                    subExpressions += i.createValuedObjectRef
                ]

            } else if (await.delay.event.expr != null) {
                expression = bVal
            }
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
        val sclPause = createStmFromInstr(SclFactory::eINSTANCE.createPause).createSseq

        for (f : pauseTransformation) {
            f.apply(sclPause)
        }
        sSeq.statements += sclPause.statements

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
            output = true //TODO output???
        ]
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(uniqueName(signalMap, s.name))
            decl.valuedObjects.add(obj)
            signalMap.add(s.name -> obj)

            // Valued signal
            if (s.channelDescr != null) {
                val s_val = createValuedObject(uniqueName(signalMap, s.name + "_val")) => [
                    type = ValueType::getByName(s.channelDescr.type.type.toString)
                    if (s.channelDescr.expression != null) {
                        if (s.channelDescr.expression instanceof ConstantExpression) {
                            initialValue = s.channelDescr.expression.transformExp(s.channelDescr.type.type.toString)
                        } else {
                            initialValue = s.channelDescr.expression.transformExp(signalMap)
                        }

                    }
                    if (s.channelDescr.type.operator != null)
                        combineOperator = s.channelDescr.type.operator.transformCombineOperator
                ]
                valuedMap.put(obj, s_val)
                localDeclarations.add(transformValuedDeclaration(s, s_val))
            }
        }
        localDeclarations.add(decl)

        transformStm(signal.statement, sSeq)
        (signal.signalList as LocalSignal).signal.forEach[signalMap.removeLast]

        sSeq
    }

    /*
     * abort p when s
     */
    def dispatch StatementSequence transformStm(Abort abort, StatementSequence sSeq) {

        // Abort Cases
        if (abort.body instanceof AbortCase) {
            val saveAbort = EcoreUtil.copy((abort.body as AbortCase))
            val l_end = createFreshLabel
            labelMap.put(curLabel, l_end)

            val f_depth = createFreshVar("f_depth", ValueType::BOOL)
            f_depth.initialValue = createBoolValue(false);

            pauseTransformation.push [ StatementSequence seq |
                seq.add(createAssignment(f_depth, createBoolValue(true)))
            ]

            handleAbortCase(abort).transformStm(sSeq)

            signalMap.remove(f_depth.name -> f_depth)
            pauseTransformation.pop

            for (singleCase : saveAbort.cases) {
                sSeq.add(
                    SclFactory::eINSTANCE.createConditional => [
                        if (singleCase.delay.isImmediate) {
                            expression = singleCase.delay.event.expr.transformExp(signalMap)
                        } else {
                            expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                operator = OperatorType::AND
                                subExpressions.add(singleCase.delay.event.expr.transformExp(signalMap))
                                subExpressions.add(createValuedObjectRef(f_depth))
                            ]
                        }
                        statements += singleCase.statement.transformStm(newSseq).statements
                        statements += createGotoStm(l_end)
                    ])

            }
            sSeq.addLabel(l_end)

            return sSeq
        }
        
        // Weak and strong abort instance
        val l = createFreshLabel
        labelMap.put(curLabel, l)
        val abortExpr = (abort.body as AbortInstance).delay.event.expr
        val oldSignalMap = signalMap.clone  as LinkedList<Pair<String, ValuedObject>>
        
        // Add a counting variable, if delay.expr is set
        val counter = createFreshVar("i", ValueType::INT)
        counter.initialValue = createIntValue(0)
        // Delay Expression?
        val delayExpression = (abort.body as AbortInstance).delay.expr != null
        // if a and c > i then...
        val countExp = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::AND
            subExpressions += abortExpr.transformExp(signalMap)
            subExpressions += KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::GT
            if ((abort.body as AbortInstance).delay.expr != null) {
                if (delayExpression) {
                    if ((abort.body as AbortInstance).delay.expr instanceof ConstantExpression) {
                        subExpressions += (abort.body as AbortInstance).delay.expr.transformExp("int")
                    } else {
                        subExpressions += (abort.body as AbortInstance).delay.expr.transformExp(signalMap)
                    }
                } else {
                    subExpressions += (abort.body as AbortInstance).delay.expr.transformExp(signalMap)
                }
                subExpressions += counter.createValuedObjectRef
            }
        ]
        
        ]

        // Weak immediate abort
        if (abort.body instanceof WeakAbortInstance && ((abort.body as AbortInstance).delay.isImmediate)) {

            val f_wa = createFreshVar("f_wa", ValueType::BOOL)
            f_wa.initialValue = createBoolValue(false);

            pauseTransformation.push [ StatementSequence seq |
                
                val cond = SclFactory::eINSTANCE.createConditional => [
                    expression = transformExp(abortExpr, oldSignalMap)
                    statements.add(
                        createStmFromInstr(
                            createAssignment(f_wa, or(createValuedObjectRef(f_wa)
                                                , createBoolValue(true)))
                            ))
                    if (labelMap.get(curLabel).contains(l)) {
                        statements.add(createGotoStm(l))
                    } else {
                        statements.add(createGotoStm(curLabel))
                    }
                ];
                val idx = seq.statements.indexOf(
                    seq.statements.findFirst [
                        it instanceof InstructionStatement &&
                            (it as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Pause
                    ])
                seq.statements.add(idx, createStmFromInstr(cond))
                seq
            ]

            joinTransformation.push [ StatementSequence seq |
                val f_wa_ref = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                    valuedObject = f_wa
                ]
                if (labelMap.get(curLabel).contains(l)) {
                    sSeq.statements.add(createStmFromInstr(ifThenGoto(f_wa_ref, l, true)))
                } else {
                    sSeq.statements.add(createStmFromInstr(ifThenGoto(f_wa_ref, curLabel, true)))
                }
                seq
            ]

            transformStm(abort.statement, sSeq)
            signalMap.remove(f_wa.name -> f_wa)

        // Weak delayed abort
        } else if (abort.body instanceof WeakAbortInstance) {

            val f_wa = createFreshVar("f_wa", ValueType::BOOL)
            val f_depth = createFreshVar("f_depth", ValueType::BOOL)
            f_wa.initialValue = createBoolValue(false)
            f_depth.initialValue = createBoolValue(false)

            pauseTransformation.push [ StatementSequence seq |
                if (delayExpression) {
                    seq.statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = transformExp(abortExpr, oldSignalMap)
                        statements += incrementInt(counter)
                    ])
                }
                val f_wa_ref = f_wa.createValuedObjectRef
                val f_depth_ref = f_depth.createValuedObjectRef
                // Insert directly before pause
                val idx = seq.statements.indexOf(
                    seq.statements.findFirst [
                        it instanceof InstructionStatement &&
                            (it as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Pause
                    ])
                seq.statements.add(idx,
                    createStmFromInstr(
                        SclFactory::eINSTANCE.createConditional => [
                            statements.add(
                                createStmFromInstr(
                                    createAssignment(f_wa,
                                        createOperatorExpression(OperatorType::OR) => [
                                            add(EcoreUtil.copy(f_wa_ref))
                                            add(createBoolValue(true))
                                        ])))
                            if (delayExpression) {
                                 expression = and(EcoreUtil.copy(countExp), EcoreUtil.copy(f_depth_ref))
                            } else {
                                expression = and(abortExpr.transformExp(oldSignalMap), f_depth_ref)
                            }
                            statements.add(createGotoj(l, curLabel, labelMap))
                        ]))
                seq.add(createAssignment(f_depth, createBoolValue(true)))
                seq
            ]

            joinTransformation.push [ StatementSequence seq |
                seq.add(
                    SclFactory::eINSTANCE.createConditional => [
                        expression = f_wa.createValuedObjectRef
                        statements.add(createGotoj(l, curLabel, labelMap))
                    ])
            ]

            transformStm(abort.statement, sSeq)

            // In case of additional "do" block check for depth flag and expression
            val f_depth_ref = f_depth.createValuedObjectRef
            if ((abort.body as WeakAbortInstance).statement != null) {
                sSeq.add(
                    SclFactory::eINSTANCE.createConditional => [
                        expression = and(abortExpr.transformExp(oldSignalMap), f_depth_ref)
                        statements += (abort.body as AbortInstance).statement.transformStm(newSseq).statements
                    ])
            }
            signalMap.remove(f_wa.name -> f_wa)
            signalMap.remove(f_depth.name -> f_depth)

        // Strong abort
        } else {
            val f_a = createFreshVar("f_a", ValueType::BOOL)
            f_a.initialValue = false.createBoolValue
            if ((abort.body as AbortInstance).delay.isImmediate) {
                sSeq.statements.add(
                    createStmFromInstr(
                        ifThenGoto(transformExp((abort.body as AbortInstance).delay.event.expr, signalMap), l, true)))
            }

            val pause = [ StatementSequence seq |
                if ((abort.body as AbortInstance).delay.expr != null) {
                    seq.statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = transformExp(abortExpr, oldSignalMap)
                        statements += incrementInt(counter)
                    ])
                }
                val stms = new LinkedList<Statement>
                    if ((abort.body as AbortInstance).delay.expr != null) {
                         stms.add(createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                             expression = EcoreUtil.copy(countExp)
                             statements += createStmFromInstr(createAssignment(f_a, createBoolValue(true)))
                             statements += createGotoj(l, curLabel, labelMap)
                         ]))   
                    } else {
                        stms.add(createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                             expression = transformExp(abortExpr, oldSignalMap)
                             statements += createStmFromInstr(createAssignment(f_a, createBoolValue(true)))
                             statements += createGotoj(l, curLabel, labelMap)
                         ]))
                    }
                seq.statements.addAll(stms)
                seq
            ]
            
            val join = [ StatementSequence seq |

                val stms = new LinkedList<Statement>
                if (labelMap.get(curLabel).contains(l)) {
                        stms.add(createStmFromInstr(ifThenGoto(f_a.createValuedObjectRef, l, true)))
                } else {
                        stms.add(createStmFromInstr(ifThenGoto(f_a.createValuedObjectRef, curLabel, true)))
                }
                seq.statements.addAll(stms)
                seq
            ]

            pauseTransformation.push(pause)
            joinTransformation.push(join)

            transformStm(abort.statement, sSeq)
        }
        pauseTransformation.pop
        joinTransformation.pop

        val l_doNothing = createFreshLabel
        sSeq.addGoto(l_doNothing)
        sSeq.addLabel(l)

        // Some do statement
        if ((abort.body as AbortInstance).statement != null) {
            (abort.body as AbortInstance).statement.transformStm(sSeq)
        }
        sSeq.addLabel(l_doNothing)

        sSeq
    }

    // Strong abort case
    def de.cau.cs.kieler.esterel.esterel.Statement handleAbortCase(Abort abortCase) {
        val abortCaseBody = (abortCase.body as AbortCase)
        if (abortCaseBody.cases.empty) {
            return abortCase.statement
        } else {
            EsterelFactory::eINSTANCE.createAbort => [
                body = EsterelFactory::eINSTANCE.createAbortInstance => [
                    delay = abortCaseBody.cases.head.delay
                ]
                abortCaseBody.cases.remove(0)
                statement = handleAbortCase(abortCase)
            ]
        }

    }

    /*
      * suspend p when s
      * when n s
      */
    def dispatch StatementSequence transformStm(Suspend susp, StatementSequence sSeq) {
        // Add a counting variable, if delay.expr is set
        val counter = createFreshVar("i", ValueType::INT)
        counter.initialValue = createIntValue(0)
        // Delay Expression?
        val delayExpression = susp.delay.expr != null
        // if a and c > i then...
        val countExp = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::AND
            subExpressions += susp.delay.event.expr.transformExp(signalMap)
             subExpressions += KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::GT
            if (susp.delay.expr != null) {
                if (delayExpression) {
                    subExpressions += susp.delay.expr.transformExp("int")
                } else {
                    subExpressions += susp.delay.expr.transformExp(signalMap)
                }
                subExpressions += counter.createValuedObjectRef
            }
        ]
        
        ]
        
        if (susp.delay.isImmediate) {
            val l = createFreshLabel
            sSeq.addLabel(l)

            sSeq.statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createConditional => [
                        if (delayExpression) {
                            expression = EcoreUtil.copy(countExp)
                        } else {
                            expression = transformExp(susp.delay.event.expr, signalMap)
                        }
                        statements.addAll(createSclPause.statements)
                        statements.add(createGotoStm(l))]))
        }

        pauseTransformation.push [ StatementSequence seq |
            val l = createFreshLabel
            seq.statements.add(0, createEmptyStm(l))
            if (delayExpression) {
                seq.statements.add(createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                    expression = transformExp(susp.delay.event.expr, signalMap)
                    statements += incrementInt(counter)
                ]))
                seq.statements.add(createStmFromInstr(ifThenGoto(EcoreUtil.copy(countExp), l, true)))
            } else {
                seq.statements.add(
                    createStmFromInstr(ifThenGoto(transformExp(susp.delay.event.expr, signalMap), l, true)))
            }
            
            seq
        ]

        transformStm(susp.statement, sSeq)
        pauseTransformation.pop

        sSeq
    }

    /*
     * Trap t in p end
     * TODO several flags
     */
    def dispatch StatementSequence transformStm(Trap trap, StatementSequence sSeq) {

        val f_s = createFreshVar(trap.trapDeclList.trapDecls.head.name, ValueType::BOOL)
        val l = createFreshLabel
        labelMap.put(curLabel, l)

        for (decl : trap.trapDeclList.trapDecls) {
            exitMap.put(decl, (f_s -> l))
        }

        val trans = [ boolean pause, StatementSequence seq |
            val stm = new LinkedList<Statement>
            val flagRef = createValuedObjectRef(f_s)
            
            if (labelMap.get(curLabel).contains(l)) {
                stm.add(createStmFromInstr(ifThenGoto(flagRef, l, true)))
            } else {
                stm.add(createStmFromInstr(ifThenGoto(flagRef, curLabel, true)))
            }
            if (pause)
                seq.statements.addAll(0, stm)
            else
                seq.statements.addAll(stm)
            seq
        ]
        pauseTransformation.push[StatementSequence stm|trans.apply(true, stm)]
        joinTransformation.push[StatementSequence stm|trans.apply(false, stm)]

        trap.statement.transformStm(sSeq)

        pauseTransformation.pop
        joinTransformation.pop
        sSeq.addLabel(l)
        if (!trap.trapHandler.empty) {
            sSeq.add(SclFactory::eINSTANCE.createConditional => [
                expression = createValuedObjectRef(f_s)
                statements += trap.trapHandler.head.statement.transformStm(newSseq).statements
            ])
        }

        sSeq
    }

    /*
     * exit T
     */
    def dispatch StatementSequence transformStm(Exit exit, StatementSequence sSeq) {
        val variable = exitMap.get(exit.trap).key
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable
        ]
        val op = createOperatorExpression(OperatorType::OR) => [
            add(variableRef)
            add(createBoolValue(true))
        ]

        sSeq.statements.add(createStmFromInstr(createAssignment(variable, op)))

        val l = exitMap.get(exit.trap).value

        sSeq.statements.add(createGotoj(l, curLabel, labelMap))

        //        ]))
        return sSeq
    }

    /*
     * run mod
     */
    def dispatch StatementSequence transformStm(Run run, StatementSequence sSeq) {

        // Rename signals (only if renaming happens)
        // TODO Throw exception?
        if (run.list != null) {
            run.list.list.forEach [
                for (renaming : renamings) {
                    signalMap.add(
                        (renaming as SignalRenaming).oldName.name ->
                            signalMap.findLast[key == (renaming as SignalRenaming).newName.name].value)
                }
            ]
        }

        // Signal declared in run module have to be copied, but only if not already done
        val p = SclFactory::eINSTANCE.createSCLProgram
        transformInterface(run.module.module.interface, p)
        localDeclarations += p.declarations

        run.module.module.body.statements.forEach[transformStm(sSeq)]

        sSeq
    }

    /*
     * var v : type in
     */
    def dispatch StatementSequence transformStm(LocalVariable localVar, StatementSequence sSeq) {
        localVar.^var.varDecls.forEach [
            val decl = transformIntVarDeclaration(it, signalMap)
            localDeclarations += decl
        ]

        localVar.statement.transformStm(sSeq)
        localVar.^var.varDecls.forEach[variables.forEach[signalMap.removeLast]]

        sSeq
    }

    /*
      * v1 := v2
      */
    def dispatch StatementSequence transformStm(Assignment assign, StatementSequence sSeq) {
        val arg1 = signalMap.findLast[key == assign.^var.name].value
        var de.cau.cs.kieler.core.kexpressions.Expression exprVar
        if (assign.expr instanceof ConstantExpression)
            exprVar = transformExp(assign.expr, arg1.type.toString)
        else {
            exprVar = transformExp(assign.expr, signalMap)
        }

        val expr = exprVar

        sSeq.add(createAssignment(arg1, expr))

        sSeq
    }

    /*
       * if then
       */
    def dispatch StatementSequence transformStm(IfTest ifTest, StatementSequence sSeq) {
        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = ifTest.expr.transformExp(signalMap)
            if (ifTest.thenPart != null)
                statements += transformStm(ifTest.thenPart.statement, newSseq).statements
            if (ifTest.elsePart != null)
                elseStatements += transformStm(ifTest.elsePart.statement, newSseq).statements
        ]

        sSeq.add(cond)

        sSeq
    }

    /*
        * repeat n times
        */
    def dispatch StatementSequence transformStm(Repeat repeat, StatementSequence sSeq) {

        // If not marked as positive and non positive value is given do nothing
        var de.cau.cs.kieler.core.kexpressions.Expression expr
        val l_end = createFreshLabel
        labelMap.put(curLabel, l_end)
        if (!repeat.positive) {
            if (repeat.expression instanceof ConstantExpression) {
                expr = repeat.expression.transformExp("int")
            } else {
                expr = repeat.expression.transformExp(signalMap)
            }
            val exprVal = EcoreUtil.copy(expr)
            val op = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GEQ
                subExpressions += createIntValue(0)
                subExpressions += exprVal
            ]
            sSeq.add(ifThenGoto(op, l_end, true))
        }
        val i = createFreshVar("i", ValueType::INT)
        val l = createFreshLabel
        labelMap.put(curLabel, l)

        sSeq.addLabel(l)
        repeat.statement.transformStm(sSeq)
        sSeq.add(incrementInt(i))
        sSeq.add(
            ifThenGoto(
                KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                    operator = OperatorType::GT
                    if (repeat.expression instanceof ConstantExpression)
                        subExpressions += repeat.expression.transformExp("int")
                    else {
                        subExpressions += repeat.expression.transformExp(signalMap)
                    }
                    subExpressions += i.createValuedObjectRef
                ], l, true))

        sSeq.addLabel(l_end)

        sSeq
    }

    /*
         * Procedure calls
         */
    def dispatch StatementSequence transformStm(ProcCall procCall, StatementSequence sSeq) {
        val valObj = createFreshVar("procDummy", ValueType::HOST)

        val res = KExpressionsFactory::eINSTANCE.createFunctionCall
        res.functionName = procCall.proc.name

        // Get call-by-value parameters
        var i = 0
        for (exp : procCall.kexpressions) {
            val type = procCall.proc.idList1.get(i).type.toString
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    if (exp instanceof ConstantExpression) {
                        expression = exp.transformExp(type)
                    } else {
                        expression = exp.transformExp(signalMap)
                    }
                    callByReference = false
                ]
            )
            i = i + 1

        }

        // Get call-by-reference parameters
        for (v : procCall.varList) {
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = createValuedObjectRef(signalMap.findLast[key == v.name].value)
                    callByReference = true
                ]
            )
        }

        // Create dummy assignment
        sSeq.add(createAssignment(valObj, res))

        sSeq
    }

    /*
       * do p (upto s | watching s timeout q)
       * Deprecated, but used for example in wristwatch
       * Simply transforms the doupto to kernel statements and transforms them
       */
    def dispatch StatementSequence transformStm(Do ^do, StatementSequence sSeq) {
        if (^do.end instanceof DoUpto) {
            val doUpto = ^do.end as DoUpto
            val abort = EsterelFactory::eINSTANCE.createAbort => [
                body = EsterelFactory.eINSTANCE.createAbortInstance => [
                    delay = doUpto.expr
                ]
                statement = EsterelFactory::eINSTANCE.createSequence => [
                    list += ^do.statement
                    list += EsterelFactory::eINSTANCE.createHalt
                ]
            ]
            abort.transformStm(sSeq)
        } else if (^do.end instanceof DoWatching) {
            val doWatching = ^do.end as DoWatching
            val abort = EsterelFactory::eINSTANCE.createAbort => [
                body = EsterelFactory.eINSTANCE.createAbortInstance => [
                    delay = doWatching.delay
                    if (doWatching.end != null) {
                        statement = doWatching.end.statement
                    }
                ]
                statement = ^do.statement
            ]
            abort.transformStm(sSeq)
        } else {
            ^do.statement.transformStm(sSeq)
        }

        sSeq
    }
    
//    /*
//     * weak suspend p when s
//     * (immediate)
//     */
//     def dispatch StatementSequence transformStm(WeakSuspend weakSuspend, StatementSequence sSeq) {
//         // Used as an unique identifier for this weak suspend instance
//         val l = createFreshLabel
//         labelMap.put(curLabel, l)
//         sSeq.addLabel(l)
//         waStates.put(l, l -> l)
//         
//         val f_ws = createFreshVar("f_ws", ValueType::BOOL)
//        
//         pauseTransformation.push [ StatementSequence seq |
//            seq.statements.add(0, createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
//                expression = weakSuspend.delay.event.expr.transformExp(signalMap)
//                statements += createAssignment(f_ws, createBoolValue(true)).createStmFromInstr
//            ]))
//            seq.statements.add(0, createAssignment(f_ws, createBoolValue(false)).createStmFromInstr)
//            
//            seq.add(SclFactory::eINSTANCE.createConditional => [
//                expression = f_ws.createValuedObjectRef
//                statements += createGotoj(waStates.get(l).key, curLabel, labelMap)
//                
//            ])
//            val lNew = createFreshLabel
//            labelMap.put(curLabel, lNew)
//            waStates.put(l, waStates.get(l).value -> lNew)
//            seq.addLabel(lNew)
//            
//            seq
//        ]
//        
//        joinTransformation.push [ StatementSequence seq |
//            seq.statements.add(0, createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
//                expression = f_ws.createValuedObjectRef
//                statements += createGotoj(waStates.get(l).key, curLabel, labelMap)
//            ]))
//            
//            seq
//        ]
//        
//         weakSuspend.statement.transformStm(sSeq)
//         
//         pauseTransformation.pop
//         joinTransformation.pop
//         
//         sSeq
//     }

    /*
     * weak suspend p when s
     * (immediate)
     */
     def dispatch StatementSequence transformStm(WeakSuspend weakSuspend, StatementSequence sSeq) {
         val state = createFreshVar("state", ValueType::INT)
         if (weakSuspend.delay.isImmediate) {
             val l = createFreshLabel
             labelMap.put(curLabel, l)
             waStates.add(0 -> l)
             sSeq.add(createAssignment(state, 0.createIntValue))
             sSeq.addLabel(l)
         }

         val f_wa = createFreshVar("f_wa", ValueType::BOOL)
         f_wa.initialValue = createBoolValue(true)
        
         pauseTransformation.push [ StatementSequence seq |
            seq.statements.add(0, createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                expression = weakSuspend.delay.event.expr.transformExp(signalMap)
                statements += createAssignment(f_wa, createBoolValue(true)).createStmFromInstr
                for (waState : waStates) {
                    statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = createEquals(state.createValuedObjectRef, createIntValue(waState.key))
                        statements += createGotoj(waState.value, curLabel, labelMap)
                    ])
                }
                elseStatements += createStmFromInstr(createAssignment(state, waStates.length.createIntValue))
                val lNew = createFreshLabel
                labelMap.put(curLabel, lNew)
                waStates.add(waStates.length + 1 -> lNew)
                elseStatements += createEmptyStm(lNew)
                ]
            ))
            
            seq.add(createAssignment(f_wa, createBoolValue(false)))
            
            
            
            seq
        ]
        
        joinTransformation.push [ StatementSequence seq |
            seq.statements.add(0, createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                expression = f_wa.createValuedObjectRef
                for (waState : waStates) {
                    statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = createEquals(state.createValuedObjectRef, createIntValue(waState.key))
                        statements += createGotoj(waState.value, curLabel, labelMap)
                    ])
                }
                ]
            ))
            
            seq
        ]
        
         weakSuspend.statement.transformStm(sSeq)
         
         pauseTransformation.pop
         joinTransformation.pop
         
         // At the end of the suspend body also suspension may happen
         sSeq.add(SclFactory::eINSTANCE.createConditional => [
                expression = weakSuspend.delay.event.expr.transformExp(signalMap)
                if (weakSuspend.delay.isImmediate) {
                statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = createEquals(state.createValuedObjectRef, createIntValue(0))
                        statements += createSclPause.statements
                        statements += createGotoj(waStates.get(0).value, curLabel, labelMap)
                    ])}
                for (waState : waStates.tail) {
                    statements += createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
                        expression = createEquals(state.createValuedObjectRef, createIntValue(waState.key))
                        statements += createGotoj(waState.value, curLabel, labelMap)
                    ]
                    )
                }
                ]
                )
         
         sSeq
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
