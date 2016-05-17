/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.ui.views;

import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.comparison.core.Comparison;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;
import de.cau.cs.kieler.comparison.exchange.GeneralComparisonMeasurement;
import de.cau.cs.kieler.comparison.exchange.Testbench;

/**
 * The ComparisonDataView is a view used to display the measuring results gathered by a compiler
 * comparison. This view uses the {@link DataHandler} class to load measuring results. This view can
 * also be used to initiate a comparison done by the {@link Comparison} class by using the
 * {@link StartComparisonDialog}.
 * 
 * @author nfl
 */
public class ComparisonDataView extends ViewPart implements Observer {

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "de.cau.cs.kieler.comparison.ui.views.DataView";

    /**
     * The viewer.
     */
    private TableViewer viewer;

    /**
     * The action to load a set of measurings.
     */
    private Action loadFile;

    /**
     * The action to initiate a comparison.
     */
    private Action start;

    /**
     * The constructor.
     */
    public ComparisonDataView() {
    }

    /**
     * The titles of the columns in the table.
     */
    static final String[] TITLES = { "Criteria", "Compiler", "Testcase", "Results" };

    /**
     * The initial width of each column in the table.
     */
    static final int[] WIDTH = { 200, 150, 350, 200 };

    /**
     * The measurings can be sorted by a specified column.
     */
    private int sortBy = -1;

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

        for (int i = 0; i < 4; i++) {
            TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
            column.getColumn().setText(TITLES[i]);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            column.getColumn().setWidth(WIDTH[i]);
            column.getColumn().addSelectionListener(new SortListener());
        }

        Table table = viewer.getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        viewer.setLabelProvider(new ComparisonDataViewLabelProvider());
        viewer.setContentProvider(new ComparisonDataViewContentProvider());
        viewer.setInput(getViewSite());

        viewer.setComparator(new TestbenchComparator());
        viewer.addDoubleClickListener(new InfoDoubleClickListener());

        // Create the help context id for the viewer's control
        PlatformUI.getWorkbench().getHelpSystem()
                .setHelp(viewer.getControl(), "de.cau.cs.kieler.comparison.ui.viewer");
        makeActions();
        contributeToActionBars();
    }

    /**
     * The SortListener is used to sort the columns of the table view.
     * 
     * @author nfl
     */
    private class SortListener implements SelectionListener {
        @Override
        public void widgetSelected(final SelectionEvent e) {
            if (e.getSource() instanceof TableColumn) {
                TableColumn tc = (TableColumn) e.getSource();
                for (int i = 0; i < TITLES.length; i++) {
                    if (TITLES[i].equals(tc.getText())) {
                        if (sortBy == i) {
                            sortBy = -1;
                        } else {
                            sortBy = i;
                        }
                    }
                }
                // TODO there has to be a buffered way
                viewer.refresh();
            }
        }

        @Override
        public void widgetDefaultSelected(final SelectionEvent e) {
            // never called
        }

    }

    /**
     * The TestbenchComparator is used to compare {@link Testbench}es.
     * 
     * @author nfl
     */
    private class TestbenchComparator extends ViewerComparator {
        /**
         * {@inheritDoc}
         */
        public int compare(final Viewer viewer, final Object e1, final Object e2) {
            if (e1 instanceof Testbench && e2 instanceof Testbench) {
                Testbench t1 = (Testbench) e1;
                Testbench t2 = (Testbench) e2;
                int comp = 0;
                switch (sortBy) {
                case 0:
                    comp = t1.getCriterion().compareTo(t2.getCriterion());
                    break;
                case 1:
                    comp = t1.getCompiler().compareTo(t2.getCompiler());
                    break;
                case 2:
                    comp = t1.getTestcase().compareTo(t2.getTestcase());
                    break;
                case 3:
                    Collection<String> d1 = t1.getData();
                    Collection<String> d2 = t2.getData();
                    if (d1 == null) {
                        comp = -1;
                    } else if (d2 == null) {
                        comp = 1;
                    } else {
                        comp = d1.toString().compareTo(d2.toString());
                    }
                    break;

                default:
                    comp = 0;
                    break;
                }
                return comp;
            } else {
                return e1.toString().compareTo(e2.toString());
            }
        };
    }

    /**
     * The InfoDoubleClickListener is used to open a more detailed view of a measuring by double
     * clicking a row.
     * 
     * @author nfl
     */
    private class InfoDoubleClickListener implements IDoubleClickListener {
        @Override
        public void doubleClick(final DoubleClickEvent event) {
            ISelection sel = event.getSelection();
            if (sel instanceof IStructuredSelection && !sel.isEmpty()) {
                IStructuredSelection struct = (IStructuredSelection) sel;
                if (struct.getFirstElement() instanceof Testbench) {
                    Testbench bench = (Testbench) struct.getFirstElement();
                    String title = "Comparison measurement";
                    String infoText = "";
                    infoText += "Compiler: \n" + bench.getCompiler();
                    infoText += "\n\nTest case: \n" + bench.getTestcase();
                    infoText += "\n\nCriteria: \n" + bench.getCriterion();
                    if (bench.getData() != null && !bench.getData().isEmpty()) {
                        infoText += "\n\nMeasuring";
                        if (bench.getData().size() > 1) {
                            infoText += "s (" + bench.getData().size() + ")";
                        }
                        infoText += ":";
                        for (String data : bench.getData()) {
                            infoText += "\n" + data;
                        }
                    }
                    MessageDialog.openInformation(viewer.getControl().getShell(), title, infoText);
                }
            }
        }
    }

    /**
     * Makes contritbutions to the ActionBars, in specific the two new actions (load a set of
     * measurings and initiate a comparison) to the tool bar.
     */
    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalToolBar(bars.getToolBarManager());
    }

    /**
     * Adds the two new actions to the tool bar.
     * 
     * @param manager
     */
    private void fillLocalToolBar(final IToolBarManager manager) {
        manager.add(loadFile);
        manager.add(start);
    }

    /**
     * Creates the two new actions.
     */
    private void makeActions() {
        loadFile = new Action() {
            public void run() {
                loadFile();
            }
        };
        loadFile.setText("Load Comparison");
        loadFile.setToolTipText("Load Comparison tooltip");

        start = new Action() {
            public void run() {
                initiateComparison();
            }
        };
        start.setText("Start Comparison");
        start.setToolTipText("Start Comparison tooltip");
    }

    /**
     * Method used to load a set of measurings. This method uses the
     * {@link ComparisonDataViewContentProvider} for this purpose.
     */
    private void loadFile() {
        // File standard dialog
        FileDialog fileDialog = new FileDialog(viewer.getControl().getShell(), SWT.OPEN);
        fileDialog.setText("Select File");
        // The JSON Datahandler is used in this view
        fileDialog.setFilterExtensions(new String[] { "*.JSON" });
        fileDialog.setFilterNames(new String[] { "Comparison Results(*.JSON)" });

        String open = fileDialog.open();
        if (open != null && open != "") {
            loadComparisonResult(open);
        }
    }

    /**
     * Initializes a comparison. The {@link ComparisonConfig} is created and filled using the
     * {@link StartComparisonDialog}.
     */
    private void initiateComparison() {

        // open a new dialog
        StartComparisonDialog dialog = new StartComparisonDialog(viewer.getControl().getShell());
        // if the dialog got canceled, don't proceed
        if (dialog.open() != Window.OK) {
            return;
        }

        // get all the information from the dialog
        ComparisonConfig conf = new ComparisonConfig();
        conf.setCompareExecSpeed(dialog.compareExecSpeed());
        conf.setCompareExecSpeedAmount(dialog.getExecAmount());
        conf.setCompareCompSpeed(dialog.compareCompSpeed());
        conf.setCompareCompParameters(dialog.getCompSpeedParams());
        conf.setCompareCompSize(dialog.compareCompSize());
        conf.setCompilers(dialog.getCompilers());
        conf.setTestcases(dialog.getTestcases());
        conf.setOutputPath(dialog.getOutputPath());

        // register this view to be notified
        DataHandler.getDataHandler().addObserver(this);

        // initiate
        Comparison.getComparison().startComparison(conf);
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * This method is used to load the results of a comparison.
     * 
     * @param comp
     *            the String identifier for a comparison to load
     */
    public void loadComparisonResult(final String comp) {
        Runnable run = new Runnable() {

            @Override
            public void run() {
                viewer.setContentProvider(new ComparisonDataViewContentProvider(comp));
            }
        };

        Display.getDefault().syncExec(run);
    }

    /**
     * This method is used to load the results of a comparison.
     * 
     * @param measurement
     *            the measurings of a comparison stored in a {@link GeneralComparisonMeasurement}
     *            object
     */
    public void loadComparisonResult(final GeneralComparisonMeasurement measurement) {
        Runnable run = new Runnable() {

            @Override
            public void run() {
                viewer.setContentProvider(new ComparisonDataViewContentProvider(measurement));
            }
        };

        Display.getDefault().syncExec(run);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Observable o, final Object arg) {
        if (arg instanceof GeneralComparisonMeasurement) {
            GeneralComparisonMeasurement measurement = (GeneralComparisonMeasurement) arg;
            loadComparisonResult(measurement);
        }
    }
}
