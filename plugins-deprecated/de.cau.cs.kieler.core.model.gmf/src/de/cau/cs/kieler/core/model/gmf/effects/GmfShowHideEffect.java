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
package de.cau.cs.kieler.core.model.gmf.effects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.model.effects.ShowHideEffect;

/**
 * An extended show / hide effect that is able to perform the change persistently.
 *
 * @author msp
 */
public class GmfShowHideEffect extends ShowHideEffect {
    
    /** true if highlighting should be persistent. */
    private boolean persistent;
    
    /**
     * Create a show / hide effect from an editor and a target object.
     * 
     * @param editor the editor in which to hide in
     * @param target the object to hide or reveal
     * @param hide if true the target will be hidden, if false target will be visible again
     * @param persistent true if highlighting should be persistent
     */
    public GmfShowHideEffect(final IWorkbenchPart editor, final EObject target, final boolean hide,
            final boolean persistent) {
        super(editor, target, hide);
        this.persistent = persistent;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        if (persistent && editPart instanceof IGraphicalEditPart) {
            IGraphicalEditPart gmfEditPart = (IGraphicalEditPart) editPart;
            final View view = gmfEditPart.getNotationView();
            originalVisible = view.isVisible();
            if (hide && originalVisible || !hide && !originalVisible) {
                TransactionalEditingDomain editingDomain = gmfEditPart.getEditingDomain();
                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain,
                        "Show / Hide Effect") {
                    protected void doExecute() {
                        view.setVisible(!hide);
                    }
                });
            }
        } else {
            super.execute();
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        if (persistent && editPart instanceof IGraphicalEditPart) {
            if (hide && originalVisible || !hide && !originalVisible) {
                IGraphicalEditPart gmfEditPart = (IGraphicalEditPart) editPart;
                final View view = gmfEditPart.getNotationView();
                TransactionalEditingDomain editingDomain = gmfEditPart.getEditingDomain();
                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain,
                        "Show / Hide Effect") {
                    protected void doExecute() {
                        view.setVisible(originalVisible);
                    }
                });
            }
        } else {
            super.undo();
        }
    }

}
