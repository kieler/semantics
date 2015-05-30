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
import de.cau.cs.kieler.sccharts.launchconfig.ui.ExecuteTab.Command
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IPathVariableManager
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.debug.ui.StringVariableSelectionDialog
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
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/** 
 * @author aas
 */
class ExecuteTab extends AbstractLaunchConfigurationTab {
    
    private enum Command{
        COMPILE, DEPLOY, RUN
    }
    
    Text compileCommand
    Text deployCommand
    Text runCommand    
    
    /** 
     * {@inheritDoc}
     */
    override void createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)
   
        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        //createProjectComponent(comp)
        //createMainFileComponent(comp)
        createCommandComponent(comp, "Compile command", Command.COMPILE)
        createCommandComponent(comp, "Deploy command", Command.DEPLOY)
        createCommandComponent(comp, "Run command", Command.RUN)
    }

    private def createCommandComponent(Composite parent, String title, Command command) {
        val group = SWTFactory.createGroup(parent, title, 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        var Text text
        switch(command){
            case COMPILE : {
                compileCommand = SWTFactory.createSingleText(comp, 4)
                text = compileCommand
            }
            case DEPLOY : {
                deployCommand = SWTFactory.createSingleText(comp, 4)
                text = deployCommand
            }
            case RUN : {
                runCommand = SWTFactory.createSingleText(comp, 4)
                text = runCommand
            }
        }
        text.addModifyListener(new ModifyListener(){
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
            }
        })
        
        val variables = createPushButton(comp, "Variables...", null);
        variables.data = text
        variables.addSelectionListener(new SelectionListener() {
            override void widgetSelected(SelectionEvent e) {
                val dialog = new StringVariableSelectionDialog(getShell());
                dialog.open();
                val variable = dialog.getVariableExpression();
                if (variable != null) {
                    (variables.data as Text).insert(variable)
                }
            }

            override void widgetDefaultSelected(SelectionEvent e) {
            }
        });
    }

    private def createMainFileComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Main file", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        val text = SWTFactory.createSingleText(comp, 4)

        val browse = createPushButton(comp, "Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "")
                    dialog.open()

                    val results = dialog.result
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IResource)) {
                        val res = results.get(0) as IResource;
                        val containerName = res.fullPath.toOSString();
                        text.setText(containerName);
                    }
                }

            }
        )

    }

    private def createProjectComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "&Project", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        val text = SWTFactory.createSingleText(comp, 4)

        val browse = createPushButton(comp, "&Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val currentContainerString = text.getText()
                    val currentContainer = getContainer(currentContainerString)
                    val dialog = new ContainerSelectionDialog(getShell(), currentContainer, false, "");

                    dialog.open();
                    val results = dialog.getResult()
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IPath)) {
                        val path = results.get(0) as IPath;
                        val containerName = path.toOSString();
                        text.setText(containerName);
                    }
                }
            }
        )
    }

    private def IContainer getContainer(String path) {
        val containerPath = new Path(path);
        val workspaceRoot = ResourcesPlugin.getWorkspace().getRoot()
        return workspaceRoot.findMember(containerPath) as IContainer
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
