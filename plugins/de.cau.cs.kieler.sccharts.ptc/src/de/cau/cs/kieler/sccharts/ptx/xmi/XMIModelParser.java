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
package de.cau.cs.kieler.sccharts.ptx.xmi;

import java.lang.reflect.Field;
import java.util.Stack;

import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelFactory;

/**
 * @author cmot
 *
 */
public class XMIModelParser {

    
    public static Element parse(String text) {
        
        long start = System.currentTimeMillis();
        
        int i1 =  text.indexOf("<?xml"); 
        int i2 =  text.indexOf("?>", i1);
        if (i1 < 0 || i2 < 0) {
            // Error
            return null;
        }
        text = text.substring(i2 + 2);

        Stack<Element> stack = new Stack<Element>();
        boolean type = false;
        boolean name = false;
        boolean value = false;  // is true after the first " 
        boolean beforeValue = false; // is true before the first "
        
        StringBuilder typePart = new StringBuilder();
        StringBuilder namePart = new StringBuilder();
        StringBuilder valuePart = new StringBuilder();
        StringBuilder contentPart = new StringBuilder();

        Attribute currentAttribute = null;

        char[] chars = null;

        // Field field = (Field) String.class.getField("value");
        Class<String> c = String.class;
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true); // bye-bye "private"

            // ALthough String.class.getField("value") throws a
            // NoSuchField exception, this way works, alas.
            if ("value" == f.getName()) {
                try {
                    chars = (char[]) f.get(text);
                } catch (Exception e) {
                    return null;
                }
                break;
            }
        }
        // Create surrounding dummy-element of type XMIModel
        Element model = createElement("XMIModel");
        stack.push(model);

        int len = chars.length;
        for (int i = 0; i < len; i++) {
            char character = chars[i];
            char nextCharacter = ' ';
            char lastCharacter = ' ';
            if (i < len-1) {
                nextCharacter = chars[i+1];
            }
            if (i > 0) {
                lastCharacter = chars[i-1];
            }
            boolean skip = false;
            // Start of element (expect start of element type)
            if (!skip && !type && !name && !value && character == '<' && nextCharacter != '/') {
                    type = true;
                    skip = true;
            }
            // End of element type (' ') or whole element ('>')
            if (!skip && type && (character == ' ' || character == '>')) {
                // End of type
                type = false;
                Element element = createElement(typePart.toString());
                typePart = new StringBuilder(); // Delete part for next time
                // Put as child to stack-element element which is the parent
                stack.peek().getChildren().add(element);
                // Remove any possible content
                stack.peek().setContent(null);
                stack.push(element);
                if (character == ' ') {
                    name = true; // Next is an attribute name
                } else {
                    contentPart = new StringBuilder(); // Delete part for next time
                }
                skip = true;
            }
            // End of element </... 
            if (!skip && !value && character == '<' && nextCharacter == '/' && lastCharacter != '\\') {
                if (contentPart.length() > 0) {
                    // Some free part was entered as 'child'
                    stack.peek().setContent(contentPart.toString());
                    contentPart = new StringBuilder(); // Delete part for next time
                }
                stack.pop();
                skip = true;
            }
            // End of element (single-lined)   ... />
            if (!skip && !value && character == '/' && nextCharacter == '>') {
                name = false; // Ended, no attribute name
                stack.pop();
                skip = true;
            }
            // End of attributes in element decl (no further name gathering)
            if (!skip && !value && name && character == '>') {
                name = false;
                contentPart = new StringBuilder(); // Delete part for next time
                skip = true;
            }
            // End of attribute name
            if (!skip && name && character == '=') {
                name = false;
                currentAttribute = createAttribute(namePart.toString().trim());
                namePart = new StringBuilder(); // Delete part for next time
                stack.peek().getAttributes().add(currentAttribute);
                beforeValue = true; // Next is attribute value
                skip = true;
            }
            // Now real value starts
            if (!skip && beforeValue && character == '\"') {
                beforeValue = false;
                value = true;
                skip = true;
            }
            // End of real value, do not be fooled if escaped strings
            if (!skip && value && character == '\"' && lastCharacter != '\\') {
                value = false;
                currentAttribute.setValue(valuePart.toString());
                valuePart = new StringBuilder(); // Delete part for next time
                name = true; // Next is another attribute name
                skip = true;
            }
            // Append
            if (!skip && type) {
                typePart.append(character);
            }
            if (!skip && name) {
                namePart.append(character);
            }
            if (!skip && value) {
                valuePart.append(character);
            }
            if (!skip && !name && !value && !type) {
                contentPart.append(character);
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println("XMIModel parsed in " + (end-start) + " Milliseconds.");
        
        return model;
    }

    // ------------------------------------------------------------------------
    private static Element createElement(String type) {
        Element element = XMIModelFactory.eINSTANCE.createElement();
        element.setType(type);
        return element;
    }

    private static Attribute createAttribute(String name) {
        Attribute attribute = XMIModelFactory.eINSTANCE.createAttribute();
        attribute.setName(name);
        return attribute;
    }
    
}
