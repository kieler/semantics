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
import java.util.List

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
                
                var localVariable = createValuedObject => [name = GENERATED_PREFIX + fby.key]
                var varDecl = createVariableDeclaration(fby.value.inferType) 
                varDecl.valuedObjects += localVariable
                parent.declarations += varDecl
                voStore.update(localVariable, SCCHARTS_GENERATED)

                var replacementVar = localVariable
                var subExprCopy = fby.value.subExpressions.immutableCopy
                for (subExpr : subExprCopy.indexed) {
                    if (fby.value.subExpressions.indexOf(subExpr.value) < fby.value.subExpressions.size -1) {
                        
                        val subExprRegion = parent.createControlflowRegion(GENERATED_PREFIX + fby.key + subExpr.key)
                        
                        var init = subExprRegion.createInitialState("init")
                        var delay = subExprRegion.createState("delay")
                        var loop = subExprRegion.createState("loop")
                        
                        val tmp1 = createValuedObject => [name = GENERATED_PREFIX + "next" + subExpr.key]
                        parent.declarations += createVariableDeclaration(fby.value.inferType) => [
                            valuedObjects += tmp1
                        ]
                        voStore.update(tmp1, SCCHARTS_GENERATED)
                
                        val assignment1 = createAssignment(localVariable, subExpr.value)
                        createImmediateTransitionTo(init, delay) => [
                            effects += assignment1
                        ]
                        
                        val assignment2 = createAssignment(localVariable, tmp1.reference)
                        createTransitionTo(loop, delay) => [
                            effects += assignment2
                        ]
                        
                        if (!subExpr.value.isLastButOneIndex(subExprCopy)) {
                            val tmp2 = createValuedObject => [name = GENERATED_PREFIX + "tmp" + subExpr.key]
                            parent.declarations += createVariableDeclaration(fby.value.inferType) => [
                                valuedObjects += tmp2
                            ]
                            voStore.update(tmp2, SCCHARTS_GENERATED)
                            
                            createImmediateTransitionTo(delay, loop) => [
                                effects += createAssignment(tmp1, tmp2.reference)
                            ]
                            localVariable = tmp2
                        } else {
                            createImmediateTransitionTo(delay, loop) => [
                                effects += createAssignment(tmp1, fby.value.subExpressions.last)
                            ]
                        }
                    }
                }

                fby.value.replace(replacementVar.reference)
            }
        }
    }
    
    private def isLastButOneIndex (Expression subExpr, List<Expression> list) {
        var index = list.indexOf(subExpr)
        if (index == -1) {
            return false
        } else if (index == (list.size - 2)) {
            return true
        } else {
            return false
        }
    }
    
}
