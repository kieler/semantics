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
package de.cau.cs.kieler.kitt.tracing.internal

import com.google.common.collect.HashMultimap
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.base.Preconditions.*

import static extension com.google.common.collect.Multimaps.*

/**
 * 
 * @kieler.design 2014-08-11 proposed
 * @kieler.rating 2014-08-11 proposed yellow
 * 
 * @author als
 *
 */
class TracingMapping {

    /** Internal data-structure for single model transformation. Initial capacity 1000 Entries with 10 Values preventing early rehash */
    private val HashMultimap<Object, Object> mapping = HashMultimap::create(1000, 10);

    /** Reverse mapping */
    private val HashMultimap<Object, Object> rmapping = HashMultimap::create(1000, 10);

    private val boolean inPlace;
    private var title = "unknown";

    new() {
        inPlace = false;
    }

    new(TracingMapping mapping) {
        inPlace = true;
    }

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given parent as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapParent(Object child, Object parent) {
        return parent.mapChild(child);
    }

    /**
     * Maps given parents as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws NullPointerException if parents or child is null.
     * @throws IllegalArgumentException if children list contains null element.
     */
    def boolean mapParents(Object child, List<Object> parents) {
        checkNotNull(parents, "Parent list object is null");
        checkNotNull(child, "Child list is null");
        checkArgument(!parents.contains(null), "Parent list contains null element");

        return parents.fold(false) [ boolean changes, Object parent |
            parent.mapChild(child) || changes;
        ];
    }

    /**
	 * Maps given child as result of this transformation for given parent.
     * @return true if the mapping changed.
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapChild(Object parent, Object child) {
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
    def boolean mapChildren(Object parent, List<Object> children) {
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
    def List<Object> mappedChildren(Object parent) {
        return (mapping.get(parent) ?: emptyList).toList;
    }

    /**
     * Returns all parents mapped to given child
     * @return List of parents for child
     */
    def List<Object> mappedParents(Object child) {
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
    def boolean unmap(Object first, Object second) {
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
    def boolean unmapAll(Object obj) {
        if (mapping.containsKey(obj)) { //if object is key
            obj.mappedChildren.forEach[rmapping.remove(it, obj)];
            return !mapping.removeAll(obj).empty;
        } else if (mapping.containsValue(obj)) { //if object is value
            val retVal = obj.mappedParents.fold(false) [ boolean changes, Object key |
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
    def void clear() {
        rmapping.clear();
        mapping.clear();
    }

    def contains(Object obj) {
        return mapping.containsKey(obj) || rmapping.containsKey(obj);
    }

    // -------------------------------------------------------------------------
    // Mapped Copies
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
        val copyMapping = HashMultimap.create;
        val copy = original.mappedCopy(copyMapping);
        copyMapping.entries.forEach [
            mapping.put(it.key, it.value);
            rmapping.put(it.value, it.key);
        ];
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
    static def <T extends EObject> T mappedCopy(EObject original, HashMultimap<Object, Object> map) {

        // This code is taken from ECoreUtil.copy
        val copier = new Copier();
        val T result = copier.copy(original) as T;
        copier.copyReferences();

        //copy mapping from copier to mapping
        map.putAll(copier.forMap);

        return result;
    }

    def getMapping() {
        return mapping;
    }
    
    def getReverseMapping() {
        return rmapping;
    }

    def getTitle() {
        return title;
    }

    def setTitle(String newTitle) {
        title = newTitle;
    }
}
