/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scl.ui.synthesis

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.klighd.KlighdDataManager

/**
 * Configuration of KLighD with all registrations for this bundle to work.
 * 
 * @author nre
 */
class SCLKlighdSetup implements IKlighdStartupHook {
    
    override execute() {
        KlighdDataManager.instance
            .registerDiagramSynthesisClass("de.cau.cs.kieler.SCLGraphSynthesis", SCLSynthesis)
    }
    
}