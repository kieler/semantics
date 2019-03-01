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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreTransformationExtension
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.sccharts.ControlflowRegion

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.kexpressions.ValueType

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
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension LustreTransformationExtension
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions

    private var regionNameIdx = 0;
    private var stateNameIdx = 0;
    private var varNameIdx = 0;

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
        // Do nothing, not supported
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
            if (equationExpression instanceof OperatorExpression) {
                val transformedValObj = equation.reference.transformExpression(state)
                val cfRegion = createControlflowRegion(state, "_r" + regionNameIdx++)
                transformExpressionToSimple((transformedValObj as ValuedObjectReference).valuedObject,
                    equationExpression, state, state, cfRegion)
                val initalStates = cfRegion.states.filter[initial]
                val finalStates = cfRegion.states.filter[final]

                for (State initial : initalStates) {
                    for (State final : finalStates) {
                        createTransitionTo(final, initial)
                        final.final = false
                    }
                }
            }
        }

    }

    private def Expression transformExpressionToSimple(ValuedObject valObj, Expression expression, State state,
        State varState, ControlflowRegion controlflowRegion) {
        if (expression.isValuedObjectReferenceOrValue) {
            return transformExpression(expression, state)
        } else if (expression instanceof OperatorExpression) {
            switch (expression.operator) {
                case WHEN: {
                    // TODO                    
                }
                case CURRENT: {
                    return expression.subExpressions.get(0).transformExpression(state)
                }
                case FBY: {
                    // TODO
                }
                case INIT: {
                    // TODO
                }
                case CONDITIONAL: {
                    return transformConditional(valObj, expression as OperatorExpression, state, varState, null)
                }
                default: {
                    return transformDefault(valObj, expression as OperatorExpression, state, varState, null)                    
                }
            }
        }

    }
    
    private def Expression transformWhen(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        
    }
    
    private def Expression transformFby(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        
    }
    
    private def Expression transformInit(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        
    }

    private def Expression transformDefault(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++, inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) createControlflowRegion(state,
                "_r" + regionNameIdx++) else controlflowRegion
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
            it.expression = transformedExpression.transformExpression(varState)
        ]

        if (subExpressionState.isHierarchical) {
            val lastState = cfRegion.createFinalState("_s" + stateNameIdx++)
            var transition = createImmediateTransitionTo(subExpressionState, lastState)
            transition.preemption = PreemptionType.TERMINATION
            transition.addAssignment(assignment)
        } else {
            subExpressionState.final = true
            firstTransition.addAssignment(assignment)
        }

        return newValObj.reference
    }
    
    
    private def Expression transformConditional(ValuedObject valObj, OperatorExpression expression, State state, State varState, ControlflowRegion controlflowRegion) {
        val newValObj = if(valObj !== null) valObj else createVariableDeclaration("_v" + varNameIdx++,
                inferType(expression), varState)

        val cfRegion = if(controlflowRegion === null) createControlflowRegion(state,
                "_r" + regionNameIdx++) else controlflowRegion
        val initalState = cfRegion.createInitialState("_s" + stateNameIdx++)
        val subExpressionState1 = cfRegion.createFinalState("_s" + stateNameIdx++)
        val subExpressionState2 = cfRegion.createFinalState("_s" + stateNameIdx++)

        val ifRef = transformExpressionToSimple(null, expression.subExpressions.get(0), initalState, varState, null)
        val thenRef = transformExpressionToSimple(null, expression.subExpressions.get(1), subExpressionState1, varState,
            null)
        val elseRef = transformExpressionToSimple(null, expression.subExpressions.get(2), subExpressionState2, varState,
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

        val elseTransition = createImmediateTransitionTo(initalState, subExpressionState2)
        if (initalState.isHierarchical) {
            elseTransition.preemption = PreemptionType.TERMINATION
        }
        var elseAssignment = createAssignment => [
            reference = newValObj.reference
            it.expression = elseRef
        ]
        elseTransition.addAssignment(elseAssignment)

        return newValObj.reference
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
