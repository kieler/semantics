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
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.debug.ui.StringVariableSelectionDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/** 
 * @author aas
 */
class ExecuteTab extends AbstractLaunchConfigurationTab {
    
    /**
     * The input field for the compile command.
     */
    Text compileCommand
    
    /**
     * The input field for the deploy command.
     */
    Text deployCommand
    
    /**
     * The input field for the run command.
     */
    Text runCommand    
    
    /**
     * The project set in the main tab.
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

        compileCommand = createCommandComponent(comp, "Compile command")
        deployCommand = createCommandComponent(comp, "Deploy command")
        runCommand = createCommandComponent(comp, "Run command")
    }

    /**
     * Creates a text field and a button as part of a new group and composite.
     * The button opens a variable selection dialog and adds its selection to the text field.
     * 
     * @param parent The parent composite
     * @param title The title for the group
     * @return The newly created text field 
     */
    private def Text createCommandComponent(Composite parent, String title) {
        val group = SWTFactory.createGroup(parent, title, 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 1, 3, GridData.FILL_BOTH, 0, 0)

        // Text
        val Text text = SWTFactory.createSingleText(comp, 4)
        text.addModifyListener(new ModifyListener(){
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })
        
        // Buttons
        val bcomp = SWTFactory.createComposite(comp, parent.getFont(), 2, 3, GridData.HORIZONTAL_ALIGN_END, 0, 0)
        
        // Browse
        val browse = createPushButton(bcomp, "Browse Project...", null);
        browse.addSelectionListener(new SelectionListener() {
            
            override void widgetSelected(SelectionEvent e) {
                if(project != null){
                    val dialog = new ResourceSelectionDialog(shell, project, "Select a file in the project.")
                    dialog.open()

                    // Get results.
                    val results = dialog.result
                    if (results != null && !results.isEmpty) {
                        val resource = results.get(0) as IResource    
                        text.insert('"'+LaunchConfiguration.LAUNCHED_PROJECT_PLACEHOLDER+"/"+resource.projectRelativePath.toOSString+'"')
                    }    
                }
            }

            override void widgetDefaultSelected(SelectionEvent e) {
            }
        });
        
        // Variables
        val variables = createPushButton(bcomp, "Variables...", null);
        variables.addSelectionListener(new SelectionListener() {
            
            override void widgetSelected(SelectionEvent e) {
                val dialog = new StringVariableSelectionDialog(getShell());
                dialog.open();
                val variable = dialog.getVariableExpression();
                if (variable != null) {
                    text.insert(variable)
                }
            }

            override void widgetDefaultSelected(SelectionEvent e) {
            }
        });
        
        return text
    }

    private def updateProjectReference(ILaunchConfigurationWorkingCopy configuration){
        val projectName = configuration.getAttribute(LaunchConfiguration.ATTR_PROJECT, "")
        project= LaunchConfiguration.findProject(projectName)
    }
    
    /**
     * {@inheritDoc}
     */
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)
        updateProjectReference(workingCopy)        
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
        compileCommand.text = configuration.getAttribute(LaunchConfiguration.ATTR_COMPILE_COMMAND, "")
        deployCommand.text = configuration.getAttribute(LaunchConfiguration.ATTR_DEPLOY_COMMAND, "")
        runCommand.text = configuration.getAttribute(LaunchConfiguration.ATTR_RUN_COMMAND, "")
    }

    /** 
     * {@inheritDoc}
     */ 
    override void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(LaunchConfiguration.ATTR_COMPILE_COMMAND, compileCommand.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_DEPLOY_COMMAND, deployCommand.text)
        configuration.setAttribute(LaunchConfiguration.ATTR_RUN_COMMAND, runCommand.text)
    }

    /** 
     * {@inheritDoc}
     */
    override String getName() {
        return "Execute"
    }

}
