/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kvis.ui.svg

import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.events.EventListener
import org.w3c.dom.events.EventTarget

/**
 * @author aas
 *
 */
class SVGExtensions {
    public def void setAttributeField(Element elem, String attributeName, String fieldName, String fieldValue) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeField(oldAttribute, fieldName, fieldValue)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    public def void setAttributeFunction(Element elem, String attributeName, String functionName, String... arguments) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeFunction(oldAttribute, functionName, arguments)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    public def void setText(Element elem, String text) {
        val textNode = elem.findNodeOfType(Node.TEXT_NODE)
        if (textNode != null) {
            textNode.nodeValue = text
        } else {
            throw new Exception("Can't set text on element "+elem.nodeName+ ".\n"
                              + "It is not a text node itself and has no text node as child.")
        }
    }
    
    public def Node findNodeOfType(Node node, int nodeType) {
        if(node.nodeType == nodeType) {
            return node
        } else {
            val children = node.getChildNodes()
            if (children != null) {
                for(var i = 0; i < children.length; i++) {
                    val child = children.item(i)
                    val textNode = child.findNodeOfType(nodeType)
                    if(textNode != null) {
                        return textNode
                    }                    
                }    
            }
        }
        return null
    }
    
    public def String changeField(String attribute, String fieldName, String fieldValue) {
        val newField = (fieldName + ":" + fieldValue + ";")
        // Replace the current field from the attribute. That is, replace everything from 'FIELD_NAME:' to ';'
//        println("old:"+attribute)
        var newAttribute = attribute.replaceAll(fieldName+":[^;]*[;]?", "");
        if(!newAttribute.isNullOrEmpty && !newAttribute.endsWith(";")) {
            newAttribute += ";"    
        }
        newAttribute += newField
//        println("new:"+newAttribute)
        return newAttribute
    }
    
    public def String changeFunction(String attribute, String functionName, String... arguments) {
        val newFunction = (functionName + "(" + arguments.join(",") + ")")
        // Replace the current function from the attribute. That is, replace everything from 'FUNCTION_NAME(' to ')'
//        println("old:"+attribute)
        var newAttribute = attribute.replaceAll(functionName+"\\([^\\)]*\\)", "");
        newAttribute += newFunction
//        println("new:"+newAttribute)
        return newAttribute
    }
    
    /**
     * Adds an event listener to the element.
     * @param elem The DOM Element that should be observed for events
     * @param eventType The DOM event type. That is one of "click", "mousedown", "mouseup", "mouseover", "mouseout"
     * @param listener The event listener that is called when the even occurs
     */
    public def void addListener(Element elem, String eventType, EventListener listener) {
        val eventTarget = elem as EventTarget
        eventTarget.addEventListener(eventType, listener, false)
    }
    
    /**
     * Removes a listener from an element.
     */
    public def void removeListener(Element elem, String eventType, EventListener listener) {
        val eventTarget = elem as EventTarget
        eventTarget.removeEventListener(eventType, listener, false)
    }
    
    /**
     * Adds a click listener to the DOM element.
     */
    public def void addClickListener(Element elem, EventListener listener) {
        elem.addListener("click", listener)
    }
}