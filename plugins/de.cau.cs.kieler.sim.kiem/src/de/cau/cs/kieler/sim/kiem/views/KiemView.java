package de.cau.cs.kieler.sim.kiem.views;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;


public class KiemView extends ViewPart {
	private KiemTableViewer viewer;
	private Action actionEnable;
	private Action actionDisable;
	private Action actionUp;
	private Action actionDown;
	private Action actionMacroStep;
	private Action actionStep;
	private Action actionRun;
	private Action actionPause;
	private Action actionStop;
	private Action doubleClickAction;
	private AimedStepDurationTextField delayTextField;
	private DataComponentEx currentMaster;

	List<DataComponentEx> dataComponentExList;
	
	public KiemPlugin KIEM;
	
	public static final String ID = "de.cau.cs.kieler.sim.kiem.views.KiemView";
	
	public static final int[] columnBoundsCollapsed 
								= { 180, 0 , 20, 120, 50, 50};
	public static final int[] columnBounds 
								= { 180, 100 , 20, 120, 50, 50};
	public int columnProperty = -1;

	public static final String[] columnTitlesCollapsed = { 
			"Component Name",
			"Value", 
			"",
			"Type", 
			//"JSON", 
			"Master", 
			"Model" };
	public static final String[] columnTitles = { 
		"Component Name / Key",
		"Value", 
		"",
		"Type", 
		//"JSON", 
		"Master", 
		"Model" };
	public static final String[] columnToolTipCollapsed = { 
			 "Name of Data Component",
			 "Property Value",
			 "Enabled/Disabled",
 			 "Producer, Consumer or Initialization Data Component", 
 			 //"JSONObject (JSONString otherwise)", 
 			 "Is a Master that leads Execution", 
 			 "Needs selected Model File" };
	public static final String[] columnToolTip = { 
		 "Property Key",
		 "Property Value",
		 "Enabled/Disabled",
		 "Producer, Consumer or Initialization Data Component", 
		 //"JSONObject (JSONString otherwise)", 
		 "Is a Master that leads Execution", 
		 "Needs selected Model File" };
	

	private IWorkbenchWindow window;

 	
  //---------------------------------------------------------------------------	

	/**
	 * The constructor.
	 */
	public KiemView() {
		KIEM = KiemPlugin.getDefault();
		dataComponentExList = getDefaultComponentExList();
		this.currentMaster = null;
	}
	
	private List<DataComponentEx> getDefaultComponentExList() {
		List list = KIEM.getDataComponentList();
		List<DataComponentEx> returnList = 
							new LinkedList<DataComponentEx>();
		//first add pure producer
		for (int c = 0; c < list.size(); c ++) {
			DataComponent dataComponent = (DataComponent)list.get(c);
			DataComponentEx dataComponentEx = 
				new DataComponentEx(dataComponent);
			if (dataComponentEx.isProducerOnly()) {
				returnList.add(dataComponentEx);
			}
		}
		//then add consumer & producer
		for (int c = 0; c < list.size(); c ++) {
			DataComponent dataComponent = (DataComponent)list.get(c);
			DataComponentEx dataComponentEx = 
				new DataComponentEx(dataComponent);
			if (dataComponentEx.isProducerConsumer()) {
				returnList.add(dataComponentEx);
			}
		}
		//then add pure consumer
		for (int c = 0; c < list.size(); c ++) {
			DataComponent dataComponent = (DataComponent)list.get(c);
			DataComponentEx dataComponentEx = 
				new DataComponentEx(dataComponent);
			if (dataComponentEx.isConsumerOnly()) {
				returnList.add(dataComponentEx);
			}
		}
		return returnList;
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
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = 
				dataComponentExList.get(c);
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
		viewer.setInput(dataComponentExList);

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
				// TODO Auto-generated method stub
				updateView(false);
			}
			@Override
			public void treeExpanded(TreeExpansionEvent event) {
				// TODO Auto-generated method stub
				updateView(false);
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				getDoubleClickAction().run();
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
		manager.add(getActionEnable());
		manager.add(getActionDisable());
		manager.add(new Separator());
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		manager.add(getActionStep());
		//TODO: macro step implementation
		//manager.add(getActionMacroStep());
		manager.add(getActionRun());
		manager.add(getActionPause());
		manager.add(getActionStop());
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
		
	private void buildLocalToolBar() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		manager.add(getActionUp());
		manager.add(getActionDown());
		manager.add(new Separator());
		manager.add(getDelayTextField());
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
	public boolean initDataComponentEx() {
		//by default do this silently
		return initDataComponentEx(true);
	}
	
	private boolean initDataComponentEx(boolean silent) {
		if (KIEM.execution != null) return true;

		try {
			//update model file
			KIEM.updateCurrentModelFile();
		}
		catch(Exception e) {
			//not all producer may require a selected model
			//only those which have overridden the needModelFile() method
			//and also are enabled are beeing tested here
			for (int c = 0; c < dataComponentExList.size(); c++) {
			  DataComponentEx dataComponentEx = dataComponentExList.get(c);
			  if (dataComponentEx.isEnabled() &&
					dataComponentEx.isModelFileNeeded()) {
					showWarning("Component '"+dataComponentEx.getName()
							   +"' needs an input model file."+
							   "\nPlease select one in the Project Explorer!");
					KIEM.resetCurrentModelFile();
					return false;
			  }
			}
			KIEM.resetCurrentModelFile();
		}

		int countEnabledProducer = 0;
		int countEnabledConsumer = 0;

		//count all (enabled) data producer and consumer
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			dataComponentEx.setModelFile(KIEM.getCurrentModelFile());
			if (dataComponentEx.isEnabled()) {
				if (dataComponentEx.isProducer()) {
					countEnabledProducer++;
				}
				if (dataComponentEx.isConsumer()) {
					countEnabledConsumer++;
				}
			}//end if enabled
		}//next c

		if (countEnabledProducer < 1) {
			if (!silent)
				showWarning("Please enable at least one Data Producer!");
			KIEM.resetCurrentModelFile();
			KIEM.execution.stopExecution();
			KIEM.execution = null;
			return false;
		}
		else if (countEnabledConsumer < 1) {
			if (!silent)
				showWarning("Please enable at least one Data Consumer!");
			KIEM.resetCurrentModelFile();
			KIEM.execution.stopExecution();
			KIEM.execution = null;
			return false;
		}
		
		this.setAllEnabled(false);
		
		//get all localInterfaceVariables and combine them into
		//globalInterfaceVariables
		//initialize all (enabled) data producer and consumer
		List<String> globalInterfaceVariables = new LinkedList<String>();
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			String[] localInterfaceVariables = 
									dataComponentEx.getLocalInterfaceVariables();
			if (localInterfaceVariables != null) {
				for (int cc = 0; cc < localInterfaceVariables.length; cc++) {
				   String localInterfaceVariable = localInterfaceVariables[cc];
				   globalInterfaceVariables.add(localInterfaceVariable);
				}//next cc
			}//end if enabled
		}//next c
		
		//initialize globalInterfaceVariables in all enabled components
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				dataComponentEx.setGloblaInterfaceVariables
					((String[])globalInterfaceVariables.toArray(new String [0]));
			}//end if enabled
		}//next c
		
		//initialize all (enabled) data producer and consumer
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			dataComponentEx.setModelFile(KIEM.getCurrentModelFile());
			if (dataComponentEx.isEnabled()) {
				dataComponentEx.getDataComponent().initialize();
			}//end if enabled
		}//next c
		
		//now create and run the execution thread
		KIEM.execution = new Execution(dataComponentExList, this);
		//take the last set delay
		KIEM.execution.setAimedStepDuration(KIEM.getAimedStepDuration());
		KIEM.executionThread = new Thread(KIEM.execution);
		KIEM.executionThread.start();

		setAllEnabled(true);
		return true;
	}
	
   //---------------------------------------------------------------------------	
	
	private boolean allDisabled;
	
	private void setAllEnabled(boolean enabled) {
		allDisabled = !enabled;
		getActionEnable().setEnabled(enabled);
		getActionDisable().setEnabled(enabled);
		getActionUp().setEnabled(enabled);
		getActionDown().setEnabled(enabled);
		getActionStep().setEnabled(enabled);
		getActionMacroStep().setEnabled(enabled);
		getActionRun().setEnabled(enabled);
		getActionPause().setEnabled(enabled);
		getActionStop().setEnabled(enabled);
		getDelayTextField().setEnabled(enabled);
	}
	

	public void updateEnabledEnabledDisabledUpDown() {
		Object selection = ((org.eclipse.jface.viewers.StructuredSelection)
				viewer.getSelection()).getFirstElement();
		if (KIEM.execution != null) {
			//execution is running
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
			return;
		}
		if (	(selection == null) 
			 || (selection instanceof KiemProperty)) {
			//no object selected OR property selected
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
		}
		else {
			DataComponentEx dataComponentEx = 
				(DataComponentEx)((org.eclipse.jface.viewers
				.StructuredSelection)viewer.getSelection()).getFirstElement();
			if (dataComponentEx.isEnabled()) {
				//currently enabled
				getActionEnable().setEnabled(false);
				getActionDisable().setEnabled(true);
			}
			else {
				//currently disabled
				getActionEnable().setEnabled(true);
				getActionDisable().setEnabled(false);
			}
			int listIndex = dataComponentExList.indexOf(dataComponentEx);
			if (listIndex <= 0) {
				//currently top
				getActionUp().setEnabled(false);
				getActionDown().setEnabled(true);
			}
			else if (listIndex >= dataComponentExList.size()-1) {
				//currently bottom
				getActionUp().setEnabled(true);
				getActionDown().setEnabled(false);
			}
			else {
				//currently in the middel
				getActionUp().setEnabled(true);
				getActionDown().setEnabled(true);
			}
		}
	}
	

	public void updateViewAsync() {
		Display.getDefault().asyncExec(
				  new Runnable() {
				    public void run(){
				    	updateView(true);
				    }
		});
	}
	
	protected void updateView(boolean deselect) {
		updateColumnsCollapsed();
		viewer.refresh();
		refreshEnabledDisabledTextColors();
		if (deselect)
			viewer.setSelection(null);
		updateEnabled();
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
		updateEnabledEnabledDisabledUpDown();
		if (currentMaster != null) {
			getActionStep().setEnabled(false);
			getActionMacroStep().setEnabled(false);
			getActionRun().setEnabled(false);
			getActionPause().setEnabled(false);
			getActionStop().setEnabled(false);
			getDelayTextField().setEnabled(false);
			return;
		}
		if (allDisabled) return;
		if (KIEM.execution == null) {
			//execution is stopped
			getActionStep().setEnabled(true);
			getActionMacroStep().setEnabled(true);
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(false);
			getDelayTextField().setEnabled(true);
		}
		else if (KIEM.execution.isRunning()) {
			//execution is running
			getActionStep().setEnabled(false);
			getActionMacroStep().setEnabled(false);
			getActionRun().setEnabled(false);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(true);
			getDelayTextField().setEnabled(true);
		}
		else {
			//execution is paused
			getActionMacroStep().setEnabled(true);
			getActionStep().setEnabled(true);
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(false);
			getActionStop().setEnabled(true);
			getDelayTextField().setEnabled(true);
		}
	}
	
  //---------------------------------------------------------------------------	
	
	private Action getActionEnable() {
		if (actionEnable != null) return actionEnable;
		actionEnable = new Action() {
			public void run() {
				DataComponentEx dataComponentEx = (DataComponentEx)
					((org.eclipse.jface.viewers.StructuredSelection)viewer
										.getSelection()).getFirstElement();
				dataComponentEx.setEnabled(true);
				checkForSingleEnabledMaster(false,dataComponentEx);
				updateView(true);
			}
		};
		actionEnable.setText("Enable");
		actionEnable.setToolTipText("Enable DataProducer/DataConsumer");
		return actionEnable;
	}
	
	private Action getActionDisable() {
		if (actionDisable != null) return actionDisable;
		actionDisable = new Action() {
			public void run() {
				DataComponentEx dataComponentEx = (DataComponentEx)
					((org.eclipse.jface.viewers.StructuredSelection)viewer
										.getSelection()).getFirstElement();
				dataComponentEx.setEnabled(false);
				checkForSingleEnabledMaster(false,dataComponentEx);
				updateView(true);
			}
		};
		actionDisable.setText("Disable");
		actionDisable.setToolTipText("Disable DataProducer/DataConsumer");
		return actionDisable;
	}
	
	private Action getActionUp() {
		if (actionUp != null) return actionUp;
		actionUp = new Action() {
			public void run() {
				DataComponentEx dataComponentEx = (DataComponentEx)
					((org.eclipse.jface.viewers.StructuredSelection)viewer
										.getSelection()).getFirstElement();
				int listIndex = dataComponentExList
									.indexOf(dataComponentEx);
				if (listIndex > 0) {
				   dataComponentExList.remove(listIndex);
				   dataComponentExList.add(listIndex-1, dataComponentEx);
				   viewer.refresh();
				   refreshEnabledDisabledTextColors();
				}
				updateView(false);
			}
		};
		actionUp.setText("Schedule before");
		actionUp.setToolTipText("Schedule before");
		actionUp.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/upIcon.png"));
		actionUp.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/upIconDisabled.png"));
		return actionUp;
	}
	
	private Action getActionDown() {
		if (actionDown != null) return actionDown;
		actionDown = new Action() {
			public void run() {
				DataComponentEx dataComponentEx = (DataComponentEx)
					((org.eclipse.jface.viewers.StructuredSelection)viewer
										.getSelection()).getFirstElement();
				int listIndex = 
						dataComponentExList.indexOf(dataComponentEx);
				if (listIndex < dataComponentExList.size()-1) {
				   dataComponentExList.remove(listIndex);
				   dataComponentExList.add(listIndex+1, dataComponentEx);
				   viewer.refresh();
				   refreshEnabledDisabledTextColors();
				}
				updateView(false);
			}
		};
		actionDown.setText("Schedule behind");
		actionDown.setToolTipText("Schedule behind");
		actionDown.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/downIcon.png"));
		actionDown.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/downIconDisabled.png"));
		return actionDown;
	}
	
	private Action getActionStep() {
		if (actionStep != null) return actionStep;
		actionStep = new Action() {
			public void run() {
				if (initDataComponentEx(false)) {
					KIEM.execution.stepExecution();
				}
				updateView(true);
			}
		};
		actionStep.setText("Step");
		actionStep.setToolTipText("Step Execution");
		actionStep.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/stepIcon.png"));
		actionStep.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/stepIconDisabled.png"));
		return actionStep;
	}

	private Action getActionMacroStep() {
		if (actionMacroStep != null) return actionMacroStep;
		actionMacroStep = new Action() {
			public void run() {
				if (initDataComponentEx(false)) {
					KIEM.execution.macroStepExecution();
				}
				updateView(true);
			}
		};
		actionMacroStep.setText("Macro Step");
		actionMacroStep.setToolTipText("Macro Step Execution");
		actionMacroStep.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/macroStepIcon.png"));
		actionMacroStep.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/macroStepIconDisabled.png"));
		return actionMacroStep;
	}
	
	private Action getActionRun() {
		if (actionRun != null) return actionRun;
		actionRun = new Action() {
			public void run() {
				if (initDataComponentEx(false)) {
					KIEM.execution.runExecution();
				}
				updateView(true);
			}
		};
		actionRun.setText("Run");
		actionRun.setToolTipText("Run Execution");
		actionRun.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/playIcon.png"));
		actionRun.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/playIconDisabled.png"));
		return actionRun;
	}
	
	private Action getActionPause() {
		if (actionPause != null) return actionPause;
		actionPause = new Action() {
			public void run() {
				if (initDataComponentEx(false)) {
					KIEM.execution.pauseExecution();
				}
				updateView(true);
			}
		};
		actionPause.setText("Pause");
		actionPause.setToolTipText("Pause Execution");
		actionPause.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/pauseIcon.png"));
		actionPause.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/pauseIconDisabled.png"));
		return actionPause;
	}
	
	private Action getActionStop() {
		if (actionStop != null) return actionStop;
		actionStop = new Action() {
			public void run() {
				if (KIEM.execution != null) {
					KIEM.execution.stopExecution();
				}
				//get results
				long executionTime   = 
					KIEM.execution.getExecutionDurantion();
				long minStepDuration = 
					KIEM.execution.getMinimumStepDuration();
				long wavStepDuration = 
					KIEM.execution.getWeightedAverageStepDuration();
				long aveStepDuration = 
					KIEM.execution.getAverageStepDuration();
				long maxStepDuration = 
					KIEM.execution.getMaximumStepDuration();
				long steps           = 
					KIEM.execution.getSteps();
				long aimedStepDuration = 
					KIEM.execution.getAimedStepDuration();
				
				KIEM.resetCurrentModelFile();
				KIEM.execution = null;
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
		};
		actionStop.setText("Stop");
		actionStop.setToolTipText("Stop Execution");
		actionStop.setImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/stopIcon.png"));
		actionStop.setDisabledImageDescriptor(
				KiemPlugin.getImageDescriptor("icons/stopIconDisabled.png"));
		return actionStop;
	}
	
	private Action getDoubleClickAction() {
		if (doubleClickAction != null) return doubleClickAction;
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				if (selection != null) {
					Object obj = ((IStructuredSelection)selection)
													.getFirstElement();
					if (obj instanceof DataComponentEx) {
						//only if execution is stopped
						if (KIEM.execution == null) {
						  DataComponentEx dataComponentEx = (DataComponentEx)obj;
						  //toggle enabledness
						  dataComponentEx.setEnabled(!dataComponentEx.isEnabled());
						  checkForSingleEnabledMaster(false,dataComponentEx);
						  updateView(true);
						}
					}// end if - selected
				}// end if - selected
				updateEnabled();
			}//end run
		};
		return doubleClickAction;
	}

	private AimedStepDurationTextField getDelayTextField() {
		if (delayTextField != null) return delayTextField;
		delayTextField = new AimedStepDurationTextField(KIEM);
		return delayTextField;
	}
 
  //---------------------------------------------------------------------------	

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

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
		
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentTemp = 
				dataComponentExList.get(c);
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
		   currentMaster.getDataComponent().masterSetKIEMInstances(KIEM, this);
		}
		
	}
	
  //---------------------------------------------------------------------------	

}