package de.cau.cs.kieler.sim.kiem.views;

import java.util.LinkedList;
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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyList;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;
import de.cau.cs.kieler.sim.kiem.ui.AddDataComponentDialog;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;
import de.cau.cs.kieler.sim.kiem.ui.StepTextField;

import org.eclipse.ui.IWorkbenchWindow;


public class KiemView extends ViewPart {
	private KiemTableViewer viewer;
	private Action actionAdd;
	private Action actionDelete;
	private Action actionEnableDisable;
	private Action actionUp;
	private Action actionDown;
	private Action actionMacroStep;
	private Action actionStep;
	private Action actionRun;
	private Action actionPause;
	private Action actionStop;
	private AimedStepDurationTextField aimedStepDurationTextField;
	private StepTextField stepTextField;
	private DataComponentEx currentMaster;

	public KiemPlugin KIEMInstance;
	
	public static final String ID = "de.cau.cs.kieler.sim.kiem.views.KiemView";
	
	public static final int[] columnBoundsCollapsed 
								= { 180, 0 , 20, 120, 50, 50};
	public static final int[] columnBounds 
								= { 180, 200 , 20, 120, 50, 50};
	public int columnProperty = -1;

	public static final String[] columnTitlesCollapsed = { 
			"Component Name",
			"Value", 
			"",
			"Type", 
			"Master"};
	public static final String[] columnTitles = { 
		"Component Name / Key",
		"Value", 
		"",
		"Type", 
		"Master"};
	public static final String[] columnToolTipCollapsed = { 
			 "Name of Data Component",
			 "Property Value",
			 "Enabled/Disabled",
 			 "Producer, Observer or Initialization Data Component", 
 			 "Is a Master that leads Execution"};
	public static final String[] columnToolTip = { 
		 "Property Key",
		 "Property Value",
		 "Enabled/Disabled",
		 "Producer, Observer or Initialization Data Component", 
		 "Is a Master that leads Execution"};
	

	@SuppressWarnings("unused")
	private IWorkbenchWindow window;

 	
  //---------------------------------------------------------------------------	
	/**
	 * The constructor.
	 */
	public KiemView() {
		KIEMInstance = KiemPlugin.getDefault();
		//set KIEMViewInstance of KiemPlugin so that we can update the
		//view from within the execution
		KIEMInstance.setKIEMViewInstance(this);
		this.currentMaster = null;
	}
	
	
	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
	
	public void refreshEnabledDisabledTextColors() {
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
			//enable subitems
			int subItemCnt = viewer.getTree().getItem(c).getItemCount();
			for (int cc = 0; cc < subItemCnt; cc ++) {
				viewer.getTree().getItem(c).getItem(cc).setForeground(currentColor);
			}
			
		}
	}
	
   //---------------------------------------------------------------------------	
	
	public void createPartControl(Composite parent) {
		viewer = new KiemTableViewer(parent, SWT.MULTI | SWT.H_SCROLL
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
	
	// This will create the columns for the table
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
	
  //---------------------------------------------------------------------------
	
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
				column.setToolTipText(columnToolTipCollapsed[i]);
			}
			TreeColumn column = tree.getColumn(1);
			column.setWidth(0);
		}
		else {
			for (int i = 0; i < columnTitles.length; i++) {
				TreeColumn column = tree.getColumn(i);
				column.setText(columnTitles[i]);
				column.setToolTipText(columnToolTip[i]);
			}
			TreeColumn column = tree.getColumn(1);
			column.setWidth(columnProperty);
		}
	}
	
  //---------------------------------------------------------------------------	

	private void hookSelectionChangedAction() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateEnabled();
				updateColumnsCollapsed();
				//do not refresh, otherwise the cell editor is aborted!
			}
		});
	}
	private void hookTreeAction() {
		viewer.addTreeListener(new ITreeViewerListener() {
			@Override
			public void treeCollapsed(TreeExpansionEvent event) {
				updateView(false);
			}
			@Override
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
			@Override
			public void keyPressed(KeyEvent e) {
				//if user pressed delete
				if (e.keyCode == 127) {
					getActionDelete().run();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
	}
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

  //---------------------------------------------------------------------------	

	private void buildContextMenu(IMenuManager manager) {
		manager.add(getActionEnableDisable());
		manager.add(new Separator());
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		//manager.add(getActionStep());
		//TODO: macro step implementation
		//manager.add(getActionMacroStep());
		//manager.add(getActionRun());
		//manager.add(getActionPause());
		//manager.add(getActionStop());
		//manager.add(new Separator());
		manager.add(getActionAdd());
		manager.add(getActionDelete());
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
		
	private void buildLocalToolBar() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		//manager.add(getActionAdd());
		//manager.add(getActionDelete());
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		manager.add(getAimedStepDurationTextField());
		manager.add(getStepTextField());
		manager.add(new Separator());
		manager.add(getActionStep());
		//TODO: macro step implementation
		//manager.add(getActionMacroStep());
		manager.add(getActionRun());
		manager.add(getActionPause());
		manager.add(getActionStop());
	}
	
  //---------------------------------------------------------------------------
	
	public void showMessage(String message) {
		showMessage("KIELER Execution Manager",message);
	}
	public void showMessage(String title, String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			title,
			message);
	}
	
	public void showWarning(String message) {
		MessageDialog.openWarning(
			viewer.getControl().getShell(),
			"KIELER Execution Manager",
			message);
	}
	
	public void showError(String message) {
		MessageDialog.openError(
			viewer.getControl().getShell(),
			"KIELER Execution Manager",
			message);
	}
	
  //---------------------------------------------------------------------------	
  //---------------------------------------------------------------------------
	
	private boolean allDisabled;
	
	private void setAllEnabled(boolean enabled) {
		allDisabled = !enabled;
		getActionEnableDisable().setEnabled(enabled);
		getActionAdd().setEnabled(enabled);
		getActionDelete().setEnabled(enabled);
		getActionUp().setEnabled(enabled);
		getActionDown().setEnabled(enabled);
		getActionStep().setEnabled(enabled);
		getActionMacroStep().setEnabled(enabled);
		getActionRun().setEnabled(enabled);
		getActionPause().setEnabled(enabled);
		getActionStop().setEnabled(enabled);
		getAimedStepDurationTextField().setEnabled(enabled);
	}
	

	public void updateEnabledEnabledDisabledUpDownAddDelete() {
		Object selection = ((org.eclipse.jface.viewers.StructuredSelection)
				viewer.getSelection()).getFirstElement();
		if (KIEMInstance.execution != null) {
			//execution is running
			getActionEnableDisable().setEnabled(false);
			getActionAdd().setEnabled(false);
			getActionDelete().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
			return;
		}

		getActionAdd().setEnabled(true);
		if (	(selection == null) 
			 || (selection instanceof KiemProperty)) {
			//no object selected OR property selected
			getActionEnableDisable().setEnabled(false);
			getActionDelete().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
		}
		else {
			DataComponentEx dataComponentEx = 
				(DataComponentEx)((org.eclipse.jface.viewers
				.StructuredSelection)viewer.getSelection()).getFirstElement();
			getActionEnableDisable().setEnabled(true);
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
				getActionUp().setEnabled(false);
			}
			else {
				getActionUp().setEnabled(true);
			}
			if (listIndexMostBottom >= KIEMInstance.getDataComponentExList().size()-1) {
				//currently bottom
				getActionDown().setEnabled(false);
			}
			else {
				getActionDown().setEnabled(true);
			}
		}
	}
	

	public void updateViewSync() {
		Display.getDefault().syncExec(
				  new Runnable() {
				    public void run(){
				    	updateView(true);
				    }
		});
	}

	public void updateViewAsync() {
		Display.getDefault().asyncExec(
				  new Runnable() {
				    public void run(){
				    	updateView(true);
				    }
		});
	}

	public void updateStepsAsync() {
		Display.getDefault().asyncExec(
				  new Runnable() {
				    public void run(){
						if (KIEMInstance.execution != null) {
							//update step counter if run
							getStepTextField().updateTextfield(""+KIEMInstance.execution.getSteps());
						}
						else {
							//hide textfield otherwise
							getStepTextField().updateTextfield(null);
						}	
				    }
		});
	}
	
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
	
	public void updateColumnsCollapsed() {
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
	
	public void updateEnabled() {
		updateEnabled(false);
	}
	public void updateEnabled(boolean silent) {
		updateStepsAsync();
		updateEnabledEnabledDisabledUpDownAddDelete();
		if (currentMaster != null) {
			//if the master is not implementing the GUI
			if (!currentMaster.isMasterImplementingGUI()) {
				getActionStep().setEnabled(false);
				getActionMacroStep().setEnabled(false);
				getActionRun().setEnabled(false);
				getActionPause().setEnabled(false);
				getActionStop().setEnabled(false);
				getAimedStepDurationTextField().setEnabled(false);
				return;
			}
		}
		if (allDisabled) return;
		if (KIEMInstance.execution == null) {
			//execution is stopped
			getActionStep().setEnabled(true);
			getActionMacroStep().setEnabled(true);
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(false);
			getAimedStepDurationTextField().setEnabled(true);
		}
		else if (KIEMInstance.execution.isRunning()) {
			//execution is running
			getActionStep().setEnabled(false);
			getActionMacroStep().setEnabled(false);
			getActionRun().setEnabled(false);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(true);
			getAimedStepDurationTextField().setEnabled(true);
		}
		else {
			//execution is paused
			getActionMacroStep().setEnabled(true);
			getActionStep().setEnabled(true);
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(false);
			getActionStop().setEnabled(true);
			getAimedStepDurationTextField().setEnabled(true);
		}
	}
	
  //---------------------------------------------------------------------------	

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
	
	private Action getActionStep() {
		if (actionStep != null) return actionStep;
		actionStep = new Action() {
			public void run() {
				if ((currentMaster != null) 
					&& !currentMaster.isMasterImplementingGUI()) {
					//if a master implements the action
					currentMaster.masterGUIstep();
				}
				else {
					//otherwise default implementation
					setAllEnabled(false);
					if (KIEMInstance.initExecution()) {
						KIEMInstance.execution.stepExecution();
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

	private Action getActionMacroStep() {
		if (actionMacroStep != null) return actionMacroStep;
		actionMacroStep = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& !currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUImacroStep();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.macroStepExecution();
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
	
	private Action getActionRun() {
		if (actionRun != null) return actionRun;
		actionRun = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& !currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIrun();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.runExecution();
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
	
	private Action getActionPause() {
		if (actionPause != null) return actionPause;
		actionPause = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& !currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIpause();
					}
					else {
						//otherwise default implementation
						setAllEnabled(false);
						if (KIEMInstance.initExecution()) {
							KIEMInstance.execution.pauseExecution();
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
	
	private Action getActionStop() {
		if (actionStop != null) return actionStop;
		actionStop = new Action() {
			public void run() {
				if ((currentMaster != null) 
						&& !currentMaster.isMasterImplementingGUI()) {
						//if a master implements the action
						currentMaster.masterGUIstop();
					}
					else {
						//otherwise default implementation
						if (KIEMInstance.execution != null) {
							KIEMInstance.execution.stopExecution();
						}
						//get results
						long executionTime   = 
							KIEMInstance.execution.getExecutionDurantion();
						long minStepDuration = 
							KIEMInstance.execution.getMinimumStepDuration();
						long wavStepDuration = 
							KIEMInstance.execution.getWeightedAverageStepDuration();
						long aveStepDuration = 
							KIEMInstance.execution.getAverageStepDuration();
						long maxStepDuration = 
							KIEMInstance.execution.getMaximumStepDuration();
						long steps           = 
							KIEMInstance.execution.getSteps();
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

	private AimedStepDurationTextField getAimedStepDurationTextField() {
		if (aimedStepDurationTextField != null) return aimedStepDurationTextField;
		aimedStepDurationTextField = new AimedStepDurationTextField(KIEMInstance);
		return aimedStepDurationTextField;
	}

	private StepTextField getStepTextField() {
		if (stepTextField != null) return stepTextField;
		stepTextField = new StepTextField(KIEMInstance);
		return stepTextField;
	}
	
  //---------------------------------------------------------------------------	

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

  //---------------------------------------------------------------------------	

//	public void check
	
  //---------------------------------------------------------------------------	
	
	public void checkForSingleEnabledMaster(boolean silent) {
		checkForSingleEnabledMaster(silent,null); 
	}
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
	
  //---------------------------------------------------------------------------	

}