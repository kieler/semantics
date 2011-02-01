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
package de.cau.cs.kieler.kies.transformation.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendFacade;

import de.cau.cs.kieler.kies.transformation.core.TransformationContext;
import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;

/**
 * @author uru
 * 
 */
public class XtendTransformationContext implements TransformationContext {

    private static final String COMMAND_NAME = "Transformation Command";

    private XtendFacade xtendFacade;
    private TransactionalEditingDomain editingDomain;
    private TransformationDescriptor descriptor;
    private Semaphore lock;

    private Object result = null;

    /**
     * @param facade
     *            {@link XtendFacade} responsible for calling the extensions.
     * @param theDescriptor
     *            {@link TransformationDescriptor} containing the name and parameters of the current
     *            transformation.
     * @param theEditingDomain
     *            editing domain on which the current transformation is executed.
     * @param aLock
     *            a semaphore that is released as soon as the transformation finished.
     */
    public XtendTransformationContext(final XtendFacade facade,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain theEditingDomain, final Semaphore aLock) {
        super();
        this.xtendFacade = facade;
        this.descriptor = theDescriptor;
        this.editingDomain = theEditingDomain;
        this.lock = aLock;
    }

    /**
     * {@inheritDoc}
     */
    public void executeCurrent() {
        // FIXME workaround to avoid deadlock with FireOnceTriggerListener
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {

                // create a compound command to make sure all gmf elements are refreshed
                // after the transformation was executed
                // for some reason it is important to do this in a separate command!
                CompoundCommand cc = new CompoundCommand(COMMAND_NAME);

                XtendTransformationCommand command = new XtendTransformationCommand(xtendFacade,
                        descriptor, editingDomain);
                cc.append(command);
                cc.append(new RefreshGMFElementsCommand(editingDomain));

                CommandStack stack = editingDomain.getCommandStack();
                stack.execute(cc);
                result = command.getResult();

                if (lock != null) {
                    System.out.println("Release");
                    lock.release();
                }
            }
        });
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

    /**
     * @param theDescriptor
     *            the descriptor to set
     */
    public void setDescriptor(final TransformationDescriptor theDescriptor) {
        this.descriptor = theDescriptor;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getLastResult() {
        return result;
    }

    /**
     * inner class refreshing the GMF edit policies.
     * 
     * @author uru
     * 
     */
    private class RefreshGMFElementsCommand extends RecordingCommand {

        /**
         * @param domain
         */
        public RefreshGMFElementsCommand(final TransactionalEditingDomain domain) {
            super(domain);
        }

        @Override
        protected void doExecute() {
            final IEditorPart activeEditor = TransformationUtil.getActiveEditor();
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    if (activeEditor instanceof IDiagramWorkbenchPart) {
                        EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramEditPart().getModel()).getElement();
                        List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
                        for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                            CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                            nextEditPolicy.refresh();
                        }
                        IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramGraphicalViewer();
                        graphViewer.flush();
                    }
                }
            });
        }
    }
}
