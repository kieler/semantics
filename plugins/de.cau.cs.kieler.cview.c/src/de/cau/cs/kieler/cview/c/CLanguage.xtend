/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.c

import com.google.inject.Inject
import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.c.extensions.CViewCDTExtensions
import de.cau.cs.kieler.cview.c.extensions.CViewCExtensions
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import de.cau.cs.kieler.cview.extensions.CViewLanguageExtensions
import de.cau.cs.kieler.cview.hooks.AbstractCViewLanguage
import de.cau.cs.kieler.cview.hooks.ICViewLanguage
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import de.cau.cs.kieler.klighd.SynthesisOption
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.cdt.core.dom.ast.ASTNodeProperty
import org.eclipse.cdt.core.dom.ast.ASTVisitor
import org.eclipse.cdt.core.dom.ast.IASTDeclaration
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IFunction
import org.eclipse.cdt.core.dom.ast.ITypedef
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.cdt.core.dom.ast.IScope
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTFunctionDefinition
import java.util.HashMap
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTFunctionCallExpression
import org.eclipse.core.resources.IFile

/**
 * @author cmot
 * 
 */
class CLanguage extends AbstractCViewLanguage implements ICViewLanguage {

    // Extensions
    @Inject extension CViewCExtensions
    @Inject extension CViewCDTExtensions
    @Inject extension CViewLanguageExtensions
    @Inject extension CViewModelExtensions
    @Inject extension CViewAnalysisExtensions

    // IDs
    public static String LANGUAGE_ID = "de.cau.cs.kieler.cview.c.language"
    public static String CUSTOMTYPE_TYPEDEF = "de.cau.cs.kieler.cview.c.customtype.typedef"
    public static String CUSTOMTYPE_DECLARATION = "de.cau.cs.kieler.cview.c.customtype.declaration"
    public static String CUSTOMTYPE_STRUCT = "de.cau.cs.kieler.cview.c.customtype.struct"
    public static String CUSTOMTYPE_FUNCTION = "de.cau.cs.kieler.cview.c.customtype.function"
    public static String CUSTOMTYPE_FUNCTIONREF = "de.cau.cs.kieler.cview.c.customtype.functionref"
    public static String CONNECTION_TYPE_REFERENCE_FUNC = "de.cau.cs.kieler.cview.c.connectiontype.func"
    public static String CONNECTION_TYPE_REFERENCE_TYPE = "de.cau.cs.kieler.cview.c.connectiontype.type"
    public static String CONNECTION_TYPE_INCLUSION = "de.cau.cs.kieler.cview.c.connectiontype.inclusion"

    // Options
    public static String OPTION_CONNECTION_FUNC = "de.cau.cs.kieler.cview.c.option.func"
    public static String OPTION_CONNECTION_TYPE = "de.cau.cs.kieler.cview.c.option.type"
    public static String OPTION_CONNECTION_INCLUSION = "de.cau.cs.kieler.cview.c.option.inclusion"

    // Colors
    public static final String COLOR_STRUCT_NOREF = "#FFD236"
    public static final String COLOR_STRUCT = "#FFF0BD"
    public static final String COLOR_TYPEDEF = "#FCFF00"
    public static final String COLOR_DECL = "#FEFFC1"
    public static final String FUNCTIONCOLORREF = "#D5EAFD"
    public static final String FUNCTIONCOLOR = "#82B5E3"
    public static final String FUNCTIONCOLORTRANS = "#286296"

    // Synthesis options
    public static final SynthesisOption SHOW_FUNCTIONS = SynthesisOption.createCheckOption("Show Functions", false);
    public static final SynthesisOption SHOW_REFERENCES_FUNC = SynthesisOption.createCheckOption(
        "Show Function References", false);
    public static final SynthesisOption SHOW_TYPES = SynthesisOption.createCheckOption("Show Types", false);
    public static final SynthesisOption SHOW_REFERENCES_TYPE = SynthesisOption.createCheckOption("Show Type References",
        false);
    public static final SynthesisOption SHOW_INCLUSION = SynthesisOption.createCheckOption("Show Include", false);

    // -------------------------------------------------------------------------
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
            (SHOW_TYPES.booleanValue || OPTION_CONNECTION_TYPE.isOptionRequired)
        ) || ((component.isFunction || component.isFunctionRef) &&
            (SHOW_FUNCTIONS.booleanValue || OPTION_CONNECTION_FUNC.isOptionRequired)
            ))
        }

        override diagramSynthesisOptions() {
            return #[SHOW_FUNCTIONS, SHOW_REFERENCES_FUNC, SHOW_TYPES, SHOW_REFERENCES_TYPE, SHOW_INCLUSION]
        }

        override reparsingRequired() {
            return #{SHOW_FUNCTIONS, SHOW_REFERENCES_FUNC, SHOW_TYPES, SHOW_REFERENCES_TYPE, SHOW_INCLUSION}
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
        override Object parseFile(char[] fileContent, IFile file) { 
            return CFileParser.parse(fileContent, file);
        }

        HashMap<IASTNode, Component> functionComponents = newHashMap()

        def isFunction(IASTNode name) {
            if (name == null) {
                return false
            }
            if (name.parent == null) {
                return false
            }
            if (name.parent.parent == null) {
                return false
            }
            if (name.parent.parent instanceof ICPPASTFunctionCallExpression) {
                return true
            }
            return false
        }

        def getHierarchy(IASTNode name) {
            if (name == null) {
                return null;
            }
            return name.parent.getHierarchy + "->" + name.toString
        }

        def getDeclaringFunction(IASTNode name) {
            if (name == null) {
                return null;
            }
            if (name instanceof ICPPASTFunctionDefinition) {
                // val rawSig = (name as ICPPASTFunctionDefinition).rawSignature
                return (name as ICPPASTFunctionDefinition).declarator.name
            }
            return name.parent.getDeclaringFunction
        }

        override modelCreateFileSubComponents(CViewModel model, Component fileComponent, boolean parse) {
            val filePath = fileComponent.location
            println("Parsing C file '" + filePath + "'")
            var content = fileComponent.fileRaw
            fileComponent.rawdata = String.valueOf(content)
            val tooltip = extractTooltip(fileComponent.rawdata)
            fileComponent.tooltip = tooltip

            if (parse || OPTION_CONNECTION_TYPE.isOptionRequired || OPTION_CONNECTION_FUNC.isOptionRequired) {
                val ast = fileComponent.AST

                val visitor = new ASTVisitor() {

                    override int visit(IASTDeclaration declaration) {
                        // CViewPlugin.printlnConsole("!!! IASTDeclaration !!!")
                        if (declaration instanceof IASTSimpleDeclaration) {
                            val astDecl = declaration as IASTSimpleDeclaration;
                            try {
//                                CViewPlugin.printlnConsole(
//                                    "--- type: " + ast.getSyntax() + " (childs: " + ast.getChildren().length + ")")
                                var IASTNode typedef = if (astDecl.children.length == 1) {
                                        astDecl.children.get(0)
                                    } else {
                                        astDecl.children.get(1)
                                    }
//                                CViewPlugin.printlnConsole("------- typedef: " + typedef);
                            } catch (Exception e) {
                            }
                        } // end if typedef
                        return 3
                    }

                    override int visit(IASTName name) {
                        val theName = name.toString

                        if (name.active) {
                            val binding = name.resolveBinding
//                            val declaringFunction = name.getDeclaringFunction
//                            var declFuncName = ""
//                            if (declaringFunction != null) {
//                                declFuncName = declaringFunction.toString()
//                            }
//                            val parentName = name.parent
//                            val parent2Name = name.parent.parent
//                            CViewPlugin.printlnConsole(
//                                "[" + theName.toString() + "]  declFunc=" + declFuncName + ", definition=" +
//                                    name.definition + ", ref=" + name.reference)
                            if (name.definition) {
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
                                        // ("STRUCT " + typeSpec.name + " : ").printConsole // [" + typeSpec.rawSignature + "]")
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
//                                                    CViewPlugin.printlnConsole("   o " + declName + " [" + declType +
//                                                        "]")
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

                                    functionComponents.put(name, functionComponent);
                                    fileComponent.children.add(functionComponent)
                                    functionComponent.parent = fileComponent
                                // System.out.println("- D " + name.toString() + " ")
                                }
                            }
                            if (name.reference) {
                                val declaringFunction = name.declaringFunction
                                if (declaringFunction != null) {

                                    val funcComp = functionComponents.get(declaringFunction)
                                    if (funcComp != null && name.isFunction) {
//                                        if (name.toString().startsWith("useByVoidPtr")) {
//                                            println(">>> " + name.toString() + ", " + name.parent.class.toString())
//                                        }
                                        val functionRefComponent = createFunctionRef
                                        functionRefComponent.referenceLine = name.lineStart
                                        // model.addToModel(functionComponent, monitor, fileComponent)
                                        model.components.add(functionRefComponent)
                                        functionRefComponent.name = "" + name.toString() + "()"
                                        funcComp.children.add(functionRefComponent)
                                        functionRefComponent.parent = funcComp

                                        // Only put the name of the referenced function as
                                        // this may not resolvable yet, resolve later
                                        functionRefComponent.referenceUnresolved = name.toString()
                                    }
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

        def modelCreateFileSubComponents(CViewModel model, Component functionComponent, IASTName functionName) {
//            val parent = functionName.parent;
//            val decl = parent as ICPPASTFunctionDeclarator;
            for (child : functionName.children) {
                CViewPlugin.printlnConsole(" - [" + child.toString + "]")
//                if (child instanceof IASTName) {
//                    val binding = child.resolveBinding
//                    if (binding instanceof IFunction) {
//                        if (child.definition) {
//                        }
//                    }
//                }
            }
        }

        // =========================================================================
        // =========================================================================
        override fileExtensions() {
            return #{"c", "h"}
        }

        override provideConnections(CViewModel model, IProgressMonitor monitor) {
            val HashSet<Connection> returnSet = new HashSet
            var boolean c = false
            // TODO 
            // need mechanism to ask C view iff calculation is requested by any analysis
            if (SHOW_REFERENCES_FUNC.getBooleanValue || OPTION_CONNECTION_FUNC.isOptionRequired) {
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
            if (SHOW_REFERENCES_TYPE.getBooleanValue ||
                de.cau.cs.kieler.cview.c.CLanguage.OPTION_CONNECTION_TYPE.isOptionRequired) {
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
            if (SHOW_INCLUSION.getBooleanValue || OPTION_CONNECTION_INCLUSION.isOptionRequired) {
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

            pathSegments.remove(pathSegments.size - 1)
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
    