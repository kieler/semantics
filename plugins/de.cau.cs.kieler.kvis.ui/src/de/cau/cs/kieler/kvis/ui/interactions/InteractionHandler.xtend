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
package de.cau.cs.kieler.kvis.ui.interactions

import de.cau.cs.kieler.kvis.extensions.KVisExtensions
import de.cau.cs.kieler.kvis.kvis.DOMEvent
import de.cau.cs.kieler.kvis.kvis.Interaction
import de.cau.cs.kieler.kvis.ui.svg.SVGExtensions
import de.cau.cs.kieler.kvis.ui.views.KVisView
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import org.w3c.dom.events.EventListener
import org.w3c.dom.svg.SVGDocument
import org.w3c.dom.events.Event

/**
 * @author aas
 *
 */
class InteractionHandler {
    
    protected var Interaction interaction
    
    @Extension
    protected KVisExtensions kvisExtensions
    
    @Extension
    protected SVGExtensions svgExtensions
    
    private EventListener eventListener
    
    new(Interaction interaction){
        this.interaction = interaction
        // Initialize extension methods
        kvisExtensions = new KVisExtensions
        svgExtensions = new SVGExtensions
        // Initialize listeners
        initialize
    }
    
    private def void initialize() {
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
                    val listener = getEventListener
                    elem.addListener(eventType, listener)
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
        initialize()
        if(interaction.event == null) {
            performActions
        }
    }
    
    private def void performActions() {
        val pool = SimulationManager.instance?.currentPool
        if(pool != null && isActive(pool)) {
            for(action : interaction.actions) {
                action.perform(pool)
            }
        }
    }
    
    protected def boolean isActive(DataPool pool) {
        if(interaction.condition == null) {
            return true
        } else {
            return interaction.condition.eval(pool)
        }
    }
    
    private def SVGDocument getSVGDocument() {
         return KVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
    
    private def EventListener getEventListener() {
        if(eventListener == null) {
            eventListener = new EventListener() {
                override handleEvent(Event evt) {
                    println("Event '"+evt.type+"' on '"+interaction.event.element+"'")
                    performActions
                }
            }
        }
        return eventListener
    }
}