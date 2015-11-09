package de.cau.cs.kieler.sccharts.esterel.transformation

import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.ModuleInterface
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.HashMap
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.Emission
import java.io.ObjectOutputStream.PutField
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import java.util.List
import de.cau.cs.kieler.sccharts.Effect

class SCChartsToEsterelTransformation extends AbstractModelTransformation {

    @Inject
    extension SCChartsExtension

    /*
     * Factories for creating target model components
     */
    val esterel = EsterelFactory::eINSTANCE
    val kExpression = KExpressionsFactory::eINSTANCE

    /* 
     * List of all transformed signals (signals and variables in the origin model) 
     */
    var LinkedList<ISignal> allSignals

    /*
     * Map of assignments of states and signals, which represent the permissions
     * to enter the corresponding states
     */
    var HashMap<State, ISignal> stateSignalMap

    /*
     * Map of assignments of regions and signals, which are "true" if the corresponding 
     * region is in a final state
     */
    var HashMap<Region, ISignal> regionSignalMap

    /*
     * Map of assignments of abort transitions and signals, which represent the trigger
     * of the abort transitions
     */
    var HashMap<Transition, ISignal> abortSignalMap

    /*
     * Signal which is used for correct transformation of deferred transitions, is "present"
     * if a deferred transition is taken
     */
    var ISignal deferredSignal

    /*
     * Boolean variables to identify if the state has different local actions
     */
    var boolean hasEntry
    var boolean hasDuring
    var boolean hasImmDuring
    var boolean hasExit
    var boolean hasSuspend
    var boolean hasImmTransition

    /*
     * Esterel statement which contains the local declarations for the model
     */
    val localSignal = esterel.createLocalSignal

    /*
     * Method which start the transformation
     */
    override EObject transform(EObject model) {
        return ( transformModel(model as State))
    }

    /*
     * Method which creates an Esterel program for an SCCharts model and calls 
     * the transformations for the model interface and for the root state
     */
    public def Program transformModel(State model) {
        allSignals = new LinkedList<ISignal>
        stateSignalMap = new HashMap<State, ISignal>
        regionSignalMap = new HashMap<Region, ISignal>
        abortSignalMap = new HashMap<Transition, ISignal>

        val program = esterel.createProgram
        val module = esterel.createModule
        module.name = model.id
        program.modules.add(module)

        // creates the module interface, signal declarations etc., of the Esterel program
        module.interface = createModuleInterface(model.declarations)

        // creates the module body of the Esterel program
        module.body = esterel.createModuleBody

        // transformation of the model state
        module.body.statements.add(transformRoot(model))

        module.end = "end module"

        program
    }

    /*
     * Method for transformation of the model interface
     * creates the module interface, signal declarations etc., of the Esterel program
     */
    public def ModuleInterface createModuleInterface(EList<Declaration> declarations) {
        val ModuleInterface mi = esterel.createModuleInterface
        for (decl : declarations) {
            for (valObj : decl.valuedObjects) {
                // all (typed variables) signals are transformed to (typed-valued-) signals
                val signal = kExpression.createISignal => [
                    name = valObj.name
                    if (!decl.type.getName.equals(ValueType::PURE) && !valObj.pureSignal) {

                        channelDescr = esterel.createChannelDescription => [
                            type = kExpression.createTypeIdentifier => [
                                type = ValueType::getByName(decl.type.getName)
                            ]
                            if (valObj.initialValue != null) {
                                expression = transformExp(valObj.initialValue)
                            }
                        ]
                    }
                ]
                if (decl.isOutput && decl.isInput) {
                    mi.intSignalDecls += kExpression.createInputOutput => [
                        signals += signal
                    ]
                } else if (decl.isInput) {
                    mi.intSignalDecls += kExpression.createInput => [
                        signals += signal
                    ]
                } else if (decl.isOutput) {
                    mi.intSignalDecls += kExpression.createOutput => [
                        signals += signal
                    ]
                } else {
                    localSignal.signal.add(signal)
                }
                allSignals += signal
            }
        }
        mi
    }

    /*
     * Method for the transformation of the model state
     * separated because of the different approach
     */
    public def Statement transformRoot(State root) {

        // pure signals for each State to handle the entering
        val LinkedList<ISignal> regSignals = new LinkedList<ISignal>
        val localSignals = esterel.createLocalSignalDecl
        /*
         * To avoid that the signals representing the permissions to enter
         * have the same name as signals or variables used in the interface by the user,
         * signal names are build from "s" + the hash code for this state
         */
        for (state : root.eAllContents.filter(State).toList) {
            val stateSignal = kExpression.createISignal => [
                name = "s" + state.hashCode.toString
            ]
            localSignal.signal.add(stateSignal)
            stateSignalMap.put(state, stateSignal)
        }
        // signal "deferred" for check if the taken transition is deferred
        deferredSignal = kExpression.createISignal => [
            name = "deferred"
        ]
        localSignal.signal.add(deferredSignal)

        // Trap zum Beenden der Programmausführung
        val rootTrap = esterel.createTrap
        localSignals.statement = rootTrap
        val trapDecls = esterel.createTrapDeclList
        rootTrap.trapDeclList = trapDecls
        val trapDecl = esterel.createTrapDecl
        trapDecls.trapDecls.add(trapDecl)
        trapDecl.name = "trapDone"
        val rootPar = esterel.createParallel
        rootTrap.statement = rootPar

        // Transformation of the single regions
        for (reg : root.regions) {
            /* 
             * Signals representing status of the region,
             * is in a final state or not,
             * build from "region" + hash code of the region
             */
            val regSignal = kExpression.createISignal => [
                name = "region" + reg.hashCode.toString
                channelDescr = esterel.createChannelDescription => [
                    type = kExpression.createTypeIdentifier => [
                        type = ValueType::BOOL
                    ]
                ]
            ]
            localSignal.signal.add(regSignal)
            regionSignalMap.put(reg, regSignal)
            regSignals.add(regSignal)

            var State initState
            val regBlock = esterel.createBlock
            val regSeq = esterel.createSequence
            regBlock.statement = regSeq
            rootPar.list.add(regBlock)
            // Emit of a Signal for entering the initial state
            for (state : root.eAllContents.filter(State).toList) {
                if (state.initial && state.parentRegion.equals(reg)) {
                    initState = state
                    regSeq.list.add(createEmit(stateSignalMap.get(initState)))
                }
            }
            // Loop -> (Trap -> state||...) | pause for handling the structure of the SCChart
            val regLoop = esterel.createLoop
            regSeq.list.add(regLoop)
            while (regSeq.list.length < 2) {
                val sta = esterel.createNothing
                regSeq.list.add(sta)
            }
            regLoop.end1 = esterel.createEndLoop
            regLoop.body = esterel.createLoopBody
            val loopParBlock = esterel.createParallel
            regLoop.body.statement = loopParBlock
            // Trap -> State || ... || State for handling cyclic SCChart structure
            val regTrap = esterel.createTrap
            loopParBlock.list.add(regTrap)
            loopParBlock.list.add(esterel.createPause)
            val regTrapDecls = esterel.createTrapDeclList
            regTrap.trapDeclList = regTrapDecls
            val regTrapDecl = esterel.createTrapDecl
            regTrapDecls.trapDecls.add(regTrapDecl)
            regTrapDecl.name = "trap" + reg.hashCode.toString

            // State || ... || State for handling cyclic SCChart structure
            val stateParBlock = esterel.createParallel
            regTrap.statement = stateParBlock

            /* 
             * Transformation of the states contained in the region,
             * i.e., states with parent "this"
             */
            for (state : root.eAllContents.filter(State).toList) {
                if (state.parentRegion.equals(reg)) {
                    stateParBlock.list.add(transformState(state, regTrapDecl))
                }
            }
            while (stateParBlock.list.length < 2) {
                stateParBlock.list.add(esterel.createNothing)
            }
        }
        localSignals.signalList = localSignal

        /* 
         * extra parallel section to handle the termination,
         * if all region of the model are in final states the program terminates
         */
        val controllLoop = esterel.createLoop
        rootPar.list.add(controllLoop)
        controllLoop.body = esterel.createLoopBody
        controllLoop.end1 = esterel.createEndLoop

        val controllSeq = esterel.createSequence
        controllLoop.body.statement = controllSeq

        val controllIf = esterel.createIfTest
        controllSeq.list.add(controllIf)
        controllIf.expr = createExp(regSignals)
        controllIf.thenPart = esterel.createThenPart => [
            statement = esterel.createExit => [
                trap = trapDecl
            ]
        ]
        controllSeq.list.add(esterel.createPause)

        localSignals
    }

    /*
     * Method for the transformation of arbitrary states,
     * receives the state and a trap declaration for the surrounded trap 
     * forwarded by the parent state
     */
    public def Statement transformState(State state, TrapDecl outTrap) {

        // List of signals representing the status of the contained regions
        val LinkedList<ISignal> locRegSignals = new LinkedList<ISignal>

        /*
         * check for state got incoming deferred transitions
         */
        var gotDeferredIncoming = false;
        for (inTrans : state.incomingTransitions) {
            if (inTrans.deferred) {
                gotDeferredIncoming = true
            }
        }

        // Present test for proving the permission to enter
        val stateTest = esterel.createPresent
        val stateTestBody = esterel.createPresentEventBody
        stateTest.body = stateTestBody
        stateTestBody.event = esterel.createPresentEvent => [
            expression = createExpression(stateSignalMap.get(state))
        ]
        val thenTest = esterel.createThenPart
        stateTestBody.thenPart = thenTest

        // Local signal "surface..." to check duration of the state
        val locSignals = esterel.createLocalSignalDecl
        thenTest.statement = locSignals
        val locSignal = esterel.createLocalSignal
        locSignals.signalList = locSignal

        // Signal for the check if the execution of a state last for more then one tick
        val lSignal = kExpression.createISignal => [
            name = "surface" + state.hashCode.toString
        ]
        locSignal.signal.add(lSignal)

        val stateSeq = esterel.createSequence
        locSignals.statement = stateSeq
        stateSeq.list.add(createEmit(lSignal))

        // Trap to leave the state when done
        val bodyTrap = esterel.createTrap

        if (!state.declarations.empty) {
            // Transformation of the state body, transitions, local declarations and actions
            val localSignals = esterel.createLocalSignalDecl
            stateSeq.list.add(localSignals)
            val localSignal = esterel.createLocalSignal
            localSignals.signalList = localSignal

            // Transformation of the local declarations
            for (decl : state.declarations) {
                for (valObj : decl.valuedObjects) {
                    val declSignal = kExpression.createISignal => [
                        name = valObj.name
                        if (!decl.type.getName.equals(ValueType::PURE) && !valObj.pureSignal) {
                            channelDescr = esterel.createChannelDescription => [
                                type = kExpression.createTypeIdentifier => [
                                    type = ValueType::getByName(decl.type.getName)
                                ]
                                if (valObj.initialValue != null) {
                                    expression = transformExp(valObj.initialValue)
                                }
                            ]
                        }
                    ]
                    localSignal.signal.add(declSignal)
                }
            }
            localSignals.statement = bodyTrap
        } else {
            stateSeq.list.add(bodyTrap)
        }

        val bodyTrapDecls = esterel.createTrapDeclList
        bodyTrap.trapDeclList = bodyTrapDecls
        val bodyTrapDecl = esterel.createTrapDecl
        bodyTrapDecls.trapDecls.add(bodyTrapDecl)
        bodyTrapDecl.name = "trap" + state.hashCode.toString

        // Transformation which encapsulates the aborts into each other
        var helpBlock = esterel.createBlock
        var Block helpBlockIn
        bodyTrap.statement = helpBlock

        if (!state.regions.empty) {
            for (trans : state.outgoingTransitions) {

                /* 
                 * Abort-Statements are nested in order based on priority of corresponding transitions
                 */
                // Creating of the strong abort statement
                if (trans.type.equals(TransitionType::STRONGABORT)) {
                    /* 
                     * Signal which triggers the strongAbort
                     * build from "sAbort" + hash code of the corresponding transition
                     */
                    val abortSignal = kExpression.createISignal => [
                        name = "sAbort" + trans.hashCode.toString
                    ]
                    localSignal.signal.add(abortSignal)
                    abortSignalMap.put(trans, abortSignal)

                    val abort = esterel.createAbort
                    abort.body = esterel.createAbortInstance => [
                        delay = esterel.createDelayExpr => [
                            isImmediate = trans.immediate
                            event = esterel.createDelayEvent
                            event.expr = createExpression(abortSignal)
                        ]
                    ]

                    helpBlock.statement = abort
                    helpBlockIn = esterel.createBlock
                    abort.statement = helpBlockIn
                    helpBlock = helpBlockIn

                // Creating of the weak abort statement
                } else if (trans.type.equals(TransitionType::WEAKABORT)) {

                    /* 
                     * Signal which triggers the strongAbort
                     * build from "wAbort" + hash code of the corresponding transition
                     */
                    val abortSignal = kExpression.createISignal => [
                        name = "wAbort" + trans.hashCode.toString
                    ]
                    localSignal.signal.add(abortSignal)
                    abortSignalMap.put(trans, abortSignal)

                    val abort = esterel.createWeakAbort
                    abort.body = esterel.createWeakAbortInstance => [
                        delay = esterel.createDelayExpr => [
                            isImmediate = trans.immediate
                            event = esterel.createDelayEvent
                            event.expr = createExpression(abortSignal)
                        ]
                    ]
                    helpBlockIn = esterel.createBlock
                    helpBlock.statement = abort
                    abort.statement = helpBlockIn
                    helpBlock = helpBlockIn
                }

            }
        }

        val bodyTransitionParBlock = esterel.createParallel
        helpBlock.statement = bodyTransitionParBlock
        val bodyBlock = esterel.createBlock

        var Block inBody
        inBody = bodyBlock

        /*
         *  Block for the transformation of reference states
         * current status: not supported because of Xtext error
         */
        /**************************************************************************************/
        if (state.isReferencedState) {
            val runSeq = esterel.createSequence
            val run = esterel.createRun
            runSeq.list.add(run)
            val modRen = esterel.createModuleRenaming
            run.module = modRen
            // modRen.module = transformModel(state).modules.findFirst[name == state.id]
            if (!state.bindings.empty) {
                val renList = esterel.createRenamingList
                run.list = renList
                val ren = esterel.createRenaming
                renList.list.add(ren)
                for (bind : state.bindings) {
                    val sRen = esterel.createSignalRenaming => [
                        newName = allSignals.findFirst[name == bind.actual.name]
                        for (decl : modRen.module.interface.intSignalDecls) {
                            var value = decl.signals.findFirst[name == bind.formal.name]
                            if (value != null) {
                                oldName = value
                            }
                        }
                    ]
                    ren.renamings.add(sRen)
                }
            }
            bodyTransitionParBlock.list.add(runSeq)
        /**************************************************************************************/
        // Transformation of the inner behavior of a simple state
        } else if (state.regions.empty) {
            bodyTransitionParBlock.list.add(esterel.createNothing)

        // Transformation of the inner behavior of a superstate   
        } else {

            /*
             *  Transformation of actions from the model
             */
            /**************************************************************************************/
            /**************************************************************************************/
            if (!state.localActions.empty) {
                // Check for different actions for building only the relevant structure
                for (action : state.localActions) {
                    if (action instanceof EntryAction) {
                        hasEntry = true
                    }
                    if (action instanceof DuringAction) {
                        hasDuring = true
                        if (action.immediate) {
                            hasImmDuring = true
                        }
                    }
                    if (action instanceof ExitAction) {
                        hasExit = true
                    }
                    if (action instanceof SuspendAction) {
                        hasSuspend = true
                    }
                }

                /* 
                 * Section for the transformation of during actions 
                 */
                /*************************************************************************/
                val duringPar = esterel.createParallel
                val duringLoop = esterel.createLoop
                val duringImmSeq = esterel.createSequence
                if (hasDuring) {
                    if (hasImmDuring) {
                        val duringBlock = esterel.createBlock
                        val duringSeq = esterel.createSequence
                        duringBlock.statement = duringSeq
                        duringPar.list.add(duringBlock)

                        /*
                         * place the "present deferred" block only 
                         * if there is a deferred incoming transition
                         */
                        if (gotDeferredIncoming) {
                            val deferredDuring = esterel.createPresent
                            duringSeq.list.add(deferredDuring)
                            val defDuringBody = esterel.createPresentEventBody
                            deferredDuring.body = defDuringBody
                            defDuringBody.event = esterel.createPresentEvent => [
                                expression = createExpression(deferredSignal)
                            ]
                            val defDuringElse = esterel.createElsePart
                            deferredDuring.elsePart = defDuringElse
                            defDuringElse.statement = duringImmSeq
                        } else {
                            val defImmBlock = esterel.createBlock
                            duringSeq.list.add(defImmBlock)
                            defImmBlock.statement = duringImmSeq
                        }

                        duringSeq.list.add(duringLoop)
                    } else {
                        duringPar.list.add(duringLoop)
                    }
                    val loopBody = esterel.createLoopBody
                    duringLoop.body = loopBody
                    duringLoop.end1 = esterel.createEndLoop
                    val seq = esterel.createSequence
                    loopBody.statement = seq
                    seq.list.add(esterel.createPause)

                    for (action : state.localActions) {
                        if (action instanceof DuringAction) {
                            if (action.immediate) {

                                if (action.trigger == null) {
                                    for (eff : action.effects) {
                                        duringImmSeq.list.add(transformEffect(eff as Assignment))
                                        seq.list.add(transformEffect(eff as Assignment))
                                    }
                                } else {
                                    val immIf = esterel.createIfTest
                                    duringImmSeq.list.add(immIf)
                                    immIf.expr = transformExp(action.trigger)
                                    immIf.thenPart = esterel.createThenPart => [
                                        statement = esterel.createSequence => [
                                            for (eff : action.effects) {
                                                list.add(transformEffect(eff as Assignment))
                                            }
                                            while (list.size < 2) {
                                                list.add(esterel.createNothing)
                                            }
                                        ]
                                    ]
                                    val immIf2 = esterel.createIfTest
                                    seq.list.add(immIf2)
                                    immIf2.expr = transformExp(action.trigger)
                                    immIf2.thenPart = esterel.createThenPart => [
                                        statement = esterel.createSequence => [
                                            for (eff : action.effects) {
                                                list.add(transformEffect(eff as Assignment))
                                            }
                                            while (list.size < 2) {
                                                list.add(esterel.createNothing)
                                            }
                                        ]
                                    ]
                                }
                            } else {
                                if (action.trigger == null) {
                                    for (eff : action.effects) {
                                        seq.list.add(transformEffect(eff as Assignment))
                                    }
                                } else {
                                    val immIf = esterel.createIfTest
                                    seq.list.add(immIf)
                                    immIf.expr = transformExp(action.trigger)
                                    immIf.thenPart = esterel.createThenPart => [
                                        statement = esterel.createSequence => [
                                            for (eff : action.effects) {
                                                list.add(transformEffect(eff as Assignment))
                                            }
                                            while (list.size < 2) {
                                                list.add(esterel.createNothing)
                                            }
                                        ]
                                    ]
                                }
                            }
                        }
                    }
                    while (duringImmSeq.list.size < 2) {
                        duringImmSeq.list.add(esterel.createNothing)
                    }
                }
                /*************************************************************************/
                /*
                 * Section for the transformation of Entry actions
                 */
                /*************************************************************************/
                val entryBlock = esterel.createBlock
                if (hasEntry) {
                    val entryImmSeq = esterel.createSequence
                    if (gotDeferredIncoming) {
                        val defEntry = esterel.createPresent
                        entryBlock.statement = defEntry
                        val defEntryBody = esterel.createPresentEventBody
                        defEntry.body = defEntryBody
                        defEntryBody.event = esterel.createPresentEvent => [
                            expression = createExpression(deferredSignal)
                        ]
                        val defEntryElse = esterel.createElsePart
                        defEntry.elsePart = defEntryElse

                        defEntryElse.statement = entryImmSeq
                    } else {
                        entryBlock.statement = entryImmSeq
                    }

                    for (action : state.localActions) {
                        if (action instanceof EntryAction) {
                            if (action.trigger == null) {
                                for (eff : action.effects) {
                                    entryImmSeq.list.add(transformEffect(eff as Assignment))
                                }
                            } else {
                                val immIf = esterel.createIfTest
                                entryImmSeq.list.add(immIf)
                                immIf.expr = transformExp(action.trigger)
                                immIf.thenPart = esterel.createThenPart => [
                                    statement = esterel.createSequence => [
                                        for (eff : action.effects) {
                                            list.add(transformEffect(eff as Assignment))
                                        }
                                        while (list.size < 2) {
                                            list.add(esterel.createNothing)
                                        }
                                    ]
                                ]
                            }
                        }
                    }
                    while (entryImmSeq.list.size < 2) {
                        entryImmSeq.list.add(esterel.createNothing)
                    }
                }
                /*************************************************************************/
                /*
                 * Section for the transformation of Exit actions
                 */
                /*************************************************************************/
                val exitBlock = esterel.createBlock
                if (hasExit) {
                    val exitSeq = esterel.createSequence
                    exitBlock.statement = exitSeq
                    for (action : state.localActions) {
                        if (action instanceof ExitAction) {
                            if (action.trigger == null) {
                                for (eff : action.effects) {
                                    exitSeq.list.add(transformEffect(eff as Assignment))
                                }
                            } else {
                                val immIf = esterel.createIfTest
                                exitSeq.list.add(immIf)
                                immIf.expr = transformExp(action.trigger)
                                immIf.thenPart = esterel.createThenPart => [
                                    statement = esterel.createSequence => [
                                        for (eff : action.effects) {
                                            list.add(transformEffect(eff as Assignment))
                                        }
                                        while (list.size < 2) {
                                            list.add(esterel.createNothing)
                                        }
                                    ]
                                ]
                            }
                        }
                    }
                    while (exitSeq.list.size < 2) {
                        exitSeq.list.add(esterel.createNothing)
                    }
                }
                /*************************************************************************/
                /*
                 * Section for the transformation of suspend actions
                 */
                /*************************************************************************/
                var Block blockOut
                var Block blockIn
                if (hasSuspend) {

                    val suspendBlock = esterel.createBlock
                    blockOut = suspendBlock
                    blockIn = blockOut
                    for (action : state.localActions) {
                        if (action instanceof SuspendAction) {
                            // Trigger signal the suspend statements
                            val suspendSignal = kExpression.createISignal => [
                                name = "suspend" + action.hashCode.toString
                            ]
                            localSignal.signal.add(suspendSignal)
                            val susPar = esterel.createParallel

                            if (action.weak) {
                                /*
                                 * Code block for the transformation of a weak suspend action
                                 */
                                val weakSus = esterel.createWeakSuspend
                                blockIn.statement = susPar
                                susPar.list.add(weakSus)

                                // Parallel region for emitting the trigger signal
                                val susLoop = esterel.createLoop
                                susPar.list.add(susLoop)
                                susLoop.body = esterel.createLoopBody
                                susLoop.end1 = esterel.createEndLoop

                                val susSeq = esterel.createSequence
                                susLoop.body.statement = susSeq

                                if (isSignalExpression(action.trigger)) {
                                    val susPres = esterel.createPresent
                                    susSeq.list.add(susPres)
                                    val presBody = esterel.createPresentEventBody
                                    susPres.body = presBody
                                    presBody.event = esterel.createPresentEvent => [
                                        expression = createSignalExpression(action.trigger)
                                        val presThen = esterel.createThenPart => [statement = createEmit(suspendSignal)]
                                        presBody.thenPart = presThen
                                    ]
                                } else {
                                    val susIf = esterel.createIfTest
                                    susSeq.list.add(susIf)
                                    susIf.expr = transformExp(action.trigger)
                                    susIf.thenPart = esterel.createThenPart => [
                                        statement = createEmit(suspendSignal)
                                    ]
                                }
                                susSeq.list.add(esterel.createPause)

                                // Suspend region
                                val susBody = esterel.createBlock
                                weakSus.delay = esterel.createDelayExpr => [
                                    isImmediate = action.immediate
                                    event = esterel.createDelayEvent => [
                                        expr = kExpression.createValuedObjectReference => [
                                            valuedObject = suspendSignal
                                        ]
                                    ]
                                ]
                                blockIn = susBody
                                weakSus.statement = blockIn
                            } else {

                                /*
                                 * Code block for the transformation of a suspend action
                                 */
                                val sus = esterel.createSuspend
                                blockIn.statement = susPar
                                susPar.list.add(sus)

                                // Parallele region for emitting the trigger signal
                                val susLoop = esterel.createLoop
                                susPar.list.add(susLoop)
                                susLoop.body = esterel.createLoopBody
                                susLoop.end1 = esterel.createEndLoop

                                val susSeq = esterel.createSequence
                                susLoop.body.statement = susSeq

                                if (isSignalExpression(action.trigger)) {
                                    val susPres = esterel.createPresent
                                    susSeq.list.add(susPres)
                                    val presBody = esterel.createPresentEventBody
                                    susPres.body = presBody
                                    presBody.event = esterel.createPresentEvent => [
                                        expression = createSignalExpression(action.trigger)
                                        val presThen = esterel.createThenPart => [statement = createEmit(suspendSignal)]
                                        presBody.thenPart = presThen
                                    ]
                                } else {
                                    val susIf = esterel.createIfTest
                                    susSeq.list.add(susIf)
                                    susIf.expr = transformExp(action.trigger)
                                    susIf.thenPart = esterel.createThenPart => [
                                        statement = createEmit(suspendSignal)
                                    ]
                                }
                                susSeq.list.add(esterel.createPause)

                                // Suspend region
                                val susBody = esterel.createBlock
                                sus.delay = esterel.createDelayExpr => [
                                    isImmediate = action.immediate
                                    event = esterel.createDelayEvent => [
                                        expr = kExpression.createValuedObjectReference => [
                                            valuedObject = suspendSignal
                                        ]
                                    ]
                                ]
                                blockIn = susBody
                                sus.statement = blockIn
                            }
                        }
                    }
                }
                /*************************************************************************/
                /*
                 * Compose of the single action elements, reduce unnecessary Esterel-structures
                 */
                if (hasDuring) {
                    val duringBlock = esterel.createBlock
                    duringPar.list.add(inBody)
                    duringBlock.statement = duringPar
                    inBody = duringBlock
                }
                if (hasEntry && hasExit) {
                    val actionBlock = esterel.createBlock
                    val actionSeq = esterel.createSequence
                    actionBlock.statement = actionSeq
                    actionSeq.list.add(entryBlock)
                    actionSeq.list.add(inBody)
                    actionSeq.list.add(exitBlock)
                    inBody = actionBlock
                } else if (hasEntry) {
                    val actionBlock = esterel.createBlock
                    val actionSeq = esterel.createSequence
                    actionBlock.statement = actionSeq
                    actionSeq.list.add(entryBlock)
                    actionSeq.list.add(inBody)
                    inBody = actionBlock
                } else if (hasExit) {
                    val actionBlock = esterel.createBlock
                    val actionSeq = esterel.createSequence
                    actionBlock.statement = actionSeq
                    actionSeq.list.add(inBody)
                    actionSeq.list.add(exitBlock)
                    inBody = actionBlock
                }
                if (hasSuspend) {
                    blockIn.statement = inBody
                    inBody = blockOut
                }

            }
            bodyTransitionParBlock.list.add(inBody)
            /**************************************************************************************/
            /**************************************************************************************/
            /*
             * check whether the state is a "real" superstate or only has local actions,
             * i.e., if only has local actions then the state has no regions
             */
            var superState = false
            for (reg : state.regions) {
                for (s : state.eAllContents.filter(State).toList) {
                    if (s.parentRegion.equals(reg)) {
                        superState = true
                    }
                }
            }
            if (!superState) {
                bodyBlock.statement = esterel.createNothing
            } else {
                val bodyParBlock = esterel.createParallel
                bodyBlock.statement = bodyParBlock

                // Transformation of the single regions
                for (reg : state.regions) {
                    // boolean valued signals for each region to handle the termination
                    val regSignal = kExpression.createISignal => [
                        name = "region" + reg.hashCode.toString
                        channelDescr = esterel.createChannelDescription => [
                            type = kExpression.createTypeIdentifier => [
                                type = ValueType::BOOL
                            ]
                        ]
                    ]
                    localSignal.signal.add(regSignal)
                    regionSignalMap.put(reg, regSignal)
                    locRegSignals.add(regSignal)

                    // var State initState
                    val seqBlock = esterel.createBlock
                    val regSeq = esterel.createSequence
                    seqBlock.statement = regSeq
                    bodyParBlock.list.add(seqBlock)
                    // Emit of a signal for entering the initial state
                    for (s : state.eAllContents.filter(State).toList) {
                        if (s.initial && s.parentRegion.equals(reg)) {
                            regSeq.list.add(createEmit(stateSignalMap.get(s)))
                        }
                    }
                    // Loop -> (Trap -> state||...) | pause for handling the structure of the SCChart
                    val regLoop = esterel.createLoop
                    regSeq.list.add(regLoop)
                    while (regSeq.list.length < 2) {
                        val nothing = esterel.createNothing
                        regSeq.list.add(nothing)
                    }
                    regLoop.end1 = esterel.createEndLoop
                    regLoop.body = esterel.createLoopBody
                    val loopParBlock = esterel.createParallel
                    regLoop.body.statement = loopParBlock
                    // Trap -> State || ... || State for handling cyclic SCChart structure
                    val regTrap = esterel.createTrap
                    loopParBlock.list.add(regTrap)
                    loopParBlock.list.add(esterel.createPause)
                    val regTrapDecls = esterel.createTrapDeclList
                    regTrap.trapDeclList = regTrapDecls
                    val regTrapDecl = esterel.createTrapDecl
                    regTrapDecl.name = "trap" + reg.hashCode.toString
                    regTrapDecls.trapDecls.add(regTrapDecl)

                    val stateParBlock = esterel.createParallel
                    regTrap.statement = stateParBlock

                    for (s : state.eAllContents.filter(State).toList) {
                        if (s.parentRegion.equals(reg)) {
                            stateParBlock.list.add(transformState(s, regTrapDecl))
                        }
                    }
                    while (stateParBlock.list.size < 2) {
                        stateParBlock.list.add(esterel.createNothing)
                    }
                }
                while (bodyParBlock.list.size < 2) {
                    bodyParBlock.list.add(esterel.createNothing)
                }
            }
        }

        // If state has outgoing transitions
        if (!state.outgoingTransitions.empty) {

            for (tr : state.outgoingTransitions) {
                if (tr.immediate) {
                    hasImmTransition = true
                }
            }

            // present deferred else (immediate Teil der Transitionen)
            val controllBlock = esterel.createBlock
            val conSeq = esterel.createSequence
            // ///////////////////////
            var Sequence sequence
            val immTrans = esterel.createSequence
            if (gotDeferredIncoming && hasImmTransition) {
                val defTest = esterel.createPresent
                conSeq.list.add(defTest)
                val defTestBody = esterel.createPresentEventBody
                defTest.body = defTestBody
                defTestBody.event = esterel.createPresentEvent => [
                    expression = createExpression(deferredSignal)
                ]
                val defTestElse = esterel.createElsePart
                defTest.elsePart = defTestElse

                // Transformation of the immediate transitions
                defTestElse.statement = immTrans
                sequence = immTrans
            } else {
                sequence = conSeq
            }
            controllBlock.statement = sequence
            bodyTransitionParBlock.list.add(controllBlock)

            for (trans : state.outgoingTransitions) {
                /*
                 * Abort transitions don't need the region signals for the trigger
                 */
                if (trans.immediate || state.type.equals(StateType::CONNECTOR) ||
                    trans.type.equals(TransitionType::TERMINATION)) {

                    val transIf = esterel.createIfTest
                    val transPresent = esterel.createPresent
                    /*
                     * check if the trigger is a signal
                     */
                    var boolean isSigExp = false
                    if (trans.trigger != null) {
                        isSigExp = isSignalExpression(trans.trigger)
                    }

                    /*
                     * If the transition trigger is a signal expression, 
                     * then a present statement is needed
                     */
                    if (isSigExp) {
                        /*
                         * If the transition is a termination transition, then
                         * an if-Block is needed additionally
                         */
                        if (trans.type.equals(TransitionType::TERMINATION)) {
                            sequence.list.add(transIf)
                            transIf.expr = createExp(locRegSignals)
                            transIf.thenPart = esterel.createThenPart => [
                                statement = transPresent
                            ]
                        } else {
                            sequence.list.add(transPresent)
                        }
                        val presBody = esterel.createPresentEventBody
                        transPresent.body = presBody
                        /*
                         * Transformation of the signal trigger
                         */
                        presBody.event = esterel.createPresentEvent => [
                            expression = createSignalExpression(trans.trigger)
                        ]
                        val presThen = esterel.createThenPart
                        presBody.thenPart = presThen
                        val thenSeq = esterel.createSequence
                        presThen.statement = thenSeq
                        /*
                         * Transformation of the transition effects
                         */
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff))
                        }
                        /*
                         * Emitting of signal, which represents the permission the target state
                         */
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        /*
                         * Setting the region signal according to the source and target state,
                         * if the source state is final state and target not, then the region signal
                         * is set to false,
                         * if the target state is a final state then the signal is set to true
                         */
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }

                        /*
                         * If the transition is a deferred transition, 
                         * then the deferred signal is emitted
                         */
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        /*
                         * If the state is a superstate, then the signal for abort is emitted
                         */
                        if (!state.regions.empty && !trans.type.equals(TransitionType::TERMINATION)) {
                            thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                            thenSeq.list.add(esterel.createHalt)
                        } else {
                            thenSeq.list.add(esterel.createExit => [
                                trap = bodyTrapDecl
                            ])
                        }
                    } else {
                        sequence.list.add(transIf)
                        if (trans.type.equals(TransitionType::TERMINATION)) {
                            transIf.expr = createRegionsDoneExp(locRegSignals, trans.trigger)
                        } else if (trans.trigger != null) {
                            transIf.expr = transformExp(trans.trigger)
                        } else {
                            transIf.expr = esterel.createConstantExpression => [
                                value = Boolean.TRUE.toString
                            ]
                        }
                        val thenSeq = esterel.createSequence
                        transIf.thenPart = esterel.createThenPart => [
                            statement = thenSeq
                        ]
                        /*
                         * Transformation of the transition effects
                         */
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff))
                        }
                        /*
                         * Emitting of signal, which represents the permission the target state
                         */
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        /*
                         * Setting the region signal according to the source and target state,
                         * if the source state is final state and target not, then the region signal
                         * is set to false,
                         * if the target state is a final state then the signal is set to true
                         */
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }
                        /*
                         * If the transition is a deferred transition, 
                         * then the deferred signal is emitted
                         */
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        /*
                         * If the state is a superstate, then the signal for abort is emitted
                         */
                        if (!state.regions.empty && !trans.type.equals(TransitionType::TERMINATION)) {
                            thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                            thenSeq.list.add(esterel.createHalt)
                        } else {
                            thenSeq.list.add(esterel.createExit => [
                                trap = bodyTrapDecl
                            ])
                        }
                    }
                }

            }
            while (immTrans.list.length < 2) {
                val sta = esterel.createNothing
                immTrans.list.add(sta)
            }
            if (!state.type.equals(StateType::CONNECTOR)) {
                /* 
                 * Transformation of transitions taken after the first tick
                 */
                val transLoop = esterel.createLoop
                conSeq.list.add(transLoop)

                transLoop.end1 = esterel.createEndLoop
                transLoop.body = esterel.createLoopBody
                val transSeq = esterel.createSequence
                transLoop.body.statement = transSeq
                transSeq.list.add(esterel.createPause)
                for (trans : state.outgoingTransitions) {
                    /*
                     * Abort transitions don't need the done flag to trigger
                     */
                    val transIf = esterel.createIfTest
                    val transPresent = esterel.createPresent

                    /*
                     * check if the trigger is a signal
                     */
                    var boolean isSigExp = false
                    if (trans.trigger != null) {
                        isSigExp = isSignalExpression(trans.trigger)
                    }

                    /*
                     * If the transition trigger is a signal expression, 
                     * then a present statement is needed
                     */
                    if (isSigExp) {
                        /*
                         * If the transition is a termination transition, then
                         * an if-Block is needed additionally
                         */
                        if (trans.type.equals(TransitionType::TERMINATION)) {
                            transSeq.list.add(transIf)
                            transIf.expr = createExp(locRegSignals)
                            transIf.thenPart = esterel.createThenPart => [
                                statement = transPresent
                            ]
                        } else {
                            transSeq.list.add(transPresent)
                        }
                        val presBody = esterel.createPresentEventBody
                        transPresent.body = presBody
                        /*
                         * Transformation of the signal trigger
                         */
                        presBody.event = esterel.createPresentEvent => [
                            expression = createSignalExpression(trans.trigger)
                        ]
                        val presThen = esterel.createThenPart
                        presBody.thenPart = presThen
                        val thenSeq = esterel.createSequence
                        presThen.statement = thenSeq
                        /*
                         * Transformation of the transition effects
                         */
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff))
                        }
                        /*
                         * Emitting of signal, which represents the permission the target state
                         */
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        /*
                         * Setting the region signal according to the source and target state,
                         * if the source state is final state and target not, then the region signal
                         * is set to false,
                         * if the target state is a final state then the signal is set to true
                         */
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }

                        /*
                         * If the transition is a deferred transition, 
                         * then the deferred signal is emitted
                         */
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        /*
                         * If the state is a superstate, then the signal for abort is emitted
                         */
                        if (!state.regions.empty && !trans.type.equals(TransitionType::TERMINATION)) {
                            thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                            thenSeq.list.add(esterel.createHalt)
                        } else {
                            thenSeq.list.add(esterel.createExit => [
                                trap = bodyTrapDecl
                            ])
                        }
                    } else {
                        transSeq.list.add(transIf)
                        if (trans.type.equals(TransitionType::TERMINATION)) {
                            transIf.expr = createRegionsDoneExp(locRegSignals, trans.trigger)
                        } else if (trans.trigger != null) {
                            transIf.expr = transformExp(trans.trigger)
                        } else {
                            transIf.expr = esterel.createConstantExpression => [
                                value = Boolean.TRUE.toString
                            ]
                        }
                        val thenSeq = esterel.createSequence
                        transIf.thenPart = esterel.createThenPart => [
                            statement = thenSeq
                        ]
                        /*
                         * Transformation of the transition effects
                         */
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff))
                        }
                        /*
                         * Emitting of signal, which represents the permission the target state
                         */
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        /*
                         * Setting the region signal according to the source and target state,
                         * if the source state is final state and target not, then the region signal
                         * is set to false,
                         * if the target state is a final state then the signal is set to true
                         */
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }
                        /*
                         * If the transition is a deferred transition, 
                         * then the deferred signal is emitted
                         */
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        /*
                         * If the state is a superstate, then the signal for abort is emitted
                         */
                        if (!state.regions.empty && !trans.type.equals(TransitionType::TERMINATION)) {
                            thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                            thenSeq.list.add(esterel.createHalt)
                        } else {
                            thenSeq.list.add(esterel.createExit => [
                                trap = bodyTrapDecl
                            ])
                        }
                    }

                }
                while (transSeq.list.length < 2) {
                    transSeq.list.add(esterel.createNothing)
                }
            }
            while (conSeq.list.length < 2) {
                conSeq.list.add(esterel.createNothing)
            }
        } else {
            bodyTransitionParBlock.list.add(esterel.createHalt)
        }
        while (bodyTransitionParBlock.list.length < 2) {
            bodyTransitionParBlock.list.add(esterel.createNothing)
        }

        // check if state was instantaneous
        val instanceTest = esterel.createPresent
        val instanceTestBody = esterel.createPresentEventBody
        instanceTest.body = instanceTestBody
        instanceTestBody.event = esterel.createPresentEvent => [
            expression = createExpression(lSignal)
        ]
        val instanceElse = esterel.createElsePart
        instanceTest.elsePart = instanceElse
        instanceElse.statement = esterel.createExit => [
            trap = outTrap
        ]
        stateSeq.list.add(instanceTest)

        stateTest
    }

    /*
     * Set of methods for transforming and creating of trigger expressions and effects
     */
    /* ************************************************************************************** */
    def Emit createEmit(ISignal sig) {
        val emit = esterel.createEmit => [signal = sig]
        emit
    }

    def Emit createControllEmit(ISignal sig, String boolValue) {
        val emit = esterel.createEmit
        val emitExpr = esterel.createConstantExpression => [
            value = boolValue
        ]
        emit.signal = sig
        emit.expr = emitExpr
        emit
    }

//    def dispatch Statement transformEffect(Emission emit) {
//        val state = esterel.createEmit => [
//            signal = allSignals.findFirst[name == emit.valuedObject.name]
//        ]
//        state
//    }
    def Statement transformEffect(Effect eff) {
        val state = esterel.createEmit
        if (eff instanceof Emission) {
            state.signal = allSignals.findFirst[name == eff.valuedObject.name]
        } else if (eff instanceof Assignment){
            state.signal = allSignals.findFirst[name == eff.valuedObject.name]
            state.expr = transformExp(eff.expression)
        }
        state
    }

    def Expression createRegionsDoneExp(LinkedList<ISignal> list, de.cau.cs.kieler.core.kexpressions.Expression exp) {
        var expression = kExpression.createOperatorExpression
        if (exp == null) {
            expression = createExp(list)
        } else {
            expression = kExpression.createOperatorExpression
            expression.operator = OperatorType::AND
            expression.subExpressions += createExp(list)
            expression.subExpressions += transformExp(exp)
        }
        expression
    }

    def dispatch ConstantExpression transformExp(BoolValue exp) {
        esterel.createConstantExpression => [
            value = Boolean.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(IntValue exp) {
        esterel.createConstantExpression => [
            value = Integer.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(FloatValue exp) {
        esterel.createConstantExpression => [
            value = Float.toString(exp.value)
        ]
    }

    def dispatch OperatorExpression transformExp(ValuedObjectReference exp) {
        return kExpression.createOperatorExpression => [
            operator = OperatorType::VAL
            subExpressions += kExpression.createValuedObjectReference => [
                valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
            ]
        ]
    }

    def dispatch OperatorExpression transformExp(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
        kExpression.createOperatorExpression => [
            operator = OperatorType::getByName(exp.operator.getName)
            for (subExp : exp.subExpressions) {
                subExpressions += transformExp(subExp)
            }
        ]
    }

    def OperatorExpression createExp(ISignal signal) {
        kExpression.createOperatorExpression => [
            operator = OperatorType::VAL
            subExpressions += kExpression.createValuedObjectReference => [
                valuedObject = signal
            ]
        ]
    }

    def OperatorExpression createExp(List<ISignal> list) {
        kExpression.createOperatorExpression => [
            if (list.size > 1) {
                operator = OperatorType::AND
                subExpressions += createExp(list.head)
                subExpressions += createExp(list.tail.toList)
            } else {
                operator = OperatorType::VAL
                subExpressions += kExpression.createValuedObjectReference => [
                    valuedObject = list.head
                ]
            }
        ]
    }

    def dispatch OperatorExpression transformTrigger(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
        kExpression.createOperatorExpression => [
            operator = OperatorType::getByName(exp.operator.getName)
            for (subExp : exp.subExpressions) {
                subExpressions += transformTrigger(subExp)
            }
        ]
    }

    def dispatch Expression transformTrigger(ValuedObjectReference exp) {
        kExpression.createOperatorExpression => [
            operator = OperatorType::VAL
            subExpressions += kExpression.createValuedObjectReference => [
                valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
            ]
        ]
    }

    def Expression createExpression(ISignal signal) {
        return kExpression.createValuedObjectReference => [
            valuedObject = signal
        ]
    }

    def dispatch boolean isSignalExpression(ValuedObjectReference exp) {
        exp.valuedObject.pureSignal
    }

    def dispatch boolean isSignalExpression(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
        var boolean signalExpression = true
        for (sub : exp.subExpressions) {
            if (!isSignalExpression(sub)) {
                signalExpression = false
            }
        }
        signalExpression
    }

    def dispatch Expression createSignalExpression(ValuedObjectReference exp) {
        return kExpression.createValuedObjectReference => [
            valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
        ]
    }

    def dispatch Expression createSignalExpression(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
        return kExpression.createOperatorExpression => [
            operator = OperatorType::getByName(exp.operator.getName)
            for (subExp : exp.subExpressions) {
                subExpressions += createSignalExpression(subExp)
            }
        ]
    }

}
