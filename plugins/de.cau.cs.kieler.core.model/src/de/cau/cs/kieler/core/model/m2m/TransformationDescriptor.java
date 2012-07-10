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
package de.cau.cs.kieler.core.model.m2m;

/**
 * A TransformationDescriptor holds information about the name of a transformation method and the
 * parameters that should be passed to this method.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 yellow
 *      review by msp, haf
 */
public class TransformationDescriptor {

    private String transformationName;
    private Object[] parameters;
    private Object result;

    /**
     * @param theTransformationName
     *            the name of the transformation method.
     * @param theParameters
     *            the parameters that are passed to the method.
     */
    public TransformationDescriptor(final String theTransformationName, final Object[] theParameters) {
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

    /**
     * @param result
     *            the result to set
     */
    public void setResult(final Object result) {
        this.result = result;
    }

    /**
     * @return the result of the executed transformation. If the transformation was not executed
     *         yet, {@code null} is returned.
     */
    public Object getResult() {
        return result;
    }

}
