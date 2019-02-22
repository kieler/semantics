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

/**
 * @author cpa, lgr
 */
class LustreToSCCControlFlowApproach extends CoreLustreToSCC {
        
    /**
     * Determines how hierarchy is used during the transformation.
     * 
     * 0 : Use no hierarchy, generated SCCharts will be fully flat.
     * 1 : Partial hierarchy, don't generate unnessesary hierarchy but use it occasionally when readability is improved. 
     * 2 : Full hierarchy, every expression generates a new parallel region that computes the result. 
     */
    public static val IProperty<Integer> HIERARCHY_LEVEL = 
        new Property<Integer>("de.cau.cs.kieler.lustre.processors.lustreToSCC.controlFlow.hierarchyLevel", 0)   
        
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
        
        // If it is a simple expression, a during action can be used, otherwise special constructs
        // simple: this and all subs are constants, references, or/and/mod/div/plus/minus/mul/eq/comp/pre/uminus/not
        if (equationExpression instanceof OperatorExpression && (equationExpression as OperatorExpression).operator == OperatorType.CONDITIONAL) {
            
            val equationRegion = state.createControlflowRegion(equation.toString)
            var initialState = createState => [
                equationRegion.states += it
                initial = true                
            ]
            var nextState = createState => [
                equationRegion.states += it
            ]
            var immediateGuardedTransition = createImmediateTransitionTo(initialState, nextState)
            var immediateUnguardedTransition = createImmediateTransitionTo(initialState, nextState)
            createTransitionTo(nextState, initialState)
            
            val trigger = (equationExpression as OperatorExpression).subExpressions.get(0)
            val thenExpression = (equationExpression as OperatorExpression).subExpressions.get(1)
            val elseExpression = (equationExpression as OperatorExpression).subExpressions.get(2)

            // For conditional, create two transitions, one with a trigger
            immediateGuardedTransition.trigger  = trigger.transformExpression(state)
            immediateGuardedTransition.effects += createAssignment => [
                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
                expression = thenExpression.transformExpression(state)
            ]
            
            immediateUnguardedTransition.effects += createAssignment => [
                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
                expression = elseExpression.transformExpression(state)
            ]
            
        
        } else if (!useDuringActions) {
            
            val equationRegion = state.createControlflowRegion(equation.toString)
            var initialState = createState => [
                equationRegion.states += it
                initial = true                
            ]
            var nextState = createState => [
                equationRegion.states += it
            ]
            var immediateTransition = createImmediateTransitionTo(initialState, nextState)
            createTransitionTo(nextState, initialState)
            
            val action = equationExpression

            immediateTransition.effects += createAssignment => [
                reference = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject).reference
                expression = action.transformExpression(state)
            ]
            
        } else if (equation.reference !== null) {
            // Non-conditional: create immediate during action /x = y
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
        
        // Create a region
        // Create initial and next
        // Compute each subexpression in its own subregion if it 'cannot be transformed into a single ScCharts affectation'
    }
    
    override protected processReferenceCall(ReferenceCall kExpression, State state) {
        // Do nothing, not supported
    }    
    
}
