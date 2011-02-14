/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.effects;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;

/**
 * A KiVi effect that executes a specific transformation.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 proposed yellow uru
 */
public class TransformationEffect extends AbstractEffect {

    private ITransformationContext context;
    private TransformationDescriptor descriptor;

    /**
     * default constructor.
     */
    public TransformationEffect() {
    }

    /**
     * @param context
     *            {@link ITransformationContext} containing all necessary information in order to
     *            execute the transformation.
     * @param descriptor
     *            The transformation's {@link TransformationDescriptor}
     */
    public TransformationEffect(final ITransformationContext context,
            final TransformationDescriptor descriptor) {
        this.context = context;
        this.descriptor = descriptor;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (context != null && descriptor != null) {
            // execute the transformation
            long start = System.currentTimeMillis();
            context.execute(descriptor);
            long end = System.currentTimeMillis();
            System.out.println("\t ##### Execution Time: " + (end - start));
        } else {
            Status status = new Status(
                    Status.ERROR,
                    CoreModelPlugin.PLUGIN_ID,
                    "A TransformationEffect could not be executed. Either the "
                            + "TransformationContext or the TransformationDescriptor has not been set.");
            StatusManager.getManager().handle(status);
        }
    }

    /**
     * @return the result of the executed transformation.
     */
    public Object getResult() {
        return descriptor.getResult();
    }

    /**
     * @param context
     *            the context to set
     */
    public void setContext(final ITransformationContext context) {
        this.context = context;
    }

    /**
     * @param descriptor
     *            the descriptor to set
     */
    public void setDescriptor(final TransformationDescriptor descriptor) {
        this.descriptor = descriptor;
    }
}
