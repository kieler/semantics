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
        // return (content as EObject).eResource.getURIFragment(content);
        return content.attributeByName("xmi:id")
    }

    def String getUmlType(Element content) {
        if (content.getXmiType.length > 3) {
            // return (content as EObject).eResource.getURIFragment(content);
            return content.getXmiType.substring(4)
        } else {
            return ""
        }
    }

    // -----------------------------------------------------------------
    /**
     * Get the parent state machine recursively
     */
    def Element getParentStateMachine(Element element) {
        if (element.parent == null) {
            return null
        }
        if(element.parent.isUMLStateMachine) {
            return element.parent
        }
        return element.parent.parentAnyState
        
    }

    // -----------------------------------------------------------------

    /**
     *  Get the parent state recursively
     */
    def Element getParentAnyState(Element element) {
        if (element.parent == null) {
            return null
        }
        if(element.parent.isUMLAnyState) {
            return element.parent
        }
        return element.parent.parentAnyState
    }

    // -----------------------------------------------------------------
    
    def boolean isUMLAnyState(Element element) {
        return (element.isUMLState || element.isUMLFinalState || element.isUMLPseudostate)
    }

    // -----------------------------------------------------------------

    def boolean isUMLSignalEvent(Element element) { 
        return (element.umlType == "SignalEvent")
    }

    def boolean isUMLStateMachine(Element element) { 
        return (element.umlType == "StateMachine")
    }

    def boolean isUMLRegion(Element element) { 
        return (element.umlType == "Region")
    }

    def boolean isUMLPseudostate(Element element) { 
        return (element.umlType == "Pseudostate")
    }

    def boolean isUMLFinalState(Element element) { 
        return (element.umlType == "FinalState")
    }

    def boolean isUMLState(Element element) { 
        return (element.umlType == "State")
    }

    def boolean isUMLActivity(Element element) { 
        return (element.umlType == "Activity")
    }

    def boolean isUMLTransition(Element element) { 
        return (element.umlType == "Transition")
    }

    def boolean isUMLTrigger(Element element) {
        return (element.umlType == "Trigger")
    }

    def boolean isUMLOpaqueBehavior(Element element) { 
        return (element.umlType == "OpaqueBehavior")
    }

    def boolean isUMLOpaqueExpression(Element element) { 
        return (element.umlType == "OpaqueExpression")
    }

    def boolean isUMLCallEvent(Element element) { 
        return (element.umlType == "CallEvent")
    }

    def boolean isUMLOperation(Element element) { 
        return (element.umlType == "Operation")
    }

    def boolean isUMLParameter(Element element) { 
        return (element.umlType == "Parameter")
    }

    def boolean isUMLProperty(Element element) { 
        return (element.umlType == "Property")
    }

    def boolean isUMLConnectionPointReference(Element element) { 
        return (element.umlType == "ConnectionPointReference")
    }

    // -----------------------------------------------------------------
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

    def String getOperation(Element content) {
        return content.attributeByName("operation")
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
    
   def String getSubmachine(Element content) {
        return content.attributeByName("submachine")
    }

}
