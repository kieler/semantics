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
package de.cau.cs.kieler.sccharts.ptc.xmi

import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelFactory;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute;
import java.lang.reflect.Field
import java.util.Stack
import java.util.ArrayList

/**
 * @author cmot
 * 
 */
class XMIModelParser2 {
    
    private static Stack<Element> stack = new Stack()
    
    def public static Element parse(String text) {
        var boolean type = false
        var boolean name = false
        var boolean value = false  // is true after the first " 
        var boolean beforeValue = false // is true before the first " 
        
        var StringBuilder typePart = new StringBuilder()
        var StringBuilder namePart = new StringBuilder()
        var StringBuilder valuePart = new StringBuilder()

        var Attribute currentAttribute = null

        var char[] chars

        val c = text.getClass()
        var boolean done = false
        for (Field f : c.getDeclaredFields()) {
            if (!done) {
                f.setAccessible(true); // bye-bye "private"
                // ALthough String.class.getField("value") throws a
                // NoSuchField exception, this way works, alas.
                if ("value" == f.getName()) {
                    chars = f.get(text) as char[];
                    done = true
                }
            }
        }
        // Create surrounding dummy-element of type XMIModel
        var Element model = "XMIModel".createElement;
        stack.push(model)

        val len = chars.length;
        for (i : 0 ..< len) {
            val char character = chars.get(i)
            var char nextCharacter = ' '
            var char lastCharacter = ' '
            if (i < len-1) {
                nextCharacter = chars.get(i+1)
            }
            if (i > 0) {
                lastCharacter = chars.get(i-1)
            }
            var skip = false
            // Start of element (expect start of element type)
            if (!skip && !type && !name && !value) {
                if (character.equals('<')) {
                    type = true
                    skip = true
                }
            }
            // End of element type 
            if (!skip && type && character == ' ') {
                // End of type
                type = false
                val element = typePart.toString.createElement
                typePart = new StringBuilder() // Delete part for next time
                // Put as child to stack-element element which is the parent
                stack.peek.addChild(element)
                stack.push(element)
                name = true // Next is an attribute name
                skip = true
            }
            // End of element </... 
            if (!skip && !value && character == '<' && nextCharacter == "/") {
                stack.pop
                skip = true
            }
            // End of element (single-lined)   ... />
            if (!skip && !value && character == '/' && nextCharacter == '>') {
                stack.pop
                skip = true
            }
            // End of attribute name
            if (!skip && name && character == '=') {
                name = false
                currentAttribute = namePart.toString.trim.createAttribute
                namePart = new StringBuilder() // Delete part for next time
                stack.peek.addAttribute(currentAttribute)
                beforeValue = true // Next is attribute value
                skip = true
            }
            // Now real value starts
            if (!skip && beforeValue && character == "\"") {
                beforeValue = false
                value = true
                skip = true
            }
            // End of real value, do not be fooled if escaped strings
            if (!skip && value && character == "\"" && lastCharacter != '\\') {
                value = false
                currentAttribute.setValue2(valuePart.toString)
                valuePart = new StringBuilder() // Delete part for next time
                skip = true
            }
            // Append
            if (!skip && type) {
                typePart.append(character)
            }
            if (!skip && name) {
                typePart.append(name)
            }
            if (!skip && value) {
                typePart.append(value)
            }
        }
        return model
    }

    // ------------------------------------------------------------------------
    def static Element createElement(String type) {
        val element = XMIModelFactory.eINSTANCE.createElement
        element.type = type
        return element
    }

    def static Attribute createAttribute(String name) {
        val attribute = XMIModelFactory.eINSTANCE.createAttribute
        attribute.name = name
        return attribute
    }

    def static Attribute setValue2(
        Attribute attribute,
        String value
    ) {
        attribute.value = value
        return attribute
    }

    def static Attribute createAttribute(String name, String value) {
        return name.createAttribute().setValue2(value)
    }

    def static Element addAttribute(Element element, Attribute attribute) {
        element.attributes.add(attribute)
        return element
    }

    def static Element addChild(Element element, Element childElement) {
        element.children.add(childElement)
        return element
    }

// ------------------------------------------------------------------------
}
