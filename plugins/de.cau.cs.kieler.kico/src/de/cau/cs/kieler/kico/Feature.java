/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

/**
 * An instance of this class represents a registered feature a transformation can declare to handle,
 * not handle or produce.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class Feature implements IFeature {

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * This method may be overridden to optionally supply a human readable name for this feature.
     * The default implementation will return the id in place of the name.
     * 
     * @return the name
     */
    public String getName() {
        return getId();
    }

    // -------------------------------------------------------------------------

}
