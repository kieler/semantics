/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.Effect
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCChartsExtension { 

    @Inject
    extension KExpressionsExtension

    // This prefix is used for namings of all generated signals, states and regions
    static final String GENERATED_PREFIX = "_"
    
//    public val Injector i = ActionsStandaloneSetup::doSetup();
//    public val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
//    public val ISerializer serializer = i.getInstance(typeof(ISerializer));
    

    //-------------------------------------------------------------------------
    //--             B A S I C   C R E A T I O N   M E T H O D S             --
    //-------------------------------------------------------------------------
    
    // Create an immutable list copy
    def ImmutableList<Object> immutableCopy(Iterable<Object> object) {
        ImmutableList::copyOf(object)
    }
    
    //====== GENERAL MODEL ELEMENTS =====
    
    // Get the single normal termination Transition. Return null if there is 
    // no outgoing normal termination Transition.
    def Transition getNormalTerminationTransitions(State state) {
        val allNormalTerminationTransitions = state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION);
        if (allNormalTerminationTransitions.size == 0) {
            return null;
        }
        allNormalTerminationTransitions.head;
    }
    
    // Return the list of all contained States.
    def List<State> getAllContainedStates(Region region) {
        region.eAllContents().toIterable().filter(typeof(State)).toList()
    }
    
    // Return the list of all contained Transitions.
    def List<Transition> getAllContainedTransitions(Region region) {
        region.eAllContents().toIterable().filter(typeof(Transition)).toList()
    }

    // Return the list of contained Emissions.
    def List<Emission> getAllContainedEmissions(Action action) {
        action.eAllContents().toIterable().
                           filter(typeof(Emission)).toList();
    }
    
    // Return the list of pure signals of a state.
    def List<ValuedObject> getPureSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal && e.type == ValueType::PURE].toList
    }

    // Return the list of valued signals of a state.
    def List<ValuedObject> getValuedSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal && e.type != ValueType::PURE].toList
    }
    
    // Return the list of all signals of a state.
    def List<ValuedObject> getSignals(State state) {
        state.valuedObjects.filter[e|e.isSignal].toList
    }
    
    // Return true if the valued Object is a pure signal
    def boolean isPureSignal(ValuedObject valuedObject) {
        valuedObject.isSignal && valuedObject.type == ValueType::PURE
    }
    
    // Return the root region.
    def Region getRootRegion(Region region) {
        // Recursively find the root region 
        if (region.parentState == null) {
             return region;
        }   
        region.parentState.parentRegion.rootRegion;
    }
    
    // Return the root region.
    def Region getRootRegion(State state) {
        state.parentRegion.rootRegion;
    }
    
    // Return the root state.
    def State getRootState(Region region) {
        // There should exactly be one state in the root region
        region.rootRegion.states.get(0)
    }
    
    // Return the root state.
    def State getRootState(State state) {
        state.parentRegion.rootState;   
    }
    
    //========== STATES ===========
    
    def State createState(String id) {
        val state  = SCChartsFactory::eINSTANCE.createState();
        state.setId(id)
        state.setLabel("")
        state
    }
    
    def State createState(Region region, String id) {
        val state = createState(id)
        region.states.add(state)
        state
    }
    
    def State setIsInitial(State state) {
        state.setIsInitial(true)
        state
    }

    def State setIsNotInitial(State state) {
        state.setIsInitial(false)
        state
    }

    def State setIsFinal(State state) {
        state.setIsFinal(true)
        state
    }

    def State createInitialState(String id) {
        createState(id).setIsInitial
    }
    
    def State createFinalState(String id) {
        createState(id).setIsFinal
    }
    
    def State createInitialState(Region region, String id) {
        region.createState(id).setIsInitial
    }
    
    def State createFinalState(Region region, String id) {
        region.createState(id).setIsFinal
    }
    
    def State setLabel2(State state, String label) {
        state.setLabel(label)
        state
    }

    def State setDefaultLabel(State state) {
        state.setLabel2(state.id)
    }

    def State setTypeConnector(State state) {
        state.setType(StateType::CONNECTOR);
        state
    }

    def State setTypeNormal(State state) {
        state.setType(StateType::NORMAL);
        state
    }

    def State setTypeReference(State state) {
        state.setType(StateType::REFERENCE);
        state
    }

    def State setTypeTextual(State state) {
        state.setType(StateType::TEXTUAL);
        state
    }

    //========== REGIONS ===========
    
    def Region createRegion(String id) {
        val region  = SCChartsFactory::eINSTANCE.createRegion();
        region.setId(id)
        region.setLabel("")
        region
    }
    
    def Region createRegion(State state, String id) {
        val region = createRegion(id)
        state.regions.add(region)
        region
    }
    
    def Region setLabel2(Region region, String label) {
        region.setLabel(label)
        region
    }
    
    def boolean isHierarchical(State state) {
        return (state.regions != null && state.regions.size != 0 && state.eAllContents.filter(typeof(State)).size > 0)
    }

    //========== TRANSITIONS ===========
    
    def Transition createTransition() {
        val transition = SCChartsFactory::eINSTANCE.createTransition()
        transition.setPriority2(1)
    }

    def Transition createImmediateTransition() {
        createTransition.setIsImmediate
    }

    def Transition createTransitionTo(State sourceState, State targetState) {
        val transition = createTransition()
        transition.setTargetState(targetState)
        sourceState.outgoingTransitions.add(transition)
        transition.trimPriorities
    }
    
    def Transition setTargetState2(Transition transition, State targetState) {
        transition.setTargetState(targetState)
        transition
    }

    def Transition setSourceState(Transition transition, State sourceState) {
        sourceState.outgoingTransitions.add(transition)
        transition.trimPriorities
    }
    
    def Transition createImmediateTransitionTo(State sourceState, State targetState) {
        sourceState.createTransitionTo(targetState).setIsImmediate
    }
    
    def Transition setTrigger2(Transition transition, Expression expression) {
        transition.setTrigger(expression)
        transition
    }

    def Transition addEffect(Transition transition, Effect effect) {
        transition.effects.add(effect)
        transition
    }
    
    def Transition clearEffects(Transition transition) {
        transition.effects.clear
        transition
    }
    
    def Transition setPriority2(Transition transition, int priority) {
        transition.setPriority(priority)
        transition
    }

    def Transition setLowestPriority(Transition transition) {
        val maxPriority = transition.sourceState.outgoingTransitions.length 
        transition.setPriority2(maxPriority).trimPriorities
    }

    def Transition setHighestPriority(Transition transition) {
        transition.setPriority2(0).trimPriorities
    }
    
    def Region fixAllPriorities(Region region) {
        for (state : region.allContainedStates) {
            var prio = 1
            for (transition : state.outgoingTransitions) {
                transition.setPriority(prio)
                prio = prio + 1
            }
        }
        region
    }
    
    def Region fixAllTextualOrdersByPriorities(Region region) {
        for (state : region.allContainedStates) {
            val transitions = state.outgoingTransitions.sortBy[priority].toList.immutableCopy;
            for (transition : transitions) {
                state.outgoingTransitions.remove(transition)
                state.outgoingTransitions.add(transition)
                transition.setPriority(0)
            }
        }
        region
    }
    
    
    def Transition trimPriorities(Transition transition) {
        var prio = 1
        val transitions = transition.sourceState.outgoingTransitions.toList.sortBy[priority]
        for (outgoingTransition : transitions) {
            outgoingTransition.setPriority(prio)
            prio = prio + 1
        }
        transition
    }

    def Transition setIsImmediate(Transition transition) {
        transition.setIsImmediate(true)
        transition
    }

    def Transition setIsNotImmediate(Transition transition) {
        transition.setIsImmediate(false)
        transition
    }

    //========== STATE ACTIONS ===========

    // Apply attributes from one local action to another
    def LocalAction applyAttributes(LocalAction localAction, LocalAction locationActionWithAttributes) {
        localAction.setIsImmediate(locationActionWithAttributes.isImmediate)
        localAction.setDelay(locationActionWithAttributes.delay)
        localAction.setLabel(locationActionWithAttributes.label)
        localAction.setTrigger(locationActionWithAttributes.trigger)
        localAction.effects.clear
        for (effect : locationActionWithAttributes.effects) {
            localAction.addEffect(effect.copy)
        }
        localAction
    }

    // Create a during action for a state.
    def DuringAction createDuringAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createDuringAction
        state.localActions.add(action);
        action
    }
    // Create an immediate during action for a state.
    def DuringAction createImmediateDuringAction(State state) {
        val action = state.createDuringAction
        action.setIsImmediate(true);
        action
    }

    // Create a entry action for a state.
    def EntryAction createEntryAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createEntryAction
        state.localActions.add(action);
        action
    }
    // Create an immediate entry action for a state.
    def EntryAction createImmediateEntryAction(State state) {
        val action = state.createEntryAction
        action.setIsImmediate(true);
        action
    }

    // Create a exit action for a state.
    def ExitAction createExitAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createExitAction
        state.localActions.add(action);
        action
    }
    // Create an immediate exit action for a state.
    def ExitAction createImmediateExitAction(State state) {
        val action = state.createExitAction
        action.setIsImmediate(true);
        action
    }

    // Create a suspend action for a state.
    def SuspendAction createSuspendAction(State state) {
        val action = SCChartsFactory::eINSTANCE.createSuspendAction
        state.localActions.add(action);
        action
    }

    // Create an immediate suspend action for a state.
    def SuspendAction createImmediateSuspendAction(State state) {
        val action = state.createSuspendAction
        action.setIsImmediate(true);
        action
    }
    
    // Return all EntryAction actions of a state.
    def List<EntryAction> getEntryActions(State state) {
        state.localActions.filter(typeof(EntryAction)).toList
    }

    // Return all DuringAction actions of a state.
    def List<DuringAction> getDuringActions(State state) {
        state.localActions.filter(typeof(DuringAction)).toList
    }

    // Return all ExitAction actions of a state.
    def List<ExitAction> getExitActions(State state) {
        state.localActions.filter(typeof(ExitAction)).toList
    }

    // Return all SuspendAction actions of a state.
    def List<SuspendAction> getSuspendActions(State state) {
        state.localActions.filter(typeof(SuspendAction)).toList
    }

    //========== ASSIGNMENTS ============
    
    // Create an Assignment.
    def Assignment assign(ValuedObject valuedObject) {
        val assignment = SCChartsFactory::eINSTANCE.createAssignment()
        assignment.setValuedObject(valuedObject)
        assignment
    }

    // Create an Assignment and add it sequentially to an action's effects list.
    def Assignment createAssignment(Action action, ValuedObject valuedObject) {
        val assignment = valuedObject.assign
        action.addAssignment(assignment)
        assignment
    }
    
    // Create an Assignment and add it sequentially to an action's effects list.
    def Assignment addAssignment(Action action, Assignment assignment) {
        // An Assignment is a specialized Effect with a new value and a ValuedObject
        action.addEffect(assignment)
        assignment
    }

    // Create a valued Assignment. 
    def Assignment assign(ValuedObject valuedObject, Expression newValue) {
        val assignment = valuedObject.assign
        assignment.setValuedObject(valuedObject)
        assignment.setExpression(newValue);
        assignment
    }

    // Create a valued relative Assignment. 
    def Assignment assignRelative(ValuedObject valuedObject, Expression newValue) {
        valuedObject.assign(valuedObject.reference.or(newValue))
    }

    // Create a valued Assignment and add it sequentially to an action's effects list. 
    def Assignment createAssignment(Action action, ValuedObject valuedObject, Expression newValue) {
        val assignment = valuedObject.assign(newValue)
        action.addAssignment(assignment)
        assignment
    }
    
    //=========== EMISSIONS =============

    // Create an Emission.
    def Emission emit(ValuedObject valuedObject) {
        val emission = SCChartsFactory::eINSTANCE.createEmission()
        emission.setValuedObject(valuedObject)
        emission
    }
    
    // Create an Emission and add it sequentially to an action's effects list.
    def Emission createEmission(Action action, ValuedObject valuedObject) {
        val emission = valuedObject.emit
        action.addEmission(emission)
        emission
    }
    
    // Create an Emission and add it sequentially to an action's effects list.
    def Emission addEmission(Action action, Emission emission) {
        // An Emission is a specialized Effect with a new value and a ValuedObject
        action.addEffect(emission)
        emission
    }

    // Create an Effect (supertype of Emission) and add it sequentially to an action's effects list.
    def Effect addEffect(Action action, Effect effect) {
        action.effects.add(effect)
        effect
    }

    // Create a valued Emission. 
    def Emission emit(ValuedObject valuedObject, Expression newValue) {
        val emission = valuedObject.emit
        emission.setValuedObject(valuedObject)
        emission.setNewValue(newValue);
        emission
    }

    // Create a valued Emission and add it sequentially to an action's effects list. 
    def Emission createEmission(Action action, ValuedObject valuedObject, Expression newValue) {
        val emission = valuedObject.emit(newValue)
        action.addEmission(emission)
        emission
    }

    //-------------------------------------------------------------------------
    //--                     K E X P R E S S I O N S                         --
    //-------------------------------------------------------------------------

    //==  EXPRESSION MODIFICATIONS  ==

    def void replace(Action action, Expression searchExpression, Expression replaceExpression) {
        action.setTrigger(action.trigger.replace(searchExpression, replaceExpression))
    }

    //=========  VALUED OBJECT  =========

    // Creates a new ValuedObject in a scope.
    def ValuedObject createValuedObject(Scope scope, String valuedObjectName) {
         val valuedObject = createValuedObject(valuedObjectName)
         scope.valuedObjects.add(valuedObject)
         valuedObject
    }

    //===========  VARIABLES  ===========

    // Creates a new variable ValuedObject in a Scope.
   def ValuedObject createVariable(Scope scope, String variableName) {
         val valuedObject = variableName.createVariable
         scope.valuedObjects.add(valuedObject)
         valuedObject;
    }

    // Creates a new Int variable ValuedObject in a Scope.
    def ValuedObject createIntVariable(Scope scope, String variableName) {
         scope.createIntVariable(variableName)
    }
    
    // Creates a new Bool variable ValuedObject in a Scope.
    def ValuedObject createBoolVariable(Scope scope, String variableName) {
        scope.createBoolVariable(variableName)
    }

    // Creates a new Double variable ValuedObject in a Scope.
    def ValuedObject createDoubleVariable(Scope scope, String variableName) {
        scope.createDoubleVariable(variableName)
    }

    // Creates a new Float variable ValuedObject in a Scope.
    def ValuedObject createFloatVariable(Scope scope, String variableName) {
         scope.createFloatVariable(variableName)
    }

    //============  SIGNALS  ============

    // Creates a new variable ValuedObject in a Scope.
   def ValuedObject createSignal(Scope scope, String variableName) {
         val valuedObject = variableName.createSignal
         scope.valuedObjects.add(valuedObject)
         valuedObject;
    }

    // Creates a new pure signal ValuedObject in a Scope.
    def ValuedObject createPureSignal(Scope scope, String variableName) {
         scope.createPureSignal(variableName)
    }

    // Creates a new Int signal ValuedObject in a Scope.
    def ValuedObject createIntSignal(Scope scope, String variableName) {
        scope.createIntSignal(variableName)
    }

    // Creates a new Bool signal ValuedObject in a Scope.
    def ValuedObject createBoolSignal(Scope scope, String variableName) {
         scope.createBoolSignal(variableName)
    }

    // Creates a new Double signal ValuedObject in a Scope.
    def ValuedObject createDoubleSignal(Scope scope, String variableName) {
         scope.createDoubleSignal(variableName)
    }

    // Creates a new Float signal ValuedObject in a Scope.
    def ValuedObject createFloatSignal(Scope scope, String variableName) {
         scope.createFloatSignal(variableName)
    }


    //-------------------------------------------------------------------------
    //--                           N A M I N G S                             --
    //-------------------------------------------------------------------------

    // Prefixes a name with the hash code of an eObject
    def int id(EObject eObject) {
        eObject.hashCode
    }

    // Prefixes a name with the hash code of an eObject
    def String id(EObject eObject, String string) {
        string + eObject.id  
    }
    
    // Prefixes a name with the generated prefix string
    def String id(String string) {
        GENERATED_PREFIX + string;
    }
    
    // For C variables it is necessary to remove special characters, this may lead
    // to name clashes in unlikely cases. 
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
               .replace("#","").replace("$","").replace("?","")
               .replace("!","").replace("%","").replace("&","")
               .replace("[","").replace("]","").replace("<","")
               .replace(">","").replace(".","").replace(",","")
               .replace(":","").replace(";","").replace("=","");
    }
    
    // This helper method returns the hierarchical name of a state considering all hierarchical
    // higher states. A string is formed by the traversed state IDs.
    def String getHierarchicalName(State state, String StartSymbol) {
        if (state.parentRegion != null) {
            if (state.parentRegion.parentState != null) {
                var higherHierarchyReturnedName = state.parentRegion.parentState.getHierarchicalName(StartSymbol);
                var regionId = state.parentRegion.id.removeSpecialCharacters;
                var stateId = state.id.removeSpecialCharacters;
                // Region IDs can be empty, state IDs normally aren't but the code generation handles 
                // also this case. 
                if (stateId.nullOrEmpty) {
                    stateId = state.id
                }
                if (regionId.nullOrEmpty) {
                    regionId = state.parentRegion.id
                }
                if (!higherHierarchyReturnedName.nullOrEmpty) {
                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
                }
                if (state.parentRegion.parentState.regions.size > 1) {
                    return higherHierarchyReturnedName 
                           + regionId  + "_" +  stateId;
                }
                else {
                    // this is the simplified case, where there is just one region and we can
                    // omit the region id
                    return higherHierarchyReturnedName  
                           + stateId;
                }
            }
        }
        return StartSymbol + "_";
    }

    //-------------------------------------------------------------------------
    //--             H O T F I X   F O R   S C C H A R T S                   --
    //-------------------------------------------------------------------------
    // Because the SCCharts KExpressions Parser has a problem with
    // AND / OR lists of more than two elements the following fixes
    // an OperatorExpression of such kind.
    // Test 141
    def OperatorExpression fixForOperatorExpressionLists(OperatorExpression operatorExpression) {
        if (operatorExpression == null || operatorExpression.subExpressions.nullOrEmpty || operatorExpression.subExpressions.size <= 2) {
            // In this case we do not need the fix
            return operatorExpression;
        }
        // Here we apply the fix recursively
        val operatorExpressionCopy = operatorExpression.copy;
        val newOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
        newOperatorExpression.setOperator(operatorExpression.operator);
        newOperatorExpression.subExpressions.add(operatorExpression.subExpressions.head);
        // Call recursively without the first element
        operatorExpressionCopy.subExpressions.remove(0);
        newOperatorExpression.subExpressions.add(operatorExpressionCopy.fixForOperatorExpressionLists);
        return newOperatorExpression;
    }
   
   // -------------------------------------------------------------------------   
      
}
