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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Scope

/**
 * SCCharts Const Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-22 proposed 
 * @kieler.rating 2014-05-22 proposed yellow
 */
class Const extends AbstractExpansionTransformation implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::CONST_ID
    }

    override getName() {
        return SCChartsTransformation::CONST_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::CONST_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::CONNECTOR_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::REFERENCE_ID)
    }

    // -------------------------------------------------------------------------
    @Inject
    extension AnnotationsExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension ValuedObjectRise

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    static private final String HOSTCODE_ANNOTATION = "alterHostcode"

    // -------------------------------------------------------------------------
    // --                           C O N S T                                 --
    // -------------------------------------------------------------------------
    def State transform(State rootState) {
        var targetRootState = rootState

        targetRootState.transformValuedObjectRise

        // Traverse all states
        for (scopes : targetRootState.getAllScopes.toList) {
            scopes.transformConst
        }
        targetRootState;
    }

    def void transformConst(Scope scope) {
        val constObjects = scope.valuedObjects.filter[isConst && initialValue != null].toList

        for (const : constObjects) {
            val replacement = const.initialValue
            replacement.trace(const)
            replacement.trace(const.declaration)
            
            // Replace references
            for (vor : scope.eAllContents.filter(ValuedObjectReference).filter[valuedObject == const].toIterable) {
                vor.replace(replacement.copy)
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
                    else if (replacement instanceof DoubleValue)
                        replacementString = (replacement as DoubleValue).value.toString
                    else if (replacement instanceof TextExpression)
                        replacementString = (replacement as TextExpression).text
                    text = text.replaceAll(const.name, replacementString)
                ]
            }
            
        }
        constObjects.forEach[deleteAndCleanup]

    }

}
