/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.tracing

import com.google.common.collect.HashMultimap
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.base.Preconditions.*

import static extension com.google.common.collect.Multimaps.*
import static extension com.google.common.collect.Sets.*
import static extension de.cau.cs.kieler.kitt.tracing.ModelTracingManager.*

/**
 * Extension for creating mappings during transformation.
 * @kieler.design 2014-08-11 proposed
 * @kieler.rating 2014-08-11 proposed yellow
 * 
 * @author als
 *
 */
class TransformationMapping {

    /** Internal data-structure for single model transformation. Initial capacity 100 Entries with 10 Values preventing early rehash */
    private val HashMultimap<EObject, EObject> mapping = HashMultimap::create(1000, 10);

    /** Reverse mapping */
    private val HashMultimap<EObject, EObject> rmapping = HashMultimap::create(1000, 10);

    /** Flag indication execution of tracing methods */
    private var boolean noTracing = true;

    // -------------------------------------------------------------------------
    // Tracing Control
    /**
     * Indicates the start of tracing of transformation on given model
     * if tracing is activated for given model in {@link ModelTracingManager}.
     * 
     * @param source root object of source model.
     * @return source.
     */
    def EObject startTracing(EObject source) {
        clearMapping();

        //Check if tracing is activated for source model in ModelTracingManager
        if (source.isTracingActivated) {
            noTracing = false;
        } else {
            noTracing = true;
        }
        return source;
    }

    /**
     * Indicates the end tracing of transformation on given model with given result.
     * 
     * @param source root object of source model.
     * @param result root object of resulting model of transformation.
     * @return result.
     */
    def EObject stopTracing(EObject source, EObject result) {
        noTracing = true;

        //Add recorded trace to ModelTracingManager
        source.addTransformationTrace(result, mappingData);
        return result;
    }

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given parent as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapParent(EObject child, EObject parent) {
        if (noTracing) {
            return false;
        }
        return parent.mapChild(child);
    }

    /**
     * Maps given parents as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws NullPointerException if parents or child is null.
     * @throws IllegalArgumentException if children list contains null element.
     */
    def boolean mapParents(EObject child, List<EObject> parents) {
        if (noTracing) {
            return false;
        }
        checkNotNull(parents, "Parent list object is null");
        checkNotNull(child, "Child list is null");
        checkArgument(!parents.contains(null), "Parent list contains null element");

        return parents.fold(false) [ boolean changes, EObject parent |
            parent.mapChild(child) || changes;
        ];
    }

    /**
	 * Maps given child as result of this transformation for given parent.
     * @return true if the mapping changed.
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapChild(EObject parent, EObject child) {
        if (noTracing) {
            return false;
        }
        checkNotNull(parent, "Parent object is null");
        checkNotNull(child, "Child object is null");

        rmapping.put(child, parent);
        return mapping.put(parent, child);
    }

    /**
	 * Maps given children as results of this transformation for given parent. 
     * @return true if the mapping changed.
	 * @throws NullPointerException if parent or children list is null.
	 * @throws IllegalArgumentException if children list contains null element.
	 */
    def boolean mapChildren(EObject parent, List<EObject> children) {
        if (noTracing) {
            return false;
        }
        checkNotNull(parent, "Parent object is null");
        checkNotNull(children, "Children list is null");
        checkArgument(!children.contains(null), "Children list contains null element");

        children.forEach[rmapping.put(it, parent)];
        return mapping.putAll(parent, children);
    }

    /**
     * Returns all children mapped to given parent
     * @return List of children for parent
     */
    def List<EObject> mappedChildren(EObject parent) {
        if (noTracing) {
            return emptyList;
        }
        return (mapping.get(parent) ?: emptyList).toList;
    }

    /**
     * Returns all parents mapped to given child
     * @return List of parents for child
     */
    def List<EObject> mappedParents(EObject child) {
        if (noTracing) {
            return emptyList;
        }
        return (rmapping.get(child) ?: emptyList).toList;
    }

    /**
	 * Removes mapping between given objects.
	 * <p>
	 * Parent child order is arbitrary.
	 * @param first - parent or child object depending on chosen order
	 * @param second - parent or child object depending on chosen order
	 * @return true if the mapping changed
	 */
    def boolean unmap(EObject first, EObject second) {
        if (noTracing) {
            return false;
        }
        if (mapping.containsKey(first)) { //if first is key
            rmapping.remove(second, first);
            return mapping.remove(first, second);
        } else if (mapping.containsKey(second)) { //if second is key
            rmapping.remove(first, second);
            return mapping.remove(second, first);
        } else {
            return false;
        }
    }

    /**
	 * Removes all mappings for given objects.
	 * <p>
	 * Object can be parent or child
     * @return true if the mapping changed
	 */
    def boolean unmapAll(EObject obj) {
        if (noTracing) {
            return false;
        }
        if (mapping.containsKey(obj)) { //if object is key
            obj.mappedChildren.forEach[rmapping.remove(it, obj)];
            return !mapping.removeAll(obj).empty;
        } else if (mapping.containsValue(obj)) { //if object is value
            val retVal = obj.mappedParents.fold(false) [ boolean changes, EObject key |
                mapping.remove(key, obj) || changes;
            ];
            rmapping.removeAll(obj);
            return retVal;
        } else {
            return false;
        }
    }

    /**
	 * Drops all current mapping information
	 */
    def void clearMapping() {
        rmapping.clear();
        mapping.clear();
    }

    // -------------------------------------------------------------------------
    // Mapping helpers
    /**
	 * Creates a copy of original and saves mapping. 
	 * <p>
	 * Use for transformations based on copies.
	 * <p>
	 * Mapping will include given root elements.
	 * @param original model to copy
	 * @return copy   
	 */
    def <T extends EObject> T mappedCopy(T original) {
        if (noTracing) {
            return EcoreUtil.copy(original);
        }
        val copyMapping = HashMultimap.create;
        val copy = original.mappedCopy(copyMapping);
        copyMapping.keySet.forEach[it.mapChildren(copyMapping.get(it).toList)];
        return copy;
    }

    /**
     * Creates a copy of original and adds mapping information to given map.
     * <p>
     * Mapping will include given root elements.
     * @param original model to copy
     * @param map to store mapping information
     * @return copy   
     */
    def <T extends EObject> T mappedCopy(T original, HashMultimap<EObject, EObject> map) {

        // This code is taken from ECoreUtil.copy
        val copier = new Copier();
        val T result = copier.copy(original) as T;
        copier.copyReferences();

        //copy mapping from copier to mapping
        map.putAll(copier.forMap);

        return result;
    }

    /**
	 * Checks if mapping is complete
	 * <p>
	 * All objects in sourceModel are compared with parents and all targetModel objects are compared to children, both includes given source/target-model objects.
	 * <p>
	 * Returns Pair of two sets where were key-element is symmetric difference between source model objects and all parents and value-element is symmetric difference between target and children.
	 * All elements are mapped correctly if both sets are empty.
	 * @throws NullPointerException if sourceModel or targetMode is null.
	 * @return Pair of two Sets with symmetric differences.
	 */
    def checkMappingCompleteness(EObject sourceModel, EObject targetModel) {
        checkNotNull(sourceModel, "Source model object is null");
        checkNotNull(targetModel, "Target model object is null");

        //check if all elements in source model are keys in mapping		
        //keySet must be converted to LinkedHashSet because symmetricDifference need same types of Set.
        val keyDiff = (sourceModel.eAllContents.toSet => [it.add(sourceModel)]).symmetricDifference(
            newLinkedHashSet(mapping.keySet));

        //check if all elements in target model are values in mapping
        val valueDiff = (targetModel.eAllContents.toSet => [it.add(targetModel)]).symmetricDifference(
            newLinkedHashSet(mapping.values));

        return new Pair(keyDiff.immutableCopy, valueDiff.immutableCopy);
    }

    // -------------------------------------------------------------------------
    // mapping data access
    /**
     * This will return the mapping data.
     * @return mapping
     */
    def getMappingData() {
        return mapping;
    }

}
