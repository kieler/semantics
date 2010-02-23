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
package de.cau.cs.kieler.core.ui.policies;

import java.util.Map;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.widgets.Event;

/**
 * MouseListener for listening to clicks on the custom popup balloons.
 * 
 * @author soh
 * @kieler.rating 2009-02-23 proposed yellow
 */
public class BalloonMouseListener implements DragTracker {

    /**
     * The contribution item to notify on click.
     */
    private IBalloonContribution contribution;

    /**
     * 
     * Creates a new BalloonMouseListener.
     * 
     * @param item
     *            the contribution item
     */
    public BalloonMouseListener(final IBalloonContribution item) {
        this.contribution = item;
    }

    /**
     * {@inheritDoc}
     */
    public void commitDrag() {
    }

    /**
     * {@inheritDoc}
     */
    public void activate() {
    }

    /**
     * {@inheritDoc}
     */
    public void deactivate() {
    }

    /**
     * {@inheritDoc}
     */
    public void focusGained(final FocusEvent event, final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void focusLost(final FocusEvent event, final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void keyDown(final KeyEvent keyEvent, final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void keyTraversed(final TraverseEvent event,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void keyUp(final KeyEvent keyEvent, final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseDoubleClick(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseDown(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
        contribution.run();
    }

    /**
     * {@inheritDoc}
     */
    public void mouseDrag(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseHover(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseMove(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseUp(final MouseEvent mouseEvent, final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void mouseWheelScrolled(final Event event,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void nativeDragFinished(final DragSourceEvent event,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void nativeDragStarted(final DragSourceEvent event,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void setEditDomain(final EditDomain domain) {
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public void setProperties(final Map properties) {
    }

    /**
     * {@inheritDoc}
     */
    public void setViewer(final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void viewerEntered(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    public void viewerExited(final MouseEvent mouseEvent,
            final EditPartViewer viewer) {
    }

}
