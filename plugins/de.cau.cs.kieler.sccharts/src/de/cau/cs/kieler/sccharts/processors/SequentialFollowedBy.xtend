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
 * SCCharts Sequential Fby Transformation.
 * 
 * @author ssm
 * @kieler.design 2018-01-29 proposed 
 * @kieler.rating 2018-01-29 proposed yellow
 */
class SequentialFollowedBy extends SCChartsProcessor implements Traceable {
    
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
        "de.cau.cs.kieler.sccharts.processors.sequentialFollowedBy"
    }
    
    override getName() {
        "Sequential Followed By Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformSequentialFollowedByOperator
        }
    }
    
    def transformSequentialFollowedByOperator(State rootState) {
        val allSfby = rootState.eAllContents.filter(OperatorExpression).filter[it.isSfbyOperator].toList
        val initSfbyParents = <OperatorExpression, ValuedObject> newHashMap 
        
        for (sfby : allSfby.indexed) {
            val action = sfby.value.enclosingAction
            val parent = if (action instanceof Transition) action.enclosingState.enclosingState else action.enclosingState
        
            if (parent !== null) {
                val sfbyTrigger = createValuedObject => [ name = GENERATED_PREFIX + sfby.key + "t" initialValue = FALSE ]
                parent.declarations += createVariableDeclaration(ValueType.BOOL) => [ valuedObjects += sfbyTrigger]
                voStore.update(sfbyTrigger, SCCHARTS_GENERATED)
                
                val second = sfby.value.subExpressions.get(1)
                val followingSfby = if (second.isSfbyOperator) second else second.eAllContents.filter(OperatorExpression).filter[ isSfbyOperator ].head
                if (followingSfby !== null) {
                    initSfbyParents.put(followingSfby as OperatorExpression, sfbyTrigger)
                }
                
                val localVariable = createValuedObject => [ name = GENERATED_PREFIX + sfby.key ]
                parent.declarations += createVariableDeclaration(sfby.value.inferType) => [ valuedObjects += localVariable ]
                voStore.update(localVariable, SCCHARTS_GENERATED)
                
                val sfbyRegion = parent.createControlflowRegion(GENERATED_PREFIX + sfby.key) => [ final = true ]
                val initialState = sfbyRegion.createInitialState("_Init")           
                val delayState = sfbyRegion.createState("_Delay")
                val loopState = sfbyRegion.createState("_Loop")     
                
                val initialTransition = initialState.createImmediateTransitionTo(delayState)
                val delayTransition = delayState.createTransitionTo(loopState)
                loopState.createImmediateTransitionTo(delayState)
                
                initialTransition.effects += createAssignment(localVariable, sfby.value.subExpressions.head)
                delayTransition.effects += createAssignment(sfbyTrigger, TRUE)
                delayTransition.effects += createAssignment(localVariable, sfby.value.subExpressions.head)
                
                val myTrigger = initSfbyParents.get(sfby.value)
                if (myTrigger !== null) {
                    initialTransition.trigger = myTrigger.reference
                }
                
                sfby.value.replace(localVariable.reference)
            } 
        }
    }
    
    private def boolean isSfbyOperator(Expression expression) {
        expression instanceof OperatorExpression && expression.asOperatorExpression.operator == OperatorType.SFBY
    }
    
}