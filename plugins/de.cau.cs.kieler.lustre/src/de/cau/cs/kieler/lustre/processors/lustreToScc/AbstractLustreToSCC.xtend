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
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.kexpressions.CombineOperator

/**
 * @author lgr
 *
 */
abstract class AbstractLustreToSCC extends Processor<LustreProgram, SCCharts> {
    
    public static int DEFAULT_INT_SIGNAL_NOT_PRESENT_VALUE = 0
    public static boolean DEFAULT_BOOLEAN_SIGNAL_NOT_PRESENT_VALUE = false
    
    public static boolean USE_SIGNALS_FOR_CLOCKED_VARIABLES = true
    
    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    
    // M2M mappings
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    protected HashMap<NodeDeclaration, State> nodeToStateMap = new HashMap
    
    
    override process() {
        USE_SIGNALS_FOR_CLOCKED_VARIABLES = true
        model = model.transform
    }
    
    def SCCharts transform(LustreProgram p) {
        nodeToStateMap.clear 
        
        var scchartsProgram = createSCCharts
        
        // TODO: Includes and PackList
        p.packBody.processPackBody(scchartsProgram)
        
        scchartsProgram
    }
    
    protected def processPackBody(PackBody packBody, SCCharts scchartsProgram) {
        
        val constantsState = createState => [
            name = "_constants"
        ]
        
        // Constants
        var constantsExist = false;
        for(constant : packBody.constants) {
            constantsExist = true;
            constant.processConstantDeclaration(constantsState)
        }
        val constantsLustreToScchartsMap = lustreToScchartsValuedObjectMap
        
        // Nodes
        // First create state for node and save them in a map, so they can be used in references
        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                var nodeState = createState => [
                    name = "_" + node.valuedObjects.head.name
                ]
                if (constantsExist) {
                    nodeState.baseStates += constantsState
                }
                nodeToStateMap.put(node, nodeState)
            }
        }
        
        // Process each node declaration into the state created above
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
        
    protected def processNodeDeclaration(NodeDeclaration node, State rootState) {
        
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

        // Transform equations
        for (equation : node.equations) {
            equation.processEquation(rootState)
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
    
    abstract protected def void processEquation(Assignment equation, State state);
    abstract protected def void processAutomaton(Automaton automaton, State state);
    abstract protected def void processAssertion(Expression assertion, State state);

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
        if (lustreVariableDeclaration.valuedObjects.length == 1 && lustreVariableDeclaration.valuedObjects.head instanceof LustreValuedObject) {
            val lustreValuedObject = lustreVariableDeclaration.valuedObjects.head as LustreValuedObject
            val objType = lustreValuedObject.type
            kExpressionsVariableDeclaration.type = objType
            
            val kExpressionsValuedObject = lustreValuedObject.createValuedObject(state)
            kExpressionsVariableDeclaration.valuedObjects += kExpressionsValuedObject
            
        } 
        
        // ... or a declaration of an arbitary amount of variables with the same type
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
            annotations.addAll(lustreValuedObject.annotations)
            name = lustreValuedObject.name
            initialValue = lustreValuedObject.initialValue.transformExpression(state)
        ]
        for (cardinalityExpression : lustreValuedObject.cardinalities) {
            kExpressionsValuedObject.cardinalities += cardinalityExpression.transformExpression(state)
        }
        
        lustreToScchartsValuedObjectMap.put(lustreValuedObject, kExpressionsValuedObject)
                
        return kExpressionsValuedObject
    }
    
    protected def createVariableDeclarationFromLustreClockedVariableDeclaration(ClockedVariableDeclaration lustreClockedVariableDeclaration, State state) {
//        if (USE_SIGNALS_FOR_CLOCKED_VARIABLES) {
            lustreClockedVariableDeclaration.vardecl.createVariableDeclaration(state)
//        } else {
//        }
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
                        // In paper: current(X) = if (clock of X) then X else pre(X')                        
                        // If it is a signal, take the value, else take the expression and do nothing
                        val realExpression = subExpressionList.get(0)
                        
                        if (USE_SIGNALS_FOR_CLOCKED_VARIABLES) {
                            // TODO: recursively find valuedobjectreferences
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
                        } else {
                            return realExpression
                        }
                    }
                    case WHEN: {
                        val realExpression = subExpressionList.get(0)
                        val clock = subExpressionList.get(1)

                        var containingElement = kExpression.eContainer
                        while (containingElement instanceof Expression) {
                            containingElement = containingElement.eContainer
                        }

                        if (containingElement instanceof Assignment) {
                            var duringAction = createDuringAction => [
                                delay = DelayType.IMMEDIATE
                                trigger = clock
                            ]                            
                            
                            val scchartsAssignmentValuedObject = lustreToScchartsValuedObjectMap.get(containingElement.reference.valuedObject)
                            
                            if (USE_SIGNALS_FOR_CLOCKED_VARIABLES) {
                                // Change declaration of the variable to be a signal
                                var scchartsReferenceDeclaration = scchartsAssignmentValuedObject.declaration as VariableDeclaration
                                scchartsReferenceDeclaration.signal = true;
                                switch (scchartsReferenceDeclaration.type) {
                                    case BOOL: {
                                        scchartsAssignmentValuedObject.combineOperator = CombineOperator.OR
                                    }
                                    case DOUBLE: {
                                        scchartsAssignmentValuedObject.combineOperator = CombineOperator.ADD                   
                                    }
                                    case INT: {
                                        scchartsAssignmentValuedObject.combineOperator = CombineOperator.ADD
                                    }
                                    default: {
                                    }
                                }
                                
                                duringAction.effects += createEmission => [
                                    reference = scchartsAssignmentValuedObject.reference
                                    newValue = realExpression
                                ]
                            } else {
                                duringAction.effects += createAssignment => [
                                    reference = scchartsAssignmentValuedObject.reference
                                    operator = AssignOperator.ASSIGN 
                                    expression = realExpression
                                ]
                            }
                                
                            state.actions += duringAction

                        }
                        
                        // Returning null will cause the containing assignment to not be added
                        return null
                    }
                    case FBY: {
                        // x fby y <=> x -> pre(y)
                        // Note: only 2 subexpressions
                        convertedExpression = createOperatorExpression(OperatorType.FBY)
                        var preSecond = createPreExpression(subExpressionList.pop)
                        convertedExpression.subExpressions += subExpressionList.pop
                        convertedExpression.subExpressions += preSecond
                    }
                    case IMPLIES: {
                        // A => B  <=>  !A or B
                        var rightExpression = subExpressionList.pop
                        var leftExpression = subExpressionList.pop
                        
                        leftExpression = leftExpression.createNotExpression
                        convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)

                        while (subExpressionList.length > 0) {
                            rightExpression = convertedExpression
                            leftExpression = subExpressionList.pop.createNotExpression
                            convertedExpression = createLogicalOrExpression(leftExpression, rightExpression)
                        }
                    }
                    case INIT: {
                        // x -> y <=> x fby y (in sccharts)
                        convertedExpression = createOperatorExpression(OperatorType.FBY)
                        convertedExpression.subExpressions += new ArrayList(subExpressionList)
                    }
                    case INTDIV: {
                        // Division depends on type in sccharts
                        convertedExpression = createOperatorExpression(OperatorType.DIV)
                        convertedExpression.subExpressions += subExpressionList
                    }
                    case LOGICAL_XOR: {
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
                        
                        convertedExpression = tempExpression as OperatorExpression
                    }
                    default: {
                        convertedExpression = createOperatorExpression(kExpression.operator)
                        convertedExpression.subExpressions += subExpressionList
                    }
                }
                
                return convertedExpression
                
            } else if (kExpression instanceof ValuedObjectReference) {
                if(kExpression instanceof ReferenceCall) {
                    // First, create a reference declaration
                    val calledState = nodeToStateMap.get(kExpression.valuedObject.eContainer) as NamedObject
                    val calledValuedObject = createValuedObject => [
                            name = "_ref_" calledState.name
                    ]
                    state.declarations += createReferenceDeclaration => [
                        reference = calledState
                        valuedObjects += calledValuedObject
                    ]
                    
                    // Second, create a reference call
                    return createReferenceCall => [
                        valuedObject = calledValuedObject
                    ]
                    
                } else { 
                    if (lustreToScchartsValuedObjectMap.containsKey(kExpression.valuedObject)) {
                        return lustreToScchartsValuedObjectMap.get(kExpression.valuedObject).reference
                    }
                }
            } else if (kExpression instanceof Value) {
                return kExpression.copy                
            } 
        }
    }
}