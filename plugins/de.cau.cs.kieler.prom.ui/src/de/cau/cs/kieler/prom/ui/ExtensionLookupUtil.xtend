/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.ui

import com.google.common.collect.Lists
import java.util.ArrayList
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.ui.IWorkbenchWizard

/**
 * Auxilary class to search for installed extensions
 * and instantiate implementing classes using the fully qualified class name.
 * 
 * @author aas
 *
 */
class ExtensionLookupUtil {
    
    /**
     * The extension id of newWizards.
     */
    public static val WIZARD_EXTENSION_ID = "org.eclipse.ui.newWizards"
    
    /**
     * The element name for wizard extensions
     */
    public static val WIZARD_ELEMENT_NAME = "wizard"
    
    /**
     * The extension id of simulators.
     */
    public static val SIMULATOR_EXTENSION_ID = "de.cau.cs.kieler.prom.simulator"
    
    /**
     * The element name for wizard extensions
     */
    public static val SIMULATOR_ELEMENT_NAME = "simulator"
    
    /**
     * The attribute name for a class which implements a wizard
     */
    public static val CLASS_ATTRIBUTE_NAME = "class"
    
    /**
     * The attribute name for a flag
     * indicating if a wizard creates a project (flag is true) or resource (flag is false).
     */
    public static val PROJECT_ATTRIBUTE_NAME = "project"
    
    /**
     * The extension id of a launch shortcut.
     */
    public static val LAUNCH_SHORTCUT_EXTENSION_ID = "org.eclipse.debug.ui.launchShortcuts"
    
    /**
     * The element name for wizard extensions
     */
    public static val LAUNCH_SHORTCUT_ELEMENT_NAME = "shortcut"
    
    /**
     * Searches for launch shortcuts and initializes the one with the fully qulified class name.
     * 
     * @param fullyQualifiedClassName The fully qualified class name of an implementation of a launch shortcut.
     * @return The launch shortcut implemented by the fully qualified class name<br/>
     *         or null if there is no such implementation.
     */
    static def ILaunchShortcut getLaunchShortcut(String fullyQualifiedClassName) {
        return instantiateClassFromExtension(LAUNCH_SHORTCUT_EXTENSION_ID, LAUNCH_SHORTCUT_ELEMENT_NAME, CLASS_ATTRIBUTE_NAME, fullyQualifiedClassName) as ILaunchShortcut
    }
    
    /**
     * Searches for newWizards and initializes the one with the fully qulified class name.
     * Before the returned wizard is opened, its init(...) method should be called.
     * 
     * @param fullyQualifiedClassName The fully qualified class name of an implementation of a newWizard.
     * @return The wizard implemented by the fully qualified class name<br/>
     *         or null if there is no such wizard.
     */
    static def IWorkbenchWizard getWizard(String fullyQualifiedClassName) {
        return instantiateClassFromExtension(WIZARD_EXTENSION_ID, WIZARD_ELEMENT_NAME, CLASS_ATTRIBUTE_NAME, fullyQualifiedClassName) as IWorkbenchWizard
    }

    /**
     * Searches for extension point configurations of launch shortcuts.
     * 
     * @return a list with all configurations that contribute to the launch shortcut extension point.
     */
    static def ArrayList<IConfigurationElement> getLaunchShortcutConfigurationElements() {
        return getConfigurationElements(LAUNCH_SHORTCUT_EXTENSION_ID, LAUNCH_SHORTCUT_ELEMENT_NAME)
    }

    /**
     * Searches for extension point configurations of newWizards.
     * 
     * @param onlyProjectWizards Specifies if file wizards should be excluded in the search.
     * @return a list with all configurations that contribute to the 'org.eclipse.ui.newWizards' extension point.
     */
    static def ArrayList<IConfigurationElement> getWizardConfigurationElements(boolean onlyProjectWizards) {
         
         
         val iterable = getConfigurationElements(WIZARD_EXTENSION_ID, WIZARD_ELEMENT_NAME).filter[
            val isProject = Boolean.valueOf(it.getAttribute(PROJECT_ATTRIBUTE_NAME))
            return (isProject || !onlyProjectWizards)
        ]
        return Lists.newArrayList(iterable)
    }

    /**
     * Instantiates a class that is defined in a field of an extension.<br/>
     * 
     * For example consider the following wizard definition:
     * <pre> {@code
     * <extension
     *    point="org.eclipse.ui.newWizards">
     *    <wizard
     *       category="de.cau.cs.kieler.sccharts"
     *       class="de.cau.cs.kieler.sccharts.prom.SCChartsFileWizard"
     *       hasPages="true"
     *       id="de.cau.cs.kieler.sccharts.prom.filewizard"
     *       name="SCT File"
     *       project="false">
     *    </wizard>
     * </extension>
     * } </pre>
     * 
     * To instantiate this wizard you can use <br/> instantiateClassFromExtension("org.eclipse.ui.newWizards", "wizard", "class", "de.cau.cs.kieler.sccharts.prom.SCChartsFileWizard");
     * 
     * @param extensionPointId The id of the extension point
     * @param xmlElementName The name of the xml element where the class attribute is in
     * @param classAttributeName The name of the attribute that defines the class
     * @param fullyQualifiedClassName The fully qualified class name of the implementation
     * @return the instantiated class or null if none was found. 
     */
    static def Object instantiateClassFromExtension(String extensionPointId, String xmlElementName, String classAttributeName, String fullyQualifiedClassName) {
        val elements = getConfigurationElements(extensionPointId, xmlElementName)
        
        for (configElement : elements) {
            // Search the attribute that defines the class
            if (configElement.getAttribute(CLASS_ATTRIBUTE_NAME) == fullyQualifiedClassName) {
                
                // Instantiate class.
                try {
                    val object = configElement.createExecutableExtension("class") as Object;
                    return object
                } catch (ClassCastException e) {
                    return null
                }
            }
        }

        return null
    }

    /**
     * Fetches all configuration elements that add to the given extension point.<br/>
     * 
     * @param extensionPointId The extension point id
     * @param xmlElementName The name of the xml element that represents the configuration element 
     * @return a list with the configuration elements
     */
    static def ArrayList<IConfigurationElement> getConfigurationElements(String extensionPointId, String xmlElementName) {
        val extensions = getExtensions(extensionPointId)

        val elements = new ArrayList<IConfigurationElement>()
        for (ext : extensions) {
            val configElements = ext.getConfigurationElements();

            elements.addAll(configElements.filter[it.name == xmlElementName])
        }

        return elements
    }

    /**
     * Searches and returns extensions which contribute to the given extension point id.
     * 
     * @param extensionPointId The extension point id
     */
    static def IExtension[] getExtensions(String extensionPointId) {
        val reg = Platform.getExtensionRegistry()
        val extensionPoint = reg.getExtensionPoint(extensionPointId)
        return extensionPoint.getExtensions()
    }
}