/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * DataComponents implementing this interface will be asked to respond to
 * requests for information about the execution run.
 * 
 * @author soh
 * @kieler.rating 2010-02-03 proposed yellow
 */
public interface IAutomatedProducer extends IAutomatedComponent {

    /**
     * Notifies the DataComponent that the schedule has finished and asks it to
     * provide some information for evaluation.
     * 
     * The number and order of properties has to be the same for all iterations
     * that a particular execution file performs on all model files that should
     * be simulated. This is necessary in order to construct a valid results
     * table.
     * 
     * @return information
     */
    List<KiemProperty> produceInformation();
}
