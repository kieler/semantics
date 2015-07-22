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

import de.cau.cs.kieler.prom.filewizard.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.projectwizard.PromProjectWizard

/**
 * 
 * @author aas
 * 
 */
class SCChartsProjectWizard extends PromProjectWizard {

    override createModelFileCreationPage(){
        val page = new AdvancedNewFileCreationPage("SCT File", selection, true)
        page.fileName = "NewModel.sct"
        page.fileExtension = "sct"
        page.description = "Specify where the SCChart model should be created and initialized."
        return page
    }
    
    override createMainFileCreationPage(){
        val page = new AdvancedNewFileCreationPage("Main File", selection, true)
        page.fileName = "Main"
        page.fileExtension = ""
        page.description = "Specify where the main file, containing wrapper code to run the Model, should be created and initialized."
        return page
    }
    
}