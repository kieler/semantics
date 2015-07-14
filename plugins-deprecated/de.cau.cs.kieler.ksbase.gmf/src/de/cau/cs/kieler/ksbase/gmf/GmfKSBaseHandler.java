/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ksbase.gmf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.triggers.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.model.UnsupportedPartException;
import de.cau.cs.kieler.ksbase.ui.kivi.IKSBasEHandler;

/**
 * Implements the selection retrievel etc. for GMF editors.
 * 
 * @author uru
 */
public class GmfKSBaseHandler implements IKSBasEHandler {

    private DiagramDocumentEditor lastEditor = null;
    private EObject lastRootObject = null;

    public boolean canHandle(final IEvaluationContext context) {
        Object defaultVar = context.getDefaultVariable();
        if (defaultVar instanceof List) {
            if (!((List<?>) defaultVar).isEmpty()) {
                Object realvar = ((List<?>) defaultVar).get(0);
                IDiagramEditDomain domain = null;
                if (realvar instanceof DiagramEditPart) {
                    DiagramEditPart diagramPart = (DiagramEditPart) realvar;
                    domain = diagramPart.getDiagramEditDomain();
                } else if (realvar instanceof EditPart) {
                    EditPart part = (EditPart) realvar;
                    EditDomain editDomain = part.getRoot().getViewer().getEditDomain();
                    if (editDomain instanceof IDiagramEditDomain) {
                        domain = (IDiagramEditDomain) editDomain;
                    }
                }

                if (domain != null && domain instanceof DiagramEditDomain) {
                    return true;
                }
            }
        }

        return false;
    }

    public List<EObject> getSelection(final IEvaluationContext context) {
        List<EObject> selectionList = new ArrayList<EObject>();
        Object defaultVar = context.getDefaultVariable();

        if (defaultVar instanceof List) {
            if (!((List<?>) defaultVar).isEmpty()) {
                Object realvar = ((List<?>) defaultVar).get(0);
                IDiagramEditDomain domain = null;
                if (realvar instanceof DiagramEditPart) {
                    DiagramEditPart diagramPart = (DiagramEditPart) realvar;
                    domain = diagramPart.getDiagramEditDomain();
                } else if (realvar instanceof EditPart) {
                    EditPart part = (EditPart) realvar;
                    EditDomain editDomain = part.getRoot().getViewer().getEditDomain();
                    if (editDomain instanceof IDiagramEditDomain) {
                        domain = (IDiagramEditDomain) editDomain;
                    }
                }

                if (domain != null && domain instanceof DiagramEditDomain) {
                    IEditorPart editor = ((DiagramEditDomain) domain).getEditorPart();
                    final DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) editor;
                    // this.transDomain = diagramEditor.getEditingDomain();
                    lastEditor = diagramEditor;
                }
            }
            @SuppressWarnings("unchecked")
            List<EditPart> selectedParts =
                    lastEditor.getDiagramGraphicalViewer().getSelectedEditParts();
            EditPart root = lastEditor.getDiagramGraphicalViewer().getRootEditPart();
            IGraphicalEditPart groot = (IGraphicalEditPart) root.getChildren().get(0);
            EObject rootObject = groot.getNotationView().getElement();

            // get the current selection

            for (EditPart part : selectedParts) {
                if (part instanceof IGraphicalEditPart) {
                    IGraphicalEditPart gpart = (IGraphicalEditPart) part;
                    selectionList.add(gpart.getNotationView().getElement());
                }
            }
            // if the selection is empty assume the root object as selected
            if (selectionList.isEmpty()) {
                selectionList.add(rootObject);
            }
        }

        // } else {
        // // no Diagram EditDomain found -> still try to look for EObjects directly,
        // // maybe
        // // we have some structural EMF Editor like the tree editor (haf)
        // List<EObject> eObjects = new ArrayList<EObject>(((List<?>) defaultVar).size());
        // try {
        // for (Object o : (List<?>) defaultVar) {
        // eObjects.add((EObject) o);
        // }
        // return eObjects;
        // } catch (ClassCastException e) {
        // // ignore exception
        // }
        // }

        return selectionList;
    }

    public boolean canHandle(final IWorkbenchPart workbenchPart, final SelectionState selection) {

        if (workbenchPart instanceof DiagramDocumentEditor) {
            return true;
        } else {
            try {
                IGraphicalFrameworkBridge bridge =
                        GraphicalFrameworkService.getInstance().getBridge(
                                selection.getWorkbenchPart());
                if (bridge != null) {
                    return true;
                }
            } catch (UnsupportedPartException exception) {
                // nothing
            }
        }

        return false;
    }

    public List<EObject> getSelection(final IWorkbenchPart workbenchPart,
            final SelectionState selection) {

        List<EObject> selectionList = Lists.newLinkedList();

        if (workbenchPart instanceof DiagramDocumentEditor) {
            final DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) workbenchPart;
            lastEditor = (DiagramDocumentEditor) diagramEditor;
            // Its guaranteed to return a list, can't check for generics.
            @SuppressWarnings("unchecked")
            List<EditPart> selectedParts =
                    (List<EditPart>) diagramEditor.getDiagramGraphicalViewer()
                            .getSelectedEditParts();
            EditPart root = diagramEditor.getDiagramGraphicalViewer().getRootEditPart();
            IGraphicalEditPart groot = (IGraphicalEditPart) root.getChildren().get(0);
            lastRootObject = groot.getNotationView().getElement();
            // get the current selection
            for (EditPart part : selectedParts) {
                if (part instanceof IGraphicalEditPart) {
                    IGraphicalEditPart gpart = (IGraphicalEditPart) part;
                    selectionList.add(gpart.getNotationView().getElement());
                }
            }
            // if the selection is empty assume the root object as selected
            if (selectionList.isEmpty()) {
                selectionList.add(lastRootObject);
            }

        } else {
            IGraphicalFrameworkBridge bridge = null;
            try {
                bridge =
                        GraphicalFrameworkService.getInstance().getBridge(
                                selection.getWorkbenchPart());
            } catch (UnsupportedPartException exception) {
                // nothing
            }
            if (bridge != null) {
                for (Object o : selection.getSelection()) {
                    EObject element = bridge.getElement(o);
                    if (element != null) {
                        selectionList.add(element);
                    }
                }
            } else {
                // case 2: Selection still consists of EObjects, e.g. in EMF Tree Editor
                // Question: is this also true for Xtext?
                try {
                    for (Object o : selection.getSelection()) {
                        selectionList.add((EObject) o);
                    }
                } catch (ClassCastException e) {
                    // case 3: Selection consists of plain Java objects
                    e.printStackTrace();
                }

            }
        }

        return selectionList;
    }

    public void performPostProcessing() {
        if(lastEditor != null) {
            refreshEditPolicy(lastEditor);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void transformationExecuted(String transformationName, Object[] parameters,
            Object result, EObject select) {
        if (lastEditor != null) {
            CanonicalEditPolicy policy =
                    (CanonicalEditPolicy) lastEditor.getDiagramEditPart()
                            .getEditPolicy("Canonical");
            if (policy != null) {
                policy.refresh();
            }

            if (select != null) {
                if (!((parameters == null) || (parameters.length == 0))) {
                    EObject object = null;
                    if (parameters[0] instanceof List) {
                        List<?> firstParameter = (List<?>) parameters[0];
                        if (!firstParameter.isEmpty() && firstParameter.get(0) instanceof EObject) {
                            object = (EObject) firstParameter.get(0);
                            object = select;

                        }
                    } else if (parameters[0] instanceof EObject) {
                        object = (EObject) parameters[0];
                    }
                    if (object != null) {
                        object = select;
                        EditPart selectPart =
                                lastEditor.getDiagramEditPart().findEditPart(null, object);
                        if (selectPart == null) {
                            selectPart =
                                    lastEditor.getDiagramEditPart().findEditPart(null,
                                            object.eContainer());
                        }
                        if (selectPart != null) {
                            setSelection(lastEditor, selectPart);
                        }
                        select = null;

                    }
                }
            }
        }
    }

    /**
     * This method sets the current selection of the editor to the given part.
     * 
     * @param editor
     *            the editor whose selection to change
     * @param part
     *            the editpart that should be selected afterwards
     */
    public void setSelection(final IEditorPart editor, final EditPart part) {
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                try {
                    editor.getEditorSite().getSelectionProvider()
                            .setSelection(new StructuredSelection(part));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Method to refresh the CanonicalEditPolicy to show the changes done by a transformation.
     * 
     * @param diagramEditor
     *            the current diagram editor.
     */
    private void refreshEditPolicy(final DiagramDocumentEditor diagramEditor) {
        try {
            AbstractEffect refresh = new AbstractEffect() {
                public void execute() {
                    CanonicalEditPolicy policy =
                            (CanonicalEditPolicy) diagramEditor.getDiagramEditPart().getEditPolicy(
                                    "Canonical");
                    if (policy != null) {
                        policy.refresh();
                    }
                }
            };
            refresh.schedule();
        } catch (Exception e) {
            // doesn't matter if this fails, just pretend nothing happened.
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPerformLayout() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public EObject getLayoutRoot() {
        return lastRootObject;
    }

    /**
     * {@inheritDoc}
     */
    public TransactionalEditingDomain getEditingDomain() {
        if (lastEditor instanceof DiagramDocumentEditor) {
            final DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) lastEditor;
            return diagramEditor.getEditingDomain();
        }
        return null;
    }

}
