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
package de.cau.cs.kieler.cview.c.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.cview.c.CLanguage
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.util.List
import java.util.ArrayList
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.extensions.CViewLanguageExtensions

/**
 * CView Extensions for the C language. 
 * 
 * These extensions, e.g., define custom C types and getters and setters for them. 
 * 
 * @author cmot
 * 
 */
class CViewCExtensions {

    @Inject extension CViewModelExtensions

    @Inject extension CViewAnalysisExtensions

    @Inject extension CViewLanguageExtensions

    // -------------------------------------------------------------------------
    def Component createFunction() {
        return createCustomType(CLanguage.CUSTOMTYPE_FUNCTION)
    }

    def Component createFunctionRef() {
        return createCustomType(CLanguage.CUSTOMTYPE_FUNCTIONREF)
    }

    def Component createStruct() {
        return createCustomType(CLanguage.CUSTOMTYPE_STRUCT)
    }

    def Component createTypedef() {
        return createCustomType(CLanguage.CUSTOMTYPE_TYPEDEF)
    }

    def Component createDecl() {
        return createCustomType(CLanguage.CUSTOMTYPE_DECLARATION)
    }

    // -------------------------------------------------------------------------
    def boolean isFunction(Component component) {
        return (component.isCustomType(CLanguage.CUSTOMTYPE_FUNCTION))
    }

    def boolean isFunctionRef(Component component) {
        return (component.isCustomType(CLanguage.CUSTOMTYPE_FUNCTIONREF))
    }

    def boolean isStruct(Component component) {
        return (component.isCustomType(CLanguage.CUSTOMTYPE_STRUCT))
    }

    def boolean isTypedef(Component component) {
        return (component.isCustomType(CLanguage.CUSTOMTYPE_TYPEDEF))
    }

    def boolean isDecl(Component component) {
        return (component.isCustomType(CLanguage.CUSTOMTYPE_DECLARATION))
    }

    // -------------------------------------------------------------------------
    // Return the attached AST
    def IASTTranslationUnit getAST(Component component) {
        return CViewPlugin.getFileParsed(component.location) as IASTTranslationUnit
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

// -------------------------------------------------------------------------
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

// -------------------------------------------------------------------------
    public static final val int TYPE_VALID_SURE = 1
    public static final val int TYPE_VALID_UNSURE = -1
    public static final val int TYPE_VALID_NOT = 0

// -------------------------------------------------------------------------
    def int isValidType(Component anyComponent, String typePath) {
        val model = anyComponent.cViewModel
        return model.isValidType(typePath)
    }

// -------------------------------------------------------------------------
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

} // -------------------------------------------------------------------------
