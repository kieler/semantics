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

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.IProjectHolder
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import java.util.ArrayList
import java.util.List
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
 * The tab with the controls for the main information for a SCChart launch config
 * (project, main file, environment used).
 * 
 * @author aas
 */
class MainTab extends AbstractLaunchConfigurationTab implements IProjectHolder {

    ILaunchConfiguration configuration

    /**
     * Combobox with all environments.
     */
    private var ComboViewer environment

    /**
     * Input field for the project name.
     */
    private var Text project
    
    /**
     * Input field for the main file.
     */
    private var Text mainFile

    /** 
     * {@inheritDoc}
     */
    override void createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createProjectComponent(comp)
        createMainFileComponent(comp)
        createEnvironmentComponent(comp)
    }

    /**
     * Creates a group with the project text field and a button.
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

    /**
     * Creates a group with the main file text field and a button.
     * The button opens a resource selection dialog in the specified project.
     */
    private def createMainFileComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Main file", 3)

        mainFile = UIUtil.createTextField(group, "", UIUtil.RESOURCE_BUTTON, this)
        mainFile.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }
    
    /**
     * Creates a group with the environment checkbox and combobox.
     */
    private def createEnvironmentComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Environment", 2)

        val store = LaunchConfigPlugin.^default.preferenceStore
        val environments = EnvironmentData.loadAllFromPreferenceStore(store)
        
        
        // Combobox
        environment = UIUtil.createEnvironmentsCombo(group, environments)
        environment.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        });
        
        // Button
        val button = UIUtil.createButton(group, "Reset values")
        button.addSelectionListener(new SelectionAdapter(){
            
            override widgetSelected(SelectionEvent e) {
                val config = configuration.getWorkingCopy()
                selectedEnvironment?.applyToLaunchConfiguration(config)
                config.doSave()
                
                // Update UI
                for(tab : launchConfigurationDialog.tabs){
                    tab.initializeFrom(configuration)
                } 
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
        this.configuration = configuration
        
        // Project
        project.text = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        
        // Main file
        mainFile.text = configuration.getAttribute(LaunchConfiguration.ATTR_MAIN_FILE, "")
        
        // Environment
        if (environment.input != null) {
            val loadedEnvironmentName = configuration.getAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, "")
            for (env : environment.input as ArrayList<EnvironmentData>) {
                if (env.name == loadedEnvironmentName) {
                    environment.selection = new StructuredSelection(env)
                }
            }
        }
    }

    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        // Project
        configuration.setAttribute(LaunchConfiguration.ATTR_PROJECT, project.text)
        
        // Main file
        configuration.setAttribute(LaunchConfiguration.ATTR_MAIN_FILE, mainFile.text)

        // Environment
        val env = getSelectedEnvironment()
        if (env != null) 
            configuration.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, env.name)

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
                "Project not specified."
            } else {
                // Project exist
                val proj = LaunchConfiguration.findProject(project.text)
                if (proj == null) {
                    "Project does not exist."
                }else{
                    // Main file exists
                    if(mainFile.text != "" && proj.findMember(mainFile.text) == null){
                        "Main file does not exist in the specified project."
                    }
                }
            }
        }
    }

    /**
     * Enable the controls iff the project is set correctly.
     */
    private def updateEnabled() {
        val List<Control> controls = #[]
        val enabled = (LaunchConfiguration.findProject(project.text) != null)
        UIUtil.enableControlsOnSameLevel(controls, enabled)
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Main"
    }

    /**
     * @return a project handle of the selected project name<br />
     *         or null if there is no project with the specified name.
     */
    override getProject() {
        return LaunchConfiguration.findProject(project.text)
    }

    /**
     * @return the environment selected in the combobox<br />
     *         or null if there is no selection.
     */
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
