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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.ui.part.*;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;
import de.cau.cs.kieler.sim.kiem.ui.AddDataComponentDialog;
import de.cau.cs.kieler.sim.kiem.ui.DropDownAction;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;
import de.cau.cs.kieler.sim.kiem.ui.StepTextField;

/**
 * The Class KiemView is only instantiated once when the view part is
 * registered in the Eclipse IDE. It holds the DataComponent table list
 * view and buttons to control the execution.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemView extends ViewPart implements ISaveablePart2 {
	
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
			Messages.TableComponentName,
			Messages.TableValue, 
			Messages.TableEnabled,
			Messages.TableType, 
			Messages.TableMaster};
	
	/** The Constant columnTitles - properties visible. */
	public static final String[] columnTitles = { 
			Messages.TableComponentNameKey,
			Messages.TableValue, 
			Messages.TableEnabled,
			Messages.TableType, 
			Messages.TableMaster};
	
	/** The Constant columnToolTipCollapsed - properties not visible. */
	public static final String[] columnToolTipCollapsed = { 
			Messages.TableHintComponentName,
			Messages.TableHintValue, 
			Messages.TableHintEnabled,
			Messages.TableHintType, 
			Messages.TableHintMaster};
	
	/** The Constant columnToolTip - properties visible. */
	public static final String[] columnToolTip = { 
			Messages.TableHintComponentNameKey,
			Messages.TableHintValue, 
			Messages.TableHintEnabled,
			Messages.TableHintType, 
			Messages.TableHintMaster};
	
	/** True if all actions are (temporary) disabled. */
	private boolean allDisabled;
	
	/** True iff table or properties where modified */
	private boolean isDirty;
	
	/** The currently opened file if any, null otherwise. */
	private IPath currentFile;
	
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
		this.currentFile = null;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Sets the current file.
	 * 
	 * @param currentFile the new currently opened file
	 */
	public void setCurrentFile(IPath currentFile) {
		this.currentFile = currentFile;
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
		
		//buildLocalToolBar(); // is done in checkForSingleEnabledMaster
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
				if  (event.getElement() instanceof DataComponentEx) {
					//set a flag that the properties are collapsed
					((DataComponentEx)event.getElement()).setUnfolded(false);
					updateColumnsCollapsed();
				}
				updateView(false);
			}
			public void treeExpanded(TreeExpansionEvent event) {
				if  (event.getElement() instanceof DataComponentEx) {
					//set a flag that the properties are expanded
					((DataComponentEx)event.getElement()).setUnfolded(true);
					updateColumnsCollapsed();
				}
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
	 * Builds the context menu for the table.
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
	
	//-------------------------------------------------------------------------
		
	/**
	 * Builds the local tool bar for the KiemView part.
	 */
	private void buildLocalToolBar() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		//first remove all entries
		manager.removeAll();
		
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		manager.add(getAimedStepDurationTextField());
		manager.add(getStepTextField());
		manager.add(new Separator());
		manager.add(getActionStepBack());

		if (this.currentMaster == null) {
			//add a drop down action
			DropDownAction dn = new DropDownAction(getActionStep());
			dn.add(new Separator());
			dn.add(getActionStepFMC());
			dn.add(getActionStepUser());
			manager.add(dn);
		}
		else {
			//simple action iff master is present
			manager.add(getActionStep());
		}

		//manager.add(getActionStep());

		//TODO: macro step implementation
		//manager.add(getActionMacroStep());
		
		if (this.currentMaster == null) {
			//add a drop down action
			DropDownAction dn = new DropDownAction(getActionRun());
			dn.add(new Separator());
			dn.add(getActionStepUserRun());
			manager.add(dn);
		}
		else {
			//simple action iff master is present
			manager.add(getActionRun());
		}

		manager.add(getActionPause());
		manager.add(getActionStop());
		
		//commit changes
		bars.updateActionBars();
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
	
	//-------------------------------------------------------------------------
	
	/**
	 * Show an input dialog with the message, a default value and a specific
	 * title.
	 * 
	 * @param title the title of the dialog
	 * @param message the message to present
	 * @param defaultValue the default value
	 * 
	 * @return the string value entered or null if aborted
	 */
	private String showInputDialog(String title, 
								String message,
								String defaultValue) {

        InputDialog dlg = new InputDialog(this.getSite().getShell(),
        								  title, 
        								  message, 
        								  defaultValue, 
        								  null);
        dlg.open();
        if (dlg.getReturnCode() == InputDialog.OK) {
        	return dlg.getValue();
        }
        else
        	return null;
	}

	//-------------------------------------------------------------------------

	/**
	 * Show message dialog with the message and a specific title.
	 * 
	 * @param title the title of the dialog
	 * @param message the message to present
	 */
	private void showMessage(String title, String message) {
		MessageDialog.openInformation(
				viewer.getControl().getShell(),
				Messages.ViewTitle,
				message);
	}
	
	//-------------------------------------------------------------------------
	
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
	
	//-------------------------------------------------------------------------

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
	public void setAllEnabled(boolean enabled) {
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
	 * Updates the enabled disabled status of the following actions:<BR>
	 * - up<BR>
	 * - down<BR>
	 * - add<BR>
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
				actionEnableDisable.setText(Messages.ActionDisable);
				actionEnableDisable.setToolTipText(Messages.ActionHintDisable);
			}
			else {
				//currently disabled
				actionEnableDisable.setText(Messages.ActionEnable);
				actionEnableDisable.setToolTipText(Messages.ActionHintEnable);
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
	 * <BR><BR>
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
	
	//-------------------------------------------------------------------------

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
	
	//-------------------------------------------------------------------------

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
								&& (!KIEMInstance.execution.isRunning()) 
								&& (getActionStep().isEnabled()))
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
		//do not update if not necessary
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
				if ((obj instanceof KiemProperty) ||
						((obj instanceof DataComponentEx)
					 && (((DataComponentEx)obj).getProperties() != null)
					 && (((DataComponentEx)obj).getProperties().length > 0)
					 && (((DataComponentEx)obj).isUnfolded())
					)){
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
			if (getActionPause().isEnabled() != true)
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
			if (getActionPause().isEnabled() != true)
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
			if (getActionStop().isEnabled() != true)
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
					 setDirty(true);
					 checkForSingleEnabledMaster(false);
					 updateView(true);
				 }
			  }
			}
		};
		actionAdd.setText(Messages.ActionAdd);
		actionAdd.setToolTipText(Messages.ActionHintAdd);
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
				//do nothing if execution
				if (KIEMInstance.execution != null) return;
				IStructuredSelection selection =
					(org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection();
				for (int c = 0; c < selection.size(); c++) {
					DataComponentEx dataComponentEx = (DataComponentEx)
													selection.toArray()[c];
					if (KIEMInstance.getDataComponentExList().contains(dataComponentEx)) {
						dataComponentEx.getDataComponent()._DataComponent();
						KIEMInstance.getDataComponentExList().remove(dataComponentEx);
						 setDirty(true);
 						 //call garbage collector
						 System.gc();
					}
				}
				updateView(true);
			}
		};
		actionDelete.setText(Messages.ActionDelete);
		actionDelete.setToolTipText(Messages.ActionHintDelete);
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
						setDirty(true);
					}
					checkForSingleEnabledMaster(false,firstDataComponentEx);
					updateView(true);
				}catch(Exception e) {}
			}
		};
		actionEnableDisable.setText(Messages.ActionEnable);
		actionEnableDisable.setToolTipText(Messages.ActionHintEnable);
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
					   setDirty(true);
					}
				}
			    viewer.refresh();
			    refreshEnabledDisabledTextColors();
				updateView(false);
			}
		};
		actionUp.setText(Messages.ActionUp);
		actionUp.setToolTipText(Messages.ActionHintUp);
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
						   setDirty(true);
						}
				}
				viewer.refresh();
				refreshEnabledDisabledTextColors();
				updateView(false);
			}
		};
		actionDown.setText(Messages.ActionDown);
		actionDown.setToolTipText(Messages.ActionHintDown);
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
				//only update if first step in execution
				boolean mustUpdate = (KIEMInstance.execution == null);
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					//if a master implements the action
					currentMaster.masterGUIstepBack();
				}
				else {
					//otherwise default implementation
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepBackExecutionSync();
					}
				}
				if (mustUpdate)
					updateView(true);
			}
		};
		actionStepBack.setText(Messages.ActionStepBack);
		actionStepBack.setToolTipText(Messages.ActionHintStepBack);
		actionStepBack.setImageDescriptor(KiemIcons.IMGDESCR_STEPBACK);
		actionStepBack.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEPBACK_DISABLED);
		return actionStepBack;
	}

	//-------------------------------------------------------------------------	
	
	/**
	 * Gets the action step forward to the most current step. Triggers the 
	 * execution to make a step forward to the most current one. This action is
	 * only available if no master is present.
	 * 
	 * @return the action step FMC
	 */
	private Action getActionStepFMC() {
		if (actionStepFMC != null) return actionStepFMC;
		actionStepFMC = new Action() {
			public void run() {
				//only update if first step in execution
				boolean mustUpdate = (KIEMInstance.execution == null);
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					// unsupported
				}
				else {
					//otherwise default implementation
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepExecutionPause(
								KIEMInstance.execution.getMaximumSteps());
					}
				}
				if (mustUpdate)
					updateView(true);
			}
		};
		actionStepFMC.setText(Messages.ActionStepFMC);
		actionStepFMC.setToolTipText(Messages.ActionHintStepFMC);
		actionStepFMC.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
		actionStepFMC.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
		return actionStepFMC;
	}

	//-------------------------------------------------------------------------	
	
	/**
	 * Gets the action user defined step. Triggers the execution to make a
	 * step forward or backward to the one that the user set in the dialog 
	 * window. This action is only available if no master is present.
	 * 
	 * @return the user defined action step
	 */
	private Action getActionStepUser() {
		if (actionStepUser != null) return actionStepUser;
		actionStepUser = new Action() {
			public void run() {
				//only update if first step in execution
				boolean mustUpdate = (KIEMInstance.execution == null);
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					// unsupported
				}
				else {
					//otherwise default implementation
					if (KIEMInstance.initExecution()) {
						String value = showInputDialog(
								Messages.ActionStepUserDialogTitle,
								Messages.ActionStepUserDialogText,
								""+KIEMInstance.execution.getMaximumSteps());
						if (value != null) {
							try {
								long step = Long.parseLong(value);
								KIEMInstance.execution
										.stepExecutionPause(step);
							}catch(Exception e){}
						}
					}
				}
				if (mustUpdate)
					updateView(true);
			}
		};
		actionStepUser.setText(Messages.ActionStepUser);
		actionStepUser.setToolTipText(Messages.ActionHintStepUser);
		actionStepUser.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
		actionStepUser.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
		return actionStepUser;
	}

	//-------------------------------------------------------------------------	
		
	/**
	 * Gets the action user run defined step. Triggers the execution to 
	 * run forward or jump backward to the step that the user set in the dialog 
	 * window. This action is only available if no master is present.
	 * 
	 * @return the user defined action step
	 */
	private Action getActionStepUserRun() {
		if (actionRunUser != null) return actionRunUser;
		actionRunUser = new Action() {
			public void run() {
				//only update if first step in execution
				boolean mustUpdate = (KIEMInstance.execution == null);
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					// unsupported
				}
				else {
					//otherwise default implementation
					if (KIEMInstance.initExecution()) {
						String value = showInputDialog(
								Messages.ActionRunUserDialogTitle,
								Messages.ActionRunUserDialogText,
								""+KIEMInstance.execution.getMaximumSteps());
						if (value != null) {
							try {
								long step = Long.parseLong(value);
								KIEMInstance.execution
										.runExecutionPause(step);
							}catch(Exception e){}
						}
					}
				}
				if (mustUpdate)
					updateView(true);
			}
		};
		actionRunUser.setText(Messages.ActionRunUser);
		actionRunUser.setToolTipText(Messages.ActionHintRunUser);
		actionRunUser.setImageDescriptor(KiemIcons.IMGDESCR_STEP);
		actionRunUser.setDisabledImageDescriptor(KiemIcons.IMGDESCR_STEP_DISABLED);
		return actionRunUser;
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
				//only update if first step in execution
				boolean mustUpdate = (KIEMInstance.execution == null);
				if ((currentMaster != null) 
					&& currentMaster.isMasterImplementingGUI()) {
					//if a master implements the action
					currentMaster.masterGUIstep();
				}
				else {
					//otherwise default implementation
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepExecutionSync();
					}
				}
				if (mustUpdate)
					updateView(true);
			}
		};
		actionStep.setText(Messages.ActionStep);
		actionStep.setToolTipText(Messages.ActionHintStep);
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
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.macroStepExecutionSync();
						}
				}
				updateView(true);
			}
		};
		actionMacroStep.setText(Messages.ActionMacroStep);
		actionMacroStep.setToolTipText(Messages.ActionHintMacroStep);
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
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.runExecutionSync();
						}
				}
				updateView(true);
			}
		};
		actionRun.setText(Messages.ActionHintRun);
		actionRun.setToolTipText(Messages.ActionHintRun);
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
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.pauseExecutionSync();
						}
				}
				updateView(true);
			}
		};
		actionPause.setText(Messages.ActionPause);
		actionPause.setToolTipText(Messages.ActionHintPause);
		actionPause.setImageDescriptor(KiemIcons.IMGDESCR_PAUSE);
		actionPause.setDisabledImageDescriptor(KiemIcons.IMGDESCR_PAUSE_DISABLED);
		return actionPause;
	}
	
	//-------------------------------------------------------------------------	

	/**
	 * Gets action stop. Triggers the execution to stop.
	 * If a master is present, the this functionality may be implemented
	 * by him.<BR>
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
						Messages.TimingResultsTitle,
						Messages.TimingResultsNumberOfSteps +
							+steps+"\n"+
						Messages.TimingResultsOverallExecutionTime +
							+executionTime+" ms\n\n"+
						Messages.TimingResultsAimedStepDuration +
							+aimedStepDuration+ " ms\n"+
						Messages.TimingResultsMinimumStepDuration+
							+minStepDuration+ " ms\n"+
						Messages.TimingResultsWheightedAverageStepDuration +
							+wavStepDuration+ " ms\n"+
						Messages.TimingResultsAverageStepDuration + 
							+aveStepDuration+ " ms\n"+
						Messages.TimingResultsMaximumStepDuration +
							+maxStepDuration+ " ms");
				}
				updateView(true);
			}
		};
		actionStop.setText(Messages.ActionStop);
		actionStop.setToolTipText(Messages.ActionHintStop);
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
    
    //-------------------------------------------------------------------------
	
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
						
						showWarning(Messages.WarningAtMostOneMaster
								.replace("%COMPONENTNAME", dataComponentTemp.getName()));
					//disable it//
					dataComponentTemp.setEnabled(false);
					//if this method is called during initial loading
					//then we do not want to set the dirty flag
					if (!silent)
						setDirty(true);
					this.viewer.refresh();
					this.refreshEnabledDisabledTextColors();
				}
			}
		}
		if (currentMaster != null) {
			currentMaster.getDataComponent().masterSetKIEMInstances(KIEMInstance, this);
		}
		//rebuild view toolbar buttons
		buildLocalToolBar();
	}
	
	//-------------------------------------------------------------------------
	//                            MAKE PROPERTIES SAVEABLE
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {
		if (currentFile == null) {
			this.doSaveAs();
			return;
		}
        try {
    		String workspaceFolder = Platform.getLocation().toString();
            
            FileOutputStream fileOut = new FileOutputStream(
            				workspaceFolder + currentFile.toOSString());
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

//            List<ObjectStreamClass> oscList = 
//            						new LinkedList<ObjectStreamClass>();
//            for (int c = 0; c < KiemPlugin.getDefault()
//            					.getDataComponentExList().size(); c++) {
//            	DataComponentEx dataComponentEx = 
//            		KiemPlugin.getDefault()
//            		.getDataComponentExList().get(c);
//            	KiemProperty[] properties = dataComponentEx
//            							.getDataComponent().getProperties();
//            	if (properties != null) {
//                	for (int cc = 0; cc < properties.length; cc++){
//                		KiemProperty property = properties[cc];
//                        ObjectStreamClass osc = 
//                        	java.io.ObjectStreamClass.lookup(property.getClass());
//                        oscList.add(osc);
//                	}
//            	}
//            }
//            
//            out.writeObject(oscList);

            out.writeObject(KiemPlugin.getDefault()
            		.getDataComponentExList());

            out.close();
            fileOut.close();
           
        } catch (IOException e) {
        	//TODO: error behavior
            e.printStackTrace();
        }		
		setDirty(false);		
	}

	//-------------------------------------------------------------------------
		
	/**
	 * Gets the file name (without possible extension) of the currently 
	 * opened file, if any, or "noname" otherwise.
	 * 
	 * @return the active project name
	 */
	public String getActiveProjectName() {
		try {
		    IWorkbenchPage page = PlatformUI.getWorkbench()
		    		.getActiveWorkbenchWindow().getActivePage();
		    String name = page.getActiveEditor().getEditorInput().getName();
		    int i = name.indexOf(".");
		    if (i > -1) {
		    	name = name.substring(0,i);
		    }
	    return name;
		}catch(Exception e) {
			return "noname";
		}
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	public void doSaveAs() {
		SaveAsDialog dlg = new SaveAsDialog(this.getViewSite().getShell());
		dlg.setBlockOnOpen(true);
		dlg.setOriginalName(getActiveProjectName()+".execution");
		if (dlg.open() == SaveAsDialog.OK) {
			this.currentFile = dlg.getResult();
			this.doSave(null);
		}
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isDirty()
	 */
	public boolean isDirty() {
		//isDirty is set to true iff table or properties are modified
		return isDirty;

	}

	//-------------------------------------------------------------------------
	
	/**
	 * Sets the dirty flag to true or false. It should be set to true whenever
	 * the view table is modified (add or delete a DataComponent) or a 
	 * property of a DataComponent is changed. It should be reset to false
	 * whenever the user saves the execution.
	 * 
	 * @param isDirty the new dirty
	 */
	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
		firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveOnCloseNeeded()
	 */
	public boolean isSaveOnCloseNeeded() {
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart2#promptToSaveOnClose()
	 */
	public int promptToSaveOnClose() {
		if (this.isDirty) {
			String fileName = "noname.execution";
			if (this.currentFile != null)
				fileName = this.currentFile.toFile().getName();
			
			String[] buttons = {"Yes","No","Cancel"};
			
			MessageDialog dlg = new MessageDialog(
					viewer.getControl().getShell(),
					"Save Execution",
					null,
					"'"+fileName+"' has been modified. Save changes?",
					MessageDialog.QUESTION,
					buttons,
					2);
			
			int answer = dlg.open();
			
			if (answer == 0) { //YES
				//try to save or open saveas dialog
				this.doSave(null);
				//check is saved
				if (this.isDirty())
					//user has not saved (e.g. canceled saving)
					return ISaveablePart2.CANCEL;
				else
					//user has saved, its safe to close view
					return ISaveablePart2.NO;
			}
			else if (answer == 1) { //NO
				return ISaveablePart2.NO;
			}
			//CANCEL
			return ISaveablePart2.CANCEL;
		}
		else
			return ISaveablePart2.NO;
	}
	
}
