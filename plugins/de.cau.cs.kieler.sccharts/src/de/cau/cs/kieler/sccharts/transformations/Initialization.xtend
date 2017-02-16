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
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.Scope
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * SCCharts Initialization Transformation.
 * 
 * @author cmot ssm
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
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsValuedObjectExtensions    

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
        for (scope : targetRootState.getAllScopes.immutableCopy) {
            scope.transformInitialization(targetRootState);
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformInitialization(Scope scope, State targetRootState) {
        val valuedObjects = scope.valuedObjects.filter[initialValue != null]
        var addedIndex = 0; // This helps to preserve the initial order

        if (!valuedObjects.nullOrEmpty) {
            for (valuedObject : valuedObjects) {
                setDefaultTrace(valuedObject, valuedObject.declaration)
                
                // Initialization combined with existing entry action: The order in which new, 
                // additional initialization-entry actions are added matters for the semantics.
                // Initializations before part of the declaration. Entry actions afterwards. 
                // So the initialization-entry-actions should be ordered also before the other
                // entry actions to keep the original order. 
                if (scope instanceof State) {
                    val entryAction = scope.createEntryAction(addedIndex)
                    addedIndex = addedIndex + 1
                    entryAction.addAssignment(valuedObject.assign(valuedObject.initialValue.copy))
                } else {
                    val entryAction = (scope.eContainer as State).createEntryAction(addedIndex)
                    addedIndex = addedIndex + 1
                    entryAction.addAssignment(valuedObject.assign(valuedObject.initialValue.copy))
                }
                valuedObject.setInitialValue(null)
            }
        }
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
