/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.ui.views;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.comparison.core.Comparison;
import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;
import de.cau.cs.kieler.comparison.exchange.Testbench;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained
 * from the model. The sample creates a dummy model on the fly, but a real implementation would
 * connect to the model available either in this or another plug-in (e.g. the workspace). The view
 * is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each
 * view can present the same model objects using different labels and icons, if needed.
 * Alternatively, a single label provider can be shared between views in order to ensure that
 * objects of the same type are presented in the same way everywhere.
 * <p>
 * 
 * @author nfl
 */
public class ComparisonDataView extends ViewPart {

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "de.cau.cs.kieler.comparison.ui.views.DataView";

    private TableViewer viewer;
    private Action loadFile;
    private Action start;

    /**
     * The constructor.
     */
    public ComparisonDataView() {
    }

    static final String[] TITLES = { "Criteria", "Compiler", "Testcase", "Results" };
    static final int[] WIDTH = { 200, 300, 250, 300 };
    private int sortBy = -1;

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
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

        // Create the help context id for the viewer's control
        PlatformUI.getWorkbench().getHelpSystem()
                .setHelp(viewer.getControl(), "de.cau.cs.kieler.comparison.ui.viewer");
        makeActions();
        contributeToActionBars();
    }

    private class SortListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
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
        public void widgetDefaultSelected(SelectionEvent e) {
            // never called
        }

    }

    private class TestbenchComparator extends ViewerComparator {
        public int compare(Viewer viewer, Object e1, Object e2) {
            if (e1 instanceof Testbench && e2 instanceof Testbench) {
                Testbench t1 = (Testbench) e1;
                Testbench t2 = (Testbench) e2;
                int comp = 0;
                switch (sortBy) {
                case 0:
                    comp = t1.getCriteria().compareTo(t2.getCriteria());
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

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalToolBar(final IToolBarManager manager) {
        manager.add(loadFile);
        manager.add(start);
    }

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

    private void loadFile() {
        // File standard dialog
        FileDialog fileDialog = new FileDialog(viewer.getControl().getShell(), SWT.OPEN);
        fileDialog.setText("Select File");
        fileDialog.setFilterExtensions(new String[] { "*.JSON" });
        fileDialog.setFilterNames(new String[] { "Comparison Results(*.JSON)" });

        String open = fileDialog.open();
        if (open != null && open != "")
            loadComparisonResult(open);
    }

    private void initiateComparison() {

        StartComparisonDialog dialog = new StartComparisonDialog(viewer.getControl().getShell());
        if (dialog.open() != Window.OK)
            return;

        ComparisonConfig conf = new ComparisonConfig();
        conf.setCompareExecSpeed(dialog.compareExecSpeed());
        conf.setCompareExecSpeedAmount(dialog.getExecAmount());
        conf.setCompareCompSpeed(dialog.compareCompSpeed());
        conf.setCompareCompSpeedAmount(dialog.getCompAmount());
        conf.setCompareCompSize(dialog.compareCompSize());
        conf.setCompilers(dialog.getCompilers());
        conf.setTestcases(dialog.getTestcases());
        conf.setOutputPath(dialog.getOutputPath());

        Comparison comparison = Comparison.getComparison();
        String comp = comparison.startComparison(conf);

        // TODO loadComparisonResult(comp);
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * 
     * @param comp
     */
    private void loadComparisonResult(String comp) {
        viewer.setContentProvider(new ComparisonDataViewContentProvider(comp));
    }
}
