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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.extensions.LustreUtilityExtensions
import de.cau.cs.kieler.lustre.lustre.Assertion
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.StateValuedObject
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

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

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension LustreUtilityExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions

    // M2M mappings
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    protected HashMap<ValuedObject, ValuedObject> scchartsToLustreValuedObjectMap = new HashMap
    protected HashMap<NodeDeclaration, State> nodeToStateMap = new HashMap
    protected HashMap<StateValuedObject, State> lustreStateToScchartsStateMap = new HashMap

    override process() {
        reset()
        model = model.transform
    }

    def SCCharts transform(LustreProgram p) {
        var scchartsProgram = createSCChart

        // Note: Handle includes
        
        val constantsState = createState => [
            name = "constants"
        ]

        // ----- Constants
        var constantsExist = false;
        for (constant : p.constants) {
            constantsExist = true;
            constant.processConstantDeclaration(constantsState)
        }
        val constantsLustreToScchartsMap = lustreToScchartsValuedObjectMap
        val constantsScchartsToLustreMap = scchartsToLustreValuedObjectMap

        // ----- Nodes
        // In order for References to work, we need to transform the interface of all nodes first
        for (node : p.nodes) {
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
        for (node : p.nodes) {
            if (node instanceof NodeDeclaration) {
                lustreToScchartsValuedObjectMap = new HashMap(constantsLustreToScchartsMap)
                scchartsToLustreValuedObjectMap = new HashMap(constantsScchartsToLustreMap)
                var nodeState = nodeToStateMap.get(node)
                node.processNodeBehavior(nodeState)
                scchartsProgram.rootStates += nodeState
            }
        }

    // Note: TypeDeclarations and ExternalNodeDeclarations are not handled
        scchartsProgram
    }

    protected def reset() {
        lustreToScchartsValuedObjectMap.clear
        scchartsToLustreValuedObjectMap.clear
        nodeToStateMap.clear
        lustreStateToScchartsStateMap.clear
    }

    /* --------------------------------------------------------------------------------------------
     * Methods for transformations of basic elements: equations, assertions and automatons.
     * ----------------------------------------------------------------------------------------- */
    abstract protected def void processEquation(Equation equation, State state);
    abstract protected def void processAssertion(Assertion assertion, State state);
    abstract protected def void processAutomaton(Automaton automaton, State state);

    protected def processConstantDeclaration(VariableDeclaration variableDeclaration, State rootState) {
        val constantVariableDeclaration = variableDeclaration.createConstantDeclaration(rootState)
        rootState.declarations += constantVariableDeclaration
    }

    protected def processNodeDeclarations(NodeDeclaration node, State rootState) {
        rootState.declarations.addAll(node.inputs.map[it.createInputDeclaration(rootState)])
        rootState.declarations.addAll(node.outputs.map[it.createOutputDeclaration(rootState)])
        rootState.declarations.addAll(node.constants.map[it.createConstantDeclaration(rootState)])
        rootState.declarations.addAll(node.variables.map[it.createVariableDeclarationFromLustre(rootState)])
    }

    protected def processNodeBehavior(NodeDeclaration node, State rootState) {
        for (equation : node.equations) {
            (equation as Equation).processEquation(rootState)
        }
        for (automaton : node.automatons) {
            automaton.processAutomaton(rootState)
        }
        for (assertion : node.assertions) {
            (assertion as Assertion).processAssertion(rootState)
        }
        
        if (rootState.regions.isEmpty) {
            // If there is no region yet, create one otherwise the model is terminated
            var cfRegion = rootState.createControlflowRegion("")
            cfRegion.createInitialState("")
        }
    }

    /* --------------------------------------------------------------------------------------------
     * ----------------------------------------------------------------------------------------- */
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
                        convertedExpression = processWhenExpression(subExpressionList, state)
                    }
                    case CURRENT: {
                        convertedExpression = processCurrentExpression(subExpressionList, state)
                    }
                    case PRE: {
                        convertedExpression = processPreExpression(subExpressionList.head, state)
                    }
                    case INTDIV: {
                        convertedExpression = createOperatorExpression(OperatorType.INTDIV) => [
                            subExpressions.addAll(subExpressionList)
                        ]
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

    protected def processWhenExpression(Stack<Expression> subExpressionList, State state) {
        val realExpression = subExpressionList.get(0)
        val clock = subExpressionList.get(1) as ValuedObjectReference
        
        createOperatorExpression(OperatorType.CONDITIONAL) => [
            subExpressions += createClockConjunction(clock, state)
            subExpressions += realExpression
        ]
    }

    // Equation transformation: Transform a current expression
    protected def processCurrentExpression(Stack<Expression> subExpressionList, State state) {
        return subExpressionList.get(0)
    }

    // Equation transformation: Transform a pre expression
    protected def processPreExpression(Expression subExpression, State state) {
        var lustreExpression = subExpression
        lustreExpression = movePreAroundValuedObjectReferences(lustreExpression, state)

        return lustreExpression as OperatorExpression
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
            createDataflowRegion(state, "")
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

    protected def createVariableDeclarationFromLustre(VariableDeclaration lustreClockedVariableDeclaration, State state) {
        var varDeclaration = lustreClockedVariableDeclaration.createVariableDeclaration(state)

        return varDeclaration
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
    
    private def createClockConjunction(ValuedObjectReference sccClockVariable, State state) {
        var clockList = newLinkedList(sccClockVariable)
        var clockVar = scchartsToLustreValuedObjectMap.get(sccClockVariable.valuedObject)

        var ok = true
        while (ok) {
            var clockVarDecl = clockVar.variableDeclaration
            var clockReference = clockVarDecl.clock
            if (clockReference !== null) {
                if (lustreToScchartsValuedObjectMap.containsKey(clockReference.valuedObject)) {
                    var sccClockValObj = lustreToScchartsValuedObjectMap.get(clockReference.valuedObject)
                    clockList.add(sccClockValObj.reference)
                } else {
                    var superClockVarDecl = createVariableDeclaration(clockReference.valuedObject.variableDeclaration, state)
                    clockList.add(superClockVarDecl.valuedObjects.get(0).reference)
                }
                clockVar = clockReference.valuedObject
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

            val varDecl = scchartsToLustreValuedObjectMap.get(valObj).variableDeclaration
            if (varDecl.isClockedVariableDeclaration) {
                var clockReference = varDecl.asLustreVariableDeclaration.clockExpr.transformExpression(state) as ValuedObjectReference
                preExpression.subExpressions += createClockConjunction(clockReference, state)
            }
            return preExpression
        } else {
            return kExpression
        }
    }
    
    private def isEquationReferenceKnown(Equation equation) {
        val isKnownSimpleReference = equation.reference !== null && lustreToScchartsValuedObjectMap.containsKey(equation.reference.valuedObject)
        val isKnownComplexReference = equation.reference === null && lustreToScchartsValuedObjectMap.keySet.containsAll(equation.references.map[valuedObject])
        
        return isKnownSimpleReference || isKnownComplexReference
    }
}
