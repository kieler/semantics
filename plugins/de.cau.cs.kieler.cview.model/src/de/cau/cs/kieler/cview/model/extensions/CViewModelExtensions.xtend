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

/**
 * @author cmot
 * 
 */
class CViewModelExtensions {

    EObject getParent;
    
    def boolean hieararchical(Component item) {
        return !item.children.nullOrEmpty;
    }
    
    def int getDepth(Component item) {
        if (item.parent == null) {
            return 1;
        }
        else {
            return 1 + getDepth(item.parent)
        }
    }
    
    //-------------------------------------------------------------------------

    def Connection createConnection() {
        return (CViewModelFactory.eINSTANCE.createConnection)
    }

    def Connection connect(Component src, Component dst) {
        val connection = createConnection
        connection.src = src
        connection.dst = dst
        return connection
    }
    
    def Connection setLabel2(Connection connection, String label) {
        connection.label = label
        return connection   
    }

    //-------------------------------------------------------------------------
    
    def Component createFile() {
        return (CViewModelFactory.eINSTANCE.createComponent.setFile)
    }
    
    def Component createDir() {
        return (CViewModelFactory.eINSTANCE.createComponent.setDir)
    }

    def Component createFunc() {
        return (CViewModelFactory.eINSTANCE.createComponent.setFunc)
    }

    def Component createReader() {
        return (CViewModelFactory.eINSTANCE.createComponent.setReader)
    }

    def Component createWriter() {
        return (CViewModelFactory.eINSTANCE.createComponent.setWriter)
    }

    //-------------------------------------------------------------------------

    def boolean isFile(Component component) {
        return (component.type == ComponentType::FILE)
    }

    def boolean isDir(Component component) {
        return (component.type == ComponentType::DIR)
    }

    def boolean isFunc(Component component) {
        return (component.type == ComponentType::FUNC)
    }

    def boolean isReader(Component component) {
        return (component.type == ComponentType::READER)
    }

    def boolean isWriter(Component component) {
        return (component.type == ComponentType::WRITER)
    }

    //-------------------------------------------------------------------------

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

    def Component setReader(Component component) {
        component.type = ComponentType::READER
        return component
    }

    def Component setWriter(Component component) {
        component.type = ComponentType::WRITER
        return component
    }
    
    //-------------------------------------------------------------------------

}
