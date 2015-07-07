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

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.IProjectHolder
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import java.io.File
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/**
 * @author aas
 * 
 */
class SCTCompilationTab extends AbstractLaunchConfigurationTab implements IProjectHolder {
    
    /**
     * The currently selected data of the list control.
     */
    private var SCTCompilationData currentData

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
     * Control to select the target transformation (e.g. Java Code or C Code).
     */
    private var ComboViewer targetLanguage

    /**
     * Control to select the target language file extension (e.g. '.java' for Java).
     */
    private var Text targetLanguageFileExtension
    
    /**
     * Input field for the file used as template for the sct compilation output.
     */
    private var Text targetTemplate

    /**
     * Input field for the file used as wrapper code template.
     * The wrapper code will be inserted to this file template.
     */
    private var Text wrapperCodeTemplate

    /**
     * Input field for the directory with the wrapper code snippets.
     */
    private var Text wrapperCodeSnippets
    
    /**
     * The project set in the main tab.
     */
    private var IProject project

    private var boolean useEnvironment

    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)
 
        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createSCTFilesComponent(comp)
        createTargetComponent(comp)
        createTargetTemplateComponent(comp)
        createWrapperCodeComponent(comp)
        
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

    /**
     * Creates a group and composite with the target language selection controls.
     */
    private def createTargetComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Target", 1)

        // ComboViewer
        targetLanguage = UIUtil.createKiCoTargetsCombo(group)
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        })

        // File extension
        val comp = UIUtil.createComposite(group, 2)

        targetLanguageFileExtension = UIUtil.createTextField(comp, "File extension", UIUtil.NONE)
        targetLanguageFileExtension.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }

    /**
     * Creates a group and composite with the target template input field and a button.
     * The button opens a file dialog to fill the input field.
     */
    private def createTargetTemplateComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "SCT output template", 2)

        // Text
        targetTemplate = UIUtil.createTextField(group, null, UIUtil.RESOURCE_BUTTON, this)
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }

    /**
     * Creates a group and composite with the input controls for wrapper code generation. 
     */
    private def createWrapperCodeComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Wrapper code generation", 3)

        // Input file
        wrapperCodeTemplate = UIUtil.createTextField(group, "Input file", UIUtil.RESOURCE_BUTTON, this)
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })

        // Directory with snippet definitions
        wrapperCodeSnippets = UIUtil.createTextField(group, "Annotation snippets directory", UIUtil.CONTAINER_BUTTON,
            this)
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
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
        // SCT files
        list.input = SCTCompilationData.loadAllFromConfiguration(configuration)
        
        // Target language
        if (targetLanguage.input != null) {
            val loadedTargetLanguage = configuration.getAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, "")
            for (transformation : targetLanguage.input as Set<Transformation>) {
                if (transformation.id == loadedTargetLanguage) {
                    targetLanguage.selection = new StructuredSelection(transformation)
                }
            }
        }

        targetLanguageFileExtension.text = configuration.getAttribute(
            LaunchConfiguration.ATTR_TARGET_LANGUAGE_FILE_EXTENSION, "")

        // Target template
        targetTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, "")

        // Wrapper code
        wrapperCodeTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, "")
        wrapperCodeSnippets.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, "")
    }
    
    /**
     * {@inheritDoc}
     */
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)
        currentData= null
        
        // Update project reference
        val projectName = workingCopy.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        project = LaunchConfiguration.findProject(projectName)
        
        // Update use environment
        useEnvironment = workingCopy.getAttribute(LaunchConfiguration.ATTR_USE_ENVIRONMENT, false)
       
        updateEnabled()
    }

    /**
     * {@inheritDoc}
     */
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        // SCT files
        val datas = list.input as List<SCTCompilationData>
        SCTCompilationData.saveAllToConfiguration(configuration, datas)
        
        // Target selection
        val selection = targetLanguage.selection as IStructuredSelection
        if (selection != null) {
            val trans = selection.firstElement as Transformation
            if (trans != null) {
                configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, trans.id)
            }
        }

        configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE_FILE_EXTENSION,
            targetLanguageFileExtension.text)

        // Target template.
        configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, targetTemplate.text)

        // Wrapper code
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, wrapperCodeTemplate.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, wrapperCodeSnippets.text)
        
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
            
            // Resources in project exist
            if (targetTemplate.text != "" && project.findMember(targetTemplate.text) == null) {
                errorMessage = "Specified target template does not exist in this project"
            } else if (wrapperCodeTemplate.text != "" && project.findMember(wrapperCodeTemplate.text) == null) {
                errorMessage = "Specified wrapper code template does not exist in this project"
            } else if (wrapperCodeSnippets.text != "" && project.findMember(wrapperCodeSnippets.text) == null) {
                errorMessage = "Specified wrapper code snippet directory does not exist in this project"
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
        // Enable controls that need an existing project specified
        var List<Control> controls = #[list.list]
        UIUtil.enableControlsOnSameLevel(controls, project != null)
        
        // Enable controls that are not necessary if an environment is used
        controls = #[targetLanguage.combo, targetLanguageFileExtension, targetTemplate, wrapperCodeSnippets, wrapperCodeTemplate]
        UIUtil.enableControlsOnSameLevel(controls, project != null && !useEnvironment)
    }
    
    override getProject() {
        return project
    }
    
}