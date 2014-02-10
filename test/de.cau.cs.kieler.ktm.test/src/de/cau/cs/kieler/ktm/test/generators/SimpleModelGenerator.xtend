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
package de.cau.cs.kieler.ktm.test.generators

import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory

/**
 * Generates example (invalid) models from TransformationTree-MetaModel
 * 
 * @author als
 *
 */
class SimpleModelGenerator {
    val TransformationTreeFactory factory = TransformationTreeFactory.eINSTANCE;

    /**
     * o - o - o
     */
    def generateThreePartsChain() {
        val ModelWrapper part1 = factory.createModelWrapper();
        part1.modelTypeID = "Part1";

        val ModelWrapper part2 = factory.createModelWrapper();
        part2.modelTypeID = "Part2";

        val ModelTransformation transformation1 = factory.createModelTransformation();
        transformation1.transformationID = "Part1 -> Part2";
        transformation1.source = part1;
        transformation1.target = part2;

        val ModelWrapper part3 = factory.createModelWrapper();
        part3.modelTypeID = "Part3";

        val ModelTransformation transformation2 = factory.createModelTransformation();
        transformation2.transformationID = "Part2 -> Part3";
        transformation2.source = part2;
        transformation2.target = part3;

        return part1;
    }

    /**
     * o - o
     *  \- o
     */
    def generateThreePartsTree() {
        val ModelWrapper part1 = factory.createModelWrapper();
        part1.modelTypeID = "Part1";

        val ModelWrapper part2 = factory.createModelWrapper();
        part2.modelTypeID = "Part2";

        val ModelTransformation transformation1 = factory.createModelTransformation();
        transformation1.transformationID = "Part1 -> Part2";
        transformation1.source = part1;
        transformation1.target = part2;

        val ModelWrapper part3 = factory.createModelWrapper();
        part3.modelTypeID = "Part3";

        val ModelTransformation transformation2 = factory.createModelTransformation();
        transformation2.transformationID = "Part1 -> Part3";
        transformation2.source = part1;
        transformation2.target = part3;

        return part1;
    }

    /**
     * o - o - o
     *      \- o - o
     */
    def generateFivePartsTree() {
        val ModelWrapper part1 = factory.createModelWrapper();
        part1.modelTypeID = "Part1";

        val ModelWrapper part2 = factory.createModelWrapper();
        part2.modelTypeID = "Part2";

        val ModelTransformation transformation1 = factory.createModelTransformation();
        transformation1.transformationID = "Part1 -> Part2";
        transformation1.source = part1;
        transformation1.target = part2;

        val ModelWrapper part3 = factory.createModelWrapper();
        part3.modelTypeID = "Part3";

        val ModelTransformation transformation2 = factory.createModelTransformation();
        transformation2.transformationID = "Part2 -> Part3";
        transformation2.source = part2;
        transformation2.target = part3;

        val ModelWrapper part4 = factory.createModelWrapper();
        part4.modelTypeID = "Part4";

        val ModelTransformation transformation3 = factory.createModelTransformation();
        transformation3.transformationID = "Part2 -> Part4";
        transformation3.source = part2;
        transformation3.target = part4;

        val ModelWrapper part5 = factory.createModelWrapper();
        part5.modelTypeID = "Part5";

        val ModelTransformation transformation4 = factory.createModelTransformation();
        transformation4.transformationID = "Part4 -> Part5";
        transformation4.source = part4;
        transformation4.target = part5;

        return part1;
    }
}
