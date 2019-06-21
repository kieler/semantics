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

import com.google.inject.Binder
import com.google.inject.Module
import de.cau.cs.kieler.kexpressions.extensions.EcoreUtilExtensions
import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.base.Preconditions.*
import static de.cau.cs.kieler.kicool.environments.Environment.*

/**
 * This class integrates Tracing into KiCo.
 * 
 * @author als ssm
 * @kieler.design 2015-04-27 proposed
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
class TracingIntegration extends IntermediateProcessor<EObject, EObject> {
    
    public static val MODULE = new Module() {
        
        override configure(Binder binder) {
            binder.bind(EcoreUtilExtensions).to(TracingEcoreUtilExtensions)
        }
        
    }
    
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
        checkNotNull(tracing)
        val processor = environment.getProperty(PROCESSOR_INSTANCE)
        val exogenous = processor.type == ProcessorType.EXOGENOUS_TRANSFORMATOR
        
        if (processor instanceof Traceable) {
            tracing.startTransformationTracing(getModel, null, processor.id, !exogenous)
        } else {
            environment.warnings.add("This processor does not support tracing. Resulting tracing chain may be incomplete!")
        }
    }
    
    override void process() {
        if (!environment.isTracingActive) return;
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        // Abort tracing when errors occurred
        if (!environment.errors.empty) {
            environment.warnings.add("No tracing data stored due to prior errors in compilation!")
            tracing.finishTransformationTracing(null, null)
            return
        }
        
        val processor = environment.getProperty(PROCESSOR_INSTANCE)
        val exogenous = processor.type == ProcessorType.EXOGENOUS_TRANSFORMATOR
        
        if (processor instanceof Traceable) {
            tracing.finishTransformationTracing(if (exogenous) getSourceModel else getTargetModel, getTargetModel)
        }
    }
    
    
    static def EObject copy(EObject model, Environment environment) {
        if (!environment.isTracingActive || environment.getProperty(ONGOING_WORKING_COPY)) {
            if (environment.getProperty(ONGOING_WORKING_COPY)) {
                environment.warnings.add("Tracing is not supported in combination with 'ongoing working copy' option!")
            }
            return EcoreUtil.copy(model)
        }
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(model, null, "kicool.internal.copy", false)
        val EObject copy = TransformationTracing.tracedCopy(model)
        tracing.finishTransformationTracing(model, copy)
        
        return copy
    }
    
    static def <T extends EObject> Pair<T, Copier> copyAndReturnCopier(T model, Environment environment) {
        if (!environment.isTracingActive || environment.getProperty(ONGOING_WORKING_COPY)) {
            if (environment.getProperty(ONGOING_WORKING_COPY)) {
                environment.warnings.add("Tracing is not supported in combination with 'ongoing working copy' option!")
            }
            val copier = new Copier()
            val EObject result = copier.copy(model)
            copier.copyReferences
            return new Pair(result as T, copier)
        }
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        checkNotNull(Tracing)
        
        tracing.startTransformationTracing(model, null, "kicool.internal.copy", false)
        val copy = TransformationTracing.tracedCopyAndReturnCopier(model)
        tracing.finishTransformationTracing(model, copy.key)
        
        return copy
    }    

}
