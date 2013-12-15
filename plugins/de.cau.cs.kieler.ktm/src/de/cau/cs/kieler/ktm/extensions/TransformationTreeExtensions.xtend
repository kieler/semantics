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

import com.google.common.collect.ImmutableMultimap
import de.cau.cs.kieler.ktm.transformationtree.Element
import de.cau.cs.kieler.ktm.transformationtree.Model
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import java.util.Map.Entry

/**
 * Extension for easier access mand manipulation of TranformationTree.
 *  
 * @author als
 *
 */
class TransformationTreeExtensions {

    // -------------------------------------------------------------------------
    // Model Utilities
    /**
	 * Returns root model of tree.
	 * @return root model.
	 */
    def Model root(Model model) {
        if (model == null) {
            return null;
        }
        var root = model;

        //this could end up in endless loop, but containment references of transformation tree in meta-model prevent cycles
        while (model.parent != null) {
            root = root.parent;
        }
        return root;
    }

    /**
	 * Returns parent model in tree, where given model was transformed from.
	 * If model is root node, returns null.
	 * @return parent model or null
	 */
    def Model parent(Model model) {
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
     * Returns all child models of this nore in tree, where given model is transformed into.
     * @return child models
     */
    def List<Model> children(Model model) {
        if (model == null) {
            return emptyList;
        }
        return (model.transformedInto ?: emptyList).map[it.target];
    }

    /**
	 * Returns all succeeding ModelTransformations for given model.
	 * BFS will be performed on sub tree.
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
                targetTransformations.forEach [
                    queue.offer(it.target);
                ]
            }
        }
        return transformations;
    }

    // -------------------------------------------------------------------------
    // Tree Modifiers
    val TransformationTreeFactory factory = TransformationTreeFactory.eINSTANCE;

    /**
     * Creates a new transformation tree containing given mapping as first transformation.
     * 
     * If any transient flag is NOT set all elements in that model are referenced and may be resolved to a resource.
     * So take care that referenced objects are persistent. If flag is set objects are identified by their name only.
     * 
     * Returns leaf of new tree as Model representing target model
     * 
     * @param mapping object mapping data
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param sourceModelName display name of source model
     * @param isSourceModelTransient if true transformation tree will not hold any references to source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @param isTargetModelTransient if true transformation tree will not hold any references to target model
     * @return leaf of new tree
     */
    def Model initializeTransformationTree(ImmutableMultimap<EObject, EObject> mapping, String transformationID,
        EObject sourceModelRoot, String sourceModelName, boolean isSourceModelTransient, EObject targetModelRoot,
        String targetModelName, boolean isTargetModelTransient) {

        //create tree
        val Model source = factory.createModel();
        source.type = sourceModelRoot.eClass();
        source.name = sourceModelName;
        source.transient = isSourceModelTransient;

        val Model target = factory.createModel();
        target.type = targetModelRoot.eClass();
        target.name = targetModelName;
        target.transient = isTargetModelTransient;

        val ModelTransformation transformation = factory.createModelTransformation();
        transformation.id = transformationID;
        transformation.source = source;
        transformation.target = target;

        //create object mapping
        mapping.entries.forEach [
            val trans = factory.createElementTransformation;
            trans.modelTransformation = transformation;
            trans.source = it.key.createElement(source, isSourceModelTransient);
            trans.target = it.value.createElement(target, isTargetModelTransient);
        ]

        return target;
    }

    /**
     * Appends transformation mapping information about source- and target-model to given tree.
     * If this is the first transformation use {@link TransformationTreeModifier#initializeTransformationTree initializeTransformationTree}.
     * 
     * New transformation will be appended to modelNode representing source model.
     * 
     * If transient flag of target model is NOT set all elements in that model are referenced and may be resolved to a resource.
     * So take care that referenced objects are persistent. If flag is set objects are identified by their name only.
     * 
     * Returns new leaf in tree as Model representing target model.
     * Return null if sourceModel is not modelNode
     * 
     * @param mapping object mapping data
     * @param modelNode node in tree to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @param isTargetModelTransient if true transformation tree will not hold any references to target model
     * @return newly created leaf in tree
     */
    def Model addTransformationToTree(ImmutableMultimap<EObject, EObject> mapping, Model modelNode,
        String transformationID, EObject sourceModelRoot, EObject targetModelRoot, String targetModelName,
        boolean isTargetModelTransient) {

        //check if source model has same type as modelNode
        //TODO correct identification because type is not unique an don't checks elements
        if (modelNode != null && modelNode.type.equals(sourceModelRoot.eClass)) {

            //append new target model to tree
            val Model source = modelNode;

            val Model target = factory.createModel();
            target.type = targetModelRoot.eClass();
            target.name = targetModelName;
            target.transient = isTargetModelTransient;

            val ModelTransformation transformation = factory.createModelTransformation();
            transformation.id = transformationID;
            transformation.source = source;
            transformation.target = target;

            //create object mapping
            mapping.entries.forEach [ Entry<EObject, EObject> entry |
                val trans = factory.createElementTransformation;
                trans.modelTransformation = transformation;
                val sourceElem = source.elements.findFirst[it.referencedObject == entry.key]; //TODO this will fail when source model is transient
                if (sourceElem != null) {
                    trans.source = sourceElem;
                } else {
                    throw new Exception(); //TODO own Exception
                }
                trans.target = entry.value.createElement(target, isTargetModelTransient);
            ]
        }
        return null;
    }

    /**
     * Removes given model from tree including all succeeding Models and Element-Mappings
     * 
     * Returns parent in tree as Model
     * Returns null tree does not contain given model or model has no root
     * 
     * @param modelNode node in tree to remove
     * @return parent node or null
     */
    def Model removeModelFromTree(Model modelNode) {
        val source = modelNode.parent;

        //if has source delink model and all elements
        //they will be deleted when all references are lost
        if (source != null) {
            modelNode.transformedFrom.source = null;
            modelNode.transformedFrom.elementTransformations.forEach[it.source = null];
        }

        return source;
    }

    // -------------------------------------------------------------------------
    // Tree Modifier Helper
    private def Element create element : factory.createElement() createElement(EObject obj, Model model,
        boolean isTransient) {
        element.model = model;
        element.name = obj.eClass.name;
        if (!isTransient) {
            element.referencedObject = obj;
        }
    }
}
