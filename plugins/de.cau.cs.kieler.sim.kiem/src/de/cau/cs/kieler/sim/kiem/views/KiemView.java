package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

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
import de.cau.cs.kieler.sim.kiem.ui.DelayTextField;

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
	private DelayTextField delayTextField;

	private KiemPlugin KIEM;
	
	public static final String ID = "de.cau.cs.kieler.sim.kiem.views.KiemView";

	private IWorkbenchWindow window;

 
  //---------------------------------------------------------------------------
	
	class ViewContentProvider implements IStructuredContentProvider {
		List<DataProducerConsumer> dataProducerConsumerList;
		
		public ViewContentProvider(List<DataProducerConsumer> dataProducerConsumerList) {
			super();
			this.dataProducerConsumerList = dataProducerConsumerList;
		}
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		
		public DataProducerConsumer[] getElements(Object parent) {
			DataProducerConsumer[] returnList = new DataProducerConsumer[dataProducerConsumerList.size()];
			for (int i = 0; i < dataProducerConsumerList.size(); i++) {
				DataProducerConsumer dataProducerConsumer = dataProducerConsumerList.get(i);
				if (dataProducerConsumer.getClass().getName().equals("de.cau.cs.kieler.sim.abro.DataProducer")) {
					returnList[i] = dataProducerConsumer;
				}
				else {
					returnList[i] = dataProducerConsumer; 
				}
			}
			return returnList;
		}
	}
	
  //---------------------------------------------------------------------------
	
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			String producerConsumerType = "DataProducer";
			if (((DataProducerConsumer)obj).isConsumer())
				producerConsumerType = "DataConsumer";
			return getText(((DataProducerConsumer)obj).getName() + " - " + producerConsumerType);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)obj;
			if (dataProducerConsumer.isProducer()) {
				if (dataProducerConsumer.isEnabled()) {
					return 
					KiemPlugin.getImageDescriptor("icons/producer.png").createImage();
				}
				else {
					return 
					KiemPlugin.getImageDescriptor("icons/producerDisabled.png").createImage();
				}
			}
			else if (dataProducerConsumer.isConsumer()) {
				if (dataProducerConsumer.isEnabled()) {
					return 
					KiemPlugin.getImageDescriptor("icons/consumer.png").createImage();
				}
				else {
					return 
					KiemPlugin.getImageDescriptor("icons/consumerDisabled.png").createImage();
				}
			}
			return null;
		}
	}
	
  //---------------------------------------------------------------------------	

	/**
	 * The constructor.
	 */
	public KiemView() {
		KIEM = KiemPlugin.getDefault();
	}
	
	public String getModelFile() {
		IWorkbenchWindow window = this.getViewSite().getWorkbenchWindow();
		//get model instance file
		IEditorPart Editor = window.getActivePage().getActiveEditor();
		FileEditorInput uri = (FileEditorInput)Editor.getEditorInput();
		String ModelFile = uri.getURI().getRawPath();// .getPath().makeAbsolute().toString();// .lastSegment().toString();// .toFile().toURI().getRawPath(); // .toString();// .toString();// .getURI() .toFileString();
		//delete "_diagram"-extension
		ModelFile = ModelFile.replace("_diagram", "");
		//ModelFile = ModelFile.substring(0,ModelFile.length()-8);
		return ModelFile;
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
		for (int c = 0; c < KIEM.getDataProducerConsumerList().size(); c++) {
			DataProducerConsumer dataProducerConsumer = 
				KIEM.getDataProducerConsumerList().get(c);
			if (dataProducerConsumer.isEnabled())
				viewer.getTable().getItem(c).setForeground(colorEnabled);
			else
				viewer.getTable().getItem(c).setForeground(colorDisabled);
		}
	}
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider(KIEM.getDataProducerConsumerList()));
		viewer.setLabelProvider(new ViewLabelProvider());
		//viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "de.cau.cs.kieler.sim.viewer");
		
		buildLocalToolBar();
		hookContextMenu();
		hookSelectionChangedAction();
		hookDoubleClickAction();
		updateEnabled();
	}

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
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"KIELER Execution Manager",
			message);
	}

  //---------------------------------------------------------------------------	
	
	private DataProducer getDataProducer(String DataProducerName) {
		for (int c = 0; c < KIEM.getDataProducerConsumerList().size(); c++) {
			Object dataProducerConsumer = KIEM.getDataProducerConsumerList().get(c);
			if (dataProducerConsumer.getClass().getName().equals("de.cau.cs.kieler.sim.abro.DataProducer")) {
				String vglSelection = ((DataProducer)dataProducerConsumer).getName();
			if (vglSelection.equals(DataProducerName))  
				return (DataProducer)dataProducerConsumer;
			}
		}
		return null;
	}

	private DataConsumer getDataConsumer(String DataConsumerName) {
		for (int c = 0; c < KIEM.getDataProducerConsumerList().size(); c++) {
			Object dataProducerConsumer = KIEM.getDataProducerConsumerList().get(c);
			if (dataProducerConsumer.getClass().getName().equals("de.cau.cs.kieler.sim.abro.DataConsumer")) {
				String vglSelection = ((DataConsumer)dataProducerConsumer).getName();
			if (vglSelection.equals(DataConsumerName))  
				return (DataConsumer)dataProducerConsumer;
			}
		}
		return null;
	}
	
  //---------------------------------------------------------------------------
	
	private boolean initDataProducerConsumer() {
		if (KIEM.execution != null) return true;

		try {
			//update model file
			KIEM.updateCurrentModelFile();
		}
		catch(Exception e) {
			//not all producer may require a selected model
			//let the producer show its own error message
			//showMessage("Please select a model to execute in the Project Explorer!");
			KIEM.resetCurrentModelFile();
			//return false;
		}

		int countEnabledProducer = 0;
		int countEnabledConsumer = 0;

		//count all (enabled) data producer and consumer
		for (int c = 0; c < KIEM.getDataProducerConsumerList().size(); c++) {
			DataProducerConsumer dataProducerConsumer = KIEM.getDataProducerConsumerList().get(c);
			dataProducerConsumer.setModelFile(KIEM.getCurrentModelFile());
			if (dataProducerConsumer.isEnabled()) {
				if (dataProducerConsumer.isProducer()) {
					countEnabledProducer++;
				}
				else if (dataProducerConsumer.isConsumer()) {
					countEnabledConsumer++;
				}
			}//end if enabled
		}//next c

		if (countEnabledProducer < 1) {
			showMessage("Please enable at least one DataProducer!");
			KIEM.resetCurrentModelFile();
			KIEM.execution.stopExecution();
			KIEM.execution = null;
			return false;
		}
		else if (countEnabledConsumer < 1) {
			showMessage("Please enable at least one DataConsumer!");
			KIEM.resetCurrentModelFile();
			KIEM.execution.stopExecution();
			KIEM.execution = null;
			return false;
		}
		
		this.setAllEnabled(false);
		
		//initialize all (enabled) data producer and consumer
		for (int c = 0; c < KIEM.getDataProducerConsumerList().size(); c++) {
			DataProducerConsumer dataProducerConsumer = KIEM.getDataProducerConsumerList().get(c);
			dataProducerConsumer.setModelFile(KIEM.getCurrentModelFile());
			if (dataProducerConsumer.isEnabled()) {
				if (dataProducerConsumer.isProducer()) {
					((DataProducer)dataProducerConsumer).ExecutionInitialize();
				}
				else if (dataProducerConsumer.isConsumer()) {
					((DataConsumer)dataProducerConsumer).ExecutionInitialize();
				}
			}//end if enabled
		}//next c
		
		//now create and run the execution thread
		KIEM.execution = new Execution(KIEM.getDataProducerConsumerList());
		//take the last set delay
		KIEM.execution.setDelay(KIEM.getDelay());
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
	
	
	private void updateEnabled() {
		if (allDisabled) return;
		if (KIEM.execution == null) {
			//execution is stopped
			if (((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement() == null) {
				//no object selected
				getActionEnable().setEnabled(false);
				getActionDisable().setEnabled(false);
				getActionUp().setEnabled(false);
				getActionDown().setEnabled(false);
			}
			else {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				if (dataProducerConsumer.isEnabled()) {
					//currently enabled
					getActionEnable().setEnabled(false);
					getActionDisable().setEnabled(true);
				}
				else {
					//currently disabled
					getActionEnable().setEnabled(true);
					getActionDisable().setEnabled(false);
				}
				int listIndex = KIEM.getDataProducerConsumerList().indexOf(dataProducerConsumer);
				if (listIndex <= 0) {
					//currently top
					getActionUp().setEnabled(false);
					getActionDown().setEnabled(true);
				}
				else if (listIndex >= KIEM.getDataProducerConsumerList().size()-1) {
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
			getActionStep().setEnabled(true);
			getActionRun().setEnabled(true);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(false);
			getDelayTextField().setEnabled(true);
		}
		else if (KIEM.execution.isRunning()) {
			//execution is running
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
			getActionStep().setEnabled(false);
			getActionRun().setEnabled(false);
			getActionPause().setEnabled(true);
			getActionStop().setEnabled(true);
			getDelayTextField().setEnabled(true);
		}
		else {
			//execution is paused
			getActionEnable().setEnabled(false);
			getActionDisable().setEnabled(false);
			getActionUp().setEnabled(false);
			getActionDown().setEnabled(false);
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
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataProducerConsumer.setEnabled(true);
				viewer.refresh();
				refreshEnabledDisabledTextColors();
				viewer.setSelection(null);
				updateEnabled();
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
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataProducerConsumer.setEnabled(false);
				viewer.refresh();
				refreshEnabledDisabledTextColors();
				viewer.setSelection(null);
				updateEnabled();
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
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataProducerConsumerList().indexOf(dataProducerConsumer);
				if (listIndex > 0) {
				    KIEM.getDataProducerConsumerList().remove(listIndex);
					KIEM.getDataProducerConsumerList().add(listIndex-1, dataProducerConsumer);
					viewer.refresh();
					refreshEnabledDisabledTextColors();
				}
				updateEnabled();
			}
		};
		actionUp.setText("Up");
		actionUp.setToolTipText("Schedule before");
		actionUp.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/upIcon.png"));
		actionUp.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/UpIconDisabled.png"));
		return actionUp;
	}
	
	private Action getActionDown() {
		if (actionDown != null) return actionDown;
		actionDown = new Action() {
			public void run() {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataProducerConsumerList().indexOf(dataProducerConsumer);
				if (listIndex < KIEM.getDataProducerConsumerList().size()-1) {
					KIEM.getDataProducerConsumerList().remove(listIndex);
					KIEM.getDataProducerConsumerList().add(listIndex+1, dataProducerConsumer);
					viewer.refresh();
					refreshEnabledDisabledTextColors();
				}
				updateEnabled();
			}
		};
		actionDown.setText("Down");
		actionDown.setToolTipText("Schedule behind");
		actionDown.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/DownIcon.png"));
		actionDown.setDisabledImageDescriptor(KiemPlugin.getImageDescriptor("icons/downIconDisabled.png"));
		return actionDown;
	}
	
	private Action getActionStep() {
		if (actionStep != null) return actionStep;
		actionStep = new Action() {
			public void run() {
				if (initDataProducerConsumer()) {
					KIEM.execution.stepExecution();
				}
				updateEnabled();
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
				if (initDataProducerConsumer()) {
					KIEM.execution.runExecution();
				}
				updateEnabled();
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
				if (initDataProducerConsumer()) {
					KIEM.execution.pauseExecution();
				}
				updateEnabled();
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
				KIEM.resetCurrentModelFile();
				KIEM.execution = null;
				updateEnabled();
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
						//showMessage("Double-click detected on "+obj.toString());
						DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)obj;
						//toggle enabledness
						dataProducerConsumer.setEnabled(!dataProducerConsumer.isEnabled());
						viewer.refresh();
						refreshEnabledDisabledTextColors();
						viewer.setSelection(null);
					}// end if - selected
				}// end if - selected
				updateEnabled();
			}//end run
		};
		return doubleClickAction;
	}

	private DelayTextField getDelayTextField() {
		if (delayTextField != null) return delayTextField;
		delayTextField = new DelayTextField(KIEM);
		return delayTextField;
	}
 
  //---------------------------------------------------------------------------	

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	

}