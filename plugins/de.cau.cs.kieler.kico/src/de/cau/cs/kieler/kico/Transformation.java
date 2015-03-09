/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

/**
 * An instance of this class represents a registered transformation that may be called indirectly by
 * invoking the KielerCompiler.compile() method. It consists of a list of processors which are
 * called one by another when invoking the transform() method.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
public abstract class Transformation extends Processor {

    /** The produces dependencies. */
    private List<String> producesDependencies = new ArrayList<String>();

    /** The not handles dependencies. */
    private List<String> notHandlesDependencies = new ArrayList<String>();

    /** The central processor list. */
    private List<ProcessorOption> processors = new ArrayList<ProcessorOption>();

    // -------------------------------------------------------------------------


    /**
     * Implements the transformation from EObject to EObject.
     */
    public abstract EObject transform(EObject eObject, KielerCompilerContext context);


    /**
     * Sets the method name that will be called when doTransform() is called. Set this to null if
     * the class implements the ITransformation interface.
     * 
     * @param method
     *            the new method
     */
    void setMethod(String method) {
        this.method = method;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the list of transformation IDs that represent produces dependencies to other
     * transformations.
     * 
     * @param dependencies
     *            the new dependencies
     */
    void setProducesDependencies(List<String> dependencies) {
        this.producesDependencies = dependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the list of transformation IDs that represent not handles dependencies to other
     * transformations.
     * 
     * @param dependencies
     *            the new dependencies
     */
    void setNotHandlesDependencies(List<String> dependencies) {
        this.notHandlesDependencies = dependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformation IDs that represent dependencies to other transformations.
     * 
     * @return the dependencies
     */
    public List<String> getNotHandlesDependencies() {
        return notHandlesDependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of produces transformation IDs that represent dependencies to other
     * transformations.
     * 
     * @return the dependencies
     */
    public List<String> getProducesDependencies() {
        return producesDependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the central list of processors which this transformation consists of.
     * 
     * @return the dependencies
     */
    public List<ProcessorOption> getProcessors() {
        return processors;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the id of the transformation.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name of this transformation. If the name is null then it returns the id that must no
     * be null at any time.
     * 
     * @return the name
     */
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return id;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Do the transformation based on the method field. It should return an EObject if there are any
     * following transformations. A code generation will finally return a String object.
     * 
     * @param eObject
     *            the e object
     * @return the e object
     */
    public final Object doTransform(EObject eObject, KielerCompilerContext context)
            throws Exception {
        if (method == null) {
            // A Transformation instance with the standard transformation method
            return ((Transformation) transformationInstance).transform(eObject, context);
        } else {
            // Some other class instance with an individual transformation method
            Object result;
            try {
                // First try WITH context
                result = transformationMethod.invoke(transformationInstance, eObject, context);
            } catch (java.lang.IllegalArgumentException e) {
                // Then try WITHOUT context
                result = transformationMethod.invoke(transformationInstance, eObject);
            }
            return result;
        }

    }

    // -------------------------------------------------------------------------
}
