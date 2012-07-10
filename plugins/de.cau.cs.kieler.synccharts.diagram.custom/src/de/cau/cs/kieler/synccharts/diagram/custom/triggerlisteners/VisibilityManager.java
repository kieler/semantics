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
package de.cau.cs.kieler.synccharts.diagram.custom.triggerlisteners;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This class is responsible for hiding and showing transition priority and
 * region id labels.
 * 
 * @author soh
 */
public final class VisibilityManager {

    /** Map containing all highlighting effects and highlighted edit parts. */
    private final HashMap<IWorkbenchPart, HashMap<GraphicalEditPart, Boolean>> map =
            new HashMap<IWorkbenchPart, HashMap<GraphicalEditPart, Boolean>>();

    /** singleton instance. */
    private static VisibilityManager instance = new VisibilityManager();

    /** singleton pattern. */
    private VisibilityManager() {
    }
    
    /**
     * Checks if the visibility manager was used to hide the given edit part of the given editor.
     * 
     * @param editor the editor containing the given edit part.
     * @param editPart the edit part to check for.
     * @return {@code true} if the edit part was hidden through the visibility manager.
     */
    public static boolean hasHidden(final IDiagramWorkbenchPart editor,
            final GraphicalEditPart editPart) {
        
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);
        
        return parts != null && parts.containsKey(editPart);
    }

    /**
     * Hide an edit part.
     * 
     * The hiding can be reset by calling the reset methods.
     * 
     * @param editor
     *            the editor
     * @param editPart
     *            the edit part
     */
    public static void hide(final IDiagramWorkbenchPart editor,
            final GraphicalEditPart editPart) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);
        TransactionalEditingDomain domain = editor.getDiagramEditPart()
                .getEditingDomain();
        if (parts == null) {
            parts = new HashMap<GraphicalEditPart, Boolean>();
            instance.map.put(editor, parts);
        }
        parts.remove(editPart);

        parts.put(editPart, setVisible(editPart, false, domain));
    }

    /**
     * Reset all hiding effects on the given editor.
     * 
     * @param editor
     *            the editor
     */
    public static void reset(final IDiagramWorkbenchPart editor) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.remove(editor);
        TransactionalEditingDomain domain = editor.getDiagramEditPart()
                .getEditingDomain();

        if (parts != null) {
            Iterator<GraphicalEditPart> iter = parts.keySet().iterator();
            while (iter.hasNext()) {
                GraphicalEditPart part = iter.next();
                setVisible(part, true, domain);
            }
        }
    }

    /**
     * Reset the hiding on the given edit part.
     * 
     * @param editor
     *            the editor
     * @param editPart
     *            the edit part
     */
    public static void reset(final IDiagramWorkbenchPart editor,
            final GraphicalEditPart editPart) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);
        TransactionalEditingDomain domain = editor.getDiagramEditPart()
                .getEditingDomain();

        if (parts != null && parts.containsKey(editPart)) {
            parts.remove(editPart);
            setVisible(editPart, true, domain);
        }
    }

    /**
     * Change the visibility of a given edit part.
     * 
     * @param editPart
     *            the part to change the visibility for
     * @param b
     *            true if the part should be visible
     * @param domain
     *            the editing domain
     * @return the visibility of the edit part
     */
    private static Boolean setVisible(final GraphicalEditPart editPart,
            final boolean b, final TransactionalEditingDomain domain) {
        try {
            AbstractEMFOperation op = new AbstractEMFOperation(domain,
                    "Redundant Label Cleanup") {

                @Override
                protected IStatus doExecute(final IProgressMonitor monitor,
                        final IAdaptable info) throws ExecutionException {
                    View view = (View) editPart.getModel();

                    ViewUtil.setStructuralFeatureValue(view,
                            (EStructuralFeature) PackageUtil
                                    .getElement("notation.View.visible"), b);
                    return Status.OK_STATUS;
                }
            };
            op.execute(null, null);
        } catch (ExecutionException e0) {
            e0.printStackTrace();
        }
        return b;
    }
}
