/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.test.common.repository

import de.cau.cs.kieler.simulation.testing.TestModelData
import java.util.Comparator

/** 
 * Interface for a test running on the models repository.
 * Annotate the implementing class with @RunWith(ModelsRepositoryTestRunner.class)
 * 
 * @author als
 */
interface IModelsRepositoryTest<T> extends Comparator<TestModelData> {
    /** 
     * Filter for selecting the models to test with.
     * @param modelData
     * @return true if test should be performed with this model.
     */
    def boolean filter(TestModelData modelData)

    /** 
     * Reads the model form the path into a runtime instance.
     * @param modelData
     * @return runtime model instance
     */
    def T loadModel(TestModelData modelData)

    /** 
     * Returns the class of the model type this test handles.
     * @return runtime model instance class
     */
    def Class<? super T> getModelType()

}
