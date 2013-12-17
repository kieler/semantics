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
import de.cau.cs.kieler.ktm.exceptions.MappingException
import de.cau.cs.kieler.ktm.transformationtree.Element
import de.cau.cs.kieler.ktm.transformationtree.Model
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map.Entry
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * Extension for easier access and manipulation of TranformationTrees.
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
     * Returns all child models of this node in tree, where given model is transformed into.
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
     * Returns leaf of new tree as Model representing target model.
     * 
     * @param mapping object mapping data
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param sourceModelName display name of source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @return leaf of new tree
     */
    def Model initializeTransformationTree(ImmutableMultimap<EObject, EObject> mapping, String transformationID,
        EObject sourceModelRoot, String sourceModelName, EObject targetModelRoot, String targetModelName) {

        //create copies of source and target model, so mapping will be immutable.
        // This code is taken from ECoreUtil.copy
        val sourceCopyMap = new Copier();
        val sourceModelCopy = sourceCopyMap.copy(sourceModelRoot);
        sourceCopyMap.copyReferences();

        val targetCopyMap = new Copier();
        val targetModelCopy = targetCopyMap.copy(targetModelRoot);
        targetCopyMap.copyReferences();

        //create basic tree
        val Model source = factory.createModel();
        source.type = sourceModelCopy.eClass();
        source.rootElement = sourceModelCopy.createElement(source);
        source.name = sourceModelName;
        source.transient = false;

        val Model target = factory.createModel();
        target.type = targetModelCopy.eClass();
        target.rootElement = targetModelCopy.createElement(target);
        target.name = targetModelName;
        target.transient = false;

        val ModelTransformation transformation = factory.createModelTransformation();
        transformation.id = transformationID;
        transformation.source = source;
        transformation.target = target;

        //create object mapping        
        mapping.entries.forEach [
            val trans = factory.createElementTransformation;
            trans.modelTransformation = transformation;
            trans.source = sourceCopyMap.get(it.key).createElement(source);
            trans.target = targetCopyMap.get(it.value).createElement(target);
        ]

        return target;
    }

    /**
     * Appends transformation mapping information about source- and target-model to given tree.
     * If this is the first transformation use {@link TransformationTreeModifier#initializeTransformationTree initializeTransformationTree}.
     * 
     * New transformation will be appended to modelNode representing source model.
     * Transformations CANNOT appended to transient models!
     * 
     * Returns new leaf in tree as Model representing target model.
     * Return null if sourceModel is not modelNode or model is transient.
     * 
     * @param mapping object mapping data
     * @param modelNode node in tree to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @return newly created leaf in tree
     * @throws MappingException indicated inconsistent mappings. Appears when Objects in source are mapped to target object but do not exist in source model.
     */
    def Model addTransformationToTree(ImmutableMultimap<EObject, EObject> mapping, Model modelNode,
        String transformationID, EObject sourceModelRoot, EObject targetModelRoot, String targetModelName) {

        //check if source model has same type as modelNode
        if (modelNode != null && !modelNode.transient && modelNode.type.equals(sourceModelRoot.eClass)) {
            
            //TODO check real equality first
            val sourceModelMap = matchModels(sourceModelRoot, modelNode.rootElement);
            if (sourceModelMap == null) {
                return null; //sourceModel and model represented by modelNode don't match
            }

            //create copies of source and target model, so mapping will be immutable.
            // This code is taken from ECoreUtil.copy
            val targetCopyMap = new Copier();
            val targetModelCopy = targetCopyMap.copy(targetModelRoot);
            targetCopyMap.copyReferences();

            //append new target model to tree
            val Model source = modelNode;

            val Model target = factory.createModel();
            target.type = targetModelRoot.eClass();
            target.rootElement = targetModelCopy.createElement(target);
            target.name = targetModelName;
            target.transient = false;

            val ModelTransformation transformation = factory.createModelTransformation();
            transformation.id = transformationID;
            transformation.source = source;
            transformation.target = target;

            //create object mapping
            mapping.entries.forEach [ Entry<EObject, EObject> entry |
                val trans = factory.createElementTransformation;
                trans.modelTransformation = transformation;
                val sourceElem = source.elements.findFirst[it.referencedObject == sourceModelMap.get(entry.key)];
                if (sourceElem != null) {
                    trans.source = sourceElem;
                } else {
                    throw new MappingException("Missing Object in source model.", entry.key); //TODO may be irrelevant if model identity check is correct or maybe add missing element
                }
                trans.target = targetCopyMap.get(entry.value).createElement(target);
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

    /**
     * Sets Model's transient flag and removes references to concrete Objects in all elements of given model.
     * Transient model can't be source model of any new transformation and has no association to it's concrete model.
     * 
     * This will improve scalability because transient models will not be kept in memory or persistent
     * 
     * Can't be reverted.
     * 
     * @param modelNode model to convert
     * @return modelNode itself
     */
    def Model makeTransient(Model modelNode) {
        if (modelNode != null) {
            modelNode.transient = true;
            modelNode.elements.forEach[it.referencedObject = null];
        }
        return modelNode;
    }

    // -------------------------------------------------------------------------
    // Tree Modifier Helper
    private def Element create element : factory.createElement() createElement(EObject obj, Model model) {
        element.model = model;
        element.name = obj.eClass.name;
        element.referencedObject = obj;
    }

    /**
     * @return null if models are not identically else mapping between same objects
     */
    private def matchModels(EObject left, EObject right) {

        //THIS CODE IS WRONG
        val matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
        val comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
        val matchEngine = new DefaultMatchEngine(matcher, comparisonFactory);
        val matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
        val postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
        val comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).
            setPostProcessorRegistry(postProcessorRegistry).build();

        val scope = EMFCompare.createDefaultScope(left, right);
        val comparison = comparator.compare(scope);

        if (comparison.differences.empty) {
            val map = new HashMap(comparison.matches.length);
            comparison.matches.forEach[map.put(it.left, it.right)];
            return map;
        }
        return null;
    }
}
