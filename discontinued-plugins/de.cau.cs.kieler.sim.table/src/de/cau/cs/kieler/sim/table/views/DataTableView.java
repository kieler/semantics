/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.table.views;

import org.eclipse.elk.core.util.Pair;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.table.TablePlugin;

import org.eclipse.elk.core.util.Maybe;
import org.eclipse.elk.core.util.Pair;

/**
 * The class DataTableView implements the ViewPart of the KIEM data table. This is the basic user
 * interface that allows the user to observer values or modify values of variables or signals. The
 * additional check box (for signals) lets the user set a signal explicitly to a present or absent
 * status.
 * 
 * @author cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class DataTableView extends ViewPart implements IKiemEventListener {

    /** The ID of the view as specified by the extension. */
    public static final String ID = "de.cau.cs.kieler.sim.table.views.KiemTable";

    /** The Constant KEYBOARD_DELETE. */
    public static final int KEYBOARD_DELETE = 127;

    /** The Constant KEYBOARD_DELETE. */
    public static final int KEYBOARD_SPACE = 32;

    /** The Constant COLUMN_0_WIDTH. */
    private static final int COLUMN_0_WIDTH = 0;

    /** The Constant COLUMN_1_WIDTH. */
    private static final int COLUMN_1_WIDTH = 38;

    /** The Constant COLUMN_2_WIDTH. */
    private static final int COLUMN_2_WIDTH = 120;

    /** The Constant COLUMN_3_WIDTH. */
    private static final int COLUMN_3_WIDTH = 120;

    /** This data table view instance. */
    private static DataTableView dataTableView;

    /** The tree table viewer. */
    private DataTableViewer viewer;

    /** The action for a new entry. */
    private Action actionNew;

    /** The action for deleting an entry. */
    private Action actionDelete;

    /** The action for deleting an entry. */
    private Action actionSignaltoggle;

    /** The toggle action for making variables/signals permanent. */
    private Action actionPermanent;

    /** The toggle action for flagging a variable as a signal. */
    private Action actionSignal;

    /** The flag indicating an ongoing editing to prevent updates. */
    private boolean currentlyEditing;

    // -------------------------------------------------------------------------

    /**
     * The constructor of the ViewPart of the data table plug-in.
     */
    public DataTableView() {
        dataTableView = this;
        currentlyEditing = false;
        
        KiemPlugin.getDefault().getEventManager().add(this);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the single instance of DataTableView.
     * 
     * @return single instance of DataTableView
     */
    public static DataTableView getInstance() {
        return dataTableView;
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the tree table viewer.
     */
    public void refreshViewer() {
        viewer.refresh();
        return;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the currently editing status to true or false.
     * 
     * @param currentlyEditingParam
     *            true, if user is currently editing an entry
     */
    public void setCurrentlyEditing(final boolean currentlyEditingParam) {
        this.currentlyEditing = currentlyEditingParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if user is currently editing an entry.
     * 
     * @return true, if user is currently editing
     */
    public boolean isCurrentlyEditing() {
        return currentlyEditing;
    }

    // -------------------------------------------------------------------------

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     * 
     * @param parent
     *            the composite parent
     */
    public void createPartControl(final Composite parent) {
        createViewer(parent);
        viewer.setInput(new TableDataList(viewer));
        hookSideEffectActions();
        hookContextMenu();
        contributeToActionBars();
        updateEnabled();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates the tree table viewer.
     * 
     * @param parent
     *            the composite parent
     */
    private void createViewer(final Composite parent) {
        viewer = new DataTableViewer(parent, SWT.HIDE_SELECTION | SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.FULL_SELECTION);
        createColumns(viewer);
        viewer.setContentProvider(new TableDataContentProvider());
        viewer.setLabelProvider(new TableDataLabelProvider());

        viewer.getControl().addKeyListener(new KeyListener() {
            public void keyPressed(final KeyEvent e) {
                // if user pressed delete
                if (e.keyCode == KEYBOARD_DELETE) {
                    getActionDelete().run();
                }
                // if user wants to toggle signal
                if (e.keyCode == KEYBOARD_SPACE) {
                    getActionSignaltoggle().run();
                }
            }

            public void keyReleased(final KeyEvent e) {
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * This will create the columns for the table.
     * 
     * @param viewerParam
     *            the DataTableViewer
     */
    private void createColumns(final DataTableViewer viewerParam) {
        String[] titles = { "", "P", "Key", "Value" };
        String[] toolTip = { "", "Present/Absent/No Signal", "Key", "Value" };
        int[] bounds = { COLUMN_0_WIDTH, COLUMN_1_WIDTH, COLUMN_2_WIDTH, COLUMN_3_WIDTH };

        SelectionListener headerListener = new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                int column = viewer.getTree().indexOf((TreeColumn) e.widget);
                TableViewerSorter oldSorter = (TableViewerSorter) viewer.getSorter();
                viewer.getTree().setSortColumn((TreeColumn) e.widget);
                if (oldSorter != null && column == oldSorter.getColumn()) {
                    oldSorter.setReversed(!oldSorter.getReversed());
                    // System.out.println("SORTCOMMAND " + column);
                    viewer.refresh();
                    // viewer.setSorter(null);
                } else {
                    viewer.setSorter(new TableViewerSorter(column));
                }
            }
        };

        for (int i = 0; i < titles.length; i++) {
            TreeViewerColumn column = new TreeViewerColumn(viewerParam, SWT.NONE);
            column.getColumn().setText(titles[i]);
            column.getColumn().setWidth(bounds[i]);
            column.getColumn().setToolTipText(toolTip[i]);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            column.getColumn().addSelectionListener(headerListener);
            if (i == 0) {
                column.getColumn().setResizable(false);
            } else {
                column.setEditingSupport(new TableDataEditing(viewerParam, i));
            }
        }
        // for default sorting
        viewer.setSorter(new TableViewerSorter(2));

        Tree tree = viewerParam.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Hook context menu that allows editing of entries.
     */
    private void hookContextMenu() {
        MenuManager menuMgr = new MenuManager("#PopupMenu");
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(final IMenuManager manager) {
                buildContextMenu(manager);
            }
        });
        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, viewer);
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the context menu of the tree table viewer.
     * 
     * @param manager
     *            the manager
     */
    private void buildContextMenu(final IMenuManager manager) {
        manager.add(getActionSignal());
        manager.add(getActionSignaltoggle());
        manager.add(getActionPermanent());
        manager.add(new Separator());
        manager.add(getActionAdd());
        manager.add(getActionDelete());
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    // -------------------------------------------------------------------------

    /**
     * Contribute to the tool bar of this ViewPart.
     */
    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();
        toolBarManager.add(getStepTextField());
        toolBarManager.add(new Separator());
        toolBarManager.add(getActionAdd());
        toolBarManager.add(getActionDelete());
        toolBarManager.add(new Separator());
        toolBarManager.add(getActionSignal());
        toolBarManager.add(getActionSignaltoggle());
        toolBarManager.add(getActionPermanent());
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to add a new variable or signal.
     * 
     * @return the action add
     */
    private Action getActionAdd() {
        if (actionNew != null) {
            return actionNew;
        }
        actionNew = new Action() {
            public void run() {
                TableData newElement = new TableData(TableDataList.getInstance(), false, " ", "");
                TableDataList.getInstance().add(newElement);
                refreshViewer();
                viewer.setSelection((new StructuredSelection(newElement)));
                updateEnabled();
            }
        };
        actionNew.setText("Add Entry");
        actionNew.setToolTipText("Add Entry");
        actionNew.setImageDescriptor(TablePlugin.getImageDescriptor("icons/add.png"));
        return actionNew;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to delete a variable or signal.
     * 
     * @return the action delete
     */
    private Action getActionDelete() {
        if (actionDelete != null) {
            return actionDelete;
        }
        actionDelete = new Action() {
            public void run() {
                IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                for (int c = 0; c < selection.size(); c++) {
                    TableData tableData = (TableData) selection.toArray()[c];
                    if (TableDataList.getInstance().contains(tableData.getKey())) {
                        TableDataList.getInstance().remove(tableData.getKey());
                    }
                }
                // viewer.setSelection(null);
                refreshViewer();
                updateEnabled();
            }
        };
        actionDelete.setText("Delete Entry");
        actionDelete.setToolTipText("Delete Entry");
        actionDelete.setImageDescriptor(TablePlugin.getImageDescriptor("icons/delete.png"));
        return actionDelete;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle presence of signals.
     * 
     * @return the action delete
     */
    private Action getActionSignaltoggle() {
        if (actionSignaltoggle != null) {
            return actionSignaltoggle;
        }
        actionSignaltoggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                // toggle w.r.t first selected value
                boolean presentValue = !((TableData) ((IStructuredSelection) selection)
                        .getFirstElement()).isPresent();
                for (int c = 0; c < selection.size(); c++) {
                    TableData tableData = (TableData) selection.toArray()[c];
                    boolean isSignal = tableData.isSignal();
                    boolean isPresent = tableData.isPresent();
                    boolean isModified = tableData.isModified();
                    tableData.setSignal(true);
                    tableData.setPresent(presentValue);
                    tableData.setModified(isModified || !isSignal || (isPresent != presentValue));
                }
                // viewer.setSelection(null);
                refreshViewer();
                updateEnabled();
            }
        };
        actionSignaltoggle.setText("Present/Absent");
        actionSignaltoggle.setToolTipText("Present/Absent");
        actionSignaltoggle.setImageDescriptor(TablePlugin.getImageDescriptor("icons/checked.png"));
        return actionSignaltoggle;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to flag a variable or signal as permanent.
     * 
     * @return the action permanent
     */
    private Action getActionPermanent() {
        if (actionPermanent != null) {
            return actionPermanent;
        }
        actionPermanent = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                // toggle w.r.t first selected value
                boolean permanentValue = !((TableData) ((IStructuredSelection) selection)
                        .getFirstElement()).isPermanent();
                for (int c = 0; c < selection.size(); c++) {
                    TableData tableData = (TableData) selection.toArray()[c];
                    tableData.setPermanent(permanentValue);
                    // if this is a signal and set to permanent, set it to present status by
                    // default!
                    if (tableData.isPermanent() && tableData.isSignal()) {
                        tableData.setPresent(true);
                    } // end if
                }
                // enable updates for the table because we cannot edit the element anyway
                if (permanentValue) {
                    DataTableView.getInstance().setCurrentlyEditing(false);
                }

                // viewer.setSelection(null);
                refreshViewer();
                updateEnabled();
            }
        };
        actionPermanent.setText("Permanent");
        actionPermanent.setToolTipText("Permanent");
        actionPermanent.setImageDescriptor(TablePlugin
                .getImageDescriptor("icons/permanentIcon.png"));
        return actionPermanent;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle a variable to a signal and vice versa.
     * 
     * @return the action signal
     */
    private Action getActionSignal() {
        if (actionSignal != null) {
            return actionSignal;
        }
        actionSignal = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                // toggle w.r.t first selected value
                boolean signalValue = !((TableData) ((IStructuredSelection) selection)
                        .getFirstElement()).isSignal();
                for (int c = 0; c < selection.size(); c++) {
                    TableData tableData = (TableData) selection.toArray()[c];
                    boolean isSignal = tableData.isSignal();
                    boolean isModified = tableData.isModified();
                    tableData.setSignal(signalValue);
                    tableData.setModified(isModified || isSignal != signalValue);
                }
                // viewer.setSelection(null);
                refreshViewer();
                updateEnabled();
            }
        };
        actionSignal.setText("Signal");
        actionSignal.setToolTipText("Signal");
        actionSignal.setImageDescriptor(TablePlugin.getImageDescriptor("icons/signalIcon.png"));
        return actionSignal;
    }

    // -------------------------------------------------------------------------

    /**
     * Hook double click and selection changed effect actions.
     */
    private void hookSideEffectActions() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(final DoubleClickEvent event) {
                ISelection selection = viewer.getSelection();
                if (selection != null) {
                    Object obj = ((IStructuredSelection) selection).getFirstElement();
                    if (obj != null) {
                        // toggle permanent
                        getActionPermanent().run();
                    }
                }
            }
        });
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                updateEnabled();
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the enableness and toggle status of actions.
     */
    private void updateEnabled() {
        Object obj = ((org.eclipse.jface.viewers.StructuredSelection) viewer.getSelection())
                .getFirstElement();
        if (obj == null) {
            // no object selected
            getActionDelete().setEnabled(false);
            getActionPermanent().setEnabled(false);
            getActionSignal().setEnabled(false);
            getActionSignaltoggle().setEnabled(false);
        } else {
            // object selected
            getActionDelete().setEnabled(true);
            getActionPermanent().setEnabled(true);
            getActionSignal().setEnabled(true);
            getActionSignaltoggle().setEnabled(true);
            if (((TableData) obj).isPermanent()) {
                actionPermanent.setChecked(true);
            } else {
                actionPermanent.setChecked(false);
            }
            if (((TableData) obj).isSignal()) {
                actionSignal.setChecked(true);
            } else {
                actionSignal.setChecked(false);
            }
            if (((TableData) obj).isPresent()) {
                actionSignaltoggle.setChecked(true);
            } else {
                actionSignaltoggle.setChecked(false);
            }
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Pass the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    // -------------------------------------------------------------------------
    
    static long tick = 0;
    
    /** The step text field. */
    private StepTextField stepTextField;
    

    /**
     * Gets the step text field.
     * 
     * @return the step text field
     */
    private StepTextField getStepTextField() {
        if (stepTextField != null) {
            return stepTextField;
        }
        stepTextField = new StepTextField();
        return stepTextField;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates steps in the steps text field asynchronously from within another thread.
     */
    public void updateStepsAsync() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                KiemPlugin kIEMInstance = KiemPlugin.getDefault();
                if (kIEMInstance.getExecution() != null) {
                    // update step counter if run
                    String steps2 = "" + kIEMInstance.getExecution().getSteps();
                    if (tick < 0) {
                        steps2 = "";
                    }
                    if (kIEMInstance.getExecution().isHistoryStep()) {
                        steps2 = "[" + steps2 + "]";
                    }
                    getStepTextField().updateTextfield(steps2);
                } else {
                    // hide textfield otherwise
                    getStepTextField().updateTextfield("");
                }
            }
        });
    }
    
    // -------------------------------------------------------------------------

    /**
     * Sets the step number according to the button the user pressed. This is needed to correctly
     * handle history steps or jumps.
     * 
     * @param event
     *            the event
     */
    @SuppressWarnings("unchecked")
    @Override
    public void notifyEvent(final KiemEvent event) {
        tick = -1;
        if (event.isEvent(KiemEvent.STEP_INFO) && event.getInfo() instanceof Pair) {
            tick = ((Pair<Long, Long>) event.getInfo()).getFirst().longValue();
            updateStepsAsync();
        } 
        else if (event.isEvent(KiemEvent.CMD_STOP)) {
            updateStepsAsync();
        } 
        else if (event.isEvent(KiemEvent.CMD_STEP)) {
            updateStepsAsync();
        } 
    }
    
    // -------------------------------------------------------------------------

    /**
     * Return the types of events this component listens to.
     * 
     * @return the event types, currently only {@code KiemEvent.STEP_INFO}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.STEP_INFO, KiemEvent.CMD_STOP, KiemEvent.CMD_STEP};
        KiemEvent event = new KiemEvent(events);
        return event;
    }    

    // -------------------------------------------------------------------------
}
