/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.m2m;

/**
 * Implement this class and add it to the TransformationObserver to get notified 
 * immediately after a transformation was executed.
 * 
 * @author ckru
 */
public interface ITransformationListener {

    /**
     * This method will be called after a transformation was executed.
     * 
     * @param transformationName the name of the executed transformation
     * @param parameters the parameters with which the transformation was executed 
     * @param result the result of the transformation
     */
    void transformationExecuted(String transformationName, Object[] parameters, Object result);
    
}
