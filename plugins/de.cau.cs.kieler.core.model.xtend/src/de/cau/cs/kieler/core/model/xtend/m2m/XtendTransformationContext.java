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
package de.cau.cs.kieler.core.model.xtend.m2m;

import java.util.Map;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;

import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.util.XtendTransformationUtil;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * {@link ITransformationContext} for the execution of Xtend transformations.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 green
 *      review by msp, haf
 */
public class XtendTransformationContext implements ITransformationContext {

    private XtendFacade xtendFacade;
    private TransactionalEditingDomain editingDomain;

    /**
     * @param facade
     *            {@link XtendFacade} responsible for calling the extensions.
     */
    public XtendTransformationContext(final XtendFacade facade) {
        this.xtendFacade = facade;
    }

    /**
     * @param facade
     *            {@link XtendFacade} responsible for calling the extensions.
     * @param theEditingDomain
     *            editing domain on which the current transformation is executed.
     * */
    public XtendTransformationContext(final XtendFacade facade,
            final TransactionalEditingDomain theEditingDomain) {
        this.xtendFacade = facade;
        this.editingDomain = theEditingDomain;

    }

    /**
     * @param extensionFile
     *            the file (*.ext) containing the used extensions.
     * @param basePackages
     *            the base packages used by this transformation
     * @param globalVars
     *            A {@link Map} with global variables used by xtend. May be {@code null}.
     * @param editingDomain
     *            editing domain on which the current transformation is executed. May be
     *            {@code null}.
     */
    public XtendTransformationContext(final String extensionFile, final String[] basePackages,
            final Map<String, Variable> globalVars, final TransactionalEditingDomain editingDomain) {
        this(XtendTransformationUtil.initializeFacade(extensionFile, basePackages, globalVars),
                editingDomain);
    }

    /**
     * {@inheritDoc}
     */
    public void execute(final TransformationDescriptor descriptor) {

        if (editingDomain != null && editingDomain.getCommandStack() != null) {
            // FIXME workaround to avoid deadlock with FireOnceTriggerListener
            MonitoredOperation.runInUI(new Runnable() {

                public void run() {
                    XtendTransformationCommand command = new XtendTransformationCommand(
                            xtendFacade, descriptor, editingDomain);
                    CommandStack stack = editingDomain.getCommandStack();
                    stack.execute(command);
                    if (command.getResult() != null) {
                        // the result is either the first element of a collection or null!
                        descriptor.setResult(command.getResult().iterator().next());
                    }

                }
            }, true);
        } else {
            Object o = xtendFacade.call(descriptor.getTransformationName(),
                    descriptor.getParameters());
            descriptor.setResult(o);
        }
    }

    /**
     * @param theXtendFacade
     *            the xtendFacade to set
     */
    public void setXtendFacade(final XtendFacade theXtendFacade) {
        this.xtendFacade = theXtendFacade;
    }

    /**
     * @param theEditingDomain
     *            the editingDomain to set
     */
    public void setEditingDomain(final TransactionalEditingDomain theEditingDomain) {
        this.editingDomain = theEditingDomain;
    }

}
