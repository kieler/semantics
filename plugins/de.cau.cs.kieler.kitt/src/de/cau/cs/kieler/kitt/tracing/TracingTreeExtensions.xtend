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
package de.cau.cs.kieler.kitt.tracing

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper
import de.cau.cs.kieler.kitt.tracingtree.ModelTransformation
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper
import de.cau.cs.kieler.kitt.tracingtree.TracingTreeFactory
import java.io.IOException
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Map.Entry
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.emf.compare.scope.FilterComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.base.Preconditions.*

/**
 * Extension for easier access and manipulation of TranformationTrees.
 * @kieler.design 2014-08-11 proposed
 * @kieler.rating 2014-08-11 proposed yellow
 *  
 * @author als
 *
 */
class TracingTreeExtensions {

    // -------------------------------------------------------------------------
    // ModelWrapper Utilities
    
    /** 
	 * Returns root node of tree.
	 * @param modelNode any model-node in tree
	 * @return root model-node.
	 */
    def ModelWrapper root(ModelWrapper modelNode) {
        if (modelNode == null) {
            return null;
        }
        var root = modelNode;

        //this could end up in endless loop, 
        // but containment references of transformation tree in meta-model prevent cycles
        while (root.parent != null) {
            root = root.parent;
        }
        return root;
    }

    /**
	 * Returns source node in tree, where given ModelWrapper-node is transformed from.
	 * <p>
	 * If model is root-node, returns null.
	 * @param modelNode node in tree
	 * @return parent model or null
	 */
    def ModelWrapper parent(ModelWrapper modelNode) {
        if (modelNode == null) {
            return null;
        }
        val sourceTransformation = modelNode.sourceTransformation;
        if (sourceTransformation != null) {
            return sourceTransformation.source;
        }
        return null;
    }

    /**
     * Returns all child node as ModelWrapper of given ModelWrapper-node in tree, where given model is transformed into.
     * @param modelNode node in tree
     * @return child models
     */
    def List<ModelWrapper> children(ModelWrapper modelNode) {
        if (modelNode == null) {
            return emptyList;
        }
        return (modelNode.targetTransformations ?: emptyList).map[it.target];
    }

    /**
	 * Returns all succeeding ModelTransformations for given model-node.
     * <p>
	 * BFS will be performed on sub tree.
	 * @param modelNode node in tree
	 * @return list of succeeding ModelTransformation.
	 */
    def List<ModelTransformation> succeedingTransformations(ModelWrapper modelNode) {
        val transformations = new LinkedList<ModelTransformation>();

        //Simple implementation of breadth-first search.
        //visited nodes are not marked because we can estimate valid (acyclic) tree
        if (modelNode != null) {
            val queue = new LinkedList<ModelWrapper>();
            queue.add(modelNode);
            while (!queue.empty) {
                val targetTransformations = queue.poll.targetTransformations ?: emptyList;
                transformations.addAll(targetTransformations);
                targetTransformations.forEach [
                    queue.offer(it.target);
                ]
            }
        }
        return transformations;
    }

    /**
     * Returns all succeeding ModelWrappers for given modelNode.
     * <p>
     * BFS will be performed on sub tree.
     * @param modelNode node in tree
     * @return list of succeeding models.
     */
    def List<ModelWrapper> succeedingModelWrappers(ModelWrapper modelNode) {
        modelNode.succeedingTransformations.map[it.target].filterNull.toList;
    }

    /**
     * Calculates the depth or level of a node in tree.
     * @param modelNode node in tree
     * @return depth: distance to root-node
     */
    def int depth(ModelWrapper modelNode) {
        var depth = 0;
        if (modelNode != null) {
            var node = modelNode;
            while (node.parent != null) {
                node = node.parent;
                depth = depth + 1;
            }
        }
        return depth;
    }

    // -------------------------------------------------------------------------
    // EObjectWrapper Utilities
    /**
     * Returns all parent objects in source model of given ModelTransformation associated with given element.
     * <p>
     * If target model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of parent elements.
     */
    def List<EObjectWrapper> parents(EObjectWrapper element, ModelTransformation tranformation) {
        return (tranformation?.objectTransformations ?: emptyList).filter[it.target == element].map[it.source].toList;
    }

    /**
     * Returns all child objects in target model of given ModelTransformation associated with given element.
     * <p>
     * If source model of given ModelTransformation does not contain given element returned list is empty.
     * @param element element of a model in transformation tree.
     * @param tranformation model transformation to resolve parent relation.
     * @return List of child elements.
     */
    def List<EObjectWrapper> children(EObjectWrapper element, ModelTransformation tranformation) {
        return (tranformation?.objectTransformations ?: emptyList).filter[it.source == element].map[it.target].toList;
    }

    // -------------------------------------------------------------------------
    // Tree Modifiers
    private val TracingTreeFactory factory = TracingTreeFactory.eINSTANCE;

    /**
     * Creates a new transformation tree containing given mapping as first transformation.
     * <p>
     * Completeness of mapping will not be checked.
     * <p>
     * Only objects from mapping are created as EObjectWrapper of ModelWrapper in TransformationTree.
     * <p>
     * If mapping is incomplete (model contains unmapped objects) later resolved mapping may be incomplete.
     * <p>
     * If mapping contains entries for objects not contained in given model instances they will omitted.
     * <p>
     * Returns leaf of new tree as ModelWrapper representing target model.
     * 
     * @param mapping object mapping data
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model instance
     * @param sourceModelTypeID unique identifier for this kind of model
     * @param targetModelRoot root element of target model instance
     * @param targetModelTypeID unique identifier for this kind of model and its applied transformation
     * @return leaf of new tree
     * @throws NullPointerException if any argument is null.
     */
    def ModelWrapper initializeTransformationTree(Multimap<EObject, EObject> mapping, String transformationID,
        EObject sourceModelRoot, String sourceModelTypeID, EObject targetModelRoot, String targetModelTypeID) {
        checkNotNull(mapping, "mapping is null");
        checkNotNull(transformationID, "transformationID is null");
        checkNotNull(sourceModelRoot, "sourceModelRoot is null");
        checkNotNull(sourceModelTypeID, "sourceModelTypeID is null");
        checkNotNull(targetModelRoot, "targetModelRoot is null");
        checkNotNull(targetModelTypeID, "targetModelTypeID is null");

        //create copies of source and target model, so mapping will be immutable.
        // This code is taken from ECoreUtil.copy
        val sourceCopyMap = new Copier();
        val sourceModelCopy = sourceCopyMap.copy(sourceModelRoot);
        sourceCopyMap.copyReferences();

        val targetCopyMap = new Copier();
        val targetModelCopy = targetCopyMap.copy(targetModelRoot);
        targetCopyMap.copyReferences();

        //create basic tree
        val ModelWrapper source = factory.createModelWrapper();
        source.rootObject = sourceModelCopy.createEObjectWrapper(source);
        source.modelTypeID = sourceModelTypeID;
        source.transient = false;

        val ModelWrapper target = factory.createModelWrapper();
        target.rootObject = targetModelCopy.createEObjectWrapper(target);
        target.modelTypeID = targetModelTypeID;
        target.transient = false;

        val ModelTransformation transformation = factory.createModelTransformation();
        transformation.transformationID = transformationID;
        transformation.source = source;
        transformation.target = target;

        //create element transformations for each object mapping     
        mapping.entries.filter [
            sourceCopyMap.containsKey(it.key) && targetCopyMap.containsKey(it.value); //omit mappings of object not contained in models  
        ].forEach [
            val trans = factory.createEObjectTransformation;
            trans.modelTransformation = transformation;
            trans.source = sourceCopyMap.get(it.key).createEObjectWrapper(source);
            trans.target = targetCopyMap.get(it.value).createEObjectWrapper(target);
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
     * <p>
     * Only objects from mapping are created as EObjectWrapper of ModelWrapper in TransformationTree.
     * If previous transformation mapping of source model was incomplete and current mapping contains 
     * information about missing objects in source model additional EObjectWrapper for missing elements will be inserted.
     * <p> 
     * If mapping is incomplete (model contains unmapped elements) later resolved mapping may be incomplete.
     * <p>
     * If mapping contains entries for objects not contained in given model instances they will omitted.
     * <p>
     * <p>
     * Returns new leaf in tree as ModelWrapper representing target model.
     * <p>
     * Return null if sourceModel is not modelNode or ModelWrapper is transient.
     * @param mapping object mapping data
     * @param modelNode node in tree to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model instance
     * @param targetModelRoot root element of target model instance
     * @param targetModelTypeID unique identifier for this kind of model and its applied transformation
     * @return newly created leaf in tree or null
     * @throws NullPointerException if any argument is null.
     */
    def ModelWrapper addTransformationToTree(Multimap<EObject, EObject> mapping, ModelWrapper modelNode,
        String transformationID, EObject sourceModelRoot, EObject targetModelRoot, String targetModelTypeID) {
        checkNotNull(mapping, "mapping is null");
        checkNotNull(modelNode, "modelNode is null");
        checkNotNull(transformationID, "transformationID is null");
        checkNotNull(sourceModelRoot, "sourceModelRoot is null");
        checkNotNull(targetModelRoot, "targetModelRoot is null");
        checkNotNull(targetModelTypeID, "targetModelTypeID is null");

        //check if source model has same type as modelNode
        if (modelNode != null && !modelNode.transient &&
            modelNode.rootObject.EObject.eClass.equals(sourceModelRoot.eClass)) {

            val sourceModelMap = matchModels(sourceModelRoot, modelNode.rootObject.EObject);
            if (sourceModelMap == null) {
                return null; //sourceModel and model represented by modelNode don't match
            }

            //create copies of source and target model, so mapping will be immutable.
            // This code is taken from ECoreUtil.copy
            val targetCopyMap = new Copier();
            val targetModelCopy = targetCopyMap.copy(targetModelRoot);
            targetCopyMap.copyReferences();

            //append new target model to tree
            val ModelWrapper source = modelNode;

            val ModelWrapper target = factory.createModelWrapper();
            target.rootObject = targetModelCopy.createEObjectWrapper(target);
            target.modelTypeID = targetModelTypeID;
            target.transient = false;

            val ModelTransformation mTransformation = factory.createModelTransformation();
            mTransformation.transformationID = transformationID;
            mTransformation.source = source;
            mTransformation.target = target;

            //create element transformations for each object mapping.       
            mapping.entries.filter [
                sourceModelMap.containsKey(it.key) && targetCopyMap.containsKey(it.value); //omit mappings of object not contained in models  
            ].forEach [ Entry<EObject, EObject> entry |
                val eTransformation = factory.createEObjectTransformation;
                eTransformation.modelTransformation = mTransformation;
                val sourceElem = source.modelObjects.findFirst[it.EObject == sourceModelMap.get(entry.key)];
                if (sourceElem != null) {
                    eTransformation.source = sourceElem;
                } else {

                    //This case indicates that mapping in source transformation of source model was incomplete.
                    //So source.elements does not contain all object contained in source model.
                    //Adding additional elements.
                    //Its safe because both source model instances match
                    eTransformation.source = sourceModelMap.get(entry.key).createEObjectWrapper(source);
                }
                eTransformation.target = targetCopyMap.get(entry.value).createEObjectWrapper(target);
            ]
            return target;
        }
        return null;
    }

    /**
     * Removes given model from tree including all succeeding Models and EObjectWrapper-Mappings
     * <p>
     * Returns parent-node in tree
     * <p>
     * Returns null tree does not contain given model or model has no root
     * @param modelNode node in tree to remove
     * @return parent parent-node or null
     */
    def ModelWrapper removeModelFromTree(ModelWrapper modelNode) {
        val source = modelNode.parent;

        //if has source then detach model transformation and all elements
        //they will be deleted when all references are lost
        if (source != null) {
            modelNode.sourceTransformation.source = null;
            modelNode.sourceTransformation.objectTransformations.forEach[it.source = null];
        }

        return source;
    }

    /**
     * Sets ModelWrapper's transient flag and removes references to concrete Objects in all elements of given model.
     * <p>
     * Transient model can't be source model of any new transformation and has no association to it's concrete model.
     * <p>
     * This will improve scalability because transient models will not be kept in memory or persistent.
     * <p>
     * Can't be reverted.
     * @param modelNode model to convert
     * @return modelNode itself
     */
    def ModelWrapper makeTransient(ModelWrapper modelNode) {
        if (modelNode != null) {
            modelNode.transient = true;
            modelNode.modelObjects.forEach[it.EObject = null];
        }
        return modelNode;
    }

    // -------------------------------------------------------------------------
    // Analyzer
    private val LinkedList<Class<? extends EObject>> matchIgnoreClasses = new LinkedList;

    /**
     * Returns a mutable list of classes which instances should be excluded in matching process.
     * A matching is started when calling {@link findModelInTree} to check if the given model instance 
     * matches the model internally stored by EObjectWrapper in a ModelWrapper.
     * @returns list of ignored classes for matching
     */
    def getMatchIgnoreClasses() {
        matchIgnoreClasses;
    }

    /**
     * Searches given transformation tree for matching model-nodes for given model instance and typeID.
     * <p>
     * If tree is malformed and there are more than one fully matching models the first one is returned.
     * <p>
     * Returns null if no model is found or can not be identified because it is transient or mismatching.
     * @param tree root model of tree
     * @param modelRoot root element of a model instance to search for.
     * @param modelTypeID unique identifier for searched kind of models.
     * @return Pair with matching modelNode in tree and map of model matching or null.
     */
    def ModelWrapper findModelInTree(ModelWrapper tree, EObject modelRoot, String modelTypeID) {
        return if (tree == null || modelRoot == null || modelTypeID == null) {
            null;
        } else {

            //get a list of all reachable models from root, add root because it is missing in it's succeeding models
            (tree.succeedingModelWrappers.toList => [it.add(tree)]).filter [ //filter for not transient models
                it.transient == false;
            ].filter [ // filter for correct typeID
                it.modelTypeID.equals(modelTypeID);
            ].findFirst [ //find matching model to given instance
                it.rootObject.EObject.eClass.equals(modelRoot.eClass) &&
                    matchModels(it.rootObject.EObject, modelRoot) != null;
            ];
        }
    }

    /**
     * Returns a mapping from EObjectWrappers of a ModelWrapper in tree to a model instance. 
     * <p>
     * ReferencedObjects of EObjectWrappers in ModelWrapper in transformation tree may be only copies of their origin instances.
     * Returned mapping provides relations between EObjectWrappers and their represented EObjects in given model instance.
     * <p>
     * Return null if any argument is null or model and model of modelNode does not match.
     * If transformation tree was created with incomplete mappings returned mapping may be incomplete.
     * @param modelNode node in tree which models elements shall be mapped
     * @param model root element of a model instance to map to
     * @returns mapping from elements of modelNode to model objects
     */
    def Map<EObjectWrapper, EObject> modelInstanceMapping(ModelWrapper modelNode, EObject model) {

        if (modelNode != null && model != null && !modelNode.transient &&
            modelNode.rootObject.EObject.eClass.equals(model.eClass)) {
            val mapping = new HashMap;
            val matching = matchModels(modelNode.rootObject.EObject, model);
            if (matching != null) {
                modelNode.modelObjects.forEach [
                    mapping.put(it, matching.get(it.EObject));
                ]
                return mapping;
            }
        }
        return null;
    }

    /**
     * Performs a transitive join of all mappings between source and target model and map it to given model instances.
     * <p>
     * Returns a multi-mapping from objects of source model to target model objects.
     * Mapping is created by resolving all transformations on a path from source to target.
     * Source and target can be arbitrary models in tree, so path can be bottom up, top down or leaf to leaf.
     * <p>
     * A mapping can only be resolved if both source and target are NOT transient.
     * <p>
     * Returns null if source or target model do not match to their model of ModelWrapper in tree or if they are not in the same tree.
     * If transformation tree was created with incomplete mappings returned mapping may be incomplete.
     * @param sourceModelNode model in transformation tree representing sourceModel model
     * @param sourceModel root element of a source model instance
     * @param targetModelNode model in transformation tree representing targetModel model
     * @param targetModel root element of a target model instance
     * @return multi-mapping from source model objects to target model objects or null
     */
    def Multimap<EObject, EObject> joinMappings(ModelWrapper sourceModelNode, EObject sourceModel,
        ModelWrapper targetModelNode, EObject targetModel) {
        if (sourceModelNode.root != targetModelNode.root) {
            return null;
        }

        //get mapping for given source model instance
        val sourceMapping = sourceModelNode.modelInstanceMapping(sourceModel);
        if (sourceMapping == null) {
            return null;
        }

        //get mapping for given target model instance
        val targetMapping = targetModelNode.modelInstanceMapping(targetModel);
        if (targetMapping == null) {
            return null;
        }

        val mapping = joinWrapperMappings(sourceModelNode, targetModelNode);

        //transform element mapping into mapping between EObjects of given input models
        val objectMapping = HashMultimap::create(sourceMapping.size, 10);
        mapping.entries.forEach [
            objectMapping.put(sourceMapping.get(it.key), targetMapping.get(it.value));
        ];
        return objectMapping;
    }

    /**
     * Performs a transitive join of all mappings between source and target model based on their EObjectWrappers.
     * <p>
     * If concrete instances shall be resolved use {@link resolveMapping}.
     * <p>
     * Returns a multi-mapping from EObjectWrapper of source model to target model EObjectWrapper.
     * Mapping is created by resolving all transformations on a path from source to target.
     * Source and target can be arbitrary model in tree, so path can be bottom up, top down or leaf to leaf.
     * <p>
     * A mapping can also be resolved with transient ModelWrappers.
     * <p>
     * Returns null if models are not in the same tree.
     * If transformation tree was created on incomplete mappings returned mapping may be incomplete.
     * @param sourceModelNode model in transformation tree representing sourceModel model
     * @param targetModelNode model in transformation tree representing targetModel model
     * @return multi-mapping from source model object wrappers to target model object wrappers or null
     */
    def Multimap<EObjectWrapper, EObjectWrapper> joinWrapperMappings(ModelWrapper sourceModelNode,
        ModelWrapper targetModelNode) {

        if (sourceModelNode.root != targetModelNode.root) {
            return null;
        }

        //trivial case when source and target are same model
        if (sourceModelNode == targetModelNode) {

            val mapping = HashMultimap::create();
            sourceModelNode.modelObjects.forEach [
                mapping.put(it, it);
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

            //paths
            val sourceUpPath = new LinkedList;
            val targetUpPath = new LinkedList;

            //First create a path from target model upward to root,
            // if source model is found meanwhile stop and use existing path
            var node = targetModelNode; //Iteration variable for models on paths
            do {
                val sourceTransformation = node.sourceTransformation;
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

            //If no path is found yet, create a path from source model upward to root
            // if target model is found meanwhile stop and use existing path
            if (path == null) {
                node = sourceModelNode;
                do {
                    val sourceTransformation = node.sourceTransformation;
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
            // Therefore find a least common ancestor node (at least root) as connection between both paths
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
            val elementMapping = HashMultimap::create();

            //resolve mapping from path
            val _downwardIndex = downwardIndex; //index needs to be final to be used in iteration

            //init mapping
            path.get(0).objectTransformations.forEach [
                if (0 < _downwardIndex) {
                    elementMapping.put(it.target, it.source); //upward
                } else {
                    elementMapping.put(it.source, it.target); //downward
                }
            ];

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

            return elementMapping;
        }
    }
    
     /**
     * Saves a TracingTree model into the given resource.
     * 
     * @param tracingTree
     *            the tracing tree root element
     * @param resource
     *            the resource to save into
     * @return true if saving was successful else false
     */
    def boolean saveTracingTree(ModelWrapper tracingTree, Resource resource) {
        if (tracingTree != null) {
            // Add the model objects to the contents.
            resource.contents.add(tracingTree);
            resource.contents.add(tracingTree.rootObject.EObject);
            tracingTree.succeedingModelWrappers.forEach[
                resource.contents.add(it.rootObject.EObject);
            ];

            // Save the contents of the resource to the file system.
            try {
                resource.save(Collections.EMPTY_MAP);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------
    // Helper
    /**
     * Creates a EObjectWrapper for a given EObject contained in given ModelWrapper.
     */
    private def EObjectWrapper create element : factory.createEObjectWrapper() createEObjectWrapper(EObject obj,
        ModelWrapper model) {
        element.model = model;

        //create textual representation of references EObject with all it attributes
        val name = new StringBuilder(obj.class.simpleName);

        //append all attribute representation
        if (!obj.eClass.EAllAttributes.filterNull.empty) {
            name.append("[");
            obj.eClass.EAllAttributes.filterNull.map [ //get all attributes
                //compose name and value of the attribute
                name.append(it.name);
                name.append(": ");
                name.append(String::valueOf(obj.eGet(it)));
                name.append(","); //pattern for next attribute
            ]
            name.deleteCharAt(name.length - 1); //remove last comma
            name.append("]");
        }
        element.displayName = name.toString;
        element.EObject = obj;
    }

    /**
     * @return null if models are not identically else bijective mapping between matching objects
     */
    private def matchModels(EObject left, EObject right) {
        if (left == null || right == null) {
            return null;
        }
  
        val matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
        val comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
        val matchEngine = new DefaultMatchEngine(matcher, comparisonFactory);
        val matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
        val postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
        val comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).
            setPostProcessorRegistry(postProcessorRegistry).build();

        val scope = new FilterComparisonScope(left, right, null);
        scope.setEObjectContentFilter(
            [ EObject eo |
                matchIgnoreClasses.forall [
                    !it.isInstance(eo);
                ]
            ]);
        val comparison = comparator.compare(scope);

        if (comparison.differences.empty && comparison.matches.size == 1) {
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
