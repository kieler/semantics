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

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.common.FileCompilationData
import de.cau.cs.kieler.prom.common.ui.IProjectHolder
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.io.File
import java.util.ArrayList
import java.util.EnumSet
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
 * The tab with the controls to set files to be compiled via KiCo.
 * 
 * @author aas
 */
class CompilationTab extends AbstractLaunchConfigurationTab implements IProjectHolder {

    /**
     * The currently selected data of the list control.
     */
    private var FileCompilationData currentData

    /**
     * The list control for the file data objects.
     */
    private var ListViewer list

    /**
     * The button which
     * opens a Resource selection dialog and adds all selected files to the list.
     */
    private var Button addButton

    /**
     * The button which
     * removes the current selection from the list.
     */
    private var Button removeButton

    /**
     * The control to select the target transformation (e.g. Java Code or C Code).
     */
    private var ComboViewer targetLanguage

    /**
     * The control to select the target language file extension (e.g. '.java' for Java).
     */
    private var Text targetLanguageFileExtension

    /**
     * The input field for the file used as template for the compilation output.
     */
    private var Text targetTemplate

    /**
     * The input field for the file used as wrapper code template.
     * The wrapper code will be inserted to this file template.
     */
    private var Text wrapperCodeTemplate

    /**
     * The input field for the directory with the wrapper code snippets.
     */
    private var Text wrapperCodeSnippets

    /**
     * The project of this launch configuration.
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

        createFilesComponent(comp)
        createTargetComponent(comp)
        createWrapperCodeComponent(comp)
    }

    /**
     * Creates a new group with a list control and add and remove buttons.
     * The add button opens a resource selection dialog such that the user can add
     * files to the list.
     * The remove button removes the currently selected item from the list.
     * 
     * @param parent The parent composite 
     */
    private def void createFilesComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Files", 2)

        // Create list for files
        list = new ListViewer(group, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_BOTH))

        // Create content provider
        list.setContentProvider(ArrayContentProvider.instance);
        list.input = new ArrayList<FileCompilationData>()

        // Create label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as FileCompilationData)
                if (data != null)
                    return data.projectRelativePath
                else
                    return ""
            }
        });

        // Create selection event
        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                currentData = selection.firstElement as FileCompilationData
                updateEnabled()
            }
        });

        // Create buttons
        val bcomp = UIUtil.createComposite(group, 1, GridData.HORIZONTAL_ALIGN_END)
        
        val simpleSelectionListener = new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog()
            }
        }

        // Create add Button
        addButton = createPushButton(bcomp, "Add...", null)
        addButton.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    // Create dialog.
                    val dialog = new ResourceSelectionDialog(shell, project,
                        "Select files that should be compiled via KiCo.")
                    dialog.open()

                    // Get results.
                    val results = dialog.result
                    if (results != null) {
                        val inputArray = list.input as ArrayList<FileCompilationData>

                        // Add resources to the gui list
                        for (var i = 0; i < results.length; i++) {
                            val resource = results.get(i) as IResource
                            val projectRelativePath = resource.projectRelativePath.toOSString

                            // Filter files which are already in the list.
                            var isOK = true
                            for (FileCompilationData d : inputArray) {
                                if (d.projectRelativePath == projectRelativePath)
                                    isOK = false
                            }

                            // Add if the new element is ok.
                            if (isOK)
                                inputArray.add(new FileCompilationData(projectRelativePath))
                            else
                                println("Resource '" + resource.name + "' is already in list!")
                        }
                        list.refresh()

                        updateLaunchConfigurationDialog()
                    }
                }
            }
        )

        // Create remove Button
        removeButton = UIUtil.createRemoveButton(bcomp, list)
        removeButton.addSelectionListener(simpleSelectionListener)

        // Create up Button
        val upButton = UIUtil.createUpButton(bcomp, list)
        upButton.addSelectionListener(simpleSelectionListener)

        // Create down Button
        val downButton =UIUtil.createDownButton(bcomp, list)
        downButton.addSelectionListener(simpleSelectionListener)
    }

    /**
     * Creates a group and composite with controls to specify the target language and output template.
     * 
     * @param parent The parent composite
     */
    private def void createTargetComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Target", 1)

        // Create language control
        targetLanguage = UIUtil.createKiCoTargetsCombo(group)
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        })
        targetLanguage.combo.toolTipText = "Target transformation of the KIELER Compiler"

        // Create file extension control
        val comp2 = UIUtil.createComposite(group, 2)

        targetLanguageFileExtension = UIUtil.createTextField(comp2, "File extension", EnumSet.of(UIUtil.Buttons.NONE))
        targetLanguageFileExtension.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
        targetLanguageFileExtension.toolTipText = "File extension for the target language (e.g. '.java' for Java)"
        
        // Create template control
        val comp3 = UIUtil.createComposite(group, 3)
        
        targetTemplate = UIUtil.createTextField(comp3, "Output template", EnumSet.of(UIUtil.Buttons.RESOURCE_BUTTON), this)
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
        targetTemplate.toolTipText = "Template for the compiled output.\nUse ${" +
            LaunchConfiguration.COMPILED_CODE_PLACEHOLDER + "} in the template file as placeholder."
    }

    /**
     * Creates a group and composite with the input controls for wrapper code generation.
     * 
     * @param parent The parent composite 
     */
    private def void createWrapperCodeComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Wrapper code generation", 4)

        // Create input file control
        wrapperCodeTemplate = UIUtil.createTextField(group, "Input file",
            EnumSet.of(UIUtil.Buttons.RESOURCE_BUTTON, UIUtil.Buttons.VARIABLE_BUTTON), this)
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
        wrapperCodeTemplate.toolTipText = "Template where wrapper code is inserted"

        // Create control for directory with snippet definitions
        wrapperCodeSnippets = UIUtil.createTextField(group, "Snippets directory",
            EnumSet.of(UIUtil.Buttons.CONTAINER_BUTTON, UIUtil.Buttons.VARIABLE_BUTTON), this)
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
        wrapperCodeSnippets.toolTipText = "Directory path containing wrapper code snippets"
    }

    /**
     * {@inheritDoc}
     */
    override getName() {
        return "Compilation"
    }

    /**
     * {@inheritDoc}
     */
    override initializeFrom(ILaunchConfiguration configuration) {
        // Load files to be compiled
        list.input = FileCompilationData.loadAllFromConfiguration(configuration)

        // Load target language
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

        // Load target template
        targetTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, "")

        // Load wrapper code
        wrapperCodeTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, "")
        wrapperCodeSnippets.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, "")
    }

    /**
     * {@inheritDoc}
     */
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)

        // Reset current selection
        currentData = null

        // Update project reference
        val projectName = workingCopy.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        project = LaunchConfiguration.findProject(projectName)

        updateEnabled()
    }

    /**
     * {@inheritDoc}
     */
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        // Set files to be compiled
        val datas = list.input as List<FileCompilationData> FileCompilationData.saveAllToConfiguration(configuration, datas)

        // Set target language
        val selection = targetLanguage.selection as IStructuredSelection
        if (selection != null) {
            val trans = selection.firstElement as Transformation
            if (trans != null) {
                configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, trans.id)
            }
        }

        configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE_FILE_EXTENSION,
            targetLanguageFileExtension.text)

        // Set target template.
        configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, targetTemplate.text)

        // Set wrapper code
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, wrapperCodeTemplate.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, wrapperCodeSnippets.text)

        // Check the user input for consistency
        checkConsistency()
    }

    /**
     * Checks if the current input makes sense and set an error message accordingly.
     * 
     * @return true if the input is valid
     */
    private def boolean checkConsistency() {
        errorMessage = checkErrors()
        return errorMessage == null
    }
    
    /**
     * Checks the input for consistency and returns an error message accordingly.
     * 
     * @return an error message or null if there is no error
     */
    private def String checkErrors(){
        if (project != null) {
            // All files exist in this project
            for (data : list.input as List<FileCompilationData>) {
                val file = new File(project.location + File.separator + data.projectRelativePath)
                if (!file.exists)
                    return "File '" + data.projectRelativePath + "' does not exist in the specified project"
            }
        }
        
        return null
    }

    /**
     * {@inheritDoc}
     */
    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    /**
     * Enable or disable all controls that work on the currently selected file data.
     * Enable list control iff the project is set correct.
     */
    private def void updateEnabled() {
        // Enable controls that need an existing project specified
        val List<Control> controls = #[list.list, targetLanguage.combo, targetLanguageFileExtension, targetTemplate,
            wrapperCodeSnippets, wrapperCodeTemplate]
        UIUtil.enableControlsOnSameLevel(controls, project != null)
    }

    /**
     * Implementation of IProjectHolder.
     */
    override getProject() {
        return project
    }
}