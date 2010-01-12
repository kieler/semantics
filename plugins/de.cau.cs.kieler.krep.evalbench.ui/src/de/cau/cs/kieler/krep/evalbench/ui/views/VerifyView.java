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
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.ui.actions.VerifyAction;

/**
 * A View for displaying a trace file.
 * 
 * @author ctr
 */
public class VerifyView extends ViewPart {

    /** The identifier string for this view. */
    public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.verify";

    /** Column identifiers for the embedded table. */
    public static final String[] COLUMN_NAMES = { "module", "status", "reaction time", "wcrt", "ticks", "remark" };

    private static final int[] COLUMN_WIDTH = { 150, 50, 100, 50, 50, 250 };
    
    /** Table viewer where inputs are listed. */
    private TableViewer viewer = null;
    private Table table = null;

    /** The reset action. */
    private IAction verifyAction = null;

    @Override
    public void createPartControl(final Composite parent) {
        // create table
        table = new Table(parent, SWT.NONE);
        for(int i=0; i< COLUMN_NAMES.length; i++){
            TableColumn column = new TableColumn(table, SWT.NONE, i);
            column.setText(COLUMN_NAMES[i]);
            column.setWidth(COLUMN_WIDTH[i]);
        }
 
        table.setLinesVisible(true);
        table.setHeaderVisible(true);

        // create table viewer
        viewer = new TableViewer(table);
        viewer.setColumnProperties(COLUMN_NAMES);
        viewer.setContentProvider(new TraceContentProvider());
        viewer.setLabelProvider(new VerifyLabelProvider());

        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        IStatusLineManager statusLineManager = getViewSite().getActionBars().getStatusLineManager();
        // create reset action
        verifyAction = new VerifyAction(statusLineManager, viewer);
        toolBarManager.add(verifyAction);
        verifyAction.setEnabled(true);
     
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * Enables or disables the control actions in this view.
     * 
     * @param enabled
     *            the new action state
     */
    public void setActionsEnabled(final boolean enabled) {
        verifyAction.setEnabled(enabled);
    }
}
