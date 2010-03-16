/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This is the default implementation of an automated producer.
 * 
 * @author soh
 * @kieler.rating 2010-03-16 proposed yellow
 */
public abstract class AbstractAutomatedProducer extends
        AbstractAutomatedComponent implements IAutomatedProducer {

    /**
     * The default implementation produces no information.
     * 
     * Subclasses should override this.
     * 
     * @return null
     */
    public List<KiemProperty> produceInformation() {
        return null;
    }

    /**
     * The default implementation produces no information.
     * 
     * Subclasses should override this.
     * 
     * @return null
     */
    public List<KiemProperty> produceModelFileInformation() {
        return null;
    }
}
