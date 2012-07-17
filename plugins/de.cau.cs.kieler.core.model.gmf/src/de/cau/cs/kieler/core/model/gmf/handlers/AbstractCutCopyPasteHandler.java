/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.gmf.handlers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.common.ui.util.CustomData;
import org.eclipse.gmf.runtime.common.ui.util.ICustomData;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.AWTClipboardHelper;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.commands.CopyImageCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.PasteViewRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Abstract super class for all handlers concerning copy and paste on diagrams.
 * It checks whether the selection can be handled by the given handler and
 * creates the commands corresponding to the requests made by the UI.
 * 
 * @author soh
 * @kieler.design 2010-06-15 msp, cmot
 */
@SuppressWarnings("restriction")
public abstract class AbstractCutCopyPasteHandler extends
        DiagramGlobalActionHandler {

    /** buffered result of the last request for copy. */
    private boolean canKsbaseCopy;
    /** buffered result of the last request for paste. */
    private boolean canKsbasePaste;

    /**
     * Creates a new AbstractCutCopyPasteHandler.
     */
    public AbstractCutCopyPasteHandler() {
        super();
    }

    /**
     * Checks whether the selection contains only valid parts. This must be
     * implemented by the subclasses.
     * 
     * @param selection
     *            the selection
     * @return true if only valid parts are in the selection
     */
    protected abstract boolean isValidSelection(
            final IStructuredSelection selection);

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public boolean canHandle(final IGlobalActionContext cntxt) {

        /* Check if the active part is a IDiagramWorkbenchPart */
        IWorkbenchPart part = cntxt.getActivePart();
        if (!(part instanceof IDiagramWorkbenchPart)) {
            return false;
        }

        /* Check if the selection is a structured selection */
        if (cntxt.getSelection() instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) cntxt
                    .getSelection();
            if (isValidSelection(sel)) {
                getListFromSelection(sel);
                String actionId = cntxt.getActionId();
                if (actionId.equals(GlobalActionId.COPY)) {
                    return canKsbaseCopy(sel);
                } else if (actionId.equals(GlobalActionId.CUT)) {
                    return canKsbaseCopy(sel);
                } else if (actionId.equals(GlobalActionId.PASTE)) {
                    return canKsbasePaste(sel);
                }
            } else {
                /* Check the action id */
                String actionId = cntxt.getActionId();
                if (actionId.equals(GlobalActionId.COPY)) {
                    canKsbaseCopy = false;
                    return canCopy(cntxt);
                } else if (actionId.equals(GlobalActionId.CUT)) {
                    canKsbaseCopy = false;
                    return canCut(cntxt);
                } else if (actionId.equals(GlobalActionId.PASTE)) {
                    canKsbasePaste = false;
                    return canPaste(cntxt);
                }
            }
            return false;
        }
        return super.canHandle(cntxt);
    }

    /**
     * Determine whether the current selection can be copied or cut by Ksbase.
     * Subclasses may choose to override if they don't support all selections.
     * 
     * @param sel
     *            the selection
     * @return true if the selection can be cut/copied
     */
    protected boolean canKsbaseCopy(final IStructuredSelection sel) {
        boolean result = true;
        canKsbaseCopy = result;
        return result;
    }

    /**
     * Determine whether the current selection can be used as a target for
     * pasting by Ksbase. Subclasses may choose to override if they don't
     * support all selections.
     * 
     * 
     * @param sel
     *            the selection
     * @return true if the selection can be used
     */
    protected boolean canKsbasePaste(final IStructuredSelection sel) {
        boolean result = true;
        canKsbasePaste = result;
        return result;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected boolean canPaste(final IGlobalActionContext cntxt) {
        if (!AWTClipboardHelper.getInstance().isImageCopySupported()) {
            return super.canPaste(cntxt);
        }

        /* Check if the clipboard has data for the drawing surface */
        return AWTClipboardHelper.getInstance().hasCustomData();
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected ICommand getCopyCommand(final IGlobalActionContext cntxt,
            final IDiagramWorkbenchPart diagramPart, final boolean isUndoable) {
        if (cntxt.getSelection() instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) cntxt
                    .getSelection();
            if (canKsbaseCopy) {
                return getKsBaseCopyCommand(sel, diagramPart);
            }
        }

        if (!AWTClipboardHelper.getInstance().isImageCopySupported()) {
            return super.getCopyCommand(cntxt, diagramPart, isUndoable);
        }

        return new CopyImageCommand(cntxt.getLabel(), diagramPart.getDiagram(),
                getSelectedViews(cntxt.getSelection()), diagramPart
                        .getDiagramEditPart()) {

            @Override
            public boolean canUndo() {
                return isUndoable;
            }

            @Override
            public boolean canRedo() {
                return isUndoable;
            }

            @Override
            protected CommandResult doUndoWithResult(
                    final IProgressMonitor progressMonitor,
                    final IAdaptable info) throws ExecutionException {

                return isUndoable ? CommandResult.newOKCommandResult() : super
                        .doUndoWithResult(progressMonitor, info);
            }

            @Override
            protected CommandResult doRedoWithResult(
                    final IProgressMonitor progressMonitor,
                    final IAdaptable info) throws ExecutionException {

                return isUndoable ? CommandResult.newOKCommandResult() : super
                        .doRedoWithResult(progressMonitor, info);
            }

            @Override
            public void addContext(final IUndoContext context) {
                if (isUndoable) {
                    super.addContext(context);
                }
            }

            @Override
            public void removeContext(final IUndoContext context) {
                if (isUndoable) {
                    super.removeContext(context);
                }
            }
        };
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected ICommand getCutCommand(final IGlobalActionContext cntxt,
            final IDiagramWorkbenchPart diagramPart) {
        if (cntxt.getSelection() instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) cntxt
                    .getSelection();
            if (isValidSelection(sel)) {
                return getKsBaseCutCommand(sel, diagramPart);
            }
        }
        return super.getCutCommand(cntxt, diagramPart);
    }

    /**
     * Gets the KsBase cut command from the registered command factory.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the cut command
     */
    protected ICommand getKsBaseCutCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return getCommandFactory().buildCutCommand(part,
                getListFromSelection(sel));
    }

    /**
     * Gets the KsBase copy command from the registered command factory.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the copy command
     */
    protected ICommand getKsBaseCopyCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return getCommandFactory().buildCopyCommand(part,
                getListFromSelection(sel));
    }

    /**
     * Gets the KsBase paste command from the registered command factory.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the paste command
     */
    protected ICommand getKsbasePasteCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return getCommandFactory().buildPasteCommand(part,
                getListFromSelection(sel));
    }

    /**
     * Getter for the factory producing the commands.
     * 
     * @return the factory
     */
    protected abstract ICutCopyPasteCommandFactory getCommandFactory();

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public ICommand getCommand(final IGlobalActionContext cntxt) {
        if (cntxt.getActionId().equals(GlobalActionId.PASTE)) {
            if (canKsbasePaste) {
                ISelection sel = cntxt.getSelection();
                IWorkbenchPart part = cntxt.getActivePart();
                if (sel instanceof IStructuredSelection
                        && part instanceof IDiagramWorkbenchPart) {
                    IStructuredSelection selection = (IStructuredSelection) sel;
                    IDiagramWorkbenchPart diagPart = (IDiagramWorkbenchPart) part;

                    return getKsbasePasteCommand(selection, diagPart);
                }

            }
        }
        return super.getCommand(cntxt);
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected PasteViewRequest createPasteViewRequest() {
        if (!AWTClipboardHelper.getInstance().isImageCopySupported()) {
            return super.createPasteViewRequest();
        }

        CustomData data = AWTClipboardHelper.getInstance().getCustomData();

        return new PasteViewRequest(new ICustomData[] { data });
    }

    /**
     * Convert a selection to a list of EObjects.
     * 
     * @param selection
     *            the selection
     * @return the list
     */
    private List<EObject> getListFromSelection(
            final IStructuredSelection selection) {
        List<EObject> result = new LinkedList<EObject>();
        Iterator<?> iter = selection.iterator();

        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof EditPart) {
                EditPart editPart = (EditPart) o;

                EObject obj = ((View) editPart.getModel()).getElement();
                result.add(obj);
            }
        }
        return result;
    }

}
