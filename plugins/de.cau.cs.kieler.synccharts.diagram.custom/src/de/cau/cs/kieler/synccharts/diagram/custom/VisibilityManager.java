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

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author soh
 */
public class VisibilityManager {

    /** Map containing all highlighting effects and highlighted edit parts. */
    private HashMap<IWorkbenchPart, HashMap<GraphicalEditPart, Boolean>> map;

    /** singleton instance. */
    private static VisibilityManager instance = new VisibilityManager();

    /** singleton pattern. */
    private VisibilityManager() {
        map = new HashMap<IWorkbenchPart, HashMap<GraphicalEditPart, Boolean>>();
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
    public static void hide(final IWorkbenchPart editor,
            final GraphicalEditPart editPart) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);
        if (parts == null) {
            parts = new HashMap<GraphicalEditPart, Boolean>();
            instance.map.put(editor, parts);
        }
        Boolean dummy = parts.remove(editPart);
        if (dummy == null) {
            parts.put(editPart, setVisible(editPart, false));
        }
    }

    /**
     * Reset all hiding effects on the given editor.
     * 
     * @param editor
     *            the editor
     */
    public static void reset(final IWorkbenchPart editor) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);

        if (parts != null) {
            Iterator<GraphicalEditPart> iter = parts.keySet().iterator();
            while (iter.hasNext()) {
                GraphicalEditPart part = iter.next();
                setVisible(part, true);
            }
            instance.map.remove(editor);
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
    public static void reset(final IWorkbenchPart editor,
            final GraphicalEditPart editPart) {
        HashMap<GraphicalEditPart, Boolean> parts = instance.map.get(editor);

        if (parts != null && parts.containsKey(editPart)) {
            parts.remove(editPart);
            setVisible(editPart, true);
        }
    }

    /**
     * Change the visibility of a given edit part.
     * 
     * @param editPart
     *            the part to change the visibility for
     * @param b
     *            true if the part should be visible
     * @return the visibility of the edit part
     */
    private static Boolean setVisible(GraphicalEditPart editPart, boolean b) {
        IFigure figure = editPart.getFigure();
        figure.setVisible(b);
        return b;
    }

}
