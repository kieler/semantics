package de.cau.cs.kieler.sim.kiem;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.cau.cs.kieler.sim.kiem.messages"; //$NON-NLS-1$
	public static String extensionPointIDjsoncomponent;
	public static String extensionPointIDstringcomponent;
	public static String ViewTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
