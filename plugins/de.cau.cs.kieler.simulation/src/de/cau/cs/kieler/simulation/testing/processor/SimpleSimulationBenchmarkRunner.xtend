/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing.processor

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.simulation.testing.SimulationResult
import de.cau.cs.kieler.simulation.testing.TestSuite

import static extension java.lang.String.format

/**
 * @author als
 */
class SimpleSimulationBenchmarkRunner extends Processor<TestSuite, CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.simulation.testing.benchmark.runner.csv.simple"
    }
    
    override getName() {
        "Benchmarks Runner (CSV)"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val cc = new CodeContainer
        
        // Just for testing
        val results = newArrayList("Model,Test,MinTickTime,MaxTickTime,AvgTickTime")
        
        for (test : model.cellSet) {
            try {
                // Run benchmark
                Thread.sleep(100) // Wait for previous stuff to terminate
                val result = test.value.compile().model as SimulationResult
                if (result.results.empty) {
                    results += "%s,%s,NOTRACE,NOTRACE,NOTRACE".format(test.rowKey.modelFile, test.columnKey)
                } else {
                    val ticktimes = result.results.map[history.iterator.toIterable].flatten.filterNull
                                          .map[entries.get("#ticktime")].filterNull.map[(typedValue as Number).intValue].toList
                    results += "%s,%s,%d,%d,%d".format(
                        test.rowKey.modelPath, test.columnKey,
                        ticktimes.min, ticktimes.max, (ticktimes.fold(0)[sum, it | sum + it] / (ticktimes.size > 0 ? ticktimes.size : 1)) as int
                    )
                }
            } catch (Exception e) {
                results += "%s,%s,FAILED,FAILED,FAILED".format(test.rowKey.modelFile, test.columnKey)
                environment.warnings.add("Test %s failed for model %s".format(test.columnKey, test.rowKey.modelFile), e)
                e.printStackTrace
            } finally {
                // clean up
                System.gc()
            }
        }
        
        cc.add("results.csv", results.join("\n"))        
        model = cc
    }
    
}