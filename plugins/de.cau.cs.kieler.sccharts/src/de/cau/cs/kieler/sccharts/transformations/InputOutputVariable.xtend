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

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts InputOutputVariable Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class InputOutputVariable {

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--          I N P U T   O U T P U T   V A R I A B L E                  --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.copy.fixAllPriorities;

        // Traverse all states
        for (targetTransition : targetRootState.getAllContainedStates.immutableCopy) {
            targetTransition.transformInputOutputVariable(targetRootState);
        }
        targetRootState;
    }

    def void transformInputOutputVariable(State state, State targetRootState) {
        //TODO
    }

}
