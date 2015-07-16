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
package de.cau.cs.kieler.sccharts.launchconfig.ui

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.CommandData
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
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
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/** 
 * The tab with the controls to set the execution commands (compile, deploy, run)
 * 
 * @author aas
 */
class ExecuteTab extends AbstractLaunchConfigurationTab {

    CommandData currentData
    
    TableViewer viewer
    
    Text name
    
    Text command

    /**
     * The project set in the main tab.
     */
    private var IProject project

    /**
     * Should an environment be is used for the settings?
     * The value is set in the main tab.
     */
    private var boolean useEnvironment

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
    }
    
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
        
        // Update use environment
        useEnvironment = workingCopy.getAttribute(LaunchConfiguration.ATTR_USE_ENVIRONMENT, false)
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
    
    private def updateControls(CommandData comm){
        if(comm != null){
            name.text = comm.name
            command.text = comm.command
        }
    }
}
