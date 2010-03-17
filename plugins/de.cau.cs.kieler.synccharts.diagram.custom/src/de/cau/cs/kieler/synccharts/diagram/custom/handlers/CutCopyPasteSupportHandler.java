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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

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

import de.cau.cs.kieler.synccharts.diagram.custom.commands.CommandFactory;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;

/**
 * @author soh
 */
@SuppressWarnings("restriction")
public class CutCopyPasteSupportHandler extends DiagramGlobalActionHandler {

    /** buffered result of the last request for copy. */
    private boolean canKsbaseCopy;
    /** buffered result of the last request for paste. */
    private boolean canKsbasePaste;

    /**
     * Constructor for CopyWithImageSupportGlobalActionHandler.
     */
    public CutCopyPasteSupportHandler() {
        super();
    }

    /**
     * Checks whether the selection contains only valid parts.
     * 
     * @param selection
     *            the selection
     * @return true if only valid parts are in the selection
     */
    private boolean isValidSelection(final IStructuredSelection selection) {
        Iterator<?> iter = selection.iterator();

        while (iter.hasNext()) {
            Object object = iter.next();
            if (object instanceof EditPart) {
                EditPart editPart = (EditPart) object;
                if (editPart instanceof State2EditPart) {
                    continue;
                } else if (editPart instanceof StateEditPart) {
                    continue;
                } else if (editPart instanceof RegionEditPart) {
                    continue;
                } else if (editPart instanceof Region2EditPart) {
                    continue;
                } else if (editPart instanceof TransitionEditPart) {
                    continue;
                }
            }
            return false;
        }

        return true;
    }

    /**
     * @see org.eclipse.gmf.runtime.common.ui.action.AbstractGlobalActionHandler#canHandle(IGlobalActionContext)
     */
    @Override
    public boolean canHandle(IGlobalActionContext cntxt) {

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
     * 
     * @param sel
     *            the selection
     * @return true if the selection can be cut/copied
     */
    private boolean canKsbaseCopy(IStructuredSelection sel) {
        boolean result = true;

        canKsbaseCopy = result;
        return result;
    }

    /**
     * Determine whether the current selection can be used as a target for
     * pasting by Ksbase.
     * 
     * @param sel
     *            the selection
     * @return true if the selection can be used
     */
    private boolean canKsbasePaste(IStructuredSelection sel) {
        boolean result = true;

        canKsbasePaste = result;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler#canPaste(org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext)
     */
    @Override
    protected boolean canPaste(IGlobalActionContext cntxt) {
        if (!AWTClipboardHelper.getInstance().isImageCopySupported()) {
            return super.canPaste(cntxt);
        }

        /* Check if the clipboard has data for the drawing surface */
        return AWTClipboardHelper.getInstance().hasCustomData();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler#getCopyCommand(org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext,
     *      org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart,
     *      boolean)
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
                    IProgressMonitor progressMonitor, IAdaptable info)
                    throws ExecutionException {

                return isUndoable ? CommandResult.newOKCommandResult() : super
                        .doUndoWithResult(progressMonitor, info);
            }

            @Override
            protected CommandResult doRedoWithResult(
                    IProgressMonitor progressMonitor, IAdaptable info)
                    throws ExecutionException {

                return isUndoable ? CommandResult.newOKCommandResult() : super
                        .doRedoWithResult(progressMonitor, info);
            }

            @Override
            public void addContext(IUndoContext context) {
                if (isUndoable) {
                    super.addContext(context);
                }
            }

            @Override
            public void removeContext(IUndoContext context) {
                if (isUndoable) {
                    super.removeContext(context);
                }
            }
        };
    }

    /**
     * Getter for the cut command.
     * 
     * @param cntxt
     * @param diagramPart
     * @return
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
     * Getter for the Ksbase cut command.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the cut command
     */
    private ICommand getKsBaseCutCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return CommandFactory.buildCutCommand(part, getListFromSelection(sel));
    }

    /**
     * Getter for the Ksbase copy command.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the copy command
     */
    private ICommand getKsBaseCopyCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return CommandFactory.buildCopyCommand(part, getListFromSelection(sel));
    }

    /**
     * Getter for the Ksbase paste command.
     * 
     * @param sel
     *            the selection
     * @param part
     *            the editor
     * @return the paste command
     */
    private ICommand getKsbasePasteCommand(final IStructuredSelection sel,
            final IDiagramWorkbenchPart part) {
        return CommandFactory
                .buildPasteCommand(part, getListFromSelection(sel));
    }

    @Override
    public ICommand getCommand(IGlobalActionContext cntxt) {
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

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler#createPasteViewRequest()
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
    private List<Object> getListFromSelection(
            final IStructuredSelection selection) {
        List<Object> result = new LinkedList<Object>();
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
