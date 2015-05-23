/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/**
 * SCCharts Initialization Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Initialization extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::INITIALIZATION_ID
    }

    override getName() {
        return SCChartsTransformation::INITIALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::INITIALIZATION_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::ENTRY_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                       I N I T I A L I Z A T I O N                   --
    //-------------------------------------------------------------------------
    // @requires: entry actions
    // Transforming Variable Initializations
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        for (targetState : targetRootState.getAllStates.immutableCopy) {
            targetState.transformInitialization(targetRootState);
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformInitialization(State state, State targetRootState) {
        val valuedObjects = state.valuedObjects.filter[initialValue != null]

        if (!valuedObjects.nullOrEmpty) {
            for (valuedObject : valuedObjects) {
                valuedObject.setDefaultTrace
                val entryAction = state.createEntryAction
                entryAction.addAssignment(valuedObject.assign(valuedObject.initialValue.copy))
                valuedObject.setInitialValue(null)
            }
        }
    }

}
