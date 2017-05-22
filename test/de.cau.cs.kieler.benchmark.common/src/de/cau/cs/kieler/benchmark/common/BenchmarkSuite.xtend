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

import com.google.inject.Guice
import de.cau.cs.kieler.test.common.repository.ModelsRepository
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Status
import org.eclipse.ui.progress.UIJob
import org.eclipse.ui.PlatformUI

/**
 * The main benchmark suite starting all benchmarks.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class BenchmarkSuite extends UIJob {

    /** Identifier of the extension point for benchmarks. */
    private static val String EXTP_ID_BENCHMARK = "de.cau.cs.kieler.benchmark.common.benchmark";
    /** Name of the 'benchmarks' element. */
    private static val String ELEMENT_BENCHMARK = "benchmark";
    /** Name of the 'class' attribute in the extension points. */
    private static val String ATTRIBUTE_CLASS = "class";
    
    /** Bamboo run flag */
    package boolean isBambooRun
    /** Database location */
    val String dbLocation
    
    /**
     * Create a new benchmark suit either for local or server use
     */
    new(boolean isBambooRun, String dbLocation) {
        super("Benchmarks")
        this.isBambooRun = isBambooRun
        this.dbLocation = dbLocation
    }

    /**
     * {@inheritDoc}
     */
    override runInUIThread(IProgressMonitor monitor) {
        try {
            if (isBambooRun) println("=== STARTED Benchmarks ===")
            flush
            
            // Setup
            val injector = Guice.createInjector
            val benchmarks = loadBenchmarks
            val db = if (isBambooRun) {
                    new MongoBenchmarkDatabase(dbLocation)
                } else {
                    new WorkspaceBenchmarkDatabase(dbLocation)
                }
    
            // Run each benchmark
            for (benchmarkClass : benchmarks) {
                val filterInstance = injector.getInstance(benchmarkClass)
                if (isBambooRun) println("Executing Benchmark: " + filterInstance.ID)
                for (data : ModelsRepository.models.filter[filterInstance.filter(it)]) {
                    if (isBambooRun) println(new StringBuilder("\nPerforming benchmark with model: ").append(data.repositoryPath.fileName).append(":").append(data.modelPath).toString)
                    try {
                        // Prepare
                        val benchmark = injector.getInstance(benchmarkClass)
                        benchmark.prepare(data)
                        
                        // Clean JVM
                        System.gc
                        Thread.sleep(500)
                        
                        // Perform benchmark and store data
                        val result = benchmark.perform(data)
                        db.storeResult(benchmark, data, result)
                    } catch (Exception e) {
                        if (isBambooRun) e.printStackTrace else throw e
                    }
                }
                if (isBambooRun) println("Finished Benchmark: " + filterInstance.ID)
            }
    
            // Save database
            db.save
        } catch (Exception e) {
            if (isBambooRun) println("=== FAILED Benchmarks ===")
            if (isBambooRun) e.printStackTrace else throw e
            flush
        } finally {
            if (isBambooRun) println("=== FINISHED Benchmarks ===")
            if (isBambooRun) { // Shutdown
                flush
                PlatformUI.workbench.close
                System.exit(-1)
            }
        }
        return Status.OK_STATUS
    }

    /**
     * @return list of all active benchmark classes.
     */
    private def List<Class<IBenchmark>> loadBenchmarks() {
        val extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTP_ID_BENCHMARK)
        val benchmarks = new ArrayList(extensions.length)
        val ids = new HashSet(extensions.length)

        // Read extension point
        for (element : extensions) {
            if (ELEMENT_BENCHMARK.equals(element.getName())) {
                try {
                    val benchmark = element.createExecutableExtension(ATTRIBUTE_CLASS) as IBenchmark
                    if (ids.contains(benchmark.ID)) {
                        throw new Exception(benchmark.class.name + " has a non-unique ID!")
                    } else if (benchmark.ID.isInvalid) {
                        val builder = new StringBuilder
                        builder.append(benchmark.class.name)
                        builder.append(" has an invalid ID!\n")
                        builder.append(" -The ID must not be null or empty.\n")
                        builder.append(" -The ID must not be _id.\n")
                        builder.append(" -The ID must not start with the dollar sign ($) character.\n")
                        builder.append(" -The ID must not contain the dot (.) character.\n")
                        throw new Exception(builder.toString)
                    } else {
                        ids.add(benchmark.ID)
                    }
                    benchmarks.add(benchmark.class as Class<IBenchmark>)
                } catch (Exception e) {
                    if (isBambooRun) e.printStackTrace else throw e
                }
            }
        }

        return benchmarks
    }
    
    /**
     * @return true if the ID has an invalid format.
     */
    private def isInvalid(String id) {
        return switch(id) {
            case "_id",
            case id.startsWith("$"),
            case id.contains("."),
            case id.nullOrEmpty: true
            default: false
        }
    }
    
    /**
     * Flushes all pipes.
     */
    private def flush() {
        System.out.flush
        System.err.flush
    } 

}
