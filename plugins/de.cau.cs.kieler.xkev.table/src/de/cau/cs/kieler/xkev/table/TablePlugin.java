/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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

package de.cau.cs.kieler.xkev.table;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the Table plug-in's life cycle. This plug-in
 * implements the DataComponent Extension Point of the KIELER Execution Manager
 * two times. The first as a role of a data producer, the second as a role of a
 * data observer. In its second role the table is desired to display all 
 * variables (and signals respectively) that are produces by the various data 
 * producer components.
 * In its first role it should also allow the user to edit variable oder signal 
 * values or enter new ones.
 * The table data producer should be scheduled before observer DataComponents
 * that observe variables that should be entered/modified by the table (that
 * means somewhere at the top of the scheduling list).
 * The table data observer should be scheduled after producer DataComponents 
 * that producer variables that should be displayed by the table (that means
 * somewhere at the bottom of the scheduling list). 
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TablePlugin extends AbstractUIPlugin {

	/** The Constant PLUGIN_ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.xkev.table";

	/** The shared instance. */
	private static TablePlugin plugin;
	
	//-------------------------------------------------------------------------
	
	/**
	 * The constructor of the table plug-in.
	 */
	public TablePlugin() {
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns the shared instance of the table plug-in.
	 *
	 * @return the shared instance
	 */
	public static TablePlugin getDefault() {
		return plugin;
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the relative path to the image
	 * @return the image descriptor of the image
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
}
