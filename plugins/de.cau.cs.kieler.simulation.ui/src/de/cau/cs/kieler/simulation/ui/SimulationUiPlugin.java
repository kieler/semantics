package de.cau.cs.kieler.simulation.ui;

import org.osgi.framework.BundleContext;

import com.google.inject.Module;

import de.cau.cs.kieler.simulation.ui.internal.KiSimActivator;
import de.cau.cs.kieler.simulation.ui.trace.internal.KTraceActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class SimulationUiPlugin extends KiSimActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.simulation.ui"; //$NON-NLS-1$
	
	public static final String LAST_LAUNCHED_SELECTION = "last_launched_selection";
	
	// The shared instance
	private static SimulationUiPlugin plugin;
	
	// KTrace Delegate
	private static KTraceActivator ktraceDelegate;
	
	/**
	 * The constructor
	 */
	public SimulationUiPlugin() {
	    ktraceDelegate = new KTraceActivator();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ktraceDelegate.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		ktraceDelegate.stop(context);
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SimulationUiPlugin getDefault() {
		return plugin;
	}
	
	@Override
    protected Module getRuntimeModule(String grammar) {
        if (DE_CAU_CS_KIELER_SIMULATION_KISIM.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.KiSimRuntimeModule();
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.trace.KTraceRuntimeModule();
        }
        
        throw new IllegalArgumentException(grammar);
    }
    
	@Override
    protected Module getUiModule(String grammar) {
        if (DE_CAU_CS_KIELER_SIMULATION_KISIM.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.ui.KiSimUiModule(this);
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.ui.trace.KTraceUiModule(this);
        }
        
        throw new IllegalArgumentException(grammar);
    }

}
