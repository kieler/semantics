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
package de.cau.cs.kieler.kitt.tracing.internal;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.transformation.IHook;
import de.cau.cs.kieler.kico.transformation.IProcessor;
import de.cau.cs.kieler.kico.transformation.ITransformation;
import de.cau.cs.kieler.kitt.tracing.Traceable;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.kitt.tracing.TransformationTracing;

/**
 * This class integrates Tracing into KiCo. It is registered as hook via extension point.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
public class CompilerIntegration implements IHook {

    /**
     * {@inheritDoc}
     */
    public String getId() {
        return "kitt";
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Tracing";
    }

    /**
     * {@inheritDoc}
     */
    public void preCompilation(KielerCompilerContext context) {
        if (context.getProperty(Tracing.ACTIVE_TRACING)) {
            // context.getLogger("tracing").info("Tracing active");
            // Remove all Tracing data from compiler context and add a new Tracing data to the
            // auxiliary data
            CompilationResult cr = context.getCompilationResult();
            for (AbstractKielerCompilerAuxiliaryData akad : cr.getAuxiliaryData(Tracing.class)) {
                cr.removeAuxiliaryData(akad);
            }
            cr.addAuxiliaryData(new Tracing());
        }
    }

    /**
     * {@inheritDoc}
     */
    public EObject preTransformation(EObject model, KielerCompilerContext context,
            ITransformation transformation) {
        if (context.getProperty(Tracing.ACTIVE_TRACING) && transformation instanceof Traceable) {
            // Start transformation tracing for given model and the current transformation
            context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0)
                    .startTransformationTracing(model, transformation.getId());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject postTransformation(EObject input, Object result, KielerCompilerContext context,
            ITransformation transformation) {
        if (context.getProperty(Tracing.ACTIVE_TRACING) && transformation instanceof Traceable) {
            // Finish transformation tracing for given model and the intermediate result
            context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0)
                    .finishTransformationTracing(input, result);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject preProcessor(EObject model, KielerCompilerContext context, IProcessor processor) {
        // Not supported yet!
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Object postProcessor(EObject input, Object result, KielerCompilerContext context,
            IProcessor processor) {
        // Not supported yet!
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject preSnapshot(EObject model, KielerCompilerContext context) {
        // Not supported yet!
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject postSnapshot(EObject model, KielerCompilerContext context) {
        // Not supported yet!
        return null;
    }

    public EObject copy(EObject model, KielerCompilerContext context) {
        if (context.getProperty(Tracing.ACTIVE_TRACING)) {
            // Perform a traced copy as transformation
            Tracing tracing = context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0);
            tracing.startTransformationTracing(model, false);
            EObject copy = TransformationTracing.tracedCopy(model);
            tracing.finishTransformationTracing(model, copy);
            return copy;
        }
        return null;
    }
}
