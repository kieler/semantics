/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui.views;

import java.util.LinkedList;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.ISignalListener;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;

/**
 * A View for displaying output values.
 * 
 * @author msp
 */
public class OutputView extends ViewPart implements ISignalListener {

    /** The identifier string for this view. */
    public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.output";

    /** Column identifiers for the embedded table. */
    private static final String[] COLUMN_NAMES = { "signal", "present", "value" };

    /** The viewer used to display output values. */
    private TableViewer viewer = null;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        // IToolBarManager toolBarManager =
        // getViewSite().getActionBars().getToolBarManager();
        // toolBarManager.add(new ContributionItem());
        // create table
        Table table = new Table(parent, SWT.NONE);
        TableColumn column0 = new TableColumn(table, SWT.NONE, 0);
        column0.setText("Signal");
        column0.setToolTipText("Signal name");
        column0.setWidth(150);
        TableColumn column1 = new TableColumn(table, SWT.NONE, 1);
        column1.setText("P");
        column1.setToolTipText("Signal presence status");
        column1.setWidth(20);
        TableColumn column2 = new TableColumn(table, SWT.NONE, 2);
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
        Activator.getDefault().commonLayer.addSignalListener(this);
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

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#dispose()
     */
    @Override
    public void dispose() {
        Activator.getDefault().commonLayer.removeSignalListener(this);
        super.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * krep.evalbench.comm.ISignalListener#tickPerformed(krep.evalbench.comm
     * .Signal[], krep.evalbench.comm.Signal[])
     */
    public void tickPerformed(final LinkedList<Signal> inputs,
            final LinkedList<Signal> outputs) {
        // input signals are ignored
        viewer.setInput(outputs.toArray(new Signal[1]));
    }

    /**
     * Changes the input of the embedded table viewer to the given list of
     * signals.
     * 
     * @param input
     *            the new input
     */
    public void setInput(final LinkedList<Signal> input) {
        viewer.setInput(input.toArray(new Signal[1]));
    }

}
