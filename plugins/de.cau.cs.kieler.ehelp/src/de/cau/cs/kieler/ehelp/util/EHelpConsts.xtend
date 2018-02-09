package de.cau.cs.kieler.ehelp.util

import de.cau.cs.kieler.ehelp.IEHelpCustomization
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.CoreException
import java.util.HashMap

class EHelpConsts {

	public static final val String EXTENSION_POINT_ID = "de.cau.cs.kieler.ehelp.EclipseHelpCustomization";

	// The following constants are now part of customization
    public static final val boolean DEFAULT_AUTO_OPEN_WEBBROWSER = true
    public static final val String  DEFAULT_GEN_FOLDER_BASE = "help-gen"
    public static final val String  DEFAULT_GEN_FOLDER_NAME = "HelpContent"
    public static final val String  DEFAULT_HTML_FILE_EXTENSION = "html"
    public static final val String  DEFAULT_IMAGE_FILE_ENDING = "png"   
    public static final val String  DEFAULT_GEN_IMAGE_SUBFOLDER_NAME = "images"
    public static final val String  DEFAULT_MAIN_TITLE = "EclipseHelpContent"
	public static final val int     DEFAULT_MAX_LENGTH_HTML_FILENAME = 18;

    public static final val boolean DEFAULT_GENERATE_KEYWORD_FILE = true;
    public static final val String  DEFAULT_KEYWORD_FILE_NAME = "index.xml";
    public static final val boolean DEFAULT_GENERATE_CONTENT_FILE = true;
    public static final val String  DEFAULT_CONTENT_FILE_NAME = "toc.xml";
    public static final val boolean DEFAULT_GENERATE_CONTEXT_FILE = true;
    public static final val String  DEFAULT_CONTEXT_FILE_NAME = "context.xml";
    public static final val String  DEFAULT_CONTEXT_ID_EXT = ".help";
    public static final val boolean DEFAULT_GENERATE_COMPLETE_DOCUMENTATION = false;
    public static final val String DEFAULT_COMPLETE_DOCUMENTATION_FILE_NAME = "HelpComplete.html";

    public static final val int     DEFAULT_GENERATE_IMPLICIT_OUTLINE = 0;
    
	
	public static final val String WARNING_IMAGES_NOT_EXISTS = "Image does not exist in project"
	public static final val String XTEXT_EDITOR_ID = "de.cau.cs.kieler.ehelp.EHelp"

	public static HashMap<String, Object> valueCache = newHashMap

	def static getAutoOpenWebbrowser() {
		return getCustomizationValue("getAutoOpenWebbrowser", DEFAULT_AUTO_OPEN_WEBBROWSER) as Boolean
	}

	def static getGenFolderBase() {
		return getCustomizationValue("getGenFolderBase", DEFAULT_GEN_FOLDER_BASE) as String
	}

	def static getGenFolderName() {
		return getCustomizationValue("getGenFolderName", DEFAULT_GEN_FOLDER_NAME) as String
	}

	def static getHtmlFileExtension() {
		return getCustomizationValue("getHtmlFileExtension", DEFAULT_HTML_FILE_EXTENSION) as String
	}

	def static getImageFileEnding() {
		return getCustomizationValue("getImageFileEnding", DEFAULT_IMAGE_FILE_ENDING) as String
	}

	def static getImageSubFolderName() {
		return getCustomizationValue("getImageSubFolderName", DEFAULT_GEN_IMAGE_SUBFOLDER_NAME) as String
	}

	def static getMainTitle() {
		return getCustomizationValue("getMainTitle", DEFAULT_MAIN_TITLE) as String
	}

	def static getMaxLegthHtmlFilename() {
		return getCustomizationValue("getMaxLegthHtmlFilename", DEFAULT_MAX_LENGTH_HTML_FILENAME) as Integer
	}

	def static private Object getCustomizationValue(String function, Object defaultValue) {
		if (!valueCache.containsKey(function)) {
			val registry = Platform.getExtensionRegistry();
			val config = registry.getConfigurationElementsFor(EXTENSION_POINT_ID);
			try {
				for (IConfigurationElement e : config) {
					System.out.println("Evaluating extension");
					val o = e.createExecutableExtension("class");
					if (o instanceof IEHelpCustomization) {
						val value = o.class.getMethod(function).invoke(o)
						valueCache.put(function, value)
					}
				}
			} catch (CoreException ex) {
			}
		}
		var Object returnValue = null;
		try {
		    returnValue = valueCache.get(function)
		} catch (Exception ex) {
            return defaultValue
		}
		if (returnValue == null) {
		    returnValue = defaultValue
		}
		return returnValue
	}


	def static generateKeywordFile() {
		return getCustomizationValue("generateKeywordFile", DEFAULT_GENERATE_KEYWORD_FILE) as Boolean
	}

	def static getKeywordFileName() {
		return getCustomizationValue("getKeywordFileName", DEFAULT_KEYWORD_FILE_NAME) as String
	}

	def static generateContentFile() {
		return getCustomizationValue("generateContentFile", DEFAULT_GENERATE_CONTENT_FILE) as Boolean
	}

	def static getContentFileName() {
		return getCustomizationValue("getContentFileName", DEFAULT_CONTENT_FILE_NAME) as String
	}

	def static generateContextFile() {
		return getCustomizationValue("generateContextFile", DEFAULT_GENERATE_CONTEXT_FILE) as Boolean
	}

	def static getContextFileName() {
		return getCustomizationValue("getContextFileName", DEFAULT_CONTEXT_FILE_NAME) as String
	}

	def static getContextIdPostfix() {
		return getCustomizationValue("getContextIdPostfix", DEFAULT_CONTEXT_ID_EXT) as String
	}

    def static generateImplicitOutline() {
        return getCustomizationValue("generateImplicitOutline", DEFAULT_GENERATE_IMPLICIT_OUTLINE) as Integer
    }

    def static getCompleteDocumentationFileName() {
        return getCustomizationValue("getCompleteDocumentationFileName", DEFAULT_COMPLETE_DOCUMENTATION_FILE_NAME) as String
    }

    def static generateCompleteDocumentation() {
        return getCustomizationValue("generateCompleteDocumentation", DEFAULT_GENERATE_COMPLETE_DOCUMENTATION) as Boolean
    }

}
