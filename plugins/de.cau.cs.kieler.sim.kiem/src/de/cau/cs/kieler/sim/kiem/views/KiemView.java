package de.cau.cs.kieler.sim.kiem.views;


//import org.eclipse.swt.graphics.Color;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
//import org.eclipse.swt.graphics.
import org.eclipse.swt.graphics.RGB;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.*;
import org.eclipse.jface.resource.ColorDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.Tools;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;
import de.cau.cs.kieler.sim.actions.DelayTextField;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class KiemView extends ViewPart {
	private TableViewer viewer;
	private Action action0;
	private Action action1;
	private Action action2;
	private Action action3;
	private Action action4;
	private Action action5;
	private Action action6;
	private Action action7;
	private Action doubleClickAction;
	private DelayTextField delayTextField;

	private KiemPlugin KIEM;
	
	public static final String ID = "de.cau.cs.kieler.sim.kiem.views.KiemView";

	private IWorkbenchWindow window;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
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
					KiemPlugin.getImageDescriptor("icons/ProducerEnabled.gif").createImage();
				}
				else {
					return 
					KiemPlugin.getImageDescriptor("icons/ProducerDisabled.gif").createImage();
				}
			}
			else if (dataProducerConsumer.isConsumer()) {
				if (dataProducerConsumer.isEnabled()) {
					return 
					KiemPlugin.getImageDescriptor("icons/ConsumerEnabled.gif").createImage();
				}
				else {
					return 
					KiemPlugin.getImageDescriptor("icons/ConsumerDisabled.gif").createImage();
				}
			}
			return null;
		}
	}
	class NameSorter extends ViewerSorter {
	}

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
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				KiemView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(action1);
		//manager.add(new Separator());
		//manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action0);
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
		manager.add(action3);
		manager.add(new Separator());
		manager.add(action4);
		manager.add(action5);
		manager.add(action6);
		manager.add(action7);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action2);
		manager.add(action3);
		manager.add(new Separator());
		manager.add(delayTextField);
		manager.add(new Separator());
		manager.add(action4);
		manager.add(action5);
		manager.add(action6);
		manager.add(action7);
	}
	
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
		
		setActionsEnabled(false);
		
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

		setActionsEnabled(true);
		
		return true;
	}
	
	private void setActionsEnabled(boolean enabled) {
		action0.setEnabled(enabled);
		action1.setEnabled(enabled);
		action2.setEnabled(enabled);
		action3.setEnabled(enabled);
		action4.setEnabled(enabled);
		action5.setEnabled(enabled);
		action6.setEnabled(enabled);
		action7.setEnabled(enabled);
		delayTextField.setEnabled(enabled);
	}
	

	private void makeActions() {
		delayTextField = new DelayTextField(KIEM);
		
		action0 = new Action() {
			public void run() {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataProducerConsumer.setEnabled(true);
				viewer.refresh();
				Color color = new Color(null, new RGB(0,0,0));
				viewer.getTable().getItem(viewer.getTable().getSelectionIndex()).setForeground(color);
				viewer.setSelection(null);
			}
		};
		action0.setText("Enable");
		action0.setToolTipText("Enable DataProducer/DataConsumer");

		action1 = new Action() {
			public void run() {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				dataProducerConsumer.setEnabled(false);
				viewer.refresh();
				Color color = new Color(null, new RGB(150,150,150));
				viewer.getTable().getItem(viewer.getTable().getSelectionIndex()).setForeground(color);
				viewer.setSelection(null);
			}
		};
		action1.setText("Disable");
		action1.setToolTipText("Disable DataProducer/DataConsumer");
		
		
		action2 = new Action() {
			public void run() {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataProducerConsumerList().indexOf(dataProducerConsumer);
				if (listIndex > 0) {
				    KIEM.getDataProducerConsumerList().remove(listIndex);
					KIEM.getDataProducerConsumerList().add(listIndex-1, dataProducerConsumer);
					viewer.refresh();
				}
			}
		};
		action2.setText("Up");
		action2.setToolTipText("Schedule before");
		action2.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/UpIcon.gif"));

		
		action3 = new Action() {
			public void run() {
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
				int listIndex = KIEM.getDataProducerConsumerList().indexOf(dataProducerConsumer);
				if (listIndex < KIEM.getDataProducerConsumerList().size()-1) {
					KIEM.getDataProducerConsumerList().remove(listIndex);
					KIEM.getDataProducerConsumerList().add(listIndex+1, dataProducerConsumer);
					viewer.refresh();
				}
			}
		};
		action3.setText("Down");
		action3.setToolTipText("Schedule behind");
		action3.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/DownIcon.gif"));

		
		action4 = new Action() {
			public void run() {
				if (initDataProducerConsumer()) {
					KIEM.execution.stepExecution();
				}
			}
		};
		action4.setText("Step");
		action4.setToolTipText("Step execution");
		action4.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StepIcon.gif"));

		action5 = new Action() {
			public void run() {
				if (initDataProducerConsumer()) {
					KIEM.execution.runExecution();
				}
			}
		};
		action5.setText("Run");
		action5.setToolTipText("Run execution");
		action5.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PlayIcon.gif"));
		
		
		action6 = new Action() {
			public void run() {
				if (initDataProducerConsumer()) {
					KIEM.execution.pauseExecution();
				}
			}
		};
		action6.setText("Pause");
		action6.setToolTipText("Pause execution");
		action6.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PauseIcon.gif"));

		action7 = new Action() {
			public void run() {
				if (KIEM.execution != null) {
					KIEM.execution.stopExecution();
				}
				KIEM.resetCurrentModelFile();
				KIEM.execution = null;
			}
		};
		action7.setText("Stop");
		action7.setToolTipText("Stop execution");
		action7.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StopIcon.gif"));
		
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				//showMessage("Double-click detected on "+obj.toString());
				DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)obj;
				//toggle enabledness
				dataProducerConsumer.setEnabled(!dataProducerConsumer.isEnabled());
				viewer.refresh();
				//change the text color (black or gray)
				Color color = new Color(null, new RGB(150,150,150));
				if (dataProducerConsumer.isEnabled())
					color = new Color(null, new RGB(0,0,0));
				viewer.getTable().getItem(viewer.getTable().getSelectionIndex()).setForeground(color);
				viewer.setSelection(null);
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"KIELER Execution Manager",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	

}