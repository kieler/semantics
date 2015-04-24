/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.tracing.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.IHook;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.TransformationIntermediateResult;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.kitt.tracing.TransformationTracing;

/**
 * @author als
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
    public EObject preTransformation(EObject model, KielerCompilerContext context) {
        if (context.getProperty(Tracing.ACTIVE_TRACING)) {
            List<TransformationIntermediateResult> transformations =
                    context.getCompilationResult().getTransformationIntermediateResults();
            ((Tracing) context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0))
                    .startTransformationTracing(model,
                            transformations.get(transformations.size() - 1).getId());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject postTransformation(EObject input, Object result, KielerCompilerContext context) {
        if (context.getProperty(Tracing.ACTIVE_TRACING)) {
            ((Tracing) context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0))
                    .finishTransformationTracing(input, result);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject preProcessor(EObject model, KielerCompilerContext context) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Object postProcessor(EObject input, Object result, KielerCompilerContext context) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject preSnapshot(EObject model, KielerCompilerContext context) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EObject postSnapshot(EObject model, KielerCompilerContext context) {
        return null;
    }

    public EObject copy(EObject model, KielerCompilerContext context) {
        if (context.getProperty(Tracing.ACTIVE_TRACING)) {
            Tracing tracing =
                    (Tracing) context.getCompilationResult().getAuxiliaryData(Tracing.class).get(0);
            tracing.startTransformationTracing(model, false);
            EObject copy = TransformationTracing.tracedCopy(model);
            tracing.finishTransformationTracing(model, copy);
            return copy;
        }
        return null;
    }
}
