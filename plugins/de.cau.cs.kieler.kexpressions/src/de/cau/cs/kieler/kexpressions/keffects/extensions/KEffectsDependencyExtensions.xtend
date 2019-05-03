/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.keffects.extensions

import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import java.util.EnumSet
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency

/** 
 * Adapted from SCGDependencyExtensions.
 * SCGDependencyExtensions inherits the included methods. 
 * 
 * @author ssm
 * @kieler.design 2018-05-15 proposed 
 * @kieler.rating 2018-05-15 proposed yellow
 */
class KEffectsDependencyExtensions { 
	
	@Inject extension KExpressionsValueExtensions
	@Inject extension KEffectsExtensions
	
    def DataDependency createDataDependency(DataDependencyType type) {
	 	KEffectsFactory::eINSTANCE.createDataDependency => [ 
	 		it.type = type
	 	]
	 }

    def DataDependency createDataDependency(Linkable source, Linkable target) {
        KEffectsFactory::eINSTANCE.createDataDependency => [ 
            source.outgoingLinks += it
            it.target = target
        ]
    }
    
    def DataDependency createDataDependency(Linkable source, Linkable target, DataDependencyType type) {
    	type.createDataDependency => [ 
    		source.outgoingLinks += it
    		it.target = target
    	]
    }
    
    def ControlDependency createControlDependency(Linkable source, Linkable target) {
        KEffectsFactory::eINSTANCE.createControlDependency => [ 
            source.outgoingLinks += it
            it.target = target
        ]
    }

    def DataDependency checkAndSetConfluence(DataDependency dependency) {
        val sourceNode = dependency.eContainer as Linkable
        val targetNode = dependency.target
        dependency.confluent = false
        if (sourceNode instanceof Assignment) {
            if (targetNode instanceof Assignment) {
                if (sourceNode.operator == AssignOperator.ASSIGN && targetNode.operator == AssignOperator.ASSIGN) {
                    val sourceExpression = sourceNode.expression
                    val targetExpression = targetNode.expression
                    if (sourceExpression.isSameValue(targetExpression)) {
                        dependency.confluent = true
                    } else {
                        // To be downward-compatible, check for operator expression with same value.
                        if (areOldConfluentSetter(sourceNode, targetNode)) {
                            dependency.confluent = true
                        }
                    }
                }
            }
        }
        dependency
    }
    
    def boolean areOldConfluentSetter(Assignment sourceAssignment, Assignment targetAssignment) {
        val sourceExpression = sourceAssignment.expression
        val targetExpression = targetAssignment.expression
        if (sourceExpression instanceof OperatorExpression) {
            if (targetExpression instanceof OperatorExpression) {
                // is legacy relative write
                if (sourceAssignment.valuedObject == targetAssignment.valuedObject &&
                    sourceExpression.eAllContents.filter(ValuedObjectReference).filter[valuedObject == sourceAssignment.valuedObject].size == 1 &&
                    targetExpression.eAllContents.filter(ValuedObjectReference).filter[valuedObject == targetAssignment.valuedObject].size == 1 &&
                    sourceExpression.subExpressions.filter(ValuedObjectReference).exists[valuedObject == sourceAssignment.valuedObject] &&
                    targetExpression.subExpressions.filter(ValuedObjectReference).exists[valuedObject == targetAssignment.valuedObject]) {
                    // Same operator
                    if (sourceExpression.operator == targetExpression.operator) {
                        // both binary operators
                        if (sourceExpression.operator == OperatorType.LOGICAL_OR ||
                            sourceExpression.operator == OperatorType.BITWISE_OR ||
                            sourceExpression.operator == OperatorType.LOGICAL_AND ||
                            sourceExpression.operator == OperatorType.BITWISE_AND) {
                            // Must assign same value
                            if (sourceExpression.subExpressions.size == 2 && targetExpression.subExpressions.size == 2) {
                                // Assume there is only one VO and one literal per OE.
                                val sourceRelativeVOR = sourceExpression.subExpressions.filter(ValuedObjectReference).head
                                val targetRelativeVOR = targetExpression.subExpressions.filter(ValuedObjectReference).head
                                if (sourceRelativeVOR !== null && targetRelativeVOR !== null) {
                                    if (sourceAssignment.valuedObject == sourceRelativeVOR.valuedObject &&
                                        targetAssignment.valuedObject == targetRelativeVOR.valuedObject) {
                                        val sourceValue = sourceExpression.subExpressions.filter(Value).head
                                        val targetValue = targetExpression.subExpressions.filter(Value).head
                                        if (sourceValue.isSameValue(targetValue)) {
                                            return true
                                        }
                                    }
                                }
                            }
                        } else if (EnumSet.of(OperatorType.ADD, OperatorType.DIV, OperatorType.MULT, OperatorType.SUB).contains(sourceExpression.operator)){
                            //algorithmic operations are ok
                            return true
                        }
                    } else if (EnumSet.of(OperatorType.ADD, OperatorType.SUB).contains(sourceExpression.operator) &&
                               EnumSet.of(OperatorType.ADD, OperatorType.SUB).contains(targetExpression.operator) ||
                               EnumSet.of(OperatorType.DIV, OperatorType.MULT).contains(sourceExpression.operator) &&
                               EnumSet.of(OperatorType.DIV, OperatorType.MULT).contains(targetExpression.operator) ) {
                        // confluent operators are ok
                        return true
                    }
                }
            }
        }
        return false
    } 
    
}