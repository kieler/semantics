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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.data.CommandData
import de.cau.cs.kieler.prom.data.EnvironmentData
import de.cau.cs.kieler.prom.data.FileData
import de.cau.cs.kieler.prom.data.KiCoLaunchData
import de.cau.cs.kieler.prom.environments.IEnvironmentsInitializer
import java.util.List

/**
 * Returns a list with default environments ready to use.
 * 
 * @author aas
 */
class SCChartsEnvironmentInitializer implements IEnvironmentsInitializer {
    
    override getDefaultEnvironments() {
        val List<EnvironmentData> datas = newArrayList
        // Mindstorms NXT
        datas += getMindstormsNXTDefaultEnvironment
        // Mindstorms NXT MAC
        datas += getMindstormsNXTMacDefaultEnvironment
        // Mindstorms EV3
        datas += getMindstormsEV3DefaultEnvironment
        // Arduino
        datas += getArduinoCDTDefaultEnvironment
        datas += getArduinoSloeberDefaultEnvironment
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
        launchData.targetDirectory = PromPlugin.BUILD_DIRECTORY
        launchData.wrapperCodeTemplate = '''${«PromPlugin.MAIN_FILE_PATH_VARIABLE»}'''
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
     * Creates the default environment for Mindstorms NXT running leJOS.
     * @return  The default environment for Mindstorms NXT running leJOS.
     */
    private static def EnvironmentData getMindstormsNXTMacDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        launchData.mainFile = "src/${project_name}Main.ftl"
        launchData.targetLanguage = "s.java"
        launchData.targetLanguageFileExtension = ".java"
        launchData.targetDirectory = PromPlugin.BUILD_DIRECTORY
        launchData.wrapperCodeTemplate = '''${«PromPlugin.MAIN_FILE_PATH_VARIABLE»}'''
        launchData.wrapperCodeSnippetDirectory = "snippets"
        
        
        //val javapath = System.getenv("LEJOS_NXT_JAVA_HOME");
        val lejos = System.getenv("NXJ_HOME");
        val cd1 = new CommandData("Compile leJOS", '''"«lejos»/bin/nxjc" -cp "«lejos»/lib:src:«PromPlugin.BUILD_DIRECTORY»" "«PromPlugin.BUILD_DIRECTORY»/Main.java"''');
        val cd2 = new CommandData("Deploy and Run leJOS", '''"«lejos»/bin/nxj" -usb -r -cp "«lejos»/lib:src:«PromPlugin.BUILD_DIRECTORY»" -o "Main.nxj" Main''');
        launchData.commands.add(cd1);
        launchData.commands.add(cd2);
        

        val initialResources = newArrayList() 
        initialResources += new FileData(launchData.mainFile, "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/Main.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms NXT (MacOSX)")
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
        launchData.targetDirectory = PromPlugin.BUILD_DIRECTORY
        launchData.wrapperCodeTemplate = '''${«PromPlugin.MAIN_FILE_PATH_VARIABLE»}'''
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
    private static def EnvironmentData getArduinoSloeberDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        
        val simTemplateFile = new FileData("assets/CSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl") 
        val simTemplateSnippet = new FileData("assets/CSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulationSnippets.ftl")
        val buildConfigFile = new FileData("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/ArduinoSloeberBuildConfig.kibuild")
        val mainTemplateFile = new FileData("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/main.ftl")
        val snippetsFolder = new FileData("assets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets")
        val initialResources = #[simTemplateFile, simTemplateSnippet, buildConfigFile, mainTemplateFile, snippetsFolder] 
        
        val env = new EnvironmentData("Arduino (Sloeber)")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "${project_name}Model"
        // Eclipse Arduino V4 project wizard
        env.associatedProjectWizardClass = "io.sloeber.ui.wizard.newsketch.NewSketchWizard"
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoCDTDefaultEnvironment(){
        var launchData = new KiCoLaunchData()
        
        val simTemplateFile = new FileData("assets/CSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl") 
        val simTemplateSnippet = new FileData("assets/CSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulationSnippets.ftl")
        val buildConfigFile = new FileData("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/ArduinoC++BuildConfig.kibuild")
        val mainTemplateFile = new FileData("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/main.ftl")
        val snippetsFolder = new FileData("assets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets")
        val initialResources = #[simTemplateFile, simTemplateSnippet, buildConfigFile, mainTemplateFile, snippetsFolder] 
        
        val env = new EnvironmentData("Arduino (CDT)")
        env.launchData = launchData
        env.initialResources = initialResources
        env.modelFile = "${project_name}Model"
        env.associatedProjectWizardClass = "org.eclipse.cdt.arduino.ui.internal.project.NewArduinoProjectWizard"
        return env
    }
}