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

import de.cau.cs.kieler.prom.data.EnvironmentData
import de.cau.cs.kieler.prom.data.FileData
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
        datas += getArduinoGenericDefaultEnvironment
        return datas
    }
    
    /**
     * Creates the default environment for Mindstorms NXT running leJOS.
     * @return  The default environment for Mindstorms NXT running leJOS.
     */
    private static def EnvironmentData getMindstormsNXTDefaultEnvironment(){
        val initialResources = newArrayList() 
        initialResources += new FileData("src/${project_name}Main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/Main.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms NXT")
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
        val initialResources = newArrayList() 
        initialResources += new FileData("src/${project_name}Main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/Main.ftl")
        initialResources += new FileData("snippets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms NXT (MacOSX)")
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
        val initialResources = newArrayList() 
        initialResources += new FileData("src/${project_name}Main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/Main.ftl")
        initialResources += new FileData("snippets/lejos", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxt/snippets")
        initialResources += new FileData("snippets/lejos/ev3", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_ev3/snippets")
        initialResources += new FileData("snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/core/core.ftl")
        
        var env = new EnvironmentData("Mindstorms EV3")
        env.initialResources = initialResources
        env.modelFile = "src/${project_name}"
        env.associatedProjectWizardClass = "org.lejos.ev3.ldt.wizard.NewEV3Project"
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoGenericDefaultEnvironment(){
        val simTemplateFile = new FileData("assets/CSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl") 
        val simTemplateSnippet = new FileData("assets/CSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulationSnippets.ftl")
        val buildConfigFile = new FileData("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/ArduinoGenericBuildConfig.kibuild")
        val mainTemplateFile = new FileData("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/main_include.ftl")
        val snippetsFolder = new FileData("assets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets")
        val initialResources = #[simTemplateFile, simTemplateSnippet, buildConfigFile, mainTemplateFile, snippetsFolder] 
        
        val env = new EnvironmentData("Arduino (Generic)")
        env.initialResources = initialResources
        env.modelFile = "${project_name}Model"
        // Eclipse Arduino V4 project wizard
        env.associatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        return env
    }
    
    /**
     * Creates the default environment for Arduino development.
     * @return  The default environment for Arduino development.
     */
    private static def EnvironmentData getArduinoCDTDefaultEnvironment(){
        val simTemplateFile = new FileData("assets/CSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl") 
        val simTemplateSnippet = new FileData("assets/CSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulationSnippets.ftl")
        val buildConfigFile = new FileData("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/ArduinoC++BuildConfig.kibuild")
        val mainTemplateFile = new FileData("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/main.ftl")
        val snippetsFolder = new FileData("assets", "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/arduino/snippets")
        val initialResources = #[simTemplateFile, simTemplateSnippet, buildConfigFile, mainTemplateFile, snippetsFolder] 
        
        val env = new EnvironmentData("Arduino (CDT)")
        env.initialResources = initialResources
        env.modelFile = "${project_name}Model"
        env.associatedProjectWizardClass = "org.eclipse.cdt.arduino.ui.internal.project.NewArduinoProjectWizard"
        return env
    }
}