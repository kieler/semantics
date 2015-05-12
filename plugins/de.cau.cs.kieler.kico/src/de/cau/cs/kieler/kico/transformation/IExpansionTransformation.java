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
package de.cau.cs.kieler.kico.transformation;

import java.util.Set;

/**
 * This interface defines what a concrete transformation must supply.
 * <p>
 * Expansion transformation are transformations which perform a macro expansion on a specific feature.
 * 
 * @author cmot, als
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IExpansionTransformation extends ITransformation {

    /**
     * Supply the feature that this transformation is going to expand. Note that if there is more
     * than one transformation expanding one feature, then these transformations are alternative and
     * only one of them can be processed during compilation. This is determined by the
     * transformation preference.
     * 
     * @return the string
     */
    public String getExpandsFeatureId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a set of feature IDs this transformation (potentially) produces. This means
     * that for a full compilation these features must be transformed afterwards. Be advised to use
     * the minimal set of feature IDs here. Transformations indirectly specified here will be forced
     * to run afterwards. If null is returned then this means there are no produces dependencies.
     * 
     * @return the list
     */
    public Set<String> getProducesFeatureIds();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a set of feature IDs in order to specify features that cannot be handled by
     * this transformation. Be advised to use the minimal set of feature IDs here. Transformations
     * indirectly specified here will be forced to run before this transformation. If null is
     * returned then this means there are no not handles dependencies.
     * 
     * @return the list
     */
    public Set<String> getNotHandlesFeatureIds();

}
