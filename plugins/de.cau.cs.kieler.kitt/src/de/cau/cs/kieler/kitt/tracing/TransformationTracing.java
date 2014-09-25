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

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;

/**
 * @author als
 * 
 */
public class TransformationTracing {

    private static HashMap<Object, TracingMapping> activeTransformations =
            new HashMap<Object, TracingMapping>(4);

    public static boolean startTransformationTracing(final Object sourceModel,
            final boolean inPlaceTransformation) {
        if (TracingManager.isTracingActivated(sourceModel)) {
            TracingMapping mapping = null;
            if (inPlaceTransformation) {

            } else {
                mapping = new TracingMapping();
            }
            if (mapping != null) {
                activeTransformations.put(sourceModel, mapping);
                return true;
            }
        }
        return false;
    }

    public static void finishTransformationTracing(final Object sourceModel,
            final Object targetModel) {
        TracingMapping mapping = getMapping(sourceModel);
        if (mapping != null) {
            TracingManager.addTransformationTrace(sourceModel, targetModel, mapping);
            activeTransformations.remove(sourceModel);
        }
    }

    private static TracingMapping getMapping(Object modelElement) {
        TracingMapping mapping = null;
        if (!activeTransformations.isEmpty()) {
            mapping = activeTransformations.get(modelElement);
            if (mapping == null) {
                for (TracingMapping map : activeTransformations.values()) {
                    if (mapping.contains(modelElement)) {
                        mapping = map;
                        break;
                    }
                }
            }
        }
        return mapping;
    }

    // -----------
    // -- TRACING

    /**
     * @param original
     * @return
     */
    public static EObject tracedCopy(EObject original) {
        TracingMapping mapping = getMapping(original);
        if (mapping != null) {
            return mapping.mappedCopy(original);
        } else {
            return EcoreUtil.copy(original);
        }
    }
}
