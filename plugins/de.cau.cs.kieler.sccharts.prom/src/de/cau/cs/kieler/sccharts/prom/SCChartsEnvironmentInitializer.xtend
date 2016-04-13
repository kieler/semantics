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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.environments.IEnvironmentsInitializer
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.List

/**
 * Returns a list with default environments ready to use.
 * 
 * @author aas
 */
class SCChartsEnvironmentInitializer implements IEnvironmentsInitializer {
    
    override getDefaultEnvironments() {
        val List<EnvironmentData> datas = newArrayList()
              
        // Mindstorms NXJ
        datas += getMindstormsNXJDefaultEnvironment()
        
        // Mindstorms EV3
        datas += getMindstormsEV3DefaultEnvironment()
        
        // Mindstorms NXC
        datas += getMindstormsNXCDefaultEnvironment()
       
        // Arduino
        datas += getArduinoDefaultEnvironment()

        return datas
    }
    
    /**
     * Creates the default environment for Mindstorms NXT running leJOS.
     * @return  The default environment for Mindstorms NXT running leJOS.
     */
    private static def EnvironmentData getMindstormsNXJDefaultEnvironment(){
        var env = new EnvironmentData("Mindstorms NXJ")
        
        env.targetLanguage = "s.java"
        env.targetFileExtension = ".java"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        env.wrapperCodeSnippetsDirectory = "snippets/mindstorms_nxj"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/snippets"
        
        env.associatedLaunchShortcut = "org.lejos.nxt.ldt.launch.LaunchNXTShortcut"
        
        env.relatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        
        env.mainFile = "src/${project_name}Main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/Main.ftl"
        
        return env
    } 
    
    /**
     * Creates the default environment for Mindstorms EV3 running leJOS.
     * @return  The default environment for Mindstorms EV3 running leJOS.
     */
    private static def EnvironmentData getMindstormsEV3DefaultEnvironment(){
        var env = new EnvironmentData("Mindstorms EV3")
        
        env.targetLanguage = "s.java"
        env.targetFileExtension = ".java"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        env.wrapperCodeSnippetsDirectory = "snippets/mindstorms_ev3"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/snippets"
        
        env.associatedLaunchShortcut = "org.lejos.ev3.ldt.launch.LaunchEV3Shortcut"
        
        env.relatedProjectWizardClass = "org.lejos.ev3.ldt.wizard.NewEV3Project"
        
        env.mainFile = "src/${project_name}Main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/Main.ftl"
        
        return env
    } 
    
    /**
     * Creates the default environment for Mindstorms NXT running NXC.
     * @return  The default environment for Mindstorms NXT running NXC.
     */
    private static def EnvironmentData getMindstormsNXCDefaultEnvironment(){
        val env = new EnvironmentData("Mindstorms NXC")
        
        env.targetLanguage = "s.c"
        env.targetFileExtension = ".nxc"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        env.wrapperCodeSnippetsDirectory = "snippets/mindstorms_nxc"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxc/snippets"
        
        env.commands.add(new CommandData("Compile & Deploy & Run", '''/opt/nxc/nbc -S=usb -EF -r ${«LaunchConfiguration.COMPILED_MAIN_FILE_PATH_VARIABLE»}'''))
        
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        
        env.mainFile = "main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxc/main.ftl"
        
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoDefaultEnvironment(){
        val env = new EnvironmentData("Arduino")
        
        env.targetLanguage = "s.c"
        env.targetFileExtension = ".ino"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        env.wrapperCodeSnippetsDirectory = "snippets/arduino"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets"
        
        env.commands.add(new CommandData("Compile & Deploy", '''arduino --upload ${«LaunchConfiguration.COMPILED_MAIN_FILE_PATH_VARIABLE»}'''))
        
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        
        env.mainFile = "arduino_main/arduino_main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/arduino_main.ftl"
        
        return env
    }
}