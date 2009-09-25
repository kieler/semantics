package de.cau.cs.kieler.xkev;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.cau.cs.kieler.xkev.messages"; //$NON-NLS-1$
	public static String extensionPointID;
	public static String ViewTitle;
	
	
	
	//Actions
	public static String ActionOpenFileWizard;
	public static String ActionHintOpenFileWizard;
	public static String ActionOpenFile;
	public static String ActionHintOpenFile;
	public static String ActionRefresh;
	public static String ActionHintRefresh;
	
	//Checkboxes
	public static String CheckboxRememberLastFile;
	
	//Discriptions
	public static String DiscriptionOpenImageWizard;
	
	//Messages
	public static String MessageOpenImageWizard;
	
	//Titles
	public static String TitleOpenImageWizard;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
