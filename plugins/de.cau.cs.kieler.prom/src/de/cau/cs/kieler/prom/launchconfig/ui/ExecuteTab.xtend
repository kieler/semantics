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
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.ArrayList
import java.util.EnumSet
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CheckStateChangedEvent
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ICheckStateListener
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/** 
 * The tab with the controls to set shell commands which will be executed
 * after the compilation and wrapper code generation have been finished.
 * 
 * @author aas
 */
class ExecuteTab extends AbstractKiCoLaunchConfigurationTab {

    /**
     * The control to show all commands and enable/disable them. 
     */
    private CheckboxTableViewer viewer
    
    /**
     * The input field to set the user defined name of a command.
     */
    private Text name
    
    /**
     * The input field to set the shell command which should be executed.
     */
    private Text command
    
    /**
     * Combobox with all available launch shortcuts.
     */
    private var ComboViewer launchShortcuts
    
    /**
     * The currently selected command data or null if there is nothing selected.
     */
    private CommandData currentData
    
    /**
     * The project of this launch configuration.
     */
    private var IProject project

    /**
     * Constructor
     */
    new(KiCoLaunchConfigurationTabGroup tabGroup) {
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
        createNameComponent(comp)
        createCommandComponent(comp)
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
        viewer = UIUtil.createCommandTable(group, true) as CheckboxTableViewer      
        viewer.addSelectionChangedListener(new ISelectionChangedListener(){
            
            override selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                if(selection != null)
                    currentData = selection.firstElement as CommandData
                else
                    currentData = null
                    
                updateControls(currentData)
                
                checkConsistency()
                updateLaunchConfigurationDialog()
            }
        })
        viewer.addCheckStateListener(new ICheckStateListener() {
            override checkStateChanged(CheckStateChangedEvent event) {
                checkConsistency()
                updateLaunchConfigurationDialog()
            }
        })
        
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
     * Creates the control to set a command's user defined name.
     * 
     * @param parent The parent composite
     */
    private def void createNameComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        name = UIUtil.createTextField(group, null, EnumSet.of(UIUtil.Buttons.NONE))
        name.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.name = name.text
                    viewer.refresh()
                    
                    checkConsistency()
                    updateLaunchConfigurationDialog()
                }
            }
        })
        name.toolTipText = "User defined name for the selected command"
    }
    
    /**
     * Creates the controls to set the shell command.
     * 
     * @param parent The parent composite
     */
    private def void createCommandComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Command", 1)
        
        // Create text
        command = UIUtil.createTextField(group, null, EnumSet.of(UIUtil.Buttons.NONE))
        command.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.command = command.text
                    viewer.refresh()
                    
                    checkConsistency()
                    updateLaunchConfigurationDialog()
                }
            }
        })
        command.toolTipText = "Shell command to be executed when the preceding commands finished successfully."
        
        // Create buttons
        val comp = UIUtil.createComposite(group, 2, GridData.HORIZONTAL_ALIGN_END)

        val browse = createPushButton(comp, "Browse Project...", null);
        browse.addSelectionListener(new SelectionAdapter() {

            override void widgetSelected(SelectionEvent e) {
                if (project != null) {
                    val dialog = new ResourceSelectionDialog(shell, project, "Select a file in the project.")
                    dialog.open()

                    // Get results.
                    val results = dialog.result
                    if (results != null && !results.isEmpty) {
                        val resource = results.get(0) as IResource
                        command.insert('"' + resource.projectRelativePath.toOSString + '"')
                    }
                }
            }
        });

        UIUtil.createBrowseVariableButton(comp, command, "Variables...")
    }

    /**
     * Creates the combo viewer with configuration elements that define launch shortcuts.
     * 
     * @param parent The parent composite
     */
    private def void createAssociatedLaunchShortcutComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Associated Launch Shortcut", 2)
        
        val combo = new ComboViewer(group, SWT.DEFAULT)
        launchShortcuts = combo
        launchShortcuts.combo.toolTipText = "Launch shortcut that is started after the KiCo Compilation"
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        
        val ArrayList<Object> input = new ArrayList<Object>()
        input.add(StructuredSelection.EMPTY)
        input.addAll(ExtensionLookupUtil.getLaunchShortcutConfigurationElements())
        combo.input = input
        
        // Select first element as default 
        combo.selection = new StructuredSelection(StructuredSelection.EMPTY)

        // Create label provider
        combo.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                if(element != null && element instanceof IConfigurationElement)
                    return (element as IConfigurationElement).getAttribute("label")
                else
                    return ""
            }
        }
        
        // Selection event
        combo.addSelectionChangedListener(new ISelectionChangedListener {

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
        
        // Update project reference        
        project = LaunchConfiguration.findProject(launchData.projectName)
        
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
    }
    
    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
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
     * Update all controls content with the given command data object.
     * @param comm The command data
     */
    private def void updateControls(CommandData comm){
        if(comm != null){
            name.text = comm.name
            command.text = comm.command
        }else{
            name.text = ""
            command.text = ""
        }
    }
    
    /**
     * Enable or disable all controls depending on this launch configuration's project. 
     */
    private def void updateEnabled(){
        val List<Control> controls = #[viewer.table, name, command, launchShortcuts.combo]
        UIUtil.enableControlsOnSameLevel(controls, project != null)
    }
}
