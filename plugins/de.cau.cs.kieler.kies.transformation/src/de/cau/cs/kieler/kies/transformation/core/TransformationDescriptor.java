/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.core;

/**
 * A TransformationDescriptor holds information about the name of a transformation method and the
 * parameters that should be passed to this method.
 * 
 * @author uru
 * 
 */
public class TransformationDescriptor {

    private String transformationName;
    private Object[] parameters;

    /**
     * @param theTransformationName
     *            the name of the transformation method.
     * @param theParameters
     *            the parameters that are passed to the method.
     */
    public TransformationDescriptor(final String theTransformationName, final Object[] theParameters) {
        super();
        this.transformationName = theTransformationName;
        this.parameters = theParameters;
    }

    /**
     * @return the transformationName
     */
    public String getTransformationName() {
        return transformationName;
    }

    /**
     * @return the parameters
     */
    public Object[] getParameters() {
        return parameters;
    }

}
