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
import de.cau.cs.kieler.prom.data.EnvironmentData
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import java.util.ArrayList
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.PropertyPage

/**
 * @author aas
 *
 */
class PromProjectProperties extends PropertyPage {
    
    /**
     * The quialifier for prom project properties.
     */
    public static val QUALIFIER = "de.cau.cs.kieler.prom"
    /**
     * The name of the property for environments
     */
    public static val ATTR_ENVIRONMENT = "environment"
    
    /**
     * Widget to select the environment
     */
    ComboViewer environment;
    
    /**
     * {@inheritDocs}
     */
    override protected createContents(Composite parent) {
        val store = PromUIPlugin.getDefault().preferenceStore
        val environments = EnvironmentData.loadAllFromPreferenceStore(store)
        
        // Create environment combo box
        environment = UIUtil.createEnvironmentsCombo(parent, environments)
        environment.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                setProperty(PromPlugin.ENVIRIONMENT_QUALIFIER, getSelectedEnvironment().identifier)
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
     * Sets a property on the resource
     * 
     * @param localName The name of the property. The qualified name is constructed from this.
     * @param value The value of the property
     */
    def void setProperty(String localName, String value) {
        resource.setPersistentProperty(new QualifiedName(QUALIFIER, localName), value)
    }
    
    /**
     * Returns a property of the resource
     * 
     * @param localName The name of the property. The qualified name is constructed from this.
     * @return the value of the property
     */
    def String getProperty(String localName) {
        return resource.getPersistentProperty(new QualifiedName(QUALIFIER, localName))
    }
    
    /**
     * Updates the UI with the values of the resource
     */
    private def void loadSettings() {
        // Load environment
        if (environment.input != null) {
            val loadedEnvironmentName = getProperty(PromPlugin.ENVIRIONMENT_QUALIFIER)
            for (env : environment.input as ArrayList<EnvironmentData>) {
                if (env.name == loadedEnvironmentName) {
                    environment.selection = new StructuredSelection(env)
                }
            }
        }
    }
    
    /**
     * Returns the selected environment.
     * 
     * @return the environment selected in the combobox<br />
     *         or null if there is no selection.
     */
    public def EnvironmentData getSelectedEnvironment() {
        val selection = environment.getSelection();
        if (!selection.isEmpty()) {
            val structuredSelection = selection as IStructuredSelection
            return structuredSelection.getFirstElement() as EnvironmentData
        } else {
            return null
        }
    }
}