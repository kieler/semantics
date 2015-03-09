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
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

/**
 * An instance of this class represents a registered processor which can run as a part of a
 * transformation. It is called indirectly when invoking the KielerCompiler.compile() method which
 * calles transformation's transform() method.
 * 
 * @author cmot
 * @kieler.design 2015-02-11 proposed
 * @kieler.rating 2015-02-11 proposed yellow
 * 
 */
public abstract class Processor {

    // /** The configuration element for accessing the plug-in ID. */
    // private IConfigurationElement configEle;

//    /** The processor instance, if this is a wrapper only. May be guiced for the injected case. */
//    private Object processorInstance = null;

    /** The name. */
    private String name = null;

    /** The id. */
    private String id = null;

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the id of the processor.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the id of this transformation.
     * 
     * @param id
     *            the new id
     */
    void setId(String id) {
        this.id = id.trim();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name of this processor. If the name is null then it returns the id that must no be
     * null at any time.
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
     * Sets the name of the transformation.
     * 
     * @param name
     *            the new name
     */
    void setName(String name) {
        this.name = name;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the argument parameter type.
     * 
     * @return the argument parameter type
     */
    public Class<?> getParameterType() {
        Method transformMethod = null;
        try {
            transformMethod =
                    ((Transformation) this).getClass().getMethod("process", EObject.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The transformation method of transformation '" + id
                    + "' was not found. If you declared a method you must not extend the "
                    + "Transformation abstract class at the same time."));
        }
        Class<?>[] classArray = transformMethod.getParameterTypes();
        if (classArray.length > 0) {
            return classArray[0];
        }
        return null;
    }

    // -------------------------------------------------------------------------

    // /**
    // * Sets the configuration element. This method is needed to instantiate several component
    // * instances only.
    // *
    // * @param configEleParam
    // * the new configuration element
    // */
    // public final void setConfigurationElemenet(final IConfigurationElement configEleParam) {
    // this.configEle = configEleParam;
    // }
    //
    // // -------------------------------------------------------------------------
    //
    // /**
    // * Gets the configuration element. This method is needed to instantiate several component
    // * instances only.
    // *
    // * @return the configuration element
    // */
    // public final IConfigurationElement getConfigurationElement() {
    // return this.configEle;
    // }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------

}
