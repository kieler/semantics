/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.processors.metrics

import de.cau.cs.kieler.kicool.compilation.Metric
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*

/**
 * PTime metric
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class PTime extends Metric {
    
    static val long MIN_TIME = 1;
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.metrics.pTime"
    }
    
    override getName() { 
        "PTime Metric"
    }
    
    override protected getMetricEntity() {
        val pTime = environment.data.get(PTIME) as Long
        val value = if (pTime == null || pTime < MIN_TIME) MIN_TIME else pTime
        value
    }
    
    override protected calculateMetricValue() {
        val sourceEntity = environment.data.get(METRIC_SOURCE_ENTITY) as Long
        val modelEntity = environment.data.get(METRIC_ENTITY) as Long
        if (sourceEntity != 0) 
            return (modelEntity.intValue as double) / (sourceEntity.intValue as double)
        else
            return 1.0;
    }
    
    override setMetricSourceEntity() {
        environment.data.put(METRIC_SOURCE_ENTITY, 1000 as long)
    }    
    
}