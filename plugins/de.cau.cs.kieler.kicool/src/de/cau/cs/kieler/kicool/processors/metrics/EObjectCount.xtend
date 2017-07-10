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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.Environment

/**
 * Metric that measures differences in the eObject count.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class EObjectCount extends Metric<EObject, Integer> {

    static val IProperty<Integer> METRIC_ENTITY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.metrics.eObjectCount.entity", 0)

    static val IProperty<Integer> METRIC_SOURCE_ENTITY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.metrics.eObjectCount.sourceEntity", 0)
    
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.metrics.eObjectCount"
    }
    
    override getName() { 
        "EObject Count Metric"
    }
    
    override protected getMetricEntityProperty() {
        METRIC_ENTITY
    }
    
    override protected getMetricSourceEntityProperty() {
        METRIC_SOURCE_ENTITY
    }    
    
    static def count(EObject eObject) {
        eObject.eAllContents.toList.size + 1
    }
    
    override protected getMetricEntity() {
        val model = environment.getProperty(Environment.MODEL)
        if (model instanceof EObject) {
            model.count
        } else {
            System.err.println("EObject metric is used for non-eObject. This does not yield any result.")
            0
        } 
    }
    
    override protected calculateMetricValue() {
        val sourceEntity = environment.getProperty(METRIC_SOURCE_ENTITY)
        val modelEntity = environment.getProperty(METRIC_ENTITY)
        if (sourceEntity != 0) 
            return (modelEntity.intValue as double) / (sourceEntity.intValue as double)
        else
            return 1.0;
    }
    
}