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
package de.cau.cs.kieler.kicool.environments

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorStatus
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/**
 * Class for a processor environment, which is basically a key value map with some convenient methods.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class Environment extends EnvironmentPropertyHolder {
    
    public static val IProperty<Object> ORIGINAL_MODEL = 
        new Property<Object>("de.cau.cs.kieler.kicool.originalModel")
        
    public static val IProperty<Boolean> INPLACE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.inplace", false)

    public static val IProperty<Boolean> ONGOING_WORKING_COPY = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.ongoingWorkingCopy", true)
    
    public static val IProperty<Object> MODEL = 
        new Property<Object>("de.cau.cs.kieler.kicool.model")
        
    public static val IProperty<Object> SOURCE_MODEL = 
        new Property<Object>("de.cau.cs.kieler.kicool.sourceModel")
    
    public static val IProperty<CompilationContext> COMPILATION_CONTEXT = 
        new Property<CompilationContext>("de.cau.cs.kieler.kicool.compilationContext")

    public static val IProperty<CompilationContext> PRECEEDING_COMPILATION_CONTEXT = 
        new Property<CompilationContext>("de.cau.cs.kieler.kicool.preceedingCompilationContext")
        
    public static val IProperty<ProcessorReference> PROCESSOR_REFERENCE = 
        new Property<ProcessorReference>("de.cau.cs.kieler.kicool.processorReference")

    public static val IProperty<Processor<?,?>> PROCESSOR_INSTANCE = 
        new Property<Processor<?,?>>("de.cau.cs.kieler.kicool.processorInstance")

    public static val IProperty<Boolean> DYNAMIC_PROCESSOR_SYSTEM = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.dynamicProcessorSystem", false)
        
    public static val IProperty<Boolean> ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.enabled", true)
        
    public static val IProperty<Boolean> CANCEL_COMPILATION = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.cancelCompilation", false)
        
    public static val IProperty<Errors> ERRORS = 
        new Property<Errors>("de.cau.cs.kieler.kicool.errors", new Errors)

    public static val IProperty<Warnings> WARNINGS = 
        new Property<Warnings>("de.cau.cs.kieler.kicool.warnings", new Warnings)

    public static val IProperty<Infos> INFOS = 
        new Property<Infos>("de.cau.cs.kieler.kicool.infos", new Infos)

    public static val IProperty<Logs> LOGS = 
        new Property<Logs>("de.cau.cs.kieler.kicool.logs", null)

    // Duration of the processor execution in nano seconds
    public static val IProperty<Long> PROCESSOR_TIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.processor", new Long(0))
    // Duration of the processor execution with all intermediate and co-processors in nano seconds
    public static val IProperty<Long> TRANSFORMATION_TIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.transformation", new Long(0))
    public static val IProperty<Long> TRANSFORMATION_TIME_START = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.transformation.start", new Long(0))
    // Duration of the processor execution with all intermediate and co-processors as intermediate time until this progress notification (ProcessorProgress) in nano seconds
    public static val IProperty<Long> TRANSFORMATION_INTERMEDIATE_TIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.transformation.start", new Long(0))
    // Duration of the entire compilation in nano seconds
    public static val IProperty<Long> COMPILATION_TIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.compilation", new Long(0))
    public static val IProperty<Long> COMPILATION_TIME_START = 
        new Property<Long>("de.cau.cs.kieler.kicool.time.compilation.start", new Long(0))

    // Keys of properties that are relevant for benchmarks
    public static val IProperty<List<String>> BENCHMARK_RESULT_KEYS = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.benchmark.results", null)

    public static val IProperty<Snapshots> SNAPSHOTS = 
        new Property<Snapshots>("de.cau.cs.kieler.kicool.snapshots", new Snapshots)
        
    public static val IProperty<Boolean> SNAPSHOTS_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.snapshotsEnabled", true)
        
    public static val IProperty<UniqueClonableNameCache> UNIQUE_NAME_CACHE = 
        new Property<UniqueClonableNameCache>("de.cau.cs.kieler.kicool.uniqueNameCache", new UniqueClonableNameCache) 

    public static val IProperty<Boolean> UNIQUE_NAME_CACHE_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.uniqueNameCacheEnabled", true)
        
    public static val IProperty<Boolean> DEVELOPER_MODE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.developerMode", false)   
             
    public static val IProperty<Boolean> DEBUG_ENVIRONMENT_MODELS = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.debugEnvironmentModels", false)
        
    public static val REPORT_ROOT = MessageObjectReferences.ROOT
    
    new() {
    }
    
    def <T> T getProperty(IProperty<T> property, Object snapshotModel) {
        val snapshots = getProperty(SNAPSHOTS)
        val snapshot = snapshots.getModelSnapshot(snapshotModel)
        
        if (snapshot !== null) {
            if (snapshot.environment.propertyExists(property)) {
                return snapshot.environment.getProperty(property)
            }                
        }
        
        return property.getProperty
    }    
    
    def getCompilationContext() {
        getProperty(COMPILATION_CONTEXT)
    }
    
    def getErrors() {
        getProperty(ERRORS)
    }
    
    def getWarnings() {
        getProperty(WARNINGS)
    }
    
    def getInfos() {
        getProperty(INFOS)
    }
    
    def getLogs() {
        if (getProperty(LOGS) === null) setProperty(LOGS, new Logs)
        return getProperty(LOGS)
    }
    
    def getStatus() {
        if (getProperty(ERRORS).size > 0) return ProcessorStatus.ERRORS
        if (getProperty(WARNINGS).size > 0) return ProcessorStatus.WARNINGS
        return ProcessorStatus.OK
    }
    
    def Object getModel() {
        getProperty(MODEL)
    }
    
    def isInDeveloperMode() {
        getProperty(DEVELOPER_MODE)
    }
    
    def Resource findResource() {
        return findResource(null)
    }
    
    def Resource findResource(Object model) {
        var Resource res = null
        var candidate = model
        // First try given model
        if (candidate instanceof EObject) {
            res = candidate.eResource
        }
        // Next try original model
        if (res === null) {
            candidate = getProperty(ORIGINAL_MODEL)
            if (candidate instanceof EObject) {
                res = candidate.eResource
            }
        }
        // Next try preceeding compilation model
        if (res === null) {
            res = getProperty(PRECEEDING_COMPILATION_CONTEXT)?.result?.findResource
        }
        return res
    }
    
    /** 
     * Convenient toString method mainly for debugging purposes.
     */
    override toString() {
        val text = new StringBuilder
        text.append("Environment@")
        text.append(hashCode)
        if (propertyMap.size > 0) {
            text.append("\n")
            for (k : propertyMap.keySet) {
                text.append("  ")
                text.append(k.id)
                text.append(" = ")
                text.append(propertyMap.get(k).toString)
                text.append("\n")                
            }
            text.append("\n")
        }
        
        return text.toString
    }
}