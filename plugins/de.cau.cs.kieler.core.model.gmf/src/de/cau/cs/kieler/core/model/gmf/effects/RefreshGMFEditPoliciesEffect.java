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
package de.cau.cs.kieler.core.model.gmf.effects;

import java.util.List;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.kivi.AbstractEffect;

/**
 * KiVi effect refreshing the edit policies of the passed {@link DiagramEditor}. Undo functionality
 * is supported if desired.
 * 
 * @author uru
 * 
 * @kieler.rating 2011-02-14 proposed yellow uru
 */
public class RefreshGMFEditPoliciesEffect extends AbstractEffect {

    private DiagramEditor activeEditor;
    private boolean undoable = false;

    /**
     * @param activeEditor
     *            active editor which should be refreshed.
     * @param undoable
     *            determines whether the refreshing should be executed using the editor's command
     *            stack or not. In case no command stack is used, no undo functionality is
     *            available.
     */
    public RefreshGMFEditPoliciesEffect(final DiagramEditor activeEditor, final boolean undoable) {
        super();
        this.activeEditor = activeEditor;
        this.undoable = undoable;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {

        if (undoable) {
            TransactionalEditingDomain editDomain = activeEditor.getEditingDomain();
            CommandStack stack = editDomain.getCommandStack();

            stack.execute(new RefreshGMFEditPoliciesCommand(editDomain));
        } else {
            refreshPolicies();
        }
    }

    private void refreshPolicies() {
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                if (activeEditor instanceof IDiagramWorkbenchPart) {
                    EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                            .getDiagramEditPart().getModel()).getElement();
                    List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
                            .getRegisteredEditPolicies(obj);
                    for (CanonicalEditPolicy editPolicy : editPolicies) {
                        editPolicy.refresh();
                    }
                    IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                            .getDiagramGraphicalViewer();
                    graphViewer.flush();
                }
            }
        });
    }

    /**
     * inner class refreshing the GMF edit policies.
     * 
     * @author uru
     * 
     */
    private class RefreshGMFEditPoliciesCommand extends RecordingCommand {

        private static final String COMMAND_NAME = "Refresh Edit Policies";

        /**
         * @param domain
         */
        public RefreshGMFEditPoliciesCommand(final TransactionalEditingDomain domain) {
            super(domain, COMMAND_NAME);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        protected void doExecute() {
            refreshPolicies();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canExecute() {
            return true;
        }
    }
}
