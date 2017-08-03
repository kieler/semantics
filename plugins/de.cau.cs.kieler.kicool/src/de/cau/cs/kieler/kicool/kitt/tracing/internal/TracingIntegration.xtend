/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kicool.kitt.tracing.internal;

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing
import de.cau.cs.kieler.kicool.environments.Environment

import static extension com.google.common.base.Preconditions.checkNotNull

/**
 * This class integrates Tracing into KiCo. It is registered as hook via extension point.
 * 
 * @author als ssm
 * @kieler.design 2015-04-27 proposed
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
public class TracingIntegration extends IntermediateProcessor<EObject, EObject> {
    
    override String getId() {
        return "de.cau.cs.kieler.kicool.kitt.processor.tracing"
    }

    override String getName() {
        return "Tracing"
    }

    override ProcessorType getType() {
        return ProcessorType.SYSTEM
    }
    
    static def boolean isTracingActive(Environment environment) {
        environment.getProperty(Tracing.ACTIVE_TRACING)
    }
    
    static def addTracingProperty(Environment environment) {
        if (!environment.isTracingActive) return;
        
        environment.setProperty(Tracing.TRACING_DATA, new Tracing)
    }
    
    override void processBefore() {
        if (!environment.isTracingActive) return;
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(getModel, environment.getProperty(Environment.INPLACE))
    }
    
    override void process() {
        if (!environment.isTracingActive) return;
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.finishTransformationTracing(getSourceModel, getTargetModel)
    }
    
    
    static def EObject copy(EObject model, Environment environment) {
        if (!environment.isTracingActive) return null
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(model, false)
        val EObject copy = TransformationTracing.tracedCopy(model)
        tracing.finishTransformationTracing(model, copy)
        
        return copy
    }

}
