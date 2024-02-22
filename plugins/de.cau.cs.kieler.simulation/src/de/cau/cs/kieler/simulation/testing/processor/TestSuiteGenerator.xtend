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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.internal.ContextPopulation
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.testing.TestModelCollection
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.simulation.testing.TestSuite
import java.io.File
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension java.lang.String.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Config format: {
 *   "<ALL_KEY?>": { // configuration for all tests
 *     "<ENV_KEY?>": { // properties added to the environment of the test
 *       "property-id": "value",
 *       ...
 *     }
 *     "<FILTER_KEY?>": { // selection of models to test
 *       "<TRACE_KEY?>": "<boolean>", // requires associated trace
 *       "<MODEL_KEY?>": "<kexpression that consists of (AND/OR/NOT) operator expressions and strings that represent model property keys>", // filter expression based on model properties
 *       "<OTHER_KEY?>": { // additional properties required
 *         "property-id": "expected-value",...
 *       }
 *     }
 *   }
 *   "<test-id>": { // individual test configuration
 *     "<SYSTEM_KEY>": "<system-id>" // compilation system to use during test
 *     "<SIM_KEY?>": "<boolean (default:true)>" // Whether or not to simulate the result
 *     "<INPLACE_KEY?>": "<boolean (default:false)>" // Activation of inplace compilation
 *     "<ANALYZER_KEY?>": { // Additional analyzer processors to hook into the compilation
 *        "processor-id": "<INTERMEDIATE_KEY | PRE_KEY<processor-id> | POST_KEY<processor-id>>", // e.g.: "post:de.cau.cs.kieler.kicool.processors.identity"
 *        ...
 *     }
 *     <any-property-of-ALL_KEY> // see above
 *   }
 *   "<next-test-id?>": {...
 * }
 * 
 * @author als
 */
class TestSuiteGenerator extends Processor<TestModelCollection, TestSuite> {
     
    public static val ALL_KEY = "all"
    public static val ENV_KEY = "env"
    public static val FILTER_KEY = "filter"
    public static val TRACE_KEY = "trace" 
    public static val MODEL_KEY = "model"
    public static val OTHER_KEY = "other"   
    public static val SYSTEM_KEY = "system" 
    public static val SIM_KEY = "simulate"
    public static val INPLACE_KEY = "inplace"
    public static val ANALYZER_KEY = "analyzer"
    public static val INTERMEDIATE_KEY = "intermediate"
    public static val PRE_KEY = "pre:"
    public static val POST_KEY = "post:"
    
    /** Expected structure corresponds to json config format */
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
                val suite = new TestSuite(model, tests.size)
                val gEnv = generalConf?.get(ENV_KEY)
                for (testId : tests) {
                    val testConf = conf.get(testId)
                    var system = testConf.get(SYSTEM_KEY)
                    if (system === null || !(system instanceof String)) {
                        environment.errors.add("Incomplete configuration! Missing system in test " + testId)
                    } else {
                        val testEnv = testConf?.get(ENV_KEY)
                        val filter = new ModelFilter(testConf?.get(FILTER_KEY), generalConf?.get(FILTER_KEY))
                        
                        for (testModel : model.models.filter[filter.accept(it)]) {
                            val ctx = Compile.createCompilationContext(system as String, testModel)
                            ctx.stopOnError = true
                            ctx.startEnvironment.setProperty(Environment.INPLACE, "true".equalsIgnoreCase(testConf.get(INPLACE_KEY)?.toString))
                            ctx.startEnvironment.setProperty(ProjectInfrastructure.MODEL_FILE_PATH, testModel.repositoryPath.resolve(testModel.modelPath).toFile.canonicalPath)
                            ctx.startEnvironment.setProperty(ProjectInfrastructure.USE_TEMPORARY_PROJECT, ProjectInfrastructure.USE_TEMPORARY_PROJECT.property)
                            ctx.startEnvironment.setProperty(ProjectInfrastructure.GENERATED_NAME, "kieler-gen-" + testId.replaceAll(" |\\.|:", "-"))
                            if (ProjectInfrastructure.GENERATED_FOLDER_ROOT.property !== null) {
                                var base = new File(ProjectInfrastructure.GENERATED_FOLDER_ROOT.property, testId.replaceAll(" |\\.|:", "-"))
                                ctx.startEnvironment.setProperty(ProjectInfrastructure.GENERATED_FOLDER_ROOT, base.toString)
                                ctx.startEnvironment.setProperty(ProjectInfrastructure.GENERATED_NAME, (testModel.repositoryPath.fileName.toString + "-" + testModel.modelPath.toString).replaceAll(" |\\.|:|/|\\\\", "-"))
                            }
                            
                            val systemRoot = ctx.system.processors as ProcessorGroup
                            // Prepend model loader
                            val loader = createProcessorReference => [id = TestModelLoader.ID]
                            systemRoot.processors.add(0, loader)
                            ContextPopulation.populate(loader, ctx)
                            val loaderInst = ctx.processorInstancesSequence.last
                            ctx.processorInstancesSequence.remove(loaderInst)
                            ctx.processorInstancesSequence.add(0, loaderInst)
                            
                            // Append trace tester
                            if (!"false".equalsIgnoreCase(testConf.get(SIM_KEY)?.toString)) {
                                val tester = createProcessorReference => [id = TraceSimulator.ID]
                                systemRoot.processors.add(tester)
                                ContextPopulation.populate(tester, ctx)
                            }
                            
                            // Add analyzers
                            val analyzers = testConf.get(ANALYZER_KEY)
                            if (analyzers instanceof Map) {
                                for (entry : analyzers.entrySet as Set<Map.Entry<String, Object>>) {
                                    val position = entry.value
                                    if (position instanceof String) {
                                        if (INTERMEDIATE_KEY.equalsIgnoreCase(position)) {
                                            val analyzer = createIntermediateReference => [id = entry.key]
                                            ContextPopulation.populate(analyzer, ctx)
                                            ctx.system.intermediates += analyzer
                                        } else if (position.startsWith(PRE_KEY) || position.startsWith(POST_KEY)) {
                                            val parts = position.split(":")
                                            val matches = ctx.processorMap.keySet.filter[id.equalsIgnoreCase(parts.get(1))].toList
                                            if (!matches.empty) {
                                                for (processorRef : matches) {
                                                    val analyzer = createProcessorReference => [id = entry.key]
                                                    // no population of co-processors
                                                    if (PRE_KEY.startsWith(parts.get(0))) {
                                                        processorRef.preprocesses.add(0, analyzer)
                                                    } else {
                                                        processorRef.postprocesses.add(analyzer)
                                                    }
                                                }
                                            } else {
                                                environment.errors.add("Cannot find processor with id %s to add analyzer %s.".format(parts.get(1), entry.key))
                                            }
                                        } else {
                                            environment.errors.add("Cannot add analyzer %s. Unknown position %s.".format(entry.key, position))
                                        }
                                    }
                                }
                            }
                            
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
                            
                            suite.add(testModel, testId, ctx)
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

class ModelFilter {
    
    static val VALID_OPS = #[OperatorType.LOGICAL_AND, OperatorType.LOGICAL_OR, OperatorType.NOT]
    var Boolean trace // null is undefined
    val Expression globalFilter
    val Expression localFilter
    val otherProperties = newHashMap
    val List<String> errors = newArrayList
   
    new(Object testFilterConfig, Object globalFilterConfig) {
        val tFilter = testFilterConfig instanceof Map ? testFilterConfig as Map<String, Object> : null
        val gFilter = globalFilterConfig instanceof Map ? globalFilterConfig as Map<String, Object> : null
        
        // trace
        if (tFilter !== null && tFilter.containsKey(TestSuiteGenerator.TRACE_KEY)) {
            trace = "true".equals(tFilter.get(TestSuiteGenerator.TRACE_KEY))
        } else if (gFilter !== null && gFilter.containsKey(TestSuiteGenerator.TRACE_KEY)) {
            trace = "true".equals(gFilter.get(TestSuiteGenerator.TRACE_KEY))
        }
        // model properties
        globalFilter = gFilter?.get(TestSuiteGenerator.MODEL_KEY).parseFilterExpression
        localFilter = tFilter?.get(TestSuiteGenerator.MODEL_KEY).parseFilterExpression
        
        // other properties
        gFilter?.get(TestSuiteGenerator.OTHER_KEY).addToOtherProperties
        tFilter?.get(TestSuiteGenerator.OTHER_KEY).addToOtherProperties // override global entries by test filter
    }
    
    private def addToOtherProperties(Object props) {
        if (props instanceof Map) {
            for (entry : props.entrySet as Set<Map.Entry<String, Object>>) {
                if (entry.value instanceof String) {
                    otherProperties.put(entry.key, entry.value)
                }
            }
        }
    }
    
    private def Expression parseFilterExpression(Object expr) {
        if (expr instanceof String) {
            var kexpr = KExtStandaloneParser.parseExpression(expr)
            if (kexpr instanceof Expression) {
                // Convenience
                if (kexpr instanceof ValuedObjectReference) {
                    kexpr = kexpr.toStringValue
                } else {
                    kexpr.eAllContents.filter(ValuedObjectReference).forEach[it.replace(it.toStringValue)]
                }
                // Check
                if (kexpr.isValidExpression && kexpr.eAllContents.forall[isValidExpression]) {
                    return kexpr
                } else {
                    errors += "Model filter expression contains illegal operators/values: '%s'".format(expr)
                }
            } else {
                errors += "Could not parse model filter expression: '%s'".format(expr)
            }
        }
        return null
    }
    
    private def boolean isValidExpression(EObject kexpr) {
        return kexpr instanceof StringValue ||
              (kexpr instanceof OperatorExpression &&
               VALID_OPS.contains((kexpr as OperatorExpression).operator))
    }
    
    def boolean accept(TestModelData data) {
        if (trace !== null) {
            if (trace !== (!data.tracePaths.isEmpty && data.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")])) {
                return false
            }
        }
        if (globalFilter !== null && !globalFilter.eval(data)) {
            return false
        }
        if (localFilter !== null && !localFilter.eval(data)) {
            return false
        }
        for (entry : otherProperties.entrySet) {
            if (!data.additionalProperties.containsKey(entry.key) || !entry.value.equals(data.additionalProperties.get(entry.key))) {
                return false
            }
        }
        return true
    }
    
    private dispatch def boolean eval(StringValue key, TestModelData data) {
        return data.modelProperties.contains(key.value)
    }
    
    private dispatch def boolean eval(OperatorExpression ex, TestModelData data) {
        switch(ex.operator) {
            case NOT: return !ex.subExpressions.head.eval(data)
            case LOGICAL_AND: return ex.subExpressions.forall[eval(data)]
            case LOGICAL_OR: return ex.subExpressions.exists[eval(data)]
            default: return false
        }
    }
    
    private def toStringValue(ValuedObjectReference vor) {
        return KExpressionsFactory.eINSTANCE.createStringValue() => [value = vor.valuedObject.name]
    }
    
}