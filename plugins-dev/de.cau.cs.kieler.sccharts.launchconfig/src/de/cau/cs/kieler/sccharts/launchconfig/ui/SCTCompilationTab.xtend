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
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import de.cau.cs.kieler.sccharts.launchconfig.common.UIUtil
import java.io.File
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/**
 * @author aas
 * 
 */
class SCTCompilationTab extends AbstractLaunchConfigurationTab {

    /**
     * The list control for the sct files.
     * Takes an collection of SCTCompilationData as input.
     */
    private var ListViewer list

    /**
     * The add button.
     * Opens a Resource selection dialog and adds all selected SCT files to the list.
     */
    private var Button addButton
    
    /**
     * The remove Button.
     * Removes the current selection from the list.
     */
    private var Button removeButton
    
    /**
     * The currently selected data of the list control.
     */
    private var SCTCompilationData currentData

    /**
     * The project set in the main tab.
     */
    private var IProject project

    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)
 
        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createSCTFilesComponent(comp)
        
        updateEnabled()
    }

    /**
     * Creates a new group with a list control and add and remove buttons.
     * The add button opens a resource selection dialog such that the user can add
     * sct files to the list.
     * The remove button removes the currently selected item from the list. 
     */
    private def createSCTFilesComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "SCT files", 2)
        
        // List for SCT files
        list = new ListViewer(group, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_BOTH))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance);
        list.input = new ArrayList<SCTCompilationData>()
        
        // Label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as SCTCompilationData)
                if (data != null)
                    return data.projectRelativePath
                else
                    return ""
            }
        });

        // Selection event
        // Updates the currentData reference.
        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                currentData = selection.firstElement as SCTCompilationData
                updateControls(currentData)
            }
        });

        // Buttons
        val bcomp = UIUtil.createComposite(group, 1, GridData.HORIZONTAL_ALIGN_END)

        // Add Button
        addButton = createPushButton(bcomp, "Add...", null)
        addButton.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    // Create dialog.
                    val dialog = new ResourceSelectionDialog(shell, project, "Select SCT files that should be compiled.")
                    dialog.open()

                    // Get results.
                    val results = dialog.result
                    if (results != null) {
                        val inputArray = list.input as ArrayList<SCTCompilationData>

                        // Add resources to the gui list
                        for (var i = 0; i < results.length; i++) {
                            val resource = results.get(i) as IResource
                            val path = resource.location.toOSString
                            val projectRelativePath = resource.projectRelativePath.toOSString
                            val name = resource.name
 
                            // The ResourceSelectionDialog does not provide filter funcionality
                            // so we do this here manually.
                            var isOK = resource.fileExtension.toLowerCase == "sct"
                            for (SCTCompilationData d : inputArray) {
                                if (d.path == path)
                                    isOK = false
                            }

                            // Add if the new element is ok.
                            if (isOK)
                                inputArray.add(new SCTCompilationData(path, projectRelativePath, name))
                            else
                                println("Resource '" + resource.name + "' is no SCT file or already in list!")
                        }
                        list.refresh()
   
                        updateLaunchConfigurationDialog()
                    }                    
                }
            }
        )

        // Remove Button
        removeButton = createPushButton(bcomp, "Remove", null)
        removeButton.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                
                val inputArray = list.input as ArrayList<SCTCompilationData>
                inputArray.remove(currentData)
                list.refresh()
                list.selection = new StructuredSelection()
                updateLaunchConfigurationDialog()
            }
        })
        
        // Up Button
        val upButton =  UIUtil.createButton(bcomp, "Up")
        upButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val inputArray = (list.input as ArrayList<SCTCompilationData>)
                val index = inputArray.indexOf(currentData)
                if(index > 0){
                    Collections.swap(inputArray, index, index-1)
                    list.refresh()
                    
                    updateLaunchConfigurationDialog()
                }
            }
        })
        
        // Down Button
        val downButton =  UIUtil.createButton(bcomp, "Down")
        downButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val inputArray = (list.input as ArrayList<SCTCompilationData>)
                val index = inputArray.indexOf(currentData)
                if(index > -1 && index < inputArray.size-1){
                    Collections.swap(inputArray, index, index+1)
                    list.refresh()
                    
                    updateLaunchConfigurationDialog()
                }
            }
        })
    }

    /**type filter text
     * {@inheritDoc}
     */
    override getName() {
        return "SCT Compilation"
    }

    /**
     * {@inheritDoc}
     */
    override initializeFrom(ILaunchConfiguration configuration) {
        list.input = SCTCompilationData.loadAllFromConfiguration(configuration)
    }
    
    /**
     * {@inheritDoc}
     */
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)
        currentData= null
        updateProjectReference(workingCopy)        
        updateEnabled()
    }

    private def updateProjectReference(ILaunchConfigurationWorkingCopy configuration){
        val projectName = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        project= LaunchConfiguration.findProject(projectName)
    }

    /**
     * {@inheritDoc}
     */
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        // Get the sct files in the list
        val datas = list.input as List<SCTCompilationData>
        SCTCompilationData.saveAllToConfiguration(configuration, datas)
        
        // Update project reference
        updateProjectReference(configuration)
        
        // Check the user input for consistency
        checkConsistency()
    }

    /**
     * Checks if the current input makes sense and set an error message accordingly.
     */
    private def checkConsistency() {
        errorMessage = null
        
        if (project != null) {
            
            // All SCT files exist in this project
            for(data : list.input as List<SCTCompilationData>){
                val file = new File(project.location + "/" + data.projectRelativePath)
                if(!file.exists)
                    errorMessage = "File '"+data.projectRelativePath+"' does not exist in the specified project"
            }    
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    /**
     * Updates the values of all controls with the newly selected data.
     */
    private def updateControls(SCTCompilationData data) {
        updateEnabled()
        
        if (data != null) {
            // Set values of controls
        }
    }

    /**
     * Enable or disable all controls that work on the currently selected sct file data.
     * Enable list control iff the project is set correct.
     */
    private def updateEnabled() {
        // Enable controls that work on the currentData
        var enabled = (currentData != null)        
        var controls = #[]
        UIUtil.enableControlsOnSameLevel(controls, enabled)
        
        // Enable list control iff project is specified
        controls = #[list.list, addButton, removeButton]
        enabled = (project != null)
        UIUtil.enableControlsOnSameLevel(controls, enabled)
    }
    
}