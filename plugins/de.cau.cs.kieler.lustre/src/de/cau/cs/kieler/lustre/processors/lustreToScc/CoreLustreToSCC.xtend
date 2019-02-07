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
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.Value
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
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * Basic class for Lustre to ScCharts transformations.
 * 
 * The following steps are taken here: 
 *  - create root state for each node
 *  - extend state with another state containing constant declarations
 * 
 * @author lgr
 * 
 */
abstract class CoreLustreToSCC extends Processor<LustreProgram, SCCharts> {

    // TODO: This should be configurable for the user.    
    public static boolean USE_SIGNALS_FOR_CLOCKED_VARIABLES = true

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions

    // M2M mappings
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    protected HashMap<NodeDeclaration, State> nodeToStateMap = new HashMap
    protected HashMap<AState, State> lustreStateToScchartsStateMap = new HashMap

    override process() {
        USE_SIGNALS_FOR_CLOCKED_VARIABLES = false
        reset()
        model = model.transform
    }

    def SCCharts transform(LustreProgram p) {
        nodeToStateMap.clear

        var scchartsProgram = createSCChart

//        if (p.includes !== null) {
//        } 
//        
//        if (p.packList !== null) {
//        }
        if (p.packBody !== null) {
            p.packBody.processPackBody(scchartsProgram)
        }

        scchartsProgram
    }

    protected def void reset();

    abstract protected def void processEquation(Equation equation, State state);

    abstract protected def void processAutomaton(Automaton automaton, State state);

    abstract protected def void processAssertion(Expression assertion, State state);

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
            makeSignalFromVariableDeclaration(varDeclaration)
        }

        return varDeclaration
    }

    protected def Expression transformExpression(Expression kExpression, State state) {
        if (kExpression !== null) {
            if (kExpression instanceof OperatorExpression) {

                var subExpressionList = new Stack<Expression>
                for (var i = 0; i < kExpression.subExpressions.length; i++) {
                    var kSubExpression = kExpression.subExpressions.get(i)
                    var convertedKSubExpression = kSubExpression.transformExpression(state)
                    subExpressionList.push(convertedKSubExpression)
                }

                var OperatorExpression convertedExpression
                switch (kExpression.operator) {
                    case CURRENT: {
                        processCurrentExpression(kExpression, subExpressionList, state)
                    }
                    case WHEN: {
                        processWhenExpression(kExpression, subExpressionList, state)
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
                    case NONEOF,
                    case NOR: {
                        convertedExpression = createNorExpression(subExpressionList)
                    }
                    case PRE: {
                        convertedExpression = createPreCascadedExpression(subExpressionList.head)
                    }
                    default: {
                        convertedExpression = createOperatorExpression(kExpression.operator)
                        convertedExpression.subExpressions += subExpressionList
                    }
                }
                return convertedExpression

            } else if (kExpression instanceof ValuedObjectReference) {
                // A different lustre node is called here
                if (kExpression instanceof ReferenceCall) {
                    return processReferenceCall(kExpression, state)
                } else {
                    // Simple reference: Search for the equivalend sccharts reference
                    if (lustreToScchartsValuedObjectMap.containsKey(kExpression.valuedObject)) {
                        return lustreToScchartsValuedObjectMap.get(kExpression.valuedObject).reference
                    }
                }
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
                makeSignalFromVariableDeclaration(scchartsAssignmentValuedObject.declaration as VariableDeclaration)
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
        }
    }

    protected def createFollowedByExpression(Stack<Expression> subExpressionList) {
        // x fby y <=> x -> pre(y)
        var bExpression = subExpressionList.pop
        while(!subExpressionList.isEmpty) {
            bExpression = createPreCascadedExpression(bExpression)
            var aExpression = createOperatorExpression(OperatorType.FBY)
            aExpression.subExpressions += subExpressionList.pop
            aExpression.subExpressions += bExpression
            bExpression = aExpression
        }

        return bExpression as OperatorExpression
    }

    protected def createImpliesExpression(Stack<Expression> subExpressionList) {
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

    protected def createInitExpression(Stack<Expression> subExpressionList) {
        // x -> y <=> x fby y (in sccharts)
        var convertedExpression = createOperatorExpression(OperatorType.FBY)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    protected def createIntDivExpression(Stack<Expression> subExpressionList) {
        // Division depends on type in sccharts
        var convertedExpression = createOperatorExpression(OperatorType.DIV)
        convertedExpression.subExpressions += subExpressionList

        return convertedExpression
    }

    protected def createXorExpression(Stack<Expression> subExpressionList) {
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

    protected def createPreCascadedExpression(Expression subExpression) {
        var kExpression = subExpression

        kExpression = cascadePre(kExpression)

        return kExpression as OperatorExpression
    }

    private def Expression cascadePre(Expression kExpression) {
        if (kExpression instanceof OperatorExpression) {

            val subExpressionList = new ArrayList<Expression>
            for (var i = 0; i < kExpression.subExpressions.length; i++) {
                var kSubExpression = kExpression.subExpressions.get(i)
                var convertedKSubExpression = kSubExpression.cascadePre
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
            return preExpression
        } else {
            return kExpression
        }
    }

    protected def createNorExpression(Stack<Expression> subExpressionList) {
        // nor(A, B, C) <=> !and(A, B, C)
        var aExpression = subExpressionList.pop

        while (!subExpressionList.isEmpty) {
            var bExpression = subExpressionList.pop
            aExpression = createLogicalAndExpression(aExpression, bExpression)
        }

        return createNotExpression(aExpression)
    }

    protected def processReferenceCall(ReferenceCall kExpression, State state) {
        var container = kExpression.eContainer
        while (container instanceof Expression || container instanceof Parameter) {
            container = container.eContainer
        }

        if (!(container instanceof Equation)) {
            return null
        }

        val equation = container as Equation
        var dfRegion = state.regions.filter[it instanceof DataflowRegion].head as DataflowRegion

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
        val calledValuedObject = lustreToScchartsValuedObjectMap.get(kExpression.valuedObject)

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

        // ----- 2. Add equations feeding the reference declaration with the right input
        for (var i = 0; i < kExpression.parameters.length && i < inputValuedObjects.length; i++) {
            var kExpressionParameter = kExpression.parameters.get(i)
            var stateInput = inputValuedObjects.get(i)

            val leftSideReference = calledValuedObject.reference
            leftSideReference.subReference = stateInput.reference
            val rightSide = kExpressionParameter.expression.transformExpression(state)

            var dataflowAssignment = createAssignment => [
                reference = leftSideReference
                operator = AssignOperator.ASSIGN
                expression = rightSide
            ]
            dfRegion.equations += dataflowAssignment
        }

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
        return null
    }

    // Only needed for signal approach
    private def makeSignalFromVariableDeclaration(VariableDeclaration variableDeclaration) {
        if (USE_SIGNALS_FOR_CLOCKED_VARIABLES) {
            if (variableDeclaration.valuedObjects.length != 1) {
                throw new UnsupportedOperationException(
                    "Cannot transform clock expressions with multiple valued objects.")
            }
            variableDeclaration.signal = true;
            switch (variableDeclaration.type) {
                case BOOL: {
                    variableDeclaration.valuedObjects.head.combineOperator = CombineOperator.OR
                }
                case DOUBLE: {
                    variableDeclaration.valuedObjects.head.combineOperator = CombineOperator.ADD
                }
                case INT: {
                    variableDeclaration.valuedObjects.head.combineOperator = CombineOperator.ADD
                }
                default: {
                }
            }
        }
    }
}
