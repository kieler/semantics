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
 package de.cau.cs.kieler.sccharts.scg

import com.google.common.collect.ImmutableList
//import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.Effect
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Assignment
import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Conditional
import org.eclipse.xtext.serializer.ISerializer import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.scg.ControlFlow

/** 
 * SCCharts CoreTransformation Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Transformation { 

    //@Inject
    //extension Extension
    
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    // This prefix is used for namings of all generated signals, states and regions
    static final String GENERATED_PREFIX = "_"
    
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
    def de.cau.cs.kieler.sccharts.Assignment assign(ValuedObject valuedObject) {
        val assignment = SCChartsFactory::eINSTANCE.createAssignment()
        assignment.setValuedObject(valuedObject)
        assignment
    }

    // Create an Assignment and add it sequentially to an action's effects list.
    def de.cau.cs.kieler.sccharts.Assignment createAssignment(Action action, ValuedObject valuedObject) {
        val assignment = valuedObject.assign
        action.addAssignment(assignment)
        assignment
    }
    
    // Create an Assignment and add it sequentially to an action's effects list.
    def de.cau.cs.kieler.sccharts.Assignment addAssignment(Action action, de.cau.cs.kieler.sccharts.Assignment assignment) {
        // An Assignment is a specialized Effect with a new value and a ValuedObject
        action.addEffect(assignment)
        assignment
    }

    // Create a valued Assignment. 
    def de.cau.cs.kieler.sccharts.Assignment assign(ValuedObject valuedObject, Expression newValue) {
        val assignment = valuedObject.assign
        assignment.setValuedObject(valuedObject)
        assignment.setExpression(newValue);
        assignment
    }

    // Create a valued Assignment and add it sequentially to an action's effects list. 
    def de.cau.cs.kieler.sccharts.Assignment createAssignment(Action action, ValuedObject valuedObject, Expression newValue) {
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

    //=======  STATIC EXPRESSIONS  ======
    
    def static BoolValue TRUE() {
        createBooleanValue(true)
    }

    def static BoolValue FALSE() {
        createBooleanValue(false)
    }

    def static BoolValue createBooleanValue(boolean value) {
        val booleanValue = KExpressionsFactory::eINSTANCE.createBoolValue
        booleanValue.setValue(value)
        booleanValue
    }

    //==  EXPRESSION MODIFICATIONS  ==

    def void replace(EObject eObject, Expression searchExpression, Expression replaceExpression) {
        for (Expression expression : eObject.eAllContents.filter(typeof(Expression)).toList) {
            expression.replace(searchExpression, replaceExpression)
        }
    }

    def void replace(Action action, Expression searchExpression, Expression replaceExpression) {
        action.setTrigger(action.trigger.replace(searchExpression, replaceExpression))
    }
    
    def Expression replace(Expression expression, Expression searchExpression, Expression replaceExpression) {
        if (expression == searchExpression) {
            return replaceExpression
        }
        else if (searchExpression instanceof OperatorExpression) {
            val operatorExpression = searchExpression as OperatorExpression
            for (Expression subExpression : operatorExpression.subExpressions) { 
                subExpression.replace(searchExpression, replaceExpression)
            }
        }
        expression
    }
    
    

    // Trim all AND/OR Expressions if it contains only a single sub expression
    def dispatch Expression trim(Expression expression) {
        expression
    }
    
    // Trim an AND/OR Expression if it contains only a single sub expression.
    def dispatch Expression trim(OperatorExpression operatorExpression) {
        if (operatorExpression == null || operatorExpression.subExpressions.nullOrEmpty) {
            return operatorExpression
        }
        if (operatorExpression.subExpressions.size == 1 && 
            ((operatorExpression.operator == OperatorType::AND) || (operatorExpression.operator == OperatorType::OR))
        ) {
               // if there is just one sub expression, we do not need an AND/OR!
               val innerExpression = operatorExpression.subExpressions.get(0);
               if (innerExpression != null) {
                   return innerExpression.trim
               }
               return innerExpression
        }
        else if (operatorExpression.subExpressions.size > 1 ) {
               for (Expression subExpression : operatorExpression.subExpressions.immutableCopy) {
                   operatorExpression.add(subExpression.trim.copy)
                   operatorExpression.subExpressions.remove(subExpression)
               }
        }
        operatorExpression;
    }

    //==========  EXPRESSIONS  ==========

    // Create an EQ Expression.
    def OperatorExpression createEQExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::EQ)
        expression
    }
    // Create an EQ Expression as a sub expression.
    def OperatorExpression createEQExpression(OperatorExpression operatorExpression) {
        val expression = createEQExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an EQ Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression isEqual(Expression expressionFirst, Expression expressionSecond) {
        val eqExpression = createEQExpression()
        eqExpression.add(expressionFirst)
        eqExpression.add(expressionSecond)
        eqExpression
    }

    // Create an AND Expression.
    def OperatorExpression createAndExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::AND)
        expression
    }
    // Create an AND Expression as a sub expression.
    def OperatorExpression createAndExpression(OperatorExpression operatorExpression) {
        val expression = createAndExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an AND Expression add expressionFirst and expressionSecond as a sub expression.
    def OperatorExpression and(Expression expressionFirst, Expression expressionSecond) {
        val andExpression = createAndExpression()
        andExpression.add(expressionFirst)
        andExpression.add(expressionSecond)
        andExpression
    }

    // Create an OR Expression.
    def OperatorExpression createOrExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::OR)
        expression
    }
    // Create an OR Expression as a sub expression.
    def OperatorExpression createOrExpression(OperatorExpression operatorExpression) {
        val expression = createOrExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an OR Expression add expressionFirst or expressionSecond as a sub expression.
    def OperatorExpression or(Expression expressionFirst, Expression expressionSecond) {
        val orExpression = createOrExpression()
        orExpression.add(expressionFirst)
        orExpression.add(expressionSecond)
        orExpression
    }

    // Create an NOT Expression.
    def OperatorExpression createNotExpression() {
        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
        expression.setOperator(OperatorType::NOT)
        expression
    }
    // Create an NOT Expression as a sub expression.
    def OperatorExpression createNotExpression(OperatorExpression operatorExpression) {
        val expression = createNotExpression()
        operatorExpression.add(expression)
        expression
    }
    // Create an NOT Expression and add expression as a sub expression.
    def OperatorExpression not(Expression expression) {
        val notExpression = createNotExpression()
        notExpression.add(expression)
        notExpression
    }
    
    // Add a sub expression to an OperatorExpression.
    def OperatorExpression add(OperatorExpression operatorExpression, Expression expression) {
        operatorExpression.subExpressions.add(expression)
        operatorExpression
    }
    
    // Create a ValuedObjectReference to a valuedObject
    def ValuedObjectReference reference (ValuedObject valuedObject) {
         val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
         valuedObjectReference.setValuedObject(valuedObject);
         valuedObjectReference
    }
    

    //=========  VALUED OBJECT  =========

    // Creates a new ValuedObject in a scope.
    def ValuedObject createValuedObject(Scope scope, String valuedObjectName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(valuedObjectName)
         scope.valuedObjects.add(valuedObject)
         valuedObject
    }
    
    def ValuedObject setIsSignal(ValuedObject valuedObject, boolean isSignal) {
        valuedObject.setIsSignal(isSignal)
        valuedObject
    }
    def ValuedObject setIsInput(ValuedObject valuedObject) {
         valuedObject.setIsInput(true)
         valuedObject
    }    
    def ValuedObject setIsOutput(ValuedObject valuedObject) {
         valuedObject.setIsOutput(true)
         valuedObject
    }    
    def ValuedObject setTypePure(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::PURE)
         valuedObject
    }    
    def ValuedObject setTypeInt(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::INT)
         valuedObject
    }   
    def ValuedObject setTypeBool(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::BOOL)
         valuedObject
    }    
    def ValuedObject setTypeDouble(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::DOUBLE)
         valuedObject
    }    
    def ValuedObject setTypeFloat(ValuedObject valuedObject) {
         valuedObject.setType(ValueType::FLOAT)
         valuedObject
    }    

    //===========  VARIABLES  ===========

    // Creates a new variable ValuedObject in a Scope.
    def ValuedObject createVariable(Scope scope, String variableName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(variableName)
         valuedObject.setIsSignal(false)
         scope.valuedObjects.add(valuedObject)
         valuedObject;
    }
    
    // Creates a new Int variable ValuedObject in a Scope.
    def ValuedObject createIntVariable(Scope scope, String variableName) {
         val valuedObject = scope.createVariable(variableName)
         valuedObject.setTypeInt
    }
    
    // Creates a new Bool variable ValuedObject in a Scope.
    def ValuedObject createBoolVariable(Scope scope, String variableName) {
         val valuedObject = scope.createVariable(variableName)
         valuedObject.setTypeBool
    }

    // Creates a new Double variable ValuedObject in a Scope.
    def ValuedObject createDoubleVariable(Scope scope, String variableName) {
         val valuedObject = scope.createVariable(variableName)
         valuedObject.setTypeDouble
    }

    // Creates a new Float variable ValuedObject in a Scope.
    def ValuedObject createFloatVariable(Scope scope, String variableName) {
         val valuedObject = scope.createVariable(variableName)
         valuedObject.setTypeFloat
    }

    // Apply attributes of another ValuedObject.
    def ValuedObject applyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        valuedObject.setIsInput(valuedObjectWithAttributes.isInput)
        valuedObject.setIsOutput(valuedObjectWithAttributes.isOutput)
        valuedObject.setIsStatic(valuedObjectWithAttributes.isStatic)
        valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        valuedObject.setType(valuedObjectWithAttributes.type)
        valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        valuedObject
    }
    

    //============  SIGNALS  ============
    
    // Creates a new signal ValuedObject in a Scope.
    def ValuedObject createSignal(Scope scope, String signalName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject()
         valuedObject.setName(signalName)
         valuedObject.setIsSignal(true)
         scope.valuedObjects.add(valuedObject)
         valuedObject
    }

    // Creates a new pure signal ValuedObject in a Scope.
    def ValuedObject createPureSignal(Scope scope, String variableName) {
         val valuedObject = scope.createSignal(variableName)
         valuedObject.setTypePure
    }

    // Creates a new Int signal ValuedObject in a Scope.
    def ValuedObject createIntSignal(Scope scope, String variableName) {
         val valuedObject = scope.createSignal(variableName)
         valuedObject.setTypeInt
    }

    // Creates a new Bool signal ValuedObject in a Scope.
    def ValuedObject createBoolSignal(Scope scope, String variableName) {
         val valuedObject = scope.createSignal(variableName)
         valuedObject.setTypeBool
    }

    // Creates a new Double signal ValuedObject in a Scope.
    def ValuedObject createDoubleSignal(Scope scope, String variableName) {
         val valuedObject = scope.createSignal(variableName)
         valuedObject.setTypeDouble
    }

    // Creates a new Float signal ValuedObject in a Scope.
    def ValuedObject createFloatSignal(Scope scope, String variableName) {
         val valuedObject = scope.createSignal(variableName)
         valuedObject.setTypeFloat
    }


    //-------------------------------------------------------------------------
    //--                           N A M I N G S                             --
    //-------------------------------------------------------------------------

    // Prefixes a name with the hash code of an eObject
    def String id(EObject eObject) {
        eObject.hashCode + ""
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
         
    HashMap<EObject, Node> stateOrRegion2node = new HashMap<EObject, Node>()    
    HashMap<Node, EObject> node2state = new HashMap<Node, EObject>()    
    
    def Node getMappedNode(State state) {
        stateOrRegion2node.get(state)
    }      
    def Node getMappedNode(Region region) {
        stateOrRegion2node.get(region)
    }      
    def Surface getMappedSurface(State state) {
        state.mappedNode as Surface
    }      
    def Assignment getMappedAssignment(State state) {
        state.mappedNode as Assignment
    }      
    def Conditional getMappedConditional(State state) {
        state.mappedNode as Conditional
    }      
    def Fork getMappedFork(State state) {
        state.mappedNode as Fork
    }      
    def Exit getMappedExit(State state) {
        state.mappedNode as Exit
    }      
    def Entry getMappedEntry(Region region) {
        region.mappedNode as Entry
    }    
    
    def void map(EObject eObject, Node node) {
       stateOrRegion2node.put(eObject, node) 
       node2state.put(node, eObject)
    }  
    def void map(Node node, EObject eObject) {
       node2state.put(node, eObject)
    }  
         
    def void resetMapping() {
        stateOrRegion2node.clear
        node2state.clear
    }     
    
    def State getMappedState(Node node) {
        node2state.get(node) as State
    }
    def Region getMappedRegion(Node node) {
        node2state.get(node) as Region
    }
         
    //-------------------------------------------------------------------------
    //--             T R A N S F O R M      T O    S C G                     --
    //-------------------------------------------------------------------------
    // @requires: none

    // Transforming Local ValuedObjects.
    def SCGraph transformSCG(Region rootRegion) {
        // Clear mappings
        resetMapping
        // Create a new SCGraph
        val sCGraph = ScgFactory::eINSTANCE.createSCGraph
        // Generate nodes and recursively traverse model
        for (region : rootRegion.rootState.regions) {
           region.transformSCGGenerateNodes(sCGraph);
        }
        // Generate nodes and recursively traverse model
        for (region : rootRegion.rootState.regions) {
           region.transformSCGConnectNodes(sCGraph);
        }
        sCGraph;
    }
           
   // -------------------------------------------------------------------------   
           
   def boolean isPause(State state) {
       ((state.outgoingTransitions.filter[e|!e.isImmediate &&
                                             e.trigger == null && 
                                             e.effects.nullOrEmpty &&
                                             e.type != TransitionType::NORMALTERMINATION].size == 1) && 
       (state.outgoingTransitions.size == 1)) 
   }           
           
   def boolean isConditional(State state) {
       (
//           (state.outgoingTransitions.filter[e|e.isImmediate && 
//                                            e.trigger != null && 
//                                            e.effects.nullOrEmpty].size == 1) &&
        (state.outgoingTransitions.filter[e|e.isImmediate && 
                                            e.effects.nullOrEmpty].size == 2) &&                                             
       (state.outgoingTransitions.size == 2)) 
   }           

   def boolean isAssignment(State state) {
       ((state.outgoingTransitions.filter[e|e.isImmediate && 
                                            e.trigger == null && 
                                           !e.effects.nullOrEmpty &&
                                            e.type != TransitionType::NORMALTERMINATION].size == 1) && 
       (state.outgoingTransitions.size == 1)) 
   }           

   def boolean isFork(State state) {
       (!state.regions.nullOrEmpty && state.regions.allContents.filter(typeof(State)).size > 0)
   }
           
   def boolean isEntry(State state) {
       state.isInitial
   }           
           
   def boolean isExit(State state) {
       state.isFinal
   }
 
            
   // -------------------------------------------------------------------------   
           
   def Surface addSurface(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createSurface
        sCGraph.nodes.add(node)
        node       
   }     

   def Depth addDepth(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createDepth
        sCGraph.nodes.add(node)
        node       
   }     

   def Assignment addAssignment(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createAssignment
        sCGraph.nodes.add(node)
        node       
   }     

   def Conditional addConditional(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createConditional
        sCGraph.nodes.add(node)
        node       
   }     

   def Fork addFork(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createFork
        sCGraph.nodes.add(node)
        node       
   }     

   def Join addJoin(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createJoin
        sCGraph.nodes.add(node)
        node       
   }     

   def Entry addEntry(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createEntry
        sCGraph.nodes.add(node)
        node       
   }     

   def Exit addExit(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createExit
        sCGraph.nodes.add(node)
        node       
   }     
   
   def ControlFlow createControlFlow(Node secondNode) {
       val controlFlow = ScgFactory::eINSTANCE.createControlFlow
       controlFlow.setTarget(secondNode)
       controlFlow
   }

   // -------------------------------------------------------------------------   
   // --                 G E N E R A T E    N O D E S                        --
   // -------------------------------------------------------------------------   

   def void transformSCGGenerateNodes(Region region, SCGraph sCGraph) {
       val entry = sCGraph.addEntry
       val exit = sCGraph.addExit
       region.map(entry)
       entry.setExit(exit)
       exit.map(region)
       for (state : region.states) {
           state.transformSCGGenerateNodes(sCGraph)
       }
   }
           
   // Traverse all states and transform possible local valuedObjects.
   def void transformSCGGenerateNodes(State state, SCGraph sCGraph) {
        System.out.println("Generate Node for State " + state.id)
        if (state.pause) {
            val surface = sCGraph.addSurface
            val depth = sCGraph.addDepth
            surface.setDepth(depth)
            surface.map(state)
            state.map(surface)
        }
        else if (state.assignment) {
            val assignment = sCGraph.addAssignment
            state.map(assignment)
            val transition = state.outgoingTransitions.get(0)
            scopeProvider.parent = transition.sourceState
            val transitionCopy = transition.copy
            transitionCopy.setIsImmediate(false)
            assignment.setAssignment(serializer.serialize(transitionCopy))
        }
        else if (state.conditional) {
            val conditional = sCGraph.addConditional
            state.map(conditional)
            scopeProvider.parent = state
            val transition = state.outgoingTransitions.get(0)
            scopeProvider.parent = transition.sourceState
            val transitionCopy = transition.copy
            transitionCopy.setIsImmediate(false)
            conditional.setCondition(serializer.serialize(transitionCopy))
        }
        else if (state.fork) {
            val fork = sCGraph.addFork
            val join = sCGraph.addJoin
            fork.setJoin(join)
            state.map(fork)
            join.map(state)
            // Do recursion for all regions
            for (region : state.regions) {
                region.transformSCGGenerateNodes(sCGraph)
            }
        }
        else if (state.exit) {
            val exit = sCGraph.addExit
            state.map(exit)
        }
    }
    
   // -------------------------------------------------------------------------   

   def void transformSCGConnectNodes(Region region, SCGraph sCGraph) {
       val entry = region.mappedEntry
       // Connect all entry nodes with the initial state's nodes.
       val initialNode = region.states.filter(e | e.isInitial).get(0).mappedNode
       val controlFlowInitial = initialNode.createControlFlow
       entry.setNext(controlFlowInitial)
       
       for (state : region.states) {
           state.transformSCGConnectNodes(sCGraph)
       }
   }
           
   // Traverse all states and transform possible local valuedObjects.
   def void transformSCGConnectNodes(State state, SCGraph sCGraph) {
        System.out.println("Connect Node for State " + state.id)
        if (state.pause) {
            // Connect the depth with the node that belongs to the target of
            // the single delayed transition outgoing from the current state
            val surface = state.mappedSurface
            val depth = surface.depth

            val targetState = state.outgoingTransitions.get(0).targetState
            val otherNode = targetState.mappedNode   
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow
                depth.setNext(controlFlow)    
            }   
        }
        else if (state.assignment) {
            // Connect the assignment with the node that belongs to the target
            // of the single immediate assignment transition outgoing  from
            // the current state
            val assignment = state.mappedAssignment

            val targetState = state.outgoingTransitions.get(0).targetState
            val otherNode = targetState.mappedNode   
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow
                assignment.setNext(controlFlow)
            }
        }
        else if (state.conditional) {
            // Connect the conditional Then branch with the node that belongs
            // to the target of the single immediate transition with a trigger
            // outgoing  from the current state. Connect the Else branch with the
            // node that belongs to the target of the (other) single immediate
            // transition without a trigger outgoing from the current state.
            val conditional = state.mappedConditional

            val transitionThen = state.outgoingTransitions.filter(e | e.trigger != null).get(0)
            val transitionElse =  state.outgoingTransitions.filter(e | e.trigger == null).get(0)
            val otherNodeThen = transitionThen.targetState.mappedNode
            val otherNodeElse = transitionElse.targetState.mappedNode
            if (otherNodeThen != null) {
                val controlFlowThen = otherNodeThen.createControlFlow
                conditional.setThen(controlFlowThen)
            }
            if (otherNodeElse != null) {
                val controlFlowElse = otherNodeElse.createControlFlow
                conditional.setElse(controlFlowElse)
            }
        }
        else if (state.fork) {
            // For all region find the entry node and connect it with the fork. Find the exit node
            // and connect it with the join. Do the recursive call for the regions. Connect
            // the join node with the single normal termination target's node.
            val fork = state.mappedFork
            val join = fork.join
            // Do recursion for all regions
            for (region : state.regions) {
                val otherNodeEntry = region.mappedEntry
                if (otherNodeEntry != null) {
                    val controlFlowEntry = otherNodeEntry.createControlFlow
                    fork.next.add(controlFlowEntry)
                }   
                val otherNodeExit = region.mappedEntry.exit   
                if (otherNodeExit != null) {
                    val controlFlowFinal = join.createControlFlow
                    otherNodeExit.setNext(controlFlowFinal)
                }   
                region.transformSCGConnectNodes(sCGraph)
            }
            val normalTerminationTargetState = state.outgoingTransitions.get(0).targetState
            val otherNodeNormalTermination = normalTerminationTargetState.mappedNode   
            if (otherNodeNormalTermination != null) {
                val controlFlowNormalTermination = otherNodeNormalTermination.createControlFlow
                join.setNext(controlFlowNormalTermination)
            }   
        }
        else if (state.exit) {
            // For a final state connect it's exit node representation with the exit node
            // of the region.
            val nodeExit = state.mappedExit
            val regionExit = state.parentRegion.mappedEntry.exit
            val controlFlowFinal = regionExit.createControlFlow
            nodeExit.setNext(controlFlowFinal)
        }
    }

}
