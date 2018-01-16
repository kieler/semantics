package de.cau.cs.kieler.ehelp.util

import de.cau.cs.kieler.ehelp.IEHelpCustomization
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.CoreException
import java.util.HashMap

class EHelpConsts {

	public static final val String EXTENSION_POINT_ID = "de.cau.cs.kieler.ehelp.EclipseHelpCustomization";

	// The following constants are now part of customization
	// public static final val int     MAX_LENGTH_HTML_FILENAME = 18;
	// public static final val String  HTML_FILE_EXTENSION = "html"
	// public static final val String  GEN_FOLDER_NAME = "HelpContent"
	// public static final val String  GEN_IMAGE_SUBFOLDER_NAME = "AirbusCCCDocumentation-Dateien"
	// public static final val String  MAIN_TITLE = "Airbus CCC Tool"
	// public static final val String  IMAGE_FILE_ENDING = "png"	
	// public static final val String  GEN_FOLDER_BASE = "help-gen"
	// public static final val boolean AUTO_OPEN_WEBBROWSER = true
	public static final val String WARNING_IMAGES_NOT_EXISTS = "Image does not exist in project"
	public static final val String XTEXT_EDITOR_ID = "de.cau.cs.kieler.ehelp.EHelp"

	public static HashMap<String, Object> valueCache = newHashMap

	def static getAutoOpenWebbrowser() {
		return getCustomizationValue("getAutoOpenWebbrowser") as Boolean
	}

	def static getGenFolderBase() {
		return getCustomizationValue("getGenFolderBase") as String
	}

	def static getGenFolderName() {
		return getCustomizationValue("getGenFolderName") as String
	}

	def static getHtmlFileExtension() {
		return getCustomizationValue("getHtmlFileExtension") as String
	}

	def static getImageFileEnding() {
		return getCustomizationValue("getImageFileEnding") as String
	}

	def static getImageSubFolderName() {
		return getCustomizationValue("getImageSubFolderName") as String
	}

	def static getMainTitle() {
		return getCustomizationValue("getMainTitle") as String
	}

	def static getMaxLegthHtmlFilename() {
		return getCustomizationValue("getMaxLegthHtmlFilename") as Integer
	}

	def static private Object getCustomizationValue(String function) {
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
		return valueCache.get(function)
	}

	def static generateKeywordFile() {
		return getCustomizationValue("generateKeywordFile") as Boolean
	}

	def static getKeywordFileName() {
		return getCustomizationValue("getKeywordFileName") as String
	}

	def static generatedContentFile() {
		return getCustomizationValue("generatedContentFile") as Boolean
	}

	def static getContentFileName() {
		return getCustomizationValue("getContentFileName") as String
	}

	def static generatedContextFile() {
		return getCustomizationValue("generatedContextFile") as Boolean
	}

	def static getContextFileName() {
		return getCustomizationValue("getContextFileName") as String
	}

	def static getContextIdPostfix() {
		return getCustomizationValue("getContextIdPostfix") as String
	}

}
