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
 * Helper methods for modifying SVG documents.
 * 
 * @author aas
 *
 */
class SVGExtensions {
    /**
     * Sets a field of an SVG attribute to a new value.
     * Consider the attribute "style" with the fields "fill-color:red;stroke-color:blue".
     * Using this method it is easy to change the fillColor or stroke color.
     * 
     * @param elem The svg element
     * @param attributeName The name of the attribute
     * @param fieldName The name of the field of the attribute
     * @param fieldValue The new value 
     */
    public def void setAttributeField(Element elem, String attributeName, String fieldName, String fieldValue) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeField(oldAttribute, fieldName, fieldValue)
        elem.setAttribute(attributeName, newAttribute)
    }

    /**
     * Sets the a function of an SVG attribute to a new value.
     * Consider the attribute "transform" with the function "translate(5,5)".
     * Using this method it is easy to change the translation.
     * 
     * @param elem The svg element
     * @param attributeName The name of the attribute
     * @param functionName The name of the function of the attribute
     * @param arguments The list of arguments for the function 
     */    
    public def void setAttributeFunction(Element elem, String attributeName, String functionName, String... arguments) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeFunction(oldAttribute, functionName, arguments)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    /**
     * Sets the text of an SVG element.
     * 
     * @param elem The svg element
     * @param text The new text
     */
    public def void setText(Element elem, String text) {
        val textNode = elem.findNodeOfType(Node.TEXT_NODE)
        if (textNode != null) {
            textNode.nodeValue = text
        } else {
            throw new Exception("Can't set text on element "+elem.nodeName+ ".\n"
                              + "It is not a text node itself and has no text node as child.")
        }
    }
    
    /**
     * Searches for a node of the given type.
     * If the given node itself is not of the desired type, its children are checked recursively.
     * 
     * @param node The node whose children are searched
     * @param nodeType The node type is searched for 
     */
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
    
    /**
     * Returns an attribute of a SVG node.
     * @param node The node
     * @param attributeName The name of the attribute
     */
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
    
    /**
     * Calculates the translation of an SVG node by checking its transform attribute.
     */
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
    
    /**
     * Calculates the absolute translation of an SVG node.
     * Therefore the translation of this node is considered as well as the translation of all its parent nodes.
     */
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
     * Returns a list filled with all child nodes of the given node, that match the node type.
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
    
    /**
     * Returns the children svg elements of the given node.
     * @return A list with all child SVG elements of the given node. 
     */
    public def List<Element> getChildrenElements(Node node, boolean includeRoot) {
        val children = getChildren(node, includeRoot, Node.ELEMENT_NODE)
        // Actually children is the correct return list, because nodes are filtered already using the nodeType.
        // However, we have to cast every element again for Java to accept the list as a List<Element>
        return children.map[it as Element]
    }
    
    /**
     * Changes a field in an attribute string.
     * 
     * @param attribute The current content of the attribute
     * @param fieldName The name of the field that should be changed
     * @param fieldValue The new value for the field
     */
    private def String changeField(String attribute, String fieldName, String fieldValue) {
        val newField = (fieldName + ":" + fieldValue + ";")
        // Replace the current field from the attribute. That is, replace everything from 'FIELD_NAME:' to ';'
        // In case the text is not the first attribute, the ending ';' of the previous attribute may not be removed.
        var newAttribute = attribute.replaceAll("^"+fieldName+":[^;]*[;]?", "")    // Replace from start to end of attribute
                                    .replaceAll(";"+fieldName+":[^;]*[;]?", ";");  // Replace from start after another attribute and still keep the end of the previous attribute
        if(!newAttribute.isNullOrEmpty && !newAttribute.endsWith(";")) {
            newAttribute += ";"    
        }
        newAttribute += newField
        return newAttribute
    }
    
    /**
     * Changes a function in an attribute string.
     * 
     * @param attribute The current content of the attribute
     * @param functionName The name of the field that should be changed
     * @param arguments The new arguments for the function
     */
    private def String changeFunction(String attribute, String functionName, String... arguments) {
        val newFunction = (functionName + "(" + arguments.join(",") + ")")
        // Replace the current function from the attribute. That is, replace everything from 'FUNCTION_NAME(' to ')'
        var newAttribute = attribute.replaceAll(functionName+"\\([^\\)]*\\)", "");
        newAttribute += newFunction
        return newAttribute
    }
    
    /**
     * Adds an event listener to the element.
     * 
     * @param elem The DOM Element that should be observed for events
     * @param eventType The DOM event type. That is one of "click", "mousedown", "mouseup", "mouseover", "mouseout"
     * @param listener The event listener that is called when the even occurs
     */
    public def void addListener(Element elem, String eventType, EventListener listener) {
        val eventTarget = elem as EventTarget
        eventTarget.addEventListener(eventType, listener, false)
    }
    
    /**
     * Removes an event listener from an element.
     *  
     * @param elem The element holding the event listener
     * @param eventType The event type. That is one of "click", "mousedown", "mouseup", "mouseover", "mouseout"
     * @param listener The event listener that should be removed
     */
    public def void removeListener(Element elem, String eventType, EventListener listener) {
        val eventTarget = elem as EventTarget
        eventTarget.removeEventListener(eventType, listener, false)
    }
    
    /**
     * Adds a click listener to the SVG element.
     * 
     * @param elem The DOM Element that should be observed for events
     * @param listener The event listener that is called when the even occurs
     */
    public def void addClickListener(Element elem, EventListener listener) {
        elem.addListener("click", listener)
    }
}