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
package de.cau.cs.kieler.kicool.compilation

import de.cau.cs.kieler.kicool.compilation.Processor

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Metric extends Processor {
    
    public static val METRIC = "metric"
    protected static val METRIC_ENTITY = "metricEntity"
    protected static val METRIC_SOURCE_ENTITY = "metricSourceEntity"
    
    override setEnvironment(Environment environment, Environment environmentPrime) {
        this.environments = new Pair<Environment, Environment>(environment, environmentPrime)
    }    
    
    def void setMetric() {
        environment.data.put(METRIC, calculateMetricValue)
    }
    
    def double getMetric() {
        environment.data.get(METRIC) as Double
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    abstract protected def Object getMetricEntity()
    
    def setMetricEntity() {
        environment.data.put(METRIC_ENTITY, getMetricEntity)
    }
    
    def setMetricSourceEntity() {
        environment.data.put(METRIC_SOURCE_ENTITY, getMetricEntity)
    }
    
    def applyMetrics(Environment environment) {
        environment.data.put(METRIC, this.environment.data.get(METRIC))
        environment.data.put(METRIC_ENTITY, this.environment.data.get(METRIC_ENTITY))
        environment.data.put(METRIC_SOURCE_ENTITY, this.environment.data.get(METRIC_SOURCE_ENTITY))
    }
    
    abstract protected def double calculateMetricValue();
    
    override process() {}
}