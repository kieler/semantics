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

import static extension com.google.common.collect.Multimaps.*
import static extension com.google.common.collect.Sets.*

/**
 * Extension for creating mappings during transformation.
 * 
 * @author als
 *
 */
class TransformationMapping {

    // internal data-structure for single model transformation
    private val HashMultimap<EObject, EObject> mapping = HashMultimap::create;

    // -------------------------------------------------------------------------
    // Basic mapping generation
    /**
	 * Maps given parent as source of given child in this transformation
     * @return true if the mapping changed
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child)
	 */
    def mapParent(EObject child, EObject parent) {
        parent.mapChild(child);
    }

    /**
     * Maps given parents as source of given child in this transformation
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child)
     */
    def mapParents(EObject child, List<EObject> parents) {
        parents.forEach[it.mapChild(child)];
    }

    /**
	 * Maps given child as result of this transformation for given parent
     * @return true if the mapping changed
     * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child)
	 */
    def mapChild(EObject parent, EObject child) {

        //if child was already mapped as an parent throw exception
        if (mapping.containsKey(child)) {
            throw new MappingException("Cannot map object as child when already mapped as parent",child);
        }

        //if parent was already mapped as an child throw exception
        if (mapping.containsValue(parent)) {
            throw new MappingException("Cannot map object as parent when already mapped as child",parent);
        }

        mapping.put(parent, child);
    }

    /**
	 * Maps given children as results of this transformation for given parent
	 * @return true if the mapping changed
	 * @throws MappingException when child parent relations were mixed (i.e. when one object is will be mapped as parent when it is already mapped as child)
	 */
    def mapChildren(EObject parent, List<EObject> children) {

        //if child was already mapped as an parent throw exception
        val badChild = children.findFirst[mapping.containsKey(it)];
        if (badChild != null) {
            throw new MappingException("Cannot map object as child when already mapped as parent",badChild);
        }

        //if parent was already mapped as an child throw exception
        if (mapping.containsValue(parent)) {
            throw new MappingException("Cannot map object as parent when already mapped as child",parent);
        }

        mapping.putAll(parent, children);
    }
 
    /**
     * Returns all Children mapped to given parent
     * @return List of children for parent
     */  
    def mappedChildren(EObject parent){
        mapping.get(parent).toList;
    }
    
    /**
     * Returns all Parents mapped to given child
     * @return List of parents for child
     */  
    def mappedParents(EObject child){
        mapping.entries.filter[it.value == child].map[it.key].toList;
    }    

    /**
	 * Removes mapping between given objects.
	 * Parent child order is arbitrary.
	 * @param first - parent or child object depending on chosen order
	 * @param second - parent or child object depending on chosen order
	 * @return true if the mapping changed
	 */
    def unmap(EObject first, EObject second) {

        if (mapping.containsKey(first)) { //if first is key
            mapping.remove(first, second);
        } else if (mapping.containsKey(second)) { //if second is key
            mapping.remove(second, first);
        }
    }

    /**
	 * Removes all mappings for given objects.
	 * Object can be parent or child
	 */
    def void unmapAll(EObject obj) {

        if (mapping.containsKey(obj)) { //if object is key
            mapping.removeAll(obj);
        } else if (mapping.containsValue(obj)) { //if second is key
            mapping.keySet.forEach[mapping.remove(it, obj);];
        }
    }

    /**
	 * Drops all current mapping information
	 */
    def clearMapping() {
        mapping.clear();
    }

    // -------------------------------------------------------------------------
    // Mapping helpers
    /**
	 * Creates direct mapping between two identical models. 
	 * Use for transformations based on copies.
	 * Mapping will include given root elements.
	 * @param original model to copy
	 * @return copy   
	 */
    def <T extends EObject> T mappedCopy(T original) {

        // This code is taken from ECoreUtil.copy
        val copier = new Copier();
        val T result = copier.copy(original) as T;
        copier.copyReferences();

        //copy mapping from copier to mapping
        mapping.putAll(copier.forMap);

        return result;
    }

    /**
	 * Checks if mapping is complete
	 * All objects in sourceModel are compared with parents and all targetModel objects are compared to children, both includes given source/target-model objects.
	 * Returns Pair of two sets where were key-element is symmetric difference between source model objects and all parents and value-element is symmetric difference between target and children.
	 * All elements are mapped correctly if both sets are empty.
	 * @return Pair of two Sets with symmetric differences.	 
	 */
    def  checkMappingCompleteness(EObject sourceModel, EObject targetModel) {

        //check if all elements in source model are keys in mapping		
        //keySet must be converted to LinkedHashSet because symmetricDifference need same set types.
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
