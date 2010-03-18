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

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionTriggersAndEffectsEditPart;
import de.cau.cs.kieler.viewmanagement.effects.ShapeHighlightEffect;

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
            resetHighlightedParts();

            IStructuredSelection selection = (IStructuredSelection) sel;
            Iterator<?> iter = selection.iterator();

            while (iter.hasNext()) {
                Object o = iter.next();
                if (o instanceof EditPart) {
                    EditPart editPart = (EditPart) o;
                    if (editPart instanceof TransitionTriggersAndEffectsEditPart
                            || editPart instanceof TransitionPriorityEditPart) {
                        EObject obj = ((View) editPart.getModel()).getElement();
                        editPart = ModelingUtil.getEditPart(obj);
                    }
                    if (editPart instanceof TransitionEditPart) {
                        ShapeHighlightEffect effect = new ShapeHighlightEffect();
                        effect.setTarget(editPart);
                        effect.setColors(ColorConstants.blue, null);
                        effect.execute();
                        highlightedParts.add(editPart);
                    }
                }
            }
        }
    }

    /**
     * 
     */
    private void resetHighlightedParts() {
        if (highlightedParts != null) {
            for (EditPart part : highlightedParts) {
                ShapeHighlightEffect effect = new ShapeHighlightEffect();
                effect.setTarget(part);
                effect.setColors(ColorConstants.black, null);
                try {
                    effect.execute();
                } catch (NullPointerException e0) {
                    // in case the edit part is no longer there
                }
            }
        }
        highlightedParts = new LinkedList<EditPart>();
    }

    /** List of currently highlighted parts. */
    private List<EditPart> highlightedParts;

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
