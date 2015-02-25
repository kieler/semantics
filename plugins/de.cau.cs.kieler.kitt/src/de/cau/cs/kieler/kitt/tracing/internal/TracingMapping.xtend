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
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.util.Pair
import java.util.Collection
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.base.Preconditions.*

import static extension com.google.common.collect.Multimaps.*

/**
 * A mapping used for tracing.
 * <p>
 * Offers methods to controls contained tracing relations.
 *  
 * @author als
 * @kieler.design 2015-02-25 proposed
 * @kieler.rating 2015-02-25 proposed yellow
 */
class TracingMapping {

    /** Internal data-structure for model element relations. */
    private val HashMultimap<Object, Object> mapping;

    /** Reverse mapping */
    private val HashMultimap<Object, Object> rmapping;

    /** OPtional title of the associated transformation */
    private var String title = null;

    /** 
     * If deleghate is given the transformation is inplace
     * and all tracing relations will be applied to the delegated TracingMapping
     */
    private val TracingMapping delegate;

    /**
     * Creates a new tracing mapping with give title
     */
    new(String title) {

        // Initial capacity 1000 Entries with 5 Values preventing early rehash
        this.mapping = HashMultimap::create(1000, 5);
        this.rmapping = HashMultimap::create(1000, 5);
        this.delegate = null;
        this.title = title
    }

    /**
     * Creates a new inplace tracing mapping with give title
     */
    new(TracingMapping mapping, String title) {
        this.mapping = mapping.mapping;
        this.rmapping = mapping.rmapping;
        this.delegate = mapping
        this.title = title
    }

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given target to its origin.
     * @return true if the mapping changed.
     * @throws NullPointerException if target or origin is null.
     * @throws IllegalArgumentException if target origin relation adds a loop to the overall mapping.
	 */
    def boolean put(Object origin, Object target) {
        checkNotNull(origin, "Origin object is null");
        checkNotNull(target, "Target object is null");
        checkArgument(origin != target, "Origin is equal to target element.");
        checkArgument(!rmapping.containsKey(origin),
            "Loop detect in tracing mapping. Origin element is already mapped as target.", origin);
        checkArgument(!mapping.containsKey(target),
            "Loop detect in tracing mapping. Target element is already mapped as origin.", target);

        rmapping.put(target, origin);
        return mapping.put(origin, target);
    }

    /**
	 * Maps given targets to given origin. 
     * @return true if the mapping changed.
	 * @throws NullPointerException if targets or origin is null.
	 * @throws IllegalArgumentException if targets list contains null element.
     * @throws IllegalArgumentException if target origin relation adds a loop to the overall mapping.
	 */
    def <T extends Object> boolean putAll(Object origin, Collection<T> targets) {
        checkNotNull(origin, "Origin object is null");
        checkNotNull(targets, "Targets list is null");
        checkArgument(!targets.contains(origin), "Targets list contains origin element");
        checkArgument(!targets.contains(null), "Targets list contains null element");
        checkArgument(!rmapping.containsKey(origin),
            "Loop detect in tracing mapping. Origin element is already mapped as target.", origin);
        val badTargets = targets.filter[mapping.containsKey(it)].toList
        checkArgument(badTargets.empty, "Loop detect in tracing mapping. Target elements are already mapped as origin.",
            badTargets);

        targets.forEach[rmapping.put(it, origin)];
        return mapping.putAll(origin, targets);
    }

    /**
     * Maps given target to its origin.
     * <p>
     * If origin is an element form the target model such as target. The target will be associated to the same origins such as origin.
     * @return true if the mapping changed.
     * @throws NullPointerException if target or origin is null.
     * @throws IllegalArgumentException if target origin relation adds a loop to the overall mapping.
     */
    def smartPut(Object origin, Object target) {
        if (rmapping.containsKey(origin)) { //origin is brother element
            origin.origins.fold(false)[ret, it|ret || it.put(target)];
        } else {
            origin.put(target)
        }
    }

    /**
     * Returns all target mapped to given origin
     * @return List of target for origin
     */
    def List<Object> getTargets(Object origin) {
        return (mapping.get(origin) ?: emptyList).toList;
    }

    /**
     * Returns all origins mapped to given target
     * @return List of origins for target
     */
    def List<Object> getOrigins(Object target) {
        return (rmapping.get(target) ?: emptyList).toList;
    }

    /**
	 * Removes mapping between given objects.
	 * <p>
	 * Source target order is arbitrary.
	 * @param first - origin or target object depending on chosen order
	 * @param second - origin or target object depending on chosen order
	 * @return true if the mapping changed
	 */
    def boolean remove(Object first, Object second) {
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
	 * Object can be origin or target
     * @return true if the mapping changed
	 */
    def List<Pair<Object, Object>> removeAll(Object obj) {
        if (mapping.containsKey(obj)) { //if object is key
            obj.getTargets.forEach[rmapping.remove(it, obj)];
            return mapping.removeAll(obj).map[new Pair(obj, it)].toList;
        } else if (rmapping.containsKey(obj)) { //if object is value
            obj.getOrigins.forEach[mapping.remove(it, obj)];
            return rmapping.removeAll(obj).map[new Pair(it, obj)].toList;
        } else {
            return emptyList;
        }
    }

    /**
	 * Drops all current mapping information
	 */
    def void clear() {
        rmapping.clear();
        mapping.clear();
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
        if (rmapping.containsKey(original)) { //is brother
            copyMapping.entries.forEach [ entry |
                entry.key.origins.forEach[it.put(entry.value)];
            ];
        } else {
            copyMapping.entries.forEach [
                put(it.key, it.value);
            ];
        }
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

    // -------------------------------------------------------------------------
    // Mapping Administration
    /**
     * Returns true if given object is contain in this mapping. Either as origin or target.
     * @param object object to check for
     * @return containment in mapping 
     */
    def contains(Object object) {
        return mapping.containsKey(object) || rmapping.containsKey(object);
    }

    /**
     * Puts all relations of given mapping into this mapping
     * @param otherMapping the other mapping
     */
    def void putAll(TracingMapping otherMapping) {
        checkState(!inPlace, "Cannot perform putAll for in-place tracing mapping.");
        mapping.putAll(otherMapping.mapping)
        rmapping.putAll(otherMapping.rmapping)
    }

    /**
     * Puts all relations of given multimap into this mapping.
     * <p>
     * The other mapping must be sane in case of loops in relations because this method does not check this property but assumes sanity.
     * @param otherMapping the other mapping
     */
    def void putAll(Multimap<Object, Object> otherMapping) {
        checkState(!inPlace, "Cannot perform putAll for in-place tracing mapping.");
        otherMapping.entries.forEach [
            mapping.put(it.key, it.value)
            rmapping.put(it.value, it.key)
        ]
    }

    /**
     * Returns the internal origin-to-target mapping.
     */
    def getInternalMapping() {
        return mapping;
    }

    /**
     * Returns the internal target-to-origin mapping.
     */
    def getInternalReverseMapping() {
        return rmapping;
    }

    /**
     * Returns the internal delegate mapping if this mapping is an in-place mapping.
     */
    def getInternalDelegate() {
        return delegate;
    }

    /**
     * Returns an Iterator over all origin-target-pairs in this mapping.
     * <p>
     * Removing any element will cause an inconsistent mapping.
     * @return iterator over all entries. 
     */
    def getEntryIterator() {
        return mapping.entries.iterator;
    }

    /**
     * Returns the title of the mapping.
     * @return title string.
     */
    def getTitle() {
        return if (title == null) {
            ""
        } else {
            title
        };
    }

    /**
     * Set the title of the mapping to newTitle.
     * @param newTitle new title.
     */
    def setTitle(String newTitle) {
        title = newTitle;
    }

    /**
     * @return true if this mapping is an in-place mapping.
     */
    def isInPlace() {
        return delegate != null;
    }

}
