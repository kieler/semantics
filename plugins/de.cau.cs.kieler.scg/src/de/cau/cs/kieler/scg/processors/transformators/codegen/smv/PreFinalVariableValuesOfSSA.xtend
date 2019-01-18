/*
 * RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import javax.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorType

/**
 * @author aas
 */
class PreFinalVariableValuesOfSSA extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.preOfFinalValues"
    }

    override getName() {
        return "Pre Of Final Values"
    }

    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension IOPreserverExtensions
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        for (node: scg.nodes) {
            node.transform
        }
        return scg
    }
    
    private def void transform(Node node) {
        if(node instanceof Conditional) {
            node.condition.transform
        } else if(node instanceof Assignment) {
            node.expression.transform
        }
    }
    
    private def void transform(Expression ex) {
        if(ex instanceof OperatorExpression) {
            if(ex.operator == OperatorType.PRE) {
                val preEx = ex
                for(subEx : preEx.subExpressions) {
                    if(subEx instanceof ValuedObjectReference) {
                        subEx.replaceWithFinalValueOfSSA(preEx)
                    }
                }    
            }
        }
    }
    
    private def void replaceWithFinalValueOfSSA(ValuedObjectReference valuedObjectReference, OperatorExpression parentExpression) {
        val decl = valuedObjectReference.valuedObject.declaration
        if(decl.isSSA) {
            val valuedObject = valuedObjectReference.valuedObject
            val finalValuedObject = decl.valuedObjects.filter[!isRegister && !isTerm].last
            if(finalValuedObject != valuedObject) {
                parentExpression.replaceValuedObjectReferences(valuedObjectReference, finalValuedObject.reference)    
            }
        }
    }
    
    private def void replaceValuedObjectReferences(Expression container, ValuedObjectReference what, ValuedObjectReference with) {
        container.allReferences.forEach[
            if (it.valuedObject == what.valuedObject) it.valuedObject = with.valuedObject
        ]
    }
}
