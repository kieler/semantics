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
package de.cau.cs.kieler.kitt.tracing.internal

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Guice
import de.cau.cs.kieler.kitt.tracing.TracingTreeExtensions
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.util.Pair;

import static com.google.common.base.Preconditions.*

import static extension com.google.common.collect.Multimaps.*

/**
 * Internal class for storing TracingMapping according to the performed tracing chain.
 * 
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 */
class TracingChain {

    // no @Inject because this class will not injected either
    extension TracingTreeExtensions = Guice.createInjector().getInstance(typeof(TracingTreeExtensions));

    /** Constant return field for empty multimaps */
    static val emptyMultiMap = HashMultimap.create(0, 0).unmodifiableMultimap;

    /** Model chain */
    val models = new LinkedList<Object>();

    /** Mappings of each source model to their target models in this chain (except tail) */
    val mappings = new HashMap<Object, TracingMapping>();

    /** 
     * Constructs a new chain with two given model and tracing
     */
    new(Object sourceModel, Object targetModel, TracingMapping mapping) {
        checkNotNull(sourceModel);
        checkNotNull(targetModel);
        checkNotNull(mapping);
        models.add(sourceModel);
        models.add(targetModel);
        mappings.put(sourceModel, mapping);
    }

    /**
     * Adds the new target model into the correct place in the chain and replaces all existing models and mappings.
     */
    def replace(Object sourceModel, Object targetModel, TracingMapping mapping) {
        checkNotNull(sourceModel);
        checkNotNull(targetModel);
        checkNotNull(mapping);
        val indexOfSource = models.indexOf(sourceModel);
        if (indexOfSource != -1) {
            val removedModels = newArrayList();

            //Drop obsolete tail
            if (indexOfSource + 1 != models.size) { //No models to drop
                val deprecatedModels = models.subList(indexOfSource + 1, models.size());
                removedModels.addAll(deprecatedModels);
                mappings.keySet.removeAll(deprecatedModels);
                deprecatedModels.clear();
            }

            //Add new tail
            models.add(targetModel);
            mappings.put(sourceModel, mapping);
            return removedModels;
        }
        return emptyList;
    }

    /**
     * Returns a representation of this chain in form of an TracingTree model.
     */
    def getTracingTree() {
        var ModelWrapper leaf = null;
        return try {
            for (i : 0 .. models.size() - 1) {
                val first = models.get(i) as EObject;
                val second = models.get(i + 1) as EObject;
                val map = mappings.get(first)
                val HashMultimap<EObject, EObject> mapping = HashMultimap::create(1000, 10);
                map.internalMapping.entries.forEach [
                    if (it.key instanceof EObject && it.value instanceof EObject) {
                        mapping.put(it.key as EObject, it.value as EObject);
                    }
                ]
                if (leaf == null) { // create root
                    leaf = mapping.initializeTransformationTree(map.title, first,
                        first.class.simpleName, second, second.class.simpleName);
                } else { // append next leaf
                    leaf = mapping.addTransformationToTree(leaf, map.title, first, second,
                        second.class.simpleName);
                }
            }
            leaf.root;
        } catch (Exception e) {
            if (leaf != null) {
                leaf.root;
            } else {
                null;
            }
        }
    }

    /**
     * Returns the list of models in this chain
     */
    def getModels() {
        return models.immutableCopy;
    }

    /**
     * Performs a transitive join of all mappings between source and target model.
     * <p>
     * Returns a multi-mapping from objects of source model to target model objects.
     */
    def Multimap<Object, Object> getMapping(Object source, Object target) {
        var join = emptyMultiMap
        val indexOfSource = models.indexOf(source);
        val indexOfTarget = models.indexOf(target);
        if (indexOfSource != -1 && indexOfTarget != -1) {
            if (indexOfSource == indexOfTarget) {
                val modelElements = mappings.get(indexOfSource).internalMapping.keySet;
                val mapping = HashMultimap.create(modelElements.size, 1);
                modelElements.forEach[mapping.put(it, it)];
                join = mapping;
            } else if (indexOfSource < indexOfTarget) {
                join = joinChain(models.subList(indexOfSource, indexOfTarget).map[mappings.get(it)].filterNull.toList,
                    false);
            } else {
                join = joinChain(models.subList(indexOfTarget, indexOfSource).map[mappings.get(it)].filterNull.toList,
                    true);
            }
        }
        return join;
    }

    /**
     * Returns the raw TracingMapping generated by the transformation.
     * <p>
     * Source and target must be directly related. No join is performed.
     * <p>
     * Warning: Internal data structure. Changes in this mapping will affect results of this mapping directly.
     */
    def getRawMapping(Object source, Object target) {
        val modelIter = models.listIterator;
        while (modelIter.hasNext) {
            if (modelIter.next == source && modelIter.hasNext && modelIter.next == target) {
                return mappings.get(source);
            }
        }
        return null;
    }

    /**
     * Returns the raw TracingMapping to continue in a inPlace transformation starting at given source.
     */
    def getInPlaceMapping(Object source) {
        val modelIter = models.listIterator;
        while (modelIter.hasNext) {
            if (modelIter.next == source) {
                val prev = modelIter.previous;
                return if (modelIter.hasPrevious) {
                    mappings.get(modelIter.previous)
                } else {
                    mappings.get(prev)
                };
            }
        }
        return null;
    }

    /**
     * Returns the pair of models represented by given mapping.
     */
    def Pair<Object, Object> getModels(TracingMapping mapping) {
        var realMapping = mapping
        while (realMapping.inPlace) {
            realMapping = realMapping.internalDelegate;
        }
        val modelIter = models.listIterator;
        var item = modelIter.next;
        while (modelIter.hasNext) {
            val next = modelIter.next;
            if (mappings.get(item) == realMapping) {
                return new Pair(item, next)
            }
            item = next
        }
        return null;
    }

    /**
     * Performs a transitive join of this chain without using a tree structure.
     * @see TracingTreeException.joinMappings
     */
    private def joinChain(List<TracingMapping> chain, boolean reverse) {
        if (chain.empty) {
            return emptyMultiMap;
        } else {
            val mapping = HashMultimap.create();

            //initial mapping
            if (reverse) {
                chain.reverse;
                mapping.putAll(chain.head.internalReverseMapping);
            } else {
                mapping.putAll(chain.head.internalMapping);
            }
            val keys = mapping.keySet.immutableCopy
            chain.drop(1).forEach [
                val map = if (reverse) {
                        it.internalReverseMapping;
                    } else {
                        it.internalMapping;
                    }
                //Replace all values by new values of additional joined (next) mapping
                keys.forEach [ key |
                    //resolve elementTransformation for all values and replace value
                    val values = mapping.get(key).map [
                        map.get(it)
                    ].fold(new HashSet) [ first, second | //fold new values into one set
                        first.addAll(second);
                        first; //return first as container of next folding
                    ];
                    mapping.replaceValues(key, values);
                ];
            ];
            return mapping;
        }
    }

}
