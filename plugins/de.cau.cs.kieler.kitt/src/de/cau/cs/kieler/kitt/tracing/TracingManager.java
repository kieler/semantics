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
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.google.inject.Guice;

import de.cau.cs.kieler.kitt.tracing.internal.TracingChain;
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper;

/**
 * Manages tracing of models. This implementation is focused on chains of transformations. For
 * advanced tracing features use TracingTree directly.
 * <p>
 * Multiple concurrent transformation on the same source model are not supported yet.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 * 
 */
public class TracingManager {

    private static TracingTreeExtensions treeExtension = Guice.createInjector().getInstance(
            TracingTreeExtensions.class);

    /** Map for all stored transformation chain mappings */
    private static HashMap<Object, TracingChain> chains = new HashMap<Object, TracingChain>();

    /**
     * Map from any traced model to its source model representing the root (key) of its
     * transformation chain
     */
    private static HashMap<Object, Object> sourceModels = new HashMap<Object, Object>();

    /**
     * A set containing all models with active tracing
     */
    private static HashSet<Object> activeTracingModels = new HashSet<Object>();

    /**
     * Private Constructor to prevent instantiation of static class
     */
    private TracingManager() {
    }

    /**
     * @see setActivateTracing(model, true)
     */
    public static synchronized void activateTracing(EObject model) {
        setActivateTracing(model, true);
    }

    /**
     * @see setActivateTracing(model, false)
     */
    public static synchronized void deactivateTracing(EObject model) {
        setActivateTracing(model, false);
    }

    /**
     * Activates or deactivates tracing for given model.
     * <p>
     * Any transformation producing a mapping will check if tracing is activated for a model. If
     * activated the mapping will be stored in the associated tracing chain. Consequently any
     * resulting models will be marked as active tracing too.
     * <p>
     * If tracing is already performed the produced tracing chain will NOT be deleted when
     * deactivating tracing. Use {@link clearTracing} to delete all produced data for the given
     * model.
     * 
     * @param model
     *            the model
     * @param active
     *            active flag
     */
    public static synchronized void setActivateTracing(EObject model, boolean active) {
        if (active) {
            if (!sourceModels.containsKey(model)) {
                sourceModels.put(model, model);
            }
            activeTracingModels.add(model);
        } else {
            activeTracingModels.remove(model);
        }
    }

    /**
     * Checks if tracing is activated for given model.
     * 
     * @param model
     *            the model
     * @return true if tracing is activated, else false
     */
    public static synchronized boolean isTracingActivated(Object model) {
        return activeTracingModels.contains(model);
    }

    /**
     * Clears all tracing information for given model and all related model including the tracing
     * tree. All related models and the model itself are no longer activated for tracing.
     * 
     * @param model
     *            the model
     */
    public static synchronized void clearTracing(EObject model) {
        Object source = sourceModels.get(model);
        if (source != null) {
            TracingChain chain = chains.get(source);
            chains.remove(source); // remove chain
            activeTracingModels.contains(model);
            if (chain != null) {
                // remove all source model entries if available
                for (Object relatedModel : chain.getModels()) {
                    sourceModels.remove(relatedModel);
                    activeTracingModels.contains(relatedModel);
                }
            }
        }
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
    public static synchronized Multimap<Object, Object> getMapping(Object source, Object target) {
        // check if both models are listed and if both have the same source model
        if (sourceModels.containsKey(source) && sourceModels.containsKey(target)
                && sourceModels.get(source) == sourceModels.get(target)) {
            return chains.get(sourceModels.get(source)).getMapping(source, target);
        }
        return null;
    }

    /**
     * Returns the stored tracing chain for given model.
     * <p>
     * Warning: This TracingChain is the actual mutable information record and can have side effects
     * on other other processes working with the same data as well as suffer under effects of
     * concurrent modification.
     * 
     * @param model
     *            the model
     * @return The stored transformation chain, null if no tracing data available.
     */
    public static synchronized TracingChain getTracingChain(Object model) {
        Object source = sourceModels.get(model);
        if (source != null) {
            return chains.get(source);
        }
        return null;
    }

    /**
     * Returns TracingTree model representation of the tracing chain of the given model. The
     * TracingTree model is enriched by transformationNames.
     * 
     * @param model
     *            the model
     * @return ModelWrapper instance representing the root of the TracingTree model. Returns null if
     *         no model could be created.
     */
    public static synchronized ModelWrapper getTracingTree(EObject model) {
        if (sourceModels.containsKey(model)) {
            TracingChain chain = chains.get(sourceModels.get(model));
            if (chain != null) {
                return chain.getTracingTree();
            }
        }
        return null;
    }

    /**
     * Saves the tracing chain of the given model in form of a TracingTree model into the given
     * resource.
     * 
     * @param model
     *            the model
     * @param resource
     *            the resource to save into
     * @return true if saving was successful else false
     */
    public static synchronized boolean saveAsTracingTree(EObject model, Resource resource) {
        return treeExtension.saveTracingTree(getTracingTree(model), resource);
    }

    /**
     * Adds a new tracing mapping into the correct tracing chain of the given model. Creates a new
     * chain if necessary. If this the new transformation chains up in an existing chain, all
     * deprecated transformations will be dropped. The given targetModel will be the new end
     * (result) of the chain.
     * 
     * @param sourceModel
     *            source model of transformation.
     * @param targetModel
     *            resulting model of transformation.
     * @param tracingMapping
     *            tracing mapping produced by transformation.
     */
    static synchronized void addTransformationTrace(Object sourceModel, Object targetModel,
            TracingMapping tracingMapping) {
        Preconditions.checkNotNull(sourceModel);
        Preconditions.checkNotNull(targetModel);
        Preconditions.checkNotNull(tracingMapping);
        Preconditions.checkArgument(sourceModel == targetModel ^ !tracingMapping.isInPlace(),
                "Source and Target model are the same object but mapping is in place");

        if (sourceModels.containsKey(sourceModel) && !tracingMapping.isInPlace()) {
            Object root = sourceModels.get(sourceModel);
            TracingChain chain = chains.get(root);
            if (chain == null) {// create new chain if no one exists
                chains.put(root, new TracingChain(sourceModel, targetModel, tracingMapping));
            } else {// remove all now obsolete elements in existing chain and replace with new one
                sourceModels.entrySet().removeAll(
                        chain.replace(sourceModel, targetModel, tracingMapping));
            }
            // activate tracing for new resulted model
            sourceModels.put(sourceModel, root);
            sourceModels.put(targetModel, root);
            activeTracingModels.add(targetModel);
        }
    }
}
