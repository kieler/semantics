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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ControlflowRegion
import com.google.inject.Scopes
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts For Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class For extends AbstractExpansionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::FOR_ID
    }

    override getName() {
        return SCChartsTransformation::FOR_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::FOR_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::REFERENCE_ID, SCChartsFeature::MAP_ID) // TODO check MAP dependency
    }

    // -------------------------------------------------------------------------
    @Inject
    extension SCChartsExtension

    @Inject
    extension KExpressionsCreateExtensions

    // @Inject
    // extension KExpressionsValuedObjectExtensions
    @Inject
    extension SCChartsTransformationExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --                             F O R                                   --
    // -------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        for (targetRegion : targetRootState.allContainedControlflowRegions.immutableCopy) {
            targetRegion.transformFor(targetRootState);
        }
        targetRootState.fixAllTextualOrdersByPriorities
    }

    def void transformFor(ControlflowRegion region, State targetRootState) {
        val forData = region.parseFor
        if (forData != null) {
            val firstInstance = region.createState(GENERATED_PREFIX + "For")
            val firstInstanceR = firstInstance.createControlflowRegion(GENERATED_PREFIX + "ForInstance")
            for (subState : region.states.toList.immutableCopy) {
                if (subState != firstInstance) {
                    firstInstanceR.states.add(subState)
                }
            }

            val start = region.createInitialState(GENERATED_PREFIX + "startFor")
            val end = region.createFinalState(GENERATED_PREFIX + "endFor")

            var State lastInstance = firstInstance
            for (var c = forData.start + 1; c <= forData.end; c++) {
                val instance = region.createState(GENERATED_PREFIX + "For" + c)
                instance.regions.add(firstInstanceR.copy)
                if (lastInstance != null) {
                    // connect
                    lastInstance.createTransitionTo(instance).setTypeTermination.effects.add(
                        forData.valuedObject.assign(c.createIntValue))
                }

                lastInstance = instance
            }

            start.createImmediateTransitionTo(firstInstance).effects.add(
                forData.valuedObject.assign(forData.start.createIntValue))
            lastInstance.createTransitionTo(end).setTypeTermination

            // Reset the region label
            region.label = ""
        // val regionCopy = 
        // val startState = region.c
        }
    }

    public static class ForData {
        ValuedObject valuedObject;
        int start;
        int end;
    }

    def public ForData parseFor(Region region) {
        if (region.label == null) {
            return null
        }
        val data0 = region.label.trim
        System.out.println("FOR label '" + data0 + "' ")
        
        if (!data0.startsWith("for")) {
            return null
        }
        val data1 = data0.substring(3).split("=");
        if (data1.nullOrEmpty || data1.size != 2) {
            return null;
        }
        val valuedObjectName = data1.get(0).trim()
        val data2 = data1.get(1).trim().split("to")
        if (data2.nullOrEmpty || data2.size != 2) {
            return null;
        }
        val vStart = data2.get(0).trim
        val vEnd = data2.get(1).trim
        val ForData returnData = new ForData()
        returnData.valuedObject = region.findValuedObject(valuedObjectName)
        try {
            returnData.start = Integer.parseInt(vStart)
        } catch (Exception e) {
        }
        try {
            returnData.end = Integer.parseInt(vEnd)
        } catch (Exception e) {
        }
        if (returnData.start > returnData.end) {
            return null;
        }
        returnData
    }

    def public ValuedObject findValuedObject(Region region, String valuedObjectName) {
        System.out.println("FOR findValuedObject find '" + valuedObjectName + "' ")
        if (region.parentState != null) {
            val list = region.parentState.valuedObjects.filter[e|e.name.equals(valuedObjectName)].toList
            if (!list.nullOrEmpty) {
                System.out.println("FOR findValuedObject" + list.size)
                return list.get(0)
            }
            if (region.parentState.parentRegion != null) {
                return region.parentState.parentRegion.findValuedObject(valuedObjectName)
            }
        }
        return null;
    }

}
