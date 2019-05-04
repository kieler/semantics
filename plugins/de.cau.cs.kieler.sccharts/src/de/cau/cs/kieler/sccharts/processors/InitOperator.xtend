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

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Expression

/**
 * SCCharts Fby Transformation.
 * 
 * @author ssm
 * @kieler.design 2018-01-29 proposed 
 * @kieler.rating 2018-01-29 proposed yellow
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
    
    
    static val GENERATED_PREFIX = "__iop_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.initOperator"
    }
    
    override getName() {
        "Init Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformInitOperator
        }
    }
    
    def transformInitOperator(State rootState) {
        val allInits = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.FBY ].toList
        val initInitParents = <OperatorExpression, ValuedObject> newHashMap 
        
        for (fby : allInits.indexed) {
            val action = fby.value.enclosingAction
            val parent = if (action instanceof Transition) action.enclosingState.enclosingState else action.enclosingState
        
            if (parent !== null) {
                val fbyTrigger = createValuedObject => [ name = GENERATED_PREFIX + fby.key + "t" initialValue = FALSE ]
                parent.declarations += createVariableDeclaration(ValueType.BOOL) => [ valuedObjects += fbyTrigger]
                voStore.update(fbyTrigger, SCCHARTS_GENERATED)
                
                val second = fby.value.subExpressions.get(1)
                val followingFby = if (second.isInitOperator) second else second.eAllContents.filter(OperatorExpression).filter[ isInitOperator ].head
                if (followingFby !== null) {
                    initInitParents.put(followingFby as OperatorExpression, fbyTrigger)
                }
                
                val localVariable = createValuedObject => [ name = GENERATED_PREFIX + fby.key ]
                parent.declarations += createVariableDeclaration(fby.value.inferType) => [ valuedObjects += localVariable ]
                voStore.update(localVariable, SCCHARTS_GENERATED)
                
                val fbyRegion = parent.createControlflowRegion(GENERATED_PREFIX + fby.key) => [ final = true ]
                val initialState = fbyRegion.createInitialState("_Init")           
                val delayState = fbyRegion.createState("_Delay")
                val loopState = fbyRegion.createState("_Loop")     
                
                val initialTransition = initialState.createImmediateTransitionTo(delayState)
                val delayTransition = delayState.createTransitionTo(loopState)
                loopState.createImmediateTransitionTo(delayState)
                
                initialTransition.effects += createAssignment(localVariable, fby.value.subExpressions.head)
                delayTransition.effects += createAssignment(fbyTrigger, TRUE)
                delayTransition.effects += createAssignment(localVariable, fby.value.subExpressions.head)
                
                val myTrigger = initInitParents.get(fby.value)
                if (myTrigger !== null) {
                    initialTransition.trigger = myTrigger.reference
                }
                
                fby.value.replace(localVariable.reference)
            } 
        }
    }
    
    private def boolean isInitOperator(Expression expression) {
        expression instanceof OperatorExpression && expression.asOperatorExpression.operator == OperatorType.INIT
    }
    
}