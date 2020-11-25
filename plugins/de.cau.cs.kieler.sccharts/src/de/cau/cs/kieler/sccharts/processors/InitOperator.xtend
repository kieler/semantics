/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * SCCharts Init Operator Transformation.
 * 
 * @author lgr
 */
class InitOperator extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsTypeExtensions
    
    public static val IProperty<Boolean> ENFORCE_SD = 
        new Property<Boolean>("de.cau.cs.kieler.processors.initOperator.enforceSD", false)       
    
    static val GENERATED_PREFIX = "__iop_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.initOperator"
    }
    
    override getName() {
        "Init Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            if (getProperty(ENFORCE_SD)) {
                val scheduleDeclaration = createScheduleDeclaration.assignPrioritiesQuickly(#[1,1]) 
                val iopSchedule = scheduleDeclaration.createSchedule("iop")  
                val hasIOps = rootState.transformInitOperator(iopSchedule)
                if (hasIOps) {
                    rootState.declarations += scheduleDeclaration
                }
            } else {
                rootState.transformInitOperator(null)
            }
        }
    }
    
    def boolean transformInitOperator(State rootState, ValuedObject iopSchedule) {
        var allInits = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.INIT ].toList
        
        for (init : allInits.indexed) {
            var replaced = replaceInitPreByFby(init.value)
            init.value.replace(replaced)
        }
        
        allInits = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.INIT ].toList
        
        for (init : allInits.indexed) {
            val action = init.value.enclosingAction
            val actionRegion = action.getEnclosingRegion
            val parent = if (action instanceof Transition) action.enclosingState.enclosingState else action.enclosingState

            if (parent !== null) {
                
                val localVariable = createValuedObject => [name = GENERATED_PREFIX + init.key]
                parent.declarations += createVariableDeclaration(init.value.inferType) => [
                    valuedObjects += localVariable
                ]
                voStore.update(localVariable, SCCHARTS_GENERATED)

                val fbyRegion = parent.createControlflowRegion(GENERATED_PREFIX + init.key) => [ final = true ]
                
                var initial = fbyRegion.createInitialState("__Init_")
                var delay = fbyRegion.createState("__Delay_")
                var loop = fbyRegion.createState("__Loop_")
                
                createImmediateTransitionTo(initial, delay) => [
                    effects += createAssignment(localVariable, init.value.subExpressions.head)
                ]
                createTransitionTo(delay, loop) => [
                    effects += createAssignment(localVariable, init.value.subExpressions.last)
                ]
                createImmediateTransitionTo(loop, delay)
                
                init.value.replace(localVariable.reference)
                
                if (getProperty(ENFORCE_SD)) {
                    iopSchedule.assignSchedule(fbyRegion, actionRegion, 0, 1)
                }
            }
        }
        
        return allInits.size > 0
    }
    
    private def Expression replaceInitPreByFby(Expression expression) {
        if (expression.isInitOperator
            && expression.asOperatorExpression.subExpressions.last instanceof OperatorExpression 
            && expression.asOperatorExpression.subExpressions.last.asOperatorExpression.operator == OperatorType.PRE) {
                var fbyExpr = createOperatorExpression(OperatorType.FBY) 
                fbyExpr.subExpressions += replaceInitPreByFby(expression.asOperatorExpression.subExpressions.head)
                fbyExpr.subExpressions += replaceInitPreByFby(expression.asOperatorExpression.subExpressions.last.asOperatorExpression.subExpressions.head)
                return fbyExpr
        }
        
        return expression
    }
    
    private def boolean isInitOperator(Expression expression) {
        expression instanceof OperatorExpression && expression.asOperatorExpression.operator == OperatorType.INIT
    }
    
}