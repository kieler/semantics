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

import com.google.common.base.Preconditions;

import de.cau.cs.kieler.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;
import de.cau.cs.kieler.kitt.tracing.internal.TracingReport;

/**
 * @author als
 * 
 */
public class TransformationTracing {
    
    public static boolean DEBUG = true;

    private static HashMap<Thread, TracingMapping> activeTransformations =
            new HashMap<Thread, TracingMapping>(4);
    private static HashMap<Thread, EObject> tracingDefaults = new HashMap<Thread, EObject>(4);
    private static HashMap<Thread, HashMap<EObject, EObject>> appiledDefaultTracings =
            new HashMap<Thread, HashMap<EObject, EObject>>(4);

    public static boolean startTransformationTracing(final EObject sourceModel) {
        return startTransformationTracing(sourceModel, null, true);
    }

    public static boolean startTransformationTracing(final EObject sourceModel, String name) {
        return startTransformationTracing(sourceModel, name, true);
    }

    public static boolean startTransformationTracing(final EObject sourceModel,
            final boolean inPlaceTransformation) {
        return startTransformationTracing(sourceModel, null, inPlaceTransformation);
    }

    public static boolean startTransformationTracing(final EObject sourceModel, String name,
            final boolean inPlaceTransformation) {
        Preconditions.checkNotNull(sourceModel, "Source model is null");
        Thread t = Thread.currentThread();
        if (TracingManager.isTracingActivated(sourceModel)) {
            if (activeTransformations.containsKey(t)) {
                throw new IllegalStateException(
                        "Cannot start transformation tracing for given model until other current transformation on the same model have finished");
            }
            if (inPlaceTransformation) {
                TracingChain tracingChain = TracingManager.getTracingChain(sourceModel);
                if (tracingChain != null) {
                    TracingMapping inPlaceMapping = tracingChain.getInPlaceMapping(sourceModel);
                    if (inPlaceMapping != null) {
                        TracingMapping tracingMapping = new TracingMapping(inPlaceMapping, name);
                        sourceModel.eAdapters().add(tracingMapping);
                        activeTransformations.put(t, tracingMapping);
                        appiledDefaultTracings.put(t, new HashMap<EObject, EObject>());
                        return true;
                    }
                }
            } else {
                activeTransformations.put(t, new TracingMapping(name));
                appiledDefaultTracings.put(t, new HashMap<EObject, EObject>());
                return true;
            }
        }
        return false;
    }

    public static boolean creationalTransformation(final EObject sourceModel) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t)) {
            TracingMapping deprecatedTransformation = activeTransformations.get(t);
            sourceModel.eAdapters().remove(deprecatedTransformation);
            activeTransformations.put(t, new TracingMapping(deprecatedTransformation.getTitle()));
            return true;
        }
        return false;
    }

    public static void finishTransformationTracing(final EObject sourceModel,
            final Object targetModel) {
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        if (mapping != null && sourceModel != null && targetModel != null) {
            if(DEBUG){
                new TracingReport(sourceModel, targetModel, mapping).printReport();
            }
            TracingManager.addTransformationTrace(sourceModel, targetModel, mapping);
        }
        activeTransformations.remove(t);
        tracingDefaults.remove(t);
        appiledDefaultTracings.remove(t);
    }

    // -----------
    // -- TRACING

    public static <T extends EObject> T tracedCopy(final T original) {
        TracingMapping mapping = activeTransformations.get(Thread.currentThread());
        if (mapping != null) {
            return mapping.mappedCopy(original);
        } else {
            return EcoreUtil.copy(original);
        }
    }

    /**
     * entwerder source target oder bruder beziehung
     * <p>
     * overries default traces, bu tn or explicit ones
     * 
     * @param eObject
     * @param origin
     * @return
     */
    public static <T extends EObject> T trace(final T eObject, final EObject origin) {
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        if (mapping != null) {
            HashMap<EObject, EObject> appiledDefaultTracing = appiledDefaultTracings.get(t);
            // Drop any default tracing if applied
            if (appiledDefaultTracing.containsKey(eObject)) {
                mapping.remove(eObject, appiledDefaultTracing.get(eObject));
                appiledDefaultTracing.remove(eObject);
            }
            mapping.smartPut(origin, eObject);
        }
        return eObject;
    }

    public static <T extends EObject> T trace(final T eObject, final EObject... origins) {
        for (EObject origin : origins) {
            trace(eObject, origin);
        }
        return eObject;
    }

    /**
     * kein multi tracing (meherere origing per traceToDefault möglich, auch keine kombination aus
     * default und normalen trace)
     * 
     * @param eObject
     * @return
     */
    public static <T extends EObject> T traceToDefault(final T eObject) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t) && tracingDefaults.get(t) != null) {
            TracingMapping mapping = activeTransformations.get(t);
            appiledDefaultTracings.get(t).put(eObject, tracingDefaults.get(t));
            mapping.smartPut(tracingDefaults.get(t), eObject);
        }
        return eObject;
    }

    public static <T extends EObject> T traceDefault(final T origin) {
        tracingDefaults.put(Thread.currentThread(), origin);
        return origin;
    }
}
