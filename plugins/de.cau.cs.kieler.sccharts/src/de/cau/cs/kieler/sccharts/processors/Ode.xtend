/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * SCCharts ODE Transformation.
 * 
 * @author lgr
 */
class Ode extends SCChartsProcessor implements Traceable {

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.ode"
    }
    
    override getName() {
        "ODE Functions"
    }

    override process() {
        setModel(model.transform)
    }
    
    def State transform(State rootState) {
        rootState.getAllStates.toList.forEach [ targetState |
            targetState.transformOde(rootState)
        ]
        rootState
    }

    def void transformOde(State state, State targetRootRegion) {
        
        for (odeAction : state.odeActions.toList) {
            for (odeAssignment : odeAction.effects.filter[it instanceof Assignment]) {
                val vo = getDT(targetRootRegion)

                val multExpression = createMultExpression => [
                    subExpressions += (odeAssignment as Assignment).expression;
                    subExpressions += vo.reference
                ]
                val assignment = (odeAssignment as Assignment).valuedObject.createAssignment(multExpression,AssignOperator.ASSIGNADD)

                state.createImmediateDuringAction => [effects += assignment]

                state.actions.remove(odeAction)

            }
        }
        
    }
    
    def ValuedObject getDT(State rootState) {
        val vo = TimedAutomata.findDeltaT(rootState)
        if (vo === null) {
            environment.errors.add("The variable " + TimedAutomata.DELTA_T_NAME + " should already exist at this point!")
        }
        return vo
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
}