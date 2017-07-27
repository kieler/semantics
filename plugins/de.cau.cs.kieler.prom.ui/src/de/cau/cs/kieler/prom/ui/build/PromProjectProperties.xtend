/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.ui.build

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import java.util.EnumSet
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.PropertyPage

/**
 * @author aas
 *
 */
class PromProjectProperties extends PropertyPage {
    
    /**
     * Widget to select the build configuration
     */
    Text buildConfigFile;
    
    /**
     * {@inheritDocs}
     */
    override protected createContents(Composite parent) {
        val group = UIUtil.createGroup(parent, "kibuild file", 2)
        // Create the text field for the config file
        buildConfigFile = UIUtil.createTextField(group, null,
                                                 EnumSet.of(UIUtil.Buttons.RESOURCE_BUTTON),
                                                 [return resource as IProject])
        buildConfigFile.addModifyListener(new ModifyListener() {
             override modifyText(ModifyEvent e) {
                setProperty(PromPlugin.BUILD_CONFIGURATION_QUALIFIER, buildConfigFile.text)
            }
        });
        loadSettings()
        
        return parent
    }
    
    /**
     * Return the element of this page as an IResource
     * @return the element as IResource
     */
    def IResource getResource() {
        return element as IResource
    }
    
    /**
     * Sets a property on the resource
     * 
     * @param qualifier The qualified name name of the property
     * @param value The value of the property
     */
    def void setProperty(QualifiedName qualifier, String value) {
        resource.setPersistentProperty(qualifier, value)
    }
    
    /**
     * Returns a property of the resource
     * 
     * @param qualifier The qualified name of the property
     * @retrun the value of the property
     */
    def String getProperty(QualifiedName qualifier) {
        resource.getPersistentProperty(qualifier)
    }
    
    /**
     * Updates the UI with the values of the resource
     */
    private def void loadSettings() {
        val loadedFilePath = getProperty(PromPlugin.BUILD_CONFIGURATION_QUALIFIER)
        if (!loadedFilePath.isNullOrEmpty) {
            buildConfigFile.text = loadedFilePath
        }
    }
}