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

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Guice;

import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper;

/**
 * Manages tracing of models. This implementation is focused on chains of transformations. For
 * advanced tracing features use TracingTree directly.
 * 
 * @author als
 * @kieler.design 2014-08-11 proposed
 * @kieler.rating 2014-08-11 proposed yellow
 * 
 */
public class ModelTracingManager {
    /** Private class to handle tracing chain related model and mappings and cache resolved mappings */
    protected static class TracingChain {
        public LinkedList<EObject> models = new LinkedList<EObject>();
        public LinkedList<Multimap<EObject, EObject>> mappings =
                new LinkedList<Multimap<EObject, EObject>>();
        public HashMap<Pair<EObject, EObject>, Multimap<EObject, EObject>> joins =
                new HashMap<Pair<EObject, EObject>, Multimap<EObject, EObject>>();
    }

    private final static TransitiveChainJoinUtil joiner = Guice.createInjector().getInstance(
            TransitiveChainJoinUtil.class);
    private final static TracingTreeExtensions treeExtension = Guice.createInjector().getInstance(
            TracingTreeExtensions.class);

    /** Map for all stored transformation chain mappings */
    private static HashMap<EObject, TracingChain> chainMap = new HashMap<EObject, TracingChain>();

    /**
     * Map from any traced model to its source model representing the root (key) of its
     * transformation chain
     */
    private static HashMap<EObject, EObject> sourceModels = new HashMap<EObject, EObject>();

    /**
     * Prevent Instantiation
     */
    private ModelTracingManager() {
    }

    /**
     * Activates tracing for given model.
     * <p>
     * Any transformation producing a mapping will check if tracing is activated for a model. If
     * activated the mapping will be stored in the associated tracing chain. Consequently any
     * resulting models will be marked as active tracing too. *
     * 
     * @param model
     *            the model
     */
    public static void activateTracing(EObject model) {
        if (!sourceModels.containsKey(model)) {
            sourceModels.put(model, model);
        }
    }

    /**
     * Checks if tracing is activated for given model.
     * 
     * @param model
     *            the model
     * @return true if tracing is activated, else false
     */
    public static boolean isTracingActivated(Object model) {
        return sourceModels.containsKey(model);
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
    public static Multimap<EObject, EObject> getMapping(EObject source, EObject target) {
        // check if both models are listed and if both have the same source model
        if (sourceModels.containsKey(source) && sourceModels.containsKey(source)
                && sourceModels.get(source) == sourceModels.get(target)) {
            TracingChain tracingChain = chainMap.get(sourceModels.get(source));
            // get cached join or perform a join an cache it
            Pair<EObject, EObject> id = new Pair<EObject, EObject>(source, target);
            if (!tracingChain.joins.containsKey(id)) {
                // use utility to perform transitive join on a chain
                tracingChain.joins.put(id, joiner.join(source, target, tracingChain));
            }
            return Multimaps.unmodifiableMultimap(tracingChain.joins.get(id));
        }
        return null;
    }

    /**
     * Return the stored tracing chain for given model,resulted by each performed transformation.
     * 
     * @param model
     *            the model
     * @return Immutable copy of the stored transformation chain. Returns null if no chain
     *         available.
     */
    public static ImmutableList<Pair<EObject, Multimap<EObject, EObject>>> getTracingChain(
            EObject model) {
        EObject source = sourceModels.get(model);
        if (source != null) {
            TracingChain chain = chainMap.get(source);
            Multimap<EObject, EObject> mapping;
            // create immutable chain list
            Builder<Pair<EObject, Multimap<EObject, EObject>>> builder = ImmutableList.builder();
            for (int i = 0; i < chain.models.size(); i++) {
                if (i < chain.mappings.size()) {
                    mapping = Multimaps.unmodifiableMultimap(chain.mappings.get(i));
                } else {
                    mapping = null;
                }
                builder.add(new Pair<EObject, Multimap<EObject, EObject>>(chain.models.get(i),
                        mapping));
            }
            return builder.build();
        }
        return null;
    }

    /**
     * Returns TracingTree model representation of tracing chain of given model. The TracingTree
     * model is enriched by transformationNames.
     * 
     * @param model
     *            the model
     * @param transformationNames
     *            list with transformation names apposite to transformation chain. Missing item or a
     *            null list will be replaced with "unknown" transformation name.
     * @return ModelWrapper instance representing the root of the TracingTree model. Returns null if
     *         no model could be created.
     */
    public static ModelWrapper getTracingTree(EObject model, List<String> transformationNames) {
        if (sourceModels.containsKey(model)) {
            TracingChain chain = chainMap.get(sourceModels.get(model));
            if (chain != null && chain.models.size() >= 2) {
                ModelWrapper leaf = null;
                for (int i = 0; i < chain.models.size() - 1; i++) {
                    if (leaf == null) {// create root
                        leaf =
                                treeExtension.initializeTransformationTree(chain.mappings.get(i),
                                        getTransformationID(transformationNames, i),
                                        chain.models.get(i), chain.models.get(i).getClass()
                                                .getSimpleName(), chain.models.get(i + 1),
                                        chain.models.get(i + 1).getClass().getSimpleName());
                    } else {// append next leaf
                        leaf =
                                treeExtension.addTransformationToTree(chain.mappings.get(i), leaf,
                                        getTransformationID(transformationNames, i),
                                        chain.models.get(i), chain.models.get(i + 1), chain.models
                                                .get(i + 1).getClass().getSimpleName());
                    }
                }
                return treeExtension.root(leaf);
            }
        }
        return null;
    }

    /**
     * Helper function to retrieve a correct transformation name from the list or the default if not
     * possible.
     * 
     * @param transformationNames
     *            List of names. May be null or in incorrect length
     * @param index
     *            index of item to retrieve
     * @return valid transformation name
     */
    private static String getTransformationID(List<String> transformationNames, int index) {
        if (transformationNames != null && index >= 0 && index < transformationNames.size()
                && transformationNames.get(index) != null) {
            return transformationNames.get(index);
        }
        return "unknown";
    }

    /**
     * Saves a TracingTree model into the given resource.
     * 
     * @param tracingTree
     *            the tracing tree root element
     * @param resource
     *            the resource to save into
     * @return true if saving was successful else false
     */
    public static boolean saveTracingTree(ModelWrapper tracingTree, Resource resource) {
        if (tracingTree != null) {
            // Add the model objects to the contents.
            resource.getContents().add(tracingTree);
            resource.getContents().add(tracingTree.getRootObject().getEObject());
            for (ModelWrapper mw : treeExtension.succeedingModelWrappers(tracingTree)) {
                resource.getContents().add(mw.getRootObject().getEObject());
            }

            // Save the contents of the resource to the file system.
            try {
                resource.save(Collections.EMPTY_MAP);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Saves the tracing chain of given model in form of a TracingTree model into the given
     * resource.
     * 
     * @param model
     *            the model
     * @param transformations
     *            list with transformation names apposite to transformation chain.
     * @param resource
     *            the resource to save into
     * @return true if saving was successful else false
     */
    public static boolean saveAsTracingTree(EObject model, List<String> transformations,
            Resource resource) {
        return saveTracingTree(getTracingTree(model, transformations), resource);
    }

    /**
     * Clears all tracing information for given model and all related model including the tracing
     * tree. All related model are no longer activated for tracing.
     * 
     * @param model
     *            the model
     */
    public static void clearTracing(EObject model) {
        EObject source = sourceModels.get(model);
        if (source != null) {
            TracingChain chain = chainMap.get(source);
            chainMap.remove(source); // remove chain
            if (chain != null) {
                // remove all source model entries if available
                for (EObject relatedModel : chain.models) {
                    sourceModels.remove(relatedModel);
                }
            }
        }
    }

    /**
     * Adds a new transformation mapping into the correct tracing chain of the given model. Creates
     * a new chain if it is the first transformation and removes all existing but now replaced or
     * cut steps in existing chain.
     * 
     * @param source
     *            source model of transformation.
     * @param result
     *            resulting model of transformation.
     * @param mapping
     *            transformation mapping produced by transformation.
     */
    protected static void addTransformationTrace(EObject source, EObject result,
            Multimap<EObject, EObject> mapping) {
        Preconditions.checkNotNull(source);
        Preconditions.checkNotNull(result);
        Preconditions.checkNotNull(mapping);
        if (sourceModels.containsKey(source)) {
            EObject root = sourceModels.get(source);
            TracingChain chain = chainMap.get(root);
            int indexOfSource = 0;
            if (chain == null) {// create new chain if no one exists
                chain = new TracingChain();
                chainMap.put(root, chain);
            } else {// remove all now obsolete elements in existing chain
                indexOfSource = chain.models.indexOf(source);
                chain.models.subList(indexOfSource + 1, chain.models.size()).clear();
                chain.mappings.subList(indexOfSource, chain.mappings.size()).clear();
            }
            // add new mapping parts to chain
            chain.models.add(result);
            chain.mappings.add(HashMultimap.create(mapping));
            sourceModels.put(source, root);
            sourceModels.put(result, root);
        }
    }
}
