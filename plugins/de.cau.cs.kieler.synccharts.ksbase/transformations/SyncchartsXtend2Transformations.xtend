import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
import de.cau.cs.kieler.synccharts.Transition
import java.util.List
import de.cau.cs.kieler.synccharts.StateType
import de.cau.cs.kieler.synccharts.TransitionType
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.synccharts.Emission
import de.cau.cs.kieler.synccharts.Scope
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.Variable

class SyncchartsXtend2Transformations {
    
    /**
     * Adds a new state as a successor to the given state.
     * @param state the state to add a successor to
     */
    def addSuccessorState(State state) {
        val State newState = SyncchartsFactory::eINSTANCE.createState()
        val Transition newTrans = SyncchartsFactory::eINSTANCE.createTransition()
        newState.setId(state.id + "_State_" + (state.parentRegion.states.size + 1))
        newState.setLabel("")
        state.parentRegion.states.add(newState)
        //newState.parentRegion = state.parentRegion
        newTrans.setSourceState(state)
        newTrans.setTargetState(newState) 
    }
    
    /**
     * Adds new states as a successors to all given states.
     * @param states the states to add a successor to
     */
    def addSuccessorState(List<State> states) {
        for (State state: states) {
            addSuccessorState(state)
        }
    }
    
    /**
     * Adds a new state as a predecessor to the given state.
     * @param state the state to add a predecessor to
     */
    def addPredecessorState(State state) {
        val State newState = SyncchartsFactory::eINSTANCE.createState()
        val Transition newTrans = SyncchartsFactory::eINSTANCE.createTransition()
        newState.setId(state.id + "_State_" + (state.parentRegion.states.size + 1))
        newState.setLabel("")
        state.parentRegion.states.add(newState)
        newState.parentRegion = state.parentRegion
        newTrans.setSourceState(newState)
        newTrans.setTargetState(state)
        
    }
    
    /**
     * Adds a choice to the given state by adding a conditional with two targets.
     * @param source the state after which the choice is added
     */
    def addChoice(State source) {
        val choice = SyncchartsFactory::eINSTANCE.createState()
        val s0 = SyncchartsFactory::eINSTANCE.createState()
        val s1 = SyncchartsFactory::eINSTANCE.createState()
        val Transition t0 = SyncchartsFactory::eINSTANCE.createTransition()
        val Transition t1 = SyncchartsFactory::eINSTANCE.createTransition()
        val Transition tc = SyncchartsFactory::eINSTANCE.createTransition()
        
        choice.setType(StateType::CONDITIONAL)
        source.parentRegion.states.add(choice)
        choice.parentRegion = source.parentRegion
        choice.setId(source.id + "_State_" + (source.parentRegion.states.size + 1))
        choice.setLabel("")
        tc.setSourceState(source)
        tc.setTargetState(choice)
        
        source.parentRegion.states.add(s0)
        s0.parentRegion = source.parentRegion
        s0.setId(source.id + "_State_" + (source.parentRegion.states.size + 1))
        s0.setLabel("")
        t0.setSourceState(choice)
        t0.setTargetState(s0) 
        
        source.parentRegion.states.add(s1)
        s1.parentRegion = source.parentRegion
        s1.setId(source.id + "_State_" + (source.parentRegion.states.size + 1))
        s1.setLabel("")
        t1.setSourceState(choice)
        t1.setTargetState(s1)
    }
    
    /**
     * Flips source and target of the given transition.
     * @param t the transition to flip
     */
    def flipTransition(Transition t) {
        val State source = t.sourceState
        val State target = t.targetState
        t.setSourceState(target)
        t.setTargetState(source)
        
    }
    
    /**
     * Converts transition to strong abort.
     * @param t transition to convert
     */
    def setStrong(Transition t) {
        t.setType(TransitionType::STRONGABORT)
    }
    
    /**
     * Converts transition to weak abort.
     * @param t transition to convert
     */
    def setWeak(Transition t) {
        t.setType(TransitionType::WEAKABORT)
    }
    
    
    /**
     * Converts transition to normal termination.
     * @param t transition to convert
     */
    def setNormalTermination(Transition t) {
        t.setType(TransitionType::NORMALTERMINATION)
    }
    
    /**
     * Inserts a state in a transition.
     * @param t the transition to insert in
     */
    def insertState(Transition t) {
        val State newState = SyncchartsFactory::eINSTANCE.createState()
        val Transition newTrans = SyncchartsFactory::eINSTANCE.createTransition()
        val State oldTarget = t.targetState
        newState.setId(t.sourceState.id + "_State_" + (t.sourceState.parentRegion.states.size + 1))
        newState.setLabel("")
        t.sourceState.parentRegion.states.add(newState)
        newState.parentRegion = t.sourceState.parentRegion
        t.setTargetState(newState)
        newTrans.setTargetState(oldTarget)
        newTrans.setSourceState(newState)
    }
    
    /**
     * Connects two states.
     * @param source the state designated as source
     * @param target the state designated as target
     */
    def connectStates(State source, State target) {
        val Transition newTrans = SyncchartsFactory::eINSTANCE.createTransition()
        newTrans.setSourceState(source)
        newTrans.setTargetState(target)
    }
    
    /**
     * Create a self loop of one state.
     * @param state the state to add a self loop to
     */
    def addSelfLoop(State state) {
        val Transition newTrans = SyncchartsFactory::eINSTANCE.createTransition()
        newTrans.setSourceState(state)
        newTrans.setTargetState(state)
    }
    
    /**
     * Reroutes the target of the given transition to the given state.
     * @param t the transition to reroute
     * @param target the new target
     */
    def rerouteTransitionTarget(Transition t, State target) {
        t.setTargetState(target)
    }
    
     /**
     * Reroutes the source of the given transition to the given state.
     * @param t the transition to reroute
     * @param source the new source
     */
    def rerouteTransitionSource(Transition t, State source) {
        t.setSourceState(source)
    }
    
    /**
     * Adds a parallel region to the given state.
     * @param parentState the state to add a region to
     */
    def upgradeState(State parentState) {
        val Region region = SyncchartsFactory::eINSTANCE.createRegion()
        val State state = SyncchartsFactory::eINSTANCE.createState()
        region.setId("Region_" + parentState.regions.size + 1)
        region.setLabel("")
        state.setId("State_1")
        state.setLabel("")
        
        parentState.regions.add(region)
        region.parentState = parentState
        
        region.states.add(state)
        state.parentRegion = region
        
        state.setIsInitial(true)
    }
    
    /**
     * Removes all regions and signals from the given state.
     * @param parentState state to downgrade
     */
    def downgradeState(State parentState) {
        parentState.regions.clear
        parentState.signals.clear
    }
    
    def boolean isRegionState(State state) {
        return !(state.regions.empty)
    }
    
    def boolean isNoRootState(State state) {
        return (state.parentRegion.parentState != null)
    }
    
    def boolean isNoRootState(List<State> states) {
        var boolean isNoRoot = true
        for (State s: states) {
            if (s.parentRegion.parentState == null) {
                isNoRoot = false
            }
        }
        return isNoRoot
    }
    
    def boolean statesOnSameHierarchy(State s0, State s1) {
        return s0.parentRegion == s1.parentRegion
    }
    
    def boolean isNoRootRegion(Region region) {
        return (region.parentState != null)
    }
    
    def boolean isNoRootRegion(List<Region> regions) {
        var boolean isNoRoot = true
        for (Region r: regions) {
            if (r.parentState == null) {
                isNoRoot = false
            }
        }
        return isNoRoot
    }
    
    def boolean hasNoRootState(State s, Transition t) {
        return s.parentRegion.parentState != null
    }
    
    def boolean isSimpleState(State s) {
        return (s.regions.empty && s.entryActions.empty && s.innerActions.empty
            && s.exitActions.empty && s.suspensionTrigger == null
        )
    }
    
    def boolean isNotASimpleState(State s) {
        return !s.isSimpleState()
    }
    
    def boolean isSourceASimpleState(Transition t) {
        return t.sourceState.isSimpleState()
    }
    
    def boolean isSourceNotASimpleState(Transition t) {
        return !t.sourceState.isSimpleState()
    }
    
    def boolean canTurnIntoNormalTermination(Transition t) {
        return t.isSourceNotASimpleState() && t.type != TransitionType::NORMALTERMINATION
    }
    
    def boolean canTurnIntoStrongAbort(Transition t) {
        return t.isSourceNotASimpleState() && t.type != TransitionType::STRONGABORT
    }
    
    def boolean canTurnIntoWeakAbort(Transition t) {
        return t.type != TransitionType::WEAKABORT
    }
    
    def toggleInitial(State s) {
        s.setIsInitial(!s.isInitial)
    }
    
    def toggleFinal(State s) {
        s.setIsFinal(!s.isFinal)
    }
    
    def toggleStateInitialFinal(State s) {
        if (s.isInitial && s.isFinal) {
            s.setIsInitial(false)
            s.setIsFinal(false)
        } else if(s.isInitial) {
            s.setIsFinal(true)
        } else if(s.isFinal) {
            s.setIsFinal(false)
            s.setIsInitial(true)
        } else {
            s.setIsFinal(true)
            s.setIsInitial(false)
        }
    }
    
    def encapsulateRegions(State parentState) {
        val Region region = SyncchartsFactory::eINSTANCE.createRegion()
        val State state = SyncchartsFactory::eINSTANCE.createState()
        region.setId("Region_" + parentState.regions.size + 1)
        region.setLabel("")
        state.setId("State_1")
        state.setLabel("")
        if (!parentState.regions.empty) {
            state.regions.addAll(parentState.regions)
            parentState.regions.clear
            parentState.regions.add(region)
            region.parentState = parentState
            state.parentRegion = region
            region.states.add(state)
        }
    }
    
    def flattenState(State state) {
        val parentRegion = state.parentRegion
        val parentState = parentRegion.parentState
        val stateSize = parentRegion.states.size
        val incoming = state.incomingTransitions
        val outgoing = state.outgoingTransitions
        for (Transition t: incoming) {
            t.setSourceState(state)
        }
        for (Transition t: outgoing) {
            t.setTargetState(state)
        }
        parentState.regions.addAll(state.regions)
        parentRegion.states.remove(state)
        if (stateSize <= 1) {
            parentState.regions.remove(parentRegion)
        }
        
    }
    
    def encapsulateRegion(Region target) {
        val Region region = SyncchartsFactory::eINSTANCE.createRegion()
        val State state = SyncchartsFactory::eINSTANCE.createState()
        region.setId("Region_" + target.parentState.regions.size + 1)
        region.setLabel("")
        state.setId("State_1")
        state.setLabel("")
        
        if (target.parentState != null) {
            state.setIsInitial(true)
            target.parentState.regions.add(region)
            region.parentState = target.parentState
            region.states.add(state)
            state.parentRegion = region
            state.regions.add(target)
            target.parentState = state
        }
    }
    
    def encapsulateRegion(List<Region> targets) {
        val Region region = SyncchartsFactory::eINSTANCE.createRegion()
        val State state = SyncchartsFactory::eINSTANCE.createState()
        val parentState = targets.get(0).parentState
        region.setId("Region_" + parentState.regions.size + 1)
        region.setLabel("")
        state.setId("State_1")
        state.setLabel("")
    
        state.setIsInitial(true)
        parentState.regions.add(region)
        region.parentState = parentState
        region.states.add(state)
        state.parentRegion = region
        state.regions.addAll(targets)
        for (Region r : targets) {
            r.parentState = state
        }
    }
    
    def flattenRegion(Region target) {
        val parentState = target.parentState
        val parentRegion = parentState.parentRegion
        parentRegion.states.addAll(target.states)
        for (State s: target.states) {
            s.parentRegion = parentRegion
        }
        parentState.regions.remove(target)
        if (parentState.regions.empty) {
            parentRegion.states.remove(parentState)
        }
    }
    
    def flattenRegion(List<Region> target) {
        val parentState = target.get(0).parentState
        val parentRegion = parentState.parentRegion
        
        for (Region r: target) {
            parentRegion.states.addAll(r.states)
            for (State s: r.states) {
                s.parentRegion = parentRegion
            }
        }
        parentState.regions.removeAll(target)
        if (parentState.regions.empty) {
            parentRegion.states.remove(parentState)
        }
    }
    
    /////////////////////////
    //     Templates      ///
    ////////////////////////
    
    def boolean isRootRegion(Region region) {
        return region.parentState == null
    }

    def createDefault(Region rootRegion) {
        val Region region = SyncchartsFactory::eINSTANCE.createRegion()
        val State state = SyncchartsFactory::eINSTANCE.createState()
        val State innerState = SyncchartsFactory::eINSTANCE.createState()
        region.setId("Region_1")
        region.setLabel("")
        state.setId("State_" + rootRegion.states.size + 1)
        state.setLabel("")
        innerState.setId("State_1")
        innerState.setLabel("")
        state.regions.add(region)
        region.parentState = state
        innerState.setIsInitial(true)
        region.states.add(innerState)
        innerState.parentRegion = region
    }
    
    def addState(Region target) {
        val State state = SyncchartsFactory::eINSTANCE.createState()
        state.setId("State_" + target.states.size + 1)
        state.setLabel("")
        if (target.states.empty) {
            state.setIsInitial(true)
        }
        target.states.add(state)
        state.parentRegion = target
    }
    
    def addABRO(Region rootRegion) {
        val Transition waitABToFinal = SyncchartsFactory::eINSTANCE.createTransition()
        val Transition reset = SyncchartsFactory::eINSTANCE.createTransition()
        val State ABOFinal = SyncchartsFactory::eINSTANCE.createState()
        val Transition wATrans = SyncchartsFactory::eINSTANCE.createTransition()
        val Transition wBTrans = SyncchartsFactory::eINSTANCE.createTransition()
        val State wAInitial = SyncchartsFactory::eINSTANCE.createState()
        val State wAFinal = SyncchartsFactory::eINSTANCE.createState()
        val State wBInitial = SyncchartsFactory::eINSTANCE.createState()
        val State wBFinal = SyncchartsFactory::eINSTANCE.createState()
        val Region wA = SyncchartsFactory::eINSTANCE.createRegion()
        val Region wB = SyncchartsFactory::eINSTANCE.createRegion()
        val State waitAB = SyncchartsFactory::eINSTANCE.createState()
        val Region ABORegion = SyncchartsFactory::eINSTANCE.createRegion()
        val State ABO = SyncchartsFactory::eINSTANCE.createState()
        val Region innerRootRegion = SyncchartsFactory::eINSTANCE.createRegion()
        val Signal sigA = KExpressionsFactory::eINSTANCE.createSignal()
        val Signal sigB = KExpressionsFactory::eINSTANCE.createSignal()
        val Signal sigR = KExpressionsFactory::eINSTANCE.createSignal()
        val Signal sigO = KExpressionsFactory::eINSTANCE.createSignal()
        val ValuedObjectReference sigAExpr = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
        val ValuedObjectReference sigBExpr = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
        val Emission sigOExpr = SyncchartsFactory::eINSTANCE.createEmission()
        val ValuedObjectReference sigRExpr = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
        val State root = SyncchartsFactory::eINSTANCE.createState()
        
        root.setLabel("ABRO")
        root.setId("ABRO")
        sigA.setName("A")
        sigA.setIsInput(true)
        sigAExpr.setValuedObject(sigA)
        
        sigB.setName("B")
        sigB.setIsInput(true)
        sigBExpr.setValuedObject(sigB)
        
        sigR.setName("R")
        sigR.setIsInput(true)
        sigRExpr.setValuedObject(sigR)

        sigO.setName("O")
        sigO.setIsOutput(true)
        sigOExpr.setSignal(sigO)
        
        root.signals.add(sigA)
        root.signals.add(sigB)
        root.signals.add(sigR)
        root.signals.add(sigO)
        
        ABO.setLabel("ABO")
        ABO.setId("ABO")
        ABO.setIsInitial(true)
        
        waitAB.setLabel("WaitAB")
        waitAB.setId("WaitAB")
        waitAB.setIsInitial(true)
        
        wAInitial.setLabel("wA")
        wAInitial.setId("wA")
        wAInitial.setIsInitial(true)
        wA.setId("wARegion")
        wA.states.add(wAInitial)
        wAInitial.parentRegion = wA
        
        wAFinal.setLabel("dA")
        wAFinal.setId("dA")
        wAFinal.setIsFinal(true)
        wA.states.add(wAFinal)
        wAFinal.parentRegion = wA
        wATrans.setSourceState(wAInitial)
        wATrans.setTargetState(wAFinal)
        wATrans.label = "A"
        
        waitAB.regions.add(wA)
        wA.parentState = waitAB
        
        wBInitial.setLabel("wB")
        wBInitial.setId("wB")
        wBInitial.setIsInitial(true)
        wB.setId("wBRegion")
        wB.states.add(wBInitial)
        wBInitial.parentRegion = wB
        
        wBFinal.setLabel("dB")
        wBFinal.setId("dB")
        wBFinal.setIsFinal(true)
        wB.states.add(wBFinal)
        wBFinal.parentRegion = wB
        wBTrans.setSourceState(wBInitial)
        wBTrans.setTargetState(wBFinal)
        wBTrans.label = "B"
        waitAB.regions.add(wB)
        wB.parentState = waitAB
        
        ABOFinal.setLabel("done")
        ABOFinal.setId("done")
        waitABToFinal.setSourceState(waitAB)
        waitABToFinal.setTargetState(ABOFinal)
        waitABToFinal.setType(TransitionType::NORMALTERMINATION)
        
        waitABToFinal.label = "/O"
        
        ABORegion.states.add(waitAB)
        waitAB.parentRegion = ABORegion
        ABORegion.setId("ABORegion")
        
        ABORegion.states.add(ABOFinal)
        ABOFinal.parentRegion = ABORegion
        ABO.regions.add(ABORegion)
        
        reset.setSourceState(ABO)
        reset.setTargetState(ABO)
        reset.setType(TransitionType::STRONGABORT)
        reset.label = "R"
        
        innerRootRegion.states.add(ABO)
        ABO.parentRegion = innerRootRegion
        innerRootRegion.setId("innerRootRegion")
        
        root.regions.add(innerRootRegion)
        innerRootRegion.parentState = root
        
        rootRegion.states.add(root)
        root.parentRegion = rootRegion
        
     }
    
    /*
    def boolean scopeHasSignalsVariables(Scope scope) {
        return (!scope.signals.empty || !scope.variables.empty)
    }

    def boolean hasSignalsVariables(Region region) {
        return scopeHasSignalsVariables(region)
    }
    
    def boolean hasSignalsVariables(State state) {
        return scopeHasSignalsVariables(state)
    }

    def List<String> unionOfSignalsAndVariables(Scope scope) {
        val List<String> list = newArrayList()
        for(Signal s: scope.signals) {
            list.add(s.name)
        }
        for(Variable v: scope.variables) {
            list.add(v.name)
        }
        return list
    }
    
    def renameSignalVariable(State scope) {
        scopeRenameSignalVariable(scope)
    }
    
    def renameSignalVariable(Region scope) {
        scopeRenameSignalVariable(scope)
    }
    
    def scopeRenameSignalVariable(Scope scope) {
        val choice = unionOfSignalsAndVariables(scope)
        val oldName = (String) getListSelectionFromUserIntern("Select signal or variable to rename", choice)
        if (oldName != null) {
            scopeRenameSignalVariableStep2(scope, oldName)
        }
    }
    
    def renameSignal(Signal signal) {
        val newName = getStringFromUserIntern("Enter new name for Signal " + signal.name + "!", "newName")
        if (newName != null) {
            signal.setName(newName)
        }
    }
    
    def scopeRenameSignalVariableStep2(Scope scope, String oldName) {
        val newName = getStringFromUserIntern("Enter new name for Signal or Variable " + oldName + "!", "newName")
        if (newName != null) {
            scopeRenameSignalVariableStep3(scope, oldName, newName)
        }
    }
    
    def scopeRenameSignalVariableStep3(Scope scope, String oldName, String newName) {
        val variable = findVariable(scope, oldName)
        val sig = findSignal(scope, oldName)
        if (variable != null) {
            renameVariable(scope, variable, newName)
        }
        if (sig != null) {
            renameSignal(scope, sig, newName)
        }
        
    }
    
    def renameSignal(Scope scope, Signal signal, String newName ) {
       signal.setName(newName) 
    }
    
    def renameVariable(Scope scope, Variable variable, String newName) {
        variable.setName(newName)
    }
    
    def Variable findVariable(Scope scope, String name) {
        for (Variable variable: scope.variables) {
            if (variable.name.matches(name)) {
                return variable
            }
        }
    }
    
    def Signal findSignal(Scope scope, String name) {
        for(Signal sig: scope.signals) {
            if (sig.name.matches(name)) {
                return sig
            }
        }
    }
    */
}