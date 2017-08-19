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
package de.cau.cs.kieler.cview.c

import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.c.extensions.CViewCExtensions
import de.cau.cs.kieler.cview.hooks.ICViewLanguage
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.cview.extensions.CViewLanguageExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.c.CFileParser
import org.eclipse.cdt.core.dom.ast.IASTDeclaration
import org.eclipse.cdt.core.dom.ast.ASTVisitor
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import de.cau.cs.kieler.cview.CViewPlugin
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.ITypedef
import de.cau.cs.kieler.cview.c.extensions.CViewCDTExtensions
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import org.eclipse.cdt.core.dom.ast.ASTNodeProperty
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IFunction
import java.util.HashSet
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorIncludeStatement
import java.util.Set
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.cview.hooks.AbstractCViewLanguage
import org.eclipse.core.runtime.IProgressMonitor

/**
 * @author cmot
 * 
 */
class CLanguage extends AbstractCViewLanguage implements ICViewLanguage {

    @Inject extension CViewCExtensions

    @Inject extension CViewCDTExtensions

    @Inject extension CViewLanguageExtensions

    @Inject extension CViewModelExtensions

    @Inject extension CViewAnalysisExtensions

    public static String LANGUAGE_ID = "de.cau.cs.kieler.cview.c.language"

    public static String CUSTOMTYPE_TYPEDEF = "de.cau.cs.kieler.cview.c.customtype.typedef"
    public static String CUSTOMTYPE_DECLARATION = "de.cau.cs.kieler.cview.c.customtype.declaration"
    public static String CUSTOMTYPE_STRUCT = "de.cau.cs.kieler.cview.c.customtype.struct"

    public static String CUSTOMTYPE_FUNCTION = "de.cau.cs.kieler.cview.c.customtype.function"
    public static String CUSTOMTYPE_FUNCTIONREF = "de.cau.cs.kieler.cview.c.customtype.functionref"

    public static String CONNECTION_TYPE_REFERENCE_FUNC = "de.cau.cs.kieler.cview.c.connectiontype.func"
    public static String CONNECTION_TYPE_REFERENCE_TYPE = "de.cau.cs.kieler.cview.c.connectiontype.type"

    public static String CONNECTION_TYPE_INCLUSION = "de.cau.cs.kieler.cview.c.connectiontype.inclusion"

    static final String COLOR_STRUCT_NOREF = "#FFD236"
    static final String COLOR_STRUCT = "#FFF0BD"
    static final String COLOR_TYPEDEF = "#FCFF00"
    static final String COLOR_DECL = "#FEFFC1"

    public static final String FUNCTIONCOLORREF = "#D5EAFD"
    public static final String FUNCTIONCOLOR = "#82B5E3"
    public static final String FUNCTIONCOLORTRANS = "#286296"

    public static final SynthesisOption SHOW_FUNCTIONS = SynthesisOption.createCheckOption("Show Functions", false);
    public static final SynthesisOption SHOW_REFERENCES_FUNC = SynthesisOption.createCheckOption(
        "Show Function References", false);
    public static final SynthesisOption SHOW_TYPES = SynthesisOption.createCheckOption("Show Types", false);
    public static final SynthesisOption SHOW_REFERENCES_TYPE = SynthesisOption.createCheckOption("Show Type References",
        false);

    public static final SynthesisOption SHOW_INCLUSION = SynthesisOption.createCheckOption("Show Include", false);

    override diagramColor(Component component) {
        if (component.isFunction) {
            return FUNCTIONCOLOR
        } else if (component.isFunctionRef) {
            return FUNCTIONCOLORREF
        } else if (component.isTypedef) {
            return COLOR_TYPEDEF
        } else if (component.isDecl) {
            return COLOR_DECL
        } else if (component.reference == null) {
            return COLOR_STRUCT_NOREF
        } else {
            return COLOR_STRUCT
        }
    }

    override diagramIsHierarchical(Component component) {
        return true
    }

    override diagramLabel(Component component) {
        component.name
    }

    override diagramOpensInEditor(Component component) {
        return true
    }

    override diagramToolTip(Component component) {
        var String toolTypType = component.type.literal.toString
        if (toolTypType != null) {
            if (component.decl) {
                toolTypType = toolTypType + "  [" + component.getTypeNameFromDecl + "]";
            }
        }
        return toolTypType
    }

    override getId() {
        return LANGUAGE_ID
    }

    override diagramIsVisible(Component component) {
        return (((component.isTypedef || component.isDecl || component.isStruct) &&
            SHOW_TYPES.booleanValue) ||
            ((component.isFunction || component.isFunctionRef) && SHOW_FUNCTIONS.booleanValue))
    }

    override diagramSynthesisOptions() {
        return #[SHOW_FUNCTIONS, SHOW_REFERENCES_FUNC, SHOW_TYPES, SHOW_REFERENCES_TYPE, SHOW_INCLUSION]
    }

    override reparsingRequired() {
        return #{SHOW_FUNCTIONS,  SHOW_REFERENCES_FUNC,   SHOW_TYPES, SHOW_REFERENCES_TYPE, SHOW_INCLUSION}
    }

    override diagramHandleComponentCustomTypes() {
        return #{CUSTOMTYPE_FUNCTION, CUSTOMTYPE_FUNCTIONREF, CUSTOMTYPE_TYPEDEF, CUSTOMTYPE_DECLARATION,
            CUSTOMTYPE_STRUCT}
    }

    // =========================================================================
    // =========================================================================
    def extractTooltip(String data) {
        // TODO: Make this available as an extension point for other plugins to contribute
        val iStart1 = data.indexOf("/*");
        var iEnd1 = data.indexOf("*/", iStart1);

        val iStart2 = data.indexOf("/**");
        var iEnd2 = data.indexOf("*/", iStart2);

        var altTooltip1 = "";
        if (iStart1 > -1 && iEnd1 > -1 && iEnd1 > iStart1) {
            altTooltip1 = data.substring(iStart1, iEnd1 + 2);
        }

        var altTooltip2 = "";
        if (iStart2 > -1 && iEnd2 > -1 && iEnd2 > iStart2) {
            altTooltip2 = data.substring(iStart2, iEnd2 + 2);
        }

        if (altTooltip1.length > altTooltip2.length) {
            return altTooltip1
        }
        return altTooltip2
    }

    // ------------------------------------------------------------------------
    override Object parseFile(char[] fileContent) {
        return CFileParser.parse(fileContent);
    }

    override modelCreateFileSubComponents(CViewModel model, Component fileComponent, boolean parse) {
        val filePath = fileComponent.location
        println("praseCFile '" + filePath + "'")
        var content = fileComponent.fileRaw
        fileComponent.rawdata = String.valueOf(content)
        val tooltip = extractTooltip(fileComponent.rawdata)
        fileComponent.tooltip = tooltip

        if (parse) {
            val ast = fileComponent.AST

            val visitor = new ASTVisitor() {

                override int visit(IASTDeclaration declaration) {
                    CViewPlugin.printlnConsole("!!! IASTDeclaration !!!")
                    if (declaration instanceof IASTSimpleDeclaration) {
                        val astDecl = declaration as IASTSimpleDeclaration;
                        try {
                            CViewPlugin.printlnConsole(
                                "--- type: " + ast.getSyntax() + " (childs: " + ast.getChildren().length + ")")
                            var IASTNode typedef = if (astDecl.children.length == 1) {
                                    astDecl.children.get(0)
                                } else {
                                    astDecl.children.get(1)
                                }
                            CViewPlugin.printlnConsole("------- typedef: " + typedef);
                        } catch (Exception e) {
                        }
                    } // end if typedef
                    return 3
                }

                override int visit(IASTName name) {
                    val theName = name.toString
//                    CViewPlugin.printlnConsole("[" + theName + "]")
                    if (name.active) {
                        val binding = name.resolveBinding
                        if (name.definition) { // } || name.reference) {
                            if (binding instanceof ITypedef) {
                                // This binding is a typedef,
                                // fortunately referencing a struct
                                val type = binding.type
//                            CViewPlugin.printlnConsole("TYPEDEF " + theName + " >>> " + type)
                                val typeTypedefComponent = createTypedef
                                model.components.add(typeTypedefComponent)
                                typeTypedefComponent.name = name.toString
                                typeTypedefComponent.referenceLine = name.lineStart
                                typeTypedefComponent.referenceUnresolved = binding.type.toString
                                fileComponent.children.add(typeTypedefComponent)
                                typeTypedefComponent.parent = fileComponent
                            }
                            if (binding instanceof CPPClassType) {
                                val parent = name.parent
                                if (parent instanceof CPPASTCompositeTypeSpecifier) {
                                    val typeSpec = parent as CPPASTCompositeTypeSpecifier
                                    val typeSpecName = typeSpec.name
                                    val IASTDeclaration[] decls = typeSpec.members; // getDeclarations(false)
                                    ("STRUCT " + typeSpec.name + " : ").printConsole // [" + typeSpec.rawSignature + "]")
                                    val structComponent = createStruct
                                    model.components.add(structComponent)
                                    structComponent.name = typeSpec.name.toString
                                    structComponent.referenceLine = name.lineStart
                                    fileComponent.children.add(structComponent)
                                    structComponent.parent = fileComponent

                                    for (decl : decls) {
                                        val ASTNodeProperty prop = decl.propertyInParent
                                        val propName = prop.name.toString
                                        if (decl instanceof CPPASTSimpleDeclaration) {
                                            val declType = decl.getDeclSpecifier
                                            for (declarator : decl.declarators) {

                                                val declComponent = createDecl
                                                model.components.add(declComponent)
                                                declComponent.name = declarator.name.toString
                                                declComponent.referenceLine = name.lineStart
                                                declComponent.referenceUnresolved = declType.toString
                                                structComponent.children.add(declComponent)
                                                declComponent.parent = structComponent

                                                val declRawSig = decl.rawSignature
                                                val declName = declarator.name.toString
                                                CViewPlugin.printlnConsole("   o " + declName + " [" + declType + "]")
                                            }
                                        }
//                                    CViewPlugin.printlnConsole("   r " + decl.rawSignature)
                                    }
                                }

                            }
                        } // end if definition
                        if (binding instanceof IFunction) {
                            if (name.definition) {
                                val functionComponent = createFunction
                                // model.addToModel(functionComponent, monitor, fileComponent)
                                model.components.add(functionComponent)
                                functionComponent.name = name.toString()
                                functionComponent.referenceLine = name.lineStart
                                functionComponent.rawdata = "";
                                functionComponent.location = fileComponent.location
                                fileComponent.children.add(functionComponent)
                                functionComponent.parent = fileComponent
                            // System.out.println("- D " + name.toString() + " ")
                            } else if (name.reference) {
                                val functionRefComponent = createFunctionRef
                                functionRefComponent.referenceLine = name.lineStart
                                // model.addToModel(functionComponent, monitor, fileComponent)
                                model.components.add(functionRefComponent)
                                functionRefComponent.name = "" + name.toString() + "()"
                                fileComponent.children.add(functionRefComponent)
                                functionRefComponent.parent = fileComponent

                                // Only put the name of the referenced function as
                                // this may not resolvable yet, resolve later
                                functionRefComponent.referenceUnresolved = name.toString()
                            }
                        }
                    }
                    return ASTVisitor.PROCESS_CONTINUE
                }
            };
            visitor.shouldVisitNames = true
            ast.accept(visitor)

        } // end if parse
    }

    // =========================================================================
    // =========================================================================
    override fileExtensions() {
        return #{"c", "h"}
    }

    override provideConnections(CViewModel model, IProgressMonitor monitor) {
        val HashSet<Connection> returnSet = new HashSet
        if (SHOW_REFERENCES_FUNC.getBooleanValue) {
            // Add more (default-)connections that represent the references here
            for (component : model.components.filter[e|e.isFunctionRef && e.reference != null]) {
                if (monitor.canceled) {
                    return returnSet
                }
                val connection = component.connectTo(component.reference)
                connection.type = CONNECTION_TYPE_REFERENCE_FUNC
                // Func Ref
                connection.color = FUNCTIONCOLORTRANS
                connection.tooltip = component.reference.name + "  from  " + component.reference.parent.name
                returnSet.add(connection)
            }
        }
        if (SHOW_REFERENCES_TYPE.getBooleanValue) {
            // Add more (default-)connections that represent the references here
            for (component : model.components.filter[e|e.reference != null]) {
                if (monitor.canceled) {
                    return returnSet
                }
                val connection = component.connectTo(component.reference)
                connection.type = CONNECTION_TYPE_REFERENCE_TYPE
                if (component.isDecl || component.isStruct || component.isTypedef) {
                    // Struct, Decl, Typedef
                    connection.color = "#FFD236"
                    connection.tooltip = component.reference.name + "  from  " + component.reference.parent.name
                    returnSet.add(connection)
                }
            }
        }
        if (SHOW_INCLUSION.getBooleanValue) {
            for (component : model.components) {
                if (component.isFile && component.isFileHandled(fileExtensions())) {
                    val ast = component.AST
                    if (ast != null) {
                        for (include : ast.translationUnit.includeDirectives) {
                            val includedComponents = model.getComponentByIncludePath(include.name.toString)
                            for (includedComponent : includedComponents) {
                                if (monitor.canceled) {
                                    return returnSet
                                }
                                val connection = component.connectTo(includedComponent)
                                connection.color = "#00D200"
                                connection.tooltip = include.name.toString
                                returnSet.add(connection)
                            }
                            printlnConsole("INFO: Inclusion '" + include.name + "'")
                        }
                    }
                }
            }
        }

        return returnSet

    }

    // -------------------------------------------------------------------------
    def boolean matchesInclusionPath(Component component, String path) {
        var path2 = path.replace("..", "")
        path2 = path2.replace("\\", "/")
        val segments = path.split("/")
        val List<String> segments2 = new LinkedList(segments);
        if (!segments.nullOrEmpty) {
            return component.matchesInclusionPath(segments2.toList)
        }
        return false
    }

    def boolean matchesInclusionPath(Component component, List<String> pathSegments) {
        if (pathSegments == null || pathSegments.last == ".." || pathSegments.last == ".") {
            return true
        }
        if (!pathSegments.last.matches(component.name)) {
            return false
        }
        if (component.parent == null && pathSegments.size > 1) {
            return false
        }
        
        pathSegments.remove(pathSegments.size-1)
        if (pathSegments.size == 0) {
            return true
        }
        return component.parent.matchesInclusionPath(pathSegments)
    }

    def Set<Component> getComponentByIncludePath(CViewModel model, String path) {
        val Set<Component> returnSet = new HashSet
        for (component : model.components) {
            if (component.matchesInclusionPath(path)) {
                returnSet.add(component)
            }
        }
        return returnSet
    }

// -------------------------------------------------------------------------
}
