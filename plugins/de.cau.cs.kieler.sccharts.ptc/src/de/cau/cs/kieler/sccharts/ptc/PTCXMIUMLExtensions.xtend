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
package de.cau.cs.kieler.sccharts.ptc

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ptx.xmi.XMIModelExtensions
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element

/**
 * @author cmot
 *
 */
class PTCXMIUMLExtensions {
    
    @Inject
    extension XMIModelExtensions
    
    // ------------------------------------------------------------------------
    
    // Getter for attributes
    
     def String getId(Element content) {
        //return (content as EObject).eResource.getURIFragment(content);
        return content.attributeByName("xmi:id")
    }
    
    def String getVisibility(Element content) {
        return content.attributeByName("visibility") 
    }
    def String getKind(Element content) {
        return content.attributeByName("kind") 
    }
    def String getSource(Element content) {
        return content.attributeByName("source") 
    }
    def String getTarget(Element content) {
        return content.attributeByName("target") 
    }
    def String getEvent(Element content) {
        return content.attributeByName("event") 
    }
    def String getBody(Element content) {
        return content.attributeByName("body") 
    }
    def String getConstrainedElement(Element content) {
        return content.attributeByName("constrainedElement") 
    }
    def String getGuard(Element content) {
        return content.attributeByName("guard") 
    }
    def String getRepresents(Element content) {
        return content.attributeByName("represents") 
    }
    def String getSendEvent(Element content) {
        return content.attributeByName("sendEvent") 
    }
    def String getReceiveEvent(Element content) {
        return content.attributeByName("receiveEvent") 
    }
    def String getCovered(Element content) {
        return content.attributeByName("covered") 
    }
    def String getDefaultValue(Element content) {
        return content.attributeByName("defaultValue") 
    }
    def String getAssociation(Element content) {
        return content.attributeByName("association") 
    }
    def String getIsReadOnly(Element content) {
        return content.attributeByName("isReadOnly") 
    }
    def String getValueAttribute(Element content) {
        return content.attributeByName("value") 
    }
    def String getTypeAttribute(Element content) {
        return content.attributeByName("type") 
    }
    
    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}