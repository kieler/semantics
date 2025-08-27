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
package de.cau.cs.kieler.esterel.sim.c

import com.google.common.collect.Sets
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.features.EsterelFeature
import de.cau.cs.kieler.esterel.transformations.EsterelTransformation
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation

/**
 * This class handles the default NO simulation visualization
 * 
 * @author cmot
 * @kieler.design 2014-07-23 proposed cmot
 * @kieler.rating 2014-07-23 proposed yellow
 */
class NoSimulationVisualization extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return EsterelTransformation::NOSIMULATIONVISUALIZATION_ID
    }

    override getName() {
        return EsterelTransformation::NOSIMULATIONVISUALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return EsterelFeature::SIMULATIONVISUALIZATION_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(EsterelFeature::BASIC_ID)
    }    

    // Do nothing
    def Program transform(Program program) {
        program;
    }

}
