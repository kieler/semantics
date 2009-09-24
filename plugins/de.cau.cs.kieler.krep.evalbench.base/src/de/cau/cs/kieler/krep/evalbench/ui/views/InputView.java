package de.cau.cs.kieler.krep.evalbench.ui.views;

import java.util.LinkedList;


import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.ui.actions.*;

/**
 * A View for displaying and changing the current inputs.
 * 
 * @author msp
 */
public class InputView extends ViewPart {

	/** The identifier string for this view */
	public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.input";

	/** Column identifiers for the embedded table */
	public final static String[] COLUMN_NAMES = { "signal", "present", "value" };
	
	/** Table viewer where inputs are listed */
	private TableViewer viewer;
	
	/** The reset action */
	private IAction resetAction;
	/** The step action */
	private IAction stepAction;
	/** The run action */
	private IAction runAction;
	/** The stop action */
	private IAction stopAction;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// create table
		Table table = new Table(parent, SWT.NONE);
		TableColumn column0 =  new TableColumn(table, SWT.NONE, 0);
		column0.setText("Signal");
		column0.setToolTipText("Signal name");
		column0.setWidth(150);
		TableColumn column1 =  new TableColumn(table, SWT.NONE, 1);
		column1.setText("P");
		column1.setToolTipText("Signal presence status");
		column1.setWidth(20);
		TableColumn column2 =  new TableColumn(table, SWT.NONE, 2);
		column2.setText("Value");
		column2.setToolTipText("Signal value");
		column2.setWidth(80);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		// create table viewer
		viewer = new TableViewer(table);
		viewer.setColumnProperties(COLUMN_NAMES);
		viewer.setContentProvider(new SignalContentProvider());
		viewer.setLabelProvider(new SignalLabelProvider(true));
		// create cell editors
		CellEditor[] editors = new CellEditor[3];
		editors[1] = new CheckboxCellEditor(table);
		editors[1].activate();
		editors[2] = new TextCellEditor(table);
		editors[2].activate();
		viewer.setCellEditors(editors);
		viewer.setCellModifier(new InputSignalModifier(viewer));

		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		IStatusLineManager statusLineManager = getViewSite().getActionBars().getStatusLineManager();
		// create reset action
		resetAction = new ResetAction(statusLineManager, null);
		toolBarManager.add(resetAction);
		resetAction.setEnabled(true);
		
		// create step action
		stepAction = new StepAction(statusLineManager);
		toolBarManager.add(stepAction);
		stepAction.setEnabled(true);
		
		// create run action
		runAction = new RunAction(statusLineManager, null);
		toolBarManager.add(runAction);
		runAction.setEnabled(false);
		
		// create stop action
		stopAction = new StopAction(statusLineManager);
		toolBarManager.add(stopAction);
		stopAction.setEnabled(false);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * Changes the input of the embedded table viewer to the given
	 * list of signals.
	 * 
	 * @param input the new input
	 */
	public void setInput(LinkedList<Signal> input) {
		viewer.setInput(input.toArray(new Signal[0]));
	}
	
	/**
	 * Enables or disables the control actions in this view.
	 * 
	 * @param enabled the new action state
	 */
	public void setActionsEnabled(boolean enabled) {
		resetAction.setEnabled(enabled);
		stepAction.setEnabled(enabled);
		runAction.setEnabled(false);
		stopAction.setEnabled(false);
	}
}
