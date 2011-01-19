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
package de.cau.cs.kieler.kies.transformation.kivi;

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

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.kies.transformation.core.TransformationCommand;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;

/**
 * @author uru
 * 
 */
public class TransformationEffect extends AbstractEffect {

    private static final String COMMAND_NAME = "Transformation Command";

    private XtendFacade xtendFacade;
    private Object[] parameters;
    private String transformationName;
    private TransactionalEditingDomain editingDomain;
    private Semaphore lock;

    private Object result = null;

    /**
     * Default constructor.
     * 
     * @param facade
     *            the XtendFacade responsible for calling the transformation.
     * @param theTransformationName
     *            name of the transformation to run.
     * @param theParameters
     *            parameters to pass.
     * @param theEditingDomain
     *            editing domain in which the transformation should be performed.
     */
    public TransformationEffect(final XtendFacade facade, final String theTransformationName,
            final Object[] theParameters, final TransactionalEditingDomain theEditingDomain,
            final Semaphore aLock) {
        super();
        this.parameters = theParameters;
        this.transformationName = theTransformationName;
        this.xtendFacade = facade;
        this.editingDomain = theEditingDomain;
        this.lock = aLock;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        System.out.println("TransformEffect undo");
        super.undo();
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {


        // FIXME workaround to avoid deadlock with FireOnceTriggerListener
       PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {

                // create a compound command to make sure all gmf elements are refreshed
                // after the transformation was executed
                // for some reason it is important to do this in a separate command!
                CompoundCommand cc = new CompoundCommand(COMMAND_NAME);

                TransformationCommand command = new TransformationCommand(xtendFacade, parameters,
                        transformationName, editingDomain);
                cc.append(command);
                cc.append(new RefreshGMFElementsCommand(editingDomain));

                CommandStack stack = editingDomain.getCommandStack();
                stack.execute(cc);
                result = command.getResult();

                if (lock != null) {
                    System.out.println("Release");
                   // lock.release();
                }
            }
        }); 
    }

    /**
     * @return the result
     */
    public Object getResult() {
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
