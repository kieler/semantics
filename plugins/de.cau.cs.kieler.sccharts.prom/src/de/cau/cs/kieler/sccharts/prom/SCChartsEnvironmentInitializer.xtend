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
import de.cau.cs.kieler.prom.common.KiCoLaunchData

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
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "src/${project_name}Main.ftl"
        launchData.targetLanguage = "s.java"
        launchData.targetLanguageFileExtension = ".java"
        launchData.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets/mindstorms_nxj"
        launchData.associatedLaunchShortcut = "org.lejos.nxt.ldt.launch.LaunchNXTShortcut"

        var env = new EnvironmentData("Mindstorms NXJ")
        env.launchData = launchData
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/snippets"
        env.relatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/Main.ftl"
        return env
    } 
    
    /**
     * Creates the default environment for Mindstorms EV3 running leJOS.
     * @return  The default environment for Mindstorms EV3 running leJOS.
     */
    private static def EnvironmentData getMindstormsEV3DefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "src/${project_name}Main.ftl"
        launchData.targetLanguage = "s.java"
        launchData.targetLanguageFileExtension = ".java"
        launchData.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets/mindstorms_ev3"
        launchData.associatedLaunchShortcut = "org.lejos.ev3.ldt.launch.LaunchEV3Shortcut"

        var env = new EnvironmentData("Mindstorms EV3")
        env.launchData = launchData
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/snippets"
        env.relatedProjectWizardClass = "org.lejos.ev3.ldt.wizard.NewEV3Project"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/Main.ftl"
        return env
    } 
    
    /**
     * Creates the default environment for Mindstorms NXT running NXC.
     * @return  The default environment for Mindstorms NXT running NXC.
     */
    private static def EnvironmentData getMindstormsNXCDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "main.ftl"
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".nxc"
        launchData.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets/mindstorms_nxc"
        launchData.commands.add(new CommandData("Compile & Deploy & Run", '''/opt/nxc/nbc -S=usb -EF -r ${«LaunchConfiguration.COMPILED_MAIN_FILE_PATH_VARIABLE»}'''))
        
        val env = new EnvironmentData("Mindstorms NXC")
        env.launchData = launchData
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxc/snippets"
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxc/main.ftl"
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "arduino_main/arduino_main.ftl"
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".ino"
        launchData.targetTemplate = ""
        launchData.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets/arduino"
        launchData.commands.add(new CommandData("Compile & Deploy", '''arduino --upload ${«LaunchConfiguration.COMPILED_MAIN_FILE_PATH_VARIABLE»}'''))
        val env = new EnvironmentData("Arduino")
        env.launchData = launchData
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets"
        env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/arduino_main.ftl"
        return env
    }
}