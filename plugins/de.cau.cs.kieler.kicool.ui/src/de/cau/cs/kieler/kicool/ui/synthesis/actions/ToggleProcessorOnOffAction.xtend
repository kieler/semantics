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

import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.*
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorSystem.*
import static de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.setFBColor

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
    
    @Accessors static val deactivatedProcessors = <ProcessorReference, OnOffToggle> newHashMap 
    
    override execute(ActionContext context) {
        val rendering = context.KRendering as KContainerRendering
        var EObject parent = rendering
        while (!(parent instanceof KNode)) {
            parent = parent.eContainer
        }
        val processorReference = (parent as KNode).getProperty(PROCESSOR_IDENTIFIER)
        
        if (!deactivatedProcessors.containsKey(processorReference)) {
            deactivatedProcessors.put(processorReference, OnOffToggle.ON)
        } 
        
        var toggle = deactivatedProcessors.get(processorReference)
        
        switch (toggle) {
            case ON: toggle = OnOffToggle.OFF 
            case OFF: toggle = OnOffToggle.HALT 
            case HALT:  toggle = OnOffToggle.ON
        }
        
        switch (toggle) {
            case ON: setFBColor(rendering.children.head, ON) 
            case OFF: setFBColor(rendering.children.head, OFF)
            case HALT: setFBColor(rendering.children.head, HALT)
        }

        deactivatedProcessors.put(processorReference, toggle)            
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}