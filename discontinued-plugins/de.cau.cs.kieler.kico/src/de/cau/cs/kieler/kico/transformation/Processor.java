/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.transformation;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * An instance of this class represents a registered processor which can run as a part of a
 * transformation. It is called indirectly when invoking the KielerCompiler.compile() method which
 * calls transformation's transform() method.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class Processor implements IProcessor {

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * This method may be overridden to optionally supply a human readable name for this processor.
     * The default implementation will return the id in place of the name.
     * 
     * @return the name
     */
    public String getName() {
        return getId();
    }

    // -------------------------------------------------------------------------

    /**
     * The central process method should be overridden by a specific processor. The default method
     * does nothing but returning the given EOject. This method should not be called directly!
     * 
     * @param eObject
     *            the e object
     * @param context
     *            the context
     * @return the object
     */
    public Object process(final EObject eObject, final KielerCompilerContext context) {
        // Either this method is overridden, or the transform method (w/o a context)
        return process(eObject);
    }

    // --------------------------------------------

    /**
     * The central process method should be overridden by a specific processor. The default method
     * does nothing but returning the given EOject. This method should not be called directly!
     * 
     * @param eObject
     *            the e object
     * @return the object
     */
    public Object process(final EObject eObject) {
        return eObject;
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
                    ((Processor) this).getClass().getMethod("process", EObject.class,
                            KielerCompilerContext.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The process method of processor '" + getId()
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

    /**
     * Gets the return argument type.
     * 
     * @return the return argument type
     */
    public Class<?> getReturnType() {
        Method transformMethod = null;
        try {
            transformMethod =
                    ((Processor) this).getClass().getMethod("process", EObject.class,
                            KielerCompilerContext.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The process method of processor '" + getId()
                    + "' was not found. If you declared a method you must not extend the "
                    + "Transformation abstract class at the same time."));
        }
        return transformMethod.getReturnType();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

}
