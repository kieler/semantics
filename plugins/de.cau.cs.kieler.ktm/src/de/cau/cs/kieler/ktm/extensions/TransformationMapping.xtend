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
import com.google.common.collect.ImmutableSet
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static extension com.google.common.collect.Multimaps.*
import static extension com.google.common.collect.Sets.*
import de.cau.cs.kieler.ktm.transformationmappinggraph.Model

/**
 * Interface to create mappings during transformation and writing back to TranformationmappingGraph
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
	 */
	def mapParent(EObject child, EObject parent) {
		mapChild(parent, child);
	}

	/**
	 * Maps given child as result of this transformation for given parent
	 */
	def mapChild(EObject parent, EObject child) {

		//if child was already mapped as an parent throw exception
		if (mapping.containsKey(child)) {
			throw new Exception; //TODO own exception
		}

		//if parent was already mapped as an child throw exception
		if (mapping.containsValue(parent)) {
			throw new Exception; //TODO own exception
		}

		mapping.put(parent, child);
	}

	/**
	 * Maps given children as results of this transformation for given parent
	 */
	def mapChildren(EObject parent, List<EObject> children) {

		//if child was already mapped as an parent throw exception
		val badChild = children.findFirst[mapping.containsKey(it)];
		if (badChild != null) {
			throw new Exception; //TODO own exception
		}

		//if parent was already mapped as an child throw exception
		if (mapping.containsValue(parent)) {
			throw new Exception; //TODO own exception
		}

		mapping.putAll(parent, children);
	}

	/**
	 * Removes mapping between given objects.
	 * Parent child order is arbitrary.
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
	 */
	def <T extends EObject> T mappedCopy(T eObject) {

		// This code is taken from ECoreUtil.copy
		val copier = new Copier();
		val T result = copier.copy(eObject) as T;
		copier.copyReferences();

		//copy mapping from copier to mapping
		mapping.putAll(copier.forMap);

		return result;
	}

	/**
	 * Checks if mapping is complete
	 * All objects in sourceModel are compared with parents and all targetModel objects are compared to children, both includes given source/target-model objects.
	 * list of two sets were first Element is symmetric difference between source model objects and all parents and second is symmetric difference between target and children.
	 * All elements are mapped correctly if both sets are empty.
	 * @return List of two Sets with symmetric differences.	 
	 */
	def List<ImmutableSet<EObject>> checkMappingCompleteness(EObject sourceModel, EObject targetModel) {

		//check if all elements in source model are keys in mapping		
		//keySet must be converted to LinkedHashSet because symmetricDifference need same set types.
		val keyDiff = (sourceModel.eAllContents.toSet => [it.add(sourceModel)]).symmetricDifference(
			newLinkedHashSet(mapping.keySet));

		//check if all elements in target model are values in mapping
		val valueDiff = (targetModel.eAllContents.toSet => [it.add(targetModel)]).symmetricDifference(
			newLinkedHashSet(mapping.values));

		return newLinkedList(keyDiff.immutableCopy, valueDiff.immutableCopy);
	}
	
	// -------------------------------------------------------------------------
	// Graph generation
	
	/**
	 * Mapping may be incomplete use {@link TransformationMapping#checkMappingCompleteness checkMappingCompleteness} to check.
	 */
	def Model createMappingToGraph(EObject sourceModelRoot, boolean transient) {
		//TODO
	}
	
	/**
	 * Mapping may be incomplete use {@link TransformationMapping#checkMappingCompleteness checkMappingCompleteness} to check.
	 * @param graphNode node to append this
	 */
	def Model appendMappingToGraph(Model graphNode, EObject sourceModelRoot, EObject targetModelRoot, boolean transient) {
		//TODO
		if(graphNode == null){
			//error
		}
		if(graphNode.type.equals(sourceModelRoot.eClass)){
			//good
		}else{
			//error
		}
	}
	
	/**
	 * Mapping may be incomplete use {@link TransformationMapping#checkMappingCompleteness checkMappingCompleteness} to check.
	 * @param graphNode node to append this
	 */
	def Model replaceMappingInGraph(Model graphNode, EObject sourceModelRoot, EObject targetModelRoot, boolean transient) {
		//TODO
		if(graphNode == null){
			//error
		}
	}

}
