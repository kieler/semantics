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
    
    //------------------------------------------------------------------------

    def String removeCommentsAll(String text) {
        return text.removeCommentsComplex.removeCommentsSimple
    }

    def String removeCommentsSimple(String text) {
        if (text == null) {
            return null
        }
        var returnString = ""
        var found = true
        var comment = false  // indicates an active comment
        var startIndex = 0
        while (found) {
            found = false
            val endIndexNoComment = text.indexOf("//", startIndex)
            val endIndexComment = text.indexOf("\n", startIndex)
            if (endIndexNoComment > -1 && !comment) {
                found = true
                returnString += text.substring(startIndex, endIndexNoComment)
                comment = true
                startIndex = endIndexNoComment + 2
            } else if (endIndexComment > -1 && comment) {
                found = true
                comment = false
                startIndex = endIndexComment + 1
            }
            else {
                // Append the rest
                returnString += text.substring(startIndex)
            }
        } 
        return returnString 
    }
    
    def String removeCommentsComplex(String text) {
        if (text == null) {
            return null
        }
        var returnString = ""
        var found = true
        var comment = false  // indicates an active comment
        var startIndex = 0
        while (found) {
            found = false
            val endIndexNoComment = text.indexOf("/*", startIndex)
            val endIndexComment = text.indexOf("*/", startIndex)
            if (endIndexNoComment > -1 && !comment) {
                found = true
                returnString += text.substring(startIndex, endIndexNoComment)
                comment = true
                startIndex = endIndexNoComment + 2
            } else if (endIndexComment > -1 && comment) {
                found = true
                comment = false
                startIndex = endIndexComment + 2
            }
            else {
                // Append the rest
                returnString += text.substring(startIndex)
            }
        } 
        return returnString 
    }

    //------------------------------------------------------------------------

    def List<String> parseByKey(String text, String keyStart, String keyEnd, String[] filterChars, boolean trim) {
        val ArrayList<String> returnList = new ArrayList
        if (text == null) {
            return returnList
        }
        
        val items = text.split(keyStart);
        
        if (!items.nullOrEmpty) {
            for (item : items) {
                val endIndex = item.indexOf(keyEnd);
                if (endIndex > -1) {
                    var itemString = item.substring(0, endIndex);
                    if (trim) {
                        itemString = itemString.trim
                    }
                    if (!filterChars.nullOrEmpty) {
                        for (filterChar : filterChars) {
                            itemString = itemString.replace(filterChar, "");
                        }
                    }
                    returnList.add(itemString);
                }
            }
        }
        
        return returnList
    } 


    //------------------------------------------------------------------------
    
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

    def Set<Component> findByName(CViewModel model, String searchString) {
        return model.findName(searchString, true, false, false)
    }

    def Set<Component> findName(CViewModel model, String searchString, boolean caseSensitive) {
        return model.findName(searchString, caseSensitive, false, false)
    }

    def Set<Component> findByName(CViewModel model, String searchString, boolean startsWith, boolean endsWith) {
        return model.findName(searchString, true, startsWith, endsWith)
    }

    def Set<Component> findName(CViewModel model, String searchString, boolean caseSensitive, boolean startsWith,
        boolean endsWith) {
        val Set<Component> returnList = newHashSet
//        if (caseSensitive) {
//            returnList.addAll(model.components.filter[name.equals(searchString)].toList)
//        } else {
//            returnList.addAll(model.components.filter[name.toUpperCase.equals(searchString.toUpperCase)].toList)
//        }
        if (!startsWith && !endsWith) {
            if (caseSensitive) {
                returnList.addAll(model.components.filter[name.contains(searchString)].toList)
            } else {
                returnList.addAll(model.components.filter[name.toUpperCase.contains(searchString.toUpperCase)].toList)
            }
        } else {
            if (startsWith) {
                if (caseSensitive) {
                    returnList.addAll(model.components.filter[name.startsWith(searchString)].toList)
                } else {
                    returnList.addAll(
                        model.components.filter[name.toUpperCase.startsWith(searchString.toUpperCase)].toList)
                }
            }
            if (endsWith) {
                if (caseSensitive) {
                    returnList.addAll(model.components.filter[name.endsWith(searchString)].toList)
                } else {
                    returnList.addAll(
                        model.components.filter[name.toUpperCase.endsWith(searchString.toUpperCase)].toList)
                }
            }
        }
        return returnList
    }

    // -------------------------------------------------------------------------
    def boolean hieararchical(Component item) {
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

    def Component createReader() {
        return (CViewModelFactory.eINSTANCE.createComponent.setReader)
    }

    def Component createWriter() {
        return (CViewModelFactory.eINSTANCE.createComponent.setWriter)
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

    def boolean isReader(Component component) {
        return (component.type == ComponentType::READER)
    }

    def boolean isWriter(Component component) {
        return (component.type == ComponentType::WRITER)
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

    def Component setReader(Component component) {
        component.type = ComponentType::READER
        return component
    }

    def Component setWriter(Component component) {
        component.type = ComponentType::WRITER
        return component
    }

// -------------------------------------------------------------------------
}
