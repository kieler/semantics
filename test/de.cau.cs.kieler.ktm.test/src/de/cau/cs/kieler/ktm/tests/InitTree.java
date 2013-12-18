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
package de.cau.cs.kieler.ktm.tests;

import com.google.inject.Guice;

import junit.framework.TestCase;
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions;
import de.cau.cs.kieler.ktm.generators.ModelGenerator;
import de.cau.cs.kieler.ktm.generators.SimpleTransformation;
import de.cau.cs.kieler.ktm.transformationtree.Model;

/**
 * @author als
 * 
 */
public class InitTree extends TestCase {

    ModelGenerator generator = Guice.createInjector().getInstance(ModelGenerator.class);
    SimpleTransformation transformer = Guice.createInjector().getInstance(
            SimpleTransformation.class);
    TransformationTreeExtensions transformation = Guice.createInjector().getInstance(
            TransformationTreeExtensions.class);

    public void test_initTree() {
        Model modelA = generator.generateThreePartsChain();
        assertNotNull(modelA);
        Model modelB = transformer.douleAllTransformations(modelA);
        assertNotNull(modelB);
        // check Transformation correctness
        assertTrue(transformation.succeedingTransformations(modelA).size() * 2 == transformation
                .succeedingTransformations(modelB).size());
        // generate transformation tree
        Model transTree =
                transformation.initializeTransformationTree(transformer.extractMapping(), "A -> B",
                        modelA, "Model A", modelB, "Model B");
        assertNotNull(transTree);

    }
}
