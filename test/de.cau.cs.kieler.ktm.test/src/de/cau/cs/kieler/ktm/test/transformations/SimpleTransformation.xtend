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
package de.cau.cs.kieler.ktm.test.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.ktm.extensions.TransformationMapping
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory

/**
 * @author als
 *
 */
class SimpleTransformation {

    val TransformationTreeFactory factory = TransformationTreeFactory.eINSTANCE;

    @Inject
    extension TransformationMapping

    @Inject
    extension TransformationTreeExtensions

    /**
     * splits all ModelTransformation-edges into two edges and adds a new Model in between
     */
    def ModelWrapper splitAllTransformations(ModelWrapper input) {

        //Create copy and create direct mapping
        val output = input.mappedCopy;
        output.succeedingTransformations.forEach [
            val insertedModel = factory.createModelWrapper;
            insertedModel.mapParents(it.mappedParents);
            insertedModel.modelTypeID = it.source.modelTypeID + "_2";
            val insertedTransformation = factory.createModelTransformation;
            insertedTransformation.mapParents(it.mappedParents);
            insertedTransformation.transformationID = it.transformationID + " (2)";
            insertedTransformation.source = insertedModel;
            insertedTransformation.target = it.target;
            it.target = insertedModel;
        ]

        return output;
    }

    /**
     * Merges all model elements into one model
     */
    def mergeIntoOneTransformation(ModelWrapper input) {
        val output = factory.createModelWrapper;
        output.modelTypeID = "TheOneAndOnly";
        input.mapChild(output);
        input.eAllContents.forEach[it.mapChild(output)];
        return output;
    }

    def identity(ModelWrapper input) {
        return input.mappedCopy;
    }

    def extractMapping() {
        return extractMappingData();
    }
}
