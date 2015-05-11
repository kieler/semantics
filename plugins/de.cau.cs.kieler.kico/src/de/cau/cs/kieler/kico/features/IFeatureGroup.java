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
package de.cau.cs.kieler.kico.features;

import java.util.Set;

/**
 * This interface defines what a concrete feature group is. A feature group must declare a set of
 * features that are referenceable by one single ID. A string identifier represents the feature
 * name. Optionally a name can be provided.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IFeatureGroup {

    /**
     * Must supply a unique ID to identify this transformation.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a human readable name for this feature. If null is returned then the id
     * will be used in place of the name.
     * 
     * @return the string
     */
    public String getName();

    // -------------------------------------------------------------------------

    /**
     * This is the central method to declare for a feature group. It should return a set of feature
     * IDs that are grouped together under one single ID. Note that a feature group is allowed also
     * to contain other feature groups.
     * 
     * @return the features that are contained in this feature group
     */
    public Set<String> getFeatureIds();

    // -------------------------------------------------------------------------

}
