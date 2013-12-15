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
import org.eclipse.emf.ecore.EObject
import java.util.Map.Entry

/**
 * Utility for initializing and modifying TransformationTrees
 * 
 * @author als
 *
 */
class TransformationTreeModifier {

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
     * New transformation will be appended to treeNode representing source model.
     * 
     * If transient flag of target model is NOT set all elements in that model are referenced and may be resolved to a resource.
     * So take care that referenced objects are persistent. If flag is set objects are identified by their name only.
     * 
     * Returns new leaf in tree as Model representing target model.
     * Return null if sourceModel is not treeNode
     * 
     * @param mapping object mapping data
     * @param treeNode treeNode to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @param isTargetModelTransient if true transformation tree will not hold any references to target model
     * @return newly created leaf in tree
     */
    def Model appendMappingToTree(ImmutableMultimap<EObject, EObject> mapping, Model treeNode, String transformationID,
        EObject sourceModelRoot, EObject targetModelRoot, String targetModelName, boolean isTargetModelTransient) {

        //check if source model has same type as treeNode
        //TODO correct identification because type is not unique an don't checks elements
        if (treeNode != null && treeNode.type.equals(sourceModelRoot.eClass)) {

            //append new target model to tree
            val Model source = treeNode;

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
     * Replaces transformation mapping information about source- and target-model to given tree.
     *  
     * New transformation will replace treeNode representing source model and will append transformation to target model all yet following transformations will be deleted.
     * 
     * If transient flag of target model is NOT set all elements in that model are referenced and may be resolved to a resource.
     * So take care that referenced objects are persistent. If flag is set objects are identified by their name only.
     * 
     * Returns new leaf in tree as Model representing target model.
     * Returns null if there is no transformation to replace, check parameters or use {@link TransformationTreeModifier#appendMappingToTree appendMappingToTree} instead.
     * 
     * @param mapping object mapping data
     * @param treeNode treeNode to append transformation, representing source model
     * @param transformationID a unique identifier for initial transformation
     * @param sourceModelRoot root element of source model
     * @param targetModelRoot root element of target model
     * @param targetModelName display name of target model
     * @param isTargetModelTransient if true transformation tree will not hold any references to target model
     * @return newly created leaf in tree
     */
    def Model replaceMappingInTree(ImmutableMultimap<EObject, EObject> mapping, Model treeNode, String transformationID,
        EObject sourceModelRoot, EObject targetModelRoot, String targetModelName, boolean isTargetModelTransient) {

        //check if source model has same type as treeNode and there is a transformation with same id and leading to a model with same type as target model
        //TODO correct identification because type is not unique an don't checks elements
        if (treeNode != null && treeNode.type.equals(sourceModelRoot.eClass) &&
            (treeNode.transformedInto ?: emptyList).filter[
                it.id == transformationID && it.target.type.equals(targetModelRoot.eClass)].size == 1) {

            //delink old transformation. will be deleted when references are cleared
            val oldTrans = treeNode.transformedInto.findFirst[
                it.id == transformationID && it.target.type.equals(targetModelRoot.eClass)];
            oldTrans.source = null;
            oldTrans.elementTransformations.forEach[it.source = null];

            //append new target model to tree
            val Model source = treeNode;

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
                val sourceElem = source.elements.findFirst[it.referencedObject == entry.key];//TODO this will fail when source model is transient
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

    //--------------------------------------------------------------------------------------------------
    //Helper
    private def Element create element : factory.createElement() createElement(EObject obj, Model model,
        boolean isTransient) {
        element.model = model;
        element.name = obj.eClass.name;
        if (!isTransient) {
            element.referencedObject = obj;
        }
    }
}
