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

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.util.Set
import java.util.ArrayList
import java.util.HashSet
import java.util.HashMap

/**
 * @author cmot
 * 
 */
class CViewModelExtensions {

    EObject getParent;
    
    //------------------------------------------------------------------------
    
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

    //------------------------------------------------------------------------


    // -------------------------------------------------------------------------

    def boolean hieararchical(Component item, boolean functions, boolean types) {
        if (functions && types) {
            return !item.children.nullOrEmpty;
        } else if (functions) {
            return !item.children.filter[e | e.isFile || e.isDir || e.isFunc].nullOrEmpty;
        } else if (types) {
            return !item.children.filter[e | e.isFile || e.isDir || e.isTypedef || e.isDecl || e.isStruct].nullOrEmpty;
        }
        return !item.children.filter[e | e.isFile || e.isDir].nullOrEmpty;
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

    def Component createFunc() {
        return (CViewModelFactory.eINSTANCE.createComponent.setFunc)
    }

    def Component createStruct() {
        return (CViewModelFactory.eINSTANCE.createComponent.setStruct)
    }

    def Component createTypedef() {
        return (CViewModelFactory.eINSTANCE.createComponent.setTypedef)
    }

    def Component createDecl() {
        return (CViewModelFactory.eINSTANCE.createComponent.setDecl)
    }

    // -------------------------------------------------------------------------
    def boolean isFile(Component component) {
        return (component.type == ComponentType::FILE)
    }

    def boolean isDir(Component component) {
        return (component.type == ComponentType::DIR)
    }

    def boolean isFunc(Component component) {
        return (component.type == ComponentType::FUNC)
    }

    def boolean isStruct(Component component) {
        return (component.type == ComponentType::STRUCT)
    }

    def boolean isTypedef(Component component) {
        return (component.type == ComponentType::TYPEDEF)
    }

    def boolean isDecl(Component component) {
        return (component.type == ComponentType::DECL)
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

    def Component setFunc(Component component) {
        component.type = ComponentType::FUNC
        return component
    }

    def Component setStruct(Component component) {
        component.type = ComponentType::STRUCT
        return component
    }

    def Component setTypedef(Component component) {
        component.type = ComponentType::TYPEDEF
        return component
    }

    def Component setDecl(Component component) {
        component.type = ComponentType::DECL
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
           val outgoingConnections = component.model.connections.filter[e | e.src == component].toList
           cacheOutgoingConnections.put(component, outgoingConnections)
       }
       return cacheOutgoingConnections.get(component)      
    }

    def List<Connection> getIncomingConnections(Component component) {
       val cachedOutgoingConnections = cacheIncomingConnections.get(component)
       if (cachedOutgoingConnections == null) {
           val outgoingConnections = component.model.connections.filter[e | e.dst == component].toList
           cacheIncomingConnections.put(component, outgoingConnections)
       }
       return cacheIncomingConnections.get(component)      
    }

// -------------------------------------------------------------------------
}
