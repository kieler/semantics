package de.cau.cs.kieler.krep.evalbench.ui.views;

import java.util.LinkedList;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.*;

/**
 * A View for displaying output values.
 * 
 * @author msp
 */
public class OutputView extends ViewPart implements ISignalListener {

	/** The identifier string for this view */
	public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.output";

	/** Column identifiers for the embedded table */
	private final static String[] COLUMN_NAMES = { "signal", "present", "value" };
	
	/** The viewer used to display output values */
	private TableViewer viewer = null;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		//IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		//toolBarManager.add(new ContributionItem());
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
		viewer.setLabelProvider(new SignalLabelProvider(false));
		// register output view
		Activator.commonLayer.addSignalListener(this);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		Activator.commonLayer.removeSignalListener(this);
		super.dispose();
	}

	/*
	 * (non-Javadoc)
	 * @see krep.evalbench.comm.ISignalListener#tickPerformed(krep.evalbench.comm.Signal[], krep.evalbench.comm.Signal[])
	 */
	public void tickPerformed(LinkedList<Signal> inputs, LinkedList<Signal> outputs) {
		// input signals are ignored
		viewer.setInput(outputs.toArray(new Signal[0]));
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

}
