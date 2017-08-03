/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kicool.kitt.tracing;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.properties.IProperty;
import de.cau.cs.kieler.core.model.properties.Property;
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable;
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingMapping;
import de.cau.cs.kieler.kicool.kitt.tracingtree.ModelWrapper;

/**
 * Manages tracing of models. This implementation is focused on chains of transformations. For
 * advanced tracing features use TracingTree directly.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 * 
 */
public class Tracing implements IKiCoolCloneable {
    
    /**
     * Activates tracing if set to true in the compiler context.
     */
    public static final IProperty<Boolean> ACTIVE_TRACING = new Property<Boolean>(
            "de.cau.cs.kieler.kicool.kitt.tracingActive", false);

    public static final IProperty<Tracing> TRACING_DATA = new Property<Tracing>(
            "de.cau.cs.kieler.kicool.kitt.tracingData", null);

    
    private static TracingTreeExtensions treeExtension = Guice.createInjector().getInstance(
            TracingTreeExtensions.class);

    /** Tracing chain */
    private TracingChain chain;
    /** Generated reports */
    private HashMap<Object, TracingReport> reports = new HashMap<Object, TracingReport>();

    /**
     * @see startTransformationTracing(sourceModel, null, null, true)
     */
    public void startTransformationTracing(final EObject sourceModel) {
        startTransformationTracing(sourceModel, null, null, true);
    }

    /**
     * @see startTransformationTracing(sourceModel, null, name, true)
     */
    public void startTransformationTracing(final EObject sourceModel, String name) {
        startTransformationTracing(sourceModel, null, name, true);
    }

    /**
     * @see startTransformationTracing(sourceModel, null, null, inPlaceTransformation)
     */
    public void startTransformationTracing(final EObject sourceModel,
            final boolean inPlaceTransformation) {
        startTransformationTracing(sourceModel, null, null, inPlaceTransformation);
    }

    /**
     * Starts a new transformation tracing in the current thread for the given model.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     * @param name
     *            the name of the transformation
     * @param inPlaceTransformation
     *            transformation type
     * @throws IllegalStateException
     *             if another transformation is currently running in the same thread.
     */
    public void startTransformationTracing(final EObject sourceModel, final EObject targetModel,
            final String name, final boolean inPlaceTransformation) {
        TransformationTracing.startTransformationTracing(this, sourceModel, targetModel, name,
                inPlaceTransformation);
    }

    /**
     * Completes the current model transformation in the current thread with given source and target
     * model. All gathered information are stored.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     */
    public void finishTransformationTracing(final EObject sourceModel, final Object targetModel) {
        finishTransformationTracing(sourceModel, targetModel, false);
    }

    /**
     * Completes the current model transformation in the current thread with given source and target
     * model. All gathered information are stored. If createReport is true the tracing data will be
     * validated with the given models and a {@link TracingReport} is returned. This will consume
     * additional time.
     * 
     * @param sourceModel
     *            the source model
     * @param targetModel
     *            the target model
     * @return TracingReport if createReport is true else null
     */
    public TracingReport finishTransformationTracing(final EObject sourceModel,
            final Object targetModel, boolean createReport) {
        TracingReport report =
                TransformationTracing.finishTransformationTracing(sourceModel, targetModel,
                        createReport);
        if (report != null) {
            reports.put(sourceModel, report);
        }
        return report;
    }

    /**
     * Creates a transitive join of all mappings between source and target.
     * <p>
     * Source and target model must have a common tracing chain. Source and target model can be in
     * arbitrary order according to the sequence in the chain.
     * 
     * @param source
     *            the source model
     * @param target
     *            the target model
     * @return Unmodifiable multi-mapping from source model objects to target model objects or null
     *         if any parameter is invalid
     */
    public Multimap<Object, Object> getMapping(Object source, Object target) {
        List<Object> models = chain.getModels();
        // check if both models are listed and if both have the same source model
        if (models.contains(source) && models.contains(target)) {
            return chain.getMapping(source, target);
        }
        return null;
    }

    public TracingReport getReport(Object model) {
        return reports.get(model);
    }

    /**
     * Returns the stored tracing chain.
     * <p>
     * Warning: This TracingChain is the actual mutable information record and can have side effects
     * on other other processes working with the same data as well as suffer under effects of
     * concurrent modification.
     * 
     * @return The stored transformation chain, null if no tracing data available.
     */
    public TracingChain getTracingChain() {
        return chain;
    }

    /**
     * Returns TracingTree model representation of the tracing chain. The TracingTree model is
     * enriched by transformationNames.
     * 
     * @param model
     *            the model
     * @return ModelWrapper instance representing the root of the TracingTree model. Returns null if
     *         no model could be created.
     */
    public ModelWrapper getTracingTree() {
        return chain.getTracingTree();
    }

    /**
     * Saves the tracing chain in form of a TracingTree model into the given resource.
     * 
     * @param resource
     *            the resource to save into
     * @return true if saving was successful else false
     */
    public boolean saveAsTracingTree(Resource resource) {
        return treeExtension.saveTracingTree(getTracingTree(), resource);
    }

    /**
     * Adds a new tracing mapping into the tracing chain. Creates a new chain if necessary. If this
     * the new transformation chains up in an existing chain, all deprecated transformations will be
     * dropped. The given targetModel will be the new end (result) of the chain.
     * 
     * @param sourceModel
     *            source model of transformation.
     * @param targetModel
     *            resulting model of transformation.
     * @param tracingMapping
     *            tracing mapping produced by transformation.
     */
    void addTransformationTrace(Object sourceModel, Object targetModel,
            TracingMapping tracingMapping) {
        Preconditions.checkNotNull(sourceModel);
        Preconditions.checkNotNull(targetModel);
        Preconditions.checkNotNull(tracingMapping);
        Preconditions.checkArgument(sourceModel == targetModel ^ !tracingMapping.isInPlace(),
                "Source and Target model are the same object but mapping is in place");

        if (!tracingMapping.isInPlace()) {
            if (chain == null) {// create new chain if no one exists
                chain = new TracingChain(sourceModel, targetModel, tracingMapping);
            } else {// remove all now obsolete elements in existing chain and replace with new one
                chain.replace(sourceModel, targetModel, tracingMapping);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMutable() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object cloneObject() {
        return this;
    }
}
