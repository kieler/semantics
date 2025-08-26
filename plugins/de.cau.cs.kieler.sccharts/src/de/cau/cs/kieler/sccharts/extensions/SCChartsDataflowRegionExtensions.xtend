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
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.DataflowAssignment
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsDataflowRegionExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def getDataflowRegions(State state) {
        state.regions.filter(DataflowRegion)
    }
    
    def boolean containsDataflowRegions(State state) {
        !state.regions.filter(DataflowRegion).empty
    }    

    def DataflowRegion createDataflowRegion(String id, String label) {
        SCChartsFactory::eINSTANCE.createDataflowRegion => [
            setName(id)
            setLabel(label)
        ]
    }

    def DataflowRegion createDataflowRegion(String id) {
        createDataflowRegion(id, "")
    }
    
    def DataflowRegion createDataflowRegion(State state, String id) {
        createDataflowRegion(id, "") => [ state.regions += it ]
    }
    
    def isSequential(Assignment a){
        (a instanceof DataflowAssignment) && (a as DataflowAssignment).sequential
    }
    
    def DataflowAssignment createDataflowAssignment(ValuedObject valuedObject, Expression expression) {
        SCChartsFactory.eINSTANCE.createDataflowAssignment => [
            it.reference = valuedObject.reference
            it.expression = expression
        ]
    }
    
    def DataflowAssignment createDataflowAssignment(ValuedObject valuedObject, ValuedObject subValuedObject, Expression expression) {
        SCChartsFactory.eINSTANCE.createDataflowAssignment => [
            it.reference = valuedObject.reference
            it.reference.subReference = subValuedObject.reference
            it.expression = expression
        ]
    }
    
    def DataflowAssignment createDataflowAssignment(ValuedObject valuedObject, Expression expression, AssignOperator operator) {
        SCChartsFactory.eINSTANCE.createDataflowAssignment => [
            it.reference = valuedObject.reference
            it.expression = expression
            it.operator = operator
        ]
    }
}