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
import org.eclipse.xtext.xbase.lib.Pair

import static com.google.common.base.Preconditions.*
import java.util.Map
import com.google.common.collect.Multimap
import java.util.HashSet

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

        //this could end up in endless loop, 
        // but containment references of transformation tree in meta-model prevent cycles
        while (root.parent != null) {
            root = root.parent;
        }
        return root;
    }

    /**
	 * Returns parent model in tree, where given model was transformed from.
	 * <p>
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
     * <p>
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
     * Returns all succeeding models for given model.
     * <p>
     * BFS will be performed on sub tree.
     * @param model model in tree
     * @return list of succeeding models.
     */
    def List<Model> succeedingModels(Model model) {
        model.succeedingTransformations.map[it.target].filterNull.toList;
    }

    // -------------------------------------------------------------------------
    // Element Utilities
    /**
     * Returns all parent elements in source model of given ModelTransformation associated with given element.
     * <p>
     * If target model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of parent elements.
     */
    def List<Element> parents(Element element, ModelTransformation tranformation) {
        return (tranformation?.elementTransformations ?: emptyList).filter[it.target == element].map[it.source].toList;
    }

    /**
     * Returns all child elements in target model of given ModelTransformation associated with given element.
     * <p>
     * If source model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of child elements.
     */
    def List<Element> children(Element element, ModelTransformation tranformation) {
        return (tranformation?.elementTransformations ?: emptyList).filter[it.source == element].map[it.target].toList;
    }

    // -------------------------------------------------------------------------
    // Tree Modifiers
    val TransformationTreeFactory factory = TransformationTreeFactory.eINSTANCE;

    /**
     * Creates a new transformation tree containing given mapping as first transformation.
     * <p>
     * Completeness of mapping will not be checked.
     * Only objects from mapping are created as Elements of Models in TransformationTree.
     * If mapping is incomplete (model contains unmapped elements) later resolved mapping my be incomplete.
     * If mapping contains entries for objects not contained in given model instances they will omitted.
     * <p>
     * Returns leaf of new tree as Model representing target model.
     * 
     * @param mapping object mapping data
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model instance
     * @param sourceModelName display name of source model
     * @param targetModelRoot root element of target model instance
     * @param targetModelName display name of target model
     * @return leaf of new tree
     * @throws NullPointerException if any argument is null.
     */
    def Model initializeTransformationTree(ImmutableMultimap<EObject, EObject> mapping, String transformationID,
        EObject sourceModelRoot, String sourceModelName, EObject targetModelRoot, String targetModelName) {
        checkNotNull(mapping, "mapping is null");
        checkNotNull(transformationID, "transformationID is null");
        checkNotNull(sourceModelRoot, "sourceModelRoot is null");
        checkNotNull(sourceModelName, "sourceModelName is null");
        checkNotNull(targetModelRoot, "targetModelRoot is null");
        checkNotNull(targetModelName, "targetModelName is null");

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

        //create element transformations for each object mapping     
        mapping.entries.filter [
            sourceCopyMap.containsKey(it.key) && targetCopyMap.containsKey(it.value); //omit mappings of object not contained in models  
        ].forEach [
            val trans = factory.createElementTransformation;
            trans.modelTransformation = transformation;
            trans.source = sourceCopyMap.get(it.key).createElement(source);
            trans.target = targetCopyMap.get(it.value).createElement(target);
        ]

        return target;
    }

    /**
     * Appends transformation mapping information about source- and target-model to given tree.
     * <p>
     * If this is the first transformation use
     * {@link TransformationTreeExtensions#initializeTransformationTree initializeTransformationTree}.
     * <p>
     * New transformation will be appended to modelNode representing source model.
     * <p>
     * Transformations CANNOT appended to transient models!
     * <p>
     * Completeness of mapping will not be checked.
     * Only objects from mapping are created as Elements of Models in TransformationTree.
     * If previous transformation mapping of source model was incomplete and current mapping contains 
     * information about missing objects in source model additional Elements of source model model in 
     * transformation tree will be created. 
     * If mapping is incomplete (model contains unmapped elements) later resolved mapping my be incomplete.
     * If mapping contains entries for objects not contained in given model instances they will omitted.
     * <p>
     * <p>
     * Returns new leaf in tree as Model representing target model.
     * <p>
     * Return null if sourceModel is not modelNode or model is transient.
     * @param mapping object mapping data
     * @param modelNode node in tree to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model instance
     * @param targetModelRoot root element of target model instance
     * @param targetModelName display name of target model
     * @return newly created leaf in tree or null
     * @throws NullPointerException if any argument is null.
     */
    def Model addTransformationToTree(ImmutableMultimap<EObject, EObject> mapping, Model modelNode,
        String transformationID, EObject sourceModelRoot, EObject targetModelRoot, String targetModelName) {
        checkNotNull(mapping, "mapping is null");
        checkNotNull(modelNode, "modelNode is null");
        checkNotNull(transformationID, "transformationID is null");
        checkNotNull(sourceModelRoot, "sourceModelRoot is null");
        checkNotNull(targetModelRoot, "targetModelRoot is null");
        checkNotNull(targetModelName, "targetModelName is null");

        //check if source model has same type as modelNode
        if (modelNode != null && !modelNode.transient && modelNode.type.equals(sourceModelRoot.eClass)) {

            val sourceModelMap = matchModels(sourceModelRoot, modelNode.rootElement.referencedObject);
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

            val ModelTransformation mTransformation = factory.createModelTransformation();
            mTransformation.id = transformationID;
            mTransformation.source = source;
            mTransformation.target = target;

            //create element transformations for each object mapping.       
            mapping.entries.filter [
                sourceModelMap.containsKey(it.key) && targetCopyMap.containsKey(it.value); //omit mappings of object not contained in models  
            ].forEach [ Entry<EObject, EObject> entry |
                val eTransformation = factory.createElementTransformation;
                eTransformation.modelTransformation = mTransformation;
                val sourceElem = source.elements.findFirst[it.referencedObject == sourceModelMap.get(entry.key)];
                if (sourceElem != null) {
                    eTransformation.source = sourceElem;
                } else {

                    //This case indicates that mapping in source transformation of source model was incomplete.
                    //So source.elements does not contain all object contained in source model.
                    //Adding additional elements.
                    //Its safe because both source model instances match
                    eTransformation.source = sourceModelMap.get(entry.key).createElement(source);
                }
                eTransformation.target = targetCopyMap.get(entry.value).createElement(target);
            ]
            return target;
        }
        return null;
    }

    /**
     * Removes given model from tree including all succeeding Models and Element-Mappings
     * <p>
     * Returns parent in tree as Model
     * <p>
     * Returns null tree does not contain given model or model has no root
     * @param modelNode node in tree to remove
     * @return parent node or null
     */
    def Model removeModelFromTree(Model modelNode) {
        val source = modelNode.parent;

        //if has source then detach model transformation and all elements
        //they will be deleted when all references are lost
        if (source != null) {
            modelNode.transformedFrom.source = null;
            modelNode.transformedFrom.elementTransformations.forEach[it.source = null];
        }

        return source;
    }

    /**
     * Sets Model's transient flag and removes references to concrete Objects in all elements of given model.
     * <p>
     * Transient model can't be source model of any new transformation and has no association to it's concrete model.
     * <p>
     * This will improve scalability because transient models will not be kept in memory or persistent.
     * <p>
     * Can't be reverted.
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
    // Analyzer
    /**
     * Searches given transformation tree for matching modelNodes to given model instance represented by it's root element.
     * <p>
     * Returns a list of matching models.
     * There is maybe more than one matching model if transformation tree has model transformation were 
     * source and target model are structurally equal and base on same meta-model.
     * <p>
     * Returns empty list if no model is found or can not be identified because it is transient.
     * @param tree root model of tree
     * @param modelRoot root element of a model instance to search for.
     * @return Pair with matching modelNode in tree and map of model matching or null.
     */
    def List<Model> findModelInTree(Model tree, EObject modelRoot) {
        return if (tree == null || modelRoot == null) {
            emptyList;
        } else {

            //get a list of all reachable models from root, add root because it is missing in it's succeeding models
            (tree.succeedingModels.toList => [it.add(tree)]).filter [ //filter for not transient models
                it.transient == false;
            ].filter [ //find matching model to given instance
                it.type.equals(modelRoot.eClass) &&
                    matchModels(it.rootElement.referencedObject, modelRoot) != null;
            ].toList;
        }
    }

    /**
     * Returns a mapping from Elements of a model in tree to a model instance. 
     * <p>
     * ReferencedObjects of Elements in Model in transformation tree are only copies of their origin instances.
     * Returned mapping provides relations between Elements and their represented objects in given model instance.
     * <p>
     * Return null if any argument is null or model and model of modelNode does not match.
     * If transformation tree was created on incomplete mappings returned mapping may be incomplete.
     * @param modelNode node in tree which models elements shall be mapped
     * @param model root element of a model instance to map to
     * @returns mapping from elements of modelNode to model objects
     */
    def Map<Element, EObject> elementMapping(Model modelNode, EObject model) {

        if (modelNode != null && model != null && modelNode.type.equals(model.eClass)) {
            val mapping = new HashMap;
            val matching = matchModels(modelNode.rootElement.referencedObject, model);
            if (matching != null) {
                modelNode.elements.forEach [
                    mapping.put(it, matching.get(it.referencedObject));
                ]
                return mapping;
            }
        }
        return null;
    }

    /**
     * Resolves a mapping between all elements of source and target model instances by their nodes in transformation tree.
     * <p>
     * Returns a multi-mapping from elements of source model to target model elements.
     * Mapping is created by resolving all transformations on a path from source to target.
     * Source and target can be arbitrary model in tree, so path can be bottom up, top down or leaf to leaf.
     * <p>
     * Returns null if source or target model do not match to their models in tree or if they are not in the same tree.
     * If transformation tree was created on incomplete mappings returned mapping may be incomplete.
     * @param sourceModelNode model in transformation tree representing sourceModel model
     * @param sourceModel root element of a source model instance
     * @param targetModelNode model in transformation tree representing targetModel model
     * @param targetModel root element of a target model instance
     * @return multi-mapping from source model objects to target model objects or null
     */
    def Multimap<EObject, EObject> resolveMapping(Model sourceModelNode, EObject sourceModel, Model targetModelNode,
        EObject targetModel) {
        if (sourceModelNode.root != targetModelNode.root) {
            return null;
        }

        //get mapping for given source model instance
        val sourceMapping = sourceModelNode.elementMapping(sourceModel);
        if (sourceMapping == null) {
            return null;
        }

        //get mapping for given target model instance
        val targetMapping = targetModelNode.elementMapping(targetModel);
        if (targetMapping == null) {
            return null;
        }

        //trivial case when source and target are same model
        if (sourceModelNode == targetModelNode) {

            val mapping = HashMultimap::create(sourceMapping.size, 1);
            sourceMapping.entrySet.forEach [
                //map source element instances to target element instance because they might differ even if they represent the same model
                mapping.put(it.value, targetMapping.get(it.key));
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
            val sourceUpPath = new LinkedList;
            val targetUpPath = new LinkedList;

            //First resolve a path from target model upward to root
            var node = targetModelNode; //Iteration variable for models on paths
            do {
                val sourceTransformation = node.transformedFrom;
                node = if (sourceTransformation != null) {
                    targetUpPath.add(sourceTransformation); //add transformation to path
                    sourceTransformation.source; //set next model node
                } else {
                    null; //root node has no parent
                }
                if (node == sourceModelNode) { //if source model already found on this subpath, path is already complete
                    path = targetUpPath.reverse; //set path, reverse to get a path from source to target
                    downwardIndex = -1; //this path is always downward
                    node = null; //break loop
                }
            } while (node != null);

            //If no path is found yet, resolve a path from source model upward to root
            if (path == null) {
                node = sourceModelNode;
                do {
                    val sourceTransformation = node.transformedFrom;
                    node = if (sourceTransformation != null) {
                        sourceUpPath.add(sourceTransformation); //add transformation to path
                        sourceTransformation.source; //set next model node
                    } else {
                        null; //root node has no parent
                    }
                    if (node == targetModelNode) { //if target already found on this subpath, path is already complete
                        path = sourceUpPath; //set path
                        downwardIndex = path.size; //this path is always upward
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
            val elementMapping = HashMultimap::create(sourceMapping.size, 10);

            //resolve mapping from path
            val _downwardIndex = downwardIndex; //index needs to be final to be used in iteration

            //init mapping
            path.get(0).elementTransformations.forEach [
                if (0 < _downwardIndex) {
                    elementMapping.put(it.target, it.source); //upward
                } else {
                    elementMapping.put(it.source, it.target); //downward
                }
            ];

            //val keys = elementMapping.keySet;
            path.drop(1).forEach [ transformation, index |
                elementMapping.keySet.immutableCopy.forEach [
                    //resolve elementTransformation for all values and replace value
                    val values = elementMapping.get(it).map [
                        if (index + 1 < _downwardIndex) { //index+1 because drop(1)
                            it.parents(transformation); //upward
                        } else {
                            it.children(transformation); //downward
                        }
                    ].fold(new HashSet) [ first, second | //fold new values into one set
                        first.addAll(second);
                        first; //return first as container of next folding
                    ];
                    elementMapping.replaceValues(it, values);
                ];
            ];

            //transform element mapping into mapping between EObjects of given input models
            val objectMapping = HashMultimap::create(sourceMapping.size, 10);
            elementMapping.entries.forEach [
                objectMapping.put(sourceMapping.get(it.key), targetMapping.get(it.value));
            ];
            return objectMapping;
        }
    }

    // -------------------------------------------------------------------------
    // Helper
    /**
     * creates element once and adds it to its container-model
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
        if (left == null || right == null) {
            return null;
        }

        //This comparison might not be configured correctly
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
            val map = new HashMap(left.eAllContents.size);
            comparison.matches.forEach [
                map.put(it.left, it.right);
                it.allSubmatches.forEach [
                    map.put(it.left, it.right);
                ];
            ];
            return map;
        }
        return null;
    }
}
