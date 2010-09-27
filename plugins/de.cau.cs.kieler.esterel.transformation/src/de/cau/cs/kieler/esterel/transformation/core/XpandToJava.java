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
 * @author uru
 * 
 */
public class XpandToJava {

    private static XpandToJava instance = new XpandToJava();

    private static HashMap<String, TransformationDataComponent> components = new HashMap<String, TransformationDataComponent>();

    /**
     * 
     */
    private XpandToJava() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the instance
     */
    public static XpandToJava getInstance() {
        return instance;
    }

    public static void appendTransformation(Object statement, String identifier) {
        TransformationDataComponent component = components.get(identifier);
        if (component == null) {
            // TODO
            System.err.println("NO TRANSFORMATIONSTATEMENT FOUND");
        } else {
            boolean success = component.getQueue().add((ITransformationStatement) statement);
            if (!success) {
                System.err.println("ANOTHER ERROR");
            }
        }
    }

    /**
     * 
     * @param comp
     *            component to register
     * @return true if component was successfully registered. if there is a registered component, it
     *         is NOT overwritten
     */
    public static boolean registerComponent(final TransformationDataComponent comp) {
        TransformationDataComponent exists = components.get(comp.getIdentifier());
        if (exists != null) {
            return false;
        } else {
            return (components.put(comp.getIdentifier(), comp) == null);
        }
    }

    public static boolean removeComponent(final TransformationDataComponent comp) {
        return components.remove(comp) != null;
    }

}
