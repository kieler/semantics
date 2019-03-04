/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.extensions.LustreTransformationExtension
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions

/**
 * Basic class for Lustre to ScCharts transformations.
 * 
 * The following steps are taken here: 
 *  - create root state for each node
 *      - for automatons within node: interpret like ScCharts automatons
 *  - extend state with another state containing constant declarations (if existent)
 * 
 * @author lgr
 * 
 */
abstract class CoreLustreToSCC extends Processor<LustreProgram, SCCharts> {

    public static final String DATAFLOW_REGION_PREFIX = "df"
    public static final String CONTROLFLOW_REGION_PREFIX = "cf"
    public static final String ALIBI = "alibi_"

    // TODO: This should be configurable for the user.    
    public static boolean USE_SIGNALS_FOR_CLOCKED_VARIABLES = true

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension LustreTransformationExtension
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions

    // M2M mappings
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    protected HashMap<NodeDeclaration, State> nodeToStateMap = new HashMap
    protected HashMap<AState, State> lustreStateToScchartsStateMap = new HashMap
    protected int controlflowRegionCounter

    override process() {
        USE_SIGNALS_FOR_CLOCKED_VARIABLES = false
        reset()
        model = model.transform
    }

    abstract protected def void processEquation(Equation equation, State state);

    def SCCharts transform(LustreProgram p) {
        var scchartsProgram = createSCChart

        if (p.includes !== null) {
            // TODO: Handle inputs
        } 
        
        if (p.packList !== null) {
            // TODO: Handle module an package elements
        }
        
        if (p.packBody !== null) {
            p.packBody.processPackBody(scchartsProgram)
        }

        scchartsProgram
    }
    
    protected def reset() {
        lustreToScchartsValuedObjectMap.clear
        nodeToStateMap.clear
        lustreStateToScchartsStateMap.clear
        controlflowRegionCounter = 0
    }
    
    protected def processAssertion(Expression assertion, State state) {
        // TODO: Add assertion as model checker property
    }

    protected def void processAutomaton(Automaton automaton, State state) {
        var controlflowRegion = createControlflowRegion(CONTROLFLOW_REGION_PREFIX + controlflowRegionCounter)
        state.regions += controlflowRegion
        
        var initialState = true;
        for (AState lusState : automaton.states) {
            var newState = createState => [
                name = lusState.name
            ]
            if (initialState) {
                newState.initial = true
                initialState = false
            }
            controlflowRegion.states += newState
            lustreStateToScchartsStateMap.put(lusState, newState)
        }
        
        for (AState lusState : automaton.states) {
            processState(lusState, lustreStateToScchartsStateMap.get(lusState))
        }
    }
    
    protected def processState(AState lusState, State state) {
        
        for (Assignment equation: lusState.equations) {
            processEquation(equation as Equation, state)
        }
        
        for (Expression assertion : lusState.assertions) {
            processAssertion(assertion, state)
        }
        
        for (Automaton automaton : lusState.automatons) {
            processAutomaton(automaton, state)
        }
        
        for (ATransition transition : lusState.transitions) {
            processTransition(transition, state)
        }
    }    
    
    protected def processTransition(ATransition transition, State source) {
        var newTransition = createTransition => [
            sourceState = source
            targetState = lustreStateToScchartsStateMap.get(transition.nextState)
        ]
        
        var trigger = transformExpression(transition.condition, source)
        if (trigger !== null) {
            newTransition.trigger = trigger
        }
        if (transition.strong) {
            newTransition.preemption = PreemptionType.STRONGABORT
        }
        if (transition.history) {
            newTransition.history = HistoryType.DEEP
        }        
    }

    protected def processPackBody(PackBody packBody, SCCharts scchartsProgram) {

        val constantsState = createState => [
            name = "_constants"
        ]

        // ----- Constants
        var constantsExist = false;
        for (constant : packBody.constants) {
            constantsExist = true;
            constant.processConstantDeclaration(constantsState)
        }
        val constantsLustreToScchartsMap = lustreToScchartsValuedObjectMap

        // ----- Nodes
        // In order for References to work, we need to transform the interface of all nodes first
        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                var nodeState = createState => [
                    name = "_" + node.valuedObjects.head.name
                ]
                processNodeInterface(node, nodeState)
                if (constantsExist) {
                    nodeState.baseStates += constantsState
                }
                nodeToStateMap.put(node, nodeState)
            }
        }

        // Secondly, the remaining node is transformed into the state created above
        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                lustreToScchartsValuedObjectMap = new HashMap(constantsLustreToScchartsMap)
                var nodeState = nodeToStateMap.get(node)
                node.processNodeDeclaration(nodeState)
                scchartsProgram.rootStates += nodeState
            }
        }

    // TODO: TypeDeclarations and ExternalNodeDeclarations
    }

    protected def processConstantDeclaration(VariableDeclaration variableDeclaration, State rootState) {
        val constantVariableDeclaration = variableDeclaration.createConstantDeclaration(rootState)
        rootState.declarations += constantVariableDeclaration
    }

    protected def processNodeInterface(NodeDeclaration node, State rootState) {
        // Process inputs
        for (inputDecl : node.input.parameter) {
            rootState.declarations += inputDecl.createInputDeclaration(rootState)
        }

        // Process outputs
        for (outputDecl : node.output.parameter) {
            rootState.declarations += outputDecl.createOutputDeclaration(rootState)
        }

        // Process constants
        for (constVariable : node.constants) {
            rootState.declarations += constVariable.createConstantDeclaration(rootState)
        }

        // Process variables
        for (variable : node.variables) {
            rootState.declarations += variable.createVariableDeclarationFromLustreClockedVariableDeclaration(rootState)
        }

    }

    protected def processNodeDeclaration(NodeDeclaration node, State rootState) {
        // Transform equations
        for (equation : node.equations) {
            (equation as Equation).processEquation(rootState)
        }

        // Transform automatons
        for (automaton : node.automatons) {
            automaton.processAutomaton(rootState)
        }

        // Transform assertions
        for (assertion : node.assertions) {
            assertion.processAssertion(rootState)
        }
        
        if (rootState.regions.isEmpty) {
            // If there is no region yet, create one otherwise the model is terminated
            var cfRegion = rootState.createControlflowRegion(ALIBI +  "region") => [label = it.ID]
            cfRegion.createInitialState(ALIBI + "state")
        }
    }

    protected def createConstantDeclaration(VariableDeclaration lustreVariableDeclaration, State state) {
        lustreVariableDeclaration.createVariableDeclaration(state) => [
            const = true
        ]
    }

    protected def createInputDeclaration(VariableDeclaration lustreVariableDeclaration, State state) {
        lustreVariableDeclaration.createVariableDeclaration(state) => [
            input = true
        ]
    }

    protected def createOutputDeclaration(VariableDeclaration lustreVariableDeclaration, State state) {
        lustreVariableDeclaration.createVariableDeclaration(state) => [
            output = true
        ]
    }

    protected def createVariableDeclaration(VariableDeclaration lustreVariableDeclaration, State state) {
        var kExpressionsVariableDeclaration = createVariableDeclaration

        // Determine whether the declaration is an initialization...
        if (lustreVariableDeclaration.valuedObjects.length == 1 &&
            lustreVariableDeclaration.valuedObjects.head instanceof LustreValuedObject) {
            val lustreValuedObject = lustreVariableDeclaration.valuedObjects.head as LustreValuedObject
            val objType = lustreValuedObject.type
            kExpressionsVariableDeclaration.type = objType

            val kExpressionsValuedObject = lustreValuedObject.createValuedObject(state)
            kExpressionsVariableDeclaration.valuedObjects += kExpressionsValuedObject

        } // ... or a declaration of an arbitary amount of variables with the same type
        else {
            kExpressionsVariableDeclaration.type = lustreVariableDeclaration.type

            for (lustreValuedObject : lustreVariableDeclaration.valuedObjects) {
                val kExpressionsValuedObject = lustreValuedObject.createValuedObject(state)
                kExpressionsVariableDeclaration.valuedObjects += kExpressionsValuedObject
            }
        }

        return kExpressionsVariableDeclaration
    }

    protected def createValuedObject(ValuedObject lustreValuedObject, State state) {
        val kExpressionsValuedObject = createValuedObject => [
            name = lustreValuedObject.name
            initialValue = lustreValuedObject.initialValue.transformExpression(state)
        ]
        for (cardinalityExpression : lustreValuedObject.cardinalities) {
            kExpressionsValuedObject.cardinalities += cardinalityExpression.transformExpression(state)
        }

        lustreToScchartsValuedObjectMap.put(lustreValuedObject, kExpressionsValuedObject)

        return kExpressionsValuedObject
    }

    protected def createVariableDeclarationFromLustreClockedVariableDeclaration(
        ClockedVariableDeclaration lustreClockedVariableDeclaration, State state) {
        var varDeclaration = lustreClockedVariableDeclaration.vardecl.createVariableDeclaration(state)
        if (lustreClockedVariableDeclaration.clockExpr !== null) {
            makeSignalFromVariableDeclaration(varDeclaration, USE_SIGNALS_FOR_CLOCKED_VARIABLES)
        }

        return varDeclaration
    }

    protected def createVariableDeclaration(String name, ValueType type, State state) {
        var varDecl = createVariableDeclaration(type)
        var valuedObj = createValuedObject(varDecl, name)
        
        state.declarations += varDecl    
        
        return valuedObj    
    }
        
    protected def Expression transformExpression(Expression kExpression, State state) {
        if (kExpression !== null) {
            if (kExpression instanceof OperatorExpression) {
                val subExpressionList = new Stack<Expression>
                for (var i = 0; i < kExpression.subExpressions.length; i++) {
                    var kSubExpression = kExpression.subExpressions.get(i)
                    var convertedKSubExpression = kSubExpression.transformExpression(state)
                    subExpressionList.push(convertedKSubExpression)
                }

                var Expression convertedExpression
                switch (kExpression.operator) {
                    case WHEN: {
                        processWhenExpression(kExpression, subExpressionList, state)
                    }
                    case CURRENT: {
                        convertedExpression = createCurrentExpression(kExpression, subExpressionList, state)
                    }
                    case FBY: {
                        convertedExpression = createFollowedByExpression(subExpressionList)
                    }
                    case IMPLIES: {
                        convertedExpression = createImpliesExpression(subExpressionList)
                    }
                    case INIT: {
                        convertedExpression = createInitExpression(subExpressionList)
                    }
                    case INTDIV: {
                        convertedExpression = createIntDivExpression(subExpressionList)
                    }
                    case LOGICAL_XOR: {
                        convertedExpression = createXorExpression(subExpressionList)
                    }
                    case NONEOF: {
                        convertedExpression = createNoneOfExpression(subExpressionList)
                    }
                    case NOR: {
                        convertedExpression = createNorExpression(subExpressionList)
                    }
                    case PRE: {
                        convertedExpression = createPreCascadedExpression(subExpressionList.head)
                    }
                    default: {
                        convertedExpression = createOperatorExpression(kExpression.operator) => [
                            subExpressions.addAll(subExpressionList)
                        ]
                    }
                }
                return convertedExpression

            } else if (kExpression instanceof ReferenceCall) {
                // A different lustre node is called here
                return processReferenceCall(kExpression, state)
                
            } else if (kExpression instanceof ValuedObjectReference) {
                // Simple reference: Search for the equivalent sccharts reference
                if (lustreToScchartsValuedObjectMap.containsKey(kExpression.valuedObject)) {
                    return lustreToScchartsValuedObjectMap.get(kExpression.valuedObject).reference
                }
                else return kExpression
                
            } else if (kExpression instanceof Value) {
                return kExpression.copy
            }
        }
    }

    protected def processWhenExpression(Expression kExpression, Stack<Expression> subExpressionList, State state) {
        val realExpression = subExpressionList.get(0)
        val clock = subExpressionList.get(1)
        val type = realExpression.inferType

        // Find containing element that is not an expression
        var containingElement = kExpression.eContainer
        while (containingElement instanceof Expression) {
            containingElement = containingElement.eContainer
        }

        // Assignments containing a when expression use a during action for transformation
        if (containingElement instanceof Assignment) {
            var duringAction = createDuringAction(state) => [
                delay = DelayType.IMMEDIATE
            ]
            val scchartsAssignmentValuedObject = lustreToScchartsValuedObjectMap.get(
                containingElement.reference.valuedObject)

            if (USE_SIGNALS_FOR_CLOCKED_VARIABLES) {

                // Create a signal emission if this variant is used
                makeSignalFromVariableDeclaration(scchartsAssignmentValuedObject.declaration as VariableDeclaration, USE_SIGNALS_FOR_CLOCKED_VARIABLES)
                duringAction.effects += createEmission => [
                    reference = scchartsAssignmentValuedObject.reference
                    newValue = realExpression
                ]

            } else {

                // Create a simple assignment if signal usage is disabled
                var duringActionAssignment = createAssignment => [
                    reference = scchartsAssignmentValuedObject.reference
                    operator = AssignOperator.ASSIGN
                ]

                if (type.equals(ValueType.BOOL)) {
                    // For booleans, create a conjunction with the previous clock
                    duringActionAssignment.expression = createLogicalAndExpression => [
                        subExpressions += clock
                        subExpressions += realExpression
                    ]
                } else {
                    duringAction.trigger = clock
                    duringActionAssignment.expression = realExpression
                }
                duringAction.effects += duringActionAssignment

            }
        }

        // Returning null will cause the containing assignment to not be added
        return null
    }

    protected def createCurrentExpression(Expression kExpression, Stack<Expression> subExpressionList, State state) {
        // If it is a signal, take the value, else take the expression and do nothing
        val realExpression = subExpressionList.get(0)

        if (realExpression instanceof ValuedObjectReference) {
            val scchartsReferenceDeclaration = realExpression.valuedObject.declaration as VariableDeclaration
            if (scchartsReferenceDeclaration.signal) {
                return createOperatorExpression(OperatorType.VAL) => [
                    subExpressions += realExpression
                ]
            } else {
                return realExpression
            }
        }
    }

    protected def processReferenceCall(ReferenceCall kExpression, State state) {
        
        val calledState = nodeToStateMap.get(kExpression.valuedObject.eContainer) as State

        addReferenceDeclaration(kExpression, state)

        // Extract inputs and outputs of the sccharts state
        var inputValuedObjects = new ArrayList<ValuedObject>
        var outputValuedObjects = new ArrayList<ValuedObject>
        for (Declaration decl : calledState.declarations) {
            if (decl instanceof VariableDeclaration) {
                if (decl.input) {
                    for (ValuedObject valObj : decl.valuedObjects) {
                        inputValuedObjects.add(valObj)
                    }
                } else if (decl.output) {
                    for (ValuedObject valObj : decl.valuedObjects) {
                        outputValuedObjects.add(valObj)
                    }
                }
            }
        }
        
        linkRefernceInput(kExpression, state, inputValuedObjects)
        return linkReferenceOutput(kExpression, state, outputValuedObjects)
    }
    
    protected def addReferenceDeclaration(ReferenceCall kExpression, State state) {
        // ----- 1. Add a reference declaration for the calling expression
        val calledState = nodeToStateMap.get(kExpression.valuedObject.eContainer) as State
        if (!lustreStateToScchartsStateMap.containsKey(kExpression.valuedObject)) {
            val calledValuedObject = createValuedObject => [
                name = "_ref" + calledState.name
                uniqueName
            ]
            lustreToScchartsValuedObjectMap.put(kExpression.valuedObject, calledValuedObject)
            val referenceDeclaration = createReferenceDeclaration => [
                reference = calledState
                valuedObjects += calledValuedObject
            ]
            state.declarations += referenceDeclaration
        }
    }
    
    protected def linkRefernceInput(ReferenceCall kExpression, State state, ArrayList<ValuedObject> inputValuedObjects) {
        
        if (state.regions.filter[it instanceof DataflowRegion].isEmpty) {
            state.regions += createDataflowRegion(DATAFLOW_REGION_PREFIX).uniqueName => [label = it.ID]
        }
        var dfRegion = state.regions.filter[it instanceof DataflowRegion].head as DataflowRegion
        
        val calledValuedObject = lustreToScchartsValuedObjectMap.get(kExpression.valuedObject)

        // ----- 2. Add equations feeding the reference declaration with the right input
        for (var i = 0; i < kExpression.parameters.length && i < inputValuedObjects.length; i++) {
            var kExpressionParameter = kExpression.parameters.get(i)
            var stateInput = inputValuedObjects.get(i)

            val leftSideReference = calledValuedObject.reference
            leftSideReference.subReference = stateInput.reference
            val rightSide = kExpressionParameter.expression.transformExpression(dfRegion.eContainer as State)

            var dataflowAssignment = createAssignment => [
                reference = leftSideReference
                operator = AssignOperator.ASSIGN
                expression = rightSide
            ]
            dfRegion.equations += dataflowAssignment
        }
    }
    
    protected def linkReferenceOutput(ReferenceCall kExpression, State state, ArrayList<ValuedObject> outputValuedObjects) {
        val calledValuedObject = lustreToScchartsValuedObjectMap.get(kExpression.valuedObject)
        var dfRegion = state.regions.filter[it instanceof DataflowRegion].head as DataflowRegion
        
        // Extract containing equation of the expression
        var container = kExpression.eContainer
        while (container instanceof Expression || container instanceof Parameter) {
            container = container.eContainer
        }

        if (!(container instanceof Equation)) {
            return null
        }

        val equation = container as Equation
        
        // ----- 3. Add equations linking the reference with outputs
        if (equation.references.empty) {
            // Only one output
            if (outputValuedObjects.length != 1) {
                throw new UnsupportedOperationException(
                    "The output parameter of the scchart is not the same amount as in lustre")
            }
            var outputScchartsReference = calledValuedObject.reference
            outputScchartsReference.subReference = outputValuedObjects.head.reference
            return outputScchartsReference

        } else {
            // At least two outputs - Create equation for each output                
            for (var i = 0; i < equation.references.length && i < outputValuedObjects.length; i++) {
                var elemInBraces = equation.references.get(i)
                var stateOutput = outputValuedObjects.get(i)

                val leftSide = lustreToScchartsValuedObjectMap.get(elemInBraces.valuedObject).reference
                val rightSideReference = calledValuedObject.reference
                rightSideReference.subReference = stateOutput.reference

                var dataflowAssignment = createAssignment => [
                    reference = leftSide
                    operator = AssignOperator.ASSIGN
                    expression = rightSideReference
                ]
                dfRegion.equations += dataflowAssignment

            }
        }
    }
}
