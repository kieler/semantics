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
package de.cau.cs.kieler.benchmark.common

import org.eclipse.ui.IStartup

/**
 * Starts the benchmarks when eclipse starts.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class BenchmarkStartup implements IStartup {
    
    /** Environment key for activating benchmarks on bamboo with mongoDB. The value is the db URI. */
    private static val BENCHMARK_BAMBOO_KEY = "server_benchmark"
    /** Environment key for activating local benchmarks. The value is a name for the locally create project. */
    private static val BENCHMARK_USER_KEY = "local_benchmark"
    
    /**
     * {@inheritDoc}
     */
    override earlyStartup() {
        if (System.getenv(BENCHMARK_BAMBOO_KEY) !== null) {
            // Start benchmark suite when eclipse had time to finish startup
            println("\n-- Waiting for other background jobs to finish. Benchmarks will start in 30 seconds. --\n")
            new BenchmarkSuite(true, System.getenv(BENCHMARK_BAMBOO_KEY)).schedule(30000)
        } else if (System.getenv(BENCHMARK_USER_KEY) !== null) {
            new BenchmarkSuite(false, System.getenv(BENCHMARK_USER_KEY)).schedule(10000)
        }
    }
}