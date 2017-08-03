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

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * SCCharts ValuedObject Transformation. Rises valued objects declared in regions to its
 * parent states.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ValuedObjectRise {


    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsTransformationExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --                            VALUED OBJECT                           --
    // -------------------------------------------------------------------------
    // TODO: for inputs no during action!
    // TODO: relative writes!!
    public static val String variableValueExtension = GENERATED_PREFIX + "val";
    private static val String variableCurrentValueExtension = GENERATED_PREFIX + "curval";

    // Transforming a signal to a variable. 
    def State transformValuedObjectRise(State rootState) {
        val targetRootState = rootState
        
        // Traverse all states
        targetRootState.allContainedControlflowRegions.forEach [ targetState |
            targetState.transformValuedObjectRise(targetRootState);
        ]
        targetRootState;
    }

    // Traverse all states and transform outgoing normal termination transitions into weak aborts
    def void transformValuedObjectRise(ControlflowRegion region, State targetRootState) {
        if (!region.declarations.nullOrEmpty) {
            
            val regionId = GENERATED_PREFIX + "region" + region.parentState.regions.indexOf(region)
            
            for (valuedObject : region.valuedObjects) {
                valuedObject.setName(regionId + GENERATED_PREFIX +
                    valuedObject.name)
            }
            
            region.parentState.declarations.addAll(region.declarations)
        }
    }

}
