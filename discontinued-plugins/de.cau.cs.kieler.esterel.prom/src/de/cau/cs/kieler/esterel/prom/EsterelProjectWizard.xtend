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
package de.cau.cs.kieler.esterel.prom

import de.cau.cs.kieler.prom.ui.wizards.PromProjectWizard

/**
 * Implementation of a project wizard for esterel modeling.
 * 
 * @author aas
 */
class EsterelProjectWizard extends PromProjectWizard {

    override addPages(){
        super.addPages()
        
        modelFileExtension = "strl"
        modelFileInitialContentURL = "platform:/plugin/de.cau.cs.kieler.esterel.prom/resources/default.strl"
    }
    
}