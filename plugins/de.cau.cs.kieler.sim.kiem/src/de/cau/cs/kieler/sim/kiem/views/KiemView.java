package de.cau.cs.kieler.sim.kiem.views;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.extension.*;
import de.cau.cs.kieler.sim.kiem.Tools;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;

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
	private Action doubleClickAction;
	
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
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		
		public Object[] getElements(Object parent) {
			String[] returnList = new String[KIEM.getDataProducerList().size()];
			for (int i = 0; i < KIEM.getDataProducerList().size(); i++) {
				returnList[i] = KIEM.getDataProducerList().get(i).getName();
			}
			
			return returnList;
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			//return null;
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
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
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
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
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action0);
		manager.add(action1);
		manager.add(action2);
		manager.add(action3);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action0);
		manager.add(action1);
		manager.add(action2);
		manager.add(action3);
	}
	
	private DataProducer getDataProducer(String DataProducerName) {
		for (int c = 0; c < KIEM.getDataProducerList().size(); c++) {
			String vglSelection = KIEM.getDataProducerList().get(c).getName();
			if (vglSelection.equals(DataProducerName))  
			 return (DataProducer)KIEM.getDataProducerList().get(c);
		}
		return null;
	}
	
	private DataProducer initDataProducer() {
		if (KiemPlugin.getDefault().currentDataProducer != null) return KiemPlugin.getDefault().currentDataProducer;
		try {
			ISelection selection = viewer.getSelection();
			Object obj = ((IStructuredSelection)selection).getFirstElement();
			
			KiemPlugin.getDefault().currentDataProducer = getDataProducer((String)obj);
			String ModelFile = getModelFile();
			KiemPlugin.getDefault().currentDataProducer.ExecutionInitialize(ModelFile);
		} catch(Exception e) {
			//e.printStackTrace();
			showMessage("Please select a DataProducer!");
			KiemPlugin.getDefault().currentDataProducer = null;
		}
		return KiemPlugin.getDefault().currentDataProducer;
	}
	

	private void makeActions() {
		action0 = new Action() {
			public void run() {
				DataProducer dataProducer = initDataProducer();
				dataProducer.ExecutionStep();
			}
		};
		action0.setText("Step");
		action0.setToolTipText("Make a step");
		action0.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StepIcon.gif"));

		action1 = new Action() {
			public void run() {
				DataProducer dataProducer = initDataProducer();
				dataProducer.ExecutionPlay();
			}
		};
		action1.setText("Play");
		action1.setToolTipText("Make several steps");
		action1.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PlayIcon.gif"));
		
		
		action2 = new Action() {
			public void run() {
				DataProducer dataProducer = initDataProducer();
				dataProducer.ExecutionPause();
			}
		};
		action2.setText("Pause");
		action2.setToolTipText("Pause simulation");
		action2.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/PauseIcon.gif"));

		action3 = new Action() {
			public void run() {
				DataProducer dataProducer = initDataProducer();
				dataProducer.ExecutionStop();
				//reset dataproducer - next time new init
				KiemPlugin.getDefault().currentDataProducer = null;
			}
		};
		action3.setText("Stop");
		action3.setToolTipText("Stop simulation");
		action3.setImageDescriptor(KiemPlugin.getImageDescriptor("icons/StopIcon.gif"));
		
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
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
			"KlePto",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	

}