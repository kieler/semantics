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

import com.google.common.base.Strings
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.IProjectHolder
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.ArrayList
import java.util.EnumSet
import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
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
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Text

/** 
 * The tab with the controls for the main information for a KiCo launch.
 * This is the project, main file and environment used.
 * 
 * @author aas
 */
class MainTab extends AbstractKiCoLaunchConfigurationTab implements IProjectHolder {

    /**
     * The launch configuration this object is working on.
     */
    private ILaunchConfiguration configuration
    
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

        createProjectComponent(comp)
        createMainFileComponent(comp)
        createEnvironmentComponent(comp)
    }

    /**
     * Creates a group with the project text field and a button.
     * The button opens a selection dialog with the different projects in the workspace.
     * 
     * @param parent The parent composite
     */
    private def void createProjectComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project", 3)

        project = UIUtil.createTextField(group, "", EnumSet.of(UIUtil.Buttons.PROJECT_BUTTON))
        project.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }

    /**
     * Creates a group with the main file text field and a button.
     * The button opens a resource selection dialog in the specified project.
     * 
     * @param parent The parent composite
     */
    private def void createMainFileComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Main file", 3)

        mainFile = UIUtil.createTextField(group, "", EnumSet.of(UIUtil.Buttons.RESOURCE_BUTTON), this)
        mainFile.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
        mainFile.toolTipText = "Path to the main file of this project.\n"
            + "The placeholders ${main_name}, ${compiled_main_path}, etc. are set using this path."
    }
    
    /**
     * Creates a group with a combobox showing all environments
     * and a button to revert the values of this launch configuration
     * to the values of the selected environment.
     * 
     * @param parent The parent composite
     */
    private def void createEnvironmentComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Environment", 2)

        val store = PromPlugin.^default.preferenceStore
        val environments = EnvironmentData.loadAllFromPreferenceStore(store)
        
        // Create combobox
        environment = UIUtil.createEnvironmentsCombo(group, environments)
        environment.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        });
        
        // Create button
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
        button.toolTipText = "Reset this launch configuration to the values of the selected environment"
    }

    /**
     * {@inheritDoc}
     */
    override initializeFrom(ILaunchConfiguration configuration) {
        super.initializeFrom(configuration)
        // Ignore the following changes in the UI
        doNotApplyUIChanges = true
        
        // Remember this configuration
        this.configuration = configuration
        
        // Set project
        project.text = launchData.projectName
        
        // Set main file
        mainFile.text = launchData.mainFile
        
        // Load environment
        if (environment.input != null) {
            val loadedEnvironmentName = configuration.getAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, "")
            for (env : environment.input as ArrayList<EnvironmentData>) {
                if (env.name == loadedEnvironmentName) {
                    environment.selection = new StructuredSelection(env)
                }
            }
        }
        
        // Don't ignore UI changes anymore
        doNotApplyUIChanges = false
    }

    /** 
     * {@inheritDoc}
     */
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        if(doNotApplyUIChanges) {
            return
        }
        
        // Save environment
        val env = getSelectedEnvironment()
        if (env != null) 
            configuration.setAttribute(LaunchConfiguration.ATTR_ENVIRONMENT, env.name)
            
        // Set project
        launchData.projectName = project.text
        
        // Set main file
        launchData.mainFile = mainFile.text

        // Flush to configuration
        KiCoLaunchData.saveToConfiguration(configuration, launchData)

        // Check the user input for consistency
        checkConsistency()

        // Disable controls if project is not set correctly
        updateEnabled()
    }

    /**
     * Checks if the current input makes sense and set an error message accordingly.
     * 
     * @return true if the input is valid. false otherwise
     */
    private def boolean checkConsistency() {
        errorMessage = checkErrors() 
        return errorMessage == null
    }

    /**
     * Checks if the current input makes sense and returns an error message accordingly.
     * @return an appropriate error message or null if there is no error. 
     */
    private def String checkErrors() {
        // Project is not empty
        if (Strings.isNullOrEmpty(project.text)) {
            return "Project not specified."
        }
        
        // Project exists
        val proj = LaunchConfiguration.findProject(project.text)
        if (proj == null) {
            return "Project does not exist."
        } else {
            // Main file exists
            if(mainFile.text != "" && proj.findMember(mainFile.text) == null){
                return "Main file does not exist in the specified project."
            }
        }
        
        return null
    }

    /**
     * Enable the controls iff the project is set correctly.
     */
    private def void updateEnabled() {
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
