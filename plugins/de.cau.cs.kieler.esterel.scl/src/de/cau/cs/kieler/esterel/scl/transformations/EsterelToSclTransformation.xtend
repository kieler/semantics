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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.AbortCase
import de.cau.cs.kieler.esterel.esterel.AbortInstance
import de.cau.cs.kieler.esterel.esterel.Assignment
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.AwaitInstance
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.ConstantRenaming
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.DoUpto
import de.cau.cs.kieler.esterel.esterel.DoWatching
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.LocalSignal
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.LoopDelay
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.ProcCall
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.WeakAbort
import de.cau.cs.kieler.esterel.esterel.WeakAbortInstance
import de.cau.cs.kieler.esterel.esterel.WeakSuspend
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import java.util.HashMap
import java.util.LinkedList
import java.util.Stack
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.xbase.lib.Pair
import de.cau.cs.kieler.core.kexpressions.Expression

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {

    // Label at the end of currently transformed thread
    var String curLabel

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelMap

    // List of exit signals and the corresponding label
    var HashMap<ISignal, Pair<ValuedObject, String>> exitMap

    // List of all locally used variables, used to add them as global declaration after transformation
    var protected LinkedList<Declaration> localDeclarations

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var protected LinkedList<Pair<String, ValuedObject>> signalMap

    // Maps valued variables to signal
    var protected HashMap<ValuedObject, ValuedObject> valuedMap

    // State variables for weak suspension
    var LinkedList<Pair<Integer, String>> waStates
    
    // Associates counting variables to the corresponding delay event
    var HashMap<String, ValuedObject> counterMap
    
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

        // Label at the end of the currently transformed thread
        curLabel = "root"

        labelMap = HashMultimap.create()

        exitMap = new HashMap<ISignal, Pair<ValuedObject, String>>

        localDeclarations = new LinkedList<Declaration>

        signalMap = new LinkedList<Pair<String, ValuedObject>>

        valuedMap = new HashMap<ValuedObject, ValuedObject>

        waStates = new LinkedList<Pair<Integer, String>>
        
        counterMap = new HashMap<String, ValuedObject>        
        
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
        val program = SclFactory::eINSTANCE.createSCLProgram

        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name

        // Interface transformations
        transformInterface(esterelMod.interface, program, signalMap)

        // Body transformations
        val sSeq = createSseq
        esterelMod.body.statements.forEach[transformStm(sSeq)]
        sSeq.addLabel("root")

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

        val par = createParallel
        par.threads.add(handleOutputs(program.declarations, f_term, terminates))
        par.threads.add(
            createThread => [
                statements.addAll(sSeq.statements)
                if (!opt || terminates) {
                    statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
                }
            ])
        program.add(par)

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
        val th = createThread
        val l = createFreshLabel

        th.addLabel(l)

        // Set every boolean representing an output/local signal to false with absolute write
        for (decl : decls) {
            if (decl.output && !decl.input) {
                for (valObj : decl.valuedObjects) {
                    if (valObj.type == ValueType::BOOL && valuedMap.values.findFirst[v|v == valObj] == null) {
                        th.add(createAssignment(valObj, createBoolValue(false)))
                    }
                }
            }
        }

        if (!opt || terms) {
            th.add(ifThenGoto(createNot(f_term.createValObjRef), l, false))
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
        val variable = signalMap.findLast[it.key == emit.signal.name].value
        val variableRef = variable.createValObjRef

        val op = createOr(variableRef, createBoolValue(true))

        // "emits" the signal by setting it to true
        val emitSignal = createStmFromInstr(createAssignment(variable, op))

        // Unvalued emit
        if (emit.expr == null) {
            sSeq.add(emitSignal)
            return sSeq
        }

        // Valued Emit
        else {

            // Get the corresponding valued variable
            val s_val = valuedMap.get(variable)
            val sclExpr = emit.expr.transformExp(s_val.type.toString)

            // Handle combine operator
            if (s_val.combineOperator.value != 0) {
                val cond = createConditional => [
                    expression = variable.createValObjRef
                    // If the signal was already emitted in this tick, apply combine function
                    statements += createStmFromInstr(
                        createAssignment(s_val,
                            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                operator = OperatorType::get(s_val.combineOperator.toString)
                                subExpressions.add(createValObjRef(s_val))
                                subExpressions.add(EcoreUtil.copy(sclExpr))
                            ]))
                    // Else emit signal and set value
                    elseStatements.add(emitSignal)
                    elseStatements.add(createStmFromInstr(createAssignment(s_val, sclExpr)))
                ]
                sSeq.add(cond)
            }
            // Valued emit without combine function
            else {
                sSeq.add(emitSignal)
                sSeq.add(createAssignment(s_val, sclExpr))
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

        sSeq
    }

    /*
     * p || q
     */
    def dispatch StatementSequence transformStm(Parallel par, StatementSequence sSeq) {
        val sclPar = createParallel

        // Save label of parent thread
        val oldEnd = curLabel
        for (thread : par.list) {
            val l = createFreshLabel
            curLabel = l

            val newSclThread = createThread
            transformStm(thread, newSclThread)

            newSclThread.addLabel(l)
            sclPar.threads.add(newSclThread)
        }

        // Set current label to the old label for the transformations after join
        curLabel = oldEnd
        sSeq.add(sclPar)

        // Insert some stuff after join for preemptive statements
        val join = createSseq
        joinTransformation.forEach[it.apply(join)]
        sSeq.add(join)

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
        sSeq.add(createAssignment(delayedFlag, createBoolValue(false)))

        sSeq.addLabel(l_start)

        for (singleCase : awaitCase.cases) {
            val cond = createConditional => [
                // Additional check for f_depth
                if (!singleCase.delay.isImmediate) {
                    expression = createAnd(transformExp(singleCase.delay.event.expr), delayedFlag.createValObjRef)

                // Simple check for expression
                } else {
                    expression = transformExp(singleCase.delay.event.expr)
                }
            ]

            // If there is an additional delay expression (case n x do) add counting integer
            val caseEnd = createFreshLabel
            if (singleCase.delay.expr != null) {

                // i counts occurrences of the signal
                val counter = createFreshVar("i", ValueType::INT)
                counter.initialValue = 0.createIntValue

                // Increment counter if guard holds
                cond.statements += incrementInt(counter)

                // Check counting condition
                val countExp = createGT(singleCase.delay.expr.transformExp("int"), counter.createValObjRef)
                val countCondition = createConditional => [
                    expression = countExp
                    elseStatements += createStmFromInstr(createAssignment(counter, 0.createIntValue))
                    statements += createGotoStm(caseEnd)
                ]
                cond.statements.add(createStmFromInstr(countCondition))
            }

            // Possible "do" block
            if (singleCase.statement != null)
                cond.add(transformStm(singleCase.statement, createSseq))
            cond.add(createGotoStm(l_end))
            sSeq.add(cond)
            sSeq.addLabel(caseEnd)
        }
        sSeq.addLabel(l_restart)
        sSeq.createSclPause

        // Set depth flag
        sSeq.add(createAssignment(delayedFlag, createBoolValue(true)))
        sSeq.addGoto(l_start)
        sSeq.addLabel(l_end)

        sSeq
    }

    /*
     * Await instance
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await, StatementSequence sSeq) {

        // await 0 a should do nothing (but maybe the do block)
        if ((await.delay.expr instanceof ConstantExpression) && (await.delay.expr as ConstantExpression).value == "0") {
            if (await.statement != null)
                transformStm(await.statement, sSeq)
            return sSeq
        }

        // If delayed expression a counter is needed
        var ValuedObject i
        val l = createFreshLabel

        sSeq.addLabel(l)
        labelMap.put(curLabel, l)

        // await tick is just a pause
        if (await.delay.event.expr == null && await.delay.expr == null) {
            return sSeq.createSclPause
        }

        if (!await.delay.isImmediate) {
            sSeq.createSclPause
        }

        // Wait several times, e.g. await 5 a
        // i counts
        if (await.delay.expr != null) {
            i = createFreshVar("i", ValueType::INT)
            i.initialValue = 0.createIntValue

            // if a present increment counter
            // if await n tick just increment it
            if (await.delay.event.expr != null) {
                val condTimes = createConditional
                condTimes.expression = transformExp(await.delay.event.expr)
                condTimes.statements.add(incrementInt(i))
                sSeq.add(condTimes)
            } else {
                sSeq.add(incrementInt(i))
            }
        }

        // This is probably not an await tick
        if (await.delay.event.expr != null) {
            val b = createNot(transformExp(await.delay.event.expr))

            val cond = createConditional

            // The counter has to be at the specified value
            if (await.delay.expr != null) {
                cond.expression = createGT(await.delay.expr.transformExp("int"), i.createValObjRef)
            } else if (await.delay.event.expr != null) {
                cond.expression = b
            }
            if (await.delay.isImmediate) {
                cond.statements.addAll(createSclPause(createSseq).statements)
            }
            cond.statements.add(createGotoStm(l))

            sSeq.add(cond)
            if (await.delay.expr != null)
                sSeq.add(createAssignment(i, 0.createIntValue))
        }

        // Possible do-Block
        if (await.statement != null)
            transformStm(await.statement, sSeq)

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
                        delay = s
                    ]
                    statement = EsterelFactory::eINSTANCE.createSequence => [
                        list.add(loop.body.statement)
                        list.add(EsterelFactory::eINSTANCE.createHalt)
                    ]
                ]
            ]
        ]
        transformStm(newLoop, sSeq)
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
        transformStm(stm, sSeq)
    }

    /*
     * pause
     */
    def dispatch StatementSequence transformStm(Pause pause, StatementSequence sSeq) {
        sSeq.createSclPause
    }

    /*
     * Creates an scl pause statement with respect to surrounding preemption
     */
    def StatementSequence createSclPause(StatementSequence sSeq) {
        val sclPause = createStmFromInstr(SclFactory::eINSTANCE.createPause).createSseq
        pauseTransformation.forEach[it.apply(sclPause)]

        sSeq.add(sclPause)
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

            // present tick always takes the then branch
            if ((pres.body as PresentEventBody).event.expression == null) {
                val thenPart = createSseq
                transformStm((pres.body as PresentEventBody).thenPart.statement, thenPart)
                sSeq.add(thenPart)
                return sSeq
            }

            val cond = createConditional => [
                expression = transformExp((pres.body as PresentEventBody).event.expression)
                if ((pres.body as PresentEventBody).thenPart != null) {
                    val thenPart = createSseq
                    transformStm((pres.body as PresentEventBody).thenPart.statement, thenPart)
                    statements += thenPart.statements
                }
                if (pres.elsePart != null) {
                    val elsePart = createSseq
                    transformStm(pres.elsePart.statement, elsePart)
                    elseStatements += elsePart.statements
                }
            ]
            sSeq.add(cond)

            return sSeq
        }
        //present case s do ...
        else if (pres.body instanceof PresentCaseList) {
            val l_end = createFreshLabel
            for (singleCase : (pres.body as PresentCaseList).cases) {
                sSeq.add(
                    createConditional => [
                        expression = transformExp(singleCase.event.expression)
                        statements.addAll(transformStm(singleCase.statement, createSseq).statements)
                        statements.addGoto(l_end)
                    ])
            }
            sSeq.addLabel(l_end)

            return sSeq
        }
    }

    /*
     * signal s in p end
     */
    def dispatch StatementSequence transformStm(LocalSignalDecl signal, StatementSequence sSeq) {
    	val signals = new LinkedList<Pair<String, ValuedObject>>
    	val sScope = newSscope
    	val f_term = createFreshVarNoDecl("f_term", ValueType::BOOL)
    	sScope.add(createAssignment(f_term, createBoolValue(false)))
        sScope.declarations += createDeclaration => [ valuedObjects += f_term; type = ValueType::BOOL ]
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(s.name)
            sScope.add(createAssignment(obj, createBoolValue(false)))
            signalMap.add(obj.name -> obj)
            signals.add(obj.name -> obj)
            sScope.declarations += createDeclaration => [ valuedObjects += obj; type = ValueType::BOOL ]

            // Valued signal
            if (s.channelDescr != null) {
                val s_val = createValuedObject(s.name + "_val") => [
                    if (s.channelDescr.expression != null) {
                        initialValue = s.channelDescr.expression.transformExp(s.channelDescr.type.type.toString)
                    }
                    if (s.channelDescr.type.operator != null)
                        combineOperator = s.channelDescr.type.operator.transformCombineOperator
                ]
                sScope.declarations += createDeclaration => [ 
                	valuedObjects += s_val
                	type = ValueType::getByName(s.channelDescr.type.type.getName())
                ]
                valuedMap.put(obj, s_val)
            }
        }
        val th = newThread
        transformStm(signal.statement, th)
        th.add(createAssignment(f_term, createBoolValue(true)))
        
        // Create Thread to reset all locally declared signals in each tick
        val resetTh = newThread
        val l_reset = createFreshLabel
        resetTh.addLabel(l_reset)
        resetTh.createSclPause
        val terms = signal.statement.checkTerminate
        signals.forEach[ resetTh.add(createAssignment(it.value, createBoolValue(false))) ]
		if (!opt || terms) {
            resetTh.add(ifThenGoto(createNot(f_term.createValObjRef), l_reset, true))
        } else if (opt && !terms) {
            resetTh.addGoto(l_reset)
        }
        val par = createParallel
        par.threads += th
        par.threads += resetTh
        sScope.statements += par.createStmFromInstr
		        
        signalMap.removeAll(signals)

        sSeq.statements += sScope.createStmFromInstr
        
        sSeq
    }

    /*
     * abort p when s
     */
    def dispatch StatementSequence transformStm(Abort abort, StatementSequence sSeq) {

        // Abort Cases
        if (abort.body instanceof AbortCase) {
            val saveAbort = EcoreUtil.copy(abort.body as AbortCase)
            val l_end = createFreshLabel
            labelMap.put(curLabel, l_end)
            // Create a depth flag
            val f_depth = createFreshVar("f_depth", ValueType::BOOL)
            sSeq.add(createAssignment(f_depth, createBoolValue(false)))
            // Set depth flag to true when pause is taken
            pauseTransformation.push([StatementSequence seq|seq.add(createAssignment(f_depth, createBoolValue(true)))])
            // Transform to nested abort
            handleAbortCase(abort).transformStm(sSeq)
            pauseTransformation.pop
            // Check if and which case should be taken
            for (singleCase : saveAbort.cases) {
                sSeq.add(
                    createConditional => [
                        val eventExpr = singleCase.delay.event.expr
                        if (singleCase.delay.isImmediate) {
                            if (singleCase.delay.expr != null){
                                expression = createAnd(eventExpr.transformExp, 
                                    signalMap.findLast[key == (singleCase.delay.event.expr as ValuedObject).name].value.createValObjRef
                                )
                            } else {
                                expression = eventExpr.transformExp
                            }
                        } else {
                            if (singleCase.delay.expr != null){
                                expression = createAnd(eventExpr.transformExp, 
                                    createLEQ(singleCase.delay.expr.transformExp("int"), counterMap.get((singleCase.delay.event.expr as de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference).valuedObject.name).createValObjRef))
                            } else {
                                expression = createAnd(eventExpr.transformExp, createValObjRef(f_depth))
                            }
                        }
                        statements += singleCase.statement.transformStm(newSseq).statements
                        statements += createGotoStm(l_end)
                    ])

            }
            signalMap.removeLast
            sSeq.addLabel(l_end)

            return sSeq
        }

        // Weak and strong abort instance
        // Label at end of body
        val l = createFreshLabel
        labelMap.put(curLabel, l)
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Delay Expression? E.g. abort p when 5 s
        val delayExpression = (abort.body as AbortInstance).delay.expr != null

        // Add a counting variable, if delay.expr is set; 
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createFreshVar("i", ValueType::INT)
            sSeq.add(createAssignment(counterVar, 0.createIntValue))
            counterMap.put(((abort.body as AbortInstance).delay.event.expr as de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference).valuedObject.name,
                counterVar)
        }
        val counter = counterVar

        // Is counting condition reached?
        val countExp = createAnd(abortExpr.transformExp,
            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::LEQ
                if (delayExpression) {
                    subExpressions += (abort.body as AbortInstance).delay.expr.transformExp("int")
                    subExpressions += counter.createValObjRef
                }
            ])

        // Weak abort
        if (abort.body instanceof WeakAbortInstance) {
            handleWeakAbort(abort, sSeq, l, counter, countExp)
        // Strong abort
        } else {
            handleStrongAbort(abort, sSeq, l, counter, countExp)
        }
        pauseTransformation.pop
        joinTransformation.pop

        // If body was left without being preempted, doNothing
        val l_doNothing = createFreshLabel
        if ((abort.body as AbortInstance).statement != null)
            sSeq.addGoto(l_doNothing)
        sSeq.addLabel(l)

        // Some do statement
        if ((abort.body as AbortInstance).statement != null) {
            (abort.body as AbortInstance).statement.transformStm(sSeq)
            sSeq.addLabel(l_doNothing)
        }

        sSeq
    }

    def handleWeakAbort(Abort abort, StatementSequence sSeq, String l, ValuedObject counter,
        OperatorExpression countExp) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Delay Expression?
        val delayExpression = (abort.body as AbortInstance).delay.expr != null
        val f_wa = createFreshVar("f_wa", ValueType::BOOL)
        sSeq.add(createAssignment(f_wa, createBoolValue(false)))
        // If delayed add depth flag
        var ValuedObject f_depthVar
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            f_depthVar = createFreshVar("f_depth", ValueType::BOOL)
            sSeq.add(createAssignment(f_depthVar, createBoolValue(false)))
        }
        val f_depth = f_depthVar

        pauseTransformation.push [ StatementSequence seq |
            // Increment counter if delay expression is set
            if (delayExpression) {
                seq.add(
                    createConditional => [
                        expression = transformExp(abortExpr)
                        statements += incrementInt(counter)
                    ])
            }
            val f_wa_ref = f_wa.createValObjRef
            // Insert directly before pause
            val idx = seq.statements.indexOf(
                seq.statements.findFirst [
                    it instanceof InstructionStatement &&
                        (it as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Pause
                ])
            // Set f_wa flag if abort condition is true and goto l_exit
            seq.statements.add(idx,
                createStmFromInstr(
                    createConditional => [
                        statements.add(
                            createStmFromInstr(
                                createAssignment(f_wa, createOr(EcoreUtil.copy(f_wa_ref), createBoolValue(true)))))
                        if (delayExpression) {
                            if (!(abort.body as AbortInstance).delay.isImmediate) {
                                expression = and(EcoreUtil.copy(countExp), EcoreUtil.copy(f_depth.createValObjRef))
                            } else {
                                expression = EcoreUtil.copy(countExp)
                            }
                        } else {
                            if (!(abort.body as AbortInstance).delay.isImmediate) {
                                expression = and(abortExpr.transformExp, f_depth.createValObjRef)
                            } else {
                                expression = abortExpr.transformExp
                            }
                        }
                        statements.add(createGotoj(l, curLabel, labelMap))
                    ]))
            // Set depth flag to true after pause
            if (!(abort.body as AbortInstance).delay.isImmediate) {
                seq.add(createAssignment(f_depth, createBoolValue(true)))
            }
            seq
        ]
        // If flag is set gotoj l_exit after join
        joinTransformation.push [ StatementSequence seq |
            seq.add(
                createConditional => [
                    expression = f_wa.createValObjRef
                    statements.add(createGotoj(l, curLabel, labelMap))
                ])
        ]

        transformStm(abort.statement, sSeq)

        signalMap.remove(f_wa.name -> f_wa)
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            signalMap.remove(f_depth.name -> f_depth)
        }
    }

    def handleStrongAbort(Abort abort, StatementSequence sSeq, String l, ValuedObject counter,
        OperatorExpression countExp) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr
        // Create abort flag and set to false
        val f_a = createFreshVar("f_a", ValueType::BOOL)
        sSeq.add(createAssignment(f_a, false.createBoolValue))
        // If abort is immediate directly check for abort condition
        if ((abort.body as AbortInstance).delay.isImmediate) {
            sSeq.add(
                createConditional => [
                    expression = transformExp(abortExpr)
                    statements += createStmFromInstr(createAssignment(f_a, createBoolValue(true)))
                    statements += createGotoj(l, curLabel, labelMap)
                ])
        }

        val pause = [ StatementSequence seq |
            // If delay expression increment counter when abort expression is true
            if ((abort.body as AbortInstance).delay.expr != null) {
                seq.add(createConditional => [
                        expression = transformExp(abortExpr)
                        statements += incrementInt(counter)
                    ])
                seq.add(
                        createConditional => [
                            expression = EcoreUtil.copy(countExp)
                            statements += createStmFromInstr(createAssignment(f_a, createBoolValue(true)))
                            statements += createGotoj(l, curLabel, labelMap)
                        ])
            } else {
                seq.add(
                        createConditional => [
                            expression = transformExp(abortExpr)
                            statements += createStmFromInstr(createAssignment(f_a, createBoolValue(true)))
                            statements += createGotoj(l, curLabel, labelMap)
                        ])
            }
            seq
        ]
        // If abort flag is set goto l_exit after join
        val join = [ StatementSequence seq |
            seq.add(
                createConditional => [
                    expression = f_a.createValObjRef
                    statements += createGotoj(l, curLabel, labelMap)
                ])
            seq
        ]

        pauseTransformation.push(pause)
        joinTransformation.push(join)

        transformStm(abort.statement, sSeq)
    }

    // Abort case
    def de.cau.cs.kieler.esterel.esterel.Statement handleAbortCase(Abort abortCase) {
        val abortCaseBody = (abortCase.body as AbortCase)
        if (abortCaseBody.cases.empty) {
            return abortCase.statement
        } else {
            if (abortCase instanceof WeakAbort) {
                EsterelFactory::eINSTANCE.createWeakAbort => [
                    body = EsterelFactory::eINSTANCE.createWeakAbortInstance => [
                        delay = abortCaseBody.cases.head.delay
                    ]
                    abortCaseBody.cases.remove(0)
                    statement = handleAbortCase(abortCase)
                ]
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

    }

    /*
      * suspend p when s
      * when n s
      */
    def dispatch StatementSequence transformStm(Suspend susp, StatementSequence sSeq) {

        // Delay Expression?
        val delayExpression = susp.delay.expr != null

        // Add a counting variable, if delay.expr is set
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createFreshVar("i", ValueType::INT)
            sSeq.add(createAssignment(counterVar, 0.createIntValue))
        }
        val counter = counterVar

        // if a and c > i then...
        val countExp = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::AND
            subExpressions += susp.delay.event.expr.transformExp
            subExpressions += KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GT
                if (susp.delay.expr != null) {
                    subExpressions += susp.delay.expr.transformExp("int")
                    subExpressions += counter.createValObjRef
                }
            ]
        ]

        // If immediate add conditional pause at start
        if (susp.delay.isImmediate) {
            val l = createFreshLabel
            sSeq.addLabel(l)
            sSeq.add(createConditional => [
                        if (delayExpression) {
                            expression = EcoreUtil.copy(countExp)
                        } else {
                            expression = transformExp(susp.delay.event.expr)
                        } statements.addAll(createSclPause.statements)
                        statements.add(createGotoStm(l))])
        }

        pauseTransformation.push [ StatementSequence seq |
            val l = createFreshLabel
            seq.statements.add(0, createEmptyStm(l))
            if (delayExpression) {
                seq.add(createConditional => [
                            expression = transformExp(susp.delay.event.expr)
                            statements += incrementInt(counter)
                        ])
                seq.add(ifThenGoto(EcoreUtil.copy(countExp), l, true))
            } else {
                seq.add(ifThenGoto(transformExp(susp.delay.event.expr), l, true))
            }
            seq
        ]

        transformStm(susp.statement, sSeq)
        pauseTransformation.pop

        sSeq
    }

    /*
     * Trap t in p end
     */
    def dispatch StatementSequence transformStm(Trap trap, StatementSequence sSeq) {

        val l = createFreshLabel
        labelMap.put(curLabel, l)
		val exitVars = new LinkedList<ValuedObject>
		trap.trapDeclList.trapDecls.forEach [ 
			val singleExit = createFreshVar(it.name, ValueType::BOOL)
			exitVars += singleExit
			exitMap.put(it, (singleExit -> l))
	        sSeq.add(createAssignment(singleExit, false.createBoolValue))
		]
		var Expression exitExprVar
		if (exitVars.length == 1) 
			exitExprVar = exitVars.get(0).createValObjRef
		else {
			exitExprVar = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
			operator = OperatorType::OR
			for (^var : exitVars) { subExpressions += ^var.createValObjRef }
			]
		}
		val exitExpr = exitExprVar

        val trans = [ boolean pause, StatementSequence seq |
            val stm = new LinkedList<Statement>
            stm.add(createStmFromInstr(createConditional => [
                expression = EcoreUtil.copy(exitExpr)
                statements.add(createGotoj(l, curLabel, labelMap))
            ]))
            if (pause) {
                val idx = seq.statements.indexOf(
                seq.statements.findFirst [
                    it instanceof InstructionStatement &&
                        (it as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Pause
                ])
                seq.statements.addAll(idx, stm)
            }
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
        for (trapHandler : trap.trapHandler) {
        	sSeq.add(createConditional => [
        		expression = trapHandler.trapExpr.transformExp
        		statements += trapHandler.statement.transformStm(newSseq).statements
        	])
        }
        sSeq
    }

    /*
     * exit T
     */
    def dispatch StatementSequence transformStm(Exit exit, StatementSequence sSeq) {
        val exitVar = exitMap.get(exit.trap)

        val op = createOr(exitVar.key.createValObjRef, createBoolValue(true))
        sSeq.add(createAssignment(exitVar.key, op))

        val l = exitVar.value
        sSeq.addGotoj(l, curLabel, labelMap)

        sSeq
    }

    /*
     * run mod
     */
    def dispatch StatementSequence transformStm(Run run, StatementSequence sSeq) {
        // Signal declared in run module have to be copied, but only if not already done
        val p = SclFactory::eINSTANCE.createSCLProgram
        transformInterface(run.module.module.interface, p, new LinkedList<Pair<String, ValuedObject>>)
        p.declarations.forEach [
            if (!(alreadyDefined(it.valuedObjects.head.name))) {
                localDeclarations += it
                signalMap += it.valuedObjects.head.name -> it.valuedObjects.head
            }
        ]

        // Rename signals (only if renaming happens) and remember to delete afterwards
        val signals = new LinkedList<Pair<String, ValuedObject>>
        if (run.list != null) {
            run.list.list.forEach [
                for (renaming : renamings) {
                    if (renaming instanceof SignalRenaming) {
                        val newName = (renaming as SignalRenaming).oldName.name ->
                                signalMap.findLast[key == (renaming as SignalRenaming).newName.name].value
                        signalMap.add(newName)
                        signals.add(newName)
                    } else if (renaming instanceof ConstantRenaming) {
                        val newName = (renaming as ConstantRenaming).oldName.name ->
                                signalMap.findLast[key == (renaming as ConstantRenaming).newName.name].value
                        signalMap.add(newName)
                        signals.add(newName)
                    }
                }
            ]
        }

        // Copy the body in case of multiple calls for the same module
        val statements = EcoreUtil.copy(run.module.module.body)
        statements.statements.forEach[transformStm(sSeq)]

        signalMap.removeAll(signals)

        sSeq
    }

    /*
     * var v : type in
     */
    def dispatch StatementSequence transformStm(LocalVariable localVar, StatementSequence sSeq) {
        val signals = new LinkedList<Pair<String, ValuedObject>>
        localVar.^var.varDecls.forEach [
            val decl = transformIntVarDeclaration(it, signals, signalMap)
            localDeclarations += decl
        ]

        localVar.statement.transformStm(sSeq)
        signalMap.removeAll(signals)

        sSeq
    }

    /*
      * v1 := v2
      */
    def dispatch StatementSequence transformStm(Assignment assign, StatementSequence sSeq) {
        val arg1 = signalMap.findLast[key == assign.^var.name].value
        val expr = transformExp(assign.expr, arg1.type.toString)

        sSeq.add(createAssignment(arg1, expr))

        sSeq
    }

    /*
       * if then
       */
    def dispatch StatementSequence transformStm(IfTest ifTest, StatementSequence sSeq) {
        val cond = createConditional => [
            expression = ifTest.expr.transformExp
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
        val l_end = createFreshLabel
        labelMap.put(curLabel, l_end)
        if (!repeat.positive) {
            val exprVal = EcoreUtil.copy(repeat.expression.transformExp("int"))
            val op = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GEQ
                subExpressions += createIntValue(0)
                subExpressions += exprVal
            ]
            sSeq.add(ifThenGoto(op, l_end, true))
        }
        val i = createFreshVar("i", ValueType::INT)
        sSeq.add(createAssignment(i, 0.createIntValue))

        val l = createFreshLabel
        labelMap.put(curLabel, l)
        sSeq.addLabel(l)
        repeat.statement.transformStm(sSeq)
        sSeq.add(incrementInt(i))
        sSeq.add(ifThenGoto(createGT(repeat.expression.transformExp("int"), i.createValObjRef), l, true))

        sSeq.addLabel(l_end)

        sSeq
    }

    /*
     * Procedure calls
     */
    def dispatch StatementSequence transformStm(ProcCall procCall, StatementSequence sSeq) {
        val valObj = createFreshVar("procDummy", ValueType::BOOL)

        val res = KExpressionsFactory::eINSTANCE.createFunctionCall
        res.functionName = procCall.proc.name

        // Get call-by-value parameters
        var i = 0
        for (exp : procCall.kexpressions) {
            val type = procCall.proc.idList2.get(i).type.toString
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = exp.transformExp(type)
                    callByReference = false
                ]
            )
            i = i + 1

        }

        // Get call-by-reference parameters
        for (v : procCall.varList) {
            res.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = createValObjRef(signalMap.findLast[key == v.name].value)
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

    /*
     * weak suspend p when s
     * (immediate)
     */
//    def dispatch StatementSequence transformStm(WeakSuspend weakSuspend, StatementSequence sSeq) {
//        val l_casc = createFreshLabel
//        val state = createFreshVar("state", ValueType::INT)
//        if (weakSuspend.delay.isImmediate) {
//            val l = createFreshLabel
//            labelMap.put(curLabel, l)
//            waStates.add(0 -> l)
//            sSeq.add(createAssignment(state, 0.createIntValue))
//            sSeq.addLabel(l)
//        }
//
//        val f_ws = createFreshVar("f_ws", ValueType::BOOL)
//        f_ws.initialValue = createBoolValue(true)
//
//        pauseTransformation.push [ StatementSequence seq |
//            val lNew = createFreshLabel
//            labelMap.put(curLabel, lNew)
//            waStates.add(waStates.length -> lNew)
//            seq.statements.add(0, createEmptyStm(lNew))
//            seq.statements.add(0,
//                createStmFromInstr(
//                    SclFactory::eINSTANCE.createConditional => [
//                        expression = weakSuspend.delay.event.expr.transformExp
//                        statements += createAssignment(f_ws, createBoolValue(true)).createStmFromInstr
//                        for (waState : waStates) {
//                            statements += createStmFromInstr(
//                                SclFactory::eINSTANCE.createConditional => [
//                                    expression = createEquals(state.createValObjRef, createIntValue(waState.key))
//                                    System.out.println("Wavalue : " + waState.value + " wakey: " + waState.key)
//                                    statements += createGotoj(waState.value, curLabel, labelMap)
//                                ])
//                        }
//                        elseStatements += createStmFromInstr(createAssignment(state, waStates.length.createIntValue))
//                    ]))
//            seq.add(createAssignment(f_ws, createBoolValue(false)))
//            seq
//        ]
//
//        joinTransformation.push [ StatementSequence seq |
//            seq.statements.add(0,
//                createStmFromInstr(
//                    SclFactory::eINSTANCE.createConditional => [
//                        expression = f_ws.createValObjRef
//                        for (waState : waStates) {
//                            statements += createStmFromInstr(
//                                SclFactory::eINSTANCE.createConditional => [
//                                    expression = createEquals(state.createValObjRef, createIntValue(waState.key))
//                                    statements += createGotoj(waState.value, curLabel, labelMap)
//                                ])
//                        }
//                    ]
//                ))
//            seq
//        ]
//
//        weakSuspend.statement.transformStm(sSeq)
//
//        System.out.println("WaState : " + waStates)
//        pauseTransformation.pop
//        joinTransformation.pop
//
//        // At the end of the suspend body also suspension may happen
//        sSeq.add(
//            SclFactory::eINSTANCE.createConditional => [
//                expression = weakSuspend.delay.event.expr.transformExp
//                if (weakSuspend.delay.isImmediate) {
//                    statements += createStmFromInstr(
//                        SclFactory::eINSTANCE.createConditional => [
//                            expression = createEquals(state.createValObjRef, createIntValue(0))
//                            statements += createGotoj(waStates.get(0).value, curLabel, labelMap)
//                        ])
//                    for (waState : waStates.tail) {
//                        statements += createStmFromInstr(
//                            SclFactory::eINSTANCE.createConditional => [
//                                expression = createEquals(state.createValObjRef, createIntValue(waState.key))
//                                statements += createGotoj(waState.value, curLabel, labelMap)
//                            ]
//                        )
//                    }
//                } else {
//                    for (waState : waStates.tail) {
//                        statements += createStmFromInstr(
//                            SclFactory::eINSTANCE.createConditional => [
//                                expression = createEquals(state.createValObjRef, createIntValue(waState.key))
//                                statements += createGotoj(waState.value, curLabel, labelMap)
//                            ]
//                        )
//                    }
//                }
//            ]
//        )

//        sSeq
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
