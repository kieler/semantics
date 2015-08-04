package de.cau.cs.kieler.sccharts.esterel.transformation

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.ModuleInterface
import de.cau.cs.kieler.sccharts.esterel.transformation.HelpFunctions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.Value
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.esterel.ModuleBody
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.sccharts.Transition
import java.util.Comparator
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import java.util.LinkedList
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Effect
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.IterateAction
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.kexpressions.Signal
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Block

class SCChartsToEsterelTransformation extends AbstractModelTransformation {

    val esterel = EsterelFactory::eINSTANCE
    val kExpression = KExpressionsFactory::eINSTANCE

    var LinkedList<ISignal> allSignals
    var HashMap<State, ISignal> stateSignalMap
    var HashMap<State, Boolean> stateDoneMap
    var HashMap<Region, ISignal> regionSignalMap
    var HashMap<Transition, ISignal> abortSignalMap
    var ISignal deferredSignal

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
                    channelDescr = esterel.createChannelDescription => [
                        type = kExpression.createTypeIdentifier => [
                            type = ValueType::getByName(decl.type.getName)
                        ]
                    ]
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
                channelDescr = esterel.createChannelDescription => [
                    type = kExpression.createTypeIdentifier => [
                        type = ValueType::PURE
                    ]
                ]
            ]
            localSignal.signal.add(stateSignal)
            stateSignalMap.put(state, stateSignal)
        }
        // signal "deferred" for check if the taken transition is deferred
        deferredSignal = kExpression.createISignal => [
            name = "deferred"
            channelDescr = esterel.createChannelDescription => [
                type = kExpression.createTypeIdentifier => [
                    type = ValueType::PURE
                ]
            ]
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
            channelDescr = esterel.createChannelDescription => [
                type = kExpression.createTypeIdentifier => [
                    type = ValueType::PURE
                ]
            ]
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

        // pure signal "done..." to identify if all regions are in final states
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

        val progSeq = esterel.createSequence
        localSignals.statement = progSeq
        /*
         * place holder for the actions
         * 
         * 
         */
        progSeq.list.add(esterel.createNothing)
        // Trap to leave the state when done
        val bodyTrap = esterel.createTrap
        progSeq.list.add(bodyTrap)
        val bodyTrapDecls = esterel.createTrapDeclList
        bodyTrap.trapDeclList = bodyTrapDecls
        val bodyTrapDecl = esterel.createTrapDecl
        bodyTrapDecls.trapDecls.add(bodyTrapDecl)
        bodyTrapDecl.name = "trap" + state.hashCode.toString

        // Block zum handeln der ineinander geschachtelten Aborts
        var helpBlock = esterel.createBlock
        var Block helpBlockIn
        bodyTrap.statement = helpBlock

        if (!state.regions.empty) {
            for (trans : state.outgoingTransitions) {

                // Abort-Statements geschachtelt nach der Reihenfolge der Transitionen im State
                if (trans.type.equals(TransitionType::STRONGABORT)) {
                    // signal zum Auslösen eines weakAborts
                    val abortSignal = kExpression.createISignal => [
                        name = "sAbort" + trans.hashCode.toString
                        channelDescr = esterel.createChannelDescription => [
                            type = kExpression.createTypeIdentifier => [
                                type = ValueType::PURE
                            ]
                        ]
                    ]
                    localSignal.signal.add(abortSignal)
                    abortSignalMap.put(trans, abortSignal)

                    val abort = esterel.createAbort
                    abort.body = esterel.createAbortInstance => [
                        delay = esterel.createDelayExpr => [
                            isImmediate = trans.immediate
                            event = esterel.createDelayEvent
                            // tick = "tick"
                            event.expr = createExpression(abortSignal)
                        ]
                    ]
                    helpBlockIn = esterel.createBlock
                    helpBlock.statement = abort
                    abort.statement = helpBlockIn
                    helpBlock = helpBlockIn

                } else if (trans.type.equals(TransitionType::WEAKABORT)) {
                    // signal zum Auslösen eines weakAborts
                    val abortSignal = kExpression.createISignal => [
                        name = "wAbort" + trans.hashCode.toString
                        channelDescr = esterel.createChannelDescription => [
                            type = kExpression.createTypeIdentifier => [
                                type = ValueType::PURE
                            ]
                        ]
                    ]
                    localSignal.signal.add(abortSignal)
                    abortSignalMap.put(trans, abortSignal)

                    val abort = esterel.createWeakAbort
                    abort.body = esterel.createWeakAbortInstance => [
                        delay = esterel.createDelayExpr => [
                            isImmediate = trans.immediate
                            event = esterel.createDelayEvent
                            // tick = "tick"
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

        if (state.regions.empty) {
            bodyTransitionParBlock.list.add(createControllEmit(doneSignal, "true"))
        } else {
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
                bodyTransitionParBlock.list.add(seqBlock)
                // Emit of a Signal for entering the initial state
                for (s : state.eAllContents.filter(State).toList) {
                    if (s.initial && state.parentRegion.equals(reg)) {
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

            // extra parallel region to handle the termination of all regions
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

        // If state has outgoing transitions
        if (!state.outgoingTransitions.empty) {

            // present deferred else (immediate Teil der Transitionen)
            val controllBlock = esterel.createBlock
            val conSeq = esterel.createSequence
            controllBlock.statement = conSeq
            bodyTransitionParBlock.list.add(controllBlock)
            val defTest = esterel.createPresent
            conSeq.list.add(defTest)
            conSeq.list.add(esterel.createNothing)
            val defTestBody = esterel.createPresentEventBody
            defTest.body = defTestBody
            defTestBody.event = esterel.createPresentEvent => [
                expression = createExpression(deferredSignal)
            ]
            val defTestElse = esterel.createElsePart
            defTest.elsePart = defTestElse

            // Transformation of the immediate transitions
            val immTrans = esterel.createSequence
            defTestElse.statement = immTrans
            for (trans : state.outgoingTransitions) {
                /*
                 * Abort transitions don't need the done flag to trigger
                 */
                if (trans.immediate) {
                    val transIf = esterel.createIfTest
                    immTrans.list.add(transIf)
                    if (!trans.type.equals(TransitionType::TERMINATION) && !state.regions.empty) {
                        transIf.expr = transformExp(trans.trigger)
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
                val sta = esterel.createNothing
                conSeq.list.add(sta)
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
                    transIf.expr = transformExp(trans.trigger)
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

//    public def Statement transformState2(State state, boolean deferred, TrapDecl outTrap) {
//
//        val regSignalList = new LinkedList<ISignal>()
//
//        val programCodeBlock = esterel.createBlock
//        val progSeq = esterel.createSequence
//
//        // create local declarations --------------------------------- nach oben verschieben ----------------------
//        var decls = state.eAllContents.filter(Declaration).toList
//        if (!decls.empty) {
//            val localSignals = esterel.createLocalSignalDecl
//            val localSignal = esterel.createLocalSignal
//            localSignals.signalList = localSignal
//
//            for (decl : state.declarations) {
//                for (valObj : decl.valuedObjects) {
//                    val declSignal = kExpression.createISignal => [
//                        name = valObj.name
//                        channelDescr = esterel.createChannelDescription => [
//                            type = kExpression.createTypeIdentifier => [
//                                type = ValueType::getByName(decl.type.getName)
//                            ]
//                        ]
//                    ]
//                    localSignal.signal.add(declSignal)
//                }
//            }
//            localSignals.statement = progSeq // mit den IfTests verbinden ---------------------------------
//            programCodeBlock.statement = localSignals
//        } else {
//            programCodeBlock.statement = progSeq
//        }
//
//        // val stateSignal = esterel.crea
//        val seq = esterel.createSequence
//
//        // create IfTest for handling the structure of the SCChart
//        val stateTest = esterel.createPresent
//        val stateTestBody = esterel.createPresentEventBody
//        stateTest.body = stateTestBody
//        stateTestBody.event = esterel.createPresentEvent => [
//            expression = createExpression(stateSignalMap.get(state))
//        ]
//        val thenTest = esterel.createThenPart
//        thenTest.statement = seq
//        stateTestBody.thenPart = thenTest
//        progSeq.list.add(stateTest)
//
//        // progSeq.list.add(esterel.createPause)
//        progSeq.list.add(esterel.createNothing)
//
//        val regions = state.regions
//        val transitions = state.outgoingTransitions
//
//        if (regions.empty) {
//
//            // -------------------------------------------- Transition für Superstates anfertigen-----------------------------
//            if (transitions.size > 0) {
//
//                val awaitBlock = esterel.createAwait
//                seq.list.add(awaitBlock)
//                val awaitBody = esterel.createAwaitCase
//                awaitBlock.body = awaitBody
//                var awaitCases = awaitBody.cases
//                awaitBody.end = "end"
//                for (transition : transitions) {
//                    var awaitCase = esterel.createAbortCaseSingle
//                    awaitCases.add(awaitCase)
//                    awaitCase.delay = esterel.createDelayExpr => [
//                        event = esterel.createDelayEvent => [
//                            if (transition.trigger != null) {
//                                tick = "tick"
//                            } else {
//                                expr
//                            }
//                        ]
//                        isImmediate = transition.immediate
//                    ]
//                    awaitCase.statement = esterel.createSequence => [
//                        for (effect : transition.effects) {
//                            list.add(transformEffect(effect as Assignment))
//                        }
//                        list.add(createControllEmit(stateSignalMap.get(transition.sourceState), "false"))
//                        list.add(createControllEmit(stateSignalMap.get(transition.targetState), "true"))
//                        if (!transition.sourceState.final && transition.targetState.final) {
//                            list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
//                        } else if (transition.sourceState.final && !transition.targetState.final) {
//                            list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
//                        }
//                    ]
//                }
//            } else if (transitions.size == 0 && !state.final) {
//                seq.list.add(esterel.createHalt)
//            } else {
//                seq.list.add(esterel.createNothing)
//            }
//        } else {
//
//            // Liste der Signale, die zum handeln der Regionen und der aborts benötigt werden
//            val regSignalDecl = esterel.createLocalSignalDecl
//            val regSignals = esterel.createLocalSignal
//            regSignalDecl.signalList = regSignals
//            seq.list.add(regSignalDecl)
//
//            // Trap zum handeln der Normaltermination			
//            val trap = esterel.createTrap
//            val trapDecls = esterel.createTrapDeclList
//            trap.trapDeclList = trapDecls
//            val trapDecl = esterel.createTrapDecl
//            trapDecls.trapDecls.add(trapDecl)
//            trapDecl.name = "trap" + state.hashCode.toString
//
//            regSignalDecl.statement = trap
//
//            val outTransitions = state.outgoingTransitions
//
//            // Statement zum Verschachteln von Aborts
//            var Block out = esterel.createBlock
//            var Block in
//
//            val parblock = esterel.createParallel
//            val controllParBlock = esterel.createParallel
//            controllParBlock.list.add(out)
//
//            for (trans : outTransitions) {
//
//                // signals zum Handeln von verschachtelten Aborts
//                val abortSignal = kExpression.createISignal => [
//                    name = "abort" + trans.hashCode.toString
//                    channelDescr = esterel.createChannelDescription => [
//                        type = kExpression.createTypeIdentifier => [
//                            type = ValueType::BOOL
//                        ]
//                    ]
//                ]
//                regSignals.signal.add(abortSignal)
//
//                in = esterel.createBlock
//
//                // Abort-Statements geschachtelt nach der Reihenfolge der Transitionen im State
//                if (trans.type.equals(TransitionType::STRONGABORT)) {
//                    val abort = esterel.createAbort
//                    abort.body = esterel.createAbortInstance => [
//                        delay = esterel.createDelayExpr => [
//                            isImmediate = trans.immediate
//                            event = esterel.createDelayEvent
//                            // tick = "tick"
//                            event.expr = createExp(abortSignal)
//                        ]
//                    ]
//                    abort.statement = in
//                    in = out
//
//                } else if (trans.type.equals(TransitionType::WEAKABORT)) {
//                    val abort = esterel.createWeakAbort
//                    abort.body = esterel.createAbortInstance => [
//                        delay = esterel.createDelayExpr => [
//                            isImmediate = trans.immediate
//                            event = esterel.createDelayEvent
//                            // tick = "tick"
//                            event.expr = createExp(abortSignal)
//                        ]
//                    ]
//                    abort.statement = in
//                    in = out
//                }
//
//            }
//
//            out.statement = parblock
//
//            // Erzeugen paralleler Statements für jede Region
//            trap.statement = controllParBlock // ------------------------aborts nicht vergessen-----------------------------
//            for (reg : regions) {
//
//                // signals zum prüfen, ob die jeweilige Region im final state ist
//                val regSignal = kExpression.createISignal => [
//                    name = "r" + reg.hashCode.toString
//                    channelDescr = esterel.createChannelDescription => [
//                        type = kExpression.createTypeIdentifier => [
//                            type = ValueType::BOOL
//                        ]
//                    ]
//                ]
//                regionSignalMap.put(reg, regSignal)
//                regSignals.signal.add(regSignal)
//                regSignalList.add(regSignal)
//
//                var State initState
//                val stateSeq = esterel.createSequence
//                for (sta : state.eAllContents.filter(State).toList) {
//                    if (sta.initial && sta.parentRegion.equals(reg)) {
//                        initState = sta
//                    }
//                    if (sta.parentRegion.equals(reg)) {
//                        stateSeq.list.add(transformState(sta, false))
//                    }
//                }
//                stateSeq.list.add(esterel.createPause)
//
//                // Loop für das Handling möglicher Zyklen in der Region und für die Terminierung
//                val loop = esterel.createLoop
//                loop.end1 = esterel.createEndLoop
//                loop.body = esterel.createLoopBody
//                val regSeq = esterel.createSequence
//
//                loop.body.statement = regSeq
//                val regBlock = stateSeq
//                val initEmit = createControllEmit(stateSignalMap.get(initState), "true")
//                regSeq.list.add(initEmit)
//                regSeq.list.add(loop)
//                loop.body.statement = regBlock
//                parblock.list.add(regSeq)
//
//            }
//
//            // Erzeugen eines weiteren parallelen Statements für Termination handling
//            val controllLoop = esterel.createLoop
//            controllLoop.end1 = esterel.createEndLoop
//            val loopSeq = esterel.createSequence
//            controllLoop.body = esterel.createLoopBody => [
//                statement = loopSeq
//            ]
//            val controllIf = esterel.createIfTest
//            controllIf.expr = createExp(regSignalList)
//            controllIf.thenPart = esterel.createThenPart => [
//                statement = esterel.createExit => [
//                    trap = trapDecl
//                ]
//            ]
//            loopSeq.list.add(controllIf)
//            loopSeq.list.add(esterel.createPause)
//            parblock.list.add(controllLoop)
//
//            if (transitions.size > 0) {
//
//                val awaitBlock = esterel.createAwait
//                controllParBlock.list.add(awaitBlock)
//                val awaitBody = esterel.createAwaitCase
//                awaitBlock.body = awaitBody
//                var awaitCases = awaitBody.cases
//                awaitBody.end = "end"
//                for (transition : transitions) {
//                    var awaitCase = esterel.createAbortCaseSingle
//                    awaitCases.add(awaitCase)
//                    awaitCase.delay = esterel.createDelayExpr => [
//                        event = esterel.createDelayEvent => [
//                            if (transition.trigger != null) {
//                                tick = "tick"
//                            } else {
//                                expr
//                            }
//                        ]
//                        isImmediate = transition.immediate
//                    ]
//                    awaitCase.statement = esterel.createSequence => [
//                        for (effect : transition.effects) {
//                            list.add(transformEffect(effect as Assignment))
//                        }
//                        list.add(createControllEmit(stateSignalMap.get(transition.sourceState), "false"))
//                        list.add(createControllEmit(stateSignalMap.get(transition.targetState), "true"))
//                        if (!transition.sourceState.final && transition.targetState.final) {
//                            list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "true"))
//                        } else if (transition.sourceState.final && !transition.targetState.final) {
//                            list.add(createControllEmit(regionSignalMap.get(state.parentRegion), "false"))
//                        }
//                    ]
//                }
//            } else if (transitions.size == 0 && !state.final) {
//                seq.list.add(esterel.createHalt)
//                controllParBlock.list.add(esterel.createNothing)
//
//            } else {
//                seq.list.add(esterel.createNothing)
//                controllParBlock.list.add(esterel.createNothing)
//            }
//
//        }
//
//        // Help function
//        while (seq.list.length < 2) {
//            val sta = esterel.createNothing
//            seq.list.add(sta)
//        }
//        programCodeBlock
//
//    }
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

    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.BoolValue exp) {
        esterel.createConstantExpression => [
            value = Boolean.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.IntValue exp) {
        esterel.createConstantExpression => [
            value = Integer.toString(exp.value)
        ]
    }

    def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.FloatValue exp) {
        esterel.createConstantExpression => [
            value = Float.toString(exp.value)
        ]
    }

    def dispatch OperatorExpression transformExp(de.cau.cs.kieler.core.kexpressions.ValuedObjectReference exp) {
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

    def dispatch Expression transformTrigger(de.cau.cs.kieler.core.kexpressions.ValuedObjectReference exp) {
        return kExpression.createValuedObjectReference => [
            valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
        ]
    }

    def Expression createExpression(ISignal signal) {
        return kExpression.createValuedObjectReference => [
            valuedObject = signal
        ]
    }

}
