/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui.util;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Scrollable;

/**
 * Adds drag and drop scrolling functionality to a given scrollable. That is,
 * the user can then not only use the scroll bars to scroll, but can click
 * anywhere in the control and drag the mouse to scroll. The control's cursor
 * is optionally set to the hand cursor.
 * 
 * <p>
 * This class assumes that dragging the mouse by 1 pixel would result in
 * changeing the scroll bar value by 1. When dragging occurs, the values of
 * the scroll bar(s) is/are modified and a custom Selection event sent to their
 * selection listeners.
 * 
 * @author cds
 */
public class DragDropScrollHandler implements MouseListener, MouseMoveListener {
    /**
     * The scrollable to be managed.
     */
    private Scrollable control = null;
    
    /**
     * The control's horizontal scroll bar.
     */
    private ScrollBar horizontalBar = null;
    
    /**
     * The control's vertical scroll bar.
     */
    private ScrollBar verticalBar = null;
    
    /**
     * Whether there's dragging going on at the moment.
     */
    private boolean dragging = false;
    
    /**
     * Point where the user started pressing down the left mouse button.
     */
    private Point origin = new Point();
    
    /**
     * The original scroll bar values when the dragging began.
     */
    private Point barValues = new Point();
    
    
    /**
     * Constructs a new instance manageing the given control and sets the
     * control's cursor to the hand cursor.
     * 
     * @param control the control to manage. Must have at least one of the two
     *                styles, {@code H_SCROLL} or {@code V_SCROLL}, set.
     */
    public DragDropScrollHandler(final Scrollable control) {
        this(control, true);
    }
    
    /**
     * Constructs a new instance manageing the given control, optionally setting
     * the control's cursor to the hand cursor.
     * 
     * @param control the control to manage. Must have at least one of the two
     *                styles, {@code H_SCROLL} or {@code V_SCROLL}, set.
     * @param setCursor {@code true} if the control's cursor should be set to the
     *                  hand cursor.
     */
    public DragDropScrollHandler(final Scrollable control, final boolean setCursor) {
        int style = control.getStyle();
        if ((style & (SWT.H_SCROLL | SWT.V_SCROLL)) == 0) {
            throw new IllegalArgumentException("control must have the H_SCROLL or V_SCROLL style.");
        }
        
        this.control = control;
        this.control.addMouseListener(this);
        this.control.addMouseMoveListener(this);
        
        horizontalBar = control.getHorizontalBar();
        verticalBar = control.getVerticalBar();
        
        if (setCursor) {
            control.setCursor(control.getDisplay().getSystemCursor(SWT.CURSOR_HAND));
        }
    }
    

    /**
     * {@inheritDoc}
     */
    public void mouseMove(final MouseEvent e) {
        if (dragging) {
            Point mouseLocation = new Point(e.x, e.y);
            int value;

            // This is the event we'll send to selection listeners
            Event event = new Event();
            event.widget = horizontalBar;
            
            // Horizontal scrolling
            if (horizontalBar != null) {
                value = barValues.x + origin.x - mouseLocation.x;
                horizontalBar.setSelection(
                        Math.max(
                                horizontalBar.getMinimum(),
                                Math.min(
                                        horizontalBar.getMaximum(),
                                        value)));
                horizontalBar.notifyListeners(SWT.Selection, event);
            }
            
            // Vertical scrolling
            if (verticalBar != null) {
                value = barValues.y + origin.y - mouseLocation.y;
                verticalBar.setSelection(
                        Math.max(
                                verticalBar.getMinimum(),
                                Math.min(
                                        verticalBar.getMaximum(),
                                        value)));
                verticalBar.notifyListeners(SWT.Selection, event);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void mouseDown(final MouseEvent e) {
        // We're only interested in the left mouse button
        if (e.button != 1) {
            return;
        }
        
        // Save the origin of the mouse move as well as the original positions of
        // the scroll bars
        origin.x = e.x;
        origin.y = e.y;
        barValues.x = horizontalBar != null ? horizontalBar.getSelection() : 0;
        barValues.y = verticalBar != null ? verticalBar.getSelection() : 0;
        dragging = true;
    }

    /**
     * {@inheritDoc}
     */
    public void mouseUp(final MouseEvent e) {
        dragging = false;
    }

    /**
     * {@inheritDoc}
     */
    public void mouseDoubleClick(final MouseEvent e) {
        /* Walter: OVER THE LINE!
         * Smokey: Huh?
         * Walter: I'm sorry, Smokey. You were over the line, that's a foul.
         * Smokey: Bullshit. Mark it 8, Dude.
         * Walter: Uh, excuse me. Mark it zero. Next frame.
         * Smokey: Bullshit, Walter. Mark it 8, Dude.
         * Walter: Smokey, this is not 'Nam. This is bowling. There are rules.
         * 
         * - The Big Lebowski
         */
    }
}
