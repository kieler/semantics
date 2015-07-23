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

/**
 * @author aas
 *
 */
class SCChartsEnvironmentInitializer implements IEnvironmentsInitializer {
    
    override getDefaultEnvironments() {
        val datas = newArrayList()
        
        // Mindstorms NXJ
        val env = new EnvironmentData("Mindstorms NXJ")
        
        env.targetLanguage = "s.java"
        env.targetFileExtension = ".java"
        env.targetTemplate = ""
        
        env.wrapperCodeTemplate = "src/Main.ftl"
        env.wrapperCodeSnippetsDirectory = "snippets/mindstorms_nxj"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/snippets"
        
        env.commands.add(new CommandData("Compile", '''nxjc -cp "/opt/leJOS_0.9.1/lib:src:«LaunchConfiguration.BUILD_DIRECTORY»" "«LaunchConfiguration.BUILD_DIRECTORY»/Main.java"'''))
        env.commands.add(new CommandData("Deploy and Run", '''nxj -r -cp "/opt/leJOS_0.9.1/lib:src:«LaunchConfiguration.BUILD_DIRECTORY»" -o "Main.nxj" Main'''))
        
        env.relatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        
        env.mainFile = "src/Main.ftl"
        env.mainFileOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/environments/mindstorms_nxj/Main.ftl"
        
        datas += env
        
        return datas
    }
    
}