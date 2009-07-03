package de.cau.cs.kieler.sim.kiem;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sim.kiem.extension.DataProducer;

/**
 * The activator class controls the plug-in life cycle
 */
public class KiemPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem";

	// The shared instance
	private static KiemPlugin plugin;
	
	// List of available dataProducers
	List<DataProducer> dataProducerList;
	
	// this is the selected+initialized DataProducer
	public DataProducer currentDataProducer;

	/**
	 * The constructor
	 */
	public KiemPlugin() {
		dataProducerList = this.getDataProducerList();
		currentDataProducer = null;
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
	
	public List<DataProducer> getDataProducerList(){
		if(dataProducerList != null)
			return dataProducerList;
				
		// get the available interfaces and initialize them
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointID);
		dataProducerList = new ArrayList<DataProducer>(configElements.length);
		System.out.println("Found Controllers for "+Messages.extensionPointID+": "+configElements.length);
		for (int i = 0; i < configElements.length; i++) {
			try{
				DataProducer dataProducer = (DataProducer)configElements[i].createExecutableExtension("class");
				dataProducerList.add(dataProducer);
				System.out.println(dataProducer.getName());
			}catch(Exception e){Tools.showDialog("Error at loading a KEV data interface plugin",e);} 
		}
		
		return dataProducerList;
	}
	
}
