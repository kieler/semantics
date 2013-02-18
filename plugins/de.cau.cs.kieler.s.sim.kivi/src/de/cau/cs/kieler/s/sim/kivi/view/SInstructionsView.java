/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi.view;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;

/**
 * @author cmot
 * 
 */
public class SInstructionsView extends ViewPart {

    /** The ID of the view as specified by the extension. */
    public static final String ID = "de.cau.cs.kieler.klots.view.SInstructionsView";

    /** The Constant COLUMN_0_WIDTH. */
    private static final int COLUMN_0_WIDTH = 0;
    private static final String COLUMN_0_TEXT = "";
    private static final String COLUMN_0_TOOLTIP = "";

    /** The Constant COLUMN_1_WIDTH. */
    private static final int COLUMN_1_WIDTH = 200;
    private static final String COLUMN_1_TEXT = "Instruction";
    private static final String COLUMN_1_TOOLTIP = "Instruction's name";

    /** The Constant COLUMN_2_WIDTH. */
    private static final int COLUMN_2_WIDTH = 200;
    private static final String COLUMN_2_TEXT = "Label";
    private static final String COLUMN_2_TOOLTIP = "Instruction's label";

    /** The Constant COLUMN_3_WIDTH. */
    private static final int COLUMN_3_WIDTH = 40;
    private static final String COLUMN_3_TEXT = "Prio";
    private static final String COLUMN_3_TOOLTIP = "Instruction's priority";

    /** This data table view instance. */
    private static SInstructionsView sInstructionsView;

    /** The tree viewer. */
    private SInstructionsViewer viewer;

    private int microStepCounter = -1;

    // microstep actions
    private Action microStepForwards;
    private Action microStepBackwards;
    private Action microStepForwardsAll;
    private Action microStepBackwardsAll;

    /**
     * 
     */
    public SInstructionsView() {
        sInstructionsView = this;
    }

    /**
     * @return SJInstructionsView
     */
    public static SInstructionsView getInstance() {
        return sInstructionsView;
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     * 
     * @param parent
     *            the composite parent
     */
    public void createPartControl(final Composite parent) {
        createViewer(parent);
        viewer.setInput(new SInstructionsDataList(viewer));
        createActions();
        // hookSideEffectActions();
        // hookContextMenu();
        contributeToActionBars();
    }

    /**
     * Creates the tree table viewer.
     * 
     * @param parent
     *            the composite parent
     */
    private void createViewer(final Composite parent) {
        viewer = new SInstructionsViewer(parent, SWT.HIDE_SELECTION | SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.FULL_SELECTION);
        createColumns(viewer);
        viewer.setContentProvider(new SInstructionsDataContentProvider());
        viewer.setLabelProvider(new SInstructionsDataLabelProvider());

        // viewer.getControl().addKeyListener(new KeyListener() {
        // public void keyPressed(final KeyEvent e) {
        // // if user pressed delete
        // if (e.keyCode == KEYBOARD_DELETE) {
        // getActionDelete().run();
        // }
        // // if user wants to toggle signal
        // if (e.keyCode == KEYBOARD_SPACE) {
        // getActionSignaltoggle().run();
        // }
        // }
        //
        // public void keyReleased(final KeyEvent e) {
        // }
        // });

        viewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                // if the selection is empty do nothing
                if (event.getSelection().isEmpty()) {
                    System.out.println("XXXXXXXXXX>>> EMPTY SELECTION");
                    return;
                }
                if (event.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                    List<SInstructionsData> list = new LinkedList<SInstructionsData>();

                    // set microstep counter to point at the last instruction on every new macrostep
                    if (microStepCounter == -1) {
                        microStepCounter = viewer.getTree().getItemCount() - 1;
                    }

                    // ------------------------------------------------------
                    // XXX: in this KLOTS release, process only the first element of the selection
                    SInstructionsData data = (SInstructionsData) selection.getFirstElement();
                    list.add(data);
                    System.out.println(">>> new selected item = " + data.getName());
                    EObject activeStatement = data.getEObject();

                    // InstructionViewDataComponent
                    KiemPlugin kiem = KiemPlugin.getDefault();
                    if (kiem != null) {
                        Execution execution = kiem.getExecution();
                        if (execution != null) {
                            List<DataComponentWrapper> dataComponentWrapperList = kiem
                                    .getDataComponentWrapperList();
                            for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
                                if (dataComponentWrapper.getDataComponent() instanceof InstructionViewDataComponent) {
                                    final InstructionViewDataComponent instructionViewDataComponent = (InstructionViewDataComponent) dataComponentWrapper
                                            .getDataComponent();
                                    instructionViewDataComponent.selectMicroTick(activeStatement);
                                    try {
                                        instructionViewDataComponent.refreshViewSync();
                                    } catch (KiemExecutionException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                    // for(Iterator<?> iterator = selection.iterator(); iterator.hasNext(); ) {
                    // list.add( (SJInstructionsData) iterator.next() );
                    // }

                    // forbid multiple selections AND enable/disable microstep actions
                    int i = data.getParentSInstructionsDataList().indexOf(data);

                    // if this is not a step do nothing
                    if (i == microStepCounter) {
                        return;

                        // if this is a one step forward do a single step forward
                    } else if (i == microStepCounter + 1) {
                        // IEditorPart editorPart = KlotsPlugin.getDefault().getWorkbench()
                        // .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
                        // if (editorPart != null) {
                        // // do a forward step in the editor
                        // KlotsEditor e = (KlotsEditor) editorPart;
                        // e.doMicroStepForwards();
                        // // print data
                        // System.out.println(
                        // "+++++>>>> LISTENER MICRO STEP FORWARD: selection index = "
                        // + (i - 1) + ", new selection index = " + i + ", tree items count = "
                        // + viewer.getTree().getItemCount());
                        // System.out.println(
                        // "+++++>>>> LISTENER MICRO STEP FORWARD: increment the selection");
                        // // increment the step counter AND enable/disable the microstep buttons
                        // microStepCounter++;
                        // if (!microStepBackwards.isEnabled()) {
                        // microStepBackwards.setEnabled(true);
                        // microStepBackwardsAll.setEnabled(true);
                        // }
                        // // disable the 'forward' buttons
                        // // if the new selected item is the last one in the list
                        // if (i >= viewer.getTree().getItemCount() - 1) {
                        // microStepForwards.setEnabled(false);
                        // microStepForwardsAll.setEnabled(false);
                        // }
                        // } else {
                        // System.out.println(
                        // "###>>> LISTENER MICRO STEP FORWARDS ERROR: No active editor!");
                        // }
                        return;

                        // if this is a one step backward do a single step backward
                    } else if (i == microStepCounter - 1) {
                        // IEditorPart editorPart = KlotsPlugin.getDefault().getWorkbench()
                        // .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
                        // if (editorPart != null) {
                        // // do a backward step in the editor
                        // KlotsEditor e = (KlotsEditor) editorPart;
                        // e.doMicroStepBackwards();
                        // // print data
                        // System.out.println(
                        // "+++++>>>> LISTENER MICRO STEP BACK: selection index = " + (i + 1)
                        // + ", new selection index = " + i);
                        // System.out.println(
                        // "+++++>>>> LISTENER MICRO STEP BACK: decrement the selection");
                        // // decrement the step counter AND enable/disable the microstep buttons
                        // microStepCounter--;
                        // if (!microStepForwards.isEnabled()) {
                        // microStepForwards.setEnabled(true);
                        // microStepForwardsAll.setEnabled(true);
                        // }
                        // // disable the 'backward' buttons
                        // // if the new selected item is the first one in the list
                        // if (i <= 0) {
                        // microStepBackwards.setEnabled(false);
                        // microStepBackwardsAll.setEnabled(false);
                        // }
                        // } else {
                        // System.out.println(
                        // "###>>> LISTENER MICRO STEP BACKWARDS ERROR: No active editor!");
                        // }
                        // return;
                    }

                    // if this is a 'jump' step process it as such
                    // highlightSelectedSInstructions(list);
                    viewer.getTree().setSelection(viewer.getTree().getItem(i));
                    microStepCounter = i;
                    // enable/disable the microstep buttons
                    if (i == 0) {
                        microStepForwards.setEnabled(true);
                        microStepForwardsAll.setEnabled(true);
                        microStepBackwards.setEnabled(false);
                        microStepBackwardsAll.setEnabled(false);
                    } else if (i == viewer.getTree().getItemCount() - 1) {
                        microStepForwards.setEnabled(false);
                        microStepForwardsAll.setEnabled(false);
                        microStepBackwards.setEnabled(true);
                        microStepBackwardsAll.setEnabled(true);
                    } else {
                        microStepForwards.setEnabled(true);
                        microStepForwardsAll.setEnabled(true);
                        microStepBackwards.setEnabled(true);
                        microStepBackwardsAll.setEnabled(true);
                    }
                    // ------------------------------------------------------

                } else {
                    System.out
                            .println("XXXXXXXXXX>>> BAD ERROR: SELECTION IS NOT A 'STRUCTURED SELECTION'");
                }
            } // end selectionChanged()
        }); // end new ISelectionChangedListener() {}
    }

    /**
     * @param list
     */
    protected void highlightSelectedSJInstructions(final List<SInstructionsData> list) {
        System.out.println("XXXXXXXXXXXXX>>>>>>>>>>>> SELECTED ITEMS: ");
        for (SInstructionsData d : list) {
            System.out.println(d.toString());
        }
    }

    /**
     * This will create the columns for the table.
     * 
     * @param viewerParam
     *            the DataTableViewer
     */
    private void createColumns(final SInstructionsViewer viewerParam) {
        int[] bounds = { COLUMN_0_WIDTH, COLUMN_1_WIDTH, COLUMN_2_WIDTH, COLUMN_3_WIDTH };
        String[] titles = { COLUMN_0_TEXT, COLUMN_1_TEXT, COLUMN_2_TEXT, COLUMN_3_TEXT };
        String[] toolTip = { COLUMN_0_TOOLTIP, COLUMN_1_TOOLTIP, COLUMN_2_TOOLTIP, COLUMN_3_TOOLTIP };

        for (int i = 0; i < titles.length; i++) {
            TreeViewerColumn column = new TreeViewerColumn(viewerParam, SWT.NONE);
            column.getColumn().setWidth(bounds[i]);
            column.getColumn().setText(titles[i]);
            column.getColumn().setToolTipText(toolTip[i]);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            if (i == 0) {
                column.getColumn().setResizable(false);
            }
        }

        Tree tree = viewerParam.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);
    }

    /**
     * Contribute to the tool bar of this ViewPart.
     */
    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();

        toolBarManager.add(microStepBackwardsAll);
        toolBarManager.add(microStepBackwards);
        toolBarManager.add(microStepForwards);
        toolBarManager.add(microStepForwardsAll);
        toolBarManager.add(new Separator());
    }

    private void createActions() {
        // ----------------------- micro step forward -----------------------
        microStepForwards = new Action() {
            public void run() {
            }
        };
        microStepForwards.setText("Microstep Forwards");
        microStepForwards.setToolTipText("Take a microstep forwards");
        microStepForwards.setImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID, "icons/microStepIcon.png"));
        microStepForwards.setDisabledImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                        "icons/microStepIconDisabled.png"));

        // ----------------------- micro step backward ----------------------
        microStepBackwards = new Action() {
            public void run() {
            }
        };
        microStepBackwards.setText("Microstep Backwards");
        microStepBackwards.setToolTipText("Take a microstep backwards");
        microStepBackwards
                .setImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                        .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                                "icons/microStepBackIcon.png"));
        microStepBackwards.setDisabledImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                        "icons/microStepBackIconDisabled.png"));

        // --------------------- all forward micro steps --------------------
        microStepForwardsAll = new Action() {
            public void run() {
            }
        };
        microStepForwardsAll.setText("All Forward Microsteps");
        microStepForwardsAll.setToolTipText("Do all forward microsteps");
        microStepForwardsAll.setImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID, "icons/macroStepIcon.png"));
        microStepForwardsAll.setDisabledImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                        "icons/macroStepIconDisabled.png"));

        // --------------------- all backward micro steps -------------------
        microStepBackwardsAll = new Action() {
            public void run() {
            }
        };
        microStepBackwardsAll.setText("All Backward Microsteps");
        microStepBackwardsAll.setToolTipText("Do all backward microsteps");
        microStepBackwardsAll
                .setImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                        .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                                "icons/macroStepBackIcon.png"));
        microStepBackwardsAll.setDisabledImageDescriptor(de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin
                .imageDescriptorFromPlugin(SSimKiviPlugin.PLUGIN_ID,
                        "icons/macroStepBackIconDisabled.png"));
        // ------------------------------------------------------------------
    }

    /**
     * Pass the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the tree viewer.
     */
    public void refreshViewer() {
        viewer.refresh();
        return;
    }

    /**
     * Updates the view of the parent tree table viewer asynchronously.
     */
    public void refreshViewerAsync() {
        // asynchronously update the table
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                try {
                    viewer.refresh();
                } catch (Exception e) {
                    // ignore errors
                }
            }
        });
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    // /**
    // * Hook context menu that allows editing of entries.
    // */
    // private void hookContextMenu() {
    // MenuManager menuMgr = new MenuManager("#PopupMenu");
    // menuMgr.setRemoveAllWhenShown(true);
    // menuMgr.addMenuListener(new IMenuListener() {
    // public void menuAboutToShow(final IMenuManager manager) {
    // buildContextMenu(manager);
    // }
    // });
    // Menu menu = menuMgr.createContextMenu(viewer.getControl());
    // viewer.getControl().setMenu(menu);
    // getSite().registerContextMenu(menuMgr, viewer);
    // }

    // -------------------------------------------------------------------------

    // /**
    // * Builds the context menu of the tree table viewer.
    // *
    // * @param manager
    // * the manager
    // */
    // private void buildContextMenu(final IMenuManager manager) {
    // manager.add(getActionSignal());
    // manager.add(getActionSignaltoggle());
    // manager.add(getActionPermanent());
    // manager.add(new Separator());
    // manager.add(getActionAdd());
    // manager.add(getActionDelete());
    // // Other plug-ins can contribute there actions here
    // manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    // }

    // -------------------------------------------------------------------------

    // /**
    // * Hook double click and selection changed effect actions.
    // */
    // private void hookSideEffectActions() {
    // viewer.addDoubleClickListener(new IDoubleClickListener() {
    // public void doubleClick(final DoubleClickEvent event) {
    // ISelection selection = viewer.getSelection();
    // if (selection != null) {
    // Object obj = ((IStructuredSelection) selection).getFirstElement();
    // if (obj != null) {
    // // toggle permanent
    // getActionPermanent().run();
    // }
    // }
    // }
    // });
    // viewer.addSelectionChangedListener(new ISelectionChangedListener() {
    // public void selectionChanged(final SelectionChangedEvent event) {
    // updateEnabled();
    // }
    // });
    // }

}
