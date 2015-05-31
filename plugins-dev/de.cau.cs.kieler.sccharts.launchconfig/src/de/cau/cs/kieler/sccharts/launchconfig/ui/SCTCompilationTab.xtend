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
import de.cau.cs.kieler.sccharts.launchconfig.SCTCompilationData
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
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
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
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
     * The currently selected data of the list control.
     */
    private var SCTCompilationData currentData

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
        val group = SWTFactory.createGroup(parent, "SCT files", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_HORIZONTAL, 0, 0)

        // List for SCT files
        list = new ListViewer(comp, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance);

        // Label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as SCTCompilationData)
                if (data != null)
                    return data.name
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
        val bcomp = SWTFactory.createComposite(comp, comp.getFont(), 1, 3, GridData.HORIZONTAL_ALIGN_END, 0, 0)

        // Add Button
        val add = createPushButton(bcomp, "Add...", null)
        add.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    // Create dialog.
                    val dialog = new ResourceSelectionDialog(shell, project, "Select SCT files that should be compiled.")
                    dialog.open()

                    // Get results.
                    val results = dialog.result
                    if (results != null) {
                        // Compute new input for gui list by constructing new input.
                        val List<SCTCompilationData> currentInput = list.input as List<SCTCompilationData>
                        val newInput = new ArrayList()
                        if (currentInput != null)
                            newInput.addAll(currentInput)

                        // Add resources to the gui list
                        for (var i = 0; i < results.length; i++) {
                            val resource = results.get(i) as IResource
                            val path = resource.location.toOSString
                            val name = resource.name

                            // The ResourceSelectionDialog does not provide filter funcionality
                            // so we do this here manually.
                            var isOK = resource.fileExtension.toLowerCase == "sct"
                            for (SCTCompilationData d : currentInput) {
                                if (d.path == path)
                                    isOK = false
                            }

                            // Add if the new element is ok.
                            if (isOK)
                                newInput.add(new SCTCompilationData(path, name))
                            else
                                println("Resource '" + resource.name + "' is no SCT file or already in list!")
                        }
                        list.input = newInput
   
                        updateLaunchConfigurationDialog()
                    }                    
                }
            }
        )

        // Remove Button
        val remove = createPushButton(bcomp, "Remove", null)
        remove.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                // The ListViewer does not provide an easy way to remove an element
                // so we do it the hard way.
                
                // Remove the currently selected item from the list
                // by computing the input as 
                // 'everything in the list which is not the current selection'.
                val currentInput = list.input as List<SCTCompilationData>
                if (currentInput != null) {
                    val newInput = newArrayList()
                    currentInput.forEach [
                        if (it != currentData)
                            newInput += it
                    ]
                    list.input = newInput
                    list.selection = new StructuredSelection()
                    
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
        if (datas != null) {
            // Create a list with the paths of the selected SCT files.
            val List<String> sctFiles = newArrayList()
            datas.forEach [
                sctFiles += it.path
                
                // Save the attributes of this file with the path as identification
                configuration.setAttribute(it.path, it.attributeMap)
            ]
            configuration.setAttribute(LaunchConfiguration.ATTR_SCT_FILES, sctFiles)
        }
        
        // Update project reference
        updateProjectReference(configuration)
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
        val controls = #[]
        SCChartsLaunchConfigurationTabGroup.enableControls(controls, enabled)
        
        // Enable list control iff project is specified
        list.list.parent.children.forEach[ it.enabled = (project != null) ]
    }

}