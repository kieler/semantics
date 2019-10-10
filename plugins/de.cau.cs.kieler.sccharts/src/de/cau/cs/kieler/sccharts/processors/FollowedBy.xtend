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

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Followed By Transformation.
 * 
 * @author lgr
 */
class FollowedBy extends SCChartsProcessor implements Traceable {

    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsTypeExtensions

    static val GENERATED_PREFIX = "__fbp_"

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.followedBy"
    }

    override getName() {
        "Followed By Operator"
    }

    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformFbyOperator
        }
    }

    /**
     * Creates a sequence of states, each representing one subExpression and assigns the expression to a new variable 
     * that replaces the corresponding fby expression.
     */
    def transformFbyOperator(State rootState) {
        
        val allFby = rootState.eAllContents.filter(OperatorExpression).filter[operator == OperatorType.FBY].toList
        
        for (fby : allFby.indexed) {
            val action = fby.value.enclosingAction
            val parent = if(action instanceof Transition) action.enclosingState.enclosingState else action.enclosingState

            if (parent !== null) {
                
                val localVariable = createValuedObject => [name = GENERATED_PREFIX + fby.key]
                parent.declarations += createVariableDeclaration(fby.value.inferType) => [
                    valuedObjects += localVariable
                ]
                voStore.update(localVariable, SCCHARTS_GENERATED)

                val fbyRegion = parent.createControlflowRegion(GENERATED_PREFIX + fby.key) => [final = true]
                
                var immediate = true
                var State state1 = null
                var State state2 = fbyRegion.createInitialState(GENERATED_PREFIX + 0) 
                for (subFby : fby.value.subExpressions.immutableCopy.indexed) {
                    state1 = state2
                    state2 = fbyRegion.createState(GENERATED_PREFIX + (subFby.key + 1))
                    var transition = createTransitionTo(state1, state2) => [
                        effects += createAssignment(localVariable, createNumerousPreExpression(subFby.value, subFby.key))
                    ]
                    if (immediate) {
                        transition.immediate = true
                        immediate = false
                    }
                }
                createImmediateTransitionTo(state2, state1)

                fby.value.replace(localVariable.reference)
            }
        }
    }
    
    private def Expression createNumerousPreExpression(Expression expression, int amount) {
        var newExpr = expression
        for (var i = 0; i < amount; i++) {
            newExpr = createPreExpression(newExpr)
        }
        
        return newExpr
    }
}
