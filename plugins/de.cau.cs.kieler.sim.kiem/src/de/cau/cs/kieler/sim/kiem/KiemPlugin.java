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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.runtime.IAdaptable;

import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataConsumer;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataProducer;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataProducer;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataConsumer;
import de.cau.cs.kieler.sim.kiem.extension.DataProducerConsumer;

/**
 * The activator class controls the plug-in life cycle
 */
public class KiemPlugin extends AbstractUIPlugin {

	
	public static final int DEFAULT_DELAY = 500;
	
	//The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem";

	//The shared instance
	private static KiemPlugin plugin;
	
	//List of available dataProducers and dataConsumers
	List<DataProducerConsumer> dataProducerConsumerList;
	DataProducerConsumer masterDataProducerConsumer;
	
	//Contains the current model to execute or null initially/after stop
	private String currentModelFile;
	
	//Execution object and thread
	public Execution execution;
	public Thread executionThread;
	private int delay;
	
	/**
	 * The constructor
	 */
	public KiemPlugin() {
		dataProducerConsumerList = this.getDataProducerConsumerList();
		currentModelFile = null;
		execution = null;
		delay = DEFAULT_DELAY;
		masterDataProducerConsumer = null;
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
		ISelection selection = this.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection("org.eclipse.ui.navigator.ProjectExplorer");
		//update currentModelFile property
        this.currentModelFile = extractSelection(selection).getFullPath().toString();
	}
	
	public int getDelay() {
		return this.delay;
	}
	public void setDelay(int delay){
		this.delay = delay;
		//if executing, also update current delay
		if (execution != null)
			this.execution.setDelay(delay);
	}
	
	public String getCurrentModelFile() {
		return this.currentModelFile;
	}
	
	public void resetCurrentModelFile() {
		currentModelFile = null;
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
	
	
	public List<DataProducerConsumer> getDataProducerConsumerList(){
		if(dataProducerConsumerList != null)
			return dataProducerConsumerList;
				
		// get the available interfaces and initialize them
		IConfigurationElement[] jsonproducerElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointIDjsonproducer);
		IConfigurationElement[] jsonconsumerElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointIDjsonconsumer);
		IConfigurationElement[] stringproducerElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointIDstringproducer);
		IConfigurationElement[] stringconsumerElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointIDstringconsumer);
		dataProducerConsumerList = new ArrayList<DataProducerConsumer>
											    (jsonproducerElements.length
											    +stringproducerElements.length
											    +jsonconsumerElements.length
											    +stringconsumerElements.length);
		System.out.println("Found Controllers for "+Messages.extensionPointIDjsonproducer+": "+jsonproducerElements.length);
		for (int i = 0; i < jsonproducerElements.length; i++) {
			try{
				JSONObjectDataProducer dataProducer = (JSONObjectDataProducer)jsonproducerElements[i].createExecutableExtension("class");
				dataProducerConsumerList.add(dataProducer);
				System.out.println(dataProducer.getName());
			}catch(Exception e){Tools.showDialog("Error at loading a KIEM data producer interface plugin",e);} 
		}
		System.out.println("Found Controllers for "+Messages.extensionPointIDstringproducer+": "+stringproducerElements.length);
		for (int i = 0; i < stringproducerElements.length; i++) {
			try{
				JSONStringDataProducer dataProducer = (JSONStringDataProducer)stringproducerElements[i].createExecutableExtension("class");
				dataProducerConsumerList.add(dataProducer);
				System.out.println(dataProducer.getName());
			}catch(Exception e){Tools.showDialog("Error at loading a KIEM data producer interface plugin",e);} 
		}
		System.out.println("Found Controllers for "+Messages.extensionPointIDjsonconsumer+": "+jsonconsumerElements.length);
		for (int i = 0; i < jsonconsumerElements.length; i++) {
			try{
				JSONObjectDataConsumer dataConsumer = (JSONObjectDataConsumer)jsonconsumerElements[i].createExecutableExtension("class");
				dataProducerConsumerList.add(dataConsumer);
				System.out.println(dataConsumer.getName());
			}catch(Exception e){Tools.showDialog("Error at loading a KIEM data consumer interface plugin",e);} 
		}
		System.out.println("Found Controllers for "+Messages.extensionPointIDstringconsumer+": "+stringconsumerElements.length);
		for (int i = 0; i < stringconsumerElements.length; i++) {
			try{
				JSONStringDataConsumer dataConsumer = (JSONStringDataConsumer)stringconsumerElements[i].createExecutableExtension("class");
				dataProducerConsumerList.add(dataConsumer);
				System.out.println(dataConsumer.getName());
			}catch(Exception e){Tools.showDialog("Error at loading a KIEM data consumer interface plugin",e);} 
		}
		
		return dataProducerConsumerList;
	}
	
	void checkForSingleMaster() {
		this.masterDataProducerConsumer = null;
		for (int c = 0; c < this.dataProducerConsumerList.size(); c++) {
			DataProducerConsumer dataProducerConsumer = 
				dataProducerConsumerList.get(c);
			if (dataProducerConsumer.isMaster()) {
				if (this.masterDataProducerConsumer == null) {
					this.masterDataProducerConsumer = dataProducerConsumer;
				} else {
					Tools.showDialog("At most one master is allowed\n '"+dataProducerConsumer.getName()+"' will be disabled.");
					//disable it//
					dataProducerConsumer.setEnabled(false);
				}
			}
		}
		
	}
	
}
