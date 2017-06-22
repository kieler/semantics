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
package de.cau.cs.kieler.kicool.compilation

import de.cau.cs.kieler.kicool.compilation.Processor

/**
 * A Metric is a specialized processor. 
 * It measures differences between to model states. 
 * Usually, a value below 1.0 means that a specific characteristic has improved. 
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Metric extends Processor {
    
    /* Environment keys */
    public static val METRIC = "metric"
    protected static val METRIC_ENTITY = "metricEntity"
    protected static val METRIC_SOURCE_ENTITY = "metricSourceEntity"
    
    /**
     * Override to environment setter to be able to set the processor environments
     * regardless of any pre or post processing.
     */
    override setEnvironment(Environment environment, Environment environmentPrime) {
        this.environments = new Pair<Environment, Environment>(environment, environmentPrime)
    }    
    
    /**
     * Set the metric value now.
     */
    def void setMetric() {
        environment.data.put(METRIC, calculateMetricValue)
    }
    
    /** 
     * Retrieve the metric value.
     */
    def double getMetric() {
        environment.data.get(METRIC) as Double
    }
    
    /**
     * All metrics are analyzer.
     */
    override getType() {
        ProcessorType.ANALYZER
    }
    
    /**
     * Override this method to retrieve the specific metric object (e.g. eObjectCount).
     */
    abstract protected def Object getMetricEntity()
    
    /**
     * Set the specific metric object. 
     */
    def setMetricEntity() {
        environment.data.put(METRIC_ENTITY, getMetricEntity)
    }
    
    /** 
     * Set the specific metric object for the source model.
     */
    def setMetricSourceEntity() {
        environment.data.put(METRIC_SOURCE_ENTITY, getMetricEntity)
    }

    /**
     * Override this method to calculate the actual metric value.
     */    
    abstract protected def double calculateMetricValue();
    
    /**
     * Besides calculating the metric values, a metric does not have much to do.
     */
    override process() {}
}