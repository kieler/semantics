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

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
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
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/** 
 * @author aas
 */
class MainTab extends AbstractLaunchConfigurationTab {

    /**
     * Control to select the target transformation (e.g. Java Code or C Code).
     */
    private var ComboViewer targetLanguage

    /**
     * Input field for the project name.
     */
    private var Text project

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
     * Input field for the output file of the created wrapper code.
     */
    private var Text wrapperCodeTarget

    /**
     * Input field for the directory with the wrapper code snippets.
     */
    private var Text wrapperCodeSnippets

    /** 
     * {@inheritDoc}
     */
    override void createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createProjectComponent(comp)
        createTargetComponent(comp)
        createTargetTemplateComponent(comp)
        createWrapperCodeComponent(comp)
    }

    /**
     * Creates a group and a component with the project text field and a button.
     * The button opens a selection dialog with the different projects in the workspace.
     */
    private def createProjectComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Project", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        // Text
        project = SWTFactory.createSingleText(comp, 4)
        project.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })

        // Browse
        val browse = createPushButton(comp, "Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {

                    // Create a dialog with all projects in the workspace as possible selections.
                    val dialog = new ElementListSelectionDialog(parent.shell, new LabelProvider() {
                        override String getText(Object element) {
                            val data = (element as IProject)
                            if (data != null)
                                return data.name
                            else
                                return ""
                        }
                    })
                    dialog.title = "Project Selection"
                    
                    // Set the selectable elements of the dialog.
                    // A project may be closed
                    // so we use only open (accessible) projects as possible selection.
                    dialog.elements = ResourcesPlugin.workspace.root.projects.filter[it.isAccessible]
                    dialog.open()

                    // Get result from dialog
                    val results = dialog.result
                    if (results != null && !results.isEmpty) {
                        val result = results.get(0) as IProject
                        project.text = result.name
                    }
                }

            }
        )
    }

    /**
     * Creates a group and composite with the target language selection controls.
     */
    private def createTargetComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Target", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 1, 3, GridData.FILL_BOTH, 0, 0)

        // Composite for target language
        val languageComp = SWTFactory.createComposite(comp, parent.getFont(), 8, 3, GridData.FILL_HORIZONTAL, 0, 0)
        SWTFactory.createLabel(languageComp, "Language", 5)

        // ComboViewer
        targetLanguage = new ComboViewer(languageComp, SWT.DEFAULT)

        // Fetch possible targets from KiCo
        var Set<Transformation> transformations
        val feature = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
        if (feature != null) {
            transformations = feature.expandingTransformations
        }

        // Fill combo
        targetLanguage.contentProvider = ArrayContentProvider.instance
        targetLanguage.input = transformations

        // Select first element as default 
        if (transformations != null && transformations.size > 0) {
            targetLanguage.selection = new StructuredSelection(transformations.get(0))
        }

        // Label provider
        targetLanguage.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                val data = (element as Transformation)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        }

        // Selection listener
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog();
            }
        })
    }

    /**
     * Creates a group and composite with the target template input field and a button.
     * The button opens a file dialog to fill the input field.
     */
    private def createTargetTemplateComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "SCT output template", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        // Text
        targetTemplate = SWTFactory.createSingleText(comp, 4)
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })

        // Browse
        val browse = createPushButton(comp, "Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val currentProject = LaunchConfiguration.findProject(project.text)
                    val dialog = new ResourceSelectionDialog(parent.shell, currentProject, "")
                    dialog.open()

                    val results = dialog.result
                    if (results != null && results.size > 0) {
                        val result = results.get(0) as IResource
                        targetTemplate.setText(result.projectRelativePath.toOSString)
                    }
                }

            }
        )
    }

    /**
     * Creates a group and composite with the input controls for wrapper code generation. 
     */
    private def createWrapperCodeComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Wrapper code generation", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 8, 3, GridData.FILL_BOTH, 0, 0)

        // Input file
        SWTFactory.createLabel(comp, "Input file", 3)
        wrapperCodeTemplate = SWTFactory.createSingleText(comp, 4)
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })

        val browseWrapperCodeTemplate = createPushButton(comp, "Browse...", null)
        browseWrapperCodeTemplate.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val currentProject = LaunchConfiguration.findProject(project.text)
                    val dialog = new ResourceSelectionDialog(parent.shell, currentProject, "")
                    dialog.open()

                    val results = dialog.result
                    if (results != null && results.size > 0) {
                        val result = results.get(0) as IResource
                        wrapperCodeTemplate.setText(result.projectRelativePath.toOSString)
                    }
                }

            }
        )

        // Output file
        SWTFactory.createLabel(comp, "Output file", 3)
        wrapperCodeTarget = SWTFactory.createSingleText(comp, 4)
        wrapperCodeTarget.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })

        val browseWrapperCodeTarget = createPushButton(comp, "Browse...", null)
        browseWrapperCodeTarget.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val currentProject = LaunchConfiguration.findProject(project.text)
                    val dialog = new ResourceSelectionDialog(parent.shell, currentProject, "")
                    dialog.open()

                    val results = dialog.result
                    if (results != null && results.size > 0) {
                        val result = results.get(0) as IResource
                        wrapperCodeTarget.setText(result.projectRelativePath.toOSString)
                    }
                }

            }
        )

        // Directory with snippet definitions
        SWTFactory.createLabel(comp, "Annotation snippets directory", 3)
        wrapperCodeSnippets = SWTFactory.createSingleText(comp, 4)
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })

        val browseWrapperCodeSnippets = createPushButton(comp, "Browse...", null)
        browseWrapperCodeSnippets.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val currentProject = LaunchConfiguration.findProject(project.text)
                    val dialog = new ContainerSelectionDialog(getShell(), currentProject, false, "");

                    dialog.open();
                    val results = dialog.getResult()
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IPath)) {
                        val result = results.get(0) as IPath;
                        val relativeResult = result.makeRelativeTo(currentProject.fullPath)
                        wrapperCodeSnippets.setText(relativeResult.toOSString);
                    }
                }
            }
        )

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
        // Project
        project.text = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")

        // Target language
        if (targetLanguage.input != null) {
            val loadedTargetLanguage = configuration.getAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, "")
            for (transformation : targetLanguage.input as Set<Transformation>) {
                if (transformation.id == loadedTargetLanguage) {
                    targetLanguage.selection = new StructuredSelection(transformation)
                }
            }
        }

        // Target template
        targetTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, "")

        // Wrapper code
        wrapperCodeTemplate.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, "")
        wrapperCodeTarget.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_OUTPUT, "")
        wrapperCodeSnippets.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, "")
    }

    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        // Project
        configuration.setAttribute(LaunchConfiguration.ATTR_PROJECT, project.text)

        // Target selection
        val selection = targetLanguage.selection as IStructuredSelection
        if (selection != null) {
            val trans = selection.firstElement as Transformation
            if (trans != null) {
                configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_LANGUAGE, trans.id)
            }
        }

        // Target template.
        configuration.setAttribute(LaunchConfiguration.ATTR_TARGET_TEMPLATE, targetTemplate.text)

        // Wrapper code
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_TEMPLATE, wrapperCodeTemplate.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_OUTPUT, wrapperCodeTarget.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, wrapperCodeSnippets.text)

        // Check the user input for consistency
        checkConsistency()

        // Disable controls if project is not set correctly
        updateEnabled()
    }

    /**
     * Checks if the current input makes sense and set an error message accordingly.
     */
    private def checkConsistency() {
        errorMessage = {
            // Project is not empty
            if (project.text == null || project.text == "") {
                "Project not specified"
            } else {
                // Project exist
                val proj = LaunchConfiguration.findProject(project.text)
                if (proj == null) {
                    "Project does not exist"
                } else {

                    // Resources in project exist
                    if (targetTemplate.text != "" && proj.findMember(targetTemplate.text) == null) {
                        "Specified target template does not exist in this project"
                    } else if (wrapperCodeTemplate.text != "" && proj.findMember(wrapperCodeTemplate.text) == null) {
                        "Specified wrapper code template does not exist in this project"
                    } else if (wrapperCodeSnippets.text != "" && proj.findMember(wrapperCodeSnippets.text) == null){
                        "Specified wrapper code snippet directory does not exist in this project"
                    }
                }
            }
        }
    }

    /**
     * Enable the controls iff the project is set correctly.
     */
    private def updateEnabled() {
        val List<Control> controls = #[targetTemplate, targetLanguage.combo, wrapperCodeTemplate, wrapperCodeTarget,
            wrapperCodeSnippets]
        val enabled =  LaunchConfiguration.findProject(project.text) != null
        SCChartsLaunchConfigurationTabGroup.enableControls(controls, enabled)
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Main"
    }

}
