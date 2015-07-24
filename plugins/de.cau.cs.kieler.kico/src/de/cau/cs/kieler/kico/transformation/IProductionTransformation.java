/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.transformation;

import java.util.Set;

/**
 * This interface defines what a production transformation must supply.
 * <p>
 * Production transformation are transformations which add a new feature to a model.
 * 
 * @author als
 * @kieler.design 2015-05-11 proposed
 * @kieler.rating 2015-05-11 proposed yellow
 * 
 */
public interface IProductionTransformation extends ITransformation {

    /**
     * Supply the feature ID this transformation produces. This means that the model will contain
     * this feature after this transformation.
     * 
     * @return the string
     */
    public String getProducedFeatureId();

    // -------------------------------------------------------------------------

    /**
     * Supply the set of feature IDs that this transformation is going to consume or require to run.
     * 
     * @return the list
     */
    public Set<String> getRequiredFeatureIds();

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
