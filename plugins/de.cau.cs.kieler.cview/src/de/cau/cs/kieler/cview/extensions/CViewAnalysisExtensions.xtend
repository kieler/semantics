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
package de.cau.cs.kieler.cview.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit

/**
 * Basic commonly usable analysis functionality, e.g., (struct) type dependencies.
 * 
 * @author cmot
 * 
 */
class CViewAnalysisExtensions {

    // static final String  
    @Inject
    extension CViewModelExtensions

    // -------------------------------------------------------------------------
    // Print to C view console    
    def printConsole(String text) {
        CViewPlugin.printConsole(text)
    }

    // Print to C view console    
    def printlnConsole(String text) {
        CViewPlugin.printlnConsole(text)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    def IASTTranslationUnit getAST(Component component) {
        return CViewPlugin.getFileAST(component.location)
    }

    // ------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    def String removeCommentsAll(String text) {
        return text.removeCommentsComplex.removeCommentsSimple
    }

    def String removeCommentsSimple(String text) {
        if (text == null) {
            return null
        }
        var returnString = ""
        var found = true
        var comment = false // indicates an active comment
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
            } else {
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
        var comment = false // indicates an active comment
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
            } else {
                // Append the rest
                returnString += text.substring(startIndex)
            }
        }
        return returnString
    }

    // ------------------------------------------------------------------------
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

    // ------------------------------------------------------------------------
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
        if (!startsWith && !endsWith) {
            if (caseSensitive) {
                returnList.addAll(model.components.filter[name.contains(searchString)].toList)
            } else {
                returnList.addAll(model.components.filter[name.toUpperCase.contains(searchString.toUpperCase)].toList)
            }
        } else if (startsWith && endsWith) {
            if (caseSensitive) {
                returnList.addAll(model.components.filter[name.equals(searchString)].toList)
            } else {
                returnList.addAll(model.components.filter[name.toUpperCase.equals(searchString.toUpperCase)].toList)
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
    // Get the containing struct iff a declaration inside a struct, or null otherwise
    def Component getContainingStruct(Component declComponent) {
        if (declComponent.decl) {
            return declComponent.parent
        }
        return null
    }

    def String getTypeNameFromDecl(Component declComponent) {
        val typeDef = declComponent.typedefFromDecl
        if (typeDef == null) {
            return "PRIMITIVE"
        } else {
            return typeDef.name
        }
    }

    // Get the type of a declaration iff this is a typdef or null otherwise (e.g., if base type or not a declaration)
    def Component getTypedefFromDecl(Component declComponent) {
        if (declComponent.decl) {
            if (declComponent.reference != null) {
                if (declComponent.reference.typedef) {
                    return declComponent.reference
                }
            }
        }
        return null
    }

    // Get the struct of a typedef iff any, or null otherwise (e.g., if not a typedef)
    def Component getStructFromTypedef(Component typedefComponent) {
        if (typedefComponent.typedef) {
            if (typedefComponent.reference != null) {
                if (typedefComponent.reference.struct) {
                    return typedefComponent.reference
                }
            }
        }
        return null
    }

    // Get a list of declarations inside a struct, return an empty list if not a struct or no declarations
    def List<Component> getDeclsFromStruct(Component structComponent) {
        if (structComponent.struct) {
            if (!structComponent.children.nullOrEmpty) {
                val ArrayList<Component> returnList = new ArrayList
                for (child : structComponent.children) {
                    if (child.decl) {
                        returnList.add(child)
                    }
                }
                return returnList
            }
        }
        return new ArrayList<Component>
    }

    // Check if a component is connected to any other component
    def boolean isConnectedTo(
        Component componentSrc,
        Component componentDest,
        boolean considerChildren,
        boolean considerReferences,
        boolean considerConnections
    ) {
        if (componentSrc == componentDest) {
            // A component is defined to be always "connected" to itself 
            return true
        }
        if (considerChildren) {
            if (componentSrc.children.contains(componentDest)) {
                return true
            } else {
                for (child : componentSrc.children) {
                    if (child.isConnectedTo(componentDest, considerChildren, considerReferences, considerConnections)) {
                        return true
                    }
                }
            }
        }
        if (considerReferences) {
            if (componentSrc.reference != null) {
                if (componentSrc.reference == componentDest) {
                    return true
                }
                if (componentSrc.reference.isConnectedTo(componentDest, considerChildren, considerReferences,
                    considerConnections)) {
                    return true
                }
            }
        }
        if (considerConnections) {
            if (!componentSrc.outgoingConnections.nullOrEmpty) {
                for (connection : componentSrc.outgoingConnections) {
                    if (connection.dst.isConnectedTo(componentDest, considerChildren, considerReferences,
                        considerConnections)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    // Return a list of all connected components
    def List<Component> getAllConnectedComponents(
        CViewModel model,
        Component camComponent,
        boolean considerChildren,
        boolean considerReferences,
        boolean considerConnections
    ) {
        return model.components.filter [ e |
            e.isConnectedTo(camComponent, considerChildren, considerReferences, considerConnections)
        ].toList
    }

    def List<Component> getTypedefUsedBy(Component structComponent) {
        return structComponent.model.components.filter[e|e.reference == structComponent].toList
    }

    def List<Component> getDeclUsedBy(Component typedefComponent) {
        return typedefComponent.model.components.filter[e|e.reference == typedefComponent].toList
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    def List<String> copyList(List<String> list) {
        val ArrayList<String> returnList = new ArrayList
        for (element : list) {
            returnList.add(element)
        }
        return returnList
    }

    def boolean foundSegmentPath(Component component, List<String> remainingSegments) {
        if (remainingSegments.nullOrEmpty) {
            // End of recursion here
            return true
        }
        // Otherwise, a next segment exists => Check it!        
        var nextRemainingSegments = remainingSegments.copyList;
        var nextSegment = nextRemainingSegments.remove(0)

        if (nextSegment.equals(component.name)) {
            // Remove this and continue
            nextSegment = nextRemainingSegments.remove(0)
        }

        var currentComponent = component
        // Check all possible
        if (currentComponent.isDecl) {
            val typedef = currentComponent.typedefFromDecl
            if (typedef == null) {
                // We are SURE that it does not match
                return false
            }
            // yes, this is not a pure value but a typedef, find its struct
            val struct = typedef.structFromTypedef
            if (struct == null) {
                // We are SURE that it does not match
                return false
            }
            currentComponent = struct
//           // check if struct matches nextSegment
//           if (!struct.name.equals(nextSegment)) {
//                // We are SURE that it does not match
//                 return false
//             }
//            // Here we know that the struct maches, so continue recusion
//                return struct.foundSegmentPath(nextRemainingSegments)
        }

        if (currentComponent.isStruct) {
            // Check all possible children
//            val struct = currentComponent.getStruct
//            if (struct == null) {
//               // We are SURE that it does not match
//               return false
//            }
            // Any of the declarations must match
            var foundValidDeclaration = false
            for (decl : currentComponent.declsFromStruct) {
                if (decl.name.equals(nextSegment)) {
                    foundValidDeclaration = decl.foundSegmentPath(nextRemainingSegments)
                }
            }
            return foundValidDeclaration;
        }
        return false
    }

    public static final val int TYPE_VALID_SURE = 1
    public static final val int TYPE_VALID_UNSURE = -1
    public static final val int TYPE_VALID_NOT = 0

    def int isValidType(Component anyComponent, String typePath) {
        val model = anyComponent.cViewModel
        return model.isValidType(typePath)
    }

    def int isValidType(CViewModel model, String typePath) {
        var typePathUnified = typePath.replace("->", ".")
        if (!typePathUnified.contains(".")) {
            typePathUnified = typePathUnified + '''.'''
        }
        val typePathSegments = typePathUnified.split("\\.")
        if (!typePathSegments.nullOrEmpty) {
            val firstSegment = typePathSegments.get(0)
            val firstSegmentComponents = model.findByName(firstSegment)
            if (typePathSegments.size > 1) {
                // Can be sure or not valid
                var foundvalidSegment = false
                for (segmentComponent : firstSegmentComponents) {
                    if (!foundvalidSegment && segmentComponent.foundSegmentPath(typePathSegments)) {
                        foundvalidSegment = true
                    }
                }
                if (foundvalidSegment) {
                    return TYPE_VALID_SURE
                }
                return TYPE_VALID_NOT
            } else {
                // Can only be unsure or not valid
                if (!firstSegmentComponents.nullOrEmpty) {
                    return TYPE_VALID_UNSURE
                } else {
                    return TYPE_VALID_NOT
                }
            }
        }
        return TYPE_VALID_NOT
    }

    // -------------------------------------------------------------------------
    /**
     * Get all connection components of a component as an unordered set of components. Consider
     * parents, children, and an optional filter of connection types.
     */
    def Set<Component> getConnectedComponents(
        Component component,
        boolean considerParent,
        boolean considerChildren,
        boolean reverseSearch,
        String[] filterConnectionTypes
    ) {
        val HashSet<Component> result = new HashSet
        result.getConnectedComponents(component, considerParent, considerChildren, reverseSearch, filterConnectionTypes)
        CViewPlugin.printlnConsole("#######################################")
        CViewPlugin.printlnConsole("# getConnectedComponents(" + component.name + ")")
        CViewPlugin.printlnConsole("############")
        for (resultItem : result) {
            CViewPlugin.printlnConsole(" - " + resultItem.name)
        }
        CViewPlugin.printlnConsole("############")
        return result
    }

    def Set<Component> getConnectedComponents(
        HashSet<Component> result,
        Component component,
        boolean considerParent,
        boolean considerChildren,
        boolean reverseSearch,
        String[] filterConnectionTypes
    ) {

        if (result.contains(component)) {
            // Recursion end - we have visited this node before, return an empty list
            // to be more efficient
            val HashSet<Component> emptyHashSet = new HashSet
            return emptyHashSet
        }
        // Component is not already added, so add it now
        result.add(component)
        // Add parent 
        if (considerParent) {
            result.addAll(
                result.getConnectedComponents(component.parent, considerParent, considerChildren, reverseSearch,
                    filterConnectionTypes))
        }
        // Add children
        if (considerChildren) {
            for (child : component.children) {
                result.addAll(result.getConnectedComponents(
                    child,
                    considerParent,
                    considerChildren,
                    reverseSearch,
                    filterConnectionTypes
                ))
            }
        }
        // Add connected components (thru outgoing connections)
        var List<Connection> furtherConnections = null
        if (!reverseSearch) {
            furtherConnections = component.outgoingConnections
        } else {
            furtherConnections = component.incomingConnections
        }
        for (connection : furtherConnections) {
            if (!filterConnectionTypes.nullOrEmpty) {
                // Additionally filter
                var allowedByFilter = false
                for (filter : filterConnectionTypes) {
                    if (!allowedByFilter && filter.equals(connection.type)) {
                        allowedByFilter = true
                    }
                }
                if (allowedByFilter) {
                    result.addAll(
                        result.getConnectedComponents(connection.dst, considerParent, considerChildren, reverseSearch,
                            filterConnectionTypes)
                    )
                }
            } else {
                result.addAll(
                    result.getConnectedComponents(connection.dst, considerParent, considerChildren, reverseSearch,
                        filterConnectionTypes)
                )
            }
        }
        return result
    }

// -------------------------------------------------------------------------
}
