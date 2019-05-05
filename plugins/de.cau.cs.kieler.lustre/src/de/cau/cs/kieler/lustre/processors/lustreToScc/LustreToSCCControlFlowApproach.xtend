/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author cpa, lgr
 */
class LustreToSCCControlFlowApproach extends CoreLustreToSCC {

    /**
     * Determines whether during actions shall be used in the transformation. If true, all expressions including subs 
     * that are constants, references, or/and/mod/div/plus/minus/mul/eq/comp/pre/uminus/not are transformed into a 
     * during action.
     */
    public static val IProperty<Boolean> USE_DURING_ACTIONS = new Property<Boolean>(
        "de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow.useDuringActions", false)

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    
    extension SCChartsFactory = SCChartsFactory.eINSTANCE

    var regionNameIdx = 0;
    var stateNameIdx = 0;
    var varNameIdx = 0;

    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow"
    }

    override getName() {
        return "Lustre to SCC (control-flow approach)"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override SCCharts transform(LustreProgram p) {
        super.transform(p)
    }

    override protected processReferenceCall(ReferenceCall kExpression, State state) {
        val cfRegion = createControlflowRegion(state, "r_" + regionNameIdx++) => [label = it.ID]
        val referenceState = createInitialState(cfRegion, "_s" + stateNameIdx++)
        
        val calledState = nodeToStateMap.get(kExpression.valuedObject.eContainer) as State
        val outputsOfCalledState = newArrayList
        for (Declaration decl : calledState.declarations) {
            if (decl instanceof VariableDeclaration) {
                if (decl.output) {
                    outputsOfCalledState.add(decl)
                }
            }
        }
        
        
        val outputVariable = createVariableDeclaration("_v" + varNameIdx++, inferType(outputsOfCalledState.head.valuedObjects.head.reference), state)
        val scopeCall = createScopeCall => [scope = calledState]
        calledState.reference = scopeCall
        
        for (Parameter param : kExpression.parameters) {
            val transformedParam = param.expression.transformExpression(state)
            val parameter = createParameter => [expression = transformedParam]
            scopeCall.parameters += parameter
        }
        
        scopeCall.parameters += createParameter => [expression = outputVariable.reference]
        
        referenceState.reference = scopeCall
        return outputVariable.reference
    }

    override protected processEquation(Equation equation, State state) {

        var equationExpression = equation.expression
        var useDuringActions = true

        if (environment.getProperty(USE_DURING_ACTIONS) !== null) {
            useDuringActions = environment.getProperty(USE_DURING_ACTIONS)
        }

        if (useDuringActions && equationExpression.isSimpleExpression) {
            // Use only one during action to express the expression
            if (equation.reference !== null) {
                val transformedExpression = equation.expression.transformExpression(state)
                if (transformedExpression !== null) {
                    state.createImmediateDuringAction => [
                        effects += createAssignment => [
                            reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
                            expression = transformedExpression
                        ]
                    ]
                }
            }
        } else {
            if (equation.reference !== null) {
                val transformedValObj = equation.reference.transformExpression(state)
                val cfRegion = createControlflowRegion(state, "_r" + regionNameIdx++) => [label = it.ID]
                if (equationExpression instanceof OperatorExpression) {
                    transformExpressionToSimple((transformedValObj as ValuedObjectReference).valuedObject, equationExpression, state, state, cfRegion)
                } else if (equationExpression.isValuedObjectReferenceOrValue) {
                    transformPlainExpression((transformedValObj as ValuedObjectReference).valuedObject, equationExpression, state, state, cfRegion)
                }
            } else {
                if (equation.references !== null) {
                    for (ValuedObjectReference valObjRef : equation.references) {
                        val transformedValObj = valObjRef.transformExpression(state)
                        val cfRegion = createControlflowRegion(state, "_r" + regionNameIdx++) => [label = it.ID]
                        if (equationExpression instanceof OperatorExpression) {
                            transformExpressionToSimple((transformedValObj as ValuedObjectReference).valuedObject, equationExpression, state, state, cfRegion)
                        } else if (equationExpression.isValuedObjectReferenceOrValue) {
                            transformPlainExpression((transformedValObj as ValuedObjectReference).valuedObject, equationExpression, state, state, cfRegion)
                        }
                    }
                }
            }
        }

    }

    private def Expression transformExpressionToSimple(ValuedObject valObj, Expression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        if (expression.isValuedObjectReferenceOrValue) {
            return transformExpression(expression, varState)
        } else if (expression instanceof OperatorExpression) {
            switch (expression.operator) {
                case WHEN: {
                    return transformWhen(valObj, expression as OperatorExpression, state, varState, controlflowRegion)                   
                }
                case CURRENT: {
                    return transformCurrent(valObj, expression as OperatorExpression, state, varState, controlflowRegion)
                }
                case FBY: {
                    return transformFby(valObj, expression as OperatorExpression, state, varState, controlflowRegion)
                }
                case INIT: {
                    return transformInit(valObj, expression as OperatorExpression, state, varState, controlflowRegion)
                }
                case PRE: {
                    return transformPre(valObj, expression as OperatorExpression, state, varState, controlflowRegion)
                }
                case CONDITIONAL: {
                    return transformConditional(valObj, expression as OperatorExpression, state, varState, controlflowRegion)
                }
                case IMPLIES,
                case INTDIV,
                case LOGICAL_XOR,
                case ATMOSTONEOF, 
                case NOR: {
                    return transformPlainExpression(valObj, expression, state, varState, controlflowRegion)
                }
                default: {
                    return transformDefault(valObj, expression as OperatorExpression, state, varState, controlflowRegion)                    
                }
            }
        }

    }
    
    def transformPre(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState = cfRegion.createState("_s" + stateNameIdx++)

        val transformedExpression = transformExpression(expression, state)

        val firstTransition = createImmediateTransitionTo(initalState, subExpressionState)
        var assignment = createAssignment => [
            reference = newValObj.reference
            it.expression = transformedExpression
        ]

        if (subExpressionState.isHierarchical) {
            val lastState = cfRegion.createFinalState("_s" + stateNameIdx++)
            var transition = createImmediateTransitionTo(subExpressionState, lastState)
            transition.preemption = PreemptionType.TERMINATION
            transition.addAssignment(assignment)
            
            if (state.eContainer === null) {
                createTransitionTo(lastState, initalState)
            }
        } else {
            if (state.eContainer !== null) {
                subExpressionState.final = true
            }
            firstTransition.addAssignment(assignment)
        
            createTransitionTo(subExpressionState, initalState)
        }

        return newValObj.reference
    }
    
    private def Expression transformWhen(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState = cfRegion.createState("_s" + stateNameIdx++)

        val ifRef = transformExpressionToSimple(null, expression.subExpressions.get(1), initalState, varState, null)
        val thenRef = transformExpressionToSimple(null, expression.subExpressions.get(0), subExpressionState, varState, null)

        val thenTransition = createImmediateTransitionTo(initalState, subExpressionState)
        thenTransition.trigger = ifRef
        if (initalState.isHierarchical) {
            thenTransition.preemption = PreemptionType.TERMINATION
        }
        var thenAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = thenRef
        ]
        thenTransition.addAssignment(thenAssignment)

        if (state.eContainer !== null) {
            subExpressionState.final = true
        }
        
        createTransitionTo(subExpressionState, initalState)

        return newValObj.reference
        
    }
    
    private def Expression transformFby(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        var delayState = cfRegion.createState("_s" + stateNameIdx++)
        val nextState = cfRegion.createState("_s" + stateNameIdx++)

        val initExpression = transformExpressionToSimple(null, expression.subExpressions.get(0), initalState, varState, null)
        
        val firstTransition = createImmediateTransitionTo(initalState, delayState)
        var initAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = initExpression
        ]
        firstTransition.addAssignment(initAssignment)
        
        for (var i = 1; i < expression.subExpressions.length; i++) {
            var subExpr = expression.subExpressions.get(i)
            
            if (expression.subExpressions.indexOf(subExpr) < expression.subExpressions.length - 1) {
                val newState = cfRegion.createState("_s" + stateNameIdx++)
                val thenExpression = transformExpressionToSimple(null, subExpr, newState, varState, null)
                
                var delayTransition = createTransitionTo(delayState, newState)
                val newAssignment = createAssignment => [
                    reference = newValObj.reference 
                ]
                newAssignment.expression = createPreExpression(thenExpression)
                for (var index = i; index > 1; index--) {
                    newAssignment.expression = createPreExpression(newAssignment.expression)
                }
                delayTransition.addAssignment(newAssignment)
                
                delayState = newState
            }
        }
        
        var thenExpression = transformExpressionToSimple(null, expression.subExpressions.get(expression.subExpressions.length - 1), nextState, varState, null)
        val immediateTransition = createImmediateTransitionTo(nextState, delayState)
        var thenAssignment = createAssignment => [
            reference = newValObj.reference 
        ]
        thenAssignment.expression = createPreExpression(thenExpression)
        for (var index = expression.subExpressions.length - 1; index > 1; index--) {
            thenAssignment.expression = createPreExpression(thenAssignment.expression)
        }
        immediateTransition.addAssignment(thenAssignment)
        createTransitionTo(delayState, nextState)
        
        if (nextState.isHierarchical) {
            immediateTransition.preemption = PreemptionType.TERMINATION
        } 
        
        if (state.eContainer !== null) {
            initalState.final = true
            delayState.final = true
        }
        
        return newValObj.reference
    }
    
    private def Expression transformInit(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val delayState = cfRegion.createState("_s" + stateNameIdx++)
        val nextState = cfRegion.createState("_s" + stateNameIdx++)

        val initExpression = transformExpressionToSimple(null, expression.subExpressions.get(0), initalState, varState, null)
        val thenExpression = transformExpressionToSimple(null, expression.subExpressions.get(1), nextState, varState, null)
        
        val firstTransition = createImmediateTransitionTo(initalState, delayState)
        var initAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = initExpression
        ]
        firstTransition.addAssignment(initAssignment)
        
        createTransitionTo(delayState, nextState)
        
        val immediateTransition = createImmediateTransitionTo(nextState, delayState)
        var thenAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = thenExpression
        ]
        immediateTransition.addAssignment(thenAssignment)
        
        if (nextState.isHierarchical) {
            immediateTransition.preemption = PreemptionType.TERMINATION
        } 
        
        if (state.eContainer !== null) {
            initalState.final = true
            nextState.final = true
        }
        
        return newValObj.reference
    }

    private def Expression transformCurrent(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++) => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState = cfRegion.createState("_s" + stateNameIdx++)

        val transformedExpression = transformExpressionToSimple(null, expression.subExpressions.get(0), subExpressionState, varState, null)

        val firstTransition = createImmediateTransitionTo(initalState, subExpressionState)
        var assignment = createAssignment => [
            reference = newValObj.reference
            it.expression = transformedExpression.transformExpression(varState)
        ]

        if (subExpressionState.isHierarchical) {
            val lastState = cfRegion.createFinalState("_s" + stateNameIdx++)
            var transition = createImmediateTransitionTo(subExpressionState, lastState)
            transition.preemption = PreemptionType.TERMINATION
            transition.addAssignment(assignment)
        } else {
            if (state.eContainer !== null) {
                subExpressionState.final = true
            }
            firstTransition.addAssignment(assignment)
        }
        
        createTransitionTo(subExpressionState, initalState)

        return newValObj.reference
    }
    
    private def Expression transformConditional(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++,
                inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState1 = cfRegion.createState("_s" + stateNameIdx++)
//        val subExpressionState2 = cfRegion.createState("_s" + stateNameIdx++)
        if (state.eContainer !== null) {
            subExpressionState1.final = true
//            subExpressionState2.final = true
        }

        val ifRef = transformExpressionToSimple(null, expression.subExpressions.get(0), initalState, varState, null)
        val thenRef = transformExpressionToSimple(null, expression.subExpressions.get(1), subExpressionState1, varState,
            null)
//        val elseRef = transformExpressionToSimple(null, expression.subExpressions.get(2), subExpressionState2, varState,
//            null)
        val elseRef = transformExpressionToSimple(null, expression.subExpressions.get(2), subExpressionState1, varState,
            null)

        val thenTransition = createImmediateTransitionTo(initalState, subExpressionState1)
        thenTransition.trigger = ifRef
        if (initalState.isHierarchical) {
            thenTransition.preemption = PreemptionType.TERMINATION
        }
        var thenAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = thenRef
        ]
        thenTransition.addAssignment(thenAssignment)

        val elseTransition = createImmediateTransitionTo(initalState, subExpressionState1)
        if (initalState.isHierarchical) {
            elseTransition.preemption = PreemptionType.TERMINATION
        }
        var elseAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = elseRef
        ]
        elseTransition.addAssignment(elseAssignment)

        if (state.eContainer === null) {
            createTransitionTo(subExpressionState1, initalState)
//            createTransitionTo(subExpressionState1, initalState)
        }
        
        return newValObj.reference
    }

    private def Expression transformDefault(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState = cfRegion.createState("_s" + stateNameIdx++)

        val transformedExpression = createOperatorExpression(expression.operator)
        for (Expression subExpression : expression.subExpressions) {
            transformedExpression.subExpressions +=
                transformExpressionToSimple(null, subExpression, subExpressionState, varState, null)
        }

        val firstTransition = createImmediateTransitionTo(initalState, subExpressionState)
        var assignment = createAssignment => [
            reference = newValObj.reference
            it.expression = transformedExpression
        ]

        if (subExpressionState.isHierarchical) {
            val lastState = cfRegion.createFinalState("_s" + stateNameIdx++)
            var transition = createImmediateTransitionTo(subExpressionState, lastState)
            transition.preemption = PreemptionType.TERMINATION
            transition.addAssignment(assignment)
            
            if (state.eContainer === null) {
                createTransitionTo(lastState, initalState)
            }
        } else {
            if (state.eContainer !== null) {
                subExpressionState.final = true
            }
            firstTransition.addAssignment(assignment)
        
            createTransitionTo(subExpressionState, initalState)
        }

        return newValObj.reference
    }

    private def Expression transformPlainExpression(ValuedObject valObj, Expression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) (createControlflowRegion(state, "_r" + regionNameIdx++)  => [label = it.ID]) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState = cfRegion.createState("_s" + stateNameIdx++)

        val transformedExpression = transformExpression(expression, state)

        val firstTransition = createImmediateTransitionTo(initalState, subExpressionState)
        var assignment = createAssignment => [
            reference = newValObj.reference
            it.expression = transformedExpression
        ]
        firstTransition.addAssignment(assignment)
        
        createTransitionTo(subExpressionState, initalState)

        return transformedExpression
    }

    private def boolean isSimpleExpression(Expression expr) {
        if (expr instanceof ValuedObjectReference || expr instanceof Value) {
            return true
        } else if (expr instanceof OperatorExpression) {
            if (expr.operator == OperatorType.INIT || expr.operator == OperatorType.FBY ||
                expr.operator == OperatorType.CONDITIONAL) {
                return false
            } else {
                var allSubsSimple = true
                for (Expression subExpression : expr.subExpressions) {
                    allSubsSimple = allSubsSimple && isSimpleExpression(subExpression)
                }
                return true
            }
        } else {
            return false
        }
    }

    private def isValuedObjectReferenceOrValue(Expression expression) {
        return expression instanceof ValuedObjectReference || expression instanceof Value
    }

}
