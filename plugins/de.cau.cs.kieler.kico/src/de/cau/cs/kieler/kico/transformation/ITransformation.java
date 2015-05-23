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

import java.util.List;

/**
 * This interface defines what a general transformation must supply.
 * 
 * @author cmot, als
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
     * Define a list of processors options (processor IDs + optional flag) that constitute this
     * transformation in order to handle the defined feature. These processors will be run in the
     * here defined order if this transformation is applied to a model. If null is returned then no
     * processors should run.
     * 
     * @return the list
     */
    public List<ProcessorOption> getProcessorOptions();

    // -------------------------------------------------------------------------

    /**
     * Non-Inplace transformations should return false here. The default value is true and the more
     * efficient strategy. However, if a transformation, i.e., a processor within the transformation
     * requires to work on a real copy of the model then the transformation implementation should
     * return false here an KiCo will provide the transformation with a copy of the model as input.
     * Override this method to return false;
     * 
     * @return false ONLY if the model transformation really requires a copy of the model as the
     *         input. Typically model transformations should return true here for faster processing.
     */
    public boolean isInplace();

    // -------------------------------------------------------------------------
}
