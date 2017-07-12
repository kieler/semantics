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
import org.eclipse.xtend.lib.annotations.Accessors
import static de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.getContainer
import static de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.setFBColor
import static de.cau.cs.kieler.kicool.ui.synthesis.ColorSystem.*
import de.cau.cs.kieler.kicool.ProcessorReference

/**
 * Class that handles on/off requests of users.
 * 
 * @author ssm
 * @kieler.design 2017-06-19 proposed 
 * @kieler.rating 2017-06-19 proposed yellow
 *
 */
class ToggleProcessorOnOffAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.toggleProcessorOnOffAction"
    
    @Accessors static val deactivatedProcessors = <ProcessorReference> newHashSet 
    
    override execute(ActionContext context) {
        val kNode = context.KNode
        
        val toggleOnOffData = kNode.getProperty(TOGGLE_ON_OFF_DATA)
        val processorReference = toggleOnOffData.processorReference
        
        if (deactivatedProcessors.contains(processorReference)) {
            deactivatedProcessors -= processorReference
            setFBColor(getContainer(kNode), ON)
        } else {
            deactivatedProcessors += processorReference
            setFBColor(getContainer(kNode), OFF)
        }
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}