/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.m2m;

/**
 * A TransformationContext is supposed to hold all information that is necessary to execute a
 * transformation.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 green
 *      review by msp, haf
 */
public interface ITransformationContext {

    /**
     * Execute the actual transformation. This method will be called by the
     * {@link TransformationEffect}.
     * 
     * @param descriptor
     *            The {@link TransformationDescriptor} containing information about the explicit
     *            transformation to execute.
     */
    void execute(TransformationDescriptor descriptor);

}
