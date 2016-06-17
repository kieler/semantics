package de.cau.cs.kieler.sccharts.debug;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sccharts.Transition;

/**
 * The main controlling class for the debug plugin. The 
 */
public class SCChartsDebugPlugin extends AbstractUIPlugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.debug"; //$NON-NLS-1$
	
	public static boolean DEBUG_MODE = true;
	
	public static Set<Integer> breakpointLines = new HashSet<>(); 

	// The shared instance
	private static SCChartsDebugPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SCChartsDebugPlugin() {
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
	public static SCChartsDebugPlugin getDefault() {
		return plugin;
	}
	
	public static boolean checkTransitionequalsLine(Transition transition) {
		ICompositeNode n = NodeModelUtils.getNode((EObject) transition);
		int line = n.getStartLine();
		@SuppressWarnings("unused")
		String t = n.getText(); // debug use
		if (breakpointLines.contains(line)) {
			return true;
		} else {
			return false;
		}		
	}

}
