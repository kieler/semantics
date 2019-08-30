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
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.extensions.LustreUtilityExtensions
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.Assertion
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
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.lustre.lustre.AnAction
import de.cau.cs.kieler.lustre.lustre.StateValuedObject

/**
 * Basic class for Lustre to ScCharts transformations.
 * 
 * The following steps are taken here: 
 *  - create root state for each node with inputs/outputs
 *      - for automatons within node: interpret like ScCharts automatons
 *      - for asserts within node: Add '@Assume' at root state with corresponding expression
 *  - extend state with another state containing constant declarations (if existent)
 * 
 * Additionally basic expression transformation to SCC is implemented.
 * 
 * @author lgr
 * 
 */
abstract class CoreLustreToSCC extends Processor<LustreProgram, SCCharts> {

    public static val IProperty<Boolean> USE_DURING_ACTIONS_FOR_WHEN = new Property<Boolean>(
        "de.cau.cs.kieler.lustre.processors.lustreToSCC.useDuringActionsForWhen", false)

    public static val IProperty<Boolean> NO_PRE_IN_WHEN_TRANSFORMATION = new Property<Boolean>(
        "de.cau.cs.kieler.lustre.processors.lustreToSCC.noPreInWhenTransformation", false)

    public static final String DATAFLOW_REGION_NAME = ""
    public static final String CONTROLFLOW_REGION_NAME = ""
    public static final String DUMMY = "dummy"

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension LustreUtilityExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions

    // M2M mappings
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    protected HashMap<ValuedObject, ValuedObject> scchartsToLustreValuedObjectMap = new HashMap
    protected HashMap<NodeDeclaration, State> nodeToStateMap = new HashMap
    protected HashMap<StateValuedObject, State> lustreStateToScchartsStateMap = new HashMap

    /* --------------------------------------------------------------------------------------------
     * Structural methods
     * ----------------------------------------------------------------------------------------- */
    override process() {
        reset()
        model = model.transform
    }

    def SCCharts transform(LustreProgram p) {
        var scchartsProgram = createSCChart

        // Note: p.includes and p.packList are not handled
        p.packBody?.processPackBody(scchartsProgram)

        scchartsProgram
    }

    protected def reset() {
        lustreToScchartsValuedObjectMap.clear
        scchartsToLustreValuedObjectMap.clear
        nodeToStateMap.clear
        lustreStateToScchartsStateMap.clear
    }

    /* --------------------------------------------------------------------------------------------
     * Structural methods for managing elements of higher order (packages, models, nodes and its interface).
     * ----------------------------------------------------------------------------------------- */
    protected def processPackBody(PackBody packBody, SCCharts scchartsProgram) {
        val constantsState = createState => [
            name = "constants"
        ]

        // ----- Constants
        var constantsExist = false;
        for (constant : packBody.constants) {
            constantsExist = true;
            constant.processConstantDeclaration(constantsState)
        }
        val constantsLustreToScchartsMap = lustreToScchartsValuedObjectMap
        val constantsScchartsToLustreMap = scchartsToLustreValuedObjectMap

        // ----- Nodes
        // In order for References to work, we need to transform the interface of all nodes first
        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                var nodeState = createState => [
                    name = node.valuedObjects.head.name
                ]
                processNodeDeclarations(node, nodeState)
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
                scchartsToLustreValuedObjectMap = new HashMap(constantsScchartsToLustreMap)
                var nodeState = nodeToStateMap.get(node)
                node.processNodeBehavior(nodeState)
                scchartsProgram.rootStates += nodeState
            }
        }

    // Note: TypeDeclarations and ExternalNodeDeclarations are not handled
    }

    protected def processConstantDeclaration(VariableDeclaration variableDeclaration, State rootState) {
        val constantVariableDeclaration = variableDeclaration.createConstantDeclaration(rootState)
        rootState.declarations += constantVariableDeclaration
    }

    protected def processNodeDeclarations(NodeDeclaration node, State rootState) {
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

    protected def processNodeBehavior(NodeDeclaration node, State rootState) {
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
            (assertion as Assertion).processAssertion(rootState)
        }

        if (rootState.regions.isEmpty) {
            // If there is no region yet, create one otherwise the model is terminated
            var cfRegion = rootState.createControlflowRegion(DUMMY)
            cfRegion.createInitialState(DUMMY)
        }
    }

    /* --------------------------------------------------------------------------------------------
     * Methods for transformations of basic elements: equations, assertions and automatons.
     * ----------------------------------------------------------------------------------------- */
    abstract protected def void processEquation(Equation equation, State state);

    protected def processAssertion(Assertion assertion, State state) {
        try {
            val transformedAssertion = transformExpression(assertion.expr, state)
            val assertionAnnotation = AnnotationsFactory::eINSTANCE.createStringAnnotation => [
                name = "Assume"
                values += transformedAssertion?.getStringRepresentation
            ]

            state.annotations += assertionAnnotation
        } catch (Exception e) {
            environment.warnings.add("A problem occurred in the transformation of the assertion: " +
                assertion.expr.stringRepresentation, e)
        }
    }

    protected def void processAutomaton(Automaton automaton, State state) {
        var controlflowRegion = state.createControlflowRegion(CONTROLFLOW_REGION_NAME)

        for (AState lusState : automaton.states) {
            var newState = createState => [
                name = lusState.valuedObject.name
            ]
            newState.initial = lusState.initial
            controlflowRegion.states += newState
            lustreStateToScchartsStateMap.put(lusState.valuedObject as StateValuedObject, newState)
        }

        for (AState lusState : automaton.states) {
            processState(lusState, lustreStateToScchartsStateMap.get(lusState.valuedObject))
        }
    }

    /* --------------------------------------------------------------------------------------------
     * Methods used in basic methods.
     * ----------------------------------------------------------------------------------------- */
    // Automaton transformation: Transform a state
    protected def processState(AState lusState, State state) {
        for (constVariable : lusState.constants) {
            state.declarations += constVariable.createConstantDeclaration(state)
        }

        for (variable : lusState.variables) {
            state.declarations += variable.createVariableDeclarationFromLustreClockedVariableDeclaration(state)
        }

        for (Assignment equation : lusState.equations) {
            processEquation(equation as Equation, state)
        }

        for (Expression assertionExpr : lusState.assertions) {
            processAssertion((assertionExpr as Assertion), state)
        }

        for (Automaton automaton : lusState.automatons) {
            processAutomaton(automaton, state)
        }

        for (ATransition transition : lusState.transitions) {
            processTransition(transition, state)
        }
    }

    // Automaton transformation: Transform a transition
    protected def processTransition(ATransition transition, State source) {

        for (AnAction action : transition.actions) {
            var newTransition = createTransition => [
                sourceState = source
                targetState = lustreStateToScchartsStateMap.get(action.nextState)
            ]

            var trigger = transformExpression(action.condition, source)
            if (trigger !== null) {
                newTransition.trigger = trigger
            }

            for (Assignment effect : action.effects) {
                if (effect instanceof Equation) {
                    var assignment = getAssignmentForEquation(effect, source.root as State)
                    if (assignment !== null) {
                        newTransition.effects.add(assignment)
                    }
                }
            }
            
            if (transition.strong) {
                newTransition.preemption = PreemptionType.STRONGABORT
            }
            if (action.history) {
                newTransition.history = HistoryType.DEEP
            }
        }
    }

    // Equation transformation: Transform an expression
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
                        convertedExpression = processWhenExpression(kExpression, subExpressionList, state)
                    }
                    case CURRENT: {
                        convertedExpression = processCurrentExpression(kExpression, subExpressionList, state)
                    }
                    case FBY: {
                        convertedExpression = processFollowedByExpression(subExpressionList, state)
                    }
                    case IMPLIES: {
                        convertedExpression = processImpliesExpression(subExpressionList)
                    }
                    case INIT: {
                        convertedExpression = processInitExpression(subExpressionList)
                    }
                    case INTDIV: {
                        convertedExpression = processIntDivExpression(subExpressionList)
                    }
                    case LOGICAL_XOR: {
                        convertedExpression = processXorExpression(subExpressionList)
                    }
                    case ATMOSTONEOF: {
                        convertedExpression = processNoneOfExpression(subExpressionList)
                    }
                    case NOR: {
                        convertedExpression = processNorExpression(subExpressionList)
                    }
                    case PRE: {
                        convertedExpression = processPreExpression(subExpressionList.head, state)
                    }
                    default: {
                        convertedExpression = createOperatorExpression(kExpression.operator) => [
                            subExpressions.addAll(subExpressionList)
                        ]
                    }
                }
                return convertedExpression

            } else if (kExpression instanceof ReferenceCall) {
                return processReferenceCall(kExpression, state)

            } else if (kExpression instanceof ValuedObjectReference) {
                if (lustreToScchartsValuedObjectMap.containsKey(kExpression.valuedObject)) {
                    return lustreToScchartsValuedObjectMap.get(kExpression.valuedObject).reference
                } else
                    return kExpression

            } else if (kExpression instanceof Value) {
                return kExpression.copy
            }
        }
    }

    // Equation transformation: Transform a when expression
    protected def processWhenExpression(Expression kExpression, Stack<Expression> subExpressionList, State state) {
        val realExpression = subExpressionList.get(0)
        val clock = subExpressionList.get(1) as ValuedObjectReference

        // Find containing element that is not an expression
        var containingElement = kExpression.eContainer
        while (containingElement instanceof Expression) {
            containingElement = containingElement.eContainer
        }

        // Assignments containing a when expression use a during action for transformation
        if (containingElement instanceof Assignment) {
            if (environment.getProperty(USE_DURING_ACTIONS_FOR_WHEN)) {

                // Create during action for when expression
                var duringAction = createDuringAction(state) => [
                    delay = DelayType.IMMEDIATE
                ]
                val scchartsAssignmentValuedObject = lustreToScchartsValuedObjectMap.get(
                    containingElement.reference.valuedObject)

                // Create a simple assignment if signal usage is disabled
                var duringActionAssignment = createAssignment => [
                    reference = scchartsAssignmentValuedObject.reference
                    operator = AssignOperator.ASSIGN
                ]

                // The trigger must be a conjunction with all previous clocks
                var clockConjunction = createClockConjunction(clock, state)
                duringAction.trigger = clockConjunction
                duringActionAssignment.expression = realExpression
                duringAction.effects += duringActionAssignment

            } else {
                // Create condition for when expression
                val scchartsAssignmentValuedObject = lustreToScchartsValuedObjectMap.get(
                    containingElement.reference.valuedObject)
                var conditional = createOperatorExpression(OperatorType.CONDITIONAL)
                var clockConjugation = createClockConjunction(clock, state)
                conditional.subExpressions.add(clockConjugation)
                conditional.subExpressions.add(realExpression)
                if (environment.getProperty(NO_PRE_IN_WHEN_TRANSFORMATION)) {
                    conditional.subExpressions.add(scchartsAssignmentValuedObject.reference)
                } else {
                    var preForLoopBack = createPreExpression(scchartsAssignmentValuedObject.reference)
                    conditional.subExpressions.add(preForLoopBack)
                }

                return conditional
            }
        } else if (containingElement instanceof Parameter) {
            return realExpression
        }

        // Returning null will cause the containing assignment to not be added
        return null
    }

    // Equation transformation: Transform a current expression
    protected def processCurrentExpression(Expression kExpression, Stack<Expression> subExpressionList, State state) {
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
        } else if (realExpression instanceof OperatorExpression) {
            return realExpression
        }
    }

    // Equation transformation: Transform a followed by expression
    protected def processFollowedByExpression(Stack<Expression> subExpressionList, State state) {
        // x fby y <=> x -> pre(y)
        var bExpression = subExpressionList.pop
        while (!subExpressionList.isEmpty) {
            bExpression = processPreExpression(bExpression, state)
            var aExpression = createOperatorExpression(OperatorType.INIT)
            aExpression.subExpressions += subExpressionList.pop
            aExpression.subExpressions += bExpression
            bExpression = aExpression
        }

        return bExpression as OperatorExpression
    }

    // Equation transformation: Transform an implies expression
    protected def processImpliesExpression(Stack<Expression> subExpressionList) {
        // A => B  <=>  !A or B
        var rightExpression = subExpressionList.pop
        var leftExpression = subExpressionList.pop

        leftExpression = leftExpression.createNotExpression
        var convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)

        while (subExpressionList.length > 0) {
            rightExpression = convertedExpression
            leftExpression = subExpressionList.pop.createNotExpression
            convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)
        }

        return convertedExpression
    }

    // Equation transformation: Transform an init expression
    protected def processInitExpression(Stack<Expression> subExpressionList) {
        // x -> y <=> x fby y (in sccharts)
        var convertedExpression = createOperatorExpression(OperatorType.INIT)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    // Equation transformation: Transform an integer division expression
    protected def processIntDivExpression(Stack<Expression> subExpressionList) {
        // Division depends on type in sccharts
        var convertedExpression = createOperatorExpression(OperatorType.DIV)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    // Equation transformation: Transform a xor expression
    protected def processXorExpression(Stack<Expression> subExpressionList) {
        // A xor B <=> A && !B || !A && B
        var Expression bExpression
        var Expression aExpression
        var Expression notBExpression
        var Expression notAExpression
        var Expression leftOrExpression
        var Expression rightOrExpression

        var tempExpression = subExpressionList.pop

        do {
            bExpression = tempExpression
            aExpression = subExpressionList.pop

            notBExpression = createNotExpression(bExpression.copy)
            notAExpression = createNotExpression(aExpression.copy)

            leftOrExpression = createLogicalAndExpression(aExpression, notBExpression)
            rightOrExpression = createLogicalAndExpression(notAExpression, bExpression)

            tempExpression = createLogicalOrExpression(leftOrExpression, rightOrExpression)
        } while (subExpressionList.length > 0);

        var convertedExpression = tempExpression as OperatorExpression

        return convertedExpression
    }

    // Equation transformation: Transform a noneOf expression
    protected def processNoneOfExpression(Stack<Expression> subExpressionList) {
        var listcopy = newArrayList
        listcopy.addAll(subExpressionList)

        // noneOf(A, B, C) <=> !or(A, B, C) || A & !or(B,C) || B & !or(A,C) || C & !or(A,B)
        var aExpression = subExpressionList.pop
        while (!subExpressionList.isEmpty) {
            var bExpression = subExpressionList.pop
            aExpression = createLogicalOrExpression(aExpression, bExpression)
        }
        var completeExpression = createNotExpression(aExpression)

        for (var i = 0; i < listcopy.size; i++) {
            var frontVariable = listcopy.get(i).copy
            var Expression orExpression = null
            for (var j = 0; j < listcopy.size; j++) {
                if (j != i) {
                    var subExpression = listcopy.get(j).copy
                    if (orExpression !== null) {
                        orExpression = createLogicalOrExpression(orExpression, subExpression)
                    } else {
                        orExpression = subExpression
                    }
                }
            }
            var andExpression = createLogicalAndExpression(frontVariable, createNotExpression(orExpression))
            completeExpression = createLogicalOrExpression(completeExpression, andExpression)
        }

        return completeExpression

    }

    // Equation transformation: Transform a nor expression
    protected def processNorExpression(Stack<Expression> subExpressionList) {
        var listcopy = newArrayList
        listcopy.addAll(subExpressionList)

        // nor(A, B, C) <=> !or(A, B, C)
        // !or(A,B,C)
        var aExpression = subExpressionList.pop
        while (!subExpressionList.isEmpty) {
            var bExpression = subExpressionList.pop
            aExpression = createLogicalOrExpression(aExpression, bExpression)
        }

        return createNotExpression(aExpression)
    }

    // Equation transformation: Transform a pre expression
    protected def processPreExpression(Expression subExpression, State state) {
        var lustreExpression = subExpression

        lustreExpression = movePreAroundValuedObjectReferences(lustreExpression, state)

        return lustreExpression as OperatorExpression
    }

    // Needed by processPreExpression to put the pre in front of ValuedObjects, not on OperatorExpressions
    private def Expression movePreAroundValuedObjectReferences(Expression kExpression, State state) {
        if (kExpression instanceof OperatorExpression) {

            val subExpressionList = new ArrayList<Expression>
            for (var i = 0; i < kExpression.subExpressions.length; i++) {
                var kSubExpression = kExpression.subExpressions.get(i)
                var convertedKSubExpression = kSubExpression.movePreAroundValuedObjectReferences(state)
                subExpressionList.add(convertedKSubExpression)
            }

            return createOperatorExpression => [
                operator = kExpression.operator
                subExpressions.addAll(subExpressionList)
            ]

        } else if (kExpression instanceof ValuedObjectReference) {
            var preExpression = createPreExpression
            var valObj = kExpression.valuedObject
            preExpression.subExpressions += valObj.reference

            val clockedVarDecl = scchartsToLustreValuedObjectMap.get(valObj).variableDeclaration.eContainer
            if (clockedVarDecl instanceof ClockedVariableDeclaration) {
                if (clockedVarDecl.clockExpr !== null) {
                    preExpression.subExpressions +=
                        createClockConjunction(
                            clockedVarDecl.clockExpr.transformExpression(state) as ValuedObjectReference, state)
                }
            }
            return preExpression
        } else {
            return kExpression
        }
    }

    /* --------------------------------------------------------------------------------------------
     * Methods needed to process reference calls.
     * ----------------------------------------------------------------------------------------- */
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
                name = calledState.name
                uniqueName
            ]
            lustreToScchartsValuedObjectMap.put(kExpression.valuedObject, calledValuedObject)
            scchartsToLustreValuedObjectMap.put(calledValuedObject, kExpression.valuedObject)
            val referenceDeclaration = createReferenceDeclaration => [
                reference = calledState
                valuedObjects += calledValuedObject
            ]
            state.declarations += referenceDeclaration
        }
    }

    protected def linkRefernceInput(ReferenceCall kExpression, State state,
        ArrayList<ValuedObject> inputValuedObjects) {

        if (state.regions.filter[it instanceof DataflowRegion].isEmpty) {
            createDataflowRegion(state, CoreLustreToSCC.DATAFLOW_REGION_NAME)
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
            dfRegion.effects += dataflowAssignment
        }
    }

    protected def linkReferenceOutput(ReferenceCall kExpression, State state,
        ArrayList<ValuedObject> outputValuedObjects) {
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
                dfRegion.effects += dataflowAssignment

            }
        }
    }

    /* --------------------------------------------------------------------------------------------
     * Methods for handling of Variables, ValuedObjects and their declarations.
     * ----------------------------------------------------------------------------------------- */
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

    protected def createVariableDeclaration(String name, ValueType type, State state) {
        var varDecl = createVariableDeclaration(type)
        var valuedObj = createValuedObject(varDecl, name)

        state.declarations += varDecl

        return valuedObj
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
        scchartsToLustreValuedObjectMap.put(kExpressionsValuedObject, lustreValuedObject)

        return kExpressionsValuedObject
    }

    protected def createVariableDeclarationFromLustreClockedVariableDeclaration(
        ClockedVariableDeclaration lustreClockedVariableDeclaration, State state) {
        var varDeclaration = lustreClockedVariableDeclaration.vardecl.createVariableDeclaration(state)

        return varDeclaration
    }

    private def createClockConjunction(ValuedObjectReference sccClockVariable, State state) {
        var clockList = newLinkedList(sccClockVariable)
        var clockVar = scchartsToLustreValuedObjectMap.get(sccClockVariable.valuedObject)

        var ok = true
        while (ok) {
            var clockVarDeclContainer = clockVar.variableDeclaration.eContainer
            if (clockVarDeclContainer instanceof ClockedVariableDeclaration) {
                var superClockReference = clockVarDeclContainer.clockExpr as ValuedObjectReference
                if (superClockReference !== null) {
                    if (lustreToScchartsValuedObjectMap.containsKey(superClockReference.valuedObject)) {
                        clockList.add(lustreToScchartsValuedObjectMap.get(superClockReference.valuedObject).reference)
                    } else {
                        var superClockVarDecl = createVariableDeclaration(
                            superClockReference.valuedObject.variableDeclaration, state)
                        clockList.add(superClockVarDecl.valuedObjects.get(0).reference)
                    }
                    clockVar = superClockReference.valuedObject
                } else {
                    ok = false
                }
            } else {
                ok = false
            }
        }

        if (clockList.length > 1) {
            var logicalAndExpression = createLogicalAndExpression

            for (ValuedObjectReference valObjRef : clockList) {
                logicalAndExpression.subExpressions.add(valObjRef)
            }

            return logicalAndExpression

        } else {
            return clockList.get(0)
        }
    }
    
    protected def getAssignmentForEquation(Equation equation, State state) {
        if (isEquationReferenceKnown(equation)) {
            var dataflowAssignment = createAssignment
            
            // Complex references like (x, y, ... ) = ... are not linked because this is handled in the reference transformation
            if (equation.reference !== null) {
                var kExpressionValuedObject = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject)
                dataflowAssignment.reference = kExpressionValuedObject.reference
            }
            
            dataflowAssignment.expression = equation.expression.transformExpression(state)
            if (dataflowAssignment.expression !== null) {
                return dataflowAssignment
            }
        }
    }
    
    private def isEquationReferenceKnown(Equation equation) {
        val isKnownSimpleReference = equation.reference !== null && lustreToScchartsValuedObjectMap.containsKey(equation.reference.valuedObject)
        val isKnownComplexReference = equation.reference === null && lustreToScchartsValuedObjectMap.keySet.containsAll(equation.references.map[valuedObject])
        
        return isKnownSimpleReference || isKnownComplexReference
    }
}
