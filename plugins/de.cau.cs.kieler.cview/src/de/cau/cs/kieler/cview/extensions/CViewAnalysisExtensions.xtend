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

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.util.Set
import java.util.ArrayList
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.cview.CViewPlugin

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit

/**
 * Basic commonly usable analysis functionality, e.g., (struct) type dependencies.
 * 
 * @author cmot
 * 
 */
class CViewAnalysisExtensions {
    
    //static final String  

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

    //------------------------------------------------------------------------
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

    // Get the containing struct iff a declaration inside a struct, or null otherwise
    def Component getContainingStruct(Component declComponent) {
        if (declComponent.isDecl) {
            return declComponent.parent
        }
        return null
    }
    
    // Get the type of a delaration iff this is a typdef or null otherwise (e.g., if base type or not a declaration)
    def Component getTypedef(Component declComponent) {
        if (declComponent.isDecl) {
            if (declComponent.reference != null) {
                if (declComponent.reference.isTypedef) {
                    return declComponent.reference
                }
            }
        }
        return null
    }
    
    // Get the struct of a typedef iff any, or null otherwise (e.g., if not a typedef)
    def Component getStruct(Component typedefComponent) {
        if (typedefComponent.isTypedef) {
            if (typedefComponent.reference != null) {
                if (typedefComponent.reference.isStruct) {
                    return typedefComponent.reference
                }
            }
        }
        return null
    }
    
    // Get a list of declarations inside a struct, return an empty list if not a struct or no declarations
    def List<Component> getDeclarations(Component structComponent) {
        if (structComponent.isStruct) {
            if (!structComponent.children.nullOrEmpty) {
                val ArrayList<Component> returnList = new ArrayList
                for (child : structComponent.children) {
                    if (child.isDecl) {
                        returnList.add(child)
                    }
                }
                return returnList
            }
        } 
        return new ArrayList<Component>
    }
    

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    def List<String> copyList (List<String> list) {
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
            val typedef = currentComponent.getTypedef
            if (typedef == null) {
                    // We are SURE that it does not match
                    return false
            }
           // yes, this is not a pure value but a typedef, find its struct
           val struct = typedef.getStruct
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
            for (decl : currentComponent.declarations) {
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
    
}
