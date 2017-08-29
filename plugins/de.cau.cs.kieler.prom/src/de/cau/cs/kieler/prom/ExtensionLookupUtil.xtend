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
package de.cau.cs.kieler.prom

import java.util.ArrayList
import java.util.List
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.Platform

/**
 * Auxilary class to search for installed extensions
 * and instantiate implementing classes using the fully qualified class name.
 * 
 * @author aas
 *
 */
class ExtensionLookupUtil {
    
    /**
     * The attribute name for a class which implements a wizard
     */
    public static val CLASS_ATTRIBUTE_NAME = "class"
    
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
                return instantiateClassFromConfiguration(configElement)
            }
        }

        return null
    }

    static def Object instantiateClassFromConfiguration(IConfigurationElement configElement) {
        try {
            val object = configElement.createExecutableExtension("class") as Object;
            return object
        } catch (ClassCastException e) {
            return null
        }
    }

    /**
     * Fetches all configuration elements that add to the given extension point.<br/>
     * 
     * @param extensionPointId The extension point id
     * @param xmlElementName The name of the xml element that represents the configuration element 
     * @return a list with the configuration elements
     */
    static def List<IConfigurationElement> getConfigurationElements(String extensionPointId, String xmlElementName) {
        val extensions = getExtensions(extensionPointId)

        val List<IConfigurationElement> elements = newArrayList()
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
    
    /**
     * Searches and returns extensions which contribute to the given extension point id
     * and have a configuration that matches the given constraint.
     * 
     * @param extensionPointId The extension point id
     * @param configurationConstraint A constraint that at least one configuration element must match (such as a special name or type) 
     */
    static def IConfigurationElement[] getConfigurationElements(String extensionPointId, (IConfigurationElement)=>boolean configurationConstraint) {
        val extensions = getExtensions(extensionPointId)
        val List<IConfigurationElement> allConfigurationElements = newArrayList
        for(ext : extensions) {
            allConfigurationElements.addAll(ext.configurationElements)
        }
        return allConfigurationElements.filter[configurationConstraint.apply(it)]
    }
}