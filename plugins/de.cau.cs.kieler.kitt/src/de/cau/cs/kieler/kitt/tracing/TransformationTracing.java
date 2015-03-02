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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kitt.KiTTPlugin;
import de.cau.cs.kieler.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;

/**
 * Tracing API for transformations.
 * <p>
 * Non of the tracing functions in the API will have any effect if transformation is not started on
 * a model with activated tracing.
 * <p>
 * Supports tracing in multiple concurrent transformations.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 */
public class TransformationTracing {

    private static class AutomaticTracingAdapter extends EContentAdapter {
        private TracingMapping mapping;
        private boolean active = false;
        private HashMap<EObject, List<Pair<Object, Object>>> removedEntries =
                new HashMap<EObject, List<Pair<Object, Object>>>();

        /**
         * @param mapping
         */
        public AutomaticTracingAdapter(TracingMapping mapping) {
            super();
            this.mapping = mapping;
        }

        /**
         * @param active
         *            the active state to set
         */
        public void setActive(boolean active) {
            this.active = active;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void notifyChanged(Notification notification) {
            if (notification.getEventType() == Notification.SET) {
                Object newValue = notification.getNewValue();
                Object oldValue = notification.getOldValue();

                if (newValue instanceof EObject && oldValue instanceof EObject
                        && newValue != oldValue) {
                    traceToDefault((EObject) newValue);
                }
            }

            // super implementation handles selfAdapt calling add/remocveAdapter
            // thus invoke this behavior after redirecting tracing
            super.notifyChanged(notification);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        protected void addAdapter(Notifier notifier) {
            super.addAdapter(notifier);
            if (active) {
                EObject element = (EObject) notifier;

                // If element is added which was removed earlier then restore mappings
                if (removedEntries.containsKey(element)) {
                    for (Pair<Object, Object> entry : removedEntries.get(element)) {
                        mapping.put(entry.getFirst(), entry.getSecond());
                    }
                    removedEntries.remove(element);
                } else if (!mapping.contains(element)) {
                    // Trace new untraced elements to default
                    traceToDefault(element);
                }
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        protected void removeAdapter(Notifier notifier) {
            super.removeAdapter(notifier);
            if (active) {
                // If the adapter is removed the element left the model and all tracing relation can
                // be deleted
                EObject element = (EObject) notifier;
                removedEntries.put(element, mapping.removeAll(element));
            }
        }
    }

    private static HashMap<Thread, TracingMapping> activeTransformations =
            new HashMap<Thread, TracingMapping>(8);
    private static HashMap<Thread, AutomaticTracingAdapter> tracingAdapter =
            new HashMap<Thread, AutomaticTracingAdapter>(8);
    private static HashMap<Thread, List<EObject>> tracingDefaults =
            new HashMap<Thread, List<EObject>>(8);
    private static HashMap<Thread, HashMultimap<EObject, EObject>> appiledDefaultTracings =
            new HashMap<Thread, HashMultimap<EObject, EObject>>(8);

    /**
     * @see startTransformationTracing(sourceModel, null, null, true)
     */
    public static boolean startTransformationTracing(final EObject sourceModel) {
        return startTransformationTracing(sourceModel, null, null, true);
    }

    /**
     * @see startTransformationTracing(sourceModel, null, name, true)
     */
    public static boolean startTransformationTracing(final EObject sourceModel, String name) {
        return startTransformationTracing(sourceModel, null, name, true);
    }

    /**
     * @see startTransformationTracing(sourceModel, null, null, inPlaceTransformation)
     */
    public static boolean startTransformationTracing(final EObject sourceModel,
            final boolean inPlaceTransformation) {
        return startTransformationTracing(sourceModel, null, null, inPlaceTransformation);
    }

    /**
     * Starts a new transformation tracing in the current thread if traing is activated for the
     * given model.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     * @param name
     *            the name of the transformation
     * @param inPlaceTransformation
     *            transformation type
     * @return true if tracing is activated and started correctly.
     * @throws IllegalStateException
     *             if another transformation is currently running in the same thread.
     */
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
                        AutomaticTracingAdapter adapter =
                                new AutomaticTracingAdapter(tracingMapping);
                        // add automatic tracing adapter
                        sourceModel.eAdapters().add(adapter);
                        adapter.setActive(true);
                        // register
                        activeTransformations.put(t, tracingMapping);
                        tracingAdapter.put(t, adapter);
                        appiledDefaultTracings.put(t, HashMultimap.<EObject, EObject> create());
                        return true;
                    }
                }
            } else {
                TracingMapping tracingMapping = new TracingMapping(name);
                AutomaticTracingAdapter adapter = new AutomaticTracingAdapter(tracingMapping);
                // add automatic tracing adapter
                if (targetModel != null) {
                    targetModel.eAdapters().add(adapter);
                }
                adapter.setActive(true);
                activeTransformations.put(t, tracingMapping);
                tracingAdapter.put(t, adapter);
                appiledDefaultTracings.put(t, HashMultimap.<EObject, EObject> create());
                return true;
            }
        }
        return false;
    }

    /**
     * Converts the currently running (already started via {@link startTransformationTracing})
     * transformation into a non inplace transformation.
     * <p>
     * If an inplace transformation is already running source and target model can be identical.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     * @return True if a active transformation existed and was converted else false
     */
    public static boolean creationalTransformation(final EObject sourceModel,
            final EObject targetModel) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t)) {
            // finish running transformation
            TracingMapping mapping = activeTransformations.get(t);
            if (mapping.isInPlace()) {
                finishTransformationTracing(sourceModel, sourceModel);
            } else {
                finishTransformationTracing(sourceModel, targetModel);
            }
            // start new non inplace transformation
            startTransformationTracing(sourceModel, targetModel, mapping.getTitle(), false);
            return true;
        }
        return false;
    }

    /**
     * Completes the current model transformation in the current thread with given source and traget
     * model and saves all tracing information.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     */
    public static void finishTransformationTracing(final EObject sourceModel,
            final Object targetModel) {
        finishTransformationTracing(sourceModel, targetModel, false);
    }

    /**
     * Completes the current model transformation in the current thread with given source and target
     * model and saves all tracing information. If createReport is true the tracing data will be
     * checked against the given model and a {@link TracingReport} is returned.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     * @return TracingReport if createReport is true else null
     */
    public static TracingReport finishTransformationTracing(final EObject sourceModel,
            final Object targetModel, boolean createReport) {
        TracingReport report = null;
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        AutomaticTracingAdapter adapter = tracingAdapter.get(t);
        if (mapping != null && sourceModel != null && targetModel != null) {
            // stop and remove tracing adapter
            adapter.setActive(false);
            if (mapping.isInPlace()) {
                sourceModel.eAdapters().remove(adapter);
            } else if (targetModel instanceof EObject) {
                ((EObject) targetModel).eAdapters().remove(adapter);
            }
            // create report
            if (KiTTPlugin.DEBUG || createReport) {
                report = new TracingReport(sourceModel, targetModel, mapping);
                if (KiTTPlugin.DEBUG) {
                    report.printReport();
                }
            }
            // store data in tracing chain
            TracingManager.addTransformationTrace(sourceModel, targetModel, mapping);
        }
        activeTransformations.remove(t);
        tracingAdapter.remove(t);
        tracingDefaults.remove(t);
        appiledDefaultTracings.remove(t);
        return report;
    }

    /**
     * Checks if an active transformation with tracing is running in the current thread.
     * 
     * @return true if there is an active transformation else false
     */
    public static boolean isTracingActive() {
        return activeTransformations.get(Thread.currentThread()) != null;
    }

    // -----------------
    // -- TRACING API --
    // -----------------

    /**
     * Performs a complete recursive copy of the given model and stoes resulting tracing information
     * if necessary.
     * 
     * @param original
     *            element
     * @return copy
     */
    public static <T extends EObject> T tracedCopy(final T original) {
        TracingMapping mapping = activeTransformations.get(Thread.currentThread());
        if (mapping != null) {
            return mapping.mappedCopy(original);
        } else {
            return EcoreUtil.copy(original);
        }
    }

    /**
     * Performs {@link trace} recursively on the all contained elements of given eObject.
     * 
     * @param eObject
     *            object to trace to origin including all contained EObjects
     * @param origin
     *            origin element
     * @return unmodified eObject parameter
     */
    public static <T extends EObject> T rtrace(final T eObject, final EObject origin) {
        trace(eObject, origin);
        TreeIterator<EObject> iter = eObject.eAllContents();
        while (iter.hasNext()) {
            trace(iter.next(), origin);
        }
        return eObject;
    }

    /**
     * Traces given target object with its origin.
     * <p>
     * If origin is an element form the target model such as target. The target will be associated
     * to the same origins such as origin.
     * <p>
     * Overwrites any default traces if exists and will prevent any future default tracings.
     * 
     * @param eObject
     *            object to trace to origin
     * @param origin
     *            origin element
     * @return unmodified eObject parameter
     */
    public static <T extends EObject> T trace(final T eObject, final EObject origin) {
        Thread t = Thread.currentThread();
        TracingMapping mapping = activeTransformations.get(t);
        if (mapping != null) {
            HashMultimap<EObject, EObject> appiledDefaultTracing = appiledDefaultTracings.get(t);
            // Remove any default tracing if applied
            if (appiledDefaultTracing.containsKey(eObject)) {
                for (Object defaultTraceObject : appiledDefaultTracing.get(eObject)) {
                    mapping.remove(eObject, defaultTraceObject);
                }
                appiledDefaultTracing.removeAll(eObject);
            }
            // Apply explicit tracing
            mapping.smartPut(origin, eObject);
        }
        return eObject;
    }

    /**
     * Same effect as {@link trace}.
     * 
     * @param eObjectList
     *            object to trace to origins
     * @param origins
     *            List of origin elements
     * @return unmodified eObject parameter
     */
    public static <T extends EObject> T trace(final T eObject, final EObject... origins) {
        for (EObject origin : origins) {
            if (origin != null) {
                trace(eObject, origin);
            }
        }
        return eObject;
    }

    /**
     * Same effect as {@link trace}.
     * 
     * @param eObjectList
     *            List of object to trace to origin
     * @param origin
     *            origin element
     * @return unmodified eObjectList parameter
     */
    public static <T extends EObject> List<T> trace(final List<T> eObjectList, final EObject origin) {
        for (EObject eObject : eObjectList) {
            if (origin != null) {
                trace(eObject, origin);
            }
        }
        return eObjectList;
    }

    /**
     * Same effect as {@link trace}.
     * 
     * @param eObjectList
     *            List of object to trace to origins
     * @param origins
     *            List of origin elements
     * @return unmodified eObjectList parameter
     */
    public static <T extends EObject> List<T> trace(final List<T> eObjectList,
            final EObject... origins) {
        for (EObject eObject : eObjectList) {
            for (EObject origin : origins) {
                if (origin != null) {
                    trace(eObject, origin);
                }
            }
        }
        return eObjectList;
    }

    /**
     * Traces the given object to the default tracing orgins set by {@link setDefaultTrace}.
     * <p>
     * Explicit tracing applied by {@link trace} will not be affected and this function will have no
     * effect. Already applied default tracing relations will be replaced.
     * 
     * @param eObject
     *            object to trace
     * @return unmodified eObject parameter
     */
    public static <T extends EObject> T traceToDefault(final T eObject) {
        Thread t = Thread.currentThread();
        if (activeTransformations.containsKey(t) && tracingDefaults.get(t) != null) {
            TracingMapping mapping = activeTransformations.get(t);
            HashMultimap<EObject, EObject> appiledDefaultTracing = appiledDefaultTracings.get(t);
            List<EObject> tracingDefaultList = tracingDefaults.get(t);
            if (!mapping.contains(eObject)) {
                // If object not already mapped: Apply default tracing
                appiledDefaultTracing.putAll(eObject, tracingDefaultList);
                for (EObject tracingDefault : tracingDefaultList) {
                    mapping.smartPut(tracingDefault, eObject);
                }
            } else if (appiledDefaultTracings.get(t).containsKey(eObject)) {
                // If object already mapped to default apply default tracing:
                // Remove current default mapping and apply new one
                for (EObject tracingDefault : appiledDefaultTracing.get(eObject)) {
                    mapping.remove(tracingDefault, eObject);
                }
                appiledDefaultTracing.removeAll(eObject);
                appiledDefaultTracing.putAll(eObject, tracingDefaultList);
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
     *            origin element to trace by default
     * @return origin unmodified origin parameter
     */
    public static <T extends EObject> T setDefaultTrace(final T origin) {
        tracingDefaults.put(Thread.currentThread(), Lists.<EObject> newArrayList(origin));
        return origin;
    }

    /**
     * Sets given origins as default origins applied in {@link traceToDefault}.
     * 
     * @param origins
     *            List of origins to trace by default
     */
    public static <T extends EObject> void setDefaultTrace(final T... origins) {
        tracingDefaults.put(Thread.currentThread(), Lists.<EObject> newArrayList(origins));
    }

}
