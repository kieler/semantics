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

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.internal.ContextPopulation
import de.cau.cs.kieler.simulation.testing.TestModelCollection
import de.cau.cs.kieler.simulation.testing.TestSuite
import java.util.Map
import java.util.Set

/**
 * @author als
 */
class TestSuiteGenerator extends Processor<TestModelCollection, TestSuite> {
    
    /**
     * Config format: {
     *   "<ALL_KEY?>": {
     *     "<ENV_KEY?>": {
     *       "property-id": "value",...
     *     }
     *   }
     *   "<test-id>": {
     *     "<SYSTEM_KEY>": "<system-id>"
     *     <any-property-of-ALL>
     *   }
     *   "<next-test-id?>": {...
     * }
     */
     
    public static val ALL_KEY = "all"     
    public static val ENV_KEY = "env"     
    public static val SYSTEM_KEY = "system"
    public static val IProperty<Map<String, Map<String, Object>>> CONFIG = 
        new Property<Map<String, Map<String, Object>>>("de.cau.cs.kieler.simulation.testing.suite.config", null)
        
    extension KiCoolFactory = KiCoolFactory.eINSTANCE
    
    override getId() {
        "de.cau.cs.kieler.simulation.testing.suite.generator"
    }
    
    override getName() {
        "Test Suite Generator"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val conf = getProperty(CONFIG)
        if (conf !== null) {
            if (environment.inDeveloperMode) environment.logs.add("Configuration", conf.toString())
            val generalConf = conf.get(ALL_KEY)
            val tests = conf.keySet.filter[!ALL_KEY.equals(it)].toList
            if (tests.empty) {
                environment.errors.add("Incomplete configuration! No tests specified.")
            } else {
                val suite = new TestSuite(model, conf.size)
                val gEnv = generalConf?.get(ENV_KEY)
                for (testId : tests) {
                    var system = conf.get(testId).get(SYSTEM_KEY)
                    if (system === null || !(system instanceof String)) {
                        environment.errors.add("Incomplete configuration! Missing system in test " + testId)
                    } else {
                        val testEnv = generalConf?.get(ENV_KEY)
                        
                        // TODO implement filters for models
                        
                        for (testModel : model.models) {
                            val ctx = Compile.createCompilationContext(system as String, testModel)
                            val systemRoot = ctx.system.processors as ProcessorGroup
                            // Prepend model loader
                            val loader = createProcessorReference => [id = TestModelLoader.ID]
                            systemRoot.processors.add(0, loader)
                            ContextPopulation.populate(loader, ctx)
                            val loaderInst = ctx.processorInstancesSequence.last
                            ctx.processorInstancesSequence.remove(loaderInst)
                            ctx.processorInstancesSequence.add(0, loaderInst)
                            // Append trace tester
                            val tester = createProcessorReference => [id = TraceSimulator.ID]
                            systemRoot.processors.add(tester)
                            ContextPopulation.populate(tester, ctx)
                            
                            // TODO add analyzers
                            // TODO add other processors?
                            
                            // Configure start environment
                            if (gEnv instanceof Map) {
                                for (entry : gEnv.entrySet as Set<Map.Entry<String, Object>>) {
                                    // TODO combine collection-based values instead of overriding?
                                    ctx.startEnvironment.allProperties.put(new Property(entry.key), entry.value)
                                }
                            }
                            if (testEnv instanceof Map) {
                                for (entry : testEnv.entrySet as Set<Map.Entry<String, Object>>) {
                                    // TODO combine collection-based values instead of overriding?
                                    ctx.startEnvironment.allProperties.put(new Property(entry.key ), entry.value)
                                }
                            }
                            
                            suite.put(testModel, testId, ctx)
                        }
                    }
                }
                model = suite
            }
        } else {
            environment.errors.add("Missing configuration!")
        }
    }
    
}