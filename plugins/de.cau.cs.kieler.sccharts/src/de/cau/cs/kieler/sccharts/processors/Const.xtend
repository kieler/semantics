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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension java.lang.String.*

/**
 * SCCharts Const Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-22 proposed 
 * @kieler.rating 2014-05-22 proposed yellow
 */
class Const extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.sccharts.processors.const"
    
    override getId() {
        ID
    }

    override getName() {
        "Const"
    }

    override process() {
        setModel(model.transform)
    }


    extension PartialExpressionEvaluator par = new PartialExpressionEvaluator() => [ 
        compute = true
    ]

    // -------------------------------------------------------------------------
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCChartsScopeExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    static final String HOSTCODE_ANNOTATION = "alterHostcode"

    // -------------------------------------------------------------------------
    // --                           C O N S T                                 --
    // -------------------------------------------------------------------------
    def State transform(State rootState) {
        var targetRootState = rootState

        // Traverse all states
        for (scope : targetRootState.getAllScopes.filter[ it.hasConstant ].toList) {
            scope.evaluateExpressions
            scope.transformConst
        }
        targetRootState;
    }
    
    def void transformConst(Scope scope) {
        val constObjects = newArrayList
        for (d : scope.declarations) {
            if (d instanceof ClassDeclaration) {
                for (vo : d.allNestedValuedObjects.filter[isConst && initialValue !== null]) {
                    constObjects += vo
                }
            } else if (d instanceof VariableDeclaration) {
                if (d.isConst) {
                    for (vo : d.valuedObjects.filter[initialValue !== null]) {
                        constObjects += vo
                    }
                }
            }
        }

        for (const : constObjects) {
            val replacement = const.initialValue
            replacement.trace(const)
            replacement.trace(const.declaration)
            
            // Replace references
            for (vor : scope.eAllContents.filter(ValuedObjectReference).filter[valuedObject == const].toIterable) {
                val container = vor.eContainer
                val coniainingFeature = vor.eContainingFeature 
                if (replacement instanceof Value && container instanceof Assignment && coniainingFeature == KEffectsPackage.Literals.ASSIGNMENT__REFERENCE) {
                    environment.errors.add("Cannot replace left hand side of assignment by a value. (Trying to replace " + vor?.valuedObject + " by " + replacement + " in " + (vor.eContainer as Assignment) + ")")
                } else {
                    if (!vor.indices.nullOrEmpty) {
                        var arrayElement = replacement
                        for (idx : vor.indices) {
                            if (arrayElement !== null) {
                                if (idx instanceof IntValue) {
                                    val idxVal = idx.value
                                    if (arrayElement instanceof VectorValue) {
                                        if (idxVal >= 0 && idxVal < arrayElement.values.size) {
                                            arrayElement = arrayElement.values.get(idxVal)
                                        } else {
                                            environment.errors.add("Cannot insert const array element. Array %s does not provide a value for index %s.".format(const.name, idxVal))
                                            arrayElement = null
                                        }
                                    } else {
                                        environment.errors.add("Cannot insert const array element. Array %s must be initialized with a vector value.".format(const.name))
                                        arrayElement = null
                                    }
                                } else {
                                    environment.errors.add("Cannot insert const array element. %s is not a valid index (integer value).".format(idx?.toString))
                                    arrayElement = null
                                }
                            }
                        }
                        if (arrayElement !== null) {
                            vor.topmostReference.replace(arrayElement.copy)
                        }
                    } else {
                        vor.topmostReference.replace(replacement.copy)
                    }
                    // If replaced size in array cardinality
                    if (container instanceof ValuedObject && coniainingFeature == KExpressionsPackage.Literals.VALUED_OBJECT__CARDINALITIES) {
                        // Update size in VO store
                        voStore.update(container as ValuedObject)
                    }
                }
            }
            
            if (const.declaration.hasAnnotation(HOSTCODE_ANNOTATION)) {
                scope.eAllContents.filter(typeof(TextExpression)).forEach [
                    var replacementString = ""
                    if (replacement instanceof IntValue)
                        replacementString = (replacement as IntValue).value.toString
                    else if (replacement instanceof BoolValue)
                        replacementString = (replacement as BoolValue).value.toString
                    else if (replacement instanceof FloatValue)
                        replacementString = (replacement as FloatValue).value.toString
                    else if (replacement instanceof TextExpression)
                        replacementString = (replacement as TextExpression).text
                    text = text.replaceAll(const.name, replacementString)
                ]
            }
        }
        constObjects.forEach[ removeFromContainmentAndCleanup; voStore.remove(it) ]

    }
    
    def void evaluateExpressions(Scope scope) {
        val constObjects = scope.valuedObjects.filter[isConst && initialValue !== null].toList
        
        for (vo : constObjects) {
            vo.initialValue.evaluateAndReplace
            if (vo.initialValue instanceof Value) {
                par.values.put(vo, vo.initialValue as Value)
            } 
        }
    }
    
    
    def boolean hasConstant(Scope scope) {
        return scope.declarations.exists[
            if (it instanceof ClassDeclaration) {
                return it.allNestedValuedObjects.filter[it.isVariableReference].exists[it.variableDeclaration.isConst]
            } else if (it instanceof VariableDeclaration) {
                return it.isConst
            }
            return false
        ]
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
