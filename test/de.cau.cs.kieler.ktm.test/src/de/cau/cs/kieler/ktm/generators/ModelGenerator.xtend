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
package de.cau.cs.kieler.ktm.generators

import de.cau.cs.kieler.ktm.transformationtree.Model
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory

/**
 * Genrates Example Models from TransformationTreeMetaModels
 * 
 * @author als
 *
 */
class ModelGenerator {
    val TransformationTreeFactory factory = TransformationTreeFactory.eINSTANCE;

    def generateThreePartsChain() {
        val Model part1 = factory.createModel();
        part1.name = "Part1";
        
        val Model part2 = factory.createModel();
        part2.name = "Part2";

        val ModelTransformation transformation1 = factory.createModelTransformation();
        transformation1.id = "Part1 -> Part2";
        transformation1.source = part1;
        transformation1.target = part2;

        val Model part3 = factory.createModel();
        part3.name = "Part3";

        val ModelTransformation transformation2 = factory.createModelTransformation();
        transformation2.id = "Part2 -> Part3";
        transformation2.source = part2;
        transformation2.target = part3;
        
        return part1;
    }  
}
