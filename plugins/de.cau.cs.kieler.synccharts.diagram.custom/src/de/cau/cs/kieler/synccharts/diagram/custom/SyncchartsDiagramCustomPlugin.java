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

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.synccharts.Transition;

/**
 * @author soh
 */
public class SyncchartsDiagramCustomPlugin extends AbstractUIPlugin implements
        ISelectionListener, IPageListener, IWindowListener {

    /** The current instance of the plugin. */
    public static SyncchartsDiagramCustomPlugin instance = null;

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
                    page.addSelectionListener(this);
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
            HighlightingManager.reset(part);

            IStructuredSelection selection = (IStructuredSelection) sel;
            Iterator<?> iter = selection.iterator();
            if (part instanceof IDiagramWorkbenchPart) {
                DiagramEditPart dep = ((IDiagramWorkbenchPart) part)
                        .getDiagramEditPart();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject obj = ((View) editPart.getModel()).getElement();
                        if (obj instanceof Transition) {
                            List<EditPart> parts = findEditParts(dep, obj);
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
     * Finds ALL edit parts connected to the given semantic element.
     * 
     * @param dep
     *            the root edit part
     * @param theElement
     *            the element to look for
     * @return the list of results, may be empty
     */
    @SuppressWarnings("unchecked")
    public static List<EditPart> findEditParts(final DiagramEditPart dep,
            final EObject theElement) {
        List<EditPart> result = new LinkedList<EditPart>();
        Collection<Object> editParts = dep.getViewer().getEditPartRegistry()
                .values();
        for (Object object : editParts) {
            if (object instanceof EditPart) {
                EditPart editPart = (EditPart) object;
                Object objModel = editPart.getModel();
                if (objModel instanceof View) {
                    EObject model = ((View) objModel).getElement();
                    if (model == theElement) {
                        result.add(editPart);
                    }
                }
            }
        }
        return result;
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
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageOpened(final IWorkbenchPage page) {
        if (page != null) {
            page.addSelectionListener(this);
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
                page.addSelectionListener(this);
            }
        }
    }
}
