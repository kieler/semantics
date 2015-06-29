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
 * @author aas
 *
 */
class ExtensionLookupUtil {
    
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

    static def IExtension[] getExtensions(String extensionId) {
        // Get installed extensions from plugin registry
        val reg = Platform.getExtensionRegistry()
        val extensionPoint = reg.getExtensionPoint(extensionId)
        return extensionPoint.getExtensions()
    }
}