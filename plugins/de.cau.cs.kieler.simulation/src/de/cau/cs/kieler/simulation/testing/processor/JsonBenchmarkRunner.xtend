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

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.simulation.testing.TestSuite

import static extension java.lang.String.format
import com.google.gson.JsonNull
import de.cau.cs.kieler.simulation.testing.SimulationResult

/**
 * @author als
 */
class JsonBenchmarkRunner extends Processor<TestSuite, CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.simulation.testing.benchmark.runner.json"
    }
    
    override getName() {
        "Benchmarks Runner (JSON)"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    static val gson = new GsonBuilder().setPrettyPrinting().create()
    
    override process() {
        val cc = new CodeContainer
        val results = new JsonObject
        
        for (test : model.cellSet) {
            val model = test.rowKey
            val key = model.repositoryPath.fileName + ":" + model.modelPath.toString
            if (!results.has(key)) {
                results.add(key, new JsonObject)
            }
            val modelResults = results.get(key) as JsonObject
            val result = test.value.run(test.columnKey, test.rowKey)
            if (result !== null) {
                modelResults.add(test.columnKey, result)
            }
        }
        
        cc.add("benchmark-results.json", gson.toJson(results))
        model = cc
    }
    
    protected def JsonObject run(CompilationContext test, String id, TestModelData model) {
        try {
            val result = new JsonObject
            val env = test.compile()
            val resultKeys = env.getProperty(Environment.BENCHMARK_RESULT_KEYS)
            if (resultKeys !== null) {
                for (key : resultKeys) {
                    val value = env.getProperty(new Property(key, null))
                    if (value !== null) {
                        result.add(key, value.convertToJson(key))
                    }
                }
            }
            if (env.model instanceof SimulationResult) {
                result.add("simulation", (env.model as SimulationResult).toJson)
            }
            if (result.size > 0) return result
        } catch (Exception e) {
            environment.warnings.add("Test %s failed for model %s".format(id, model.modelFile), e)
            e.printStackTrace
        }
        return null
    }
    
    protected def JsonElement convertToJson(Object data, String key) {
        if (data instanceof JsonElement) {
            return data
        } else {
            try {
                return gson.toJsonTree(data)
            } catch (Exception e) {
                environment.warnings.add("Failed to convert benchmark result %s into json".format(key), e)
                e.printStackTrace
            }
        }
        return JsonNull.INSTANCE
    }
    
}