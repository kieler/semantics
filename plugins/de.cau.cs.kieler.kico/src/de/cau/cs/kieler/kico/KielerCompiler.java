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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * This is the main class of the Kieler Compiler (KiCo) Project that aims to provide an
 * infrastructure for compiling via consecutive modal transformations.
 * 
 * @author cmot
 * @kieler.design 2014-03-13 proposed
 * @kieler.rating 2014-03-13 proposed yellow
 * 
 */
public class KielerCompiler {

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations with comma separated IDs.
     *
     * @param transformationIDs the transformation i ds
     * @param eObject the e object
     * @return the object
     */
    public static Object compile(final String transformationIDs, final EObject eObject) {
        String[] transformationIDArray = transformationIDs.split(",");
        if (transformationIDArray == null) {
            return null;
        }
        return compile(Arrays.asList(transformationIDArray), eObject);
    }

    
    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations as a String List of IDs.
     * 
     * @param transformationID
     *            the transformation id
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final List<String> transformationIDs, final EObject eObject) {

        EObject transformedObject = eObject;

        HashMap<String, Transformation> transformations =
                KiCoPlugin.getDefault().getRegisteredTransformations(true);

        for (String requestedTransformationID : transformationIDs) {

            Transformation transformation = transformations.get(requestedTransformationID);

            if (transformation != null)
                // If the requested TransformationID
                if (transformation.getId().equals(requestedTransformationID)) {
                    transformedObject = transformation.doTransform(transformedObject);
                }
        }
        return transformedObject;
    }

}
