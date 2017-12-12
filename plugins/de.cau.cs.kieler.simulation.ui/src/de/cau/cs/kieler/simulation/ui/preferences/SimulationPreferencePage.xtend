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
package de.cau.cs.kieler.simulation.ui.preferences

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.RegisterVariablesFinder
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import de.cau.cs.kieler.prom.ui.UIUtil
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

import static de.cau.cs.kieler.prom.build.RegisterVariablesFinder.*

/**
 * @author aas
 *
 */
class SimulationPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The plugin's preference store from the init(...) method.
     */
    private var IPreferenceStore store
    
    /**
     * The currently selected model analyzer.
     */
    private var ModelAnalyzer currentAnalyzer 
    
    /**
     * The text field to set the compile chain of the current model analyzer.
     */
    private var Text compileChainField
    
    /**
     * Implementation of IWorkbenchPreferencePage.
     * Saves the reference to the workbench and the used preference store.
     * 
     * @param workbench The workbench
     */
    override void init(IWorkbench workbench) {
        this.workbench = workbench
        store = PromPlugin.preferenceStore
    }
    
    /**
     * {@inheritDoc}
     */
    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        createSimulationControls(comp)
        createModelAnalyzerControls(comp)

        return comp
    }
    
    /**
     * Creates controls to configure simulation features.
     */
    private def void createSimulationControls(Composite parent) {
        // Create the checkbox to determine if register variables should be communicated
        val enabled = RegisterVariablesFinder.isEnabled
        val checkbox = UIUtil.createCheckButton(parent, "Communicate register variables", enabled)
        checkbox.addSelectionListener(new SelectionListener() {
            override widgetDefaultSelected(SelectionEvent e) {
            }
            
            override widgetSelected(SelectionEvent e) {
                RegisterVariablesFinder.enabled = checkbox.selection
            }
        })
    }
    
    /**
     * Creates the controls to configure model analyzers.
     * Notably the default compile chain for models.
     */
    private def void createModelAnalyzerControls(Composite parent) {
        val group = UIUtil.createGroup(parent, "Model analyzers", 1, GridData.FILL_BOTH)
        // Create a combo to select the model analyzer and a text field to set its compile chain
        val viewer = new ComboViewer(group, SWT.DROP_DOWN)
        viewer.labelProvider = new LabelProvider() {
            override getText(Object element) {
                return (element as ModelAnalyzer).name
            }
        }
        // Add listener
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            override selectionChanged(SelectionChangedEvent event) {
                val sel = event.selection as StructuredSelection
                val analyzer = sel.firstElement as ModelAnalyzer
                setCurrentAnalyzer(analyzer)  
            }
        })
        // Set the content
        viewer.contentProvider = ArrayContentProvider.instance
        viewer.input = ModelAnalyzer.analyzers
        
        // Create a text field to set the compile chain of the model analyzer
        val label = new Label(group, SWT.NONE) 
        label.text = "Default compile chain"
        
        compileChainField = new Text(group, SWT.MULTI)
        compileChainField.layoutData = new GridData(GridData.FILL_BOTH)
        // Set the current analyzer
        viewer.selection = new StructuredSelection(ModelAnalyzer.analyzers.findFirst[it.isSupported("sctx")])
        compileChainField.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentAnalyzer !== null) {
                    currentAnalyzer.compileChain = compileChainField.text    
                }
            }
        })
    }
    
    /**
     * Sets the current analyzer and updates relevant controls.
     */
    private def void setCurrentAnalyzer(ModelAnalyzer analyzer) {
        this.currentAnalyzer = analyzer
        if(currentAnalyzer !== null) {
            compileChainField.text = currentAnalyzer.compileChain    
        } else {
            compileChainField.text = ""
        }
    }
    
    /**
     * Restore the default values. 
     */
    override performDefaults() {
        // Reset compile chain of model analyzers
        for(analyzer : ModelAnalyzer.analyzers) {
            analyzer.compileChain = analyzer.defaultCompileChain
        }
        // Update UI
        setCurrentAnalyzer(currentAnalyzer)
        
        super.performDefaults
    }
}