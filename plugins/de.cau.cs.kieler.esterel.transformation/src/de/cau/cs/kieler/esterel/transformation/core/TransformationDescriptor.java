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
package de.cau.cs.kieler.esterel.transformation.core;

/**
 * @author uru
 * 
 */
public class TransformationDescriptor {

    private String transformationName;

    private Object[] parameters;

    /**
     * @param transformationName
     * @param parameters
     */
    public TransformationDescriptor(String transformationName, Object[] parameters) {
        super();
        this.transformationName = transformationName;
        this.parameters = parameters;
    }

    /**
     * @return the transformationName
     */
    public String getTransformationName() {
        return transformationName;
    }

    /**
     * @param transformationName
     *            the transformationName to set
     */
    public void setTransformationName(String transformationName) {
        this.transformationName = transformationName;
    }

    /**
     * @return the parameters
     */
    public Object[] getParameters() {
        return parameters;
    }

    /**
     * @param parameters
     *            the parameters to set
     */
    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

}
