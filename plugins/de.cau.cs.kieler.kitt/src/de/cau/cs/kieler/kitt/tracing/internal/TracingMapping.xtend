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
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EContentAdapter
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
class TracingMapping extends EContentAdapter {

    /** Internal data-structure for model element relations. Initial capacity 10000 Entries with 10 Values preventing early rehash */
    private val HashMultimap<Object, Object> mapping;

    /** Reverse mapping */
    private val HashMultimap<Object, Object> rmapping;

    private val HashMap<EObject, List<de.cau.cs.kieler.core.util.Pair<Object, Object>>> removedEntries = newHashMap;

    private var String title = null;

    private val TracingMapping delegate;

    new(String title) {
        this.mapping = HashMultimap::create(10000, 10);
        this.rmapping = HashMultimap::create(10000, 10);
        this.delegate = null;
        this.title = title
    }

    new(TracingMapping mapping, String title) {
        this.mapping = mapping.mapping;
        this.rmapping = mapping.rmapping;
        this.delegate = mapping
        this.title = title
        if (mapping.title == null || mapping.title.empty) {
            mapping.title = title
        } else {
            mapping.title = mapping.title + "," + title
        }
    }

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given target to its origin.
     * @return true if the mapping changed.
     * @throws NullPointerException if target or origin is null.
	 */
    def boolean put(Object origin, Object target) {
        checkNotNull(origin, "Origin object is null");
        checkNotNull(target, "Target object is null");
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
	 */
    def boolean put(Object origin, List<Object> targets) {
        checkNotNull(origin, "Origin object is null");
        checkNotNull(targets, "Targets list is null");
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
    def List<de.cau.cs.kieler.core.util.Pair<Object, Object>> removeAll(Object obj) {
        if (mapping.containsKey(obj)) { //if object is key
            obj.getTargets.forEach[rmapping.remove(it, obj)];
            return mapping.removeAll(obj).map[new de.cau.cs.kieler.core.util.Pair(obj, it)].toList;
        } else if (rmapping.containsKey(obj)) { //if object is value
            obj.getOrigins.forEach[mapping.remove(it, obj)];
            return rmapping.removeAll(obj).map[new de.cau.cs.kieler.core.util.Pair(it, obj)].toList;
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

    //remove stuff
    override notifyChanged(Notification notification) {
        val EObject notifier = notification.notifier as EObject;
        if (notification.eventType == Notification.ADD) {
            val EObject element = notification.newValue as EObject;
            if (removedEntries.containsKey(element)) {
                removedEntries.get(element).forEach[put(it.first, it.second)];
                removedEntries.remove(element);
                element.eAllContents.forEach [
                    removedEntries.get(it)?.forEach[put(it.first, it.second)];
                    removedEntries.remove(it);
                ];
            }
        } else if (notification.eventType == Notification.REMOVE) {
            val EObject element = notification.oldValue as EObject;
            if (!contains(element.eContainer)) {
                removedEntries.put(element, element.removeAll);
                element.eAllContents.forEach[removedEntries.put(it, it.removeAll)]
            }
        }
    }


    //smart
    def smartPut(Object origin, Object target) {
        if (rmapping.containsKey(origin)) { //origin is brother element
            origin.origins.forEach[it.put(target)];
        } else {
            origin.put(target)
        }
    }

    //hint: no loop check
    def putAll(TracingMapping otherMapping) {
        checkState(!inPlace, "Cannot perform putAll for in-place tracing mapping.");
        mapping.putAll(otherMapping.mapping)
        rmapping.putAll(otherMapping.rmapping)
    }

    //hint: no loop check
    def putAll(Multimap<Object, Object> otherMapping) {
        checkState(!inPlace, "Cannot perform putAll for in-place tracing mapping.");
        otherMapping.entries.forEach [
            mapping.put(it.key, it.value)
            rmapping.put(it.value, it.key)
        ]
    }

    package def getMapping() {
        return mapping;
    }

    package def getReverseMapping() {
        return rmapping;
    }

    def getEntryIterator() {
        return mapping.entries.iterator
    }

    /**
 * ret never null
 */
    def getTitle() {
        return if (title == null) {
            ""
        } else {
            title
        };
    }

    def setTitle(String newTitle) {
        title = newTitle;
    }

    def isInPlace() {
        return delegate != null;
    }

    package def getDelegate() {
        return delegate;
    }

}
