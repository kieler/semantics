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

import java.util.List;
import java.util.Set;

/**
 * This interface defines what a concrete transformation must supply. This is an ID, an optional
 * name, an optional list of produced features, an optional list of not handled features and the
 * central list of processors that constitute this transformation.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface ITransformation {

    /**
     * Must supply a unique ID to identify this transformation.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a human readable name for this transformation. If null is returned then the
     * id will be used in place of the name.
     * 
     * @return the string
     */
    public String getName();

    // -------------------------------------------------------------------------

    /**
     * Supply the feature that this transformation is going to handle. Note that if there is more
     * than one transformation handling one feature, then there will
     * 
     * @return the string
     */
    public String getHandleFeatureId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a set of feature IDs this transformation (potentially) produces. This
     * means that for a full compilation these features must be transformed afterwards. Be advised
     * to use the minimal set of feature IDs here. Transformations indirectly specified here will be
     * forced to run afterwards. If null is returned then this means there are no produces
     * dependencies.
     * 
     * @return the list
     */
    public Set<String> getProducesFeatureIds();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a set of feature IDs in order to specify features that cannot be handled
     * by this transformation. Be advised to use the minimal set of feature IDs here.
     * Transformations indirectly specified here will be forced to run before this transformation.
     * If null is returned then this means there are no not handles dependencies.
     * 
     * @return the list
     */
    public Set<String> getNotHandlesFeatureIds();

    // -------------------------------------------------------------------------

    /**
     * Define a list of processors options (processor IDs + optional flag) that constitute this
     * transformation in order to handle the defined feature. These processors will be run in the
     * here defined order if this transformation is applied to a model. If null is returned then no
     * processors should run.
     * 
     * @return the list
     */
    public List<ProcessorOption> getProcessorOptions();

    // -------------------------------------------------------------------------

}
