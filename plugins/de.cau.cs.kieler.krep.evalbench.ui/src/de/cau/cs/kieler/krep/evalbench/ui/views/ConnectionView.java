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
package de.cau.cs.kieler.krep.evalbench.ui.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.core.ui.views.TextViewer;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationListener;
import de.cau.cs.kieler.krep.evalbench.ui.actions.ClearAction;
import de.cau.cs.kieler.krep.evalbench.ui.actions.EnableAction;

/**
 * A view for logging of connection messages to targets. This includes the information on the
 * current target.
 * 
 * @author msp, ctr
 * 
 * @kieler.rating 2010-03-09 yellow 
 *   review by msp, soh
 *   
 */
public class ConnectionView extends ViewPart implements ICommunicationListener {

    /** The identifier string for this view. */
    public static final String ID = "de.cau.cs.kieler.krep.evalbench.ui.views.connection";

    /** The viewer used to display connection logs. */
    private TextViewer viewer = null;

    private Display display;

    private boolean enabled;

    @Override
    public void createPartControl(final Composite parent) {
        // create text viewer
        viewer = new TextViewer(parent);

        display = Display.getDefault();

        // create actions
        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        toolBarManager.add(new ClearAction(viewer));
        getViewSite().getActionBars().getMenuManager().add(new EnableAction(this));
        enabled = true;
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * {@inheritDoc}
     */
    public void dataReceived(final String data) {
        if (enabled && viewer != null && display != null) {
            display.asyncExec(new Runnable() {
                public void run() {
                    viewer.append("< " + data + "\n");
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void dataSent(final String data) {
        if (enabled && viewer != null && display != null) {
            display.asyncExec(new Runnable() {
                public void run() {
                    viewer.append("> " + data + "\n");
                }
            });
        }
    }

    /**
     * Gets the text viewer.
     * 
     * @return text viewer
     */
    public TextViewer getViewer() {
        return viewer;
    }

    /**
     * Display the given message in the connection view if the view is open.
     * 
     * @param msg
     *            message to display in the connection view
     * @return true if the message was displayed
     */
    public static boolean log(final String msg) {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

        if (window == null) {
            return false;
        }
        IViewPart connectionView = window.getActivePage().findView(ConnectionView.ID);
        if (connectionView == null) {
            return false;
        }

        ((ConnectionView) connectionView).comment(msg);
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void comment(final String comment) {
        if (enabled && viewer != null && display != null) {
            display.asyncExec(new Runnable() {
                public void run() {
                    viewer.append(comment + "\n");
                }
            });
        }
    }

    /**
     * Enable logging of the connection.
     */
    public void enable() {
        enabled = true;
        viewer.setEnabled(true);
    }

    /**
     * Disable logging of the connection.
     */
    public void disable() {
        enabled = false;
        viewer.setEnabled(false);
    }

}
