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
package de.cau.cs.kieler.cview.model.extensions

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.HashMap
import java.util.List
import java.util.ArrayList

/**
 * CView Model extensions define general and language independent extensions
 * that extend the CView meta model.
 * 
 * @author cmot
 * 
 */
class CViewModelExtensions {

    // ------------------------------------------------------------------------

    def List<String> copyList(List<String> list) {
        val ArrayList<String> returnList = new ArrayList
        for (element : list) {
            returnList.add(element)
        }
        return returnList
    }

    // ------------------------------------------------------------------------

    def boolean isResolved(Component component) {
        return (component.isReference && component.reference != null)
    }

    def boolean isReference(Component component) {
        return (component.referenceUnresolved != null)
    }

    def boolean hasParentContains(Component component, String parentNamePart) {
        if (component.parent == null) {
            return false
        }
        if (component.parent.name.contains(parentNamePart)) {
            return true
        }
        return component.parent.hasParentContains(parentNamePart)
    }

    def boolean hasParentStartsWith(Component component, String parentNamePart) {
        if (component.parent == null) {
            return false
        }
        if (component.parent.name.startsWith(parentNamePart)) {
            return true
        }
        return component.parent.hasParentStartsWith(parentNamePart)
    }

    def boolean hasParentEndsWith(Component component, String parentNamePart) {
        if (component.parent == null) {
            return false
        }
        if (component.parent.name.endsWith(parentNamePart)) {
            return true
        }
        return component.parent.hasParentEndsWith(parentNamePart)
    }

    def boolean hasParent(Component component, String parentName) {
        if (component.parent == null) {
            return false
        }
        if (component.parent.name.equals(parentName)) {
            return true
        }
        return component.parent.hasParent(parentName)
    }

    def Component rootComponent(Component component) {
        if (component.parent != null) {
            return rootComponent(component.parent)
        }
        return component
    }

    def CViewModel model(Component component) {
        return component.cViewModel
    }

    def CViewModel cViewModel(Component component) {
        val container = component.eContainer
        if (container instanceof CViewModel) {
            return container
        }
        return null
    }

    // ------------------------------------------------------------------------
    
    /**
     * Check whether this is a custom type.
     */
    def boolean isCustomType(Component component) {
        return (component.type == ComponentType::CUSTOM)
    }
    
    // ------------------------------------------------------------------------
    
//    /**
//     *  Check whether any concrete custom type applies to this component.
//     */
//    def boolean isCustomType(Component component, String[] customTypeIDs) {
//        if (!customTypeIDs.nullOrEmpty) {
//            for (String customTypeID : customTypeIDs) {
//                if (component.isCustomType(customTypeID)) {
//                    return true
//                }
//            }
//        }
//        return false
//    }

    // -------------------------------------------------------------------------
    def boolean hieararchical(Component item) {
            //return !item.children.filter[e|e.isFile || e.isDir || e.language ].nullOrEmpty;
        return !item.children.nullOrEmpty; 
    }

    def int getDepth(Component item) {
        if (item == null) {
            return 0;
        } else if (item.parent == null) {
            return 1;
        } else {
            return 1 + getDepth(item.parent)
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    def Connection createConnection() {
        return (CViewModelFactory.eINSTANCE.createConnection)
    }

    def Connection connectTo(Component src, Component dst) {
        val connection = createConnection
        connection.src = src
        connection.dst = dst
        return connection
    }

    def Connection setLabel2(Connection connection, String label) {
        connection.label = label
        return connection
    }

    def Connection setColor2(Connection connection, String color) {
        connection.color = color
        return connection
    }

    def Connection setType2(Connection connection, String type) {
        connection.type = type
        return connection
    }

    def Connection setDst2(Connection connection, Component dst) {
        connection.dst = dst
        return connection
    }

    def Connection setSrc2(Connection connection, Component src) {
        connection.src = src
        return connection
    }

    def Connection setTooltip2(Connection connection, String tooltip) {
        connection.tooltip = tooltip
        return connection
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    def Component createFile() {
        return (CViewModelFactory.eINSTANCE.createComponent.setFile)
    }

    def Component createDir() {
        return (CViewModelFactory.eINSTANCE.createComponent.setDir)
    }

    def Component createCustomType(String customTypeID) {
        return (CViewModelFactory.eINSTANCE.createComponent.setCustomType(customTypeID))
    }

    // -------------------------------------------------------------------------
    def boolean isFile(Component component) {
        return (component.type == ComponentType::FILE)
    }

    def boolean isDir(Component component) {
        return (component.type == ComponentType::DIR)
    }

    def boolean isCustomType(Component component, String customTypeID) {
        return (component.type == ComponentType::CUSTOM) && (component.customTypeID.equals(customTypeID))
    }

    // -------------------------------------------------------------------------
    def Component setFile(Component component) {
        component.type = ComponentType::FILE
        return component
    }

    def Component setDir(Component component) {
        component.type = ComponentType::DIR
        return component
    }

    def Component setCustomType(Component component, String customTypeID) {
        component.type = ComponentType::CUSTOM
        component.customTypeID = customTypeID
        return component
    }

// -------------------------------------------------------------------------
    val HashMap<Component, List<Connection>> cacheOutgoingConnections = new HashMap
    val HashMap<Component, List<Connection>> cacheIncomingConnections = new HashMap

    def void cacheResetOutgoingIncomingConnections() {
        cacheOutgoingConnections.clear
    }

    def List<Connection> getOutgoingConnections(Component component) {
        val cachedOutgoingConnections = cacheOutgoingConnections.get(component)
        if (cachedOutgoingConnections == null) {
            val outgoingConnections = component.model.connections.filter[e|e.src == component].toList
            cacheOutgoingConnections.put(component, outgoingConnections)
        }
        return cacheOutgoingConnections.get(component)
    }

    def List<Connection> getIncomingConnections(Component component) {
        val cachedOutgoingConnections = cacheIncomingConnections.get(component)
        if (cachedOutgoingConnections == null) {
            val outgoingConnections = component.model.connections.filter[e|e.dst == component].toList
            cacheIncomingConnections.put(component, outgoingConnections)
        }
        return cacheIncomingConnections.get(component)
    }

// -------------------------------------------------------------------------
}
