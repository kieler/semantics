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
package de.cau.cs.kieler.core.model.transformation.xtend;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Assert;

import de.cau.cs.kieler.core.model.transformation.AbstractTransformation;

/**
 * A transformation used by the Xtend framework.
 * 
 * @author mim
 * 
 */
public class XtendTransformation extends AbstractTransformation {

    /** List of parameters. **/
    private List<List<String>> parameters;
    /** The transformation. **/
    private String transformation;

    /**
     * Creates a new Xtend transformation.
     */
    public XtendTransformation() {
        this.transformation = "";
        this.parameters = new LinkedList<List<String>>();
    }

    /**
     * Creates a new Xtend transformation.
     * 
     * @param transformationName
     *            The transformation name
     * @param params
     *            The transformation parameters
     */
    public XtendTransformation(final String transformationName, final List<List<String>> params) {
        this.transformation = transformationName;
        this.parameters = new LinkedList<List<String>>(params);
    }

    /**
     * Gets the list of parameters.
     * 
     * @return A list of parameters.
     */
    public final List<List<String>> getParameterList() {
        Assert.isNotNull(this.parameters);
        // never return the references!
        return new LinkedList<List<String>>(parameters);
    }

    /**
     * Gets the list of parameters as an array.
     * 
     * @return An array of parameters.
     */
    public final String[] getParameters() {
        Assert.isNotNull(this.parameters);
        return parameters.toArray(new String[parameters.size()]);
    }

    /**
     * Sets the parameters for this transformation.
     * 
     * @param params
     *            a List of parameters
     */
    public final void setParameters(final List<List<String>> params) {
        this.parameters = new LinkedList<List<String>>(params);
    }

    /**
     * Returns the Xtend extension name.
     * 
     * @return The name of this transformation
     */
    public final String getTransformation() {
        return this.transformation;
    }

    /**
     * Sets the name of the transformation to be executed. The value is unchecked so giving an
     * invalid name here will result in an Xtend error.
     * 
     * @param value
     *            The name of the Xtend transformation to execute
     */
    @Override
    public void setTransformation(final String value) {
        if (value != null) {
            this.transformation = value;
        }
    }

    /**
     * Two transformations are equal if they have the same name & parameter.
     * 
     * @param obj
     *            the object to check
     * @return true if the transformations are equal.
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof AbstractTransformation) {
            AbstractTransformation a = (AbstractTransformation) obj;
            return a.getTransformation().equals(transformation)
                    && a.getParameterList().equals(parameters);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return transformation.hashCode();
    }

    @Override
    public void addParameters(final List<String> params) {
        this.parameters.add(params);
    }
}
