package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KartUIPlugin extends AbstractUIPlugin {
        private IWorkbenchPage activePage = null;
        private boolean activePageFlag = false;

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kart.ui"; //$NON-NLS-1$

	// The shared instance
	private static KartUIPlugin plugin;
	
	/**
	 * The constructor
	 */
	public KartUIPlugin() {
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
	public static KartUIPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Gets the active page (blocking) from the UI thread.
	 * 
	 * @return the active page
	 */
	 public IWorkbenchPage getActivePage() {
	     activePageFlag = false;

	     Display.getDefault().syncExec(new Runnable() {
	         public void run() {
	             // get the active editor as a default case (if property is
	             // empty)
	             IWorkbenchWindow window = PlatformUI.getWorkbench()
	                     .getActiveWorkbenchWindow();
	             activePage = window.getActivePage();
	             activePageFlag = true;
	         }
	     });

	     while (!activePageFlag) {
	         try {
	             Thread.sleep(100);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	     }
	     return activePage;
	 }

}
