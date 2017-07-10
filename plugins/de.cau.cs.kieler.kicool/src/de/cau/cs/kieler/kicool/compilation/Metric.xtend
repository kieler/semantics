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
import de.cau.cs.kieler.kicool.classes.EnvironmentPair
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property

/**
 * A Metric is a specialized processor. 
 * It measures differences between to model states. 
 * Usually, a value below 1.0 means that a specific characteristic has improved. 
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Metric<Source, Type> extends Processor<Source, Source> {
    
    public static val IProperty<Double> METRIC = 
        new Property<Double>("de.cau.cs.kieler.kicool.metric")    
    
    /**
     * Override to environment setter to be able to set the processor environments
     * regardless of any pre or post processing.
     */
    override setEnvironment(Environment environment, Environment environmentPrime) {
        this.environments = new EnvironmentPair(environment, environmentPrime)
    }    
    
    /**
     * Set the metric value now.
     */
    def void setMetric() {
        environment.setProperty(METRIC, calculateMetricValue)
    }
    
    /** 
     * Retrieve the metric value.
     */
    def double getMetric() {
        environment.getProperty(METRIC)
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
    abstract protected def Type getMetricEntity()
    
    abstract protected def IProperty<Type> getMetricEntityProperty()
    
    abstract protected def IProperty<Type> getMetricSourceEntityProperty()
    
    /**
     * Set the specific metric object. 
     */
    def void setMetricEntity() {
        val property = getMetricEntityProperty 
        environment.setProperty(property, getMetricEntity)
    }
    
    /** 
     * Set the specific metric object for the source model.
     */
    def void setMetricSourceEntity() {
        val property = getMetricEntityProperty
        environment.setProperty(property, getMetricEntity)
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