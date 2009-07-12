package de.cau.cs.kieler.sim.kiem;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

//import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.jface.viewers.IStructuredSelection;
//import org.eclipse.core.runtime.IAdaptable;

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
	
	//List of available dataProducers and dataConsumers
	List<DataComponent> dataComponentList;
	DataComponent masterDataComponent;
	
	//Contains the current model to execute or null initially/after stop
	private String currentModelFile;
	
	//Execution object and thread
	public Execution execution;
	public Thread executionThread;
	private int aimedStepDuration;
	
	/**
	 * The constructor
	 */
	public KiemPlugin() {
		dataComponentList = this.getDataComponentList();
		currentModelFile = null;
		execution = null;
		aimedStepDuration = AIMED_STEP_DURATION_DEFAULT;
		masterDataComponent = null;
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
	
	public void updateCurrentModelFile() {
		//get the selected model from the project explorer
		ISelection selection = this.getWorkbench()
			.getActiveWorkbenchWindow().getSelectionService()
			.getSelection("org.eclipse.ui.navigator.ProjectExplorer");
		//update currentModelFile property
        this.currentModelFile = extractSelection(selection)
        	.getFullPath().toString();
	}
	
	public int getAimedStepDuration() {
		return this.aimedStepDuration;
	}
	public void setAimedStepDuration(int aimedStepDuration){
		this.aimedStepDuration = aimedStepDuration;
		//if executing, also update current delay
		if (execution != null)
			this.execution.setAimedStepDuration(aimedStepDuration);
	}
	
	public String getCurrentModelFile() {
		return this.currentModelFile;
	}
	
	public void resetCurrentModelFile() {
		currentModelFile = null;
	}
	
	public DataComponent getMaster() {
		return masterDataComponent;
	}
	public void setMaster(DataComponent masterDataComponent) {
		this.masterDataComponent = masterDataComponent;
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
	
	
	public List<DataComponent> getDataComponentList(){
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
				dataComponentList.add(dataComponent);
//System.out.println(dataComponent.getName());
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
				dataComponentList.add(dataComponent);
//System.out.println(dataComponent.getName());
			}catch(Exception e){
				throw new RuntimeException
					("Error at loading a KIEM data component plugin");
			} 
		}
		return dataComponentList;
	}
}
