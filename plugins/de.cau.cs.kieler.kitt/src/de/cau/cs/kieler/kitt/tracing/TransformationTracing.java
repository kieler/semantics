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

import de.cau.cs.kieler.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;

/**
 * @author als
 * 
 */
public class TransformationTracing {

    private static HashMap<Object, TracingMapping> activeTransformations =
            new HashMap<Object, TracingMapping>(4);

    public static boolean startTransformationTracing(final EObject sourceModel) {
        return startTransformationTracing(sourceModel, null, true);
    }
    
    public static boolean startTransformationTracing(final EObject sourceModel, String name) {
        return startTransformationTracing(sourceModel, name, true);
    }
    
    public static boolean startTransformationTracing(final EObject sourceModel, final boolean inPlaceTransformation) {
        return startTransformationTracing(sourceModel, null, inPlaceTransformation);
    }

    public static boolean startTransformationTracing(final EObject sourceModel, String name,
            final boolean inPlaceTransformation) {
        if (TracingManager.isTracingActivated(sourceModel)) {
            if (inPlaceTransformation) {
                TracingChain tracingChain = TracingManager.getTracingChain(sourceModel);
                if (tracingChain != null) {
                    TracingMapping inPlaceMapping = tracingChain.getInPlaceMapping(sourceModel);
                    TracingMapping tracingMapping = new TracingMapping(inPlaceMapping);
                    sourceModel.eAdapters().add(tracingMapping);
                    activeTransformations.put(sourceModel, tracingMapping);
                }
            } else {
                activeTransformations.put(sourceModel, new TracingMapping());
                return true;
            }
        }
        return false;
    }

    public static boolean creationalTransformation(final EObject sourceModel) {
        if (activeTransformations.containsKey(sourceModel)) {
            sourceModel.eAdapters().remove(activeTransformations.get(sourceModel));
            activeTransformations.put(sourceModel, new TracingMapping());
            return true;
        }
        return false;
    }

    public static void finishTransformationTracing(final EObject sourceModel,
            final Object targetModel) {
        TracingMapping mapping = getMapping(sourceModel);
        if (mapping != null && sourceModel != null && targetModel != null) {
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
                    if (map.contains(modelElement)) {
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
