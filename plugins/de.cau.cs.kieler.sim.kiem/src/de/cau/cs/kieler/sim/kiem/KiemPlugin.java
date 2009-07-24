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

package de.cau.cs.kieler.sim.kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;

//import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.jface.viewers.IStructuredSelection;
//import org.eclipse.core.runtime.IAdaptable;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

/**
 * The activator class controls the plug-in life cycle
 */
public class KiemPlugin extends AbstractUIPlugin {

	
	public static final int AIMED_STEP_DURATION_DEFAULT = 500;
	public static final int AIMED_STEP_DURATION_MIN = 1;
	public static final int AIMED_STEP_DURATION_MAX = 3600000;
	
	//The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem";

	//The shared instance
	private static KiemPlugin plugin;
	
	//List of available dataProducers and dataObservers
	private List<DataComponent> dataComponentList;
	
	//List of selected dataComponentEx's (modified by KiemView)
	private List<DataComponentEx> dataComponentExList;
	
	//Execution object and thread
	public Execution execution;
	public Thread executionThread;
	private int aimedStepDuration;
	private KiemView KIEMViewInstance;
	
	/**
	 * The constructor
	 */
	public KiemPlugin() {
		dataComponentList = this.getDataComponentList();
		dataComponentExList = getDefaultComponentExList();
		execution = null;
		aimedStepDuration = AIMED_STEP_DURATION_DEFAULT;
		KIEMViewInstance = null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static KiemPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public List<DataComponentEx> getDataComponentExList() {
		return this.dataComponentExList;
	}
	
	public void updateViewAsync() {
		if (this.KIEMViewInstance != null) {
			this.KIEMViewInstance.updateViewAsync();

		}
	}
	public void updateStepsAsync() {
		if (this.KIEMViewInstance != null) {
			this.KIEMViewInstance.updateStepsAsync();

		}
	}
	public void setViewFocus() {
		if (this.KIEMViewInstance != null) {
			this.KIEMViewInstance.setFocus();
		}
	}
	public void setKIEMViewInstance(KiemView KIEMViewInstance) {
		this.KIEMViewInstance = KIEMViewInstance;
	}
	
	
//	public void updateCurrentModelFile() {
//		//get the selected model from the project explorer
//		ISelection selection = this.getWorkbench()
//			.getActiveWorkbenchWindow().getSelectionService()
//			.getSelection("org.eclipse.ui.navigator.ProjectExplorer");
//	}
	
	public int getAimedStepDuration() {
		return this.aimedStepDuration;
	}
	public void setAimedStepDuration(int aimedStepDuration){
		this.aimedStepDuration = aimedStepDuration;
		//if executing, also update current delay
		if (execution != null)
			this.execution.setAimedStepDuration(aimedStepDuration);
	}
	
	public IResource extractSelection(ISelection sel) {
	      if (!(sel instanceof IStructuredSelection))
	         return null;
	      IStructuredSelection ss = (IStructuredSelection) sel;
	      Object element = ss.getFirstElement();
	      if (element instanceof IResource)
	         return (IResource) element;
	      if (!(element instanceof IAdaptable))
	         return null;
	      IAdaptable adaptable = (IAdaptable)element;
	      Object adapter = adaptable.getAdapter(IResource.class);
	      return (IResource) adapter;
	}
	
	
	public List<DataComponent>getDataComponentList(){
		if(dataComponentList != null)
			return dataComponentList;
				
		// get the available interfaces and initialize them
		IConfigurationElement[] jsonComponents = 
				Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
							Messages.extensionPointIDjsoncomponent);
		
		IConfigurationElement[] stringComponents = 
				Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
							Messages.extensionPointIDstringcomponent);
		
		dataComponentList = new ArrayList<DataComponent>
											    (jsonComponents.length
											    +stringComponents.length);
		
//System.out.println("Found Controllers for "+Messages.extensionPointIDjsoncomponent+": "+jsonComponents.length);
		for (int i = 0; i < jsonComponents.length; i++) {
			try{
				JSONObjectDataComponent dataComponent = 
					(JSONObjectDataComponent) jsonComponents[i]
					                    .createExecutableExtension("class");
				dataComponent.setConfigurationElemenet(jsonComponents[i]);
				dataComponentList.add(dataComponent);
//System.out.println(jsonComponents[i]);
			}catch(Exception e){
				throw new RuntimeException
					("Error at loading a KIEM data component plugin");
			} 
		}
//System.out.println("Found Controllers for "+Messages.extensionPointIDstringcomponent+": "+stringComponents.length);
		for (int i = 0; i < stringComponents.length; i++) {
			try{
				JSONStringDataComponent dataComponent = 
					(JSONStringDataComponent)stringComponents[i]
                                        .createExecutableExtension("class");
				dataComponent.setConfigurationElemenet(stringComponents[i]);
				dataComponentList.add(dataComponent);
//System.out.println(dataComponent.getName());
			}catch(Exception e){
				throw new RuntimeException
					("Error at loading a KIEM data component plugin");
			} 
		}
		return dataComponentList;
	}
	
	public boolean initExecution() {
		if (this.execution != null) return true;

		int countEnabledProducer = 0;
		int countEnabledObserver = 0;

		//count all (enabled) data producer and Observer
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				if (dataComponentEx.isProducer()) {
					countEnabledProducer++;
				}
				if (dataComponentEx.isObserver()) {
					countEnabledObserver++;
				}
			}//end if enabled
		}//next c

		if (countEnabledProducer < 1) {
			this.showError("Please enable at least one Data Producer!",this.PLUGIN_ID,null);
			return false;
		}
		else if (countEnabledObserver < 1) {
			showError("Please enable at least one Data Observer!",this.PLUGIN_ID,null);
			return false;
		}
		
		//now check if properties are ok hence no KiemPropertyError is thrown
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			KiemProperty[] properties = dataComponentEx.getProperties();
			try {
				dataComponentEx.testProperties(properties);
			} catch (KiemPropertyException e) {
				this.showError(e.getMessage(), dataComponentEx
						.getDataComponent().getConfigurationElement()
						.getContributor().getName(),
						e);
				return false;
			}
		}
		
		//get all localInterfaceVariables and combine them into
		//globalInterfaceVariables
		//initialize all (enabled) data producer and Observer
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
		
		//initialize all (enabled) data producer and Observer
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
					dataComponentEx.getDataComponent().initialize();
			}//end if enabled
		}//next c
		
		//now create and run the execution thread
		this.execution = new Execution(dataComponentExList);
		//take the last set delay
		this.execution.setAimedStepDuration(this.getAimedStepDuration());
		this.executionThread = new Thread(this.execution);
		this.executionThread.start();

		return true;
	}

	//-------------------------------------------------------------------------
	
	public void addTodataComponentExList(DataComponent component) {
		IConfigurationElement componentConfigEle = 
								component.getConfigurationElement();
		DataComponent componentClone;
		try {
			componentClone = (DataComponent)
						componentConfigEle.createExecutableExtension("class");
			componentClone.setConfigurationElemenet(componentConfigEle);
			
			DataComponentEx dataComponentEx = new DataComponentEx(componentClone);
			this.dataComponentExList.add(dataComponentEx);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	//-------------------------------------------------------------------------
	
	public List<DataComponentEx> getDefaultComponentExList() {
		List<DataComponent> list = this.getDataComponentList();
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
		//then add Observer & producer
		for (int c = 0; c < list.size(); c ++) {
			DataComponent dataComponent = (DataComponent)list.get(c);
			DataComponentEx dataComponentEx = 
				new DataComponentEx(dataComponent);
			if (dataComponentEx.isProducerObserver()) {
				returnList.add(dataComponentEx);
			}
		}
		//then add pure Observer
		for (int c = 0; c < list.size(); c ++) {
			DataComponent dataComponent = (DataComponent)list.get(c);
			DataComponentEx dataComponentEx = 
				new DataComponentEx(dataComponent);
			if (dataComponentEx.isObserverOnly()) {
				returnList.add(dataComponentEx);
			}
		}
		return returnList;
	}

	//-------------------------------------------------------------------------

	public void showWarning(String textMessage, 
							String PluginID, 
							Exception exception) {
		try{
			String message = PluginID;
			
			if (textMessage != null) {
				message = textMessage  + " (" + PluginID + ")";
				exception = null;
			}
			else if (exception != null) {
				message = exception.getMessage()  + " (" + PluginID + ")";
				exception = null;
			}

			IStatus status = new Status(IStatus.WARNING,
					PluginID,
					42,
					message,
					exception);
			//directly to error log
			//KiemPlugin.getDefault().getLog().log(status);
			
			StatusAdapter statusAdapter = new StatusAdapter(status);
			statusAdapter.setProperty(
					IStatusAdapterConstants.TIMESTAMP_PROPERTY, 
					System.currentTimeMillis());
			 

			//use status manager instead
			StatusManager.getManager().handle(statusAdapter,
					StatusManager.LOG | StatusManager.SHOW);
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

	//-------------------------------------------------------------------------
	
	public void showError(String textMessage, 
						  String PluginID,
						  Exception exception) {
		try{
			String message = PluginID;
			
			if (textMessage != null) {
				message = textMessage  + " (" + PluginID + ")";
				exception = null;
			}
			else if (exception != null) {
				message = exception.getMessage()  + " (" + PluginID + ")";
				exception = null;
			}

			IStatus status = new Status(IStatus.ERROR,
					PluginID,
					42,
					message,
					exception);
			//directly to error log
			//KiemPlugin.getDefault().getLog().log(status);

			StatusAdapter statusAdapter = new StatusAdapter(status);
			statusAdapter.setProperty(
					IStatusAdapterConstants.TIMESTAMP_PROPERTY, 
					System.currentTimeMillis());
			
			//use status manager instead
			//BLOCK = modal window, force the user to act!
			StatusManager.getManager().handle(statusAdapter,
					StatusManager.BLOCK | StatusManager.LOG | StatusManager.SHOW);
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	
}
