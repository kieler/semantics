package de.cau.cs.kieler.ehelp;

public interface IEHelpCustomization {

	/**
	 * Define the maximum length of html file names.
	 * 
	 * @return max length
	 */
	int getMaxLegthHtmlFilename();
	
	/**
	 * Define the html file extension to be generated and used by the integrated webbrowser. Typically this is html.
	 * 
	 * @return html file ext
	 */
	String getHtmlFileExtension();
	
	/**
	 * Define the main container folder for all generated files.
	 * 
	 * @return folder name for gen files
	 */
	String getGenFolderName();
	
	/** 
	 * Define a subfolder for images, if null, images are placed directly into the gen folder.
	 *  
	 * @return image subfolder name or null
	 */
	String getImageSubFolderName();
	
	/** 
	 * Define the main title for the help system.
	 * 
	 * @return main title
	 */
	String getMainTitle();

	/**
	 * Define the file ending for images to integrate, typically this is png.
	 * 
	 * @return image file ext
	 */
	String getImageFileEnding();
	
	/**
	 * Define the name of the folder name where to place the main container folder. Typicall this is help-gen.
	 * 
	 * @return gen folder base
	 */
	String getGenFolderBase();
	
	/**
	 * Defines whether the webbrowser shall be always opened automatically if it is closed. If false and no webbrowser is opened, no new browser view is opened.
	 *  
	 * @return true, if a webbrowser shall be opend automatically (if no one is opened already that can be updated)
	 */
	boolean getAutoOpenWebbrowser();
		
	/**
	 * Defines whether to generate an index.xml file containing all the keyword->html file references. This is optional. 
	 */
	boolean generateKeywordFile();
	
	/**
	 * Define the name of keyword file name, typically index.xml.
	 * 
	 * @return keyword file name
	 */
	String getKeywordFileName();	
	
	/**
	 * Defines whether to generate an toc.xml file containing the fundamental help dictionary. Typically, this is mandatory.
	 */
	boolean generateContentFile();
	
	/**
	 * Define the name of content file name, typically toc.xml.
	 * 
	 * @return keyword file name
	 */
	String getContentFileName();		

	/**
	 * Defines whether to generate an context.xml file containing the context sensitive help dictionary. This is optional.
	 */
	boolean generateContextFile();
	
	/**
	 * Define the name of context file name, typically context.xml.
	 * 
	 * @return keyword file name
	 */
	String getContextFileName();		

	/**
	 * Define the postfix for help context ids, typically this is ".help".
	 * 
	 * @return the id postfix for help context ids
	 */
	String getContextIdPostfix();
}
