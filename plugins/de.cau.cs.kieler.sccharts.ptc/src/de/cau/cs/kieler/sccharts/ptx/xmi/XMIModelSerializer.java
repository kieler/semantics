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

import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element;

/**
 * @author cmot
 *
 */
public class XMIModelSerializer {

    public static String serialize(Element model) {

        long start = System.currentTimeMillis();

        StringBuilder serialized = new StringBuilder();
        serialized.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        
        for (Element child : model.getChildren()) {
            serializeElement(child, serialized);
        }

        long end = System.currentTimeMillis();
        System.out.println("XMIModel serialized in " + (end-start) + " Milliseconds.");

        return serialized.toString();
    }
    
    
    
    public static void serializeElement(Element element, StringBuilder serialized) {
            // Serialize type
            serialized.append("<");
            serialized.append(element.getType());
            if (element.getAttributes() != null && element.getAttributes().size() > 0) {
                for (Attribute attribute : element.getAttributes()) {
                    serialized.append(" ");
                    serialized.append(attribute.getName());
                    serialized.append("=\"");
                    serialized.append(attribute.getValue());
                    serialized.append("\"");
                }
            }    
            // Serialize content or children
            if (element.getChildren().size() == 0 && element.getContent() != null && element.getContent().length() > 0) {
                serialized.append(">");
                // Content case
                serialized.append(element.getContent());
                serialized.append("</");
                serialized.append(element.getType());
                serialized.append("> ");
            } else if (element.getChildren().size() > 0) {
                serialized.append("> ");
                // Children case
                for (Element child : element.getChildren()) {
                    serializeElement(child, serialized);
                }
                serialized.append("</");
                serialized.append(element.getType());
                serialized.append("> ");
            } else {
                // Single line case
                serialized.append(" /> ");
            }
    }
    
}
