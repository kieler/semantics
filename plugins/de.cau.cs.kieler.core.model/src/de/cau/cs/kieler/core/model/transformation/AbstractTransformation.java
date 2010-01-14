/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.transformation;

import java.util.List;

/**
 * Abstract transformation that may be executed by an ITransformationFramework.
 * 
 * @author mim
 *
 */
public abstract class AbstractTransformation {
    /**
     * Sets the transformation.
     * 
     * @param transformationName
     * The transformation name
     */
    public abstract void setTransformation(String transformationName);
    /**
     * Gets the transformation name.
     * @return Name of the transformation
     */
    public abstract String getTransformation();
    /**
     * Gets the parameters as a List.
     * @return a string list of parameters
     */
    public abstract List<String> getParameterList();
    /**
     * Gets the parameters as an array.
     * @return a string array of parameters
     */
    public abstract String[] getParameters();
    /**
     * Sets the parameters from a list.
     * @param params a string list of parameters
     */
    public abstract void setParameters(List<String> params);
    /**
     * Sets the parameters from an array.
     * @param params a string array of parameters
     */
    public abstract void setParameters(String[] params);
}
