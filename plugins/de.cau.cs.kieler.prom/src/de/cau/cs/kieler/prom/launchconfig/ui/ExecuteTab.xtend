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
package de.cau.cs.kieler.prom.launchconfig.ui

import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
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
class ExecuteTab extends AbstractLaunchConfigurationTab {

    /**
     * The control to show all commands and enable/disable them. 
     */
    TableViewer viewer
    
    /**
     * The input field to set the user defined name of a command.
     */
    Text name
    
    /**
     * The input field to set the shell command which should be executed.
     */
    Text command
    
    /**
     * The currently selected command data or null if there is nothing selected.
     */
    CommandData currentData
    
    /**
     * The project of this launch configuration.
     */
    private var IProject project

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
    }

    /**
     * Creates the table viewer with checkboxes to show all commands and enable/disable them.
     */
    private def createTableComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Commands", 2)
        
        // Viewer
        viewer = UIUtil.createCommandTable(group, true)
        viewer.addSelectionChangedListener(new ISelectionChangedListener(){
            
            override selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                if(selection != null)
                    currentData = selection.firstElement as CommandData
                else
                    currentData = null
                    
                updateControls(currentData)
            }
        })
        
        // Buttons
        val bcomp = UIUtil.createComposite(group, 1)
        
        val updateDialogSelectionProvider =  new SelectionAdapter(){
            
            override widgetSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog()
            }
        }
        
        // Add Button
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                val comm = new CommandData("New Command", 'echo "hello world"')
                val inputArray = viewer.input as ArrayList<CommandData>
                inputArray.add(comm)
                viewer.refresh()
                viewer.selection = new StructuredSelection(comm)
            }
        })
        addButton.addSelectionListener(updateDialogSelectionProvider)
        addButton.toolTipText = "Add a shell command to be run after compilation and wrapper code generation"
        
        // Remove Button
        val removeButton = UIUtil.createRemoveButton(bcomp, viewer)
        removeButton.addSelectionListener(updateDialogSelectionProvider)
        
        // Up Button
        val upButton = UIUtil.createUpButton(bcomp, viewer)
        upButton.addSelectionListener(updateDialogSelectionProvider)
        
        // Down Button
        val downButton = UIUtil.createDownButton(bcomp, viewer)
        downButton.addSelectionListener(updateDialogSelectionProvider)
    }

    /**
     * Creates the control to set a command's user defined name.
     */
    private def createNameComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        name = UIUtil.createTextField(group, null, UIUtil.NONE)
        name.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.name = name.text
                    viewer.refresh()
                    updateLaunchConfigurationDialog()
                }
            }
        })
        name.toolTipText = "User defined name for the selected command"
    }
    
    /**
     * Creates the controls to set the shell command.
     */
    private def createCommandComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Command", 1)
        
        // Text
        command = UIUtil.createTextField(group, null, 0)
        command.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.command = command.text
                    viewer.refresh()
                    updateLaunchConfigurationDialog()
                }
            }
        })
        command.toolTipText = "Shell command to be executed when preceding command finished successful."
        
        // Buttons
        val comp = UIUtil.createComposite(group, 2, GridData.HORIZONTAL_ALIGN_END)

        val browse = createPushButton(comp, "Browse Project...", null);
        browse.addSelectionListener(new SelectionListener() {

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

            override void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        UIUtil.createBrowseVariableButton(comp, command, "Variables...")
    }

    /**
     * {@inheritDoc}
     */
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)
        
        // Update project reference
        val projectName = workingCopy.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        project = LaunchConfiguration.findProject(projectName)
        
        updateEnabled()
    }

    /** 
     * {@inheritDoc}
     */
    override void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    /** 
     * {@inheritDoc}
     */
    override void initializeFrom(ILaunchConfiguration configuration) {
        viewer.input = CommandData.loadAllFromConfiguration(configuration)
        
        updateEnabled()
    }
 
    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        CommandData.saveAllToConfiguration(configuration, viewer.input as List<CommandData>)
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Execute"
    }
    
    /**
     * Update all controls content with the given command data object.
     */
    private def updateControls(CommandData comm){
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
    private def updateEnabled(){
        val List<Control> controls = #[viewer.table, name, command]
        UIUtil.enableControlsOnSameLevel(controls, project != null)
    }
}
