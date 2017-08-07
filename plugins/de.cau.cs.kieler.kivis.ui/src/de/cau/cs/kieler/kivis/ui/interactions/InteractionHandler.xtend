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
package de.cau.cs.kieler.kivis.ui.interactions

import de.cau.cs.kieler.kivis.extensions.KiVisExtensions
import de.cau.cs.kieler.kivis.kivis.DOMEvent
import de.cau.cs.kieler.kivis.kivis.Interaction
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions
import de.cau.cs.kieler.kivis.ui.views.KiVisView
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import org.w3c.dom.svg.SVGDocument

/**
 * @author aas
 *
 */
class InteractionHandler {
    
    protected var Interaction interaction
    
    protected static extension KiVisExtensions kivisExtensions = new KiVisExtensions
    protected static extension SVGExtensions svgExtensions = new SVGExtensions 
    
    new(Interaction interaction){
        this.interaction = interaction
        // Initialize listeners
        initializeListeners
    }
    
    private def void initializeListeners() {
        // Register event if listening for any
        val event = interaction.event 
        if(event != null) {
             val elem = SVGDocument?.getElementById(event.element)
             if(elem != null) {
                 var String eventType
                 switch(event.event) {
                     case DOMEvent.CLICK : eventType = "click"
                     case DOMEvent.MOUSEDOWN : eventType = "mousedown"
                     case DOMEvent.MOUSEUP : eventType = "mouseup"
                     case DOMEvent.MOUSEMOVE : eventType = "mousemove"
                     // The following events are not working in the JSVGCanvas
//                     case DOMEvent.DOUBLECLICK : eventType = "dblclick"
//                     case DOMEvent.MOUSEOVER : eventType = "mouseover"
//                     case DOMEvent.MOUSEOUT : eventType = "mouseout"
//                     case DOMEvent.MOUSELEAVE : eventType = "mouseleave"
//                     case DOMEvent.MOUSEENTER : eventType = "mouseenter"
                 }
                 
                 if(eventType != null) {
                    KiVisView.instance.createListenerForInteraction(this, elem, event.element, eventType)
                 } else {
                     throw new IllegalArgumentException("Event '"+event.event.getName+"' does not exist.")
                 }
             } else {
                 throw new IllegalArgumentException("Element with id '"+event.element+"' "
                                                  + "does not exist in the image.")
             }
        }
    }
    
    public def void apply(DataPool pool) {
        if(interaction.event == null) {
            performActions
        }
    }
    
    public def void performActions() {
        val pool = SimulationManager.instance?.currentPool
        if(pool != null && isActive(pool)) {
            for(action : interaction.actions) {
                action.perform(pool)
            }
        }
    }
    
    public def boolean isActive(DataPool pool) {
        if(pool == null) {
            return false
        }
        if(interaction.condition == null) {
            return true
        } else {
            return interaction.condition.eval(pool)
        }
    }
    
    private def SVGDocument getSVGDocument() {
         return KiVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
}