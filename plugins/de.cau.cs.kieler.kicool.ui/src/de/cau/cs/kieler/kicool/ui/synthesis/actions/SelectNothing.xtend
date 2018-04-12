/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import de.cau.cs.kieler.klighd.IAction

import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.*

/**
 * Class that handles the intermediate model requests.
 * 
 * @author ssm
 * @kieler.design 2017-06-10 proposed 
 * @kieler.rating 2017-06-10 proposed yellow
 *
 */
class SelectNothing implements IAction {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectNothing"
    
    override execute(ActionContext context) {
        val intermediateData = context.KNode.getProperty(INTERMEDIATE_DATA)
        if (intermediateData !== null && intermediateData.view !== null) {
            intermediateData.view.editPartSystemManager.intermediateSelection = null
        }
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}