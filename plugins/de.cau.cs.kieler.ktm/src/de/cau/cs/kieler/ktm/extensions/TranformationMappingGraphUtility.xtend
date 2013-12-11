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

import de.cau.cs.kieler.ktm.transformationmappinggraph.Model
import de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation
import java.util.List
import java.util.LinkedList

/**
 * Utility for easier access of objects in TranformationMappingGraphs.
 *  
 * @author als
 *
 */
class TranformationMappingGraphUtility {

	// -------------------------------------------------------------------------
	// Model Utilities
	/**
	 * Returns root model of tree containing given model.
	 * @return root model.
	 */
	def Model root(Model model) {
		if (model == null) {
			return null;
		}
		var root = model;

		//this could end up in endless loop, but containment references of transformation tree in meta-model prevent cycles
		while (model.source != null) {
			root = root.source;
		}
		return root;
	}

	/**
	 * Returns source model, where given model was transformed from.
	 * If model has no source, returns null.
	 * @return source model.
	 */
	def Model source(Model model) {
		if (model == null) {
			return null;
		}
		val sourceTransformation = model.transformedFrom;
		if (sourceTransformation != null) {
			return sourceTransformation.source;
		}
		return null;
	}

	/**
	 * Returns all succeeding ModelTransformation for given model.
	 * BFS will be performed on sub tree.
	 * This function should only be called on valid TM-Graphs (cycles will cause endless loop).
	 * Call {@link TranformationMappingGraphUtility#validate} to validate.
	 * @return list of succeeding ModelTransformation.
	 */
	def List<ModelTransformation> succeedingTransformations(Model model) {
		val transformations = new LinkedList<ModelTransformation>();

		//Simple implementation of breadth-first search.
		//visited nodes are not marked because we can estimate valid (acyclic) tree
		if (model != null) {
			val queue = new LinkedList<Model>();
			queue.add(model);
			while (!queue.empty) {
				val targetTransformations = queue.poll.transformedInto ?: emptyList;
				transformations.addAll(targetTransformations);
				targetTransformations.forEach[
					queue.offer(it.target);
				]
			}
		}
		return transformations;
	}
}
