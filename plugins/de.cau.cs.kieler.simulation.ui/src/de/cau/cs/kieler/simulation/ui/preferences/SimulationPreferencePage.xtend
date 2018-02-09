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

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.RegisterVariablesFinder
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import de.cau.cs.kieler.prom.ui.UIUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.util.List
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
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage
import org.eclipse.xtend.lib.annotations.Data

import static de.cau.cs.kieler.prom.build.RegisterVariablesFinder.*
import static de.cau.cs.kieler.simulation.core.SimulationManager.*

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
     * The control to select a predefined compile chain
     */
    private var ComboViewer compileChainPresetControl
    
    /**
     * The control to set the maximum history length
     */
    private var Spinner historyLengthControl
    
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
        var group = UIUtil.createGroup(parent, "JSON communication", 1)
        val enabled = RegisterVariablesFinder.isEnabled
        val checkbox = UIUtil.createCheckButton(group, "Communicate register variables", enabled)
        checkbox.addSelectionListener(new SelectionListener() {
            override widgetDefaultSelected(SelectionEvent e) {
            }
            
            override widgetSelected(SelectionEvent e) {
                RegisterVariablesFinder.enabled = checkbox.selection
            }
        })
        checkbox.toolTipText = "This option is required to properly step back in the simulation history."
                             + "\nCan be disabled to improve performance when compiling large models."
        
        // Create the control to define the maximum simulation history length
        group = UIUtil.createGroup(parent, "Simulation history", 2)
        UIUtil.createLabel(group, "Maximum size\n(use -1 for infinite)")
        historyLengthControl = new Spinner(group, SWT.BORDER)
        historyLengthControl.minimum = -1
        historyLengthControl.increment = 1
        historyLengthControl.pageIncrement = 1
        historyLengthControl.selection = SimulationManager.maxHistoryLength
        historyLengthControl.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                val value = historyLengthControl.selection
                SimulationManager.maxHistoryLength = value
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
        label.text = "Default compile chain (comma separated)"
        
        // Show text field that sets the compile chain
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
        
        // Show combo with predefined compile chains
        val tts = "de.cau.cs.kieler.sccharts.processors.takenTransitionSignaling"
        val scchartCompileChains = #[
            new CompileChainPreset("Netlist C with TTS (default)", #[tts,"de.cau.cs.kieler.sccharts.netlist.simple"]), 
            new CompileChainPreset("Netlist C", #["de.cau.cs.kieler.sccharts.netlist.simple"]),
            new CompileChainPreset("Netlist Java with TTS", #[tts,"de.cau.cs.kieler.sccharts.netlist.java"]),
            new CompileChainPreset("Netlist Java", #["de.cau.cs.kieler.sccharts.netlist.java"]),
            new CompileChainPreset("Prio Java with TTS", #[tts,"de.cau.cs.kieler.sccharts.priority.java"]),
            new CompileChainPreset("Prio Java", #["de.cau.cs.kieler.sccharts.priority.java"])
        ]
        
        val comp = UIUtil.createComposite(group, 2)
        val label2 = new Label(comp, SWT.NONE) 
        label2.text = "Compile chain presets (SCCharts only)"
        
        compileChainPresetControl = UIUtil.createCombo(comp, scchartCompileChains.toList)
        compileChainPresetControl.selection = null
        compileChainPresetControl.labelProvider = new LabelProvider() {
            override getText(Object elem) {
                if(elem instanceof CompileChainPreset) {
                    return elem.name
                }
                return super.getText(elem)
            }
        }
        
        // Add selection listener
        compileChainPresetControl.addSelectionChangedListener[e|
            if(e !== null && e.selection instanceof StructuredSelection) {
                val sel = (e.selection as StructuredSelection).firstElement
                if(sel instanceof CompileChainPreset) {
                    val compileChainDefault = sel
                    compileChainField.text = compileChainDefault.compileChain.join(",\n")
                }    
            }
        ]
    }
    
    /**
     * Sets the current analyzer and updates relevant controls.
     */
    private def void setCurrentAnalyzer(ModelAnalyzer analyzer) {
        this.currentAnalyzer = analyzer
        if(currentAnalyzer !== null) {
            compileChainField.text = currentAnalyzer.compileChain
            // Default values for the compile chain are only available for SCCharts
            if(compileChainPresetControl !== null) {
                compileChainPresetControl.control.enabled = currentAnalyzer.isSupported(FileExtensions.SCCHART)    
            }
        } else {
            compileChainField.text = ""
        }
    }
    
    /**
     * Restore the default values. 
     */
    override performDefaults() {
        // Reset history length
        SimulationManager.maxHistoryLength = SimulationManager.DEFAULT_MAX_HISTORY_LENGTH
        historyLengthControl.selection = SimulationManager.DEFAULT_MAX_HISTORY_LENGTH
        
        // Reset compile chain of model analyzers
        for(analyzer : ModelAnalyzer.analyzers) {
            analyzer.compileChain = analyzer.defaultCompileChain
        }
        // Update UI
        setCurrentAnalyzer(currentAnalyzer)
        
        super.performDefaults
    }
    
    @Data
    private static class CompileChainPreset {
        val String name
        val List<String> compileChain
    }
}