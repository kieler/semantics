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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;
import de.cau.cs.kieler.kitt.tracing.internal.TracingReport;

/**
 * Supports multiple concurrent transformations
 * 
 * @author als
 * 
 */
public class TransformationTracing {

    /** If DEBUG is true additional output are made when a mapping is created */
    public static boolean DEBUG = true;

    private static HashMap<Thread, TracingMapping> activeTransformations =
            new HashMap<Thread, TracingMapping>(4);
    private static HashMap<Thread, List<EObject>> tracingDefaults =
            new HashMap<Thread, List<EObject>>(4);
    private static HashMap<Thread, HashMultimap<EObject, EObject>> appiledDefaultTracings =
            new HashMap<Thread, HashMultimap<EObject, EObject>>(4);

    public static boolean startTransformationTracing(final EObject sourceModel) {
        return startTransformationTracing(sourceModel, null, null, true);
    }

    public static boolean startTransformationTracing(final EObject sourceModel, String name) {
        return startTransformationTracing(sourceModel, null, name, true);
    }

    public static boolean startTransformationTracing(final EObject sourceModel,
            final boolean inPlaceTransformation) {
        return startTransformationTracing(sourceModel, null, null, inPlaceTransformation);
    }

    public static boolean startTransformationTracing(final EObject sourceModel,
            final EObject targetModel, final String name, final boolean inPlaceTransformation) {
        Preconditions.checkNotNull(sourceModel, "Source model is null");
        Thread t = Thread.currentThread();
        if (TracingManager.isTracingActivated(sourceModel)) {
            if (activeTransformations.containsKey(t)) {
                activeTransformations.remove(t);// try to fix
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
                        tracingMapping.setActive(true);
                        activeTransformations.put(t, tracingMapping);
                        appiledDefaultTracings.put(t, HashMultimap.<EObject, EObject> create());
                        return true;
                    }
                }
            } else {
                TracingMapping tracingMapping = new TracingMapping(name);
                activeTransformations.put(t, tracingMapping);
                appiledDefaultTracings.put(t, HashMultimap.<EObject, EObject> create());
                if (targetModel != null) {
                    targetModel.eAdapters().add(tracingMapping);
                }
                tracingMapping.setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean creationalTransformation(final EObject sourceModel,
            final EObject targetModel) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t)) {
            TracingMapping mapping = activeTransformations.get(t);
            if (mapping.isInPlace()) {
                finishTransformationTracing(sourceModel, sourceModel);
            } else {
                finishTransformationTracing(sourceModel, targetModel);
            }
            startTransformationTracing(sourceModel, targetModel, mapping.getTitle(), false);
            return true;
        }
        return false;
    }

    public static void finishTransformationTracing(final EObject sourceModel,
            final Object targetModel) {
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        if (mapping != null && sourceModel != null && targetModel != null) {
            mapping.setActive(false);
            if (mapping.isInPlace()) {
                sourceModel.eAdapters().remove(mapping);
            } else if (targetModel instanceof EObject) {
                ((EObject) targetModel).eAdapters().remove(mapping);
            }
            if (DEBUG) {
                TracingReport tracingReport = new TracingReport(sourceModel, targetModel, mapping);
                tracingReport.printReport();
                // tracingReport.failOnIncompleteMapping();
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
     * Traces given target with its origin.
     * <p>
     * If origin is an element form the target model such as target. The target will be associated
     * to the same origins such as origin.
     * <p>
     * Overwrites any default traces if exists.
     * 
     * @param eObject
     * @param origin
     * @return
     */
    public static <T extends EObject> T trace(final T eObject, final EObject origin) {
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        if (mapping != null) {
            HashMultimap<EObject, EObject> appiledDefaultTracing = appiledDefaultTracings.get(t);
            // Drop any default tracing if applied
            if (appiledDefaultTracing.containsKey(eObject)) {
                mapping.remove(eObject, appiledDefaultTracing.get(eObject));
                appiledDefaultTracing.removeAll(eObject);
            }
            mapping.smartPut(origin, eObject);
        }
        return eObject;
    }

    public static <T extends EObject> T trace(final T eObject, final EObject... origins) {
        for (EObject origin : origins) {
            if (origin != null) {
                trace(eObject, origin);
            }
        }
        return eObject;
    }

    /**
     * Traced given object to the DefaultTrace is set. Does not override exiting explicit taring
     * relation made by trace
     * 
     * @param eObject
     * @return
     */
    public static <T extends EObject> T traceToDefault(final T eObject) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t) && tracingDefaults.get(t) != null) {
            TracingMapping mapping = activeTransformations.get(t);
            List<EObject> tracingDefaultList = tracingDefaults.get(t);
            if (!mapping.contains(eObject)) {
                appiledDefaultTracings.get(t).putAll(eObject, tracingDefaultList);
                for (EObject tracingDefault : tracingDefaultList) {
                    mapping.smartPut(tracingDefault, eObject);
                }
            } else if (appiledDefaultTracings.get(t).containsKey(eObject)) {
                for (EObject tracingDefault : tracingDefaultList) {
                    mapping.remove(tracingDefault, eObject);
                }
                appiledDefaultTracings.get(t).putAll(eObject, tracingDefaultList);
                for (EObject tracingDefault : tracingDefaultList) {
                    mapping.smartPut(tracingDefault, eObject);
                }
            }
        }
        return eObject;
    }

    /**
     * Sets given origin as default origin applied in {@link traceToDefault}.
     * 
     * @param origin
     * @return origin
     */
    public static <T extends EObject> T setDefaultTrace(final T origin) {
        tracingDefaults.put(Thread.currentThread(), Lists.<EObject> newArrayList(origin));
        return origin;
    }

    /**
     * Sets given origins as default origins applied in {@link traceToDefault}.
     * 
     * @param origin
     */
    public static <T extends EObject> void setDefaultTrace(final T... origins) {
        tracingDefaults.put(Thread.currentThread(), Lists.<EObject> newArrayList(origins));
    }

}
