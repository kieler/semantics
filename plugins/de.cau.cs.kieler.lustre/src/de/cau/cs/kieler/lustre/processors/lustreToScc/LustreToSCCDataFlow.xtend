/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State

/**
 * @author lgr
 *
 */
class LustreToSCCDataFlow extends LustreBasicToSCC {

    static final String DATAFLOW_REGION_PREFIX = "dataflow_region_for_"

    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SC DF"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override processAutomaton(Automaton automaton, State state) {
        throw new UnsupportedOperationException("Automatons are not part of the supported Lustre language features.")
    }
    
    override processAssertion(Expression assertion, State state) {
        throw new UnsupportedOperationException("Assertions are not part of the supported Lustre language features.")
    }

    override processEquation(Assignment equation, State state) {
        // Search for a dataflow region within the state
        val dataFlowRegionsList = state.regions.filter[it instanceof DataflowRegion].toList;

        // If there is no dataflow region, create one
        if (dataFlowRegionsList.length == 0) {
            var dfRegion = createDataflowRegion => [
                name = DATAFLOW_REGION_PREFIX + state.name
                label = DATAFLOW_REGION_PREFIX + state.name
            ]
            state.regions += dfRegion
            dataFlowRegionsList += dfRegion
        }
        
        // Take the first dataflow region for creating the equation
        var dataflowRegion = dataFlowRegionsList.head as DataflowRegion
        
        if (lustreToScchartsValuedObjectMap.containsKey(equation.reference.valuedObject)) {
            val kExpressionValuedObject = lustreToScchartsValuedObjectMap.get(equation.reference.valuedObject)
            var dataflowAssignment = createAssignment => [
                reference = kExpressionValuedObject.reference
                operator = AssignOperator.ASSIGN
                expression = equation.expression.transformExpression(state)
            ]
            if (dataflowAssignment.expression !== null) {
                dataflowRegion.equations += dataflowAssignment
            }
        }
    }
        
        
}