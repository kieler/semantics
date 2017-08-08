package de.cau.cs.kieler.kicool;

import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.kicool.classes.ResourceExtension;


public class KiCoolActivator implements BundleActivator {

	private static BundleContext context;
	
	public static final String PLUGIN_ID = "de.cau.cs.kieler.kicool";
	
    public static final String RESOURCEEXTENSION_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.kicool.resource.extension";	
	
    private static KiCoolActivator instance;	
    
    /** The cached resource extensions. */
    private static HashMap<String, ResourceExtension> resourceExtensionsCached = null;    

	static BundleContext getContext() {
		return context;
	}
	
	public static KiCoolActivator getInstance() {
	    return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		KiCoolActivator.context = bundleContext;
		instance = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		KiCoolActivator.context = null;
		instance = null;
	}
	
    public static HashMap<String, ResourceExtension> getRegisteredResourceExtensions(
            boolean forceReload) {
        if (resourceExtensionsCached != null && !forceReload) {
            return resourceExtensionsCached;
        }
        IConfigurationElement[] resourceExtensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        RESOURCEEXTENSION_EXTENSION_POINT_ID);
        resourceExtensionsCached = new HashMap<String, ResourceExtension>();
        for (int i = 0; i < resourceExtensions.length; i++) {
            try {
                String className = resourceExtensions[i].getAttribute("ePackageName");
                String extension = resourceExtensions[i].getAttribute("extensionName");
                String isXMI = resourceExtensions[i].getAttribute("isXMI");
                String editorID = resourceExtensions[i].getAttribute("editor_id");
                resourceExtensionsCached.put(className, new ResourceExtension(className, extension,
                        isXMI.toLowerCase().equals("true"), editorID));
            } finally {
                // do nothing
            }
        }
        return resourceExtensionsCached;
    }
    
    public ResourceExtension getResourceExtension(Object model) {
        KiCoolActivator.getInstance();
        HashMap<String, ResourceExtension> resourceExtensionMap =
                KiCoolActivator.getRegisteredResourceExtensions(false);
        ResourceExtension specificExtension = null;
        if (model instanceof EObject) {
            specificExtension = resourceExtensionMap.get(((EObject) model).eClass().getName());
        } else {
            specificExtension = resourceExtensionMap.get(model.getClass().getSimpleName());
        }
        if (specificExtension != null) {
            return specificExtension;
        }
        return null;
    }    

}
