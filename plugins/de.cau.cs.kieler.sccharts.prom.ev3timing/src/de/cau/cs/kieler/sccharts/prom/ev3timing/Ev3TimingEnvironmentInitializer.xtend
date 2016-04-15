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
package de.cau.cs.kieler.sccharts.prom.ev3timing

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.environments.IEnvironmentsInitializer
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration

/**
 * Create a environment for Prom. Its called "EV3 timing" and configures the timing analysis on LEGO Mindstorms EV3 . 
 * 
 * @author dso
 */
class Ev3TimingEnvironmentInitializer implements IEnvironmentsInitializer {

	override getDefaultEnvironments() {
		val datas = newArrayList()

		// Mindstorms EV3
		var env = new EnvironmentData("Ev3 timing")
		datas += env

		env.targetLanguage = "s.c"
		env.targetFileExtension = ".c"
		env.targetTemplate = ""

		env.wrapperCodeTemplate = '''${«LaunchConfiguration.MAIN_FILE_PATH_VARIABLE»}'''
        env.wrapperCodeSnippetsDirectory = "kieler-gen"
        env.wrapperCodeSnippetsOrigin = "platform:/plugin/de.cau.cs.kieler.sccharts.prom.ev3timing/environments/ev3timing/snippets"
        env.associatedLaunchShortcut = "de.cau.cs.kieler.sccharts.prom.ev3timingShortcut"
		env.relatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
		env.mainFile = "main.c";

		return datas
	}
}