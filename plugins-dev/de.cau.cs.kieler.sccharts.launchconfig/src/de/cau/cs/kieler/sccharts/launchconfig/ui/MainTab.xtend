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
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.IProjectHolder
import de.cau.cs.kieler.sccharts.launchconfig.common.UIUtil
import java.util.ArrayList
import java.util.List
import java.util.Set
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Text

/** 
 * @author aas
 */
class MainTab extends AbstractLaunchConfigurationTab implements IProjectHolder {

    private var Button useEnvironment
    private var ComboViewer environment

    /**
     * Control to select the target transformation (e.g. Java Code or C Code).
     */
    private var ComboViewer targetLanguage

    /**
     * Control to select the target language file extension (e.g. '.java' for Java).
     */
    private var Text targetLanguageFileExtension

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
        createEnvironmentComponent(comp)
        createTargetComponent(comp)
        createTargetTemplateComponent(comp)
        createWrapperCodeComponent(comp)
    }

    /**
     * Creates a group and a component with the project text field and a button.
     * The button opens a selection dialog with the different projects in the workspace.
     */
    private def createProjectComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project", 3)

        project = UIUtil.createTextField(group, "", UIUtil.PROJECT_BUTTON)
        project.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }

    private def createEnvironmentComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Environment", 1)

        useEnvironment = SWTFactory.createCheckButton(group, "Use environment", null, false, 1)

        useEnvironment.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog()
            }
        });

        val comp = UIUtil.createComposite(group, 1)
        
        val store = LaunchConfigPlugin.^default.preferenceStore
        val environments = EnvironmentData.loadAllFromPreferenceStore(store)
        environment = UIUtil.createEnvironmentsCombo(comp, environments)
        environment.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        });
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
                // Automaticly set default value for output as the template path without extension.
                if (wrapperCodeTarget.text == null || wrapperCodeTarget.text == "") {
                    val index = wrapperCodeTemplate.text.lastIndexOf('.')
                    if (index > -1)
                        wrapperCodeTarget.text = wrapperCodeTemplate.text.substring(0, index)
                    else
                        wrapperCodeTarget.text = wrapperCodeTemplate.text
                }

                updateLaunchConfigurationDialog()
            }
        })

        // Output file
        wrapperCodeTarget = UIUtil.createTextField(group, "Output file", UIUtil.RESOURCE_BUTTON, this)
        wrapperCodeTarget.addModifyListener(new ModifyListener() {
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

        // Environment
        useEnvironment.selection = configuration.getAttribute(LaunchConfiguration.ATTR_USE_ENVIRONMENT, false)

        if (environment.input != null) {
            val loadedEnvironmentName = configuration.getAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, "")
            for (env : environment.input as ArrayList<EnvironmentData>) {
                if (env.name == loadedEnvironmentName) {
                    environment.selection = new StructuredSelection(env)
                }
            }
        }

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
        wrapperCodeTarget.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_OUTPUT, "")
        wrapperCodeSnippets.text = configuration.getAttribute(LaunchConfiguration.ATTR_WRAPPER_CODE_SNIPPETS, "")
    }

    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        // Project
        configuration.setAttribute(LaunchConfiguration.ATTR_PROJECT, project.text)

        // Environment
        configuration.setAttribute(LaunchConfiguration.ATTR_USE_ENVIRONMENT, useEnvironment.selection)

        val env = getSelectedEnvironment()
        if (env != null) {
            configuration.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, env.name)
        }

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
                    } else if (wrapperCodeSnippets.text != "" && proj.findMember(wrapperCodeSnippets.text) == null) {
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
        val List<Control> controls = #[targetTemplate, targetLanguage.combo, wrapperCodeTemplate,
            wrapperCodeTarget, wrapperCodeSnippets]
        val enabled = (LaunchConfiguration.findProject(project.text) != null) && !useEnvironment.selection
        SCChartsLaunchConfigurationTabGroup.enableControls(controls, enabled)
        
        environment.combo.enabled = useEnvironment.selection
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Main"
    }

    override getProject() {
        return LaunchConfiguration.findProject(project.text)
    }

    public def EnvironmentData getSelectedEnvironment() {
        val selection = environment.getSelection();
        if (!selection.isEmpty()) {
            val structuredSelection = selection as IStructuredSelection
            return structuredSelection.getFirstElement() as EnvironmentData
        } else {
            return null
        }
    }

}
