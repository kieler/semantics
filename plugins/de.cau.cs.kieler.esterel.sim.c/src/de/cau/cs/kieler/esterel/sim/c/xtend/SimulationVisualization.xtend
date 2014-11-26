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
package de.cau.cs.kieler.esterel.sim.c.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.sim.c.EsterelCSimulationPlugin
import de.cau.cs.kieler.esterel.esterel.Program

/**
 * This class handles the<BR>
 *   - Simulation visualization<BR>
 * 
 * @author cmot
 * @kieler.design 2014-11-26 proposed cmot
 * @kieler.rating 2014-11-26 proposed yellow
 */
class SimulationVisualization {

    @Inject
    extension KExpressionsExtension

//    @Inject
//    extension Esterel

    //-------------------------------------------------------------------------
    //--         S I M U L A T I O N    V I S U A L I Z A T I O N            --
    //-------------------------------------------------------------------------
    // TODO: Describe
    var AUXILIARY_VARIABLE_TAG_STATE = EsterelCSimulationPlugin::AUXILIARY_VARIABLE_TAG

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    def Program transformNoVisualization(Program model) {
        // The default does nothing
        model
    }

    def Program transformVisualization(Program model) {
        // The default does nothing
        
        // TODO: enable visualization
        model
    }

}
