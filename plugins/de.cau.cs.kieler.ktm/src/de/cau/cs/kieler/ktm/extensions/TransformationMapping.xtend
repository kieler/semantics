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
package de.cau.cs.kieler.ktm.extensions

import com.google.common.collect.HashMultimap
import com.google.common.collect.ImmutableMultimap
import de.cau.cs.kieler.ktm.exceptions.MappingException
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtext.xbase.lib.Pair

import static com.google.common.base.Preconditions.*

import static extension com.google.common.collect.Multimaps.*
import static extension com.google.common.collect.Sets.*

/**
 * Extension for creating mappings during transformation.
 * 
 * @author als
 *
 */
class TransformationMapping {

    /** internal data-structure for single model transformation.*/
    private val HashMultimap<EObject, EObject> mapping = HashMultimap::create;

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given parent as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child).
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapParent(EObject child, EObject parent) {
        parent.mapChild(child);
    }

    /**
     * Maps given parents as source of given child in this transformation.
     * @return true if the mapping changed.
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child).
     * @throws NullPointerException if parents or child is null.
     * @throws IllegalArgumentException if children list contains null element.
     */
    def boolean mapParents(EObject child, List<EObject> parents) {
        checkNotNull(parents, "parents object is null");
        checkNotNull(child, "child list is null");
        checkArgument(!parents.contains(null), "Parents list contains null element");

        parents.fold(false) [ boolean changes, EObject parent |
            parent.mapChild(child) || changes;
        ];
    }

    /**
	 * Maps given child as result of this transformation for given parent.
     * @return true if the mapping changed.
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child).
     * @throws NullPointerException if parent or child is null.
	 */
    def boolean mapChild(EObject parent, EObject child) {
        checkNotNull(parent, "parent object is null");
        checkNotNull(child, "child object is null");

        //if child was already mapped as an parent throw exception
        if (mapping.containsKey(child)) {
            throw new MappingException("Cannot map object as child when already mapped as parent", child);
        }

        //if parent was already mapped as an child throw exception
        if (mapping.containsValue(parent)) {
            throw new MappingException("Cannot map object as parent when already mapped as child", parent);
        }

        mapping.put(parent, child);
    }

    /**
	 * Maps given children as results of this transformation for given parent. 
     * @return true if the mapping changed.
	 * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child).
	 * @throws NullPointerException if parent or children list is null.
	 * @throws IllegalArgumentException if children list contains null element.
	 */
    def boolean mapChildren(EObject parent, List<EObject> children) {
        checkNotNull(parent, "parent object is null");
        checkNotNull(children, "children list is null");
        checkArgument(!children.contains(null), "Children list contains null element");

        //if child was already mapped as an parent throw exception
        val badChild = children.findFirst[mapping.containsKey(it)];
        if (badChild != null) {
            throw new MappingException("Cannot map object as child when already mapped as parent", badChild);
        }

        //if parent was already mapped as an child throw exception
        if (mapping.containsValue(parent)) {
            throw new MappingException("Cannot map object as parent when already mapped as child", parent);
        }

        mapping.putAll(parent, children);
    }

    /**
     * Returns all children mapped to given parent
     * @return List of children for parent
     */
    def List<EObject> mappedChildren(EObject parent) {
        (mapping.get(parent) ?: emptyList).toList;
    }

    /**
     * Returns all parents mapped to given child
     * @return List of parents for child
     */
    def List<EObject> mappedParents(EObject child) {
        mapping.entries.filter[it.value == child].map[it.key].toList;
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

        if (mapping.containsKey(first)) { //if first is key
            mapping.remove(first, second);
        } else if (mapping.containsKey(second)) { //if second is key
            mapping.remove(second, first);
        } else {
            false
        }
    }

    /**
	 * Removes all mappings for given objects.
	 * <p>
	 * Object can be parent or child
     * @return true if the mapping changed
	 */
    def boolean unmapAll(EObject obj) {

        if (mapping.containsKey(obj)) { //if object is key
            !mapping.removeAll(obj).empty;
        } else if (mapping.containsValue(obj)) { //if object is value
            mapping.keySet.immutableCopy.fold(false) [ boolean changes, EObject key |
                mapping.remove(key, obj) || changes;
            ];
        } else {
            false
        }
    }

    /**
	 * Drops all current mapping information
	 */
    def void clearMapping() {
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
        return original.mappedCopy(mapping);
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
     * This will extract mapping data as an immutable copy and clears local mapping afterwards
     * @return mapping
     */
    def extractMappingData() {
        val map = ImmutableMultimap.builder.putAll(mapping).build();
        clearMapping();
        return map;
    }

}
