/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.builder.ui

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.UIUtil
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
    
    public static val QUALIFIER = "de.cau.cs.kieler.prom"
    public static val ATTR_ENVIRONMENT = "environment"
    
    ComboViewer environment;
    
    override protected createContents(Composite parent) {
        val store = PromPlugin.getDefault().preferenceStore
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
    
    def IResource getResource() {
        return element as IResource
    }
    
    def void setProperty(QualifiedName qualifier, String value) {
        resource.setPersistentProperty(qualifier, value)
    }
    
    def String getProperty(QualifiedName qualifier) {
        resource.getPersistentProperty(qualifier)
    }
    
    def void setProperty(String localName, String value) {
        resource.setPersistentProperty(new QualifiedName(QUALIFIER, localName), value)
    }
    
    def String getProperty(String localName) {
        return resource.getPersistentProperty(new QualifiedName(QUALIFIER, localName))
    }
    
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