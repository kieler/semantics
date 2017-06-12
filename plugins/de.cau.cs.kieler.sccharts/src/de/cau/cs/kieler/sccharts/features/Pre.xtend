/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.features

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.Iterator
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * SCCharts Pre Feature.
 * 
 * @author cmot
 * @kieler.design 2015-03-12 proposed 
 * @kieler.rating 2015-03-12 proposed yellow
 */
class Pre extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsFeature::PRE_ID
    }

    override getName() {
        return SCChartsFeature::PRE_NAME
    }

    //-------------------------------------------------------------------------
    @Inject
    extension SCChartsExtension

    @Inject
    extension KExpressionsValuedObjectExtensions

    // This method checks, if this feature is contained in a model
    def isContained(State model) {
        for (state : model.allStates.toIterable) {
            val allActions = state.eAllContents.filter(typeof(Action)).toList
            val allPreValuedObjects = state.valuedObjects.filter(
                valuedObject|
                    allActions.filter(
                        action|
                            action.getPreExpression(valuedObject).hasNext ||
                                action.getPreValExpression(valuedObject).hasNext).size > 0)

            if (allPreValuedObjects.size > 0) {
                return true
            }
        }
        return false
    }

    //-------------------------------------------------------------------------
    // Return a list of Pre Expressions for an action that references the valuedObject
    def Iterator<OperatorExpression> getPreExpression(Action action, ValuedObject valuedObject) {
        //val List<OperatorExpression> returnPreExpressions = <OperatorExpression>newLinkedList
        val preExpressions = action.eAllContents.filter(typeof(OperatorExpression)).filter(
            e|
                (e.operator == OperatorType::PRE) && (e.subExpressions.size() == 1) &&
                    (e.subExpressions.get(0) instanceof ValuedObjectReference) &&
                    ((e.subExpressions.get(0) as ValuedObjectReference).valuedObject == valuedObject)
        )
        preExpressions
    }

    // Return a list of Pre Expressions for an action that references the value of a valuedObject
    def Iterator<OperatorExpression> getPreValExpression(Action action, ValuedObject valuedObject) {
        //val List<OperatorExpression> returnPreValExpressions = <OperatorExpression>newLinkedList
        val preValExpressions = action.eAllContents.filter(typeof(OperatorExpression)).filter(
            e|
                (e.operator == OperatorType::PRE) && (e.subExpressions.size() == 1) &&
                    (e.subExpressions.get(0) instanceof OperatorExpression) &&
                    ((e.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL) &&
                    ((e.subExpressions.get(0) as OperatorExpression).subExpressions.size() == 1) &&
                    ((e.subExpressions.get(0) as OperatorExpression).subExpressions.get(0) instanceof ValuedObjectReference) && (((e.
                        subExpressions.get(0) as OperatorExpression).subExpressions.get(0) as ValuedObjectReference).
                        valuedObject == valuedObject)
        )
        preValExpressions
    }
    
    def isContained(SCCharts sccharts) {
        for(s:sccharts.rootStates) {
            if (s.isContained) return true
        }
        false
    }     
    
}
