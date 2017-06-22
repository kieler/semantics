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
import de.cau.cs.kieler.kicool.compilation.Metric

/**
 * @author ssm
 * @kieler.design 2017-06-20 proposed 
 * @kieler.rating 2017-06-20 proposed yellow
 *
 */
class PostUpdateMetricCollector {
    
    @Accessors var String key
    @Accessors var double nullPercent = 0.33 
    @Accessors var double maxValue = nullPercent
    @Accessors var double maxPercent = 2.0
    
    private val processorMap = <de.cau.cs.kieler.kicool.compilation.Processor, Double> newHashMap

    
    new() {
        this.key = Metric.METRIC
    }
    
    def addProcessor(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        try {
            val d = processor.environment.getData(key, 0.0) as Double
            val double value = d.doubleValue 
            processorMap.put(processor, value)
            if (value > maxValue) maxValue = value
        } catch(Exception e) {
        }
    }
    
    def getPercentile(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        val value = processorMap.get(processor) 
        var localMaxPercent = if (maxValue < maxPercent) maxValue else maxPercent
        if (value != null) {
            var pVal = value.doubleValue
                var t = (pVal - 1) / (maxValue - 1) * localMaxPercent
                pVal = t    
                if (pVal > localMaxPercent) { pVal = localMaxPercent }
                if (pVal < nullPercent) { pVal = nullPercent }
            println(pVal)
            return pVal
        } else {
            return nullPercent
        }
    }
}