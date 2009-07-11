package de.cau.cs.kieler.sim.kiem.views;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.ui.AimedStepDurationTextField;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;


public class KiemView extends ViewPart {
	private TableViewer viewer;
	private Action actionEnable;
	private Action actionDisable;
	private Action actionUp;
	private Action actionDown;
	private Action actionStep;
	private Action actionRun;
	private Action actionPause;
	private Action actionStop;
	private Action doubleClickAction;
	private AimedStepDurationTextField delayTextField;

	public KiemPlugin KIEM;
	
	public static final String ID = "de.cau.cs.kieler.sim.kiem.views.KiemView";

	private IWorkbenchWindow window;

 	
  //---------------------------------------------------------------------------	

	/**
	 * The constructor.
	 */
	public KiemView() {
		KIEM = KiemPlugin.getDefault();
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
		for (int c = 0; c < KIEM.getDataComponentList().size(); c++) {
			DataComponent dataComponent = 
				KIEM.getDataComponentList().get(c);
			if (dataComponent.isEnabled()) {
				viewer.getTable().getItem(c).setForeground(colorEnabled);
				if (dataComponent.isMaster()) {
					viewer.getTable().getItem(c).setForeground(colorMaster);
				}
			}
			else
				viewer.getTable().getItem(c).setForeground(colorDisabled);
		}
	}
	
	
	
  //---------------------------------------------------------------------------	
	
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		viewer.setContentProvider(new KiemContentProvider());
		viewer.setLabelProvider(new KiemLabelProvider(this));
		viewer.setInput(KIEM.getDataComponentList());

		buildLocalToolBar();
		hookContextMenu();
		hookSelectionChangedAction();
		hookDoubleClickAction();
		checkForSingleEnabledMaster(true);
		updateView();
	}
	
	// This will create the columns for the table
	private void createColumns(TableViewer viewer) {
		String[] titles = { "", 
							"Component Name", 
							"Type", 
							//"JSON", 
							"Master", 
							"Model" };
		String[] toolTip = { "Enabled/Disabled", 
							 "Name of Data Producer/Consumer", 
				 			 "Producer or Consumer", 
				 			 //"JSONObject (JSONString otherwise)", 
				 			 "Is a Master that leads execution", 
				 			 "Needs selected model file" };
		int[] bounds = { 22, 180, 110, 45, 45};

		for (int i = 0; i < titles.length; i++) {
			TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
			column.getColumn().setText(titles[i]);
			column.getColumn().setWidth(bounds[i]);
			column.getColumn().setToolTipText(toolTip[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			if (i == 0)
				column.setEditingSupport(new KiemDataEditing(this, viewer, i));
		}
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}
	
  //---------------------------------------------------------------------------	

	private void hookSelectionChangedAction() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateEnabled();
			}
		});
	}
	private void hookDoubleClickAction() {
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
	public boolean initDataComponent() {
		return initDataComponent(true);
	}
	
	private boolean initDataComponent(boolean silent) {
		if (KIEM.execution != null) return true;

		try {
			//update model file
			KIEM.updateCurrentModelFile();
		}
		catch(Exception e) {
			//not all producer may require a selected model
			//only those which have overridden the needModelFile() method
			//and also are enabled are beeing tested here
			for (int c = 0; c < KIEM.getDataComponentList().size(); c++) {
				DataComponent dataComponent = KIEM.getDataComponentList().get(c);
				if (dataComponent.isEnabled() &&
					dataComponent.needModelFile()) {
					showWarning("Component '"+dataComponent.getName()+"' needs an input model file."+
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
		for (int c = 0; c < KIEM.getDataComponentList().size(); c++) {
			DataComponent dataComponent = KIEM.getDataComponentList().get(c);
			dataComponent.setModelFile(KIEM.getCurrentModelFile());
			if (dataComponent.isEnabled()) {
				if (dataComponent.isProducer()) {
					countEnabledProducer++;
				}
				if (dataComponent.isConsumer()) {
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
		
		//initialize all (enabled) data producer and consumer
		for (int c = 0; c < KIEM.getDataComponentList().size(); c++) {
			DataComponent dataComponent = KIEM.getDataComponentList().get(c);
			dataComponent.setModelFile(KIEM.getCurrentModelFile());
			if (dataComponent.isEnabled()) {
				dataComponent.initialize();
			}//end if enabled
		}//next c
		
		//now create and run the execution thread
		KIEM.execution = new Execution(KIEM.getDataComponentList(), this);
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
		getActionRun().setEnabled(enabled);
		getActionPause().setEnabled(enabled);
		getActionStop().setEnabled(enabled);
		getDelayTextField().setEnabled(enabled);
	}
	

	public void updateEnabledEnabledDisabledUpDown() {
		if (KIEM.execution != null) {
			//execution is running
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
			return;
		}
		if (((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement() == null) {
			//no object selected
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
		}
		else {
			DataComponent dataComponent = (DataComponent)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
			if (dataComponent.isEnabled()) {
				//currently enabled
				getActionEnable().setEnabled(false);
				getActionDisable().setEnabled(true);
			}
			else {
				//currently disabled
				getActionEnable().setEnabled(true);
				getActionDisable().setEnabled(false);
			}
			int listIndex = KIEM.getDataComponentList().indexOf(dataComponent);
			if (listIndex <= 0) {
				//currently top
				getActionUp().setEnabled(false);
				getActionDown().setEnabled(true);
			}
			else if (listIndex >= KIEM.getDataComponentList().size()-1) {
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
	
	public void updateView() {
		viewer.refresh();
		refreshEnabledDisabledTextColors();
		viewer.setSelection(null);
		updateEnabled();

	}
	
	public void updateEnabled() {
		updateEnabled(false);
	}
	public void updateEnabled(boolean silent) {
		updateEnabledEnabledDisabledUpDown();
		if (KIEM.getMaster() != null) {
			getActionStep().setEnabled(false);
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
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(false);
			getDelayTextField().setEnabled(true);
		}
		else if (KIEM.execution.isRunning()) {
			//execution is running
			getActionStep().setEnabled(false);
			getActionRun().setEnabled(false);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(true);
			getDelayTextField().setEnabled(true);
		}
		else {
			//execution is paused
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
				DataComponent dataComponent = (DataComponent)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataComponent.setEnabled(true);
				checkForSingleEnabledMaster(false,dataComponent);
				updateView();
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
				DataComponent dataComponent = (DataComponent)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataComponent.setEnabled(false);
				checkForSingleEnabledMaster(false,dataComponent);
				updateView();
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
				DataComponent dataComponent = (DataComponent)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataComponentList().indexOf(dataComponent);
				if (listIndex > 0) {
				    KIEM.getDataComponentList().remove(listIndex);
					KIEM.getDataComponentList().add(listIndex-1, dataComponent);
					viewer.refresh();
					refreshEnabledDisabledTextColors();
				}
				updateView();
			}
		};
		actionUp.setText("Schedule before");
		actionUp.setToolTipText("Schedule before");
		actionUp.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/upIcon.png"));
		actionUp.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/UpIconDisabled.png"));
		return actionUp;
	}
	
	private Action getActionDown() {
		if (actionDown != null) return actionDown;
		actionDown = new Action() {
			public void run() {
				DataComponent dataComponent = (DataComponent)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataComponentList().indexOf(dataComponent);
				if (listIndex < KIEM.getDataComponentList().size()-1) {
					KIEM.getDataComponentList().remove(listIndex);
					KIEM.getDataComponentList().add(listIndex+1, dataComponent);
					viewer.refresh();
					refreshEnabledDisabledTextColors();
				}
				updateView();
			}
		};
		actionDown.setText("Schedule behind");
		actionDown.setToolTipText("Schedule behind");
		actionDown.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/DownIcon.png"));
		actionDown.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/downIconDisabled.png"));
		return actionDown;
	}
	
	private Action getActionStep() {
		if (actionStep != null) return actionStep;
		actionStep = new Action() {
			public void run() {
				if (initDataComponent(false)) {
					KIEM.execution.stepExecution();
				}
				updateView();
			}
		};
		actionStep.setText("Step");
		actionStep.setToolTipText("Step execution");
		actionStep.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StepIcon.png"));
		actionStep.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/stepIconDisabled.png"));
		return actionStep;
	}
	
	private Action getActionRun() {
		if (actionRun != null) return actionRun;
		actionRun = new Action() {
			public void run() {
				if (initDataComponent(false)) {
					KIEM.execution.runExecution();
				}
				updateView();
			}
		};
		actionRun.setText("Run");
		actionRun.setToolTipText("Run execution");
		actionRun.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PlayIcon.png"));
		actionRun.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/playIconDisabled.png"));
		return actionRun;
	}
	
	private Action getActionPause() {
		if (actionPause != null) return actionPause;
		actionPause = new Action() {
			public void run() {
				if (initDataComponent(false)) {
					KIEM.execution.pauseExecution();
				}
				updateView();
			}
		};
		actionPause.setText("Pause");
		actionPause.setToolTipText("Pause execution");
		actionPause.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PauseIcon.png"));
		actionPause.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/pauseIconDisabled.png"));
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
				long executionTime = KIEM.execution.getExecutionDurantion();
				long minStepDuration = KIEM.execution.getMinimumStepDuration();
				long wavStepDuration = KIEM.execution.getWeightedAverageStepDuration();
				long aveStepDuration = KIEM.execution.getAverageStepDuration();
				long maxStepDuration = KIEM.execution.getMaximumStepDuration();
				long steps         = KIEM.execution.getSteps();
				long aimedStepDuration = KIEM.execution.getAimedStepDuration();
				
				KIEM.resetCurrentModelFile();
				KIEM.execution = null;
				updateView();

				//show execution results
				showMessage("KIELER Execution Manager - Execution Timing Results",
							"                          Number of Steps : "+steps+"\n"+
							"                Overall Execution Time : "+executionTime+" ms\n\n"+
						    "                    Aimed Step Duration : "+aimedStepDuration+ " ms\n"+
						    "                 Minimum Step Duration : "+minStepDuration+ " ms\n"+
						    "Weighted Average Step Duration : "+wavStepDuration+ " ms\n"+
						    "                 Average Step Duration : "+aveStepDuration+ " ms\n"+
						    "                Maximum Step Duration : "+maxStepDuration+ " ms");
				
			}
		};
		actionStop.setText("Stop");
		actionStop.setToolTipText("Stop execution");
		actionStop.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StopIcon.png"));
		actionStop.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/stopIconDisabled.png"));
		return actionStop;
	}
	
	private Action getDoubleClickAction() {
		if (doubleClickAction != null) return doubleClickAction;
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				if (selection != null) {
					Object obj = ((IStructuredSelection)selection).getFirstElement();
					if (obj != null) {
						//only if execution is stopped
						if (KIEM.execution == null) {
							//showMessage("Double-click detected on "+obj.toString());
							DataComponent dataComponent = (DataComponent)obj;
							//toggle enabledness
							dataComponent.setEnabled(!dataComponent.isEnabled());
							checkForSingleEnabledMaster(false,dataComponent);
							updateView();
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
											DataComponent dataComponent) {
		KIEM.setMaster(null);
		if (dataComponent != null &&
			dataComponent.isMaster() &&
			dataComponent.isEnabled()) {
			//preset NEW selection
			KIEM.setMaster(dataComponent); 
		}
		
		for (int c = 0; c < KIEM.getDataComponentList().size(); c++) {
			DataComponent dataComponentTemp = 
				KIEM.getDataComponentList().get(c);
			dataComponentTemp.masterSetKIEMInstances(null, null);
			if (dataComponentTemp.isMaster() &&
				dataComponentTemp.isEnabled() &&
				dataComponentTemp != KIEM.getMaster()) {
				if (KIEM.getMaster() == null) {
					KIEM.setMaster(dataComponentTemp);
				} else {
					if (!silent)
						showWarning("At most one master data component is allowed!\n'"+dataComponentTemp.getName()+"' will be disabled.");
					//disable it//
					dataComponentTemp.setEnabled(false);
					this.viewer.refresh();
					this.refreshEnabledDisabledTextColors();
				}
			}
		}
		if (KIEM.getMaster() != null) {
			KIEM.getMaster().masterSetKIEMInstances(KIEM, this);
		}
		
	}
	
  //---------------------------------------------------------------------------	

}