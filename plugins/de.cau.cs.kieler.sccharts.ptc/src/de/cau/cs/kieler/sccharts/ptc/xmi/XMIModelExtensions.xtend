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
package de.cau.cs.kieler.sccharts.ptc.xmi

import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element

/**
 * @author cmot
 *
 */
class XMIModelExtensions {
    
    def Element root(Element element) {
        if (element.parent == null) {
            return element
        }
        return element.parent.root
    }
    
    def Element parent(Element element) {
        if (element.eContainer != null) {
            return (element.eContainer as Element)
        }
        return null    
    }
    
    def String name(Element content) {
        return content.attributeByName("name")
    }
    
    def String getXmiId(Element content) {
        //return (content as EObject).eResource.getURIFragment(content);
        return content.attributeByName("xmi:id")
    }
    
    def String getXmiType(Element content) {
        return content.attributeByName("xmi:type") 
    }


    def String attributeByName(Element content, String attributeName) {
        for (attribute : content.attributes) {
            if (attribute.name == attributeName) {
                return attribute.value as String
            }
        }
        return "";
    }    
    
    def boolean exitstAttributeByName(Element content, String attributeName) {
        for (attribute : content.attributes) {
            if (attribute.name == attributeName) {
                return true
            }
        }
        return false
    }    
    
}