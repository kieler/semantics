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
package de.cau.cs.kieler.prom.launchconfig.ui

import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.KiCoLaunchConfig
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.jface.viewers.ICheckStateListener
import org.eclipse.jface.viewers.CheckStateChangedEvent
import org.eclipse.jface.viewers.ICellEditorListener

/** 
 * The tab with the controls to set shell commands which will be executed
 * after the compilation and wrapper code generation have been finished.
 * 
 * @author aas
 */
class ExecuteTab extends AbstractKiCoLaunchConfigTab {

    /**
     * The control to show all commands and enable/disable them. 
     */
    private CheckboxTableViewer viewer
    
    /**
     * Combobox with all available launch shortcuts.
     */
    private var ComboViewer launchShortcuts
    
    /**
     * The project of this launch configuration.
     */
    private var IProject project

    /**
     * Constructor
     */
    new(KiCoLaunchConfigTabGroup tabGroup) {
        super(tabGroup)
    }
    
    /** 
     * {@inheritDoc}
     */
    override void createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())
        
        createTableComponent(comp)
        createAssociatedLaunchShortcutComponent(comp)
    }

    /**
     * Creates the table viewer with checkboxes to show all commands and enable/disable them.
     * 
     * @param parent The parent composite
     */
    private def void createTableComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Commands", 2)
        
        // Create viewer
        viewer = UIUtil.createCommandTable(group)
        viewer.addCheckStateListener(new ICheckStateListener{
            
            override checkStateChanged(CheckStateChangedEvent event) {
                checkConsistency()
                updateLaunchConfigurationDialog()
            }
        })
        for(editor : viewer.cellEditors) {
            if(editor != null) {
                editor.addListener(new ICellEditorListener{
                    override applyEditorValue() {
                        checkConsistency()
                        updateLaunchConfigurationDialog()
                    }
                    override cancelEditor() {
                    }
                    override editorValueChanged(boolean oldValidState, boolean newValidState) {
                    }
                })
            }
        }
        
        // Create buttons
        val bcomp = UIUtil.createComposite(group, 1)
        
        val updateDialogSelectionProvider =  new SelectionAdapter(){
            
            override widgetSelected(SelectionEvent e) {
                checkConsistency()
                updateLaunchConfigurationDialog()
            }
        }
        
        // Create add Button
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                val comm = new CommandData("New Command", 'echo "hello world"')
                val inputArray = viewer.input as ArrayList<CommandData>
                inputArray.add(comm)
                viewer.refresh()
                viewer.selection = new StructuredSelection(comm)
                
                checkConsistency()
            }
        })
        addButton.addSelectionListener(updateDialogSelectionProvider)
        addButton.toolTipText = "Add a shell command to be run after compilation and wrapper code generation"
        
        // Create remove Button
        val removeButton = UIUtil.createRemoveButton(bcomp, viewer)
        removeButton.addSelectionListener(updateDialogSelectionProvider)
        
        // Create up Button
        val upButton = UIUtil.createUpButton(bcomp, viewer)
        upButton.addSelectionListener(updateDialogSelectionProvider)
        
        // Create down Button
        val downButton = UIUtil.createDownButton(bcomp, viewer)
        downButton.addSelectionListener(updateDialogSelectionProvider)
    }

    /**
     * Creates the combo viewer with configuration elements that define launch shortcuts.
     * 
     * @param parent The parent composite
     */
    private def void createAssociatedLaunchShortcutComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Associated Launch Shortcut", 2)
        
        launchShortcuts = UIUtil.createLaunchShortcutCombo(group)
        // Selection event
        launchShortcuts.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                checkConsistency()
                updateLaunchConfigurationDialog()
            }
        })        
    }
 
     /**
     * {@inheritDoc}
     */
    override initializeFrom(ILaunchConfiguration configuration) {
        super.initializeFrom(configuration)
        // Ignore the following changes in the UI
        doNotApplyUIChanges = true
        
        // Update project reference        
        project = KiCoLaunchConfig.findProject(launchData.projectName)
        
        // Set commands
        viewer.input = launchData.commands
        
        // Select associated launch shortcut in combo viewer
        var selected = false
        for(o : launchShortcuts.input as ArrayList<Object>) {
            if(o instanceof IConfigurationElement) {
                val shortcutImplementation = o.getAttribute(ExtensionLookupUtil.CLASS_ATTRIBUTE_NAME)
                if(shortcutImplementation == launchData.associatedLaunchShortcut) {
                    launchShortcuts.selection = new StructuredSelection(o)
                    selected = true
                }
            }
        }
        if(selected = false)
            launchShortcuts.selection = new StructuredSelection(StructuredSelection.EMPTY)
        
        updateEnabled()
        
         // Don't ignore UI changes anymore
        doNotApplyUIChanges = false
    }
    
    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        if(doNotApplyUIChanges) {
            return
        }
        // Set associated launch shortcut
        val selection = (launchShortcuts.selection as StructuredSelection).firstElement
        val shortcutClassName = if(selection != null && selection instanceof IConfigurationElement)
                                    (selection as IConfigurationElement).getAttribute(ExtensionLookupUtil.CLASS_ATTRIBUTE_NAME)
                                else
                                    ""
        launchData.associatedLaunchShortcut = shortcutClassName
        // Flush to configuration
        KiCoLaunchData.saveToConfiguration(configuration, launchData)
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Execute"
    }
    
    /**
     * Checks the user input for consistency and sets an appropriate error message.
     * 
     * @return true if the user input is valid.
     */
    private def boolean checkConsistency(){
        errorMessage = checkError()
        
        return errorMessage == null
    }
    
    /**
     * Checks the user input for consistency.
     * @return an error message if the input is inconsistent<br>
     *         or null if the input is valid. 
     */
    private def String checkError(){
        val commands = viewer.input as List<CommandData> 
        for(comm : commands){
            // Check for unique names
            for(comm2 : commands){
                if(comm != comm2 && comm.name == comm2.name)
                    return "Command names must be unique."
            }
            
            // Check that there is no comma in name
            if(comm.name.contains(","))
                return "Command names must not contain a comma."
        }
        
        return null
    }
    
    /**
     * Enable or disable all controls depending on this launch configuration's project. 
     */
    private def void updateEnabled(){
        val List<Control> controls = #[viewer.table, launchShortcuts.combo]
        UIUtil.enableControlsOnSameLevel(controls, project != null)
    }
}
