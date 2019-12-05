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
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts Array initialisation Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ArrayAssignment extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.arrayAssignment"
    }

    override getName() {
        "Array assignment"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------
    // --             A R R A Y    A S S I G N M E N T                  --
    // -------------------------------------------------------------------
    // First step:
    // computes vector expressions like {a,b} * 4 to {a,b,a,b,a,b,a,b}
    // and {a,b} + {c,d} to {a,b,c,d}
    // example: {{1} * 3 + {2} * 2, 2 * {1}} * 2 will be {{1,1,1,2,2,1,1}, {1,1}, {1,1,1,2,2,1,1}, {1,1}}
    // Second step:
    // expand statements like y[1] = {1,2} to
    // y[1][0] = 1
    // y[1][1] = 2
    // also y[0] = {{0,1},{2,3}} is replaced by
    // y[0][0][0] = 0
    // y[0][0][1] = 1
    // y[0][1][0] = 2
    // y[0][1][1] = 3
    def State transform(State rootState) {
        // Traverse all transitions
        rootState.allContainedTransitions.forEach [ targetTransition |
            targetTransition.transformTransitionTrigger;
        ]
        rootState
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    private def void transformTransitionTrigger(Transition transition) {
        var again = false
        do {
            again = false
            val assignments = transition.allContainedAssignments.toList
            for (assignment : assignments) {
                assignment.expression = assignment.expression.computeVectorValues
                if (assignment.reference.valuedObject !== null && assignment.reference.valuedObject.array &&
                    assignment.expression instanceof VectorValue) {
                    var index = 0
                    var values = <Expression>newArrayList
                    values.addAll((assignment.expression as VectorValue).values)
                    for (v : values) {
                        again = again || v instanceof VectorValue
                        val newAss = transition.createAssignment(assignment.reference.valuedObject, v)
                        newAss.operator = assignment.operator
                        newAss.reference.indices.clear
                        for (i : assignment.reference.indices) {
                            newAss.reference.indices.add(i.copy())
                        }
                        newAss.reference.indices.add(createIntValue(index++))
                    }
                    transition.effects.remove(assignment)
                }
            }
        } while (again)
    }

    private def dispatch Expression computeVectorValues(OperatorExpression e) {
        for (sub : e.subExpressions.immutableCopy) {
            sub.replace(sub.computeVectorValues)
        }
        if (e.subExpressions.filter(VectorValue).size > 0) {
            if (e.operator == OperatorType.ADD) {
                val value = createVectorValue
                for (expr : e.subExpressions.immutableCopy) {
                    if (expr instanceof VectorValue) {
                        for (v : (expr as VectorValue).values.immutableCopy) {
                            value.values.add(v)
                        }
                    } else {
                        value.values.add(expr)
                    }
                }
                return value
            }
            if (e.operator == OperatorType.MULT) {
                if (e.subExpressions.filter(VectorValue).size != 1 || e.subExpressions.size != 2) {
                    return e
                }
                val vector = e.subExpressions.filter(VectorValue).head
                val value = e.subExpressions.filter[!(it instanceof VectorValue)].head
                if (value instanceof IntValue) {
                    val result = createVectorValue
                    for (var i = 0; i < value.value; i++) {
                        for (v : vector.values) {
                            result.values.add(v.copy)
                        }
                    }
                    return result
                }
            }
        }
        return e
    }

    private def dispatch Expression computeVectorValues(VectorValue e) {
        for (v : e.values.immutableCopy) {
            v.replace(v.computeVectorValues)
        }
        return e
    }

    private def dispatch Expression computeVectorValues(Expression e) {
        return e
    }
}
