/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;
import de.cau.cs.kieler.sim.kiem.ui.AddDataComponentDialog;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;
import de.cau.cs.kieler.sim.kiem.ui.StepTextField;

/**
 * The Class KiemView is only instantiated once when the view part is
 * registered in the Eclipse IDE. It holds the DataComponent table list
 * view and buttons to control the execution.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemView extends ViewPart {
	
	/** The viewer table of DataComponentExs. */
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
	private DataComponentEx currentMaster;

	/** The KIEM instance to e.g., access the execution */
	public KiemPlugin KIEMInstance;
	
	/** The Constant columnBoundsCollapsed - no properties visible. */
	public static final int[] columnBoundsCollapsed 
								= { 220, 0 , 20, 120, 50, 50};
	
	/** The Constant columnBounds - properties visible. */
	public static final int[] columnBounds 
								= { 220, 200 , 20, 120, 50, 50};
	
	/** The column property user defined width, initially -1. */
	public int columnProperty = -1;

	/** The Constant columnTitlesCollapsed - properties not visible. */
	public static final String[] columnTitlesCollapsed = { 
			"Component Name",
			"Value", 
			"",
			"Type", 
			"Master"};
	
	/** The Constant columnTitles - properties visible. */
	public static final String[] columnTitles = { 
		"Component Name / Key",
		"Value", 
		"",
		"Type", 
		"Master"};
	
	/** The Constant columnToolTipCollapsed - properties not visible. */
	public static final String[] columnToolTipCollapsed = { 
			 "Name of Data Component",
			 "Property Value",
			 "Enabled/Disabled",
 			 "Producer, Observer or Initialization Data Component", 
 			 "Is a Master that leads Execution"};
	
	/** The Constant columnToolTip - properties visible. */
	public static final String[] columnToolTip = { 
		 "Property Key",
		 "Property Value",
		 "Enabled/Disabled",
		 "Producer, Observer or Initialization Data Component", 
		 "Is a Master that leads Execution"};
	
	/** True if all actions are (temporary) disabled. */
	private boolean allDisabled;

	//-------------------------------------------------------------------------	

	/**
	 * The constructor of the Kiem View instance.
	 */
	public KiemView() {
		KIEMInstance = KiemPlugin.getDefault();
		//set KIEMViewInstance of KiemPlugin so that we can update the
		//view from within the execution
		KIEMInstance.setKIEMViewInstance(this);
		this.currentMaster = null;
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Refreshes the text colors of enabled or master components. Disabled
	 * DataComponents will get a gray text color, enabled master components
	 * are indicated by a blue text color.
	 */
	private void refreshEnabledDisabledTextColors() {
		//change the text color (black or gray)
		Color colorEnabled  = new Color(null, new RGB(0,0,0));
		Color colorDisabled = new Color(null, new RGB(150,150,150));
		Color colorMaster   = new Color(null, new RGB(0,0,255));
		for (int c = 0; c < KIEMInstance.getDataComponentExList().size(); c++) {
			DataComponentEx dataComponentEx = 
				KIEMInstance.getDataComponentExList().get(c);
			//select color
			Color currentColor = colorDisabled;
			if (dataComponentEx.isEnabled()) {
				currentColor = colorEnabled;
				if (dataComponentEx.isMaster()) {
					currentColor = colorMaster;
				}
			}
			
			//update text colors
			viewer.getTree().getItem(c).setForeground(currentColor);
			//enable sub items
			int subItemCnt = viewer.getTree().getItem(c).getItemCount();
			for (int cc = 0; cc < subItemCnt; cc ++) {
				viewer.getTree().getItem(c).getItem(cc).setForeground(currentColor);
			}
			
		}
	}
	
   //---------------------------------------------------------------------------	
	
	/* (non-Javadoc)
    * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
    */
   public void createPartControl(Composite parent) {
		viewer = new KiemTableViewer(parent, SWT.HIDE_SELECTION | 
				SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		viewer.setContentProvider(new KiemContentProvider());
		viewer.setLabelProvider(new KiemLabelProvider(this));
		viewer.setInput(KIEMInstance.getDataComponentExList());

		buildLocalToolBar();
		hookContextMenu();
		hookSelectionChangedAction();
		hookTreeAction();
		checkForSingleEnabledMaster(true);
		updateView(true);
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * This will create the columns for the table.
	 * 
	 * @param viewer the viewer
	 */
	private void createColumns(KiemTableViewer viewer) {
		for (int i = 0; i < columnTitles.length; i++) {
			TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			column.getColumn().setText(columnTitlesCollapsed[i]);
			column.getColumn().setToolTipText(columnToolTipCollapsed[i]);
			column.getColumn().setWidth(columnBoundsCollapsed[i]);
			if (i == 2)
				column.setEditingSupport(new KiemComponentEditing(this, viewer, i));
			if (i == 1)
				column.setEditingSupport(new KiemPropertyEditing(this, viewer, i));
		}
		Tree tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Refreshes the tables columns an fold/unfold KiemProperties
	 * i.e., the value column.
	 * 
	 * @param collapsed the collapsed
	 */
	private void refreshTableColumns(boolean collapsed) {
		Tree tree = viewer.getTree();
		if (columnProperty == -1) {
			columnProperty = columnBounds[1];
		}
		else {
			TreeColumn column = tree.getColumn(1);
			if (column.getWidth() > 0)
				columnProperty = column.getWidth();
		}
		
		if (collapsed) {
			for (int i = 0; i < columnTitles.length; i++) {
				TreeColumn column = tree.getColumn(i);
				column.setText(columnTitlesCollapsed[i]);
				if (i == 1)
					column.setResizable(false); //resize value not allowed
				column.setToolTipText(columnToolTipCollapsed[i]);
			}
			TreeColumn column = tree.getColumn(1);
			column.setWidth(0);
		}
		else {
			for (int i = 0; i < columnTitles.length; i++) {
				TreeColumn column = tree.getColumn(i);
				column.setText(columnTitles[i]);
				if (i == 1)
					column.setResizable(true); //resize value allowed
				column.setToolTipText(columnToolTip[i]);
			}
			TreeColumn column = tree.getColumn(1);
			column.setWidth(columnProperty);
		}
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Hook selection changed action for the table.
	 */
	private void hookSelectionChangedAction() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateEnabled();
				updateColumnsCollapsed();
				//do not refresh, otherwise the cell editor is aborted!
			}
		});
	}

	//-------------------------------------------------------------------------	

	/**
	 * Hook tree action for the table. Updates the view when the tree is
	 * collapsed or expanded in order to adapt the columns.
	 */
	private void hookTreeAction() {
		viewer.addTreeListener(new ITreeViewerListener() {
			public void treeCollapsed(TreeExpansionEvent event) {
				updateView(false);
			}
			public void treeExpanded(TreeExpansionEvent event) {
				updateView(false);
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				getActionEnableDisable().run();
			}
		});
		viewer.getControl().addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				//if user pressed delete
				if (e.keyCode == 127) {
					getActionDelete().run();
				}
			}
			public void keyReleased(KeyEvent e) {
			}
		});
	}

	//-------------------------------------------------------------------------	

	/**
	 * Hook context menu for the table and triggers the
	 * {@link #buildContextMenu(IMenuManager)}.
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				buildContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	//-------------------------------------------------------------------------	

	/**
	 * Builds the context menu for the table
	 * 
	 * @param manager the manager
	 */
	private void buildContextMenu(IMenuManager manager) {
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
		
	/**
	 * Builds the local tool bar for the Kiem View part.
	 */
	private void buildLocalToolBar() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		manager.add(getAimedStepDurationTextField());
		manager.add(getStepTextField());
		manager.add(new Separator());
		manager.add(getActionStepBack());
		manager.add(getActionStep());
		//TODO: macro step implementation
		//manager.add(getActionMacroStep());
		manager.add(getActionRun());
		manager.add(getActionPause());
		manager.add(getActionStop());
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Show message dialog with the message.
	 * 
	 * @param message the message to present
	 */
	@SuppressWarnings("unused")
	private void showMessage(String message) {
		showMessage(Messages.ViewTitle,message);
	}

	/**
	 * Show message dialog with the message and a specific title.
	 * 
	 * @param title the title of the dialog
	 * @param message the message to present
	 */
	private void showMessage(String title, String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			title,
			message);
	}
	
	/**
	 * Show warning dialog with the message.
	 * 
	 * @param message the message to present
	 */
	private void showWarning(String message) {
		MessageDialog.openWarning(
			viewer.getControl().getShell(),
			Messages.ViewTitle,
			message);
	}
	
	/**
	 * Show error dialog with the message.
	 * 
	 * @param message the message to present
	 */
	@SuppressWarnings("unused")
	private void showError(String message) {
		MessageDialog.openError(
			viewer.getControl().getShell(),
			Messages.ViewTitle,
			message);
	}
	
	//---------------------------------------------------------------------------	
	
	/**
	 * Sets the all actions (tool bar buttons and context menu entires) 
	 * to enabled or disabled. This method is used to block any user input
	 * during the initialization phase for example.
	 * 
	 * @param enabled the new enabled status
	 */
	private void setAllEnabled(boolean enabled) {
		allDisabled = !enabled;
		if (getActionEnableDisable().isEnabled() != enabled)
			getActionEnableDisable().setEnabled(enabled);
		if (getActionAdd().isEnabled() != enabled)
			getActionAdd().setEnabled(enabled);
		if (getActionDelete().isEnabled() != enabled)
			getActionDelete().setEnabled(enabled);
		if (getActionUp().isEnabled() != enabled)
			getActionUp().setEnabled(enabled);
		if (getActionDown().isEnabled() != enabled)
			getActionDown().setEnabled(enabled);
		if (getActionStepBack().isEnabled() != enabled)
			getActionStepBack().setEnabled(enabled);
		if (getActionStep().isEnabled() != enabled)
			getActionStep().setEnabled(enabled);
		if (getActionMacroStep().isEnabled() != enabled)
			getActionMacroStep().setEnabled(enabled);
		if (getActionRun().isEnabled() != enabled)
			getActionRun().setEnabled(enabled);
		if (getActionPause().isEnabled() != enabled)
			getActionPause().setEnabled(enabled);
		if (getActionStop().isEnabled() != enabled)
			getActionStop().setEnabled(enabled);
		if (getAimedStepDurationTextField().isEnabled() != enabled)
			getAimedStepDurationTextField().setEnabled(enabled);
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Updates the enabled disabled status of the following actions:
	 * - up
	 * - down
	 * - add
	 * - delete
	 */
	public void updateEnabledEnabledDisabledUpDownAddDelete() {
		Object selection = ((org.eclipse.jface.viewers.StructuredSelection)
				viewer.getSelection()).getFirstElement();
		if (KIEMInstance.execution != null) {
			//execution is running
			if (getActionEnableDisable().isEnabled() != false)
				getActionEnableDisable().setEnabled(false);
			if (getActionAdd().isEnabled() != false)
				getActionAdd().setEnabled(false);
			if (getActionDelete().isEnabled() != false)
				getActionDelete().setEnabled(false);
			if (getActionUp().isEnabled() != false)
				getActionUp().setEnabled(false);
			if (getActionDown().isEnabled() != false)
				getActionDown().setEnabled(false);
			return;
		}

		if (getActionAdd().isEnabled() != true)
			getActionAdd().setEnabled(true);
		if (	(selection == null) 
			 || (selection instanceof KiemProperty)) {
			//no object selected OR property selected
			if (getActionEnableDisable().isEnabled() != false)
				getActionEnableDisable().setEnabled(false);
			if (getActionDelete().isEnabled() != false)
				getActionDelete().setEnabled(false);
			if (getActionUp().isEnabled() != false)
				getActionUp().setEnabled(false);
			if (getActionDown().isEnabled() != false)
				getActionDown().setEnabled(false);
		}
		else {
			DataComponentEx dataComponentEx = 
				(DataComponentEx)((org.eclipse.jface.viewers
				.StructuredSelection)viewer.getSelection()).getFirstElement();
			if (getActionEnableDisable().isEnabled() != true)
				getActionEnableDisable().setEnabled(true);
			if (getActionDelete().isEnabled() != true)
				getActionDelete().setEnabled(true);
			if (dataComponentEx.isEnabled()) {
				//currently enabled
				actionEnableDisable.setText("Disable");
				actionEnableDisable.setToolTipText("Disable DataProducer/DataObserver");
			}
			else {
				//currently disabled
				actionEnableDisable.setText("Enable");
				actionEnableDisable.setToolTipText("Enable DataProducer/DataObserver");
			}

			//find index of top most and bottom most selection
			ITreeSelection selections = (ITreeSelection)(org.eclipse.jface.viewers
										.StructuredSelection)viewer.getSelection();
			int listIndexMostTop = -1;
			int listIndexMostBottom = -1;
			for (int c = 0; c < selections.size(); c ++) {
				dataComponentEx = (DataComponentEx)selections.toArray()[c];
				int index = KIEMInstance.getDataComponentExList().indexOf(dataComponentEx);
				if ((listIndexMostTop == -1)||(index < listIndexMostTop))
					listIndexMostTop = index;
				if ((listIndexMostBottom == -1)||(listIndexMostBottom < index))
					listIndexMostBottom = index;
			}
			if (listIndexMostTop <= 0) {
				//currently top
				if (getActionUp().isEnabled() != false)
					getActionUp().setEnabled(false);
			}
			else {
				if (getActionUp().isEnabled() != true)
					getActionUp().setEnabled(true);
			}
			if (listIndexMostBottom >= KIEMInstance.getDataComponentExList().size()-1) {
				//currently bottom
				if (getActionDown().isEnabled() != false)
					getActionDown().setEnabled(false);
			}
			else {
				if (getActionDown().isEnabled() != true)
					getActionDown().setEnabled(true);
			}
		}
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Updates the table view synchronously from within another thread
	 * 
	 * BE CAREFUL WITH USING THIS METHOD BECAUSE THIS COULD MORE EASILY 
	 * PRODUCE DEADLOCKS 
	 */
	public void updateViewSync() {
		Display.getDefault().syncExec(
				  new Runnable() {
				    public void run(){
				    	updateView(true);
				    }
		});
	}

	/**
	 * Updates the table view asynchronously from within another thread 
	 */
	public void updateViewAsync() {
		Display.getDefault().asyncExec(
				  new Runnable() {
				    public void run(){
				    	updateView(true);
				    }
		});
	}

	/**
	 * Updates steps in the steps text field asynchronously from
	 * within another thread 
	 */
	public void updateStepsAsync() {
		Display.getDefault().asyncExec(
				  new Runnable() {
				    public void run(){
						if (KIEMInstance.execution != null) {
							//update step counter if run
							String steps = ""+KIEMInstance.execution.getSteps();
							if (KIEMInstance.execution.isHistoryStep())
								steps = "[" + steps + "]";
							getStepTextField().updateTextfield(steps);
							//update StepBackButton
							if ((KIEMInstance.execution.getSteps() > 0)
								&& (!KIEMInstance.execution.isRunning()))
								getActionStepBack().setEnabled(true);
							else
								getActionStepBack().setEnabled(false);
						}
						else {
							//hide textfield otherwise
							getStepTextField().updateTextfield(null);
						}	
				    }
		});
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Updates the table if it is not busy.
	 * 
	 * @param deselect a table entry
	 */
	protected void updateView(boolean deselect) {
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
	
	//-------------------------------------------------------------------------	

	/**
	 * Triggers the fold/unfold of the property value table column 
	 */
	private void updateColumnsCollapsed() {
		//if selected update columns
		ISelection selection = viewer.getSelection();
		if (selection != null) {
			Object obj = ((IStructuredSelection)selection)
											.getFirstElement();
			if (obj != null) {
				if (obj instanceof KiemProperty) {
					//unfolded - show property headers
					refreshTableColumns(false);
				}
				else {
					//collapsed
					refreshTableColumns(true);
				}
			}
			else {
				//default (nothing selected) also collapsed
				refreshTableColumns(true);
			}
		}
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Updates the enableness of the actions that control the execution.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 */
	private void updateEnabled() {
		updateStepsAsync();
		updateEnabledEnabledDisabledUpDownAddDelete();
		if (currentMaster != null) {
			if (!currentMaster.isMasterImplementingGUI()) {
				//if the master is not implementing the GUI
				if (getActionStepBack().isEnabled() != false)
					getActionStepBack().setEnabled(false);
				if (getActionStep().isEnabled() != false)
					getActionStep().setEnabled(false);
				if (getActionMacroStep().isEnabled() != false)
					getActionMacroStep().setEnabled(false);
				if (getActionRun().isEnabled() != false)
					getActionRun().setEnabled(false);
				if (getActionPause().isEnabled() != false)
					getActionPause().setEnabled(false);
				if (getActionStop().isEnabled() != false)
					getActionStop().setEnabled(false);
				if (getAimedStepDurationTextField().isEnabled() != false)
					getAimedStepDurationTextField().setEnabled(false);
				return;
			}
			else {
				//master is responsible for enabling/disabling
				//buttons
				getActionStepBack().setEnabled(
						currentMaster.masterGUIisEnabledStepBack());
				getActionStep().setEnabled(
						currentMaster.masterGUIisEnabledStep());
				getActionMacroStep().setEnabled(
						currentMaster.masterGUIisEnabledMacroStep());
				getActionRun().setEnabled(
						currentMaster.masterGUIisEnabledRun());
				getActionPause().setEnabled(
						currentMaster.masterGUIisEnabledPause());
				getActionStop().setEnabled(
						currentMaster.masterGUIisEnabledStop());
				getAimedStepDurationTextField().setEnabled(false);
				return;
			}
		}
		if (allDisabled) return;
		if (KIEMInstance.execution == null) {
			//execution is stopped
			if (getActionStepBack().isEnabled() != false)
				getActionStepBack().setEnabled(false);
			if (getActionStep().isEnabled() != true)
				getActionStep().setEnabled(true);
			if (getActionMacroStep().isEnabled() != true)
				getActionMacroStep().setEnabled(true);
			if (getActionRun().isEnabled() != true)
				getActionRun().setEnabled(true);
			if (getActionPause().isEnabled() != false)
				getActionPause().setEnabled(true);
			if (getActionStop().isEnabled() != false)
				getActionStop().setEnabled(false);
			if (getActionStepBack().isEnabled() != true)
				getAimedStepDurationTextField().setEnabled(true);
		}
		else if (KIEMInstance.execution.isRunning()) {
			//execution is running
			if (getActionStepBack().isEnabled() != false)
				getActionStepBack().setEnabled(false);
			if (getActionStep().isEnabled() != false)
				getActionStep().setEnabled(false);
			if (getActionMacroStep().isEnabled() != false)
				getActionMacroStep().setEnabled(false);
			if (getActionRun().isEnabled() != false)
				getActionRun().setEnabled(false);
			if (getActionPause().isEnabled() != false)
				getActionPause().setEnabled(true);
			if (getActionStop().isEnabled() != true)
				getActionStop().setEnabled(true);
			if (getAimedStepDurationTextField().isEnabled() != true)
				getAimedStepDurationTextField().setEnabled(true);
		}
		else {
			//execution is paused
			if (KIEMInstance.execution.getSteps() > 0) {
				if (getActionStepBack().isEnabled() != true)
					getActionStepBack().setEnabled(true);
			}
			else {
				if (getActionStepBack().isEnabled() != false)
					getActionStepBack().setEnabled(false);
			}
			if (getActionStep().isEnabled() != true)
				getActionStep().setEnabled(true);
			if (getActionMacroStep().isEnabled() != true)
				getActionMacroStep().setEnabled(true);
			if (getActionRun().isEnabled() != true)
				getActionRun().setEnabled(true);
			if (getActionPause().isEnabled() != false)
				getActionPause().setEnabled(false);
			if (getActionStop().isEnabled() != false)
				getActionStop().setEnabled(true);
			if (getAimedStepDurationTextField().isEnabled() != true)
				getAimedStepDurationTextField().setEnabled(true);
		}
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Gets the action add. It calls the AddDataComponentDialog to let
	 * the user select a DataComponent to add. This will be added (and
	 * hence instantiated) by calling the 
	 * {@link de.cau.cs.kieler.sim.kiem.KiemPlugin#addTodataComponentExList}
	 * method of the KIEM plug-in. 
	 * 
	 * @return the action add
	 */
	private Action getActionAdd() {
		if (actionAdd != null) return actionAdd;
		actionAdd = new Action() {
			public void run() {
			  AddDataComponentDialog addDialog = 
				new AddDataComponentDialog(viewer.getControl().getShell());
			  addDialog.setComponentExList(KIEMInstance.getDataComponentExList());
			  addDialog.setComponentList(KiemPlugin.getDefault().getDataComponentList());
			  if (addDialog.open() == 0) {
				 List<DataComponent> selected = addDialog.getSelectedComponents();
				 if (selected != null) {
					 for (int c = 0; c < selected.size(); c++) {
						 KIEMInstance.addTodataComponentExList(selected.get(c));
					 }
					 checkForSingleEnabledMaster(false);
					 updateView(true);
				 }
			  }
			}
		};
		actionAdd.setText("Add Component");
		actionAdd.setToolTipText("Add Data Component");
		actionAdd.setImageDescriptor(KiemIcons.IMGDESCR_ADD);
		return actionAdd;
	}

	//-------------------------------------------------------------------------	

	/**
	 * Gets the action delete. Deletes all selected DataComponentExs from the
	 * DataComponentExList.
	 * 
	 * @return the action delete
	 */
	private Action getActionDelete() {
		if (actionDelete != null) return actionDelete;
		actionDelete = new Action() {
			public void run() {
				IStructuredSelection selection =
					(org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection();
				for (int c = 0; c < selection.size(); c++) {
					DataComponentEx dataComponentEx = (DataComponentEx)
													selection.toArray()[c];
					if (KIEMInstance.getDataComponentExList().contains(dataComponentEx)) {
						KIEMInstance.getDataComponentExList().remove(dataComponentEx);
					}
				}
				updateView(true);
			}
		};
		actionDelete.setText("Delete Component");
		actionDelete.setToolTipText("Delete Data Component");
		actionDelete.setImageDescriptor(KiemIcons.IMGDESCR_DELETE);
		return actionDelete;
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Gets the action enable disable. Enables or disables all selected 
	 * DataComponentExs.
	 * 
	 * @return the action enable disable
	 */
	private Action getActionEnableDisable() {
		if (actionEnableDisable != null) return actionEnableDisable;
		actionEnableDisable = new Action() {
			public void run() {
				//do not change if executing
				if (KIEMInstance.execution != null)
					return;
				//this may not always be applicable e.g., if a property is selected
				try {
					DataComponentEx firstDataComponentEx = (DataComponentEx)
					((org.eclipse.jface.viewers.StructuredSelection)viewer
										.getSelection()).getFirstElement();
					boolean enabledDisabled = !firstDataComponentEx.isEnabled();

					IStructuredSelection selection =
						(org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection();
					for (int c = 0; c < selection.size(); c++) {
						DataComponentEx dataComponentEx = (DataComponentEx)
														selection.toArray()[c];
						dataComponentEx.setEnabled(enabledDisabled);
					}
					checkForSingleEnabledMaster(false,firstDataComponentEx);
					updateView(true);
				}catch(Exception e) {}
			}
		};
		actionEnableDisable.setText("Enable");
		actionEnableDisable.setToolTipText("Enable DataProducer/DataObserver");
		return actionEnableDisable;
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Gets the action up. Schedules all selected DataComponentExs before their
	 * current position (if possible).
	 * 
	 * @return the action up
	 */
	private Action getActionUp() {
		if (actionUp != null) return actionUp;
		actionUp = new Action() {
			public void run() {
				ITreeSelection selections = (ITreeSelection)(org.eclipse.jface.viewers
						.StructuredSelection)viewer.getSelection();
				//go thru list from up to down!
				for (int c = 0; c < selections.size(); c ++) {
					DataComponentEx dataComponentEx = (DataComponentEx)selections.toArray()[c];
					int listIndex = 
						KIEMInstance.getDataComponentExList().indexOf(dataComponentEx);
					if (listIndex > 0) {
					   KIEMInstance.getDataComponentExList().remove(listIndex);
					   KIEMInstance.getDataComponentExList().add(listIndex-1, dataComponentEx);
					}
				}
			    viewer.refresh();
			    refreshEnabledDisabledTextColors();
				updateView(false);
			}
		};
		actionUp.setText("Schedule before");
		actionUp.setToolTipText("Schedule before");
		actionUp.setImageDescriptor(KiemIcons.IMGDESCR_UP);
		actionUp.setDisabledImageDescriptor(KiemIcons.IMGDESCR_UP_DISABLED);
		return actionUp;
	}

	//-------------------------------------------------------------------------	
	
	/**
	 * Gets the action down. Schedules all selected DataComponentExs behind 
	 * their current positions (if possible).
	 * 
	 * @return the action down
	 */
	private Action getActionDown() {
		if (actionDown != null) return actionDown;
		actionDown = new Action() {
			public void run() {
				ITreeSelection selections = (ITreeSelection)(org.eclipse.jface.viewers
						.StructuredSelection)viewer.getSelection();
				//go thru list from down to up!
				for (int c = selections.size()-1; c >= 0; c --) {
					DataComponentEx dataComponentEx = (DataComponentEx)selections.toArray()[c];
					int listIndex = 
						KIEMInstance.getDataComponentExList().indexOf(dataComponentEx);
					if (listIndex < KIEMInstance.getDataComponentExList().size()-1) {
						   KIEMInstance.getDataComponentExList().remove(listIndex);
						   KIEMInstance.getDataComponentExList().add(listIndex+1, dataComponentEx);
						}
				}
				viewer.refresh();
				refreshEnabledDisabledTextColors();
				updateView(false);
			}
		};
		actionDown.setText("Schedule behind");
		actionDown.setToolTipText("Schedule behind");
		actionDown.setImageDescriptor(KiemIcons.IMGDESCR_DOWN);
		actionDown.setDisabledImageDescriptor(KiemIcons.IMGDESCR_DOWN_DISABLED);
		return actionDown;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Gets the action step back. Triggers the execution to make a step back.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * 
	 * @return the action step back
	 */
	private Action getActionStepBack() {
		if (actionStepBack != null) return actionStepBack;
		actionStepBack = new Action() {
			public void run() {
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					//if a master implements the action
					currentMaster.masterGUIstepBack();
				}
				else {
					//otherwise default implementation
					setAllEnabled(false);
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepBackExecutionSync();
					}
					setAllEnabled(true);
				}
				updateView(true);
			}
		};
		actionStepBack.setText("Step Back");
		actionStepBack.setToolTipText("Step Back Execution");
		actionStepBack.setImageDescriptor(KiemIcons.IMGDESCR_STEPBACK);
		actionStepBack.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEPBACK_DISABLED);
		return actionStepBack;
	}

	//-------------------------------------------------------------------------	

	/**
	 * Gets the action step. Triggers the execution to make a step.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * 
	 * @return the action step
	 */
	private Action getActionStep() {
		if (actionStep != null) return actionStep;
		actionStep = new Action() {
			public void run() {
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					//if a master implements the action
					currentMaster.masterGUIstep();
				}
				else {
					//otherwise default implementation
					setAllEnabled(false);
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepExecutionSync();
					}
					setAllEnabled(true);
				}
				updateView(true);
			}
		};
		actionStep.setText("Step");
		actionStep.setToolTipText("Step Execution");
		actionStep.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
		actionStep.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
		return actionStep;
	}

	//-------------------------------------------------------------------------	

	/**
	 * Gets the action macro step. Triggers the execution to make a macro step.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * 
	 * @return the action macro step
	 */
	private Action getActionMacroStep() {
		if (actionMacroStep != null) return actionMacroStep;
		actionMacroStep = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUImacroStep();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.macroStepExecutionSync();
						}
						setAllEnabled(true);
				}
				updateView(true);
			}
		};
		actionMacroStep.setText("Macro Step");
		actionMacroStep.setToolTipText("Macro Step Execution");
		actionMacroStep.setImageDescriptor(KiemIcons.IMGDESCR_MACROSTEP);
		actionMacroStep.setDisabledImageDescriptor(KiemIcons.IMGDESCR_MACROSTEP_DISABLED);
		return actionMacroStep;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Gets the action run. Triggers the execution to go into run mode.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * 
	 * @return the action run
	 */
	private Action getActionRun() {
		if (actionRun != null) return actionRun;
		actionRun = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIrun();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.runExecutionSync();
						}
						setAllEnabled(true);
				}
				updateView(true);
			}
		};
		actionRun.setText("Run");
		actionRun.setToolTipText("Run Execution");
		actionRun.setImageDescriptor(KiemIcons.IMGDESCR_RUN);
		actionRun.setDisabledImageDescriptor(KiemIcons.IMGDESCR_RUN_DISABLED);
		return actionRun;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Gets the action pause. Triggers the execution to pause.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * 
	 * @return the action pause
	 */
	private Action getActionPause() {
		if (actionPause != null) return actionPause;
		actionPause = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIpause();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.pauseExecutionSync();
						}
						setAllEnabled(true);
				}
				updateView(true);
			}
		};
		actionPause.setText("Pause");
		actionPause.setToolTipText("Pause Execution");
		actionPause.setImageDescriptor(KiemIcons.IMGDESCR_PAUSE);
		actionPause.setDisabledImageDescriptor(KiemIcons.IMGDESCR_PAUSE_DISABLED);
		return actionPause;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Gets action stop. Triggers the execution to stop.
	 * If a master is present, the this functionality may be implemented
	 * by him.
	 * All collected timing data will be presented to the user and the 
	 * execution is being released. A master will also have to do this.
	 * 
	 * @return the action stop
	 */
	private Action getActionStop() {
		if (actionStop != null) return actionStop;
		actionStop = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIstop();
					}
					else {
						//otherwise default implementation
						if (KIEMInstance.execution != null) {
							KIEMInstance.execution.stopExecutionSync();
						}
						//get results
						long executionTime   = 
							KIEMInstance.execution.getExecutionDuration();
						long minStepDuration = 
							KIEMInstance.execution.getMinimumStepDuration();
						long wavStepDuration = 
							KIEMInstance.execution.getWeightedAverageStepDuration();
						long aveStepDuration = 
							KIEMInstance.execution.getAverageStepDuration();
						long maxStepDuration = 
							KIEMInstance.execution.getMaximumStepDuration();
						long steps           = 
							KIEMInstance.execution.getMaximumSteps();
						long aimedStepDuration = 
							KIEMInstance.execution.getAimedStepDuration();
						
						KIEMInstance.execution = null;
						updateView(true);

						//show execution results
						showMessage(
						"KIELER Execution Manager - Execution Timing Results",
						"                          Number of Steps : "
							+steps+"\n"+
						"                Overall Execution Time : "
							+executionTime+" ms\n\n"+
						"                    Aimed Step Duration : "
							+aimedStepDuration+ " ms\n"+
						"                 Minimum Step Duration : "
							+minStepDuration+ " ms\n"+
						"Weighted Average Step Duration : "
							+wavStepDuration+ " ms\n"+
						"                 Average Step Duration : "
							+aveStepDuration+ " ms\n"+
						"                Maximum Step Duration : "
							+maxStepDuration+ " ms");
				}
				updateView(true);
			}
		};
		actionStop.setText("Stop");
		actionStop.setToolTipText("Stop Execution");
		actionStop.setImageDescriptor(KiemIcons.IMGDESCR_STOP);
		actionStop.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STOP_DISABLED);
		return actionStop;
	}

	//-------------------------------------------------------------------------	

	/**
	 * Gets the aimed step duration text field.
	 * 
	 * @return the aimed step duration text field
	 */
	private AimedStepDurationTextField getAimedStepDurationTextField() {
		if (aimedStepDurationTextField != null) return aimedStepDurationTextField;
		aimedStepDurationTextField = new AimedStepDurationTextField(KIEMInstance);
		return aimedStepDurationTextField;
	}

	//-------------------------------------------------------------------------

	/**
	 * Gets the step text field.
	 * 
	 * @return the step text field
	 */
	private StepTextField getStepTextField() {
		if (stepTextField != null) return stepTextField;
		stepTextField = new StepTextField();
		return stepTextField;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Passing the focus request to the viewer's control. This is necessary be-
	 * cause KiemView extends the ViewPart class.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	//-------------------------------------------------------------------------	

    /**
     * Check for single enabled master. This is just a wrapper for the method
     * {@link #checkForSingleEnabledMaster(boolean, DataComponentEx)}.
     * 
     * @param silent if true, the warning dialog will be suppressed
     * 
     */
    public void checkForSingleEnabledMaster(boolean silent) {
		checkForSingleEnabledMaster(silent,null); 
	}
	
	/**
	 * Check the current selection (enabled DataComponentExs) for a just a 
	 * single enabled master. If any second enabled master is found it will
	 * be disabled and the user is notified with a warning dialog -
	 * depending on the silent-flag. 
	 * 
	 * @param silent if true, the warning dialog will be suppressed
	 * @param dataComponentEx the DataComponentEx that is allowed to be the
	 * 						  master or null
	 */
	public void checkForSingleEnabledMaster(boolean silent,
											DataComponentEx dataComponentEx) {
		currentMaster = null;
		if (dataComponentEx != null &&
			dataComponentEx.isMaster() &&
			dataComponentEx.isEnabled()) {
			//preset NEW selection
			currentMaster = dataComponentEx;
		}
		
		for (int c = 0; c < KIEMInstance.getDataComponentExList().size(); c++) {
			DataComponentEx dataComponentTemp = 
				KIEMInstance.getDataComponentExList().get(c);
			dataComponentTemp.getDataComponent().masterSetKIEMInstances(null, null);
			if (dataComponentTemp.isMaster() &&
				dataComponentTemp.isEnabled() &&
				dataComponentTemp != currentMaster) {
				if (currentMaster == null) {
					currentMaster = dataComponentTemp;
				} else {
					if (!silent)
						showWarning("At most one master data"
								   +" component is allowed!\n'"
								   +dataComponentTemp.getName()
								   +"' will be disabled.");
					//disable it//
					dataComponentTemp.setEnabled(false);
					this.viewer.refresh();
					this.refreshEnabledDisabledTextColors();
				}
			}
		}
		if (currentMaster != null) {
		   currentMaster.getDataComponent().masterSetKIEMInstances(KIEMInstance, this);
		}
	}
	
}
