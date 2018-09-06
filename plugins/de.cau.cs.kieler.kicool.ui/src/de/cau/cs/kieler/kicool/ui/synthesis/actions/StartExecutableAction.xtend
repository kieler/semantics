/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.IAction
import java.io.File
import org.eclipse.core.externaltools.internal.IExternalToolConstants
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.DebugUITools

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class StartExecutableAction implements IAction {

    /** The action ID. */
    public static final String ID =
            "de.cau.cs.kieler.kicool.ui.synthesis.actions.StartExecutableAction";
            
    /** Launch config name */
    public static val NAME = "KiCo Launch"

    /**
     * {@inheritDoc}
     */
    override ActionResult execute(ActionContext context) {
        val vc = context.viewContext
        val exe = vc.getInputModel

        // get error model
        if (exe instanceof ExecutableContainer) {
            val launch = createLaunch(IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE)
            launch.configureExternalTool
            
            if (vc.hasProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)) {
                val cc = vc.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
                if (cc !== null) {
                    val env = cc.processorInstancesSequence.findFirst[environment.model == exe]?.environment
                    if (env !== null) {
                        val pi = env.getProperty(ProjectInfrastructure.PROJECT_INFRASTRUCTURE)
                        if (pi !== null) {
                            launch.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, pi.generadedCodeFolder.absoluteFile.toString)
                        }
                    }
                } 
            }

            val commands = exe.processBuilder.command
            launch.setAttribute(IExternalToolConstants.ATTR_LOCATION, commands.head)
            
            if ("java".equals(commands.head)) {
                val home = System.getProperty("java.home")
                if (!home.nullOrEmpty) {
                    launch.setAttribute(IExternalToolConstants.ATTR_LOCATION, (new File(new File(home, "bin"), "java")).toString)
                }
            }
            
            if (commands.size > 1) {
                launch.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, commands.drop(1).join(" "))
            }
            
            if (exe.environment !== null && !exe.environment.empty) {
                // FIXME Magic key
                launch.setAttribute("org.eclipse.debug.core.environmentVariables", exe.environment)
            }
            
            launch.setAttribute(DebugPlugin.ATTR_CAPTURE_OUTPUT, exe.console)
            
            DebugUITools.launch(launch.doSave(), ILaunchManager.RUN_MODE)
        }
        return ActionResult.createResult(false);
    }
    
    def createLaunch(String type) {
        val manager = DebugPlugin.getDefault.getLaunchManager
        val launchType = manager.getLaunchConfigurationType(type)
        manager.getLaunchConfigurations(launchType).filter[NAME.equals(it.name)].forEach[it.delete]
        return launchType.newInstance(null, NAME)
    }
    
    def configureExternalTool(ILaunchConfigurationWorkingCopy workingCopy) {
        workingCopy.setAttribute(DebugPlugin.ATTR_CAPTURE_OUTPUT, true)
        workingCopy.setAttribute(IExternalToolConstants.ATTR_SHOW_CONSOLE, true)
        workingCopy.setAttribute(IExternalToolConstants.ATTR_BUILDER_ENABLED, false)
//            workingCopy.setAttribute(IExternalToolConstants.ATTR_BUILD_SCOPE, IExternalToolConstants.BUILD_TYPE_NONE)
        workingCopy.setAttribute(IExternalToolConstants.ATTR_BUILD_SCOPE, "${none}")
        workingCopy.setAttribute(IExternalToolConstants.ATTR_LAUNCH_IN_BACKGROUND, true)
    }

}
