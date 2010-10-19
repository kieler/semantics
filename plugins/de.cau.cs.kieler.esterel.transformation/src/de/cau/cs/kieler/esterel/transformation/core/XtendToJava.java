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

import java.util.HashMap;

/**
 * Uses singleton pattern. Provides functionality to register an AbstractTransformationDataComponent
 * so that Xtend transformations can find their actual controlling java class in order to add some
 * ITransformationStatement to the executing queue.
 * 
 * @author uru
 * 
 */
public final class XtendToJava {

    private static XtendToJava instance = new XtendToJava();

    private static HashMap<String, AbstractTransformationDataComponent> components = new HashMap<String, 
        AbstractTransformationDataComponent>();

    /**
     * private constructor, singleton.
     */
    private XtendToJava() {
    }

    /**
     * @return the instance
     */
    public static XtendToJava getInstance() {
        return instance;
    }

    /**
     * appends an ITransformation.
     * 
     * @param statement
     *            has to be of type <code>ITransformationStatement</code>.
     * @param identifier
     *            unique identifier of the parental <code>AbstractTransformationDataComponent</code>
     */
    public static void appendTransformation(final Object statement, final String identifier) {
        AbstractTransformationDataComponent component = components.get(identifier);
        if (component == null) {
            // TODO
            System.err.println("NO TRANSFORMATIONCOMPONENT FOUND");
        } else {
            boolean success = component.getQueue().add((ITransformationStatement) statement);
            if (!success) {
                System.err.println("ANOTHER ERROR");
            }
        }
    }

    /**
     * register a new component.
     * 
     * @param comp
     *            component to register
     * @return true if component was successfully registered. if there is a registered component, it
     *         is NOT overwritten
     */
    public static boolean registerComponent(final AbstractTransformationDataComponent comp) {
        AbstractTransformationDataComponent exists = components.get(comp.getIdentifier());
        if (exists != null) {
            return false;
        } else {
            return (components.put(comp.getIdentifier(), comp) == null);
        }
    }

    /**
     * removes the component.
     * 
     * @param comp
     *            component to remove
     * @return true if it was removed
     */
    public static boolean removeComponent(final AbstractTransformationDataComponent comp) {
        return components.remove(comp) != null;
    }

}
