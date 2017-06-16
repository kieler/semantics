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
package de.cau.cs.kieler.kicool.ui.synthesis.feedback

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-06-13 proposed 
 * @kieler.rating 2017-06-13 proposed yellow
 *
 */
class PostUpdateDoubleCollector {
    
    @Accessors var String key
    @Accessors var double nullPercent = 0.33 
    @Accessors var double maxValue = nullPercent
    
    private val processorMap = <de.cau.cs.kieler.kicool.compilation.Processor, Double> newHashMap

    
    new(String key) {
        this.key = key
    }
    
    def addProcessor(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        try {
            val long = processor.environment.getData(key, 0.0) as Long
            val double value = long.longValue 
            processorMap.put(processor, value)
            if (value > maxValue) maxValue = value
        } catch(Exception e) {
        }
    }
    
    def getPercentile(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        val value = processorMap.get(processor) 
        if (value != null) {
            var double pVal = value.doubleValue() / maxValue
            if (pVal < nullPercent) { pVal = nullPercent }
            return pVal
        } else {
            return nullPercent
        }
    }
}