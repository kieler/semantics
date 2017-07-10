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
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*

/**
 * PTime metric
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class PTime extends Metric<Object, Integer> {
    
    static val IProperty<Integer> METRIC_ENTITY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.metrics.pTime.entity")

    static val IProperty<Integer> METRIC_SOURCE_ENTITY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.metrics.pTime.sourceEntity")    
    
    static val long MIN_TIME = 1;
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.metrics.pTime"
    }
    
    override getName() { 
        "PTime Metric"
    }
    
    override protected getMetricEntityProperty() {
        METRIC_ENTITY
    }
    
    override protected getMetricSourceEntityProperty() {
        METRIC_SOURCE_ENTITY
    }    
    
    override protected getMetricEntity() {
        val pTime = environment.getProperty(PTIME) 
        val value = if (pTime == null || pTime < MIN_TIME) MIN_TIME else pTime
        value.longValue as int
    }
    
    override protected calculateMetricValue() {
        val sourceEntity = environment.getProperty(METRIC_SOURCE_ENTITY)
        val modelEntity = environment.getProperty(METRIC_ENTITY) 
        if (sourceEntity != 0) 
            return (modelEntity.intValue as double) / (sourceEntity.intValue as double)
        else
            return 1.0;
    }
    
    override setMetricSourceEntity() {
        environment.setProperty(METRIC_SOURCE_ENTITY, 1000)
    }
    

    
}