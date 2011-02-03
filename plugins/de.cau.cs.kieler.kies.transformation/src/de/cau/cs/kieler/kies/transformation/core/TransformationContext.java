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
package de.cau.cs.kieler.kies.transformation.core;

/**
 * A TransformationContext is supposed to hold all information that is necessary to execute a
 * transformation.
 * 
 * @author uru
 */
public interface TransformationContext {

    /**
     * This method executes the actual transformation. It is called by the
     * {@link TransformationEffect}.
     */
    void executeCurrent();

    /**
     * @return any result of the executed transformation. If the transformation was not executed
     *         yet, {@code null} is returned.
     */
    Object getLastResult();
}
