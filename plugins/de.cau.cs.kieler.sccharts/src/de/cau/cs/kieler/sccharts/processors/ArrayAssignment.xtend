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
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.SCLFactory
import java.util.Iterator
import java.util.List
import java.util.function.Supplier
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.lib.Functions.Function3

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts Array initialisation Transformation.
 * 
 * @author kolja
 */
class ArrayAssignment extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.arrayAssignment"
    }

    override getName() {
        "Array Assignment"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsSerializeHRExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------
    // --             A R R A Y    A S S I G N M E N T                  --
    // -------------------------------------------------------------------

    /*
     * First step:
     * computes vector expressions like {a,b} * 4 to {a,b,a,b,a,b,a,b}
     * and {a,b} + {c,d} to {a,b,c,d}
     * example: {{1} * 3 + {2} * 2, 2 * {1}} * 2 will be {{1,1,1,2,2,1,1}, {1,1}, {1,1,1,2,2,1,1}, {1,1}}
     * Second step:
     * expand statements like y[1] = {1,2} to
     * y[1][0] = 1
     * y[1][1] = 2
     * also y[0] = {{0,1},{2,3}} is replaced by
     * y[0][0][0] = 0
     * y[0][0][1] = 1
     * y[0][1][0] = 2
     * y[0][1][1] = 3
     * also expands { 1 to 5 } and { 1 to X }
     */
    def State transform(State rootState) {
        // Traverse all transitions
        rootState.allContainedActions.forEach[transformArrayAssignments]
        
        // Traverse all method bodies
        rootState.allScopes.map[declarations.iterator].flatten.<Declaration, Iterator<? extends MethodImplementationDeclaration>>map[
            if (it instanceof MethodImplementationDeclaration) {
                #[it as MethodImplementationDeclaration].iterator
            } else if (it instanceof ClassDeclaration) {
                it.eAllContents.filter(MethodImplementationDeclaration)
            } else {
                null
            }
        ].filterNull.flatten.forEach[transformArrayAssignments]
        
        rootState
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }
    
    private def void transformArrayAssignments(Action action) {
        transformArrayAssignments(action, [
            KEffectsFactory.eINSTANCE.createAssignment
        ],[ EObject container, Assignment asm, List<Assignment> newAsms | 
            val effects = (container as Action).effects
            effects.addAll(effects.indexOf(asm), newAsms)
            effects.remove(asm)
            null
        ])
    }
    
    private def void transformArrayAssignments(MethodImplementationDeclaration method) {
        transformArrayAssignments(method, [
            SCLFactory.eINSTANCE.createAssignment
        ],[ EObject container, Assignment asm, List<Assignment> newAsms | 
            val statments = (container as MethodImplementationDeclaration).statements
            statments.addAll(statments.indexOf(asm), newAsms.map[it as de.cau.cs.kieler.scl.Assignment])
            statments.remove(asm)
            newAsms.take((asm as de.cau.cs.kieler.scl.Assignment).semicolon ? newAsms.size : newAsms.size - 1).forEach[
                (it as de.cau.cs.kieler.scl.Assignment).semicolon = true
            ]
            null
        ])
    }     

    private def void transformArrayAssignments(EObject container, Supplier<Assignment> assignmentCreator, Function3<EObject, Assignment, List<Assignment>, Object> assignmentReplacer) {
        var again = false
        do {
            again = false
            val assignments = container.allContainedVectorAssignments // only process assignmnets with vector values
            for (assignment : assignments) {
                assignment.expression = assignment.expression?.computeVectorValues
                assignment.validate
                if (assignment.reference.valuedObject !== null && assignment.reference.lowermostReference.valuedObject.array && assignment.expression instanceof VectorValue) {
                    var index = 0
                    var values = <Expression>newArrayList
                    values.addAll((assignment.expression as VectorValue).values)
                    val List<Assignment> newAssignments = newArrayList
                    for (v : values) {
                        again = again || v instanceof VectorValue
                        val newAsm = assignmentCreator.get()
                        newAssignments += newAsm
                        newAsm.reference = assignment.reference.copy
                        newAsm.expression = v
                        newAsm.operator = assignment.operator
                        val ref = newAsm.reference.lowermostReference
                        ref.indices.clear
                        for (i : assignment.reference.lowermostReference.indices) {
                            ref.indices.add(i.copy())
                        }
                        ref.indices.add(createIntValue(index++))
                    }
                    
                    assignmentReplacer.apply(container, assignment, newAssignments)
                }
            }
        } while (again)
    }
    
    private def allContainedVectorAssignments(EObject container) {
        val assignments = newLinkedHashSet
        for (vv : container.eAllContents.filter(VectorValue).toIterable) {
            var parent = vv.eContainer
            while(parent !== null) {
                if (parent instanceof Assignment) {
                    assignments += parent
                    parent = null
                } else {
                    parent = parent.eContainer
                }
            }
        } 
        return assignments
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
        if (e.range) {
            val start = (e.values.head as IntValue).value
            val end = (e.values.last as IntValue).value
            e.values.clear
            e.values.addAll((new IntegerRange(start, end)).map[createIntValue(it)])
            e.range = false
        } else {
            for (v : e.values.immutableCopy) {
                v.replace(v.computeVectorValues)
            }
        }
        return e
    }

    private def dispatch Expression computeVectorValues(Expression e) {
        return e
    }

    private def validate(Assignment asm) {
        val targetRef = asm.reference.lowermostReference
        val targetVO = targetRef.valuedObject
        if (targetVO.array && !(asm.expression instanceof VectorValue) && !(asm.expression instanceof ValuedObjectReference)) {
            if (targetRef.indices.size != targetVO.cardinalities.size) {
                getEnvironment().errors.add(
                    "Cardinalities do not match. " + targetRef.serializeHR.toString + " is an array of dimension " +
                        (targetVO.cardinalities.size - targetRef.indices.size) +
                        " but only a single value is given.", asm.eContainer, true)
            }
        }
        if (targetVO.array && asm.expression instanceof VectorValue) {
            if (targetVO.cardinalities.drop(targetRef.indices.size).empty) {
                getEnvironment().errors.add(
                    "Cardinalities do not match. " + targetRef.serializeHR.toString +
                        " is not an array but a vector of size " + (asm.expression as VectorValue).values.size +
                        " is given.", asm.eContainer, true)
            }
            var depth = 0
            for (card : targetVO.cardinalities.drop(targetRef.indices.size)) {
                if (card instanceof IntValue) {
                    var expressions = #[asm.expression]
                    for (var d = 0; d < depth; d++) {
                        val deeperExpressions = <Expression>newArrayList
                        for (e : expressions) {
                            if (e instanceof VectorValue) {
                                deeperExpressions += e.values
                            } else if (!(e instanceof ValuedObjectReference)) {
                                getEnvironment().errors.add(
                                    "Cardinalities do not match. " + targetRef.serializeHR.toString +
                                        " at dimension " + d + " is an array of size " + card.value +
                                        " but only a single value is given.", asm.eContainer, true)
                            }
                        }
                        expressions = deeperExpressions
                    }
                    for (e : expressions) {
                        if (e instanceof VectorValue) {
                            if (e.values.size > card.value) {
                                getEnvironment().errors.add(
                                    "Cardinalities do not match. " + targetRef.serializeHR.toString +
                                        " at dimension " + depth + " is an array of size " + card.value +
                                        " but a vector of size " + e.values.size + " is given.", asm.eContainer, true)
                            }
                        } else if (!(e instanceof ValuedObjectReference)) {
                            getEnvironment().errors.add(
                                "Cardinalities do not match. " + targetRef.serializeHR.toString +
                                    " at dimension " + depth + " is an array of size " + card.value +
                                    " but only a single value is given.", asm.eContainer, true)
                        }
                    }
                }
                depth++
            }
        }
    }
}
