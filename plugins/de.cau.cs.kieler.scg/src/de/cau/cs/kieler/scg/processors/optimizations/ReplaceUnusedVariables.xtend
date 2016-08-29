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
package de.cau.cs.kieler.scg.processors.optimizations

import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.transformation.Processor
import de.cau.cs.kieler.scg.processors.SCGProcessors

/**
 * Replaces only initialized but never rewritten variables by constants
 * TODO replaces only variables in conditionals, could be exteded
 * TODO initial value null -> take as false
 * 
 * @author krat ssm 
 * @kieler.design 2015-05-25 proposed 
 * @kieler.rating 2015-05-25 proposed yellow
 *
 */
class ReplaceUnusedVariables extends Processor implements Traceable {

    override getId() {
        return SCGProcessors::REPLACEUNUSEDVARIABLES_ID
    }
    
    override process(EObject eObject) {
        System.out.println("ReplaceUnusedVariables")
        val scg = eObject as SCGraph

        // TODO maybe others...
        scg.declarations.filter[input != true && output != true].forEach [
            for (valObj : it.valuedObjects) {
                System.out.println("1" + valObj.initialValue)
                if (valObj.neverAssigned(scg)) {
                    System.out.println("2: " + valObj + valObj.initialValue)
                    replaceObjByConst(valObj, scg)
                    // TODO remove declaration
                }
            }
        ]

        scg
    }

    def Boolean neverAssigned(ValuedObject valObj, SCGraph scg) {
        scg.nodes.filter[it instanceof Assignment].filter [
            (it as Assignment).valuedObject == valObj
        ].empty
    }

    def replaceObjByConst(ValuedObject valObj, SCGraph scg) {
        scg.nodes.filter[it instanceof Conditional].forEach [
            val expr = (it as Conditional).condition.replaceValObjRef(valObj)
            (it as Conditional).condition = expr
        ]
    }

    def dispatch Expression replaceValObjRef(OperatorExpression expr, ValuedObject valObj) {

        // Only evaluate simple NOT expressions
        // TODO enhance
        if (expr.operator == OperatorType::NOT && expr.subExpressions.length == 1 &&
            (expr.subExpressions.head instanceof ValuedObjectReference)) {
            val newSubExpr = expr.subExpressions.head.replaceValObjRef(valObj)
            // If valObjRef was replaced by a bool, negate it
            if (newSubExpr instanceof BoolValue) {
                return KExpressionsFactory::eINSTANCE.createBoolValue => [
                    value = !(newSubExpr as BoolValue).value
                ]
            }
            val opExpr = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = expr.operator
                subExpressions.add(newSubExpr)
            ]
            return opExpr
        }

        return expr
    }

    def dispatch Expression replaceValObjRef(ValuedObjectReference valObjRef, ValuedObject valObj) {
        if (valObjRef.valuedObject.name == valObj.name && valObj.initialValue == null) {
            return KExpressionsFactory::eINSTANCE.createBoolValue => [
                value = false
            ]
        } else if (valObjRef.valuedObject.name == valObj.name) {
            return valObj.initialValue
        }

        valObjRef
    }
        
    
}
