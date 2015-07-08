/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig.common

import java.util.ArrayList
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.Platform
import org.eclipse.ui.IWorkbenchWizard

/**
 * Auxilary class to search for a extensions
 * and create wizards using the fully qualified class name of a wizard's implementation
 * 
 * @author aas
 *
 */
class ExtensionLookupUtil {
    
    /**
     * Searches for newWizards and initializes the wizard with the fully qulified class name.
     * Before the returned wizard is opened its init(...) method should be called.
     * 
     * @return The wizard implemented by the fully qualified class name<br />
     *         or null if there is no such wizard.
     */
    static def IWorkbenchWizard getWizard(String fullyQualifiedClassName) {
        val extensions = getExtensions("org.eclipse.ui.newWizards")

        for (ext : extensions) {
            val configElements = ext.getConfigurationElements();

            // Search for wizard elements
            for (configElement : configElements) {
                if (configElement.name == "wizard") {
                    if (configElement.getAttribute("class") == fullyQualifiedClassName) {
                        
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
     * @return a list with all configurations that contribute to the 'org.eclipse.ui.newWizards' extension point.
     */
    static def ArrayList<IConfigurationElement> getWizardConfigurationElements(boolean onlyProjectWizards) {
        val extensions = getExtensions("org.eclipse.ui.newWizards")

        val wizards = new ArrayList<IConfigurationElement>()
        for (ext : extensions) {
            val configElements = ext.getConfigurationElements();

            // Search for wizard elements
            for (configElement : configElements) {
                if (configElement.name == "wizard") {
                    val isProject = Boolean.valueOf(configElement.getAttribute("project"))
                    if(isProject || !onlyProjectWizards)
                        wizards.add(configElement)
                }
            }
        }

        return wizards
    }

    /**
     * Searches and returns extensions which contribute to the given extension point id.
     */
    static def IExtension[] getExtensions(String extensionId) {
        val reg = Platform.getExtensionRegistry()
        val extensionPoint = reg.getExtensionPoint(extensionId)
        return extensionPoint.getExtensions()
    }
}