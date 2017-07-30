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

import de.cau.cs.kieler.cview.AbstractKLighDController;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig;
import de.cau.cs.kieler.klighd.piccolo.internal.util.MathUtil;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;


/**
 * Expand & collapse only if mouse was not dragged.
 * 
 * @author cmot
 * 
 */
public class CollapseExpandNoDragAction implements IAction {

    /** The action ID. */
    public static final String ID =
            "de.cau.cs.kieler.cview.CollapseExpandNoDragAction";

    public final int TOLERANCE = 5;

    // -------------------------------------------------------------------------
    
    int xDown = 0;
    int yDown = 0;
    boolean dragged = true;
    
    // Remember for which controller we had added a mouse listener
    HashSet<Control> collapseExpandNoDragMouseListenerAdded = new HashSet<Control>();
    
    MouseListener collapseExpandNoDragMouseListener = new MouseListener() {
        @Override
        public void mouseUp(MouseEvent e) {
            int xUp = e.x;
            int yUp = e.y;
            int diffX = Math.abs(xDown - xUp);
            int diffY = Math.abs(yDown - yUp);
            
            if ((diffX > TOLERANCE) || (diffY > TOLERANCE)) {
                dragged = true;
            } else {
                dragged = false;
            }
        }
        @Override
        public void mouseDown(MouseEvent e) {
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
        Control control = context.getActiveViewer().getControl();
        if (!collapseExpandNoDragMouseListenerAdded.contains(control)) {
            control.addMouseListener(collapseExpandNoDragMouseListener);
            collapseExpandNoDragMouseListenerAdded.add(control);
        }
        
        if (!dragged) {
            context.getActiveViewer().toggleExpansion(context.getKNode());
            DiagramViewPart view = DiagramViewManager.getView(AbstractKLighDController.CVIEW_KLIGHD_ID);
            new LightDiagramLayoutConfig(view).performLayout();
        }
        
        return ActionResult.createResult(false);
    }
    
    // -------------------------------------------------------------------------
}
