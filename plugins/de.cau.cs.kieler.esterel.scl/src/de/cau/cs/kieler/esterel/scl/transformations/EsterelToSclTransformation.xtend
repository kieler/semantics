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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.AbortCase
import de.cau.cs.kieler.esterel.esterel.AbortInstance
import de.cau.cs.kieler.esterel.esterel.Assignment
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.AwaitInstance
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Constant
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
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.ProcCall
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Reset
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.UnEmit
import de.cau.cs.kieler.esterel.esterel.WeakAbort
import de.cau.cs.kieler.esterel.esterel.WeakAbortInstance
import de.cau.cs.kieler.esterel.features.EsterelFeature
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.IVariable
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.transformations.EsterelTransformation
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.features.SCLFeatures
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
import java.util.Set
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import java.util.List
import de.cau.cs.kieler.esterel.esterel.WeakSuspend

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
 * @author krat ssm
 * @kieler.design 2015-05-25 proposed 
 * @kieler.rating yellow 2015-03-14 review KI-63 by ssm, ima, cmot
 * 
 */
class EsterelToSclTransformation extends AbstractProductionTransformation implements Traceable {

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsCreateExtensions
    
    @Inject
    extension KExpressionsComplexCreateExtensions

    @Inject
    extension EsterelToSclExtensions

    @Inject
    extension EsterelDeclarationsTransformation

    @Inject
    extension TransformExpression
    
    @Inject 
    extension SCLExtensions

    // Label at the end of currently transformed thread
    var String currentThreadEndLabel

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelToThreadMap

    // List of exit signals and the corresponding label
    var protected HashMap<ISignal, Pair<ValuedObject, String>> exitToLabelMap
    
    // List of variables for valued traps
    var protected HashMap<ISignal, ValuedObject> valuedExitVariables

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var protected LinkedList<Pair<String, ValuedObject>> signalToVariableMap

    // Maps valued variables to signal
    var protected HashMap<ValuedObject, ValuedObject> signalToValueMap

    // Maps variables holding the neutral element for a valued, combined signal to the signal and saves combine operator
    var protected HashMap<ValuedObject, ValuedObject> signalToNeutralMap

    // Associates counting variables to the corresponding delay event
    var HashMap<String, ValuedObject> counterToEventMap

    // Local declared variables which are not in a StatementScope (should be added to global declarations)
    var LinkedList<ValuedObject> localBoolDeclarations
    var LinkedList<ValuedObject> localIntDeclarations

    // The tick; i.e., tick is true all the time
    var protected ValuedObject synchronousTick;

    // Flag indicating if optimized transformations should be used
    var boolean optimizeTransformation

    // List of transformation functions to manipulate pauses and join
    var Stack<(StatementSequence)=>StatementSequence> pauseTransformation
    var Stack<(StatementSequence)=>StatementSequence> joinTransformation
    
    override getId() {
        return EsterelTransformation.SCL_ID
    }

    override getName() {
        return EsterelTransformation.SCL_NAME
    }
    
    override getProducedFeatureId() {
        return SCLFeatures.BASIC_ID
    }
    
    override Set<String> getRequiredFeatureIds() {
        return newHashSet(EsterelFeature.BASIC_ID);
    }

    /**
     * Generic transformation method for KiCo. Compile without optimized output variable resetting
     * if the program does not terminate.
     */
    def transformNoOpt(EObject eObject) {
        optimizeTransformation = false;
        return transformProgram(eObject as Program) 
    }
    
    /**
     * Generic transformation method for KiCo. Compile without optimized output variable resetting
     * if the program does not terminate.
     */
    override transform(EObject eObject) {
        optimizeTransformation = true;
        return (transformProgram(eObject as Program).optimizeAll) 
    }

    /**
     * Main transformation method.
     * 
     * @param esterelProgram The Esterel program to transform
     * @return The transformed SCL program
     */
    public def SCLProgram transformProgram(Program sourceEsterelProgram) {
        System.out.println("Transforming module " + sourceEsterelProgram.modules.head.name + " to SCL...")

        currentThreadEndLabel = "root"
        labelToThreadMap = HashMultimap.create()
        exitToLabelMap = <ISignal, Pair<ValuedObject, String>>newHashMap
        valuedExitVariables = <ISignal, ValuedObject>newHashMap
        signalToVariableMap = <Pair<String, ValuedObject>>newLinkedList
        signalToValueMap = <ValuedObject, ValuedObject>newHashMap
        signalToNeutralMap = <ValuedObject, ValuedObject>newHashMap
        counterToEventMap = <String, ValuedObject>newHashMap
        localBoolDeclarations = <ValuedObject>newLinkedList
        localIntDeclarations = <ValuedObject>newLinkedList
        synchronousTick = createValuedObject("synchronousTick")
        pauseTransformation = new Stack<(StatementSequence)=>StatementSequence>
        joinTransformation = new Stack<(StatementSequence)=>StatementSequence>

        // Check if naming conventions are satisfied
        sourceEsterelProgram.validateNames

        // Create the SCL program
        val targetSclProgram = SclFactory::eINSTANCE.createSCLProgram

        val primaryEsterelModule = sourceEsterelProgram.modules.head
        targetSclProgram.name = primaryEsterelModule.name

        // Interface transformations
        transformEsterelInterface(primaryEsterelModule.interface, targetSclProgram, signalToVariableMap,
            signalToValueMap)

        // Body transformations
        val sclStatementSequence = createStatementSequence
        primaryEsterelModule.body.statements.forEach[transformStatement(sclStatementSequence)]
        sclStatementSequence.addLabel("root")

        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName("f_term"))

        // Does the program terminate?
        var terminatesVar = true;
        if (optimizeTransformation)
          terminatesVar = sourceEsterelProgram.checkTerminate
        val terminates = terminatesVar
        if (!optimizeTransformation || terminates) {
            f_term.initialValue = createBoolValue(false)
            val decl = createDeclaration => [
                type = ValueType::BOOL
                valuedObjects.add(f_term)
            ]
            targetSclProgram.declarations.add(decl)
        }

        val rootParallelStatement = createParallel
        rootParallelStatement.threads.add(handleOutputs(targetSclProgram.variableDeclarations, f_term, terminates))
        rootParallelStatement.threads.add(
            createThread => [
                statements.addAll(sclStatementSequence.statements)
                if (!optimizeTransformation || terminates) {
                    statements.add(createStatement(createAssignment(f_term, createBoolValue(true))))
                }
            ])
        targetSclProgram.add(rootParallelStatement)

        // Add declarations for flags and integers created during transformation
        if (!localBoolDeclarations.nullOrEmpty) {
            targetSclProgram.declarations += createDeclaration => [
                type = ValueType::BOOL
                valuedObjects += localBoolDeclarations
            ]
        }
        if (!localIntDeclarations.nullOrEmpty) {
            targetSclProgram.declarations += createDeclaration => [
                type = ValueType::INT
                valuedObjects += localIntDeclarations
            ]
        }

        // Add variable representing tick; is true all the time
        targetSclProgram.declarations += createDeclaration => [
            type = ValueType::BOOL
            valuedObjects += synchronousTick
            synchronousTick.initialValue = createBoolValue(true)
        ]
        
        // Apply SCL optimization if triggered
        if (optimizeTransformation)
            targetSclProgram.optimizeAll

        // As the number with which the labels are enumerated is a static variable of the EsterelToSclExtensions
        // class, the numer is resetted to 1 after each transformation for subsequent calls
        resetLabelSuffix

        // Return the transformed program 
        System.out.println("Transformation to SCL finished")
        System.out.println("Scl Statements: " + countStatements(targetSclProgram))

        targetSclProgram
    }

    /**
     * Creates thread to set output signals to false at the start
     * of every tick.
     * 
     * @param declarations Declarations of the SCL target program
     * @param f_term Variable indicating if main program has terminated
     * @param terminates Indicates if the Esterel program may terminate or not
     * @return Thread setting all output variables to false by absolute write
     */
    def Thread handleOutputs(List<VariableDeclaration> declarations, ValuedObject f_term, boolean terminates) {
        val resetSignalVariablesThread = createThread
        val resetThreadStartLabel = createNewUniqueLabel

        resetSignalVariablesThread.addLabel(resetThreadStartLabel)

        // Set every boolean representing an output signal to false with absolute write
        for (singleDeclaration : declarations) {
            if (singleDeclaration.output && !singleDeclaration.input) {
                for (declaratedValuedObject : singleDeclaration.valuedObjects) {
                    if (declaratedValuedObject.type == ValueType::BOOL &&
                        !signalToValueMap.values.contains(declaratedValuedObject)) {
                        resetSignalVariablesThread.add(createAssignment(declaratedValuedObject, createBoolValue(false)))
                    }
                }
            }
        }

        // Set variables holding neutral elements for combined signals to neutral element
        signalToNeutralMap.values.forEach [
            switch (it.combineOperator) {
                case CombineOperator::ADD:
                    resetSignalVariablesThread.add(createAssignment(it, createIntValue(0)))
                case CombineOperator::MULT:
                    resetSignalVariablesThread.add(createAssignment(it, createIntValue(1)))
                case CombineOperator::MAX:
                    resetSignalVariablesThread.add(createAssignment(it, createIntValue(0)))
                case CombineOperator::MIN:
                    resetSignalVariablesThread.add(createAssignment(it, createIntValue(Integer.MAX_VALUE)))
                case CombineOperator::OR:
                    resetSignalVariablesThread.add(createAssignment(it, createBoolValue(false)))
                case CombineOperator::AND:
                    resetSignalVariablesThread.add(createAssignment(it, createBoolValue(true)))
                default: {
                }
            }
        ]

        // If signal was emitted set value to new value
        for (signalVariable : signalToNeutralMap.keySet) {
            resetSignalVariablesThread.add(
                createConditional => [
                    expression = signalVariable.createValuedObjectReference
                    statements += createStatement(
                        createAssignment(signalToValueMap.get(signalVariable),
                            signalToNeutralMap.get(signalVariable).createValuedObjectReference))
                ])
        }

        // If optimization flag is not set or program does not terminate create a conditional jump
        if (!optimizeTransformation || terminates) {
            resetSignalVariablesThread.add(newIfThenGoto(createNot(f_term.createValuedObjectReference), resetThreadStartLabel, false))
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
        // closest surrounding Scope. Signals with the same name defined in higher hierarchical levels
        // (and appear closer to the begin of the signal map) may be shadowed out.
        val emitVariable = signalToVariableMap.findLast[ it.key == emit.signal.name ].value

        val emitOperation = createOr(emitVariable.createValuedObjectReference, createBoolValue(true))

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
            val sclEmittedExpression = emit.expr.transformExp(emitValueVariable.type.toString)

            // Handle combine operator
            if (emitValueVariable.combineOperator.value != 0) {
                val emitNeutralVariable = signalToNeutralMap.get(emitVariable)
                targetStatementSequence.add(emitSignal)
                targetStatementSequence.add(
                    createStatement(
                        createAssignment(emitNeutralVariable,
                            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                operator = OperatorType::get(emitNeutralVariable.combineOperator.toString)
                                subExpressions.add(createValuedObjectReference(emitNeutralVariable))
                                subExpressions.add(EcoreUtil.copy(sclEmittedExpression))
                            ])))
            }
            // WAS
            //            if (emitValueVariable.combineOperator.value != 0) {
            //                val combineOrSetValue = createConditional => [
            //                    expression = emitVariable.createValObjRef
            //                    // If the signal was already emitted in this tick, apply combine function
            //                    statements += createStatement(
            //                        createAssignment(emitValueVariable,
            //                            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            //                                operator = OperatorType::get(emitValueVariable.combineOperator.toString)
            //                                subExpressions.add(createValObjRef(emitValueVariable))
            //                                subExpressions.add(EcoreUtil.copy(sclEmittedExpression))
            //                            ]))
            //                    // Else emit signal and set value
            //                    elseStatements.add(emitSignal)
            //                    elseStatements.add(createStatement(createAssignment(emitValueVariable, sclEmittedExpression)))
            //                ]
            //                targetStatementSequence.add(combineOrSetValue)
            //            }
            // Valued emit without combine function
            else {
                targetStatementSequence.add(emitSignal)
                targetStatementSequence.add(createAssignment(emitValueVariable, sclEmittedExpression))
            }
        }

        targetStatementSequence
    }


    /**
     * unemit s
     * -> s = false
     * UnEmit is only available in SCEst not in pure Esterel. UnEmit is transformed to setting the 
     * corresponding variable to false by an absolute write. The value is not affected.
     * 
     * @param unemit The UnEmit-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(UnEmit unemit, StatementSequence targetStatementSequence) {

        // Get the LAST defined valued object (with respect to local signals) as this is the one on the
        // closest surrounding Scope. Signals with the same name defined in higher hierarchical levels
        // (and appear closer to the begin of the signal map) may be shadowed out.
        val unEmitVariable = signalToVariableMap.findLast[ it.key == unemit.signal.name ].value

        // "unemits" the signal by setting it to false by an absolute write
        val emitSignal = createStatement(createAssignment(unEmitVariable,  createBoolValue(false)))

        targetStatementSequence.add(emitSignal)
       return targetStatementSequence
     }


    /**
     * reset s(t)
     * -> s_val = t
     * Reset is transformed to setting the corresponding s_val to the according value. The variable
     * carrying the present status is left untouched.
     * 
     * @param reset The Reset-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Reset reset, StatementSequence targetStatementSequence) {

        // Get the LAST defined valued object (with respect to local signals) as this is the one on the
        // closest surrounding Scope. Signals with the same name defined in higher hierarchical levels
        // (and appear closer to the begin of the signal map) may be shadowed out.
        val resetVariable = signalToVariableMap.findLast[ it.key == reset.signal.name ].value

        // Reset of a pure signal does nothing
        if (reset.expr == null) {
            return targetStatementSequence
        }

        // Reset of a valued signal makes sense
        else {
            // Get the corresponding valued variable
            val resetValueVariable = signalToValueMap.get(resetVariable)
            val sclEmittedExpression = reset.expr.transformExp(resetValueVariable.type.toString)

            // Valued reset without combine function
            targetStatementSequence.add(createAssignment(resetValueVariable, sclEmittedExpression))
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
        val join = createStatementSequence
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
    def dispatch StatementSequence transformStatement(Sequence esterelSequence,
        StatementSequence targetStatementSequence) {

        // List is a child of the thread statement and contains all threads in the parallel
        esterelSequence.list.forEach[transformStatement(targetStatementSequence)]

        targetStatementSequence
    }

    /**
     * Await may be a simple await statement or a case statement.
     * 
     * @param await The Await-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
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
                expression = transformExpression(singleCase.delay.event.expr)
            ]

            // If there is an additional delay expression (case n x do) add counting integer
            val caseEnd = createNewUniqueLabel
            if (singleCase.delay.expr != null) {

                // delayExpressionCounter counts occurrences of the signal
                val delayExpressionCounter = createNewUniqueVariable("i")
                counterToEventMap.put(delayExpressionCounter.name, delayExpressionCounter)
                localBoolDeclarations += delayExpressionCounter
                delayExpressionCounter.initialValue = 0.createIntValue

                // Increment counter if guard holds
                awaitCondition.statements += incrementInt(delayExpressionCounter)

                // Check counting condition
                val checkCounter = createGT(singleCase.delay.expr.transformExp("int"),
                    delayExpressionCounter.createValuedObjectReference)
                val countCondition = createConditional => [
                    expression = checkCounter
                    elseStatements += createStatement(createAssignment(delayExpressionCounter, createIntValue(0)))
                    statements += createGotoStatement(caseEnd)
                ]
                awaitCondition.statements.add(createStatement(countCondition))
            }

            // Possible "do" block
            if (singleCase.statement != null)
                awaitCondition.add(transformStatement(singleCase.statement, createStatementSequence))
            awaitCondition.add(createGotoStatement(awaitEndLabel))
            if (singleCase.delay.isImmediate) {
                targetStatementSequence.add(createStatement(EcoreUtil.copy(awaitCondition)))
                targetStatementSequence.addLabel(caseEnd)
                val caseEndAfterPause = createNewUniqueLabel
                collectAwaits.add(awaitCondition -> caseEndAfterPause)
            } else {
                collectAwaits.add(awaitCondition -> caseEnd)
            }
        }
        targetStatementSequence.addLabel(awaitStartLabel)
        targetStatementSequence.createSclPause
        collectAwaits.forEach[targetStatementSequence.add(createStatement(key)); targetStatementSequence.addLabel(value)]

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
        if ((await.delay.expr instanceof ConstantExpression) && (await.delay.expr as ConstantExpression).value == "0") {
            if (await.statement != null)
                transformStatement(await.statement, targetStatementSequence)
            return targetStatementSequence
        }

        // If delayed expression a counter is needed
        var ValuedObject delayExpressionCounter
        val awaitStartLabel = createNewUniqueLabel // Label to return to if await condition not fulfilled

        targetStatementSequence.addLabel(awaitStartLabel)
        labelToThreadMap.put(currentThreadEndLabel, awaitStartLabel)

        var awaitImmediateTick = false;
        if (await.delay.event.expr == null && await.delay.expr == null && !await.delay.isImmediate) {
            // await tick is just a pause
            return targetStatementSequence.createSclPause
        } else if (await.delay.event.expr == null && await.delay.expr == null && await.delay.isImmediate) {
            // await immediate tick case
            awaitImmediateTick = true; 
        }

        // Depending on if it is immediate, pause is set before or after the check for the condition
        if (!await.delay.isImmediate) {
            targetStatementSequence.createSclPause
        }

        // Wait several times, e.g. await 5 s
        // i counts
        if (await.delay.expr != null) {
            delayExpressionCounter = createNewUniqueVariable("i")
            counterToEventMap.put(delayExpressionCounter.name, delayExpressionCounter)
            localIntDeclarations += delayExpressionCounter
            delayExpressionCounter.initialValue = createIntValue(0)

            // if s present increment counter
            // if await n tick just increment it
            if (await.delay.event.expr != null || awaitImmediateTick) {
                val condTimes = createConditional
                condTimes.expression = transformExpression(await.delay.event.expr)
                condTimes.statements.add(incrementInt(delayExpressionCounter))
                val instr = SclFactory::eINSTANCE.createInstructionStatement
                instr.instruction = condTimes
                targetStatementSequence.add(instr)
            } else {
                targetStatementSequence.add(incrementInt(delayExpressionCounter))
                val cond = createConditional
                cond.expression = createGT(await.delay.expr.transformExp("int"), delayExpressionCounter.createValuedObjectReference)
                if (await.delay.isImmediate) {
                    cond.statements.addAll(createSclPause(createStatementSequence).statements)
                }
                cond.statements.add(createGotoStatement(awaitStartLabel))
                val instr = SclFactory::eINSTANCE.createInstructionStatement
                instr.instruction = cond
                targetStatementSequence.add(instr)
                if (await.delay.expr != null)
                    targetStatementSequence.add(createAssignment(delayExpressionCounter, createIntValue(0)))
            }
        }

        // This is not an await tick, as an delay event expression is given
        if (await.delay.event.expr != null || awaitImmediateTick) {
            val continueCondition = createNot(transformExpression(await.delay.event.expr)) // If b is true do return to label l

            // Conditional which has to be fulfilled to continue
            val awaitConditional = createConditional

            // The counter has to be at the specified value
            if (await.delay.expr != null) {
                awaitConditional.expression = createGT(await.delay.expr.transformExp("int"),
                    delayExpressionCounter.createValuedObjectReference)
            } else if (await.delay.event.expr != null || awaitImmediateTick) {
                awaitConditional.expression = continueCondition
            }
            if (await.delay.isImmediate) {
                awaitConditional.statements.addAll(createSclPause(createStatementSequence).statements)
            }
            awaitConditional.statements.add(createGotoStatement(awaitStartLabel))
            val instr = SclFactory::eINSTANCE.createInstructionStatement
            instr.instruction = awaitConditional
            targetStatementSequence.add(instr)
            if (await.delay.expr != null)
                targetStatementSequence.add(createAssignment(delayExpressionCounter, createIntValue(0)))
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
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Loop loop, StatementSequence targetStatementSequence) {
    
        // loop p each s
        if (loop.end instanceof LoopDelay) {
            return handleLoopEach(loop, targetStatementSequence)
        }
    
        val loopStartLabel = createNewUniqueLabel
        targetStatementSequence.addLabel(loopStartLabel)
        transformStatement(loop.body.statement, targetStatementSequence)
        targetStatementSequence.addGoto(loopStartLabel)
    
        targetStatementSequence
    }

    /**
     * loop p each s end
     * -> loop abort p; halt when s end
     * Simply transforms the loop each to kernel statements and transforms them to SCL
     * 
     * @param loop The Loop-statement which is an instance of LoopEach
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def StatementSequence handleLoopEach(Loop loop, StatementSequence targetStatementSequence) {
        val newLoop = EsterelFactory::eINSTANCE.createLoop => [
            body = EsterelFactory::eINSTANCE.createLoopBody => [
                statement = EsterelFactory::eINSTANCE.createAbort => [
                    body = EsterelFactory::eINSTANCE.createAbortInstance => [
                        delay = EcoreUtil.copy((loop.end as LoopDelay).delay)
                    ]
                    statement = EsterelFactory::eINSTANCE.createSequence => [
                        list.add(EcoreUtil.copy(loop.body.statement))
                        list.add(EsterelFactory::eINSTANCE.createHalt)
                    ]
                ]
            ]
        ]
        transformStatement(newLoop, targetStatementSequence)
    }

    /**
     * every (immediate)? s do p end
     * -> await (immediate)? s;  loop p each s
     * Simply transforms the every to kernel statements and transforms them to SCL
     * 
     * @param everyDo The EveryDo-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return s The transformed statement
     */
    def dispatch StatementSequence transformStatement(EveryDo everyDo, StatementSequence targetStatementSequence) {
        val transformedEsterelStatement = EsterelFactory::eINSTANCE.createSequence => [
            list.add(
                EsterelFactory::eINSTANCE.createAwait => [
                    body = EsterelFactory::eINSTANCE.createAwaitInstance => [
                        delay = EcoreUtil.copy(everyDo.delay)
                    ]
                ])
            list.add(
                EsterelFactory::eINSTANCE.createLoop => [
                    body = EsterelFactory::eINSTANCE.createLoopBody => [
                        statement = EcoreUtil.copy(everyDo.statement)
                    ]
                    end = EsterelFactory::eINSTANCE.createLoopDelay => [
                        delay = EcoreUtil.copy(everyDo.delay => [ isImmediate = false ])
                    ]
                ])
        ]
        transformStatement(transformedEsterelStatement, targetStatementSequence)
    }

    /**
     * pause
     * 
     * @param pause The Pause-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(de.cau.cs.kieler.esterel.esterel.Pause pause,
        StatementSequence targetStatementSequence) {
        targetStatementSequence.createSclPause
    }

    /**
     * Creates an scl pause statement with respect to surrounding preemption. That is, if at some point
     * of the transformation a scl-pause statement should be generated, the transformations saved
     * in pauseTransformations are applied in the correct order.
     * 
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def StatementSequence createSclPause(StatementSequence targetStatementSequence) {
        val sclPause = SclFactory::eINSTANCE.createPause.createStatementSequence
        pauseTransformation.forEach[ it.apply(sclPause) ]

        targetStatementSequence.add(sclPause)
    }

    /**
     * nothing
     * Dummy statement in Esterel, is ignored.
     * 
     * @param nothing The Nothing-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Nothing nothing, StatementSequence targetStatementSequence) {
        targetStatementSequence
    }

    /**
     * halt
     * Halt is transformed to a pause-loop
     * 
     * @param halt The Halt-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
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
     * @return The transformed statement
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
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Present present, StatementSequence targetStatementSequence) {

        // No cases
        if (present.body instanceof PresentEventBody) {

            // present tick always takes the then branch
            if ((present.body as PresentEventBody).event.expression == null) {
                val thenPart = createStatementSequence
                transformStatement((present.body as PresentEventBody).thenPart.statement, thenPart)
                targetStatementSequence.add(thenPart)
                return targetStatementSequence
            }

            // Simple present
            val cond = createConditional => [
                expression = transformExpression((present.body as PresentEventBody).event.expression)
                if ((present.body as PresentEventBody).thenPart != null) {
                    val thenPart = createStatementSequence
                    transformStatement((present.body as PresentEventBody).thenPart.statement, thenPart)
                    statements += thenPart.statements
                }
                if (present.elsePart != null) {
                    val elsePart = createStatementSequence
                    transformStatement(present.elsePart.statement, elsePart)
                    elseStatements += elsePart.statements
                }
            ]
            val instr= SclFactory::eINSTANCE.createInstructionStatement
            instr.instruction = cond
            targetStatementSequence.add(instr)

            return targetStatementSequence
        }
        // present case s do ...
        // Transformed to list of conditionals; goto l_end can be seen as "break"
        else if (present.body instanceof PresentCaseList) {
            val statementEndLabel = createNewUniqueLabel
            for (singleCase : (present.body as PresentCaseList).cases) {
                targetStatementSequence.add(
                    createConditional => [
                        expression = transformExpression(singleCase.event.expression)
                        if (singleCase.statement != null) {
                            statements.addAll(
                                transformStatement(singleCase.statement, createStatementSequence).statements)
                        }
                        statements.addGoto(statementEndLabel) // If statements was taken break out and terminate
                    ])
            }
            targetStatementSequence.addLabel(statementEndLabel)

            return targetStatementSequence
        }
    }

    /**
     * signal s in p end
     * Local signal declarations are translated to StatementScopes. A parallel thread sets all variables
     * representing local signals to false with an absolute write until the local statement terminates 
     * (indicated by f_term).
     * 
     * @param LocalSignalDecl The LocalSignalDecl-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(LocalSignalDecl signal, StatementSequence targetStatementSequence) {
        val sScope = createStatementScope
        val signals = new LinkedList<Pair<String, ValuedObject>> // Remember created signals to delete them after transformation of signal body

        // Calculate if the statement terminates and add check for f_term or not
        var terms = true;
        if (optimizeTransformation)
          terms = signal.statement.checkTerminate
        var ValuedObject f_term

        if (!optimizeTransformation || terms) {
            f_term = createFreshVar(sScope, "f_term", ValueType::BOOL) // Used to signal the resetting thread that it may terminate
            sScope.add(createAssignment(f_term, createBoolValue(false)))
        }

        // Create variables for each signal
        for (localSignal : (signal.signalList as LocalSignal).signal) {
            val sclSignalVariable = createValuedObject(localSignal.name)

            //            sScope.add(createAssignment(obj, createBoolValue(false)))
            signalToVariableMap.add(sclSignalVariable.name -> sclSignalVariable)
            signals.add(sclSignalVariable.name -> sclSignalVariable)
            sScope.declarations += createDeclaration => [valuedObjects += sclSignalVariable; type = ValueType::BOOL]

            // Valued signal
            if (localSignal.channelDescr != null) {
                val sclSignalVariable_val = createValuedObject(localSignal.name + "_val") => [
// TODO: VERIFY: This should be superfluous since the type is set in the declaration object.
//                    if (localSignal.type.getName() == "PURE" && localSignal.channelDescr.type.typeID != null) {
//                        type = ValueType::HOST
//                    } else {
//                        type = ValueType::getByName(localSignal.channelDescr.type.type.getName())
//                    }
                    // Combine Operator
                    if (localSignal.channelDescr.expression != null) {
                        initialValue = localSignal.channelDescr.expression.transformExp(
                            localSignal.channelDescr.type.type.toString)
                    }
                    if (localSignal.channelDescr.type.operator != null)
                        combineOperator = localSignal.channelDescr.type.operator.transformCombineOperator
                ]
                sScope.declarations += createDeclaration => [
                    valuedObjects += sclSignalVariable_val
                    if (localSignal.type.getName() == "PURE" && localSignal.channelDescr.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = localSignal.channelDescr.type.typeID
                    } else {
                        it.type = ValueType::getByName(localSignal.channelDescr.type.type.getName())
                    }
                ]
                signalToValueMap.put(sclSignalVariable, sclSignalVariable_val)
            }
        }

        // Thread containing transformed local signal body
        val oldLabel = currentThreadEndLabel
        val newLabel = createNewUniqueLabel
        currentThreadEndLabel = newLabel
        val transformedLocalSignalBody = createThread
        transformStatement(signal.statement, transformedLocalSignalBody)
        transformedLocalSignalBody.addLabel(newLabel)
        currentThreadEndLabel = oldLabel
        if (!optimizeTransformation || terms)
            transformedLocalSignalBody.add(createAssignment(f_term, createBoolValue(true)))

        // Create Thread to reset all locally declared signals in each tick
        val resetLocalSignalsThread = createThread
        val threadStart = createNewUniqueLabel
        resetLocalSignalsThread.addLabel(threadStart)

        signals.forEach[resetLocalSignalsThread.add(createAssignment(it.value, createBoolValue(false)))]
        if (!optimizeTransformation || terms) {
            val hasTerminated = createConditional
            hasTerminated.expression = createNot(f_term.createValuedObjectReference)
            hasTerminated.statements += createStatement(SclFactory::eINSTANCE.createPause)
            hasTerminated.statements += createGotoStatement(threadStart)
            resetLocalSignalsThread.add(createStatement(hasTerminated))
        } else if (optimizeTransformation) {
            resetLocalSignalsThread.add(SclFactory::eINSTANCE.createPause)
            resetLocalSignalsThread.addGoto(threadStart)
        }
        val sclParallel = createParallel
        sclParallel.threads += transformedLocalSignalBody
        sclParallel.threads += resetLocalSignalsThread
        sScope.statements += sclParallel.createStatement
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
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Abort abort, StatementSequence targetStatementSequence) {
        val statementScope = createStatementScope

        // Abort Cases; transformed to nested aborts with additional checking which case was taken
        if (abort.body instanceof AbortCase) {

            // To later add the cases, i.e. what to do after termination of nested abort
            val saveAbort = EcoreUtil.copy(abort.body as AbortCase)
            val abortEndLabel = createNewUniqueLabel // Label at the end of the statement to ignore not taken cases
            labelToThreadMap.put(currentThreadEndLabel, abortEndLabel)

            // Create a depth flag to check whether delayed case may be taken or not
            val f_depth = createFreshVar(statementScope, "f_depth", ValueType::BOOL)
            f_depth.initialValue = createBoolValue(false)

            // Set depth flag to true when a pause statement is executed
            pauseTransformation.push(
                [ StatementSequence seq |
                    seq.add(createAssignment(f_depth, createBoolValue(true)))
                ])

            // Transform to nested abort and then to SCL
            handleAbortCase(abort).transformStatement(statementScope)
            pauseTransformation.pop.apply(statementScope)

            // Check if and which case should be taken
            for (singleCase : saveAbort.cases) {
                statementScope.add(
                    createConditional => [
                        val eventExpr = singleCase.delay.event.expr
                        if (singleCase.delay.isImmediate) {
                            if (singleCase.delay.expr != null) {
                                expression = createAnd(
                                    eventExpr.transformExpression,
                                    signalToVariableMap.findLast[
                                        key == (singleCase.delay.event.expr as ValuedObject).name].value.createValuedObjectReference
                                )
                            } else {
                                expression = eventExpr.transformExpression
                            }

                        // Delayed cases have to check f_depth
                        } else {
                            if (singleCase.delay.expr != null) {
                                expression = createAnd(eventExpr.transformExpression,
                                    createLEQ(singleCase.delay.expr.transformExp("int"),
                                        counterToEventMap.get(
                                            (singleCase.delay.event.expr as ValuedObjectReference).valuedObject.name).
                                            createValuedObjectReference))
                            } else {
                                expression = createAnd(eventExpr.transformExpression, createValuedObjectReference(f_depth))
                            }
                        }
                        // If there is a do-block transform it
                        if (singleCase.statement != null)
                            statements += singleCase.statement.transformStatement(createStatementSequence).statements
                        statements += createGotoStatement(abortEndLabel) // goto statements end to ignore not taken cases; break
                    ])

            }
            signalToVariableMap.remove(f_depth)
            statementScope.addLabel(abortEndLabel)
            targetStatementSequence.add(statementScope)

            return targetStatementSequence
        }

        // Weak and strong abort instance
        // Label at end of body
        val abortEndLabel = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, abortEndLabel)
        val abortExpr = EcoreUtil.copy((abort.body as AbortInstance).delay.event.expr)

        // Delay Expression? E.g. abort p when 5 s
        val delayExpression = (abort.body as AbortInstance).delay.expr != null

        // Add a counting variable, if delay.expr is set; 
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createNewUniqueVariable("i")
            targetStatementSequence.add(createAssignment(counterVar, createIntValue(0)))
            localIntDeclarations += counterVar
            if ((abort.body as AbortInstance).delay.event.expr != null) {
                counterToEventMap.put(
                    ((abort.body as AbortInstance).delay.event.expr as ValuedObjectReference).valuedObject.name,
                    counterVar)
            }
        }
        val counter = counterVar

        // Is counting condition reached?
        val countExp = createAnd(abortExpr.transformExpression,
            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::LEQ
                if (delayExpression) {
                    subExpressions += (abort.body as AbortInstance).delay.expr.transformExp("int")
                    subExpressions += counter.createValuedObjectReference
                }
            ])

        // Weak abort
        if (abort.body instanceof WeakAbortInstance) {
            handleWeakAbort(abort, statementScope, abortEndLabel, counter, countExp)

        // Strong abort
        } else {
            handleStrongAbort(abort, statementScope, abortEndLabel, counter, countExp)
        }
        
        // FIXME: apply closures
        pauseTransformation.pop.apply(statementScope)
        joinTransformation.pop.apply(statementScope)

        // If body was left without being preempted, doNothing
        val l_doNothing = createNewUniqueLabel
        if ((abort.body as AbortInstance).statement != null)
            statementScope.addGoto(l_doNothing)
        statementScope.addLabel(abortEndLabel)

        // Some do statement
        if ((abort.body as AbortInstance).statement != null) {
            (abort.body as AbortInstance).statement.transformStatement(statementScope)
            statementScope.addLabel(l_doNothing)
        }
        targetStatementSequence.add(createStatement(statementScope))

        targetStatementSequence
    }

    /**
     * weak abort p when (immediate) s
     * 
     * @param abort The weak Abort-statement
     * @param statementScope The StatementScope which should contain the transformed statements
     * @param abortEndLabel Label at the end of the Abort-Statement
     * @param counter Possible counting variable; e.g. in abort p when n s
     * @param counterExpression Possible counting expression, i.e. counter <= n
     * @return The transformed StatementScope
     */
    def handleWeakAbort(Abort abort, StatementScope statementScope, String abortEndLabel, ValuedObject counter,
        OperatorExpression counterExpression) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Delay Expression? E.g. weak abort p when n s
        val delayExpression = (abort.body as AbortInstance).delay.expr != null

        // Flag indicating whether weak abort was triggered
        val f_wa = createFreshVar(statementScope, "f_wa", ValueType::BOOL)
        f_wa.initialValue = createBoolValue(false)

        // If delayed add depth flag, will be set to true after pauses
        var ValuedObject f_depthVar
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            f_depthVar = createFreshVar(statementScope, "f_depth", ValueType::BOOL)
            f_depthVar.initialValue = createBoolValue(false)
        }
        val f_depth = f_depthVar

        pauseTransformation.push [ StatementSequence seq |
            // Increment counter if delay expression is set
            if (delayExpression) {
                seq.add(
                    createStatement(
                        createConditional => [
                        expression = transformExpression(abortExpr)
                        statements += incrementInt(counter)
                    ]))
            }
            val f_wa_ref = f_wa.createValuedObjectReference
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
                                expression = and(EcoreUtil.copy(counterExpression),
                                    EcoreUtil.copy(f_depth.createValuedObjectReference))

                            // Delayed with delay expression
                            } else {
                                expression = EcoreUtil.copy(counterExpression)
                            }
                        } else {

                            // Immediate without delay expression
                            if (!(abort.body as AbortInstance).delay.isImmediate) {
                                expression = and(abortExpr.transformExpression, f_depth.createValuedObjectReference)

                            // Delayed without delay expression
                            } else {
                                expression = abortExpr.transformExpression
                            }
                        }
                        statements.add(createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap))
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
                createStatement(
                    createConditional => [
                        expression = f_wa.createValuedObjectReference
                        statements.add(createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap))
                ]))
        ]

        transformStatement(abort.statement, statementScope)

        // Remove the defined flags from the signalMap
        signalToVariableMap.remove(f_wa.name -> f_wa)
        if (!(abort.body as AbortInstance).delay.isImmediate) {
            signalToVariableMap.remove(f_depth.name -> f_depth)

            // Remove gotos in only instantaneously reachable pauses to avoid potentially instantaneous loops
            removeInstantaneousGotos(statementScope.statements, abortEndLabel, newLinkedList)
        }

        statementScope
    }

    /**
     * abort p when (immediate)? s
     * ->
     * (if s goto l end)? 
     * p [ pause -> pause; if (s) gotoj l |
     *     join -> join; if (s) gotoj l ];
     * l:
     * 
     * @param abort The strong Abort-statement
     * @param statementScope The StatementScope which should contain the transformed statements
     * @param abortEndLabel Label at the end of the Abort-Statement
     * @param counter Possible counting variable; e.g. in abort p when n s
     * @param counterExpression Possible counting expression, i.e. counter <= n
     * @return The transformed StatementScope
     */
    def handleStrongAbort(Abort abort, StatementScope statementScope, String abortEndLabel, ValuedObject counter,
        OperatorExpression counterExpression) {
        val abortExpr = (abort.body as AbortInstance).delay.event.expr

        // Create abort flag and set to false
        val f_a = createFreshVar(statementScope, "f_a", ValueType::BOOL)
        f_a.initialValue = createBoolValue(false)

        // If abort is immediate directly check for abort condition
        if ((abort.body as AbortInstance).delay.isImmediate) {
            statementScope.add(
                createStatement(
                    createConditional => [
                        expression = transformExpression(abortExpr)
                        statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                        statements += createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap)
                ]))
        }

        val pause = [ StatementSequence seq |
            // If delay expression increment counter when abort expression is true
            if ((abort.body as AbortInstance).delay.expr != null) {
                seq.add(
                    createStatement(
                        createConditional => [
                            expression = transformExpression(abortExpr)
                            statements += incrementInt(counter)
                    ]))
                seq.add(
                    createStatement(
                        createConditional => [
                            expression = EcoreUtil.copy(counterExpression)
                            statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                            statements += createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap)
                    ]))

            // No delay expression; just check abort condition, set flag and gotoj l
            } else {
                seq.add(
                    createStatement(
                        createConditional => [
                            expression = transformExpression(abortExpr)
                            statements += createStatement(createAssignment(f_a, createBoolValue(true)))
                            statements += createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap)
                    ]))
            }
            seq
        ]

        // If abort flag is set goto l_exit after join
        val join = [ StatementSequence seq |
            seq.add(
                createStatement(
                    createConditional => [
                        expression = f_a.createValuedObjectReference
                        statements += createGotoj(abortEndLabel, currentThreadEndLabel, labelToThreadMap)
                ]))
            seq
        ]

        pauseTransformation.push(pause)
        joinTransformation.push(join)

        transformStatement(abort.statement, statementScope)
        signalToVariableMap.remove(f_a.name -> f_a)

        statementScope
    }

    /**
     * Transforms an (Weak) Abort with cases to a nested (Weak) Abort without cases
     * 
     * @param abortCase The Abort-statement with cases
     * @return Abort-statement without cases
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
     * weak suspend p when (immediate)? (n)? s
     * -> UNIMPLEMENTED
     * 
     * @param susp The Weak-Suspend-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(WeakSuspend suspend, StatementSequence targetStatementSequence) {
        throw new IllegalArgumentException("Weak suspend is not implemented yet.");
    }
    
    /**
     * suspend p when (immediate)? (n)? s
     * -> (l: if s { pause; goto l };)? p [ pause -> l: pause; if s goto l ]
     * 
     * @param susp The Suspend-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Suspend suspend, StatementSequence targetStatementSequence) {

        // Delay Expression?
        val delayExpression = suspend.delay.expr != null

        // Add a counting variable, if delay.expr is set
        var ValuedObject counterVar
        if (delayExpression) {
            counterVar = createNewUniqueVariable("i")
            counterToEventMap.put(counterVar.name, counterVar)
            localIntDeclarations += counterVar
            targetStatementSequence.add(createAssignment(counterVar, 0.createIntValue))
        }
        val counter = counterVar

        // Expression to check whether the delay expression is true and the counter holds the required value
        // (if a and c > i then...)
        val countExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::LOGICAL_AND
            subExpressions += suspend.delay.event.expr.transformExpression
            subExpressions += KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GT
                if (suspend.delay.expr != null) {
                    subExpressions += suspend.delay.expr.transformExp("int")
                    subExpressions += counter.createValuedObjectReference
                }
            ]
        ]

        // If immediate add conditional pause at start
        if (suspend.delay.isImmediate) {
            val l = createNewUniqueLabel
            targetStatementSequence.addLabel(l)
            targetStatementSequence.add(
                createStatement(
                    createConditional => [
                        if (delayExpression) {
                            expression = EcoreUtil.copy(countExpression)
                        } else {
                            expression = transformExpression(suspend.delay.event.expr)
                        } statements.addAll(createSclPause.statements) statements.add(createGotoStatement(l))
                ]))
        }

        // Check whether suspension is triggered on pause statements
        pauseTransformation.push [ StatementSequence seq |
            val pauseLabel = createNewUniqueLabel
            seq.statements.add(0, createEmptyStatement(pauseLabel))
            if (delayExpression) {
                seq.add(
                    createStatement(
                        createConditional => [
                            expression = transformExpression(suspend.delay.event.expr)
                            statements += incrementInt(counter)
                    ]))
                seq.add(createStatement(newIfThenGoto(EcoreUtil.copy(countExpression), pauseLabel, true)))
            } else {
                seq.add(createStatement(newIfThenGoto(transformExpression(suspend.delay.event.expr), pauseLabel, true)))
            }
            seq
        ]

        transformStatement(suspend.statement, targetStatementSequence)
        pauseTransformation.pop

        targetStatementSequence
    }

    /**
     * trap t1,...,tn in p handle t1 do q1 ... handle tn do qn end
     * -> { bool f_s = false;  // Initialize trap flag
     *  p [ exit s -> f_s |= true; gotoj l |
     *      pause -> if (f_s) gotoj l ; pause |
     *     join -> join; if (f_s) gotoj l
     *  ]; }
     *l:
     * 
     * @param trap The Trap-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Trap trap, StatementSequence targetStatementSequence) {
        val statementScope = createStatementScope

        // Label at statements end
        val trapEndLabel = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, trapEndLabel)
        val exitVariables = new LinkedList<ValuedObject>
        
        // Create flags for every trap declaration; add them to the exitMap
        trap.trapDeclList.trapDecls.forEach [
            var ValuedObject singleExit
            var ValuedObject singleExit_val
            // Unvalued trap
            singleExit = createFreshVar(statementScope, it.name, ValueType::BOOL)
            signalToVariableMap.removeLast //Remove from map as they are no signals
            signalToVariableMap.removeLast
            if (it.channelDescr != null) {
                if (it.channelDescr.type.type.getName() == "PURE") {
                    singleExit_val = createNewUniqueVariable(it.name + "_val")
                    signalToVariableMap.removeLast //Remove from map as they are no signals
                    signalToVariableMap.removeLast
                    val hostType = it.channelDescr.type.typeID
                    val singleExitVal = singleExit_val
                    statementScope.declarations += createDeclaration => [
                        valuedObjects += singleExitVal
                        type = ValueType::HOST
                        it.hostType = hostType
                    ]
                } else {
                    singleExit_val = createFreshVar(statementScope, it.name + "_val", ValueType.getByName(it.channelDescr.type.type.getName()))
// TODO: VERIFY: This should be superfluous since the type is set in the declaration object.
//                    singleExit_val.type = ValueType.getByName(it.channelDescr.type.type.getName())
                }
                valuedExitVariables.put(it, singleExit_val)
            }
            singleExit.initialValue = createBoolValue(false)
            exitVariables += singleExit
            exitToLabelMap.put(it, (singleExit -> trapEndLabel))
        ]
        var Expression exitExpressionVar

        // Create condition to check if ecxeption was thrown. Depending on how much exits are declared
        // this is just a ValuedObjectReference or an OR expression
        if (exitVariables.length == 1)
            exitExpressionVar = exitVariables.get(0).createValuedObjectReference
        // If several traps are declared, check if one of them was triggered
        else {
            exitExpressionVar = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::LOGICAL_OR
                for (^var : exitVariables) {
                    subExpressions += ^var.createValuedObjectReference
                }
            ]
        }

        // No non final parameters in lambda expressions allowed, detour 
        val exitExpr = exitExpressionVar

        // The functions to apply on pause and join statements; as they are nearly the same "pause"
        // indicates whether it is a pause statement or a join
        val trans = [ boolean pause, StatementSequence seq |
            val trapPrePauseRule = new LinkedList<Statement>
            // At pause and join check whether a trap was aktivated
            trapPrePauseRule.add(
                createStatement(
                    createConditional => [
                        expression = EcoreUtil.copy(exitExpr)
                        statements.add(createGotoj(trapEndLabel, currentThreadEndLabel, labelToThreadMap))
                    ]))
            if (pause) {

                // Insert the trap conditional directly before the pause statement
                val idx = seq.statements.indexOf(
                    seq.statements.findFirst [
                        it instanceof InstructionStatement &&
                            (it as InstructionStatement).instruction instanceof Pause
                    ])
                seq.statements.addAll(idx, trapPrePauseRule)
            } else
                seq.statements.addAll(trapPrePauseRule)
            seq
        ]
        pauseTransformation.push[StatementSequence stm|trans.apply(true, stm)]
        joinTransformation.push[StatementSequence stm|trans.apply(false, stm)]

        // Transform the traps body statements if there are some
        if (trap.statement != null)
            trap.statement.transformStatement(statementScope)

        // FIX: apply closures
        pauseTransformation.pop //.apply(statementScope)
        joinTransformation.pop.apply(statementScope)
        statementScope.addLabel(trapEndLabel)
        statementScope.statements.removeInstantaneousGotos(trapEndLabel, exitVariables)

        // Transform trap handlers
        val trapHandlers = createParallel
        val oldThreadsEndLabel = currentThreadEndLabel
        for (trapHandler : trap.trapHandler) {
            val currentHandlerThreadEnd = createNewUniqueLabel;
            currentThreadEndLabel = currentHandlerThreadEnd
            trapHandlers.threads += createThread => [
                add(
                    createConditional => [
                        expression = trapHandler.trapExpr.transformExpression
                        statements += trapHandler.statement.transformStatement(createStatementSequence).statements
                    ])
                 addLabel(currentHandlerThreadEnd)
            ]
        }
        currentThreadEndLabel = oldThreadsEndLabel
        if (!trapHandlers.threads.nullOrEmpty)
            statementScope.add(trapHandlers)
        targetStatementSequence.add(createStatement(statementScope))

        targetStatementSequence
    }

    /**
     * exit T
     * Throws an exception. The variable corresponding to T is set to true and a goto to the
     * corresponding label is added.
     * 
     * @param exit The Exit-statement
     * @param targetStatementSequence  The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Exit exit, StatementSequence targetStatementSequence) {

        // Get corresponding exit variable and set it to true
        val exitVariable = exitToLabelMap.get(exit.trap)

        val op = createOr(exitVariable.key.createValuedObjectReference, createBoolValue(true))
        targetStatementSequence.add(createAssignment(exitVariable.key, op))
        
        // Valued exit
        if (exit.expression != null) {
            targetStatementSequence.add(createAssignment(valuedExitVariables.get(exit.trap),
                 transformExp(exit.expression, valuedExitVariables.get(exit.trap).type.toString)))
        }

        // Goto the corresponding label if in the same thread, to l_exit otherwise
        val trapStatementEndLabel = exitVariable.value
        targetStatementSequence.addGotoj(trapStatementEndLabel, currentThreadEndLabel, labelToThreadMap)

        targetStatementSequence
    }

    /**
     * run mod [...]
     * The specified module is copied and transformed. Signals which are not already defined in
     * the surrounding module are defined locally, renaming is applied if specified.
     * 
     * @param run  The run-statement
     * @param targetStatementSequence The StatementSequence which should contain the transformed statements
     * @return The transformed statement
     */
    def dispatch StatementSequence transformStatement(Run run, StatementSequence targetStatementSequence) {

        // Thread containing the transformed run module body
        val runModuleBody = createThread

        // Copy module as for the specific case renaming is applied
        val copier = new EcoreUtil.Copier
        val runCopy = copier.copy(run) as Run;
        copier.copyReferences();

        // Label at threads end
        val l_exit = createNewUniqueLabel
        val oldCurLabel = currentThreadEndLabel
        currentThreadEndLabel = l_exit

        val statementScope = createStatementScope

        // Pure signals that have to be set to false in reset thread
        val pureSignals = new LinkedList<ValuedObject>
        val moduleDeclarations = SclFactory::eINSTANCE.createSCLProgram
        transformEsterelInterface(runCopy.module.module.interface, moduleDeclarations,
            new LinkedList<Pair<String, ValuedObject>>, new HashMap<ValuedObject, ValuedObject>)
        val newDeclarations = new LinkedList<Declaration>

        // Signal declared in run module have to be copied, but only if not already done
        moduleDeclarations.variableDeclarations.forEach [
            if (!(alreadyDefined(it.valuedObjects.head.name))) {
                if (!it.valuedObjects.head.name.endsWith("_val")) {
                    if (!it.const) {
                        runModuleBody.add(createAssignment(it.valuedObjects.head, createBoolValue(false)))
                        pureSignals += it.valuedObjects.head
                    }
                }
                newDeclarations += it
                signalToVariableMap += it.valuedObjects.head.name -> it.valuedObjects.head
            }
        ]

        // Add valued variables to valued map
        newDeclarations.forEach [
            if (it.valuedObjects.head.name.endsWith("_val")) {
                val signalName = it.valuedObjects.head.name
                signalToValueMap.put(
                    pureSignals.findFirst[it.name == signalName.substring(0, signalName.length - 4)],
                    it.valuedObjects.head
                )
            }
        ]
        statementScope.declarations += newDeclarations

        // Rename signals (only if renaming happens) and remember to delete afterwards
        val signals = new LinkedList<Pair<String, ValuedObject>>
        if (runCopy.list != null) {
            runCopy.list.list.forEach [
                for (renaming : renamings) {

                    //                    val oldNamedValuedObject = runCopy.module.module.eAllContents.toList.filter(
                    //                        typeof(de.cau.cs.kieler.esterel.kexpressions.ValuedObject)
                    //                    ).filter[it.name == (renaming as SignalRenaming).oldName.name]
                    //                    oldNamedValuedObject.forEach[ it.name = (renaming as SignalRenaming).newName.name ]
                    if (renaming instanceof SignalRenaming) {
                        if ((renaming as SignalRenaming).oldName.name != (renaming as SignalRenaming).newName.name) {
                        var Pair<String, ValuedObject> newName
                        if ((renaming as SignalRenaming).newName != null) {
                            newName = (renaming as SignalRenaming).oldName.name ->
                                signalToVariableMap.findLast[key == (renaming as SignalRenaming).newName.name].value
                        } else {
                            newName = (renaming as SignalRenaming).oldName.name -> synchronousTick
                        }
                        signalToVariableMap.add(newName)
                        signals.add(newName)
                        }
                    } else if (renaming instanceof ConstantRenaming) {
                        if ((renaming as ConstantRenaming).newName != null) {
                            if ((renaming as ConstantRenaming).newName.name != (renaming as ConstantRenaming).oldName.name) {
                        val newName = (renaming as ConstantRenaming).oldName.name ->
                            signalToVariableMap.findLast[key == (renaming as ConstantRenaming).newName.name].value
                        signalToVariableMap.add(newName)
                        signals.add(newName)
                        }
                        }
                        // Give the constant a fixed valued (e.g. 42 / c1)
                        else {
                            val type = (runCopy.module.module.interface.eAllContents.toList.filter(Constant).
                                findFirst[ it.name == (renaming as ConstantRenaming).oldName.name ].eContainer.eContainer as OneTypeConstantDecls
                            ).type.type
                            
                            val value = createFreshVar(statementScope, (renaming as ConstantRenaming).oldName.name, ValueType.getByName(type.getName))
                                value.initialValue = (renaming as ConstantRenaming).newValue.transformExp(type.literal)
                                println("init " + value.initialValue)
                        }
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
        newDeclarations.forEach[valuedObjects.forEach[allLocalDeclaredVariables += it]]
        signalToVariableMap.removeAll(signalToVariableMap.filter[allLocalDeclaredVariables.contains(value)])

        // Create a parallel if the new StatementScope contains signal declarations to reset them
        var programTerminates = true;
        if (optimizeTransformation)
          programTerminates = runCopy.checkTerminate

        if (!statementScope.declarations.nullOrEmpty) {
            val f_term = createFreshVar(statementScope, "f_term", ValueType::BOOL)
            if (!optimizeTransformation || programTerminates)
                statementScope.statements.add(0, createStatement(createAssignment(f_term, createBoolValue(false))))
            val resetSignalsThread = createThread
            val l_reset = createNewUniqueLabel
            resetSignalsThread.addLabel(l_reset)
            resetSignalsThread.add(SclFactory::eINSTANCE.createPause)
            pureSignals.forEach[resetSignalsThread.add(createAssignment(it, createBoolValue(false)))]
            if (optimizeTransformation && !programTerminates) {
                resetSignalsThread.addGoto(l_reset)
            } else {
                resetSignalsThread.add(newIfThenGoto(createNot(f_term.createValuedObjectReference), l_reset, true))
            }
            val sclRunModule = createParallel
            sclRunModule.threads += resetSignalsThread
            if (!optimizeTransformation || programTerminates)
                runModuleBody.add(createAssignment(f_term, createBoolValue(true)))
            sclRunModule.threads += runModuleBody
            runModuleBody.addLabel(l_exit)
            currentThreadEndLabel = oldCurLabel
            statementScope.add(sclRunModule)
            targetStatementSequence.add(statementScope)

            return targetStatementSequence
        } else {
            runModuleBody.addLabel(l_exit)
            currentThreadEndLabel = oldCurLabel
            statementScope.add(runModuleBody)
            targetStatementSequence.add(statementScope)
            return targetStatementSequence
        }
    }

    /**
    * var v1 : type1,..., vn : typen in p end
    * Local variable declaration. Transformed to SCL StatementScope
    * 
    * @param localVariable The LocalVariable-statement
	* @param targetStatementSequence The StatementSequence which should contain the transformed statements
	* @return The transformed statement
    */
    def dispatch StatementSequence transformStatement(LocalVariable localVariable,
        StatementSequence targetStatementSequence) {

        // Mark variables with suffix to distinguish from signals
        localVariable.eAllContents.toList.filter(IVariable).forEach[
            if (!name.endsWith("_var"))
                name = name + "_var"
        ]

        val statementScope = createStatementScope

        // Remember local variables to delete them after body transformation
        val signals = new LinkedList<Pair<String, ValuedObject>>
        localVariable.^var.varDecls.forEach [
            val sclDeclaration = transformIntVarDeclaration(it, signals, signalToVariableMap)
            statementScope.declarations += sclDeclaration
        ]

        localVariable.statement.transformStatement(statementScope)
        targetStatementSequence.add(statementScope)
        signalToVariableMap.removeAll(signals)

        targetStatementSequence
    }

    /**
    * v1 := v2
    * Simply transformed to SCL assignment
    * 
    * @param assignment The assignment-statement
	* @param targetStatementSequence The StatementSequence which should contain the transformed statements
	* @return The transformed statement
    */
    def dispatch StatementSequence transformStatement(Assignment assignment, StatementSequence targetStatementSequence) {

        // Get the last defined variable with the corresponding name
        println("var " + assignment.^var.name)
        val assignedVariable = signalToVariableMap.findLast[key == assignment.^var.name].value
        val newValue = transformExp(assignment.expr, assignedVariable.type.toString)

        targetStatementSequence.add(createAssignment(assignedVariable, newValue))

        targetStatementSequence
    }

    /**
    * if e (then p)? (else q)? end
    * Simply transformed to SCL conditional
    * 
    * @param ifTest The if-statement
	* @param targetStatementSequence The StatementSequence which should contain the transformed statements
	* @return The transformed statement
    */
    def dispatch StatementSequence transformStatement(IfTest ifTest, StatementSequence targetStatementSequence) {
        val statementEnd = createNewUniqueLabel
        val ifConditonal = createConditional => [
            expression = ifTest.expr.transformExpression
            if (ifTest.thenPart != null)
                statements += transformStatement(ifTest.thenPart.statement, createStatementSequence).statements
            // elsif-List
            for (elsIf : ifTest.elsif) {
                elseStatements += createStatement(
                    createConditional => [
                        expression = elsIf.expr.transformExpression
                        statements += transformStatement(elsIf.thenPart.statement, createStatementSequence).statements
                        statements += createGotoStatement(statementEnd)
                    ])
            }
            if (ifTest.elsePart != null)
                elseStatements += transformStatement(ifTest.elsePart.statement, createStatementSequence).statements
        ]
        targetStatementSequence.add(ifConditonal)
        targetStatementSequence.addLabel(statementEnd)

        targetStatementSequence
    }

    /**
    * (positive)? repeat n times p end
    * Repeat statements are transformed by using a goto loop and a counting variable
    * 
	* @param repeat The repeat-statement
	* @param targetStatementSequence 	 The StatementSequence which should contain the transformed statements
	* @return The transformed statement
    */
    def dispatch StatementSequence transformStatement(Repeat repeat, StatementSequence targetStatementSequence) {

        val statementScope = createStatementScope

        // Label at statements end to stop looping
        val repeatEndLabel = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, repeatEndLabel)

        // If not marked as positive and non positive value is given do nothing (goto l_end)
        if (!repeat.positive) {
            val exprVal = EcoreUtil.copy(repeat.expression.transformExp("int"))
            val op = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::GEQ
                subExpressions += createIntValue(0)
                subExpressions += exprVal
            ]
            statementScope.add(newIfThenGoto(op, repeatEndLabel, true))
        }

        // The counting variable
        val counter = createFreshVar(statementScope, "i", ValueType::INT)
        statementScope.add(createAssignment(counter, 0.createIntValue))

        // Label at statements start, for looping
        val repeatStartLabel = createNewUniqueLabel
        labelToThreadMap.put(currentThreadEndLabel, repeatStartLabel)
        statementScope.addLabel(repeatStartLabel)
        repeat.statement.transformStatement(statementScope)
        statementScope.add(incrementInt(counter))

        // Add a check whether repeat should loop or return
        statementScope.add(
            newIfThenGoto(createGT(repeat.expression.transformExp("int"), counter.createValuedObjectReference), repeatStartLabel, true))

        statementScope.addLabel(repeatEndLabel)
        targetStatementSequence.add(statementScope)

        targetStatementSequence
    }

    /**
    * call p(x1,...,xn)(y1,...,yn)     
    * Procedure calls. Transformed to function calls in SCL as they have te same effect.
    * 
    * @param procCall The procedure-call-statement
    * @param targetStatementSequence The StatementSequence which should contain the transformed statements
    * @return The transformed statement
    */
    def dispatch StatementSequence transformStatement(ProcCall procCall, StatementSequence targetStatementSequence) {
        val statementScope = createStatementScope

        // Function Calls are, in contrast to Procedure Calls in Esterel, Expressions
        val dummyObject = createFreshVar(statementScope, "procDummy", ValueType::BOOL)

        val sclFunctionCall = KExpressionsFactory::eINSTANCE.createFunctionCall
        sclFunctionCall.functionName = procCall.proc.name

        // Get call-by-value parameters
        var i = 0
        for (singleExpression : procCall.kexpressions) {
            val type = procCall.proc.idList2.get(i).type.toString
            sclFunctionCall.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = singleExpression.transformExp(type)
                    callByReference = false
                ]
            )
            i = i + 1

        }

        // Get call-by-reference parameters
        for (v : procCall.varList) {
            sclFunctionCall.parameters.add(
                KExpressionsFactory::eINSTANCE.createParameter => [
                    expression = createValuedObjectReference(signalToVariableMap.findLast[key == v.name].value)
                    callByReference = true
                ]
            )
        }

        // Create dummy assignment
        statementScope.add(createAssignment(dummyObject, sclFunctionCall))
        targetStatementSequence.add(statementScope)

        targetStatementSequence
    }

    /**
	* do p (upto s | watching s timeout q)?
	* -> p | (abort p; halt when s) | (abort p when s (do q)?)
	* Deprecated, but used for example in wristwatch
	* Simply transforms the doupto to kernel statements and transforms them
	* 
	* @param ^do The do-statement
	* @param targetStatementSequence The StatementSequence which should contain the transformed statements
	* @return The transformed statement
	*/
    def dispatch StatementSequence transformStatement(Do ^do, StatementSequence targetStatementSequence) {
        if (^do.end instanceof DoUpto) {
            val doUpto = ^do.end as DoUpto
            val abort = EsterelFactory::eINSTANCE.createAbort => [
                body = EsterelFactory.eINSTANCE.createAbortInstance => [
                    delay = EcoreUtil.copy(doUpto.expr)
                ]
                statement = EsterelFactory::eINSTANCE.createSequence => [
                    list += EcoreUtil.copy(^do.statement)
                    list += EsterelFactory::eINSTANCE.createHalt
                ]
            ]
            abort.transformStatement(targetStatementSequence)
        } else if (^do.end instanceof DoWatching) {
            val doWatching = ^do.end as DoWatching
            val abort = EsterelFactory::eINSTANCE.createAbort => [
                body = EsterelFactory.eINSTANCE.createAbortInstance => [
                    delay = EcoreUtil.copy(doWatching.delay)
                    doWatching.delay.event.expr = EcoreUtil.copy(delay.event.expr)
                    if (doWatching.end != null) {
                        statement = EcoreUtil.copy(doWatching.end.statement)
                    }
                ]
                statement = EcoreUtil.copy(^do.statement)
            ]
            abort.transformStatement(targetStatementSequence)
        } else {
            EcoreUtil.copy(^do.statement).transformStatement(targetStatementSequence)
        }

        targetStatementSequence
    }
    
} 
