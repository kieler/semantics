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

/**
 * Metric that measures differences in the eObject count.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class EObjectCount extends Metric {
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.metrics.eObjectCount"
    }
    
    override getName() { 
        "EObject Count Metric"
    }
    
    static def count(EObject eObject) {
        eObject.eAllContents.toList.size
    }
    
    override protected getMetricEntity() {
        val model = environment.getModel
        if (model instanceof EObject) {
            model.count
        } else {
            System.err.println("EObject metric is used for non-eObject. This does not yield any result.")
            0
        } 
    }
    
    override protected calculateMetricValue() {
        val sourceEntity = environment.data.get(METRIC_SOURCE_ENTITY) as Integer
        val modelEntity = environment.data.get(METRIC_ENTITY) as Integer
        if (sourceEntity != 0) 
            return (modelEntity.intValue as double) / (sourceEntity.intValue as double)
        else
            return 1.0;
    }
    
}