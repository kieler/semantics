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

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.ui.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationListener;
import de.cau.cs.kieler.krep.evalbench.ui.ConnectionPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.actions.CheckConnectionAction;
import de.cau.cs.kieler.krep.evalbench.ui.actions.ConnectAction;
import de.cau.cs.kieler.krep.evalbench.ui.actions.DisconnectAction;
/**
 * A View for logging of connection messages to targets.
 * 
 * @author msp, ctr
 */
public class ConnectionView extends ViewPart implements ICommunicationListener {

    /** The identifier string for this view. */
    public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.connection";

    /** The viewer used to display connection logs. */
    private TextViewer viewer = null;

    /** The load program action. */
    private IAction loadProgramAction = null;

    private IPreferenceStore preferenceStore = null;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        // create text viewer
        viewer = new TextViewer(parent);

        // create actions
        //IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        //toolBarManager.add(new ConnectAction());
        //toolBarManager.add(new DisconnectAction());
        //toolBarManager.add(new CheckConnectionAction());
        //loadProgramAction = new LoadProgramAction();
        //toolBarManager.add(loadProgramAction);
        // toolBarManager.add(new DumpRomAction());
        // loadProgramAction.setEnabled(false);

        
        preferenceStore = Activator.getDefault().getPreferenceStore();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * {@inheritDoc}
     */
    public void dataReceived(final String data) {
        if (preferenceStore.getBoolean(ConnectionPreferencePage.LOG)) {
            viewer.append("< " + data + "\n");
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void dataSent(final String data) {

        if (preferenceStore.getBoolean(ConnectionPreferencePage.LOG)) {
            viewer.append("> " + data + "\n");
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
     * Enables or disables the program specific actions in this view.
     * 
     * @param enabled
     *            the new state
     */
    public void setActionsEnabled(final boolean enabled) {
        loadProgramAction.setEnabled(true);
        // loadProgramAction.setEnabled(enabled);
    }

    /**
     * @param msg
     * @return
     */
    public static boolean log(final String msg) {

        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

        if (window == null) {
            return false;
        }
        IViewPart connectionView = window.getActivePage().findView(ConnectionView.VIEW_ID);
        if (connectionView == null) {
            return false;
        }
        ((ConnectionView) connectionView).getViewer().append(msg + "\n");
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void comment(final String comment) {
        log(comment);

    }

}
