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
package de.cau.cs.kieler.kicool.processors.analyzers

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import java.lang.reflect.ParameterizedType
import java.util.List
import java.util.Map

/**
 * @author als
 */
abstract class AbstractModelDataCollector<T> extends IntermediateProcessor<Object, Object> {
    
    public static val IProperty<Map<Processor<?,?>, Map<String, Object>>> TRANSFORMATION_DATA_REF = 
        new Property<Map<Processor<?,?>, Map<String, Object>>>("de.cau.cs.kieler.kicool.processors.analyzers.model.data.transformations", null)
    public static val IProperty<List<Map<String, Object>>> DATA = 
        new Property<List<Map<String, Object>>>("de.cau.cs.kieler.kicool.processors.analyzers.model.data", null)
        
    public static val ORIG_KEY = "original"
    public static val TRANS_KEY = "transformation"
        
    override getType() {
        return ProcessorType.ANALYZER
    }
    
    override processBefore() {
        val data = getRootData()
        // Perform analysis for origin model
        var origin = environment.getProperty(Environment.ORIGINAL_MODEL)
        if (data.empty && collectableType.isInstance(origin)) {
            val originData = newLinkedHashMap()
            originData.put(TRANS_KEY, ORIG_KEY)
            data.add(originData)
            (origin as T).collect(originData)
        }
    }
    
    override process() {
        if (collectableType.isInstance(model)) { // If can be analyzed
            // Find previous transformation
            var idx = compilationContext.processorInstancesSequence.indexOf(environment.getProperty(Environment.PROCESSOR_INSTANCE))
            var Processor<?,?> t = null
            while (idx >= 0 && t === null) {
                val p = compilationContext.processorInstancesSequence.get(idx)
                if (p.type === ProcessorType.EXOGENOUS_TRANSFORMATOR || p.type === ProcessorType.ENDOGENOUS_TRANSFORMATOR) {
                    t = p
                }
                idx--
            }
            
            if (t !== null) {
                var data = getRootData()
                val tDataRef = environment.getPropertyAndSetIfAbsent(TRANSFORMATION_DATA_REF, newHashMap())
                var Map<String, Object> tData = null
                if (tDataRef.containsKey(t)) {
                    tData = tDataRef.get(t)
                } else {
                    tData = newLinkedHashMap()
                    data.add(tData)
                    tData.put(TRANS_KEY, t.processorReference.id)
                    tDataRef.put(t, tData)
                }
                
                (model as T).collect(tData)
            }
        }
    }
    
    def getRootData() {
        var List<Map<String, Object>> data = environment.getProperty(DATA)
        if (data === null) {
            data = newArrayList()
            environment.setProperty(DATA, data)
            environment.getPropertyAndSetIfAbsent(Environment.BENCHMARK_RESULT_KEYS, newArrayList()).add(DATA.id)
        }
        return data
    }
    
    def Class<T> collectableType() {
        (this.class.genericSuperclass as ParameterizedType).actualTypeArguments.get(0) as Class<T>
    }
    
    abstract def void collect(T model, Map<String, Object> data);
    
    // ------------------
    // Utilities for data
    
    def void increment(Map<String, Object> data, String key) {
        data.put(key, (data.getOrDefault(key, 0) as Integer) + 1)
    }
    
    def void increase(Map<String, Object> data, String key, int value) {
        data.put(key, (data.getOrDefault(key, 0) as Integer) + value)
    }
    
    def void max(Map<String, Object> data, String key, int value) {
        if (data.containsKey(key)) {
            val pre = data.get(key) as Integer
            if (value > pre) {
                data.put(key, value)
            }
        } else {
            data.put(key, value)
        }
    }
}