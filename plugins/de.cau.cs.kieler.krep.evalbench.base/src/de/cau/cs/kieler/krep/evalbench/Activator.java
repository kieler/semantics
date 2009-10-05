/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.krep.evalbench;


import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

import de.cau.cs.kieler.krep.evalbench.comm.CommonLayer;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IPageListener {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.krep.evalbench.base";
	
	/** The common layer for data exchange */
	public static CommonLayer commonLayer;
	
	/** current program */
	private static IAssembler program = null;
	
	/** current execution Trace */
	private static TraceList traces;

	/** The shared instance */
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		BasicConfigurator.configure();

		//Logger.getLogger("org.apache").setLevel(Level.ALL);

		commonLayer = new CommonLayer();
		traces = new TraceList();
	}

	/**
	 * @return currently loaded traces
	 */
	public static TraceList getTraces(){
	    return traces;
	}
	
	/**
	 * @param traces new tracelist 
	 */
	public static void setTraces(final TraceList traces){
	    Activator.traces=traces;
	    
	}
	
	public static IAssembler getProgram() {
	    return program;
	}

	public static void setProgram(IAssembler program) {
	    Activator.program = program;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		// initialize the common layer
		commonLayer.initialize();
		// register as page listener
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().addPageListener(this);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		// dispose the common layer
		commonLayer.dispose();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IPageListener#pageActivated(org.eclipse.ui.IWorkbenchPage)
	 */
	public void pageActivated(IWorkbenchPage page) {
		page.addPartListener(commonLayer);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IPageListener#pageClosed(org.eclipse.ui.IWorkbenchPage)
	 */
	public void pageClosed(IWorkbenchPage page) {
	    //Nothing to do
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IPageListener#pageOpened(org.eclipse.ui.IWorkbenchPage)
	 */
	public void pageOpened(IWorkbenchPage page) {	
	    	//Nothing to do
	}

}
