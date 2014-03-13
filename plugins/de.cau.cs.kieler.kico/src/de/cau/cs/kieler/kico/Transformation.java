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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;


/**
 * An instance of this class represents a registered transformation that may be called indirectly by
 * invoking the KielerCompiler.compile() method.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
public abstract class Transformation implements ITransformation {

    /** The configuration element for accessing the plug-in ID. */
    private IConfigurationElement configEle;

    /** The name. */
    private String name = null;

    /** The id. */
    private String id = null;

    /** The method. */
    private String method = null;

    /** The dependencies. */
    private List<String> dependencies = new ArrayList<String>();

    //-------------------------------------------------------------------------
    
    /**
     * Sets the configuration element. This method is needed to instantiate several component
     * instances only.
     * 
     * @param configEleParam
     *            the new configuration element
     */
    public final void setConfigurationElemenet(final IConfigurationElement configEleParam) {
        this.configEle = configEleParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the configuration element. This method is needed to instantiate several component
     * instances only.
     * 
     * @return the configuration element
     */
    public final IConfigurationElement getConfigurationElement() {
        return this.configEle;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Sets the name of the transformation.
     *
     * @param name the new name
     */
    void setName(String name) {
        this.name = name;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the id of this transformation.
     *
     * @param id the new id
     */
    void setId(String id) {
        this.id = id.trim();
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the method name that will be called when doTransform() is called. Set this to null
     * if the class implements the ITransformation interface.
     *
     * @param method the new method
     */
    void setMethod(String method) {
        this.method = method;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the list of transformation IDs that represent dependencies to other transformations.
     *
     * @param dependencies the new dependencies
     */
    void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Gets the list of transformation IDs that represent dependencies to other transformations.
     *
     * @return the dependencies
     */
    public List<String> getDependencies() {
        return dependencies;
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the id of the transformation.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Gets the name of this transformation. If the name is null then it returns the id that must no be null at any time.
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

    //-------------------------------------------------------------------------
    
    /**
     * Do the transformation based on the method field.
     * 
     * @param eObject
     *            the e object
     * @return the e object
     */
    public final EObject doTransform(EObject eObject) {
        if (method == null) {
            return (transform(eObject));
        } else {
            Method classMethod;
            try {
                classMethod = this.getClass().getMethod(method);
                Object result = classMethod.invoke(eObject);
                if (result instanceof EObject) {
                    return (EObject) result;
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    //-------------------------------------------------------------------------
}
