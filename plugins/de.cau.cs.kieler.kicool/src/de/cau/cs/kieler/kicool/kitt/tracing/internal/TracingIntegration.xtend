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
import de.cau.cs.kieler.core.model.Pair

import static extension com.google.common.base.Preconditions.checkNotNull
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import static de.cau.cs.kieler.kicool.environments.Environment.*
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

/**
 * This class integrates Tracing into KiCo.
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
        
        if (environment.getProperty(PROCESSOR_INSTANCE) instanceof Traceable) {
            tracing.startTransformationTracing(getModel, null, environment.getProperty(PROCESSOR_INSTANCE).id, environment.getProperty(Environment.INPLACE))
        } else {
            environment.warnings.add("This processor does not support tracing. Resulting tracing chain may be incomplete!")
        }
    }
    
    override void process() {
        if (!environment.isTracingActive) return;
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        if (environment.getProperty(PROCESSOR_INSTANCE) instanceof Traceable) {
            tracing.finishTransformationTracing(getSourceModel, getTargetModel)
        }
    }
    
    
    static def EObject copy(EObject model, Environment environment) {
        if (!environment.isTracingActive) return null
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(model, null, "copy", false)
        val EObject copy = TransformationTracing.tracedCopy(model)
        tracing.finishTransformationTracing(model, copy)
        
        return copy
    }
    
    static def <T extends EObject> Pair<T, Copier> copyAndReturnCopier(T model, Environment environment) {
        if (!environment.isTracingActive) return null
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(model, null, "copy environment", false)
        val copy = TransformationTracing.tracedCopyAndReturnCopier(model)
        tracing.finishTransformationTracing(model, copy.first)
        
        return copy
    }    

}
