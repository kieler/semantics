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
class LustreToSCCControlFlowApproach2 extends CoreLustreToSCC {
        
    /**
     * Determines how hierarchy is used during the transformation.
     * 
     * true  : Use no hierarchy, generated SCCharts will be fully flat.
     * false : Partial hierarchy, don't generate unnessesary hierarchy but use it occasionally when readability is improved. 
     */
    public static val IProperty<Boolean> HIERARCHY = 
        new Property<Boolean>("de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow.hierarchy", true)   
        
    /**
     * Determines whether during actions shall be used in the transformation. If true, all expressions including subs 
     * that are constants, references, or/and/mod/div/plus/minus/mul/eq/comp/pre/uminus/not are transformed into a 
     * during action.
     */
    public static val IProperty<Boolean> USE_DURING_ACTIONS = 
        new Property<Boolean>("de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow.useDuringActions", true) 

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
    
    override protected processEquation(Equation equation, State state) {
        
        var equationExpression = equation.expression
        var useDuringActions = true
        
        if (environment.getProperty(USE_DURING_ACTIONS) !== null) {
            useDuringActions = false //environment.getProperty(USE_DURING_ACTIONS)
        }
        
        if (useDuringActions && equationExpression.isSimpleExpression) {
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
            var cfRegion = state.createControlflowRegion("initalRegion")
            val initialState = cfRegion.createInitialState("inital")
            
            val stateList = equationExpression.transformExpression(equation.reference.valuedObject, state, initialState, cfRegion)
            for (State s : stateList) {
                createTransition => [
                    targetState = initialState
                    s.outgoingTransitions += it
                ]
            }
        }
        
//        if (equationExpression instanceof OperatorExpression && (equationExpression as OperatorExpression).operator == OperatorType.CONDITIONAL) {
//            
//            val equationRegion = state.createControlflowRegion(equation.toString)
//            var initialState = createState => [
//                equationRegion.states += it
//                initial = true                
//            ]
//            var nextState = createState => [
//                equationRegion.states += it
//            ]
//            var immediateGuardedTransition = createImmediateTransitionTo(initialState, nextState)
//            var immediateUnguardedTransition = createImmediateTransitionTo(initialState, nextState)
//            createTransitionTo(nextState, initialState)
//            
//            val trigger = (equationExpression as OperatorExpression).subExpressions.get(0)
//            val thenExpression = (equationExpression as OperatorExpression).subExpressions.get(1)
//            val elseExpression = (equationExpression as OperatorExpression).subExpressions.get(2)
//
//            // For conditional, create two transitions, one with a trigger
//            immediateGuardedTransition.trigger  = trigger.transformExpression(state)
//            immediateGuardedTransition.effects += createAssignment => [
//                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
//                expression = thenExpression.transformExpression(state)
//            ]
//            
//            immediateUnguardedTransition.effects += createAssignment => [
//                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
//                expression = elseExpression.transformExpression(state)
//            ]
//            
//        
//        } else if (!useDuringActions) {
//            
//            val equationRegion = state.createControlflowRegion(equation.toString)
//            var initialState = createState => [
//                equationRegion.states += it
//                initial = true                
//            ]
//            var nextState = createState => [
//                equationRegion.states += it
//            ]
//            var immediateTransition = createImmediateTransitionTo(initialState, nextState)
//            createTransitionTo(nextState, initialState)
//            
//            val action = equationExpression
//
//            immediateTransition.effects += createAssignment => [
//                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
//                expression = action.transformExpression(state)
//            ]
//            
//        }
        
        // Create a region
        // Create initial and next
        // Compute each subexpression in its own subregion if it 'cannot be transformed into a single ScCharts affectation'
    }
    
    override protected processReferenceCall(ReferenceCall kExpression, State state) {
        // Do nothing, not supported
    }
    
    private def boolean isSimpleExpression(Expression expr) {
        if (expr instanceof ValuedObjectReference 
            || expr instanceof Value) {
            return true
        } else if (expr instanceof OperatorExpression) {
            if (expr.operator == OperatorType.INIT 
                || expr.operator == OperatorType.FBY 
                || expr.operator == OperatorType.CONDITIONAL) {
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
    
    def private ArrayList<State> transformExpression(Expression expression, ValuedObject currentVar, State superState, State previousState, ControlflowRegion region) {

        if (expression instanceof OperatorExpression) {
            switch (expression.operator) {
                case CONDITIONAL: {
                    expression.transformIfThenElseExpression(currentVar, superState, previousState, region)
                }
                case ADD,
                case SUB,
                case MULT,
                case DIV,
                case INTDIV,
                case MOD,
                case EQ,
                case NE,
                case GEQ,
                case LEQ,
                case GT,
                case LT,
                case LOGICAL_AND,
                case LOGICAL_OR,
                case LOGICAL_XOR,
                case IMPLIES,
                case NONEOF,
                case NOR,
                case NOT: {
                    expression.transformBinaryExpression(currentVar, superState, previousState, region)
                }
                
                
                case CURRENT: {
                }
                case WHEN: {
                }
                case FBY: {
                }
                case INIT: {
                    expression.transformArrowExpression(currentVar, superState, previousState, region)
                }
                case PRE: {
                }
                default: {
                }
            }
        }
    }

    def private transformBinaryExpression(OperatorExpression expression, ValuedObject currentVar, State superState, State previousState, ControlflowRegion region) {

        val expressionWithVariableReference = createOperatorExpression(expression.operator)
        
        for (Expression e : expression.subExpressions) {
            if (e.isSimpleExpression) {
                expressionWithVariableReference.subExpressions += e.copy
            } else if (e instanceof OperatorExpression && (e as OperatorExpression).operator == OperatorType.INIT) {
                var newRegion = superState.createControlflowRegion("_r" + regionNameIdx++)
                var newState = newRegion.createInitialState("_s" + stateNameIdx++)
                
                val newVarName = "__" + currentVar.name + "_" + expression.subExpressions.indexOf(e)
                var valObj = createVariableDeclaration(newVarName, inferType(e), superState)
                expressionWithVariableReference.subExpressions += valObj.reference
                
                var eOpExp = e as OperatorExpression
                eOpExp.transformArrowExpression(valObj, superState, newState, newRegion)
            
            } else {
                
                val newVarName = "__" + currentVar.name + "_" +  expression.subExpressions.indexOf(e)
                var valObj = createVariableDeclaration(newVarName, inferType(e), superState)
                expressionWithVariableReference.subExpressions += valObj.reference

                val endStates = e.transformExpression(valObj, superState, previousState, region)
                for (State s : endStates)
                    s.final = true
            }
        }
        
        val endState = createState => [ s |
            s.name = "_s" + stateNameIdx++
            region.states += s

            createTransition => [
                targetState = s
                previousState.outgoingTransitions += it
                immediate = true
                if (previousState.regions.isEmpty) 
                    immediate = true  
                else
                    preemption = PreemptionType::TERMINATION
                    
                effects += createAssignment(currentVar, expressionWithVariableReference)
            ]
        ]

        val ret = new ArrayList<State>
        ret.add(endState)
        ret
    }

    def private transformIfThenElseExpression(OperatorExpression expression, ValuedObject currentVar, State superState, State previousState, ControlflowRegion region) {

        val ret = new ArrayList<State>

        if (expression.isSimpleExpression) {
            val endState = createState => [
                name = "_s" + stateNameIdx++
                region.states += it
            ]

            assignExpression(previousState, endState, currentVar, expression.subExpressions.get(1), true, expression.subExpressions.get(0))
            assignExpression(previousState, endState, currentVar, expression.subExpressions.get(2), true, null)

            ret.add(endState)
            return ret

        } else {
            
            var prevState = previousState
            
            var ifExpr = expression.subExpressions.get(0)
            var thenExpr = expression.subExpressions.get(1)
            var elseExpr = expression.subExpressions.get(2)

            var Expression ifVar = null
            var Expression thenVar = null
            var Expression elseVar = null
            
            if (!ifExpr.isValuedObjectReferenceOrValue) {

//                val ifRegion = createControlflowRegion("_r" + regionNameIdx++) => [
//                    previousState.regions += it
//                ]
//                prevState = createState => [
//                    name = "_s" + stateNameIdx++
//                    initial = true
//                    ifRegion.states += it
//                ]
    
                var valObj = createVariableDeclaration(currentVar.name + "_if", inferType(expression.subExpressions.get(0)), superState)
                var states = expression.subExpressions.get(0).transformExpression(valObj, superState, previousState, region)
                prevState = states.last
                
                ifVar = valObj.reference
            } else {
                ifVar = transformExpression(ifExpr, superState)
            }
            
            val thenState = createState => [
                name = "_s" + stateNameIdx++
                region.states += it
            ]

            if (!thenExpr.isValuedObjectReferenceOrValue) {
//                val thenRegion = createControlflowRegion("_r" + regionNameIdx++) => [
//                    thenState.regions += it
//                ]
//                val thenStartingState = createState => [
//                    name = "_s" + stateNameIdx++
//                    thenRegion.states += it
//                ]

                var valObj = createVariableDeclaration(currentVar.name + "_then", inferType(expression.subExpressions.get(0)), superState)
                expression.subExpressions.get(1).transformExpression(valObj, superState, thenState, region)
                thenVar = valObj.reference
            } else {
                thenVar = transformExpression(thenExpr, superState)
            }


            val elseState = createState => [
                name = "_s" + stateNameIdx++
                region.states += it
            ]
            
            if (!elseExpr.isValuedObjectReferenceOrValue) {
//                val elseRegion = createControlflowRegion("_r" + regionNameIdx++) => [
//                    elseState.regions += it
//                ]
//                val elseStartingState = createState => [
//                    name = "_s" + stateNameIdx++
//                    initial = true
//                    elseRegion.states += it
//                ]
                var valObj = createVariableDeclaration(currentVar.name + "_else", inferType(expression.subExpressions.get(0)), superState)
                expression.subExpressions.get(2).transformExpression(valObj, superState, elseState, region)
                elseVar = valObj.reference
            } else {
                elseVar = transformExpression(elseExpr, superState)
            }
            
            var thenTransition = createTransition => [
                targetState = thenState
                immediate = true
            ]
            thenTransition.trigger = ifVar
            var thenAssignment = createAssignment => [
                reference = currentVar.reference
            ]
            thenAssignment.expression = thenVar
            thenTransition.addAssignment(thenAssignment)
            prevState.outgoingTransitions += thenTransition

            var elseTransition = createTransition => [
                targetState = elseState
                immediate = true
            ]
            var elseAssignment = createAssignment => [
                reference = currentVar.reference
            ]
            elseAssignment.expression = elseVar
            elseTransition.addAssignment(elseAssignment)
            prevState.outgoingTransitions += elseTransition

            ret.add(thenState)
            ret.add(elseState)
            ret

        }

    }

    def private transformArrowExpression(OperatorExpression expression, ValuedObject currentVar, State superState, State previousState,
        ControlflowRegion region) {

        var pState = previousState
        for (Expression subE : expression.subExpressions) {
            if (subE != expression.subExpressions.last) {
                val nextState = createState => [
                    name = "_s" + stateNameIdx++
                    region.states += it
                ]
                assignExpression(pState, nextState, currentVar, subE, (subE == expression.subExpressions.head), null)
                pState = nextState
            } else
                assignExpression(pState, pState, currentVar, subE, false, null)

        }

        val ret = new ArrayList<State>
        ret
    }

    def private assignExpression(State startState, State endState, ValuedObject currentVar, Expression expression,
        boolean isImmediate, Expression trig) {
        val endStates = new ArrayList<State>
        if (expression.isSimpleExpression) {
            
        var transition = createTransition => [
            targetState = endState
            effects += createAssignment(currentVar, expression.transformExpression(startState))
            startState.outgoingTransitions += it
            immediate = isImmediate
        ]
         transition.trigger = trig.transformExpression(startState)
        } else {
            val rightState = createState => [
                name = "_s" + stateNameIdx++
                startState.parentRegion.states += it
            ]
            endStates.addAll(expression.transformExpression(currentVar, startState.parentRegion.parentState, rightState,
                startState.parentRegion))
            createTransition => [
                targetState = rightState
                immediate = isImmediate
                startState.outgoingTransitions += it
                trigger = trig.transformExpression(startState)
            ]
            for (State s : endStates)
                createTransition => [
                    targetState = endState
                    immediate = true
                    s.outgoingTransitions += it
                ]
        }
    }
    
    private def areAllSubsValuedObjectReferenceOrValue(Expression expression) {
        if (expression instanceof OperatorExpression) {
            var allSubsSimple = true
            for (Expression subExpression : expression.subExpressions) {
                if (!(subExpression instanceof ValuedObjectReference) && !(subExpression instanceof Value)) {
                    allSubsSimple = false
                }
            }
            return allSubsSimple
        }
    }
    
    private def isValuedObjectReferenceOrValue(Expression expression) {
        return expression instanceof ValuedObjectReference || expression instanceof Value
    }
    
}
