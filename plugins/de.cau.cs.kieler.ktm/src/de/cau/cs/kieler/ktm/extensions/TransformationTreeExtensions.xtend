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
import com.google.common.collect.HashMultimap

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
	 * @param model root model in tree
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
	 * @param model model in tree
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
     * @param model model in tree
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
	 * @param model model in tree
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

    /**
     * Searches given transformation tree for matching modelNode to given model instance represented by it's root element.
     * 
     * Returns a Pair were key element is found model in tree.
     * Value element is a bijective mapping between model instance reference by elements in transformation tree and given model instance.
     * 
     * Returns null if model is not found or can not be identified because it is transient.
     * @param tree root model of tree
     * @param modelRoot root element of a model instance to search for.
     * @return Pair with matching modelNode in tree and map of model matching or null.
     */
    def Pair<Model, HashMap<EObject, EObject>> findModelInTree(Model tree, EObject modelRoot) {

        //get a list of all reachable models from root, add root because it is missing in it's succeeding models and filter for not transient models
        val models = (tree.succeedingTransformations.map[it.target].filterNull.toList => [it.add(tree)]).filter [
            it.transient == false;
        ];

        //find matching model to given instance
        for (Model model : models) {
            if (model.type.equals(modelRoot.eClass)) { //first check only class of root element
                val match = matchModels(model.rootElement, modelRoot);
                if (match != null) {
                    return new Pair(model, match);
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------
    // Element Utilities
    /**
     * Returns all parent elements in source model of given ModelTransformation associated with given element.
     * If target model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of parent elements.
     */
    def List<Element> parents(Element element, ModelTransformation tranformation) {
        return tranformation.elementTransformations.filter[it.target == element].map[it.source].toList;
    }

    /**
     * Returns all child elements in target model of given ModelTransformation associated with given element.
     * If source model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of child elements.
     */
    def List<Element> children(Element element, ModelTransformation tranformation) {
        return tranformation.elementTransformations.filter[it.source == element].map[it.target].toList;
    }

    /**
     * Resolves a mapping between all elements of source and target model instances with given transformation tree.
     * 
     * Returns a multi-mapping from elements of source model to target model elements.
     * Mapping is created by resolving all transformations on a path from source to target.
     * Source and target can be arbitray model in tree, so path can be bottom up, top down or leaf to leaf.
     * 
     * Return null if source or target model can not be found in tree or can not be identified because one is transient.
     * 
     * @param tree root model of tree
     * @param sourceModel root element of a source model instance
     * @param targetModel root element of a target model instance
     * @return multi-mapping from source model objects to target model objects or null
     */
    def HashMultimap<EObject, EObject> resolveMapping(Model tree, EObject sourceModel, EObject targetModel) {

        //find model and mapping for given source model instance
        val source = tree.findModelInTree(sourceModel);
        if (source == null) {
            return null;
        }

        //find model and mapping for given target model instance
        val target = tree.findModelInTree(targetModel);
        if (target == null) {
            return null;
        }

        //trivial case when source and target are same model
        if (source.key == target.key) {

            val mapping = HashMultimap::create(source.value.size, 1);
            source.value.entrySet.forEach [
                //map source element instances to target element instance because they might differ even if they represent the same model
                mapping.put(it.value, target.value.get(it.key));
            ];
            return mapping;
        } else {

            //Find a path between source and target node in tree.
            //Path must not follow direction of edges in tree.
            //Path can be bottom up, top down or leaf to leaf.
            //Path is a list of ModelTransformations between nodes.
            var List<ModelTransformation> path = null;

            //Index in path were path direction in tree changes from upwards to downwards
            //index of first element in other direction
            var int downwardIndex;
            val sourceUpPath = emptyList;
            val targetUpPath = emptyList;

            //First resolve a path from target model upward to root
            var node = target.key;//Iteration variable for models on paths
            do {
                val sourceTransformation = node.transformedFrom;
                node = if (sourceTransformation != null) {
                    targetUpPath.add(sourceTransformation); //add transformation to path
                    sourceTransformation.source; //set next model node
                } else {
                    null; //root node has no parent
                }
                if (node == source.key) { //if source model already found on this subpath, path is already complete
                    path = targetUpPath.reverse; //set path, reverse to get a path from source to target
                    downwardIndex = -1;//this path is always downward
                    node = null; //break loop
                }
            } while (node != null);

            //If no path is found yet, resolve a path from source model upward to root
            if (path == null) {
                node = source.key;
                do {
                    val sourceTransformation = node.transformedFrom;
                    node = if (sourceTransformation != null) {
                        sourceUpPath.add(sourceTransformation); //add transformation to path
                        sourceTransformation.source; //set next model node
                    } else {
                        null; //root node has no parent
                    }
                    if (node == target.key) { //if target already found on this subpath, path is already complete
                        path = sourceUpPath; //set path
                        downwardIndex = path.size;//this path is always upward
                        node = null; //break loop
                    }
                } while (node != null);
            }

            //if no simply upward or downward path exist there might be a leaf-to-leaf-path with change of direction
            if (path == null) {

                //search for a connection between the two upward paths
                val connection = sourceUpPath.findFirst[targetUpPath.contains(it)];

                if (connection == null) {

                    //If no connection is found, the two paths are connected via root node,
                    // which can not be found by comparing the paths because path contains out of 
                    // ModelTransformation and root-model-node has no incoming transformation which match
                    // in both paths
                    //They must be connected because both models are in same tree (reachable from root),
                    // which were check by findModelInTree before
                    path = (sourceUpPath + targetUpPath.reverseView).toList;
                    downwardIndex = sourceUpPath.size;
                } else {

                    //turn index is index of connecting transformation but is not part of resulting path so index will point to correct (turned) transformation  
                    downwardIndex = sourceUpPath.indexOf(connection);

                    //First part of path is upward path from source to connection (exclusive) 
                    path = sourceUpPath.take(downwardIndex).toList;

                    //Second part is downward path from connection (exclusive) to target
                    path.addAll(targetUpPath.reverseView.drop(targetUpPath.indexOf(connection) + 1));
                }
            }

            //traverse path and resolve mapping
            val elementMapping = HashMultimap::create(source.value.size, 10);
            //init mapping
            path.get(0).elementTransformations.forEach[
                elementMapping.put(it.source,it.target);
            ];
            //resolve mapping from path
            val _downwardIndex = downwardIndex;//index needs to be final to be used in iteration
            val keys = elementMapping.keySet;
            path.drop(1).forEach[transformation, index |
                keys.forEach[
                    //resolve elementTransformation for all values and replace value
                    val values = elementMapping.get(it).map[
                        if(index < _downwardIndex){
                            it.parents(transformation);//upward
                        }else{
                            it.children(transformation);//downward
                        }
                    ].fold(emptySet)[ first, second | //fold new values into one set
                        first.addAll(second);
                        first;//return first as container of next folding
                    ];
                    elementMapping.replaceValues(it,values);
                ];
            ];
            //transform element mapping into mapping between EObjects of given input models
            val objectMapping = HashMultimap::create(source.value.size, 10);
            elementMapping.entries.forEach[
                objectMapping.put(source.value.get(it.key.referencedObject),target.value.get(it.value.referencedObject));
            ];
            return objectMapping;
        }
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
     * @param sourceModelRoot root element of source model instance
     * @param sourceModelName display name of source model
     * @param targetModelRoot root element of target model instance
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

        //create element transformations from object mapping        
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
     * If this is the first transformation use {@link TransformationTreeExtensions#initializeTransformationTree initializeTransformationTree}.
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
     * @param sourceModelRoot root element of source model instance
     * @param targetModelRoot root element of target model instance
     * @param targetModelName display name of target model
     * @return newly created leaf in tree
     * @throws MappingException indicated inconsistent mappings. Appears when Objects in source are mapped to target object but do not exist in source model.
     */
    def Model addTransformationToTree(ImmutableMultimap<EObject, EObject> mapping, Model modelNode,
        String transformationID, EObject sourceModelRoot, EObject targetModelRoot, String targetModelName) {

        //check if source model has same type as modelNode
        if (modelNode != null && !modelNode.transient && modelNode.type.equals(sourceModelRoot.eClass)) {

            //TODO check real equality first or not ?
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
                    throw new MappingException("Missing Object in source model.", entry.key); //TODO may be irrelevant if model identity check is correct or maybe add missing element when transformation tree is incomplete
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
    // Helper
    /**
     * creates element once
     */
    private def Element create element : factory.createElement() createElement(EObject obj, Model model) {
        element.model = model;
        element.name = obj.eClass.name;
        element.referencedObject = obj;
    }

    /**
     * @return null if models are not identically else bijective mapping between matching objects
     */
    private def matchModels(EObject left, EObject right) {

        //THIS CODE MIGHT BE WRONG
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
