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

package de.cau.cs.kieler.sim.kiem.ui.views;

import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;
import de.cau.cs.kieler.sim.kiem.ui.AddDataComponentDialog;
import de.cau.cs.kieler.sim.kiem.ui.DropDownAction;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;
import de.cau.cs.kieler.sim.kiem.ui.StepTextField;

/**
 * The Class KiemView is only instantiated once when the view part is registered in the Eclipse IDE.
 * It holds the DataComponent table list view and buttons to control the execution.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de, soh
 */
public class KiemView extends ViewPart implements ISaveablePart2 {

    /** The viewer table of DataComponentWrappers. */
    private KiemTableViewer viewer;

    /** The action to add a DataComponent. */
    private Action actionAdd;

    /** The action to delete a DataComponent. */
    private Action actionDelete;

    /** The action enable or disable a DataComponent. */
    private Action actionEnableDisable;

    /** The action to schedule a DataComponent before. */
    private Action actionUp;

    /** The action to schedule a DataComponent behind. */
    private Action actionDown;

    /** The action to make an execution macro step. */
    private Action actionMacroStep;

    /** The action to make an execution step back. */
    private Action actionStepBack;

    /** The action to make an execution step. */
    private Action actionStep;

    /** The action to make a user defined execution step. */
    private Action actionStepUser;

    /** The action run user. */
    private Action actionRunUser;

    /** The action to make an execution step to the most current one. */
    private Action actionStepFMC;

    /** The action to run the execution. */
    private Action actionRun;

    /** The action to pause the execution. */
    private Action actionPause;

    /** The action to stop the execution. */
    private Action actionStop;

    /** The aimed step duration text field. */
    private AimedStepDurationTextField aimedStepDurationTextField;

    /** The step text field. */
    private StepTextField stepTextField;

    /** The current master DataComponent if any. */
    private DataComponentWrapper currentMaster;

    /** The KIEM instance to e.g., access the execution. */
    private KiemPlugin kIEMInstance;

    /** The Constant columnBoundsCollapsed - no properties visible. */
    public static final int[] COLUMN_BOUNDS_COLLAPSED = { 250, 0, 20, 120, 50, 50 };

    /** The Constant columnBounds - properties visible. */
    public static final int[] COLUMN_BOUNDS = { 250, 200, 20, 120, 50, 50 };

    /** The column property user defined width, initially -1. */
    private int columnProperty = -1;

    /** The Constant columnTitlesCollapsed - properties not visible. */
    public static final String[] COLUMN_TITLES_COLLAPSED = { Messages.mTableComponentName,
            Messages.mTableValue, Messages.mTableEnabled, Messages.mTableType,
            Messages.mTableMaster };

    /** The Constant columnTitles - properties visible. */
    public static final String[] COLUMN_TITLES = { Messages.mTableComponentNameKey,
            Messages.mTableValue, Messages.mTableEnabled, Messages.mTableType,
            Messages.mTableMaster };

    /** The Constant columnToolTipCollapsed - properties not visible. */
    public static final String[] COLUMN_TOOLTIP_COLLAPSED = { Messages.mTableHintComponentName,
            Messages.mTableHintValue, Messages.mTableHintEnabled, Messages.mTableHintType,
            Messages.mTableHintMaster };

    /** The Constant columnToolTip - properties visible. */
    public static final String[] COLUMN_TOOLTIP = { Messages.mTableHintComponentNameKey,
            Messages.mTableHintValue, Messages.mTableHintEnabled, Messages.mTableHintType,
            Messages.mTableHintMaster };

    /** The Constant DISABLED_COLOR_GRAY. */
    private static final int DISABLED_COLOR_GRAY = 150;

    /** The Constant MASTER_COLOR_BLUE. */
    private static final int MASTER_COLOR_BLUE = 255;

    private static final int KEYBOARD_DELETE = 127;

    /** True if all actions are (temporary) disabled. */
    private boolean allDisabled;

    /** True iff table or properties where modified. */
    private boolean isDirty;

    /** The currently opened file if any, null otherwise. */
    private IPath currentFile;

    // -------------------------------------------------------------------------

    /**
     * The constructor of the Kiem View instance.
     */
    public KiemView() {
        kIEMInstance = KiemPlugin.getDefault();
        // set KIEMViewInstance of KiemPlugin so that we can update the
        // view from within the execution
        kIEMInstance.setKIEMViewInstance(this);
        this.currentMaster = null;
        this.currentFile = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the kIEM instance.
     * 
     * @return the kIEM instance
     */
    public KiemPlugin getKIEMInstance() {
        return this.kIEMInstance;
    }

    // -------------------------------------------------------------------------
    /**
     * Sets the current file.
     * 
     * @param currentFileParam
     *            the new currently opened file
     */
    public void setCurrentFile(final IPath currentFileParam) {
        this.currentFile = currentFileParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current file.
     * 
     * @return the current file
     */
    public IPath getCurrentFile() {
        return this.currentFile;
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the text colors of enabled or master components. Disabled DataComponents will get a
     * gray text color, enabled master components are indicated by a blue text color.
     */
    private void refreshEnabledDisabledTextColors() {
        // change the text color (black or gray)
        Color colorEnabled = new Color(null, new RGB(0, 0, 0));
        Color colorDisabled = new Color(null, new RGB(DISABLED_COLOR_GRAY, DISABLED_COLOR_GRAY,
                DISABLED_COLOR_GRAY));
        Color colorMaster = new Color(null, new RGB(0, 0, MASTER_COLOR_BLUE));
        for (int c = 0; c < kIEMInstance.getDataComponentWrapperList().size(); c++) {
            DataComponentWrapper dataComponentWrapper = kIEMInstance.getDataComponentWrapperList()
                    .get(c);
            // select color
            Color currentColor = colorDisabled;
            if (dataComponentWrapper.isEnabled()) {
                currentColor = colorEnabled;
                if (dataComponentWrapper.isMaster()) {
                    currentColor = colorMaster;
                }
            }

            // update text colors
            viewer.getTree().getItem(c).setForeground(currentColor);
            // enable sub items
            int subItemCnt = viewer.getTree().getItem(c).getItemCount();
            for (int cc = 0; cc < subItemCnt; cc++) {
                viewer.getTree().getItem(c).getItem(cc).setForeground(currentColor);
            }
        }
    }

    // ---------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        viewer = new KiemTableViewer(parent, SWT.HIDE_SELECTION | SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.FULL_SELECTION);
        createColumns(viewer);
        viewer.setContentProvider(new KiemContentProvider());
        viewer.setLabelProvider(new KiemLabelProvider(this));
        viewer.setInput(kIEMInstance.getDataComponentWrapperList());

        // buildLocalToolBar(); // is done in checkForSingleEnabledMaster
        hookContextMenu();
        hookSelectionChangedAction();
        hookTreeAction();
        checkForSingleEnabledMaster(true);
        updateView(true);
    }

    // -------------------------------------------------------------------------

    /**
     * This will create the columns for the table.
     * 
     * @param viewerParam
     *            the viewer
     */
    private void createColumns(final KiemTableViewer viewerParam) {
        for (int i = 0; i < COLUMN_TITLES.length; i++) {
            TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            column.getColumn().setText(COLUMN_TITLES_COLLAPSED[i]);
            column.getColumn().setToolTipText(COLUMN_TOOLTIP_COLLAPSED[i]);
            column.getColumn().setWidth(COLUMN_BOUNDS_COLLAPSED[i]);
            if (i == 2) {
                column.setEditingSupport(new KiemComponentEditing(this, viewerParam, i));
            }
            if (i == 1) {
                column.setEditingSupport(new KiemPropertyEditing(this, viewerParam, i));
            }
        }
        Tree tree = viewerParam.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the tables columns an fold/unfold KiemProperties i.e., the value column.
     * 
     * @param collapsed
     *            the collapsed
     */
    private void refreshTableColumns(final boolean collapsed) {
        Tree tree = viewer.getTree();
        if (columnProperty == -1) {
            columnProperty = COLUMN_BOUNDS[1];
        } else {
            TreeColumn column = tree.getColumn(1);
            if (column.getWidth() > 0) {
                columnProperty = column.getWidth();
            }
        }

        if (collapsed) {
            for (int i = 0; i < COLUMN_TITLES.length; i++) {
                TreeColumn column = tree.getColumn(i);
                column.setText(COLUMN_TITLES_COLLAPSED[i]);
                if (i == 1) {
                    column.setResizable(false); // resize value not allowed
                }
                column.setToolTipText(COLUMN_TOOLTIP_COLLAPSED[i]);
            }
            TreeColumn column = tree.getColumn(1);
            column.setWidth(0);
        } else {
            for (int i = 0; i < COLUMN_TITLES.length; i++) {
                TreeColumn column = tree.getColumn(i);
                column.setText(COLUMN_TITLES[i]);
                if (i == 1) {
                    column.setResizable(true); // resize value allowed
                }
                column.setToolTipText(COLUMN_TOOLTIP[i]);
            }
            TreeColumn column = tree.getColumn(1);
            column.setWidth(columnProperty);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Hook selection changed action for the table.
     */
    private void hookSelectionChangedAction() {
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                updateEnabled();
                updateColumnsCollapsed();
                // do not refresh, otherwise the cell editor is aborted!
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Hook tree action for the table. Updates the view when the tree is collapsed or expanded in
     * order to adapt the columns.
     */
    private void hookTreeAction() {
        viewer.addTreeListener(new ITreeViewerListener() {
            public void treeCollapsed(final TreeExpansionEvent event) {
                if (event.getElement() instanceof DataComponentWrapper) {
                    // set a flag that the properties are collapsed
                    ((DataComponentWrapper) event.getElement()).setUnfolded(false);
                    updateColumnsCollapsed();
                }
                updateView(false);
            }

            public void treeExpanded(final TreeExpansionEvent event) {
                if (event.getElement() instanceof DataComponentWrapper) {
                    // set a flag that the properties are expanded
                    ((DataComponentWrapper) event.getElement()).setUnfolded(true);
                    updateColumnsCollapsed();
                }
                updateView(false);
            }
        });
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(final DoubleClickEvent event) {
                getActionEnableDisable().run();
            }
        });
        viewer.getControl().addKeyListener(new KeyListener() {
            public void keyPressed(final KeyEvent e) {
                // if user pressed delete
                if (e.keyCode == KEYBOARD_DELETE) {
                    getActionDelete().run();
                }
            }

            public void keyReleased(final KeyEvent e) {
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Hook context menu for the table and triggers the {@link #buildContextMenu(IMenuManager)}.
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
     * Builds the context menu for the table.
     * 
     * @param manager
     *            the manager
     */
    private void buildContextMenu(final IMenuManager manager) {
        manager.add(getActionEnableDisable());
        manager.add(new Separator());
        manager.add(getActionUp());
        manager.add(getActionDown());
        manager.add(new Separator());
        manager.add(getActionAdd());
        manager.add(getActionDelete());
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the local tool bar for the KiemView part.
     */
    private void buildLocalToolBar() {
        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager manager = bars.getToolBarManager();
        // first remove all entries
        manager.removeAll();

        // call soh's extension point
        addExternalContributions(manager);

        manager.add(getActionUp());
        manager.add(getActionDown());
        manager.add(new Separator());
        manager.add(getAimedStepDurationTextField());
        manager.add(getStepTextField());
        manager.add(new Separator());
        manager.add(getActionStepBack());

        if (this.currentMaster == null) {
            // add a drop down action
            DropDownAction dn = new DropDownAction(getActionStep());
            dn.add(new Separator());
            dn.add(getActionStepFMC());
            dn.add(getActionStepUser());
            manager.add(dn);
        } else {
            // simple action iff master is present
            manager.add(getActionStep());
        }

        // manager.add(getActionStep());

        // TODO: macro step implementation
        // manager.add(getActionMacroStep());

        if (this.currentMaster == null) {
            // add a drop down action
            DropDownAction dn = new DropDownAction(getActionRun());
            dn.add(new Separator());
            dn.add(getActionStepUserRun());
            manager.add(dn);
        } else {
            // simple action iff master is present
            manager.add(getActionRun());
        }

        manager.add(getActionPause());
        manager.add(getActionStop());

        // commit changes
        bars.updateActionBars();
    }

    // -------------------------------------------------------------------------

    /**
     * Add components contributed by other plugins through the ToolBarContributor extension point.
     * 
     * author soh
     * 
     * @param manager
     *            the manager where to add the components
     */
    private void addExternalContributions(final IToolBarManager manager) {
        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.kiem.toolbarContributor");

        for (IConfigurationElement element : contributors) {
            try {
                IKiemToolbarContributor contributor = (IKiemToolbarContributor) (element
                        .createExecutableExtension("class"));

                ControlContribution[] contributions = contributor.provideToolbarContributions(null);

                for (ControlContribution contribution : contributions) {
                    if (contribution != null) {
                        manager.add(contribution);
                    }
                }
            } catch (CoreException e0) {
                // TODO Auto-generated catch block
                e0.printStackTrace();
            }
        }
    }

    // -------------------------------------------------------------------------

    // /**
    // * Show message dialog with the message.
    // *
    // * @param message
    // * the message to present
    // */
    // @SuppressWarnings("unused")
    // private void showMessage(final String message) {
    // showMessage(Messages.mViewTitle, message);
    // }

    // -------------------------------------------------------------------------

    /**
     * Show an input dialog with the message, a default value and a specific title.
     * 
     * @param title
     *            the title of the dialog
     * @param message
     *            the message to present
     * @param defaultValue
     *            the default value
     * 
     * @return the string value entered or null if aborted
     */
    private String showInputDialog(final String title, final String message,
            final String defaultValue) {

        InputDialog dlg = new InputDialog(this.getSite().getShell(), title, message, defaultValue,
                null);
        dlg.open();
        if (dlg.getReturnCode() == InputDialog.OK) {
            return dlg.getValue();
        } else {
            return null;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Show message dialog with the message and a specific title.
     * 
     * @param title
     *            the title of the dialog
     * @param message
     *            the message to present
     */
    private void showMessage(final String title, final String message) {
        MessageDialog.openInformation(viewer.getControl().getShell(), Messages.mViewTitle, message);
    }

    // -------------------------------------------------------------------------

    /**
     * Show warning dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    private void showWarning(final String message) {
        MessageDialog.openWarning(viewer.getControl().getShell(), Messages.mViewTitle, message);
    }

    // -------------------------------------------------------------------------

    /**
     * Show error dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    @SuppressWarnings("unused")
    private void showError(final String message) {
        MessageDialog.openError(viewer.getControl().getShell(), Messages.mViewTitle, message);
    }

    // ---------------------------------------------------------------------------

    /**
     * Sets the all actions (tool bar buttons and context menu entires) to enabled or disabled. This
     * method is used to block any user input during the initialization phase for example.
     * 
     * @param enabled
     *            the new enabled status
     */
    public void setAllEnabled(final boolean enabled) {
        allDisabled = !enabled;
        if (getActionEnableDisable().isEnabled() != enabled) {
            getActionEnableDisable().setEnabled(enabled);
        }
        if (getActionAdd().isEnabled() != enabled) {
            getActionAdd().setEnabled(enabled);
        }
        if (getActionDelete().isEnabled() != enabled) {
            getActionDelete().setEnabled(enabled);
        }
        if (getActionUp().isEnabled() != enabled) {
            getActionUp().setEnabled(enabled);
        }
        if (getActionDown().isEnabled() != enabled) {
            getActionDown().setEnabled(enabled);
        }
        if (getActionStepBack().isEnabled() != enabled) {
            getActionStepBack().setEnabled(enabled);
        }
        if (getActionStep().isEnabled() != enabled) {
            getActionStep().setEnabled(enabled);
        }
        if (getActionMacroStep().isEnabled() != enabled) {
            getActionMacroStep().setEnabled(enabled);
        }
        if (getActionRun().isEnabled() != enabled) {
            getActionRun().setEnabled(enabled);
        }
        if (getActionPause().isEnabled() != enabled) {
            getActionPause().setEnabled(enabled);
        }
        if (getActionStop().isEnabled() != enabled) {
            getActionStop().setEnabled(enabled);
        }
        if (getAimedStepDurationTextField().isEnabled() != enabled) {
            getAimedStepDurationTextField().setEnabled(enabled);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the enabled disabled status of the following actions:<BR>
     * - up<BR>
     * - down<BR>
     * - add<BR>
     * - delete.
     */
    public void updateEnabledEnabledDisabledUpDownAddDelete() {
        Object selection = ((org.eclipse.jface.viewers.StructuredSelection) viewer.getSelection())
                .getFirstElement();
        if (kIEMInstance.getExecution() != null) {
            // execution is running
            if (getActionEnableDisable().isEnabled()) {
                getActionEnableDisable().setEnabled(false);
            }
            if (getActionAdd().isEnabled()) {
                getActionAdd().setEnabled(false);
            }
            if (getActionDelete().isEnabled()) {
                getActionDelete().setEnabled(false);
            }
            if (getActionUp().isEnabled()) {
                getActionUp().setEnabled(false);
            }
            if (getActionDown().isEnabled()) {
                getActionDown().setEnabled(false);
            }
            return;
        }

        if (!getActionAdd().isEnabled()) {
            getActionAdd().setEnabled(true);
        }
        if ((selection == null) || (selection instanceof KiemProperty)) {
            // no object selected OR property selected
            if (getActionEnableDisable().isEnabled()) {
                getActionEnableDisable().setEnabled(false);
            }
            if (getActionDelete().isEnabled()) {
                getActionDelete().setEnabled(false);
            }
            if (getActionUp().isEnabled()) {
                getActionUp().setEnabled(false);
            }
            if (getActionDown().isEnabled()) {
                getActionDown().setEnabled(false);
            }
        } else {
            DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) ((org.eclipse.jface.viewers.StructuredSelection) viewer
                    .getSelection()).getFirstElement();
            if (!getActionEnableDisable().isEnabled()) {
                getActionEnableDisable().setEnabled(true);
            }
            if (!getActionDelete().isEnabled()) {
                getActionDelete().setEnabled(true);
            }
            if (dataComponentWrapper.isEnabled()) {
                // currently enabled
                actionEnableDisable.setText(Messages.mActionDisable);
                actionEnableDisable.setToolTipText(Messages.mActionHintDisable);
            } else {
                // currently disabled
                actionEnableDisable.setText(Messages.mActionEnable);
                actionEnableDisable.setToolTipText(Messages.mActionHintEnable);
            }

            // find index of top most and bottom most selection
            ITreeSelection selections = (ITreeSelection) (org.eclipse.jface.viewers.StructuredSelection) viewer
                    .getSelection();
            int listIndexMostTop = -1;
            int listIndexMostBottom = -1;
            for (int c = 0; c < selections.size(); c++) {
                if (selections.toArray()[c] instanceof DataComponentWrapper) {
                    dataComponentWrapper = (DataComponentWrapper) selections.toArray()[c];
                    int index = kIEMInstance.getDataComponentWrapperList().indexOf(dataComponentWrapper);
                    if ((listIndexMostTop == -1) || (index < listIndexMostTop)) {
                        listIndexMostTop = index;
                    }
                    if ((listIndexMostBottom == -1) || (listIndexMostBottom < index)) {
                        listIndexMostBottom = index;
                    }
                }
            }
            if (listIndexMostTop <= 0) {
                // currently top
                if (getActionUp().isEnabled()) {
                    getActionUp().setEnabled(false);
                }
            } else {
                if (!getActionUp().isEnabled()) {
                    getActionUp().setEnabled(true);
                }
            }
            if (listIndexMostBottom >= kIEMInstance.getDataComponentWrapperList().size() - 1) {
                // currently bottom
                if (getActionDown().isEnabled()) {
                    getActionDown().setEnabled(false);
                }
            } else {
                if (!getActionDown().isEnabled()) {
                    getActionDown().setEnabled(true);
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the table view synchronously from within another thread. <BR>
     * <BR>
     * BE CAREFUL WITH USING THIS METHOD BECAUSE THIS COULD MORE EASILY PRODUCE DEADLOCKS
     */
    public void updateViewSync() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                updateView(true);
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the table view asynchronously from within another thread.
     */
    public void updateViewAsync() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                updateView(true);
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Updates steps in the steps text field asynchronously from within another thread.
     */
    public void updateStepsAsync() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (kIEMInstance.getExecution() != null) {
                    // update step counter if run
                    String steps = "" + kIEMInstance.getExecution().getSteps();
                    if (kIEMInstance.getExecution().isHistoryStep()) {
                        steps = "[" + steps + "]";
                    }
                    getStepTextField().updateTextfield(steps);
                    // update StepBackButton
                    if ((kIEMInstance.getExecution().getSteps() > 0)
                            && (!kIEMInstance.getExecution().isRunning())
                            && (getActionStep().isEnabled())) {
                        getActionStepBack().setEnabled(true);
                    } else {
                        getActionStepBack().setEnabled(false);
                    }
                } else {
                    // hide textfield otherwise
                    getStepTextField().updateTextfield(null);
                }
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the table if it is not busy.
     * 
     * @param deselect
     *            a table entry
     */
    protected void updateView(final boolean deselect) {
        // do not update if not necessary
        if (!viewer.isBusy()) {
            updateColumnsCollapsed();
            viewer.refresh();
            refreshEnabledDisabledTextColors();
            if (deselect) {
                viewer.setSelection(null);
            }
            updateEnabled();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Triggers the fold/unfold of the property value table column.
     */
    private void updateColumnsCollapsed() {
        // if selected update columns
        ISelection selection = viewer.getSelection();
        if (selection != null) {
            Object obj = ((IStructuredSelection) selection).getFirstElement();
            if (obj != null) {
                if ((obj instanceof KiemProperty)
                        || ((obj instanceof DataComponentWrapper)
                                && (((DataComponentWrapper) obj).getProperties() != null)
                                && (((DataComponentWrapper) obj).getProperties().length > 0) && (((DataComponentWrapper) obj)
                                .isUnfolded()))) {
                    // unfolded - show property headers
                    refreshTableColumns(false);
                } else {
                    // collapsed
                    refreshTableColumns(true);
                }
            } else {
                // default (nothing selected) also collapsed
                refreshTableColumns(true);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the enableness of the actions that control the execution. If a master is present, the
     * this functionality may be implemented by him.
     */
    private void updateEnabled() {
        updateStepsAsync();
        updateEnabledEnabledDisabledUpDownAddDelete();
        if (currentMaster != null) {
            if (!currentMaster.isMasterImplementingGUI()) {
                // if the master is not implementing the GUI
                if (getActionStepBack().isEnabled()) {
                    getActionStepBack().setEnabled(false);
                }
                if (getActionStep().isEnabled()) {
                    getActionStep().setEnabled(false);
                }
                if (getActionMacroStep().isEnabled()) {
                    getActionMacroStep().setEnabled(false);
                }
                if (getActionRun().isEnabled()) {
                    getActionRun().setEnabled(false);
                }
                if (getActionPause().isEnabled()) {
                    getActionPause().setEnabled(false);
                }
                if (getActionStop().isEnabled()) {
                    getActionStop().setEnabled(false);
                }
                if (getAimedStepDurationTextField().isEnabled()) {
                    getAimedStepDurationTextField().setEnabled(false);
                }
                return;
            } else {
                // master is responsible for enabling/disabling
                // buttons
                getActionStepBack()
                        .setEnabled(
                                currentMaster
                                        .masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_STEPBACK));
                getActionStep().setEnabled(
                        currentMaster.masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_STEP));
                getActionMacroStep().setEnabled(
                        currentMaster
                                .masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_MACROSTEP));
                getActionMacroStep().setEnabled(
                        currentMaster.masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_RUN));
                getActionPause().setEnabled(
                        currentMaster.masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_PAUSE));
                getActionStop().setEnabled(
                        currentMaster.masterGUIisEnabled(AbstractDataComponent.MASTER_CMD_STOP));
                // getActionStepBack().setEnabled(currentMaster.masterGUIisEnabledStepBack());
                // getActionStep().setEnabled(currentMaster.masterGUIisEnabledStep());
                // getActionMacroStep().setEnabled(currentMaster.masterGUIisEnabledMacroStep());
                // getActionRun().setEnabled(currentMaster.masterGUIisEnabledRun());
                // getActionPause().setEnabled(currentMaster.masterGUIisEnabledPause());
                // getActionStop().setEnabled(currentMaster.masterGUIisEnabledStop());
                getAimedStepDurationTextField().setEnabled(false);
                return;
            }
        }
        if (allDisabled) {
            return;
        }
        if (kIEMInstance.getExecution() == null) {
            // execution is stopped
            if (getActionStepBack().isEnabled()) {
                getActionStepBack().setEnabled(false);
            }
            if (!getActionStep().isEnabled()) {
                getActionStep().setEnabled(true);
            }
            if (!getActionMacroStep().isEnabled()) {
                getActionMacroStep().setEnabled(true);
            }
            if (!getActionRun().isEnabled()) {
                getActionRun().setEnabled(true);
            }
            if (!getActionPause().isEnabled()) {
                getActionPause().setEnabled(true);
            }
            if (getActionStop().isEnabled()) {
                getActionStop().setEnabled(false);
            }
            if (!getActionStepBack().isEnabled()) {
                getAimedStepDurationTextField().setEnabled(true);
            }
        } else if (kIEMInstance.getExecution().isRunning()) {
            // execution is running
            if (getActionStepBack().isEnabled()) {
                getActionStepBack().setEnabled(false);
            }
            if (getActionStep().isEnabled()) {
                getActionStep().setEnabled(false);
            }
            if (getActionMacroStep().isEnabled()) {
                getActionMacroStep().setEnabled(false);
            }
            if (getActionRun().isEnabled()) {
                getActionRun().setEnabled(false);
            }
            if (!getActionPause().isEnabled()) {
                getActionPause().setEnabled(true);
            }
            if (!getActionStop().isEnabled()) {
                getActionStop().setEnabled(true);
            }
            if (!getAimedStepDurationTextField().isEnabled()) {
                getAimedStepDurationTextField().setEnabled(true);
            }
        } else {
            // execution is paused
            if (kIEMInstance.getExecution().getSteps() > 0) {
                if (!getActionStepBack().isEnabled()) {
                    getActionStepBack().setEnabled(true);
                }
            } else {
                if (getActionStepBack().isEnabled()) {
                    getActionStepBack().setEnabled(false);
                }
            }
            if (!getActionStep().isEnabled()) {
                getActionStep().setEnabled(true);
            }
            if (!getActionMacroStep().isEnabled()) {
                getActionMacroStep().setEnabled(true);
            }
            if (!getActionRun().isEnabled()) {
                getActionRun().setEnabled(true);
            }
            if (getActionPause().isEnabled()) {
                getActionPause().setEnabled(false);
            }
            if (!getActionStop().isEnabled()) {
                getActionStop().setEnabled(true);
            }
            if (!getAimedStepDurationTextField().isEnabled()) {
                getAimedStepDurationTextField().setEnabled(true);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action add. It calls the AddDataComponentDialog to let the user select a
     * DataComponent to add. This will be added (and hence instantiated) by calling the
     * {@link de.cau.cs.kieler.sim.kiem.KiemPlugin#addTodataComponentWrapperList} method of the KIEM
     * plug-in.
     * 
     * @return the action add
     */
    private Action getActionAdd() {
        if (actionAdd != null) {
            return actionAdd;
        }
        actionAdd = new Action() {
            public void run() {
                AddDataComponentDialog addDialog = new AddDataComponentDialog(viewer.getControl()
                        .getShell());
                addDialog.setComponentExList(kIEMInstance.getDataComponentWrapperList());
                addDialog.setComponentList(KiemPlugin.getDefault().getDataComponentList());
                if (addDialog.open() == 0) {
                    List<AbstractDataComponent> selected = addDialog.getSelectedComponents();
                    if (selected != null) {
                        for (int c = 0; c < selected.size(); c++) {
                            kIEMInstance.addTodataComponentWrapperList(selected.get(c));
                        }
                        setDirty(true);
                        checkForSingleEnabledMaster(false);
                        updateView(true);
                    }
                }
            }
        };
        actionAdd.setText(Messages.mActionAdd);
        actionAdd.setToolTipText(Messages.mActionHintAdd);
        actionAdd.setImageDescriptor(KiemIcons.IMGDESCR_ADD);
        return actionAdd;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action delete. Deletes all selected DataComponentWrappers from the
     * DataComponentWrapperList.
     * 
     * @return the action delete
     */
    private Action getActionDelete() {
        if (actionDelete != null) {
            return actionDelete;
        }
        actionDelete = new Action() {
            public void run() {
                // do nothing if execution
                if (kIEMInstance.getExecution() != null) {
                    return;
                }
                IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                for (int c = 0; c < selection.size(); c++) {
                    DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) selection
                            .toArray()[c];
                    if (kIEMInstance.getDataComponentWrapperList().contains(dataComponentWrapper)) {
                        dataComponentWrapper.getDataComponent().finalize();
                        kIEMInstance.getDataComponentWrapperList().remove(dataComponentWrapper);
                        setDirty(true);
                        checkForSingleEnabledMaster(false);
                        // call garbage collector
                        System.gc();
                    }
                }
                updateView(true);
            }
        };
        actionDelete.setText(Messages.mActionDelete);
        actionDelete.setToolTipText(Messages.mActionHintDelete);
        actionDelete.setImageDescriptor(KiemIcons.IMGDESCR_DELETE);
        return actionDelete;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action enable disable. Enables or disables all selected DataComponentWrappers.
     * 
     * @return the action enable disable
     */
    private Action getActionEnableDisable() {
        if (actionEnableDisable != null) {
            return actionEnableDisable;
        }
        actionEnableDisable = new Action() {
            public void run() {
                // do not change if executing
                if (kIEMInstance.getExecution() != null) {
                    return;
                }
                // this may not always be applicable e.g., if a property is selected
                try {
                    DataComponentWrapper firstDataComponentWrapper = (DataComponentWrapper) ((org.eclipse.jface.viewers.StructuredSelection) viewer
                            .getSelection()).getFirstElement();
                    boolean enabledDisabled = !firstDataComponentWrapper.isEnabled();

                    IStructuredSelection selection = (org.eclipse.jface.viewers.StructuredSelection) viewer
                            .getSelection();
                    for (int c = 0; c < selection.size(); c++) {
                        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) selection
                                .toArray()[c];
                        dataComponentWrapper.setEnabled(enabledDisabled);
                        setDirty(true);
                    }
                    checkForSingleEnabledMaster(false, firstDataComponentWrapper);
                    updateView(true);
                } catch (Exception e) {
                    // if wrong component (property), do not enable == ignore command
                }
            }
        };
        actionEnableDisable.setText(Messages.mActionEnable);
        actionEnableDisable.setToolTipText(Messages.mActionHintEnable);
        return actionEnableDisable;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action up. Schedules all selected DataComponentWrappers before their current
     * position (if possible).
     * 
     * @return the action up
     */
    private Action getActionUp() {
        if (actionUp != null) {
            return actionUp;
        }
        actionUp = new Action() {
            public void run() {
                ITreeSelection selections = (ITreeSelection) (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                // go thru list from up to down!
                for (int c = 0; c < selections.size(); c++) {
                    if (selections.toArray()[c] instanceof DataComponentWrapper) {
                        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) selections
                                .toArray()[c];
                        int listIndex = kIEMInstance.getDataComponentWrapperList().indexOf(
                                dataComponentWrapper);
                        if (listIndex > 0) {
                            kIEMInstance.getDataComponentWrapperList().remove(listIndex);
                            kIEMInstance.getDataComponentWrapperList().add(listIndex - 1,
                                    dataComponentWrapper);
                            setDirty(true);
                        }
                    } // end if DataComponent (not property)
                }
                viewer.refresh();
                refreshEnabledDisabledTextColors();
                updateView(false);
            }
        };
        actionUp.setText(Messages.mActionUp);
        actionUp.setToolTipText(Messages.mActionHintUp);
        actionUp.setImageDescriptor(KiemIcons.IMGDESCR_UP);
        actionUp.setDisabledImageDescriptor(KiemIcons.IMGDESCR_UP_DISABLED);
        return actionUp;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action down. Schedules all selected DataComponentWrappers behind their current
     * positions (if possible).
     * 
     * @return the action down
     */
    private Action getActionDown() {
        if (actionDown != null) {
            return actionDown;
        }
        actionDown = new Action() {
            public void run() {
                ITreeSelection selections = (ITreeSelection) (org.eclipse.jface.viewers.StructuredSelection) viewer
                        .getSelection();
                // go thru list from down to up!
                for (int c = selections.size() - 1; c >= 0; c--) {
                    if (selections.toArray()[c] instanceof DataComponentWrapper) {
                        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) selections
                                .toArray()[c];
                        int listIndex = kIEMInstance.getDataComponentWrapperList().indexOf(
                                dataComponentWrapper);
                        if (listIndex < kIEMInstance.getDataComponentWrapperList().size() - 1) {
                            kIEMInstance.getDataComponentWrapperList().remove(listIndex);
                            kIEMInstance.getDataComponentWrapperList().add(listIndex + 1,
                                    dataComponentWrapper);
                            setDirty(true);
                        }
                    } // if DataComponent (not Property)
                }
                viewer.refresh();
                refreshEnabledDisabledTextColors();
                updateView(false);
            }
        };
        actionDown.setText(Messages.mActionDown);
        actionDown.setToolTipText(Messages.mActionHintDown);
        actionDown.setImageDescriptor(KiemIcons.IMGDESCR_DOWN);
        actionDown.setDisabledImageDescriptor(KiemIcons.IMGDESCR_DOWN_DISABLED);
        return actionDown;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action step back. Triggers the execution to make a step back. If a master is
     * present, the this functionality may be implemented by him.
     * 
     * @return the action step back
     */
    private Action getActionStepBack() {
        if (actionStepBack != null) {
            return actionStepBack;
        }
        actionStepBack = new Action() {
            public void run() {
                // only update if first step in execution
                boolean mustUpdate = (kIEMInstance.getExecution() == null);
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_STEPBACK);
                    // currentMaster.masterGUIstepBack();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().stepBackExecutionSync();
                    }
                }
                if (mustUpdate) {
                    updateView(true);
                }
            }
        };
        actionStepBack.setText(Messages.mActionStepBack);
        actionStepBack.setToolTipText(Messages.mActionHintStepBack);
        actionStepBack.setImageDescriptor(KiemIcons.IMGDESCR_STEPBACK);
        actionStepBack.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEPBACK_DISABLED);
        return actionStepBack;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action step forward to the most current step. Triggers the execution to make a step
     * forward to the most current one. This action is only available if no master is present.
     * 
     * @return the action step FMC
     */
    private Action getActionStepFMC() {
        if (actionStepFMC != null) {
            return actionStepFMC;
        }
        actionStepFMC = new Action() {
            public void run() {
                // only update if first step in execution
                boolean mustUpdate = (kIEMInstance.getExecution() == null);
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // unsupported
                    currentMaster.noop();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().stepExecutionPause(
                                kIEMInstance.getExecution().getMaximumSteps());
                    }
                }
                if (mustUpdate) {
                    updateView(true);
                }
            }
        };
        actionStepFMC.setText(Messages.mActionStepFMC);
        actionStepFMC.setToolTipText(Messages.mActionHintStepFMC);
        actionStepFMC.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
        actionStepFMC.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
        return actionStepFMC;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action user defined step. Triggers the execution to make a step forward or backward
     * to the one that the user set in the dialog window. This action is only available if no master
     * is present.
     * 
     * @return the user defined action step
     */
    private Action getActionStepUser() {
        if (actionStepUser != null) {
            return actionStepUser;
        }
        actionStepUser = new Action() {
            public void run() {
                // only update if first step in execution
                boolean mustUpdate = (kIEMInstance.getExecution() == null);
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // unsupported
                    currentMaster.noop();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        String value = showInputDialog(Messages.mActionStepUserDialogTitle,
                                Messages.mActionStepUserDialogText, ""
                                        + kIEMInstance.getExecution().getMaximumSteps());
                        if (value != null) {
                            try {
                                long step = Long.parseLong(value);
                                kIEMInstance.getExecution().stepExecutionPause(step);
                            } catch (Exception e) {
                                // no error should appear here
                            }
                        }
                    }
                }
                if (mustUpdate) {
                    updateView(true);
                }
            }
        };
        actionStepUser.setText(Messages.mActionStepUser);
        actionStepUser.setToolTipText(Messages.mActionHintStepUser);
        actionStepUser.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
        actionStepUser.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
        return actionStepUser;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action user run defined step. Triggers the execution to run forward or jump backward
     * to the step that the user set in the dialog window. This action is only available if no
     * master is present.
     * 
     * @return the user defined action step
     */
    private Action getActionStepUserRun() {
        if (actionRunUser != null) {
            return actionRunUser;
        }
        actionRunUser = new Action() {
            public void run() {
                // only update if first step in execution
                boolean mustUpdate = (kIEMInstance.getExecution() == null);
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // unsupported
                    currentMaster.noop();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        String value = showInputDialog(Messages.mActionRunUserDialogTitle,
                                Messages.mActionRunUserDialogText, ""
                                        + kIEMInstance.getExecution().getMaximumSteps());
                        if (value != null) {
                            try {
                                long step = Long.parseLong(value);
                                kIEMInstance.getExecution().runExecutionPause(step);
                            } catch (Exception e) {
                                // no error should appear here
                            }
                        }
                    }
                }
                if (mustUpdate) {
                    updateView(true);
                }
            }
        };
        actionRunUser.setText(Messages.mActionRunUser);
        actionRunUser.setToolTipText(Messages.mActionHintRunUser);
        actionRunUser.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
        actionRunUser.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
        return actionRunUser;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action step. Triggers the execution to make a step. If a master is present, the this
     * functionality may be implemented by him.
     * 
     * @return the action step
     */
    private Action getActionStep() {
        if (actionStep != null) {
            return actionStep;
        }
        actionStep = new Action() {
            public void run() {
                // only update if first step in execution
                boolean mustUpdate = (kIEMInstance.getExecution() == null);
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_STEP);
                    // currentMaster.masterGUIstep();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().stepExecutionSync();
                    }
                }
                if (mustUpdate) {
                    updateView(true);
                }
            }
        };
        actionStep.setText(Messages.mActionStep);
        actionStep.setToolTipText(Messages.mActionHintStep);
        actionStep.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
        actionStep.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
        return actionStep;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action macro step. Triggers the execution to make a macro step. If a master is
     * present, the this functionality may be implemented by him.
     * 
     * @return the action macro step
     */
    private Action getActionMacroStep() {
        if (actionMacroStep != null) {
            return actionMacroStep;
        }
        actionMacroStep = new Action() {
            public void run() {
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_MACROSTEP);
                    // currentMaster.masterGUImacroStep();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().macroStepExecutionSync();
                    }
                }
                updateView(true);
            }
        };
        actionMacroStep.setText(Messages.mActionMacroStep);
        actionMacroStep.setToolTipText(Messages.mActionHintMacroStep);
        actionMacroStep.setImageDescriptor(KiemIcons.IMGDESCR_MACROSTEP);
        actionMacroStep.setDisabledImageDescriptor(KiemIcons.IMGDESCR_MACROSTEP_DISABLED);
        return actionMacroStep;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action run. Triggers the execution to go into run mode. If a master is present, the
     * this functionality may be implemented by him.
     * 
     * @return the action run
     */
    private Action getActionRun() {
        if (actionRun != null) {
            return actionRun;
        }
        actionRun = new Action() {
            public void run() {
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_RUN);
                    // currentMaster.masterGUIrun();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().runExecutionSync();
                    }
                }
                updateView(true);
            }
        };
        actionRun.setText(Messages.mActionHintRun);
        actionRun.setToolTipText(Messages.mActionHintRun);
        actionRun.setImageDescriptor(KiemIcons.IMGDESCR_RUN);
        actionRun.setDisabledImageDescriptor(KiemIcons.IMGDESCR_RUN_DISABLED);
        return actionRun;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action pause. Triggers the execution to pause. If a master is present, the this
     * functionality may be implemented by him.
     * 
     * @return the action pause
     */
    private Action getActionPause() {
        if (actionPause != null) {
            return actionPause;
        }
        actionPause = new Action() {
            public void run() {
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_PAUSE);
                    // currentMaster.masterGUIpause();
                } else {
                    // otherwise default implementation
                    if (kIEMInstance.initExecution()) {
                        kIEMInstance.getExecution().pauseExecutionSync();
                    }
                }
                updateView(true);
            }
        };
        actionPause.setText(Messages.mActionPause);
        actionPause.setToolTipText(Messages.mActionHintPause);
        actionPause.setImageDescriptor(KiemIcons.IMGDESCR_PAUSE);
        actionPause.setDisabledImageDescriptor(KiemIcons.IMGDESCR_PAUSE_DISABLED);
        return actionPause;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets action stop. Triggers the execution to stop. If a master is present, the this
     * functionality may be implemented by him.<BR>
     * All collected timing data will be presented to the user and the execution is being released.
     * A master will also have to do this.
     * 
     * @return the action stop
     */
    private Action getActionStop() {
        if (actionStop != null) {
            return actionStop;
        }
        actionStop = new Action() {
            public void run() {
                if ((currentMaster != null) && currentMaster.isMasterImplementingGUI()) {
                    // if a master implements the action
                    currentMaster.masterGUI(AbstractDataComponent.MASTER_CMD_STOP);
                    // currentMaster.masterGUIstop();
                } else {
                    long executionTime = 0;
                    long minStepDuration = 0;
                    long wavStepDuration = 0;
                    long aveStepDuration = 0;
                    long maxStepDuration = 0;
                    long steps = 0;
                    long aimedStepDuration = 0;

                    // otherwise default implementation
                    if (kIEMInstance.getExecution() != null) {
                        kIEMInstance.getExecution().stopExecutionSync();

                        // get results
                        executionTime = kIEMInstance.getExecution().getExecutionDuration();
                        minStepDuration = kIEMInstance.getExecution().getMinimumStepDuration();
                        wavStepDuration = kIEMInstance.getExecution()
                                .getWeightedAverageStepDuration();
                        aveStepDuration = kIEMInstance.getExecution().getAverageStepDuration();
                        maxStepDuration = kIEMInstance.getExecution().getMaximumStepDuration();
                        steps = kIEMInstance.getExecution().getMaximumSteps();
                        aimedStepDuration = kIEMInstance.getExecution().getAimedStepDuration();
                    }

                    kIEMInstance.setExecution(null);
                    updateView(true);

                    // show execution results
                    showMessage(Messages.mTimingResultsTitle, Messages.mTimingResultsNumberOfSteps
                            + +steps + "\n" + Messages.mTimingResultsOverallExecutionTime
                            + +executionTime + " ms\n\n" + Messages.mTimingResultsAimedStepDuration
                            + +aimedStepDuration + " ms\n"
                            + Messages.mTimingResultsMinimumStepDuration + +minStepDuration
                            + " ms\n" + Messages.mTimingResultsWheightedAverageStepDuration
                            + +wavStepDuration + " ms\n"
                            + Messages.mTimingResultsAverageStepDuration + +aveStepDuration
                            + " ms\n" + Messages.mTimingResultsMaximumStepDuration
                            + +maxStepDuration + " ms");
                }
                updateView(true);
            }
        };
        actionStop.setText(Messages.mActionStop);
        actionStop.setToolTipText(Messages.mActionHintStop);
        actionStop.setImageDescriptor(KiemIcons.IMGDESCR_STOP);
        actionStop.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STOP_DISABLED);
        return actionStop;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the aimed step duration text field.
     * 
     * @return the aimed step duration text field
     */
    public AimedStepDurationTextField getAimedStepDurationTextField() {
        if (aimedStepDurationTextField != null) {
            return aimedStepDurationTextField;
        }
        aimedStepDurationTextField = new AimedStepDurationTextField(kIEMInstance);
        return aimedStepDurationTextField;
    }

    // -------------------------------------------------------------------------

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
     * Passing the focus request to the viewer's control. This is necessary be- cause KiemView
     * extends the ViewPart class.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    // -------------------------------------------------------------------------

    /**
     * Check for single enabled master. This is just a wrapper for the method
     * {@link #checkForSingleEnabledMaster(boolean, DataComponentWrapper)}.
     * 
     * @param silent
     *            if true, the warning dialog will be suppressed
     * 
     */
    public void checkForSingleEnabledMaster(final boolean silent) {
        checkForSingleEnabledMaster(silent, null);
    }

    // -------------------------------------------------------------------------

    /**
     * Check the current selection (enabled DataComponentWrappers) for a just a single enabled
     * master. If any second enabled master is found it will be disabled and the user is notified
     * with a warning dialog - depending on the silent-flag.
     * 
     * @param silent
     *            if true, the warning dialog will be suppressed
     * @param dataComponentWrapper
     *            the DataComponentWrapper that is allowed to be the master or null
     */
    public void checkForSingleEnabledMaster(final boolean silent,
            final DataComponentWrapper dataComponentWrapper) {
        currentMaster = null;
        if (dataComponentWrapper != null && dataComponentWrapper.isMaster() && dataComponentWrapper.isEnabled()) {
            // preset NEW selection
            currentMaster = dataComponentWrapper;
        }

        for (int c = 0; c < kIEMInstance.getDataComponentWrapperList().size(); c++) {
            DataComponentWrapper dataComponentTemp = kIEMInstance.getDataComponentWrapperList()
                    .get(c);
            dataComponentTemp.getDataComponent().masterSetKIEMInstances(null, null);

            if (dataComponentTemp.isMaster() && dataComponentTemp.isEnabled()
                    && dataComponentTemp != currentMaster) {
                if (currentMaster == null) {
                    currentMaster = dataComponentTemp;
                } else {
                    if (!silent) {
                        showWarning(Messages.mWarningAtMostOneMaster.replace("%COMPONENTNAME",
                                dataComponentTemp.getName()));
                    }
                    // disable it//
                    dataComponentTemp.setEnabled(false);
                    // if this method is called during initial loading
                    // then we do not want to set the dirty flag
                    if (!silent) {
                        setDirty(true);
                    }
                    this.viewer.refresh();
                    this.refreshEnabledDisabledTextColors();
                }
            }
        }
        if (currentMaster != null) {
            currentMaster.getDataComponent().masterSetKIEMInstances(kIEMInstance, this);
        }
        // rebuild view toolbar buttons
        buildLocalToolBar();
    }

    // -------------------------------------------------------------------------
    // MAKE PROPERTIES SAVEABLE
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doSave(final IProgressMonitor monitor) {
        if (currentFile == null) {
            this.doSaveAs();
            return;
        }
        try {
            URI fileURI = URI.createPlatformResourceURI(currentFile.toOSString(), true);

            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            OutputStream outputStream = uriConverter.createOutputStream(fileURI);
            ObjectOutputStream out = new ObjectOutputStream(outputStream);

            out.writeObject(KiemPlugin.getDefault().getDataComponentWrapperList());

            out.close();
            outputStream.close();
            KiemPlugin.getDefault().notifyEventListeners(currentFile, KiemEvent.SAVE);
        } catch (IOException e) {
            // TODO: error behavior
            e.printStackTrace();
        }
        setDirty(false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the file name (without possible extension) of the currently opened file, if any, or
     * "noname" otherwise.
     * 
     * @return the active project name
     */
    public String getActiveProjectName() {
        try {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage();
            String name = page.getActiveEditor().getEditorInput().getName();
            int i = name.indexOf(".");
            if (i > -1) {
                name = name.substring(0, i);
            }
            return name;
        } catch (Exception e) {
            return "noname";
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doSaveAs() {
        SaveAsDialog dlg = new SaveAsDialog(this.getViewSite().getShell());
        dlg.setBlockOnOpen(true);
        dlg.setOriginalName(getActiveProjectName() + ".execution");
        if (dlg.open() == SaveAsDialog.OK) {
            this.currentFile = dlg.getResult();
            this.doSave(null);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isDirty() {
        // isDirty is set to true iff table or properties are modified
        return isDirty;

    }

    // -------------------------------------------------------------------------

    /**
     * Sets the dirty flag to true or false. It should be set to true whenever the view table is
     * modified (add or delete a DataComponent) or a property of a DataComponent is changed. It
     * should be reset to false whenever the user saves the execution.
     * 
     * @param isDirtyParam
     *            the new dirty
     */
    public void setDirty(final boolean isDirtyParam) {
        this.isDirty = isDirtyParam;
        firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isSaveAsAllowed() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isSaveOnCloseNeeded() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int promptToSaveOnClose() {
        if (this.isDirty) {
            String fileName = "noname.execution";
            if (this.currentFile != null) {
                fileName = this.currentFile.toFile().getName();
            }

            String[] buttons = { "Yes", "No", "Cancel" };

            MessageDialog dlg = new MessageDialog(viewer.getControl().getShell(), "Save Execution",
                    null, "'" + fileName + "' has been modified. Save changes?",
                    MessageDialog.QUESTION, buttons, 2);

            int answer = dlg.open();

            if (answer == 0) { // YES
                // try to save or open saveas dialog
                this.doSave(null);
                // check is saved
                if (this.isDirty()) {
                    // user has not saved (e.g. canceled saving)
                    return ISaveablePart2.CANCEL;
                } else {
                    // user has saved, its safe to close view
                    return ISaveablePart2.NO;
                }
            } else if (answer == 1) { // NO
                return ISaveablePart2.NO;
            }
            // CANCEL
            return ISaveablePart2.CANCEL;
        } else {
            return ISaveablePart2.NO;
        }
    }

}
