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

class SCChartsToEsterelTransformation extends AbstractModelTransformation {

    @Inject
    extension SCChartsExtension

    val esterel = EsterelFactory::eINSTANCE
    val kExpression = KExpressionsFactory::eINSTANCE

    var LinkedList<ISignal> allSignals
    var HashMap<State, ISignal> stateSignalMap
    var HashMap<State, Boolean> stateDoneMap
    var HashMap<Region, ISignal> regionSignalMap
    var HashMap<Transition, ISignal> abortSignalMap
    var HashMap<Transition, ISignal> abortTriggerMap
    var ISignal deferredSignal

    var boolean hasEntry
    var boolean hasDuring
    var boolean hasExit
    var boolean hasSuspend

    // var LinkedList<ISignal> stateSignals
    // var LinkedList<State> statesDone
    var LinkedList<TrapDecl> allTraps
    val localSignal = esterel.createLocalSignal

    override EObject transform(EObject model) {
        return ( transformModel(model as State))
    }

    public def Program transformModel(State model) {
        allSignals = new LinkedList<ISignal>
        allTraps = new LinkedList<TrapDecl>
        stateSignalMap = new HashMap<State, ISignal>
        stateDoneMap = new HashMap<State, Boolean>
        regionSignalMap = new HashMap<Region, ISignal>
        abortSignalMap = new HashMap<Transition, ISignal>
        abortTriggerMap = new HashMap<Transition, ISignal>

        // stateSignals = new LinkedList<ISignal>
        // statesDone = new LinkedList<State>
        val program = esterel.createProgram
        val module = esterel.createModule
        module.name = model.id
        program.modules.add(module)

        // creates the module interface, signal declarations etc., of the Esterel program
        module.interface = createModuleInterface(model.declarations)

        // creates the module body of the Esterel program
        module.body = esterel.createModuleBody

        module.body.statements.add(transformRoot(model))

        module.end = "end module"

        program
    }

    // creates the module interface, signal declarations etc., of the Esterel program
    public def ModuleInterface createModuleInterface(EList<Declaration> declarations) {
        val ModuleInterface mi = esterel.createModuleInterface
        for (decl : declarations) {
            for (valObj : decl.valuedObjects) {
                val signal = kExpression.createISignal => [
                    name = valObj.name
                    if (!decl.type.getName.equals(ValueType::PURE)) {
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
                }
                allSignals += signal
            }
        }
        mi
    }

    public def Statement transformRoot(State root) {

        // pure signals for each State to handle the entering
        val LinkedList<ISignal> regSignals = new LinkedList<ISignal>
        val localSignals = esterel.createLocalSignalDecl
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

            val stateParBlock = esterel.createParallel
            regTrap.statement = stateParBlock

            for (state : root.eAllContents.filter(State).toList) {
                if (state.parentRegion.equals(reg)) {
                    stateParBlock.list.add(transformState(state, regTrapDecl))
                }
            }
        }
        localSignals.signalList = localSignal

        // extra parallel region to handle the termination
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

    public def Statement transformState(State state, TrapDecl outTrap) {

        val LinkedList<ISignal> locRegSignals = new LinkedList<ISignal>

        /*
         * check for state got incoming deferred transitions
         */
        var gotDeferredIncoming = false;
        var gotImmediateIncoming = false;
        for (inTrans : state.incomingTransitions) {
            if (inTrans.deferred) {
                gotDeferredIncoming = true
            }
            if (inTrans.immediate) {
                gotImmediateIncoming = true
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

        val lSignal = kExpression.createISignal => [
            name = "surface" + state.hashCode.toString
        ]
        locSignal.signal.add(lSignal)

        val stateSeq = esterel.createSequence
        locSignals.statement = stateSeq
        stateSeq.list.add(createEmit(lSignal))

        /* 
         * TODO: Transformation of the state body parallel to the Transitions 
         * TODO: Aborts, Suspend drum herum einbauen 
         * 
         * stateSeq.list.add(.............)
         * 
         */
        // Transformation of the state body, transitions, local declarations and actions
        val localSignals = esterel.createLocalSignalDecl
        stateSeq.list.add(localSignals)
        val localSignal = esterel.createLocalSignal
        localSignals.signalList = localSignal

        // Boolean signal "done..." to identify if all regions are in final states
        val doneSignal = kExpression.createISignal => [
            name = "done" + state.hashCode.toString
            channelDescr = esterel.createChannelDescription => [
                type = kExpression.createTypeIdentifier => [
                    type = ValueType::BOOL
                ]
            ]
        ]
        localSignal.signal.add(doneSignal)
        // Local declarations
        for (decl : state.declarations) {
            for (valObj : decl.valuedObjects) {
                val declSignal = kExpression.createISignal => [
                    name = valObj.name
                    channelDescr = esterel.createChannelDescription => [
                        type = kExpression.createTypeIdentifier => [
                            type = ValueType::getByName(decl.type.getName)
                        ]
                    ]
                ]
                localSignal.signal.add(declSignal)
            }
        }

        // Trap to leave the state when done
        val bodyTrap = esterel.createTrap
        localSignals.statement = bodyTrap
        val bodyTrapDecls = esterel.createTrapDeclList
        bodyTrap.trapDeclList = bodyTrapDecls
        val bodyTrapDecl = esterel.createTrapDecl
        bodyTrapDecls.trapDecls.add(bodyTrapDecl)
        bodyTrapDecl.name = "trap" + state.hashCode.toString

        // Block for encapsulate the aborts into each other
        var helpBlock = esterel.createBlock
        var Block helpBlockIn
        bodyTrap.statement = helpBlock

        if (!state.regions.empty) {
            for (trans : state.outgoingTransitions) {

                // Abort-Statements nested in order based on priority of corresponding transitions
                if (trans.type.equals(TransitionType::STRONGABORT)) {
                    // signal for trigger of the strongAbort
                    val abortSignal = kExpression.createISignal => [
                        name = "sAbort" + trans.hashCode.toString
                    ]
                    localSignal.signal.add(abortSignal)
                    abortSignalMap.put(trans, abortSignal)
                    /*
                     * TODO: need to trigger abort from outside
                     */
//                    val triggerSignal = kExpression.createISignal => [
//                        name = "sTrigger" + trans.hashCode.toString
//                        channelDescr = esterel.createChannelDescription => [
//                            type = kExpression.createTypeIdentifier => [
//                                type = ValueType::PURE
//                            ]
//                        ]
//                    ]
//                    localSignal.signal.add(triggerSignal)
//                    abortTriggerMap.put(trans, triggerSignal)
                    val abPar = esterel.createParallel
                    val abort = esterel.createAbort
                    abort.body = esterel.createAbortInstance => [
                        delay = esterel.createDelayExpr => [
                            isImmediate = trans.immediate
                            event = esterel.createDelayEvent
                            event.expr = createExpression(abortSignal) // triggerSignal 
                        ]
                    ]
//                    val abSeq = esterel.createSequence
//                    abSeq.list.add(esterel.createAwait => [
//                        body = esterel.createAwaitInstance => [
//                            delay = esterel.createDelayExpr => [
//                                event = esterel.createDelayEvent => [
//                                    expr = kExpression.createValuedObjectReference => [
//                                        valuedObject = abortSignal
//                                    ]
//                                ]
//                            ]
//                        ]
//                    ])
//                    abSeq.list.add(createEmit(triggerSignal))
//                    abPar.list.add(abort)
//                    abPar.list.add(abSeq)
                    helpBlock.statement = abort
                    helpBlockIn = esterel.createBlock
                    abort.statement = helpBlockIn
                    helpBlock = helpBlockIn

                } else if (trans.type.equals(TransitionType::WEAKABORT)) {
                    // signal for trigger of the weakAbort
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

        // Block for the transformation of reference states
        /**************************************************************************************/
        if (state.isReferencedState) {
            val runSeq = esterel.createSequence
            val run = esterel.createRun
            runSeq.list.add(run)
            runSeq.list.add(createControllEmit(doneSignal, "true"))
            val modRen = esterel.createModuleRenaming
            run.module = modRen
            modRen.module = transformModel(state).modules.findFirst[name == state.id]

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
        } /**************************************************************************************/ else if (state.
            regions.empty) {
            bodyTransitionParBlock.list.add(createControllEmit(doneSignal, "true"))
        } else {

            /*
             *  Transformation of actions from the model
             */
            if (!state.localActions.empty) {
                // Check for different actions for building only the relevant structure
                for (action : state.localActions) {
                    if (action instanceof EntryAction) {
                        hasEntry = true
                    }
                    if (action instanceof DuringAction) {
                        hasDuring = true
                    }
                    if (action instanceof ExitAction) {
                        hasExit = true
                    }
                    if (action instanceof SuspendAction) {
                        hasSuspend = true
                    }
                }

                /* 
                 * Block for the transformation of the during actions 
                 */
                val duringPar = esterel.createParallel
                if (hasDuring) {
                    val duringBlock = esterel.createBlock
                    val duringSeq = esterel.createSequence
                    duringBlock.statement = duringSeq
                    duringPar.list.add(duringBlock)

                    /*
                     * TODO: place the "present deferred" block only 
                     * if there is a deferred incoming transition
                     */
                    if (gotDeferredIncoming) {
                    }
                    val deferredDuring = esterel.createPresent
                    duringSeq.list.add(deferredDuring)
                    val defDuringBody = esterel.createPresentEventBody
                    deferredDuring.body = defDuringBody
                    defDuringBody.event = esterel.createPresentEvent => [
                        expression = createExpression(deferredSignal)
                    ]
                    val defDuringElse = esterel.createElsePart
                    deferredDuring.elsePart = defDuringElse
                    val duringImmSeq = esterel.createSequence
                    defDuringElse.statement = duringImmSeq

                    val duringLoop = esterel.createLoop
                    duringSeq.list.add(duringLoop)
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

                /*
                 * Block for the Entry actions
                 */
                val defEntry = esterel.createPresent
                if (hasEntry) {
                    val defEntryBody = esterel.createPresentEventBody
                    defEntry.body = defEntryBody
                    defEntryBody.event = esterel.createPresentEvent => [
                        expression = createExpression(deferredSignal)
                    ]
                    val defEntryElse = esterel.createElsePart
                    defEntry.elsePart = defEntryElse
                    val entryImmSeq = esterel.createSequence
                    defEntryElse.statement = entryImmSeq

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

                /*
                 * Block for the Exit actions
                 */
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
                /*
                 * Block for the Suspend actions
                 */
                var Block blockOut
                var Block blockIn
                if (hasSuspend) {

                    val suspendBlock = esterel.createBlock
                    blockOut = suspendBlock
                    blockIn = blockOut
                    for (action : state.localActions) {
                        if (action instanceof SuspendAction) {
                            // Signal zum Auslösen des Suspend Statements
                            val suspendSignal = kExpression.createISignal => [
                                name = "suspend" + action.hashCode.toString
//                                channelDescr = esterel.createChannelDescription => [
//                                    type = kExpression.createTypeIdentifier => [
//                                        type = ValueType::PURE
//                                    ]
//                                ]
                            ]
                            localSignal.signal.add(suspendSignal)
                            val susPar = esterel.createParallel
                            if (action.weak) {
                                val weakSus = esterel.createWeakSuspend
                                blockIn.statement = susPar
                                susPar.list.add(weakSus)

                                // Parallele Region zum Setzen des Suspend Signals
                                val susLoop = esterel.createLoop
                                susPar.list.add(susLoop)
                                susLoop.body = esterel.createLoopBody
                                susLoop.end1 = esterel.createEndLoop

                                val susSeq = esterel.createSequence
                                susLoop.body.statement = susSeq

                                val susIf = esterel.createIfTest
                                susSeq.list.add(susIf)
                                susIf.expr = transformExp(action.trigger)
                                susIf.thenPart = esterel.createThenPart => [
                                    statement = createEmit(suspendSignal)
                                ]
                                susSeq.list.add(esterel.createPause)

                                // Suspend Region
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
                                val sus = esterel.createSuspend
                                blockIn.statement = susPar
                                susPar.list.add(sus)

                                // Parallele Region zum Setzen des Suspend Signals
                                val susLoop = esterel.createLoop
                                susPar.list.add(susLoop)
                                susLoop.body = esterel.createLoopBody
                                susLoop.end1 = esterel.createEndLoop

                                val susSeq = esterel.createSequence
                                susLoop.body.statement = susSeq

                                val susIf = esterel.createIfTest
                                susSeq.list.add(susIf)
                                susIf.expr = transformExp(action.trigger)
                                susIf.thenPart = esterel.createThenPart => [
                                    statement = createEmit(suspendSignal)
                                ]
                                susSeq.list.add(esterel.createPause)

                                // Suspend Region
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

                /*
                 * Zusammensetzen der einzelnen Action-Elemente, um unnötige Esterel-Strukturen
                 * zu umgehen
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
                    actionSeq.list.add(defEntry)
                    actionSeq.list.add(inBody)
                    actionSeq.list.add(exitBlock)
                    inBody = actionBlock
                } else if (hasEntry) {
                    val actionBlock = esterel.createBlock
                    val actionSeq = esterel.createSequence
                    actionBlock.statement = actionSeq
                    actionSeq.list.add(defEntry)
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
            // check whether the state is a superstate or only has local actions
            var superState = false
            for (reg : state.regions) {
                for (s : state.eAllContents.filter(State).toList) {
                    if (s.parentRegion.equals(reg)) {
                        superState = true
                    }
                }
            }

            if (!superState) {
                bodyBlock.statement = createControllEmit(doneSignal, "true")
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
                    // Emit of a Signal for entering the initial state
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
                }
                while (bodyParBlock.list.size < 2) {
                    bodyParBlock.list.add(esterel.createNothing)
                }
            }

            // extra parallel region to handle the termination of all regions
            if (superState) {
                val controllLoop = esterel.createLoop
                bodyTransitionParBlock.list.add(controllLoop)
                controllLoop.body = esterel.createLoopBody
                controllLoop.end1 = esterel.createEndLoop

                val controllSeq = esterel.createSequence
                controllLoop.body.statement = controllSeq

                val controllIf = esterel.createIfTest
                controllSeq.list.add(controllIf)
                controllIf.expr = createExp(locRegSignals)
                controllIf.thenPart = esterel.createThenPart => [
                    statement = createControllEmit(doneSignal, "true")
                ]
                controllIf.elsePart = esterel.createElsePart => [
                    statement = createControllEmit(doneSignal, "false")
                ]
                controllSeq.list.add(esterel.createPause)
            }

        }

        // If state has outgoing transitions
        if (!state.outgoingTransitions.empty) {

            // present deferred else (immediate Teil der Transitionen)
            val controllBlock = esterel.createBlock
            val conSeq = esterel.createSequence
            controllBlock.statement = conSeq
            bodyTransitionParBlock.list.add(controllBlock)
            var Sequence sequence
            val immTrans = esterel.createSequence
            if (gotDeferredIncoming) {
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

            for (trans : state.outgoingTransitions) {
                /*
                 * Abort transitions don't need the done flag to trigger
                 */
                if (trans.immediate) {
                    val transIf = esterel.createIfTest
                    sequence.list.add(transIf)
                    if (!trans.type.equals(TransitionType::TERMINATION) && !state.regions.empty) {
                        if (trans.trigger != null) {
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
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff as Assignment))
                        }
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }
                        thenSeq.list.add(createControllEmit(doneSignal, "false"))
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                        thenSeq.list.add(esterel.createHalt)
                    } else {
                        transIf.expr = createDoneExpression(doneSignal, trans.trigger)
                        val thenSeq = esterel.createSequence
                        transIf.thenPart = esterel.createThenPart => [
                            statement = thenSeq
                        ]
                        for (eff : trans.effects) {
                            thenSeq.list.add(transformEffect(eff as Assignment))
                        }
                        thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                        if (!trans.sourceState.final && trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                        } else if (trans.sourceState.final && !trans.targetState.final) {
                            thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                        }
                        thenSeq.list.add(createControllEmit(doneSignal, "false"))
                        if (trans.deferred) {
                            thenSeq.list.add(createEmit(deferredSignal))
                        }
                        thenSeq.list.add(esterel.createExit => [
                            trap = bodyTrapDecl
                        ])
                    }
                }

            }
            while (immTrans.list.length < 2) {
                val sta = esterel.createNothing
                immTrans.list.add(sta)
            }
            // Transformation of transitions taken after the first tick
            val transLoop = esterel.createLoop
            conSeq.list.add(transLoop)
            while (conSeq.list.length < 2) {
                conSeq.list.add(esterel.createNothing)
            }
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
                transSeq.list.add(transIf)
                if (!trans.type.equals(TransitionType::TERMINATION) && !state.regions.empty) {
                    if (trans.trigger != null) {
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
                    for (eff : trans.effects) {
                        thenSeq.list.add(transformEffect(eff as Assignment))
                    }
                    thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                    if (!trans.sourceState.final && trans.targetState.final) {
                        thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                    } else if (trans.sourceState.final && !trans.targetState.final) {
                        thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                    }
                    thenSeq.list.add(createControllEmit(doneSignal, "false"))
                    if (trans.deferred) {
                        thenSeq.list.add(createEmit(deferredSignal))
                    }
                    thenSeq.list.add(createEmit(abortSignalMap.get(trans)))
                    thenSeq.list.add(esterel.createHalt)

                } else {
                    transIf.expr = createDoneExpression(doneSignal, trans.trigger)
                    val thenSeq = esterel.createSequence
                    transIf.thenPart = esterel.createThenPart => [
                        statement = thenSeq
                    ]
                    for (eff : trans.effects) {
                        thenSeq.list.add(transformEffect(eff as Assignment))
                    }
                    thenSeq.list.add(createEmit(stateSignalMap.get(trans.targetState)))
                    if (!trans.sourceState.final && trans.targetState.final) {
                        thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
                    } else if (trans.sourceState.final && !trans.targetState.final) {
                        thenSeq.list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
                    }
                    thenSeq.list.add(createControllEmit(doneSignal, "false"))
                    if (trans.deferred) {
                        thenSeq.list.add(createEmit(deferredSignal))
                    }
                    thenSeq.list.add(esterel.createExit => [
                        trap = bodyTrapDecl
                    ])
                }

            }
            while (transSeq.list.length < 2) {
                val sta = esterel.createNothing
                transSeq.list.add(sta)
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
            expression = createExpression(stateSignalMap.get(state))
        ]
        val instanceElse = esterel.createElsePart
        instanceTest.elsePart = instanceElse
        instanceElse.statement = esterel.createExit => [
            trap = outTrap
        ]
        stateSeq.list.add(instanceTest)

        stateTest
    }

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

    // def dispatch Statement transformEffect(Assignment assign){
    // val state = esterel.createAssignment => [
    // ^var = allSignals.findFirst[name == assign.valuedObject.name]
    // ]
    //
    // state
    // }
    def Statement transformEffect(Assignment assign) {

        val state = esterel.createEmit => [
            signal = allSignals.findFirst[name == assign.valuedObject.name]
            expr = transformExp(assign.expression)
        ]

        state
    }

    def Expression createDoneExpression(ISignal done, de.cau.cs.kieler.core.kexpressions.Expression exp) {
        var expression = kExpression.createOperatorExpression
        if (exp == null) {
            expression.operator = OperatorType::VAL
            expression.subExpressions += kExpression.createValuedObjectReference => [
                valuedObject = done
            ]
        } else {

            expression.operator = OperatorType::AND
            expression.subExpressions += kExpression.createOperatorExpression => [
                operator = OperatorType::VAL
                subExpressions += kExpression.createValuedObjectReference => [
                    valuedObject = done
                ]
            ]
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

    def OperatorExpression createExp(LinkedList<ISignal> list) {
        kExpression.createOperatorExpression => [
            if (list.size > 1) {
                operator = OperatorType::AND
                subExpressions += createExp(list.remove)
                subExpressions += createExp(list)

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

}
