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
package de.cau.cs.kieler.synccharts.diagram.custom;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.model.util.ValidationManager;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.model.util.ValidationManager.IValidateActionFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.triggerlisteners.RedundantLabelTriggerListener;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.ValidateAction;

/**
 * The main plugin class.
 * 
 * @author soh
 */
public class SyncchartsDiagramCustomPlugin extends AbstractUIPlugin implements
        ISelectionListener, IPageListener, IWindowListener, IPartListener {

    /** The current instance of the plugin. */
    public static SyncchartsDiagramCustomPlugin instance = null;

    private static void registerValidateAction(final IWorkbenchPage page) {
        ValidationManager.registerValidateAction(SyncchartsPackage.eINSTANCE,
                new IValidateActionFactory() {

                    public Action getValidateAction() {
                        return new ValidateAction(page);
                    }
                });
    }

    /**
     * Register the listener.
     */
    public void register() {
        IWorkbench bench = getWorkbench();
        if (bench != null) {
            bench.addWindowListener(this);
            IWorkbenchWindow window = bench.getActiveWorkbenchWindow();
            if (window != null) {
                window.addPageListener(this);
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    registerValidateAction(page);
                    RedundantLabelTriggerListener.hideRedundantLabels();
                    page.addSelectionListener(this);
                    page.addPartListener(this);
                }
            }
        }
    }

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        instance = this;
        register();
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IWorkbenchPart part, final ISelection sel) {
        if (sel instanceof IStructuredSelection) {
            IStructuredSelection selection = (IStructuredSelection) sel;
            Iterator<?> iter = selection.iterator();
            if (part instanceof IDiagramWorkbenchPart) {
                HighlightingManager.reset(part);
                IDiagramWorkbenchPart dwp = (IDiagramWorkbenchPart) part;
                DiagramEditPart dep = dwp.getDiagramEditPart();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject obj = ((View) editPart.getModel()).getElement();
                        if (obj instanceof Transition) {
                            List<EditPart> parts = ModelingUtil.getEditParts(
                                    dep, obj);
                            for (EditPart transEditPart : parts) {
                                HighlightingManager.highlight(part,
                                        transEditPart, ColorConstants.blue,
                                        ColorConstants.white);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageActivated(final IWorkbenchPage page) {
    }

    /**
     * {@inheritDoc}
     */
    public void pageClosed(final IWorkbenchPage page) {
        if (page != null) {
            page.removeSelectionListener(this);
            page.removePartListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageOpened(final IWorkbenchPage page) {
        if (page != null) {
            registerValidateAction(page);
            RedundantLabelTriggerListener.hideRedundantLabels();
            page.addSelectionListener(this);
            page.addPartListener(this);
        }
    }

    /**
     * Getter for the active editor part.
     * 
     * @return the editor part or null
     */
    public IEditorPart getActiveEditorPart() {
        IEditorPart result = null;
        IWorkbench workbench = getWorkbench();
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    result = page.getActiveEditor();
                }
            }
        }
        return result;
    }

    /**
     * Getter for the list of opened synccharts editors.
     * 
     * @return the list of open synccharts editors.
     */
    public List<SyncchartsDiagramEditor> getOpenSyncchartsEditors() {
        List<SyncchartsDiagramEditor> result = new LinkedList<SyncchartsDiagramEditor>();
        IWorkbench workbench = getWorkbench();
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    IEditorReference[] refs = page.getEditorReferences();
                    for (IEditorReference ref : refs) {
                        IEditorPart part = ref.getEditor(false);
                        if (part != null
                                && part instanceof SyncchartsDiagramEditor) {
                            result.add((SyncchartsDiagramEditor) part);
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * Getter for the display of the active workbench.
     * 
     * @return the display
     */
    public Display getDisplay() {
        return getWorkbench().getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    public void windowActivated(final IWorkbenchWindow window) {
        if (window != null) {
            window.addPageListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowClosed(final IWorkbenchWindow window) {
        if (window != null) {
            window.removePageListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowDeactivated(final IWorkbenchWindow window) {

    }

    /**
     * {@inheritDoc}
     */
    public void windowOpened(final IWorkbenchWindow window) {
        if (window != null) {
            window.addPageListener(this);
            IWorkbenchPage page = window.getActivePage();
            if (page != null) {
                registerValidateAction(page);
                RedundantLabelTriggerListener.hideRedundantLabels();
                page.addSelectionListener(this);
                page.addPartListener(this);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        RedundantLabelTriggerListener.hideRedundantLabels();
    }
}
