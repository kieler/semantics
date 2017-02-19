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
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class EObjectCount extends Metric {
    
    static val ENVIRONMENT_METRIC_KEY = "eObjectCount"
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.metrics.eObjectCount"
    }
    
    override getName() { 
        "EObject Count Metric"
    }
    
    override process() {
        val model = environment.getModel as EObject
        val count = model.count
        environment.data.put(ENVIRONMENT_METRIC_KEY, count)
        
        val previousCount = environments.key.data.get(ENVIRONMENT_METRIC_KEY)
        if (previousCount != null) {
            setMetric(count / previousCount as Double)
        } else {
            setMetric(1.0)
        }
    }
    
    static def count(EObject eObject) {
        0
    }
    
}