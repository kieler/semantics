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

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.FileData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.environments.IEnvironmentsInitializer
import de.cau.cs.kieler.prom.launchconfig.KiCoLaunchConfig
import java.util.List

/**
 * Returns a list with default environments ready to use.
 * 
 * @author aas
 */
class SCChartsEnvironmentInitializer implements IEnvironmentsInitializer {
    
    override getDefaultEnvironments() {
        val List<EnvironmentData> datas = newArrayList()
        // Mindstorms NXT
        datas += getMindstormsNXTDefaultEnvironment()
        // Mindstorms EV3
        datas += getMindstormsEV3DefaultEnvironment()
        // Arduino
        datas += getArduinoDefaultEnvironment()
        // C Code Simulation
//        Uncommented for the next release.
//        datas += getCSimulationEnvironment()
        return datas
    }
    
    /**
     * Creates the default environment for Mindstorms NXT running leJOS.
     * @return  The default environment for Mindstorms NXT running leJOS.
     */
    private static def EnvironmentData getMindstormsNXTDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "src/${project_name}Main.ftl"
        launchData.targetLanguage = "s.java"
        launchData.targetLanguageFileExtension = ".java"
        launchData.targetDirectory = KiCoLaunchConfig.BUILD_DIRECTORY
        launchData.wrapperCodeTemplate = '''${«KiCoLaunchConfig.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets"
        launchData.associatedLaunchShortcut = "org.lejos.nxt.ldt.launch.LaunchNXTShortcut"

        val initialResources = newArrayList() 
        initialResources += new FileData(launchData.mainFile, "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/Main.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms NXT")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "src/${project_name}"
        env.associatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
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
        launchData.targetDirectory = KiCoLaunchConfig.BUILD_DIRECTORY
        launchData.wrapperCodeTemplate = '''${«KiCoLaunchConfig.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets"
        launchData.associatedLaunchShortcut = "org.lejos.ev3.ldt.launch.LaunchEV3Shortcut"

        val initialResources = newArrayList() 
        initialResources += new FileData(launchData.mainFile, "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/Main.ftl")
        initialResources += new FileData("snippets/lejos", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/lejos/ev3", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms EV3")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "src/${project_name}"
        env.associatedProjectWizardClass = "org.lejos.ev3.ldt.wizard.NewEV3Project"
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "${project_name}.ftl"
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".ino"
        launchData.wrapperCodeTemplate = '''${«KiCoLaunchConfig.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets"
        launchData.associatedLaunchShortcut = "it.baeyens.arduino.ui.launchconfig.LaunchShortcut"
        
        val initialResources = newArrayList() 
        initialResources += new FileData(launchData.mainFile, "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/main.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        val env = new EnvironmentData("Arduino")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "${project_name}Model"
        env.associatedProjectWizardClass = "it.baeyens.arduino.ui.NewSketchWizard"
        return env
    }
    
    /**
     * Creates a default environment to compile and simulate C code.
     * @return the created environment
     */
    private static def EnvironmentData getCSimulationEnvironment() {
        var launchData = new KiCoLaunchData()
        launchData.targetLanguage = "s.c"
        launchData.targetLanguageFileExtension = ".c"
        launchData.targetTemplate = "simulationTemplate.ftl"
        launchData.wrapperCodeSnippetDirectory = "snippets"
        
        val initialResources = newArrayList() 
        initialResources += new FileData("simulationTemplate.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/simulation/simulationTemplate.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/simulation/snippets")
        initialResources += new FileData("cJSON.h", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/simulation/cJSON.h")
        initialResources += new FileData("cJSON.c", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/simulation/cJSON.c")
        
        var env = new EnvironmentData("C Simulation")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "${project_name}"
        env.associatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        return env
    }
}