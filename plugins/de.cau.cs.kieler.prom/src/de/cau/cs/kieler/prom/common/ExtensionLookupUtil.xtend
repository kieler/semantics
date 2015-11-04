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
package de.cau.cs.kieler.prom.common

import java.util.ArrayList
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.Platform
import org.eclipse.ui.IWorkbenchWizard

/**
 * Auxilary class to search for installed extensions
 * and create wizards using the fully qualified class name of a wizard's implementation.
 * 
 * @author aas
 *
 */
class ExtensionLookupUtil {
    
    /**
     * The extension id of newWizards.
     */
    private static val WIZARD_EXTENSION_ID = "org.eclipse.ui.newWizards"
    
    /**
     * The element name for wizard extensions
     */
    private static val WIZARD_ELEMENT_NAME = "wizard"
    
    /**
     * The attribute name for a class which implements a wizard
     */
    private static val CLASS_ATTRIBUTE_NAME = "class"
    
    /**
     * The attribute name for a flag
     * indicating if a wizard creates a project (flag is true) or resource (flag is false).
     */
    private static val PROJECT_ATTRIBUTE_NAME = "project"
    
    
    
    /**
     * Searches for newWizards and initializes the wizard with the fully qulified class name.
     * Before the returned wizard is opened, its init(...) method should be called.
     * 
     * @param fullyQualifiedClassName The fully qualified class name of an implementation of a newWizard.
     * @return The wizard implemented by the fully qualified class name<br />
     *         or null if there is no such wizard.
     */
    static def IWorkbenchWizard getWizard(String fullyQualifiedClassName) {
        val extensions = getExtensions(WIZARD_EXTENSION_ID)

        for (ext : extensions) {
            val configElements = ext.getConfigurationElements();

            // Search for wizard elements
            for (configElement : configElements) {
                if (configElement.name == WIZARD_ELEMENT_NAME) {
                    if (configElement.getAttribute(CLASS_ATTRIBUTE_NAME) == fullyQualifiedClassName) {
                        
                        // Instantiate class.
                        try {
                            val wizard = configElement.createExecutableExtension("class") as IWorkbenchWizard;
                            return wizard
                        } catch (ClassCastException e) {
                            return null
                        }
                    }
                }
            }
        }

        return null
    }

    /**
     * Searches for extension point configurations of newWizards.
     * 
     * @param onlyProjectWizards Specifies if file wizards should be excluded in the search.
     * @return a list with all configurations that contribute to the 'org.eclipse.ui.newWizards' extension point.
     */
    static def ArrayList<IConfigurationElement> getWizardConfigurationElements(boolean onlyProjectWizards) {
        val extensions = getExtensions(WIZARD_EXTENSION_ID)

        val wizards = new ArrayList<IConfigurationElement>()
        for (ext : extensions) {
            val configElements = ext.getConfigurationElements();

            // Search for wizard elements
            for (configElement : configElements) {
                if (configElement.name == WIZARD_ELEMENT_NAME) {
                    val isProject = Boolean.valueOf(configElement.getAttribute(PROJECT_ATTRIBUTE_NAME))
                    if(isProject || !onlyProjectWizards)
                        wizards.add(configElement)
                }
            }
        }

        return wizards
    }

    /**
     * Searches and returns extensions which contribute to the given extension point id.
     * 
     * @param extensionId The extension id
     */
    static def IExtension[] getExtensions(String extensionId) {
        val reg = Platform.getExtensionRegistry()
        val extensionPoint = reg.getExtensionPoint(extensionId)
        return extensionPoint.getExtensions()
    }
}