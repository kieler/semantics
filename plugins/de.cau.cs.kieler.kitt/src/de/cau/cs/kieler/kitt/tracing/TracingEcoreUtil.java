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
package de.cau.cs.kieler.kitt.tracing;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A wrapper for implicit tracing in EcoreUtil copy operations.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 * 
 */
public class TracingEcoreUtil extends EcoreUtil {
    
    /**
     * {@inheritDoc}
     */
    public static <T extends EObject> T copy(T eObject) {
        return TransformationTracing.tracedCopy(eObject);
    }
    
    /**
     * @see copy
     */
    public static <T extends EObject> T nontracingCopy(T eObject) {
        return EcoreUtil.copy(eObject);
    }

    /**
     * {@inheritDoc}
     */
    public static <T extends EObject> Collection<T> copyAll(Collection<? extends T> eObjects) {
        Collection<T> result = new ArrayList<T>(eObjects.size());
        for (T t : eObjects) {
            result.add(TransformationTracing.tracedCopy(t));
        }
        return result;
    }
    
}
