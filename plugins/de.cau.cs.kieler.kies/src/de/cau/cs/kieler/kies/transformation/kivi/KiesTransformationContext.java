/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.kivi;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.SWTException;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;

import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.m2m.XtendTransformationContext;
import de.cau.cs.kieler.kies.transformation.Activator;

/**
 * A wrapper for the {@link XtendTransformationContext} in order to provide additional information
 * to the user in case any exceptions occurrs.
 * 
 * @author uru
 */
public class KiesTransformationContext extends XtendTransformationContext {

    /**
     * @param facade
     *            {@link XtendFacade} responsible for calling the extensions.
     * @param theEditingDomain
     *            editing domain on which the current transformation is executed.
     * */
    public KiesTransformationContext(final XtendFacade facade,
            final TransactionalEditingDomain theEditingDomain) {
        super(facade, theEditingDomain);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final TransformationDescriptor descriptor) {
        try {
            super.execute(descriptor);
        } catch (SWTException e) {
            // a stackoverflow may occur during the optimization of a SyncCharts
            if (e.getCause() instanceof StackOverflowError) {
                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        "A stackoverflow occured. \n"
                                + "As the optimization of large diagrams "
                                + "requires more stack than usual, increasing the stacksize "
                                + "may solve the problem. \n"
                                + "Optimizing small subsets of the overall diagram "
                                + "may also help.", e);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            } else {
                throw e;
            }
        }
    }
}
