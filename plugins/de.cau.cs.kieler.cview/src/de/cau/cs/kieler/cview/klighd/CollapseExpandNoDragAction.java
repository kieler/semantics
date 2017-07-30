/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.cview.klighd;

import java.util.HashSet;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchWindow;

import de.cau.cs.kieler.cview.AbstractKLighDController;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.IDiagramWorkbenchPart;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;

/**
 * Expand & collapse only if mouse was *not* dragged.
 * 
 * @author cmot
 * 
 */
public class CollapseExpandNoDragAction implements IAction {

    /** The action ID. */
    public static final String ID = "de.cau.cs.kieler.cview.CollapseExpandNoDragAction";

    // A tolerance of 5 pixels. If this is exceeded by either the X or the Y coordinate,
    // then the movement (while holding the mouse down) is considered a dragged-event.
    public final int TOLERANCE = 5;

    // -------------------------------------------------------------------------

    int xDown = 0;
    int yDown = 0;

    // The default is dragged == false => a first click might collapse/expand even
    // if dragged (like the typical KlighdConstants::ACTION_COLLAPSE_EXPAND action).
    boolean dragged = false;

    // Remember for which control/KLighD view we had added a mouse listener.
    HashSet<Control> collapseExpandNoDragMouseListenerAdded = new HashSet<Control>();

    // The controller that detects a possible dragged-event.
    MouseListener collapseExpandNoDragMouseListener = new MouseListener() {
        @Override
        public void mouseUp(MouseEvent e) {
            int xUp = e.x;
            int yUp = e.y;
            int diffX = Math.abs(xDown - xUp);
            int diffY = Math.abs(yDown - yUp);

            // If out of tolerance for the X or the Y coordinate
            // => consider this a dragging-event.
            if ((diffX > TOLERANCE) || (diffY > TOLERANCE)) {
                dragged = true;
            } else {
                dragged = false;
            }
        }

        @Override
        public void mouseDown(MouseEvent e) {
            // When mouse is down, then save the coordinates to later detect 
            // a possible drag-event.
            xDown = e.x;
            yDown = e.y;
        }

        @Override
        public void mouseDoubleClick(MouseEvent e) {
        }
    };

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        // First test if a mouse listener already exist for this control. Note that if the
        // KLighD view is closed & re-opened, a new control exist.
        Control control = context.getActiveViewer().getControl();
        if (!collapseExpandNoDragMouseListenerAdded.contains(control)) {
            control.addMouseListener(collapseExpandNoDragMouseListener);
            collapseExpandNoDragMouseListenerAdded.add(control);
        }

        // Do this only (collapse/expand + layout) if no dragged-event has occurred right before
        // Because we only have ONE mouse, it's OK to do it like that and refer to the latest
        // status of the dragged variable.
        if (!dragged) {
            context.getActiveViewer().toggleExpansion(context.getKNode());
            IDiagramWorkbenchPart diagramWorkbenchPart = context.getViewContext().getDiagramWorkbenchPart();
            new LightDiagramLayoutConfig(diagramWorkbenchPart).performLayout();
        }

        return ActionResult.createResult(false);
    }

    // -------------------------------------------------------------------------
}
