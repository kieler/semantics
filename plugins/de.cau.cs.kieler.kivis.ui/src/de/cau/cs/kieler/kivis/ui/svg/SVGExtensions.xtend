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
package de.cau.cs.kieler.kivis.ui.svg

import java.util.List
import org.apache.batik.dom.svg.SVGOMPoint
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.events.EventListener
import org.w3c.dom.events.EventTarget
import org.w3c.dom.svg.SVGPoint

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
    
    public def String getAttribute(Node node, String attributeName) {
        val attributes = node.attributes
        if(attributes != null) {
            for(var i = 0; i < attributes.length; i++) {
                val item = attributes.item(i) 
                if(item.nodeName == attributeName) {
                    return item.nodeValue
                }
            }
        }
        return null
    }
    
    public def SVGPoint getTranslation(Node node) {
        val transform = getAttribute(node, "transform")
        if(transform != null) {
            val translateIndex = transform.indexOf("translate")
            if(translateIndex >= 0) {
                val parameterList = transform.substring(translateIndex+"translate".length)
                val openIndex = parameterList.indexOf("(")
                val closeIndex = parameterList.indexOf(")")
                if(openIndex >= 0 && closeIndex >= 0) {
                    val parameters = parameterList.substring(openIndex+1, closeIndex)
                    val parametersArray = parameters.split("[\\s,]")
                    if(parametersArray.length >= 2) {
                        val x = Float.valueOf(parametersArray.get(0))
                        val y = Float.valueOf(parametersArray.get(1))
                        return new SVGOMPoint(x, y)
                    }
                }
            }
        }
        return new SVGOMPoint(0, 0)
    }
    
    public def SVGPoint getAbsoluteTranslation(Node node) {
        val pos = node.getTranslation
        var SVGPoint parentPos
        if(node.parentNode != null) {
            parentPos = node.parentNode.absoluteTranslation
            return new SVGOMPoint(pos.x + parentPos.x, pos.y + parentPos.y)
        }
        return new SVGOMPoint(pos.x, pos.y)
    }
    
    /**
     * Returns a list filled recursively with all child nodes of the given node, that fit with respect to nodeType.
     * If nodeType is negative, all children are included.
     * 
     * @param node The node
     * @param includeRoot True to include the node itself in the returned list
     * @param nodeType The type that nodes must have to be included in the returned list,
     *        or -1 to include all nodes.
     */
    public def List<Node> getChildren(Node node, boolean includeRoot, int nodeType) {
        val List<Node> elements = newArrayList
        if(includeRoot && (nodeType < 0 || node.nodeType == nodeType)) {
            elements.add(node)
        }
        val children = node.getChildNodes()
        if (children != null) {
            for(var i = 0; i < children.length; i++) {
                val child = children.item(i)
                if(nodeType < 0 || child.nodeType == nodeType) {
                    elements.add(child)
                }
                elements.addAll(child.getChildren(false, nodeType))
            }
        }
        return elements
    }
    
    public def List<Element> getChildrenElements(Node node, boolean includeRoot) {
        val children = getChildren(node, includeRoot, Node.ELEMENT_NODE)
        // Actually children is the correct return list, because nodes are filtered already using the nodeType.
        // However, we have to cast every element again for Java to accept the list as a List<Element>
        return children.map[it as Element]
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