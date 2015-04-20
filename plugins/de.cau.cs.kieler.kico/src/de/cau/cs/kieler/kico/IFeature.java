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

import org.eclipse.emf.ecore.EObject;

/**
 * This interface defines what a concrete feature is. A feature is a combination of a test method
 * isContained() which tests for the existence of this feature in an EObject model. It returns true
 * if the feature is contained in the model and false otherwise. A string identifier represents the
 * feature name. Optionally a name can be provided.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IFeature {

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
     * Tests for the existence of this feature in an EObject model. It returns true if the feature
     * is contained in the model and false otherwise.
     * 
     * @return the list
     */
    public boolean isContained(EObject model);

    // -------------------------------------------------------------------------

}
