package de.cau.cs.kieler.benchmark.common;
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

import org.bson.Document;

import de.cau.cs.kieler.test.common.repository.TestModelData;

/**
 * Interface for model related benchmarks.
 * 
 * Each benchmark will instantiate a new benchmark class to perform a benchmark on this class.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public interface IBenchmark {
    
    /**
     * A unique identifier for the benchmark.
     * <p>
     * Must fullfill the following requirements:<br>
     * - The ID must not be null or empty.<br>
     * - The ID must not be _id.<br>
     * - The ID must not start with the dollar sign ($) character.<br>
     * - The ID must not contain the dot (.) character.<br>
     * 
     * @retrun a unique ID
     */
    public abstract String getID();   

    /**
     * Filter for selecting the models to perform benchmarks with.
     * <p>
     * May not be invoked on the same instance as the actual benchmark of the filtered model.
     * 
     * @return true if the model is accepted for this benchmark.
     */
    public abstract boolean filter(TestModelData data);

    /**
     * Prepares the instance for the actual benchmark.
     * 
     * @param data the benchmark model data
     */
    public abstract void prepare(TestModelData data);

    /**
     * Performs the benchmark on a model in the prepared instance.
     * 
     * @param data the benchmark model data
     * @return benchmark results
     */
    public abstract Document perform(TestModelData data);
}
