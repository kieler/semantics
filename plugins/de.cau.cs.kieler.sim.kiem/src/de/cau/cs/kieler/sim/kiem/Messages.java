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

import org.eclipse.osgi.util.NLS;

/**
 * The Class Messages is used to externalize strings in the messages.properties
 * file.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class Messages extends NLS {
	
	/** The Constant BUNDLE_NAME. */
	private static final String BUNDLE_NAME = "de.cau.cs.kieler.sim.kiem.messages"; //$NON-NLS-1$
	
	/** The extension point jsoncomponent. */
	public static String extensionPointIDjsoncomponent;
	
	/** The extension point stringcomponent. */
	public static String extensionPointIDstringcomponent;
	
	/** The View title. */
	public static String ViewTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * Instantiates the messages class.
	 */
	public Messages() {
	}
}
