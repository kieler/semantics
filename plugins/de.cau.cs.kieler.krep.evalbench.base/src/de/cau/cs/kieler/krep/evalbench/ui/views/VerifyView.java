/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
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

import de.cau.cs.kieler.krep.evalbench.ui.actions.*;

/**
 * A View for displaying a trace file
 * 
 * @author ctr
 */
public class VerifyView extends ViewPart {

	/** The identifier string for this view */
	public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.verify";

	/** Column identifiers for the embedded table */
	public final static String[] COLUMN_NAMES = { "file", "status", "wcrt",
			"remark" };

	/** Table viewer where inputs are listed */
	private TableViewer viewer = null;
	private Table table = null;

	/** The reset action */
	private IAction verifyAction = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// create table
		table = new Table(parent, SWT.NONE);
		TableColumn column1 = new TableColumn(table, SWT.NONE, 0);
		column1.setText("file");
		column1.setToolTipText("Tested Benchmark");
		column1.setWidth(150);

		TableColumn column2 = new TableColumn(table, SWT.NONE, 1);
		column2.setText("status");
		column2.setToolTipText("Is trace valid?");
		column2.setWidth(50);

		TableColumn column3 = new TableColumn(table, SWT.NONE, 2);
		column3.setText("WCRT");
		column3.setToolTipText("Worst case reaction time");
		column3.setWidth(150);

		TableColumn column4 = new TableColumn(table, SWT.NONE, 3);
		column4.setText("remark");
		column4.setToolTipText("Why did it fail?");
		column4.setWidth(250);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		// create table viewer
		viewer = new TableViewer(table);
		viewer.setColumnProperties(COLUMN_NAMES);
		viewer.setContentProvider(new TraceContentProvider());
		viewer.setLabelProvider(new VerifyLabelProvider());

		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();
		IStatusLineManager statusLineManager = getViewSite().getActionBars()
				.getStatusLineManager();
		// create reset action
		verifyAction = new VerifyAction(statusLineManager, viewer);
		toolBarManager.add(verifyAction);
		verifyAction.setEnabled(true);
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
	 * Enables or disables the control actions in this view.
	 * 
	 * @param enabled
	 *            the new action state
	 */
	public void setActionsEnabled(boolean enabled) {
		verifyAction.setEnabled(enabled);
	}
}
