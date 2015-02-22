/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
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
import de.cau.cs.kieler.core.kexpressions.Expression
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
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementScope
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import java.util.HashMap
import java.util.LinkedList
import java.util.Stack
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.kexpressions.IVariable
import de.cau.cs.kieler.esterel.esterel.TrapDecl

/**
 * This class contains methods to transform an Esterel program to SCL. The transformation is started
 * by the {@link #transformProgram(Program esterelProgram) transformProgram} method. The methods
 * {@link #transform(EObject, KielerCompilerContext) transform} and
 * {@link #transformOpt(EObject, KielerCompilerContext) transformOpt} are used by the 
 * <a href="http://rtsys.informatik.uni-kiel.de/confluence/display/KIELER/Kieler+Compiler">Kieler Compiler</a>
 * to start either the normal transformation or an optimized transformation.
 * The methods documentations contain the basic transformation rules.
 * Further informations and examples for the actual transformation rules can be found in the Stash
 * repository Papers/strl2scl.
 * 
 * @author krat
 * @kieler.rating proposed yellow 2015-02-09 krat
 */
class EsterelToSclTransformation extends Transformation {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions

    @Inject
    extension TransformInterface

    @Inject
    extension TransformExpression

    // Label at the end of currently transformed thread
    var String currentThreadEndLabel

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelToThreadMap

    // List of exit signals and the corresponding label
    var HashMap<ISignal, Pair<ValuedObject, String>> exitToLabelMap

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var protected LinkedList<Pair<String, ValuedObject>> signalToVariableMap

    // Maps valued variables to signal
    var protected HashMap<ValuedObject, ValuedObject> signalToValueMap

    // Associates counting variables to the corresponding delay event
    var HashMap<String, ValuedObject> counterToEventMap

    // Local declared variables which are not in a StatementScope (should be added to global declarations)
    var LinkedList<ValuedObject> localDeclarations

    // Flag indicating if optimized transformations should be used
    var boolean optimizeTransformation

    // List of transformation functions to manipulate pauses and join
    var Stack<(StatementSequence)=>StatementSequence> pauseTransformation
    var Stack<(StatementSequence)=>StatementSequence> joinTransformation

    /**
     * Generic transformation method for KiCo. Compile without optimized ouput variable resetting
     * if the program does not terminate.
     */
    override EObject transform(EObject eObject, KielerCompilerContext contex) {
        optimizeTransformation = false;
        return transformProgram(eObject as Program) as EObject
    }

    /**
     * Generic transformation method for KiCo. Compile without optimized ouput variable resetting
     * if the program does not terminate.
     */
    def EObject transformOpt(EObject eObject, KielerCompilerContext contex) {
        optimizeTransformation = true;
        return transformProgram(eObject as Program) as EObject
    }

    /**
     * Main transformation method.
     * 
     * @param esterelProgram The Esterel program to transform
     * @return               The transformed SCL program
     */
    public def SCLProgram transformProgram(Program sourceEsterelProgram) {
        System.out.println("Transforming to SCL...")

        currentThreadEndLabel = "root"
        labelToThreadMap = HashMultimap.create()
        exitToLabelMap = <ISignal, Pair<ValuedObject, String>>newHashMap
        signalToVariableMap = <Pair<String, ValuedObject>>newLinkedList
        signalToValueMap = <ValuedObject, ValuedObject>newHashMap
        counterToEventMap = <String, ValuedObject>newHashMap
        localDeclarations = <ValuedObject>newLinkedList
        pauseTransformation = new Stack<(StatementSequence)=>StatementSequence>
        joinTransformation = new Stack<(StatementSequence)=>StatementSequence>

        // Check if naming conventions are satisfied
        sourceEsterelProgram.validateNames

        // Create the SCL program
        val targetSclProgram = SclFactory::eINSTANCE.createSCLProgram

        val primaryEsterelModule = sourceEsterelProgram.modules.head
        targetSclProgram.name = primaryEsterelModule.name

        // Interface transformations
        transformEsterelInterface(primaryEsterelModule.interface, targetSclProgram, signalToVariableMap, signalToValueMap)

        // Body transformations
        val sclStatementSequence = createSclStatementSequence
        primaryEsterelModule.body.statements.forEach[transformStatement(sclStatementSequence)]
        sclStatementSequence.addLabel("root")

        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName("f_term"))
        // Does the program terminate?
        val terminates = sourceEsterelProgram.checkTerminate
        if (!optimizeTransformation || terminates) {
            f_term.initialValue = createBoolValue(false)
            val decl = createDeclaration => [
                type = ValueType::BOOL
                valuedObjects.add(f_term)
            ]
            targetSclProgram.declarations.add(decl)
        }

        val rootParallelStatement = createParallel
        rootParallelStatement.threads.add(handleOutputs(targetSclProgram.declarations, f_term, terminates))
        rootParallelStatement.threads.add(
            createThread => [
                statements.addAll(sclStatementSequence.statements)
                if (!optimizeTransformation || terminates) {
                    statements.add(createStatement(createAssignment(f_term, createBoolValue(true))))
                }
            ])
        targetSclProgram.add(rootParallelStatement)

        // Add declarations for flags created during transformation
        if (!localDeclarations.nullOrEmpty) {
            targetSclProgram.declarations += createDeclaration => [
                type = ValueType::BOOL
                valuedObjects += localDeclarations
            ]
        }

        // As the number with which the labels are enumerated is a static variable of the EsterelToSclExtensions
        // class, the numer is resetted to 1 after each transformation for subsequent calls
        resetLabelCount

        // Optimize
        //        program.optimizeAll
        // Return the transformed program 
        System.out.println("Transformation to SCL finished")

        targetSclProgram
    }

    /**
     * Creates thread to set output signals to false at the start
     * of every tick.
     * 
     * @param declarations Declarations of the SCL target program
     * @param f_term       Variable indicating if main program has terminated
     * @param terminates   Indicates if the Esterel program may terminate or not
     * @return             Thread setting all output variables to false by absolute write
     */
    def Thread handleOutputs(EList<Declaration> declarations, ValuedObject f_term, boolean terminates) {
        val resetSignalVariablesThread = createThread
        val resetThreadStartLabel = createNewUniqueLabel

        resetSignalVariablesThread.addLabel(resetThreadStartLabel)

        // Set every boolean representing an output signal to false with absolute write
        for (singleDeclaration : declarations) {
            if (singleDeclaration.output && !singleDeclaration.input) {
                for (declaratedValuedObject : singleDeclaration.valuedObjects) {
                    if (declaratedValuedObject.type == ValueType::BOOL && !signalToValueMap.values.contains(declaratedValuedObject)) {
                        resetSignalVariablesThread.add(createAssignment(declaratedValuedObject, createBoolValue(false)))
                    }
                }
            }
        }

        // If optimization flag is not set or program does not terminate create a conditional jump
        if (!optimizeTransformation || terminates) {
            resetSignalVariablesThread.add(ifThenGoto(createNot(f_term.createValObjRef), resetThreadStartLabel, false))
        } else {
            resetSignalVariablesThread.add(SclFactory::eINSTANCE.createPause)
            resetSignalVariablesThread.addGoto(resetThreadStartLabel)
        }

        resetSignalVariablesThread
    }

    // -------------------------------------------------------------------------
    // -- Transformation Rules (transformStatement)
    // -------------------------------------------------------------------------
    /**
     * emit s((t))?
     * -> s = s or true; (s_val = t)?
     * Emit is transformed to setting the corresponding variable to true by a relative write. If it is
     * valued the corresponding s_val should be set accordingly.
     * 
     * @param emit The Emit-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Emit emit, StatementSequence targetStatementSequence) {

        // Get the LAST defined valued object (with respect to local signals) as this is the one on the
        // closest surrounding Scope. Signals with the same name defined in higher hierachical levels
        // (and appear closer to the begin of the signal map) may be shadowed out.
        val emitVariable = signalToVariableMap.findLast[it.key == emit.signal.name].value

        val emitOperation = createOr(emitVariable.createValObjRef, createBoolValue(true))

        // "emits" the signal by setting it to true by a relative write
        val emitSignal = createStatement(createAssignment(emitVariable, emitOperation))

        // Emission of a pure signal
        if (emit.expr == null) {
            targetStatementSequence.add(emitSignal)
            return targetStatementSequence
        }

        // Emission of a valued signal
        else {
            // Get the corresponding valued variable
            val emitValueVariable = signalToValueMap.get(emitVariable)
//            println("emitting " + emit.signal.name)
//            println("emitvar " + emitVariable)
//            println("valuevar " + emitValueVariable)
//            println("sigmap " + signalToVariableMap)
//            println("valuemap " + signalToValueMap)
            val sclEmittedExpression = emit.expr.transformExp(emitValueVariable.type.toString)

            // Handle combine operator
            if (emitValueVariable.combineOperator.value != 0) {
                val combineOrSetValue = createConditional => [
                    expression = emitVariable.createValObjRef
                    // If the signal was already emitted in this tick, apply combine function
                    statements += createStatement(
                        createAssignment(emitValueVariable,
                            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                operator = OperatorType::get(emitValueVariable.combineOperator.toString)
                                subExpressions.add(createValObjRef(emitValueVariable))
                                subExpressions.add(EcoreUtil.copy(sclEmittedExpression))
                            ]))
                    // Else emit signal and set value
                    elseStatements.add(emitSignal)
                    elseStatements.add(createStatement(createAssignment(emitValueVariable, sclEmittedExpression)))
                ]
                targetStatementSequence.add(combineOrSetValue)
            }
            // Valued emit without combine function
            else {
                targetStatementSequence.add(emitSignal)
                targetStatementSequence.add(createAssignment(emitValueVariable, sclEmittedExpression))
            }
        }

        targetStatementSequence
    }

    /**
     * sustain s
     * -> l: emit s; pause; goto l
     * Sustain is transformed to a loop of emit.
     * 
     * @param sustain The Sustain-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Sustain sustain, StatementSequence targetStatementSequence) {
        val sustainStartLabel = createNewUniqueLabel

        targetStatementSequence.addLabel(sustainStartLabel)
        val emit = EsterelFactory::eINSTANCE.createEmit => [
            signal = sustain.signal
            expr = sustain.expression
            tick = sustain.tick
        ]
        transformStatement(emit, targetStatementSequence)
        targetStatementSequence.createSclPause
        targetStatementSequence.addGoto(sustainStartLabel)

        targetStatementSequence
    }

    /**
     * p || q
     * -> fork p par q join
     * 
     * @param parallel The Parallel-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Parallel parallel, StatementSequence targetStatementSequence) {
        val sclParallel = createParallel

        // Save label at end of parent thread
        val oldThreadEndLabel = currentThreadEndLabel
        // List is a child of the thread statement and contains all threads in the parallel
        for (esterelThread : parallel.list) {
            // When transforming a thread, currentThreadEndLabel should point to the threads end
            val newThreadEndLabel = createNewUniqueLabel
            currentThreadEndLabel = newThreadEndLabel

            val newSclThread = createThread
            transformStatement(esterelThread, newSclThread)

            newSclThread.addLabel(newThreadEndLabel)
            sclParallel.threads.add(newSclThread)
        }

        // Set current thread end label to the old label for the transformations after join
        currentThreadEndLabel = oldThreadEndLabel
        targetStatementSequence.add(sclParallel)

        // Apply the joinTransformations after the parallel statement. This is done in order to do
        // the changes specified by some rules for join statements.
        val join = createSclStatementSequence
        joinTransformation.forEach[it.apply(join)]
        targetStatementSequence.add(join)

        targetStatementSequence
    }

    /**
     * p; q
     * -> p; q
     * Simply transform each statement in the given order.
     * 
     * @param seq The Sequence-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Sequence esterelSequence, StatementSequence targetStatementSequence) {
        // List is a child of the thread statement and contains all threads in the parallel
        esterelSequence.list.forEach[ transformStatement(targetStatementSequence) ]

        targetStatementSequence
    }

    /**
     * Await may be a simple await statement or a case statement.
     * 
     * @param await The Await-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Await await, StatementSequence targetStatementSequence) {
        if (await.body instanceof AwaitCase) {
            handleAwaitCase((await.body as AwaitCase), targetStatementSequence)
        } else if (await.body instanceof AwaitInstance) {
            handleAwaitInstance(await.body as AwaitInstance, targetStatementSequence)
        }

        targetStatementSequence
    }

    /**
     * await case s1 do q1;...;case sn do qn end
     * l1: pause; if s1 then q1; goto l2 end;...; if sn then qn; goto l2 end; goto l1; l2:
     * Cases are handled in a "break" style; if a case is taken, a goto to the end of the
     * statement is taken.
     * 
     * @param awaitCase The AwaitCase-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def StatementSequence handleAwaitCase(AwaitCase awaitCase, StatementSequence targetStatementSequence) {
        val awaitStartLabel = createNewUniqueLabel // Start of the await statement
        val awaitEndLabel = createNewUniqueLabel // End of the await statement

        val collectAwaits = new LinkedList<Pair<Conditional, String>>

        for (singleCase : awaitCase.cases) {
            val awaitCondition = createConditional => [
                expression = transformExp(singleCase.delay.event.expr)
            ]

            // If there is an additional delay expression (case n x do) add counting integer
            val caseEnd = createNewUniqueLabel
            if (singleCase.delay.expr != null) {

                // i counts occurrences of the signal
                val delayExpressionCounter = createNewUniqueVariable("i", ValueType::INT)
                counterToEventMap.put(delayExpressionCounter.name, delayExpressionCounter)
                localDeclarations += delayExpressionCounter
                delayExpressionCounter.initialValue = 0.createIntValue

                // Increment counter if guard holds
                awaitCondition.statements += incrementInt(delayExpressionCounter)

                // Check counting condition
                val checkCounter = createGT(singleCase.delay.expr.transformExp("int"), delayExpressionCounter.createValObjRef)
                val countCondition = createConditional => [
                    expression = checkCounter
                    elseStatements += createStatement(createAssignment(delayExpressionCounter, createIntValue(0)))
                    statements += createGotoStm(caseEnd)
                ]
                awaitCondition.statements.add(createStatement(countCondition))
            }

            // Possible "do" block
            if (singleCase.statement != null)
                awaitCondition.add(transformStatement(singleCase.statement, createSclStatementSequence))
            awaitCondition.add(createGotoStm(awaitEndLabel))
            if (singleCase.delay.isImmediate) {
                targetStatementSequence.add(EcoreUtil.copy(awaitCondition))
                targetStatementSequence.addLabel(caseEnd)
                val caseEndAfterPause = createNewUniqueLabel
                collectAwaits.add(awaitCondition -> caseEndAfterPause)
            } else {
                collectAwaits.add(awaitCondition -> caseEnd)
            }
        }
        targetStatementSequence.addLabel(awaitStartLabel)
        targetStatementSequence.createSclPause
        collectAwaits.forEach[targetStatementSequence.add(key); targetStatementSequence.addLabel(value)]

        targetStatementSequence.addGoto(awaitStartLabel)
        targetStatementSequence.addLabel(awaitEndLabel)

        targetStatementSequence
    }

    /**
     * await (immediate)? s (do p end)?
     * -> l1: pause; if !s then goto l1 end; (p)? (delayed await) |
     *    l1: if !s then pause; goto l1 end; (p)? (immediate await)
     * 
     * @param await The AwaitInstance-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def StatementSequence handleAwaitInstance(AwaitInstance await, StatementSequence targetStatementSequence) {

        // await 0 s should do nothing (but maybe the do block)
        println("delay " + await.delay)
        println("await " + await)
        if ((await.delay.expr instanceof ConstantExpression) && (await.delay.expr as ConstantExpression).value == "0") {
            if (await.statement != null)
                transformStatement(await.statement, targetStatementSequence)
            return targetStatementSequence
        }

        // If delayed expression a counter is needed
        var ValuedObject i
        val l = createNewUniqueLabel // Label to return to if await condition not fulfilled

        targetStatementSequence.addLabel(l)
        labelToThreadMap.put(currentThreadEndLabel, l)

        // await tick is just a pause
        if (await.delay.event.expr == null && await.delay.expr == null) {
            return targetStatementSequence.createSclPause
        }

        // Depending on if it is immediate, pause is set before or after the check for the condition
        if (!await.delay.isImmediate) {
            targetStatementSequence.createSclPause
        }

        // Wait several times, e.g. await 5 s
        // i counts
        if (await.delay.expr != null) {
            i = createNewUniqueVariable("i", ValueType::INT)
            counterToEventMap.put(i.name, i)
            localDeclarations += i
            i.initialValue = createIntValue(0)

            // if s present increment counter
            // if await n tick just increment it
            if (await.delay.event.expr != null) {
                val condTimes = createConditional
                condTimes.expression = transformExp(await.delay.event.expr)
                condTimes.statements.add(incrementInt(i))
                targetStatementSequence.add(condTimes)
            } else {
                targetStatementSequence.add(incrementInt(i))
            }
        }

        // This is probably not an await tick
        if (await.delay.event.expr != null) {
            val b = createNot(transformExp(await.delay.event.expr)) // If b is true do return to label l

            val cond = createConditional

            // The counter has to be at the specified value
            if (await.delay.expr != null) {
                cond.expression = createGT(await.delay.expr.transformExp("int"), i.createValObjRef)
            } else if (await.delay.event.expr != null) {
                cond.expression = b
            }
            if (await.delay.isImmediate) {
                cond.statements.addAll(createSclPause(createSclStatementSequence).statements)
            }
            cond.statements.add(createGotoStm(l))

            targetStatementSequence.add(cond)
            if (await.delay.expr != null)
                targetStatementSequence.add(createAssignment(i, createIntValue(0)))
        }

        // Possible do-Block
        if (await.statement != null)
            transformStatement(await.statement, targetStatementSequence)

        targetStatementSequence
    }

    /**
     * loop p (each s)? end
     * Depending on if "each s" or not, a handler is called or it is simply transformed to a goto-loop.
     * 
     * @param loop The loop-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def dispatch StatementSequence transformStatement(Loop loop, StatementSequence targetStatementSequence) {

        // loop p each s
        if (loop.end instanceof LoopDelay) {
            return handleLoopEach(loop, targetStatementSequence)
        }

        val l = createNewUniqueLabel
        targetStatementSequence.addLabel(l)
        transformStatement(loop.body.statement, targetStatementSequence)
        targetStatementSequence.addGoto(l)

        targetStatementSequence
    }

    /**
     * loop p each s end
     * Simply transforms the loop each to kernel statements and transforms them to SCL
     * 
     * @param loop The Loop-statement which is an instance of LoopEach
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def StatementSequence handleLoopEach(Loop loop, StatementSequence targetStatementSequence) {
        val newLoop = EsterelFactory::eINSTANCE.createLoop => [
            body = EsterelFactory::eINSTANCE.createLoopBody => [
                statement = EsterelFactory::eINSTANCE.createAbort => [
                    body = EsterelFactory::eINSTANCE.createAbortInstance => [
                        delay = (loop.end as LoopDelay).delay
                    ]
                    statement = EsterelFactory::eINSTANCE.createSequence => [
                        list.add(loop.body.statement)
                        list.add(EsterelFactory::eINSTANCE.createHalt)
                    ]
                ]
            ]
        ]
        transformStatement(newLoop, targetStatementSequence)
    }

    /**
     * every s do p end
     * Simply transforms the every to kernel statements and transforms them to SCL
     * 
     * @param everyDo The EveryDo-statement
     * @param targetStatementSequence    The StatementSequence which should contain the transformed statements
     * @return       s The transformed statement
     */
    def dispatch StatementSequence transformStatement(EveryDo everyDo, StatementSequence targetStatementSequence) {
        println("every delay " + everyDo.delay)
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
        transformStatement(stm, targetStatementSequence)
    }

    /**
     * pause
     * 
     * @param pause The Pause-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return      The transformed statement
     */
    def dispatch StatementSequence transformStatement(de.cau.cs.kieler.esterel.esterel.Pause pause, StatementSequence targetStatementSequence) {
        targetStatementSequence.createSclPause
    }

    /**
     * Creates an scl pause statement with respect to surrounding preemption. That is, if at some point
     * of the transformation a scl-pause statement should be generated, the transformations saved
     * in pauseTransformations are applied in the correct order.
     * 
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def StatementSequence createSclPause(StatementSequence targetStatementSequence) {
        val sclPause = createStatement(SclFactory::eINSTANCE.createPause).createSclStatementSequence
        pauseTransformation.forEach[it.apply(sclPause)]

        targetStatementSequence.add(sclPause)
    }

    /**
     * nothing
     * Dummy statement in Esterel, is ignored
     * 
     * @param nothing The Nothing-statement
     * @param targetStatementSequence    The StatementSequence which should contain the transformed statements
     * @return        The transformed statement
     */
    def dispatch StatementSequence transformStatement(Nothing nothing, StatementSequence targetStatementSequence) {
        targetStatementSequence
    }

    /**
     * halt
     * Halt is transformed to a pause-loop
     * 
     * @param halt The Hun-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def dispatch StatementSequence transformStatement(Halt halt, StatementSequence targetStatementSequence) {
        val l = createNewUniqueLabel
        targetStatementSequence.addLabel(l)
        targetStatementSequence.createSclPause
        targetStatementSequence.addGoto(l)

        targetStatementSequence
    }

    /**
     * [ p ] (Block Statement)
     * This is used to define blocks to scope parallel, e.g. indicate which statements should run in parallel. 
     * As SCL uses a fork-par-join construct, simply the body is transformed.
     * 
     * @param block The Block-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return      The transformed statement
     */
    def dispatch StatementSequence transformStatement(Block block, StatementSequence targetStatementSequence) {
        transformStatement(block.statement, targetStatementSequence)
    }

    /**
     * present s (then p)? (else q)? end | present case s1 do q1;...;case sn do qn end;
     * Present statements are transformed to corresponding SCL conditionals
     * 
     * @param pres The Present-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def dispatch StatementSequence transformStatement(Present pres, StatementSequence targetStatementSequence) {

        // No cases
        if (pres.body instanceof PresentEventBody) {

            // present tick always takes the then branch
            if ((pres.body as PresentEventBody).event.expression == null) {
                val thenPart = createSclStatementSequence
                transformStatement((pres.body as PresentEventBody).thenPart.statement, thenPart)
                targetStatementSequence.add(thenPart)
                return targetStatementSequence
            }

            // Simple present
            val cond = createConditional => [
                expression = transformExp((pres.body as PresentEventBody).event.expression)
                if ((pres.body as PresentEventBody).thenPart != null) {
                    val thenPart = createSclStatementSequence
                    transformStatement((pres.body as PresentEventBody).thenPart.statement, thenPart)
                    statements += thenPart.statements
                }
                if (pres.elsePart != null) {
                    val elsePart = createSclStatementSequence
                    transformStatement(pres.elsePart.statement, elsePart)
                    elseStatements += elsePart.statements
                }
            ]
            targetStatementSequence.add(cond)

            return targetStatementSequence
        }
        // present case s do ...
        // Transformed to list of conditionals; goto l_end can be seen as "break"
        else if (pres.body instanceof PresentCaseList) {
            val l_end = createNewUniqueLabel
            for (singleCase : (pres.body as PresentCaseList).cases) {
                targetStatementSequence.add(
                    createConditional => [
                        expression = transformExp(singleCase.event.expression)
                        statements.addAll(transformStatement(singleCase.statement, createSclStatementSequence).statements)
                        statements.addGoto(l_end) // If statements was taken break out and terminate
                    ])
            }
            targetStatementSequence.addLabel(l_end)

            return targetStatementSequence
        }
    }

    /**
     * signal s in p end
     * Local signal declarations are translated to StatementScopes. A parallel thread sets all variables
     * to false with an absolute write until the local statement terminates (indicated by f_term).
     * 
     * @param LocalSignalDecl The LocalSignalDecl-statement
     * @param targetStatementSequence            The StatementSequence which should contain the transformed statements
     * @return                The transformed statement
     */
    def dispatch StatementSequence transformStatement(LocalSignalDecl signal, StatementSequence targetStatementSequence) {
        val sScope = newSscope
        val signals = new LinkedList<Pair<String, ValuedObject>> // Remember created signals to delete them after transofmration of signal body
        // Calculate if the statement terminates and add check for f_term or not
        val terms = signal.statement.checkTerminate
        var ValuedObject f_term
        
        if (!optimizeTransformation || terms) {
            f_term = createFreshVar(sScope, "f_term", ValueType::BOOL) // Used to signal the resetting thread that it may terminate
            sScope.add(createAssignment(f_term, createBoolValue(false)))
        }

        // Create variables for each signal
        for (s : (signal.signalList as LocalSignal).signal) {
            val obj = createValuedObject(s.name)
//            sScope.add(createAssignment(obj, createBoolValue(false)))
            signalToVariableMap.add(obj.name -> obj)
            signals.add(obj.name -> obj)
            sScope.declarations += createDeclaration => [valuedObjects += obj; type = ValueType::BOOL]

            // Valued signal
            if (s.channelDescr != null) {
                val s_val = createValuedObject(s.name + "_val") => [
                    println("typo "+s.type.getName())
                    if (s.type.getName() == "PURE" && s.channelDescr.type.typeID != null) {
                        type = ValueType::HOST
                    } else {
                        type = ValueType::getByName(s.channelDescr.type.type.getName())
                    }
                    // Combine Operator
                    if (s.channelDescr.expression != null) {
                        initialValue = s.channelDescr.expression.transformExp(s.channelDescr.type.type.toString)
                    }
                    if (s.channelDescr.type.operator != null)
                        combineOperator = s.channelDescr.type.operator.transformCombineOperator
                ]
                sScope.declarations += createDeclaration => [
                    valuedObjects += s_val
                    if (s.type.getName() == "PURE" && s.channelDescr.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = s.channelDescr.type.typeID
                    } else {
                        it.type = ValueType::getByName(s.channelDescr.type.type.getName())
                    }
                ]
                println("adding " + obj + " and " + s_val)
                signalToValueMap.put(obj, s_val)
            }
        }

        // Thread containing transformed local signal body
        val oldLabel = currentThreadEndLabel
        val newLabel = createNewUniqueLabel
        currentThreadEndLabel = newLabel
        val th = newThread
        transformStatement(signal.statement, th)
        th.addLabel(newLabel)
        currentThreadEndLabel = oldLabel
        if (!optimizeTransformation || terms) 
          th.add(createAssignment(f_term, createBoolValue(true)))

        // Create Thread to reset all locally declared signals in each tick
        val resetTh = newThread
        val l_reset = createNewUniqueLabel
        resetTh.addLabel(l_reset)

        signals.forEach[resetTh.add(createAssignment(it.value, createBoolValue(false)))]
        if (!optimizeTransformation || terms) {
            resetTh.add(ifThenGoto(createNot(f_term.createValObjRef), l_reset, false))
        } else if (optimizeTransformation) {
            resetTh.add(SclFactory::eINSTANCE.createPause)
            resetTh.addGoto(l_reset)
        }
        val par = createParallel
        par.threads += th
        par.threads += resetTh
        sScope.statements += par.createStatement
        signalToVariableMap.removeAll(signals) // Remove local signals from signalMap

        targetStatementSequence.statements += sScope.createStatement

        targetStatementSequence
    }

    /**
     * (weak)? abort p when (((immediate)? s) | (case s1 do q1;...;case ss do qn))
     * Transforms Abort-statements. Depending on the type (weak/strong/...) different handlers are called.
     * Universal transformation parts are done here.
     * 
     * @param abort The abort-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return      The transformed statement
     */
    def dispatch StatementSequence transformStatement(Abort abort, StatementSequence targetStatementSequence) {
        val sScope = newSscope

        // Abort Cases; transformed to nested aborts with additional checking which case was taken
        if (abort.body instanceof AbortCase) {

            // To later add the cases, i.e. what to do after termination of nested abort
            val saveAbort = EcoreUtil.copy(abort.body as AbortCase)
            val l_end = createNewUniqueLabel // Label at the end of the statement to ignore not taken cases
            labelToThreadMap.put(currentThreadEndLabel, l_end)

            // Create a depth flag to check whether delayed case may be taken or not
            val f_depth = createFreshVar(sScope, "f_depth", ValueType::BOOL)
            f_depth.initialValue = createBoolValue(false)

            // Set depth flag to true when a pause statement is executed
            pauseTransformation.push(
                [ StatementSequence seq |
                    seq.add(createAssignment(f_depth, createBoolValue(true)))
                ])

            // Transform to nested abort and then to SCL
            handleAbortCase(abort).transformStatement(sScope)
            pauseTransformation.pop

            // Check if and which case should be taken
            for (singleCase : saveAbort.cases) {
                sScope.add(
                    createConditional => [
                        val eventExpr = singleCase.delay.event.expr
                        if (singleCase.delay.isImmediate) {
                            if (singleCase.delay.expr != null) {
                                expression = createAnd(
                                    eventExpr.transformExp,
                                    signalToVariableMap.findLast[
                                        key == (singleCase.delay.event.expr as ValuedObject).name].value.createValObjRef
                                )
                            } else {
                                expression = eventExpr.transformExp
                            }

                        // Delayed cases have to check f_depth
                        } else {
                            if (singleCase.delay.expr != null) {
                                expression = createAnd(eventExpr.transformExp,
                                    createLEQ(singleCase.delay.expr.transformExp("int"),
                                        counterToEventMap.get(
                                            (singleCase.delay.event.expr as ValuedObjectReference).valuedObject.name).
                                            createValObjRef))
                            } else {
                                expression = createAnd(eventExpr.transformExp, createValObjRef(f_depth))
                            }
                        }
                        statements += singleCase.statement.transformStatement(newSseq).statements
                        statements += createGotoStm(l_end) // goto statements end to ignore not taken cases; break
                    ])

            }
            signalToVariableMap.remove(f_depth)
            sScope.addLabel(l_end)
            targetStatementSequence.add(sScope)

            return targetStatementSequence
        }

        // Weak and strong abort instance
        // Label at end of body
        val l = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, l)
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Delay Expression? E.g. abort p when 5 s
        val delayExpression = (abort.body as AbortInstance).delay.expr != null

        // Add a counting variable, if delay.expr is set; 
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createNewUniqueVariable("i", ValueType::INT)
            targetStatementSequence.add(createAssignment(counterVar, createIntValue(0)))
            localDeclarations += counterVar
            if ((abort.body as AbortInstance).delay.event.expr != null) {
                counterToEventMap.put(
                    ((abort.body as AbortInstance).delay.event.expr as ValuedObjectReference).valuedObject.name,
                    counterVar)
            }
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
            handleWeakAbort(abort, sScope, l, counter, countExp)

        // Strong abort
        } else {
            handleStrongAbort(abort, sScope, l, counter, countExp)
        }
        pauseTransformation.pop
        joinTransformation.pop

        // If body was left without being preempted, doNothing
        val l_doNothing = createNewUniqueLabel
        if ((abort.body as AbortInstance).statement != null)
            sScope.addGoto(l_doNothing)
        sScope.addLabel(l)

        // Some do statement
        if ((abort.body as AbortInstance).statement != null) {
            (abort.body as AbortInstance).statement.transformStatement(sScope)
            sScope.addLabel(l_doNothing)
        }
        targetStatementSequence.add(sScope)

        targetStatementSequence
    }

    /**
     * weak abort p when (immediate) s
     * 
     * @param abort    The weak Abort-statement
     * @param sScope   The StatementScope which should contain the transformed statements
     * @param l        Label at the end of the Abort-Statement
     * @param counter  Possible counting variable; e.g. in abort p when n s
     * @param countExp Possible counting expression, i.e. counter <= n
     * @return         The transformed StatementScope
     */
    def handleWeakAbort(Abort abort, StatementScope sScope, String l, ValuedObject counter,
        OperatorExpression countExp) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Delay Expression? E.g. weak abort p when n s
        val delayExpression = (abort.body as AbortInstance).delay.expr != null

        // Flag indicating whether weak abort was triggered
        val f_wa = createFreshVar(sScope, "f_wa", ValueType::BOOL)
        f_wa.initialValue = createBoolValue(false)

        // If delayed add depth flag, will be set to true after pauses
        var ValuedObject f_depthVar
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            f_depthVar = createFreshVar(sScope, "f_depth", ValueType::BOOL)
            f_depthVar.initialValue = createBoolValue(false)
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
                        (it as InstructionStatement).instruction instanceof Pause
                ])
            // Set f_wa flag if abort condition is true and goto l_exit
            seq.statements.add(idx,
                createStatement(
                    createConditional => [
                        statements.add(
                            createStatement(
                                createAssignment(f_wa, createOr(EcoreUtil.copy(f_wa_ref), createBoolValue(true)))))
                        if (delayExpression) {

                            // Immediate with delay expression
                            if (!(abort.body as AbortInstance).delay.isImmediate) {
                                expression = and(EcoreUtil.copy(countExp), EcoreUtil.copy(f_depth.createValObjRef))

                            // Delayed with delay expression
                            } else {
                                expression = EcoreUtil.copy(countExp)
                            }
                        } else {

                            // Immediate without delay expression
                            if (!(abort.body as AbortInstance).delay.isImmediate) {
                                expression = and(abortExpr.transformExp, f_depth.createValObjRef)

                            // Delayed without delay expression
                            } else {
                                expression = abortExpr.transformExp
                            }
                        }
                        statements.add(createGotoj(l, currentThreadEndLabel, labelToThreadMap))
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
                    statements.add(createGotoj(l, currentThreadEndLabel, labelToThreadMap))
                ])
        ]

        transformStatement(abort.statement, sScope)

        // Remove the defined flags from the signalMap
        signalToVariableMap.remove(f_wa.name -> f_wa)
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            signalToVariableMap.remove(f_depth.name -> f_depth)
        }
        sScope
    }

    /**
     * abort p when (immediate)? s
     * ->
     * (if s goto l end)? 
     * p [ pause -> pause; if (s) gotoj l |
     *     join -> join; if (s) gotoj l ];
     * l:
     * 
     * @param abort    The strong Abort-statement
     * @param sScope   The StatementScope which should contain the transformed statements
     * @param l        Label at the end of the Abort-Statement
     * @param counter  Possible counting variable; e.g. in abort p when n s
     * @param countExp Possible counting expression, i.e. counter <= n
     * @return         The transformed StatementScope
     */
    def handleStrongAbort(Abort abort, StatementScope sScope, String l, ValuedObject counter,
        OperatorExpression countExp) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Create abort flag and set to false
        val f_a = createFreshVar(sScope, "f_a", ValueType::BOOL)
        f_a.initialValue = createBoolValue(false)

        // If abort is immediate directly check for abort condition
        if ((abort.body as AbortInstance).delay.isImmediate) {
            sScope.add(
                createConditional => [
                    expression = transformExp(abortExpr)
                    statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                    statements += createGotoj(l, currentThreadEndLabel, labelToThreadMap)
                ])
        }

        val pause = [ StatementSequence seq |
            // If delay expression increment counter when abort expression is true
            if ((abort.body as AbortInstance).delay.expr != null) {
                seq.add(
                    createConditional => [
                        expression = transformExp(abortExpr)
                        statements += incrementInt(counter)
                    ])
                seq.add(
                    createConditional => [
                        expression = EcoreUtil.copy(countExp)
                        statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                        statements += createGotoj(l, currentThreadEndLabel, labelToThreadMap)
                    ])

            // No delay expression; just check abort condition, set flag and gotoj l
            } else {
                seq.add(
                    createConditional => [
                        expression = transformExp(abortExpr)
                        statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                        statements += createGotoj(l, currentThreadEndLabel, labelToThreadMap)
                    ])
            }
            seq
        ]

        // If abort flag is set goto l_exit after join
        val join = [ StatementSequence seq |
            seq.add(
                createConditional => [
                    expression = f_a.createValObjRef
                    statements += createGotoj(l, currentThreadEndLabel, labelToThreadMap)
                ])
            seq
        ]

        pauseTransformation.push(pause)
        joinTransformation.push(join)

        transformStatement(abort.statement, sScope)
        signalToVariableMap.remove(f_a.name -> f_a)

        sScope
    }

    /**
     * Transforms an (Weak) Abort with cases to a nested (Weak) Abort without cases
     * 
     * @param abortCase The Abort-statement with cases
     * @return          Abort-statement without cases
     */
    def de.cau.cs.kieler.esterel.esterel.Statement handleAbortCase(Abort abortCase) {
        val abortCaseBody = (abortCase.body as AbortCase)

        // All cases transformed
        if (abortCaseBody.cases.empty) {
            return abortCase.statement
        } else {

            // Weak Abort
            if (abortCase instanceof WeakAbort) {
                EsterelFactory::eINSTANCE.createWeakAbort => [
                    body = EsterelFactory::eINSTANCE.createWeakAbortInstance => [
                        delay = abortCaseBody.cases.head.delay
                    ]
                    abortCaseBody.cases.remove(0)
                    statement = handleAbortCase(abortCase)
                ]

            // Strong Abort
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

    /**
     * suspend p when (immediate)? (n)? s
     * -> (l: if s { pause; goto l };)? p [ pause -> l: pause; if s goto l ]
     * 
     * @param susp  The Suspend-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return      The transformed statement
     */
    def dispatch StatementSequence transformStatement(Suspend susp, StatementSequence targetStatementSequence) {

        // Delay Expression?
        val delayExpression = susp.delay.expr != null

        // Add a counting variable, if delay.expr is set
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createNewUniqueVariable("i", ValueType::INT)
            counterToEventMap.put(counterVar.name, counterVar)
            localDeclarations += counterVar
            targetStatementSequence.add(createAssignment(counterVar, 0.createIntValue))
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
            val l = createNewUniqueLabel
            targetStatementSequence.addLabel(l)
            targetStatementSequence.add(
                createConditional => [
                    if (delayExpression) {
                        expression = EcoreUtil.copy(countExp)
                    } else {
                        expression = transformExp(susp.delay.event.expr)
                    } statements.addAll(createSclPause.statements) statements.add(createGotoStm(l))])
        }

        // Check whether suspension is triggered on pause statements
        pauseTransformation.push [ StatementSequence seq |
            val l = createNewUniqueLabel
            seq.statements.add(0, createEmptyStm(l))
            if (delayExpression) {
                seq.add(
                    createConditional => [
                        expression = transformExp(susp.delay.event.expr)
                        statements += incrementInt(counter)
                    ])
                seq.add(ifThenGoto(EcoreUtil.copy(countExp), l, true))
            } else {
                seq.add(ifThenGoto(transformExp(susp.delay.event.expr), l, true))
            }
            seq
        ]

        transformStatement(susp.statement, targetStatementSequence)
        pauseTransformation.pop

        targetStatementSequence
    }

    /**
     * trap t1,...,tn in p handle t1 do q1 ... handle tn do qn end
     * Transformed according to the rule.
     * 
     * @param localVar  The LocalVariable-statement
     * @param targetStatementSequence      The StatementSequence which should contain the transformed statements
     * @return          The transformed statement
     */
    def dispatch StatementSequence transformStatement(Trap trap, StatementSequence targetStatementSequence) {
        val sScope = newSscope

        // Label at statements end
        val l = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, l)
        val exitVars = new LinkedList<ValuedObject>

        // Create flags for every trap declaration; add them to the exitMap
        trap.trapDeclList.trapDecls.forEach [
            val singleExit = createFreshVar(sScope, it.name, ValueType::BOOL)
            singleExit.initialValue = createBoolValue(false)
            exitVars += singleExit
            exitToLabelMap.put(it, (singleExit -> l))
        ]
        var Expression exitExprVar

        // Create condition to check if ecxeption was thrown. Depending on how much exits are declared
        // this is just a ValuedObjectReference or an OR expression
        if (exitVars.length == 1)
            exitExprVar = exitVars.get(0).createValObjRef
        // If several traps are declared, check if one of them was triggered
        else {
            exitExprVar = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::OR
                for (^var : exitVars) {
                    subExpressions += ^var.createValObjRef
                }
            ]
        }

        // No non final parameters in lambda expressions...
        val exitExpr = exitExprVar

        // The functions to apply on pause and join statements; as they are nearly the same "pause"
        // indicates whether it is a pause statement or a join
        val trans = [ boolean pause, StatementSequence seq |
            val stm = new LinkedList<Statement>
            // At pause and join check whether a trap was aktivated
            stm.add(
                createStatement(
                    createConditional => [
                        expression = EcoreUtil.copy(exitExpr)
                        statements.add(createGotoj(l, currentThreadEndLabel, labelToThreadMap))
                    ]))
            if (pause) {

                // Insert directly before the pause statement
                val idx = seq.statements.indexOf(
                    seq.statements.findFirst [
                        it instanceof InstructionStatement &&
                            (it as InstructionStatement).instruction instanceof Pause
                    ])
                seq.statements.addAll(idx, stm)
            } else
                seq.statements.addAll(stm)
            seq
        ]
        pauseTransformation.push[StatementSequence stm|trans.apply(true, stm)]
        joinTransformation.push[StatementSequence stm|trans.apply(false, stm)]

        // Transform the traps body statements if there are some
        if (trap.statement != null)
            trap.statement.transformStatement(sScope)

        pauseTransformation.pop
        joinTransformation.pop
        sScope.addLabel(l)
        exitVars.forEach[sScope.statements.removeInstantaneousGotos(l, it)]

        // Transform trap handlers
        for (trapHandler : trap.trapHandler) {
            sScope.add(
                createConditional => [
                    expression = trapHandler.trapExpr.transformExp
                    statements += trapHandler.statement.transformStatement(newSseq).statements
                ])
        }
        targetStatementSequence.add(sScope)

        targetStatementSequence
    }

    /**
     * exit T
     * Throws an exception. The to T corresponding variable is set to true and a goto to the
     * corresponding label is added.
     * 
     * @param exit  The Exit-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return      The transformed statement
     */
    def dispatch StatementSequence transformStatement(Exit exit, StatementSequence targetStatementSequence) {

        // Get corresponding exit variable and set it to true
        val exitVar = exitToLabelMap.get(exit.trap)

        val op = createOr(exitVar.key.createValObjRef, createBoolValue(true))
        targetStatementSequence.add(createAssignment(exitVar.key, op))

        // Goto the corresponding label if in the same thread, to l_exit otherwise
        val l = exitVar.value
        targetStatementSequence.addGotoj(l, currentThreadEndLabel, labelToThreadMap)

        targetStatementSequence
    }

    /**
     * run mod [...]
     * The specified module is copied and transformed. Signals which are not already defined in
     * the surrounding module are defined locally, renaming is applied if specified.
     * 
     * @param run  The run-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return     The transformed statement
     */
    def dispatch StatementSequence transformStatement(Run run, StatementSequence targetStatementSequence) {

        // Thread containing the transformed run module body
        val runModuleBody = createThread

        // Label at threads end
        val l_exit = createNewUniqueLabel
        val oldCurLabel = currentThreadEndLabel
        currentThreadEndLabel = l_exit

        val sScope = newSscope

        // Pure signals that have to be set to false in reset thread
        val pureSignals = new LinkedList<ValuedObject>
        val p = SclFactory::eINSTANCE.createSCLProgram
        transformEsterelInterface(run.module.module.interface, p, new LinkedList<Pair<String, ValuedObject>>,
            new HashMap<ValuedObject, ValuedObject>)
        val collectDecls = new LinkedList<Declaration>

        // Signal declared in run module have to be copied, but only if not already done
        p.declarations.forEach [
            if (!(alreadyDefined(it.valuedObjects.head.name))) {
                if (!it.valuedObjects.head.name.endsWith("_val")) {
                    if (!it.const) {
                        runModuleBody.add(createAssignment(it.valuedObjects.head, createBoolValue(false)))
                        pureSignals += it.valuedObjects.head
                    }
                }
                collectDecls += it
                signalToVariableMap += it.valuedObjects.head.name -> it.valuedObjects.head
            }
        ]
        // Add valued variables to valued map
        collectDecls.forEach[
            if (it.valuedObjects.head.name.endsWith("_val")) {
                val signalName = it.valuedObjects.head.name
                signalToValueMap.put(pureSignals.findFirst[it.name == signalName.substring(0, signalName.length-4)],
                    it.valuedObjects.head
                )
            }
        ]
        sScope.declarations += collectDecls

        // Rename signals (only if renaming happens) and remember to delete afterwards
        val signals = new LinkedList<Pair<String, ValuedObject>>
        // Copy module as for the specific case renaming is applied
        val runCopy = EcoreUtil.copy(run)
        if (runCopy.list != null) {
            runCopy.list.list.forEach [
                for (renaming : renamings) {
//                    val oldNamedValuedObject = runCopy.module.module.eAllContents.toList.filter(
//                        typeof(de.cau.cs.kieler.esterel.kexpressions.ValuedObject)
//                    ).filter[it.name == (renaming as SignalRenaming).oldName.name]
//                    oldNamedValuedObject.forEach[ it.name = (renaming as SignalRenaming).newName.name ]
                    
                    if (renaming instanceof SignalRenaming) {
                        val newName = (renaming as SignalRenaming).oldName.name ->
                            signalToVariableMap.findLast[key == (renaming as SignalRenaming).newName.name].value
                        signalToVariableMap.add(newName)
                        signals.add(newName)
                    } else if (renaming instanceof ConstantRenaming) {
                        val newName = (renaming as ConstantRenaming).oldName.name ->
                            signalToVariableMap.findLast[key == (renaming as ConstantRenaming).newName.name].value
                        signalToVariableMap.add(newName)
                        signals.add(newName)
                    }
                }
            ]
        }

        // Copy the body in case of multiple calls for the same module
        val statements = runCopy.module.module.body
        statements.statements.forEach[transformStatement(runModuleBody)]
        signalToVariableMap.removeAll(signals)
        
        // Remove locally declarations from signalToVariableMap
        val allLocalDeclaredVariables = <ValuedObject>newLinkedList
        collectDecls.forEach[ valuedObjects.forEach[ allLocalDeclaredVariables += it ]]
        signalToVariableMap.removeAll(signalToVariableMap.filter[allLocalDeclaredVariables.contains(value)])
        

        // Create a parallel if the new StatementScope contains signal declarations to reset them
        val boolean programTerminates = runCopy.checkTerminate

        if (!sScope.declarations.nullOrEmpty) {
            val f_term = createFreshVar(sScope, "f_term", ValueType::BOOL)
            if (!optimizeTransformation || programTerminates)
                sScope.statements.add(0, createStatement(createAssignment(f_term, createBoolValue(false))))
            val resetSignalsThread = createThread
            val l_reset = createNewUniqueLabel
            resetSignalsThread.addLabel(l_reset)
            resetSignalsThread.add(SclFactory::eINSTANCE.createPause)
            pureSignals.forEach[resetSignalsThread.add(createAssignment(it, createBoolValue(false)))]
            if (optimizeTransformation && !programTerminates) {
                resetSignalsThread.addGoto(l_reset)
            } else {
                resetSignalsThread.add(ifThenGoto(createNot(f_term.createValObjRef), l_reset, true))
            }
            val sclRunModule = createParallel
            sclRunModule.threads += resetSignalsThread
            if (!optimizeTransformation || programTerminates)
                runModuleBody.add(createAssignment(f_term, createBoolValue(true)))
            sclRunModule.threads += runModuleBody
            runModuleBody.addLabel(l_exit)
            currentThreadEndLabel = oldCurLabel
            sScope.add(sclRunModule)
            targetStatementSequence.add(sScope)

            return targetStatementSequence
        } else {
            runModuleBody.addLabel(l_exit)
            currentThreadEndLabel = oldCurLabel
            sScope.add(runModuleBody)
            targetStatementSequence.add(sScope)
            return targetStatementSequence
        }
    }

    /**
    * var v1 : type1,..., vn : typen in p end
    * Local variable declaration. Transformed to SCL StatementScope
    * 
    * @param localVar  The LocalVariable-statement
	* @param targetStatementSequence 	   The StatementSequence which should contain the transformed statements
	* @return 		   The transformed statement
    */
    def dispatch StatementSequence transformStatement(LocalVariable localVar, StatementSequence targetStatementSequence) {
        // Mark variables with suffix to distinguish from signals
//        localVar.eAllContents.toList.filter(IVariable).forEach[ name = name + "_var" ]
        
        val sScope = newSscope

        // Remember local variables to delete them after body transformation
        val signals = new LinkedList<Pair<String, ValuedObject>>
        localVar.^var.varDecls.forEach [
            val decl = transformIntVarDeclaration(it, signals, signalToVariableMap)
            sScope.declarations += decl
        ]

        localVar.statement.transformStatement(sScope)
        targetStatementSequence.add(sScope)
        signalToVariableMap.removeAll(signals)

        targetStatementSequence
    }

    /**
    * v1 := v2
    * Simply transformed to SCL assignment
    * 
    * @param assign  The assignemnt-statement
	* @param targetStatementSequence 	 The StatementSequence which should contain the transformed statements
	* @return 		 The transformed statement
    */
    def dispatch StatementSequence transformStatement(Assignment assign, StatementSequence targetStatementSequence) {

        // Get the last defined variable with the corresponding name
        val arg1 = signalToVariableMap.findLast[ key == assign.^var.name ].value
        val expr = transformExp(assign.expr, arg1.type.toString)

        targetStatementSequence.add(createAssignment(arg1, expr))

        targetStatementSequence
    }

    /**
    * if e (then p)? (else q)? end
    * Simply transformed to SCL conditional
    * 
    * @param ifTest  The if-statement
	* @param targetStatementSequence 	 The StatementSequence which should contain the transformed statements
	* @return 		 The transformed statement
    */
    def dispatch StatementSequence transformStatement(IfTest ifTest, StatementSequence targetStatementSequence) {
        val cond = createConditional => [
            expression = ifTest.expr.transformExp
            if (ifTest.thenPart != null)
                statements += transformStatement(ifTest.thenPart.statement, newSseq).statements
            if (ifTest.elsePart != null)
                elseStatements += transformStatement(ifTest.elsePart.statement, newSseq).statements
        ]
        targetStatementSequence.add(cond)

        targetStatementSequence
    }

    /**
    * (positive)? repeat n times p end
    * Repeat statements are transformed by using a goto loop and a counting variable
    * 
	* @param repeat  The repeat-statement
	* @param targetStatementSequence 	 The StatementSequence which should contain the transformed statements
	* @return        The transformed statement
    */
    def dispatch StatementSequence transformStatement(Repeat repeat, StatementSequence targetStatementSequence) {

        val sScope = newSscope

        // Label at statements end to stop looping
        val l_end = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, l_end)

        // If not marked as positive and non positive value is given do nothing (goto l_end)
        if (!repeat.positive) {
            val exprVal = EcoreUtil.copy(repeat.expression.transformExp("int"))
            val op = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GEQ
                subExpressions += createIntValue(0)
                subExpressions += exprVal
            ]
            sScope.add(ifThenGoto(op, l_end, true))
        }

        // The counting variable
        val i = createFreshVar(sScope, "i", ValueType::INT)
        sScope.add(createAssignment(i, 0.createIntValue))

        // Label at statements start, for looping
        val l = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, l)
        sScope.addLabel(l)
        repeat.statement.transformStatement(sScope)
        sScope.add(incrementInt(i))

        // Add a check whether repeat should loop or return
        sScope.add(ifThenGoto(createGT(repeat.expression.transformExp("int"), i.createValObjRef), l, true))

        sScope.addLabel(l_end)
        targetStatementSequence.add(sScope)

        targetStatementSequence
    }

    /**
    * call p(x1,...,xn)(y1,...,yn)     
    * Procedure calls. Transformed to function calls in SCL as they have te same effect.
    * 
    * @param procCall  The procedure-call-statement
    * @param targetStatementSequence 		The StatementSequence which should contain the transformed statements
    * @return 			The transformed statement
    */
    def dispatch StatementSequence transformStatement(ProcCall procCall, StatementSequence targetStatementSequence) {
        val sScope = newSscope

        // Function Calls are, in contrast to Procedure Calls in Esterel, Expressions
        val valObj = createFreshVar(sScope, "procDummy", ValueType::BOOL)

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
                    expression = createValObjRef(signalToVariableMap.findLast[key == v.name].value)
                    callByReference = true
                ]
            )
        }

        // Create dummy assignment
        sScope.add(createAssignment(valObj, res))
        targetStatementSequence.add(sScope)

        targetStatementSequence
    }

    /**
	* do p (upto s | watching s timeout q)?
	* Deprecated, but used for example in wristwatch
	* Simply transforms the doupto to kernel statements and transforms them
	* 
	* @param ^do  The do-statement
	* @param targetStatementSequence The StatementSequence which should contain the transformed statements
	* @return 	The transformed statement
	*/
    def dispatch StatementSequence transformStatement(Do ^do, StatementSequence targetStatementSequence) {
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
            abort.transformStatement(targetStatementSequence)
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
            abort.transformStatement(targetStatementSequence)
        } else {
            ^do.statement.transformStatement(targetStatementSequence)
        }

        targetStatementSequence
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
