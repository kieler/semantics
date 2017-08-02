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
package de.cau.cs.kieler.cview

import de.cau.cs.kieler.cview.AbstractKLighDController
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.io.File
import org.eclipse.cdt.core.dom.ast.ASTVisitor
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IFunction
import de.cau.cs.kieler.cview.model.cViewModel.Component

import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.util.List
import java.util.ArrayList
import org.eclipse.core.runtime.IProgressMonitor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Inject
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTFileLocation
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.klighd.DiagramSynthesis
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTDeclaration
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import java.util.HashMap
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPTypedef
import org.eclipse.cdt.core.dom.ast.ASTNodeProperty

/**
 * @author cmot
 * 
 */
class KLighDController extends AbstractKLighDController {

    @Inject extension CViewModelExtensions

    public static CViewModelExtensions cViewModelExtensions = new CViewModelExtensions();

    public HashMap<String, Component> referenceMapping = new HashMap

    def int countModel(CViewModel model, Object element) {
        var i = 1;
        var filePath = getFilePath(element);
        var folderPath = getDirPath(element);
        val projectPath = getProjectPath(element);
        if (element instanceof File) {
            if (!element.isDirectory) {
                filePath = element.absolutePath
            } else {
                folderPath = element.absolutePath
            }
        }
        if (!projectPath.nullOrEmpty) {
            // Project
            for (e : listFiles(projectPath, "*")) {
                i = i + model.countModel(e)
            }
        } else if (!folderPath.nullOrEmpty) {
            // Folder   
            for (e : listFiles(folderPath, "*")) {
                i = i + model.countModel(e)
            }
        } else if (!filePath.nullOrEmpty) {
            // File
        }
        return i;
    }

    def Component addToModel(CViewModel model, Object element, IProgressMonitor monitor) {
        return model.addToModel(element, monitor, null)
    }

    def Component addToModel(CViewModel model, Object element, IProgressMonitor monitor, Component parent) {
        var filePath = getFilePath(element);
        var folderPath = getDirPath(element);
        val projectPath = getProjectPath(element);

        if (monitor.canceled) {
            return null;
        }

        monitor.worked(1)
        // monitor.beginTask("Processing file '"+element.toString+"'", 0);
        if (element instanceof File) {
            if (!element.isDirectory) {
                filePath = element.absolutePath
            } else {
                folderPath = element.absolutePath
            }
        }

        if (!projectPath.nullOrEmpty) {
            // Project
            val dir = cViewModelExtensions.createDir
            dir.location = projectPath;
            dir.name = element.toString.componentName
            // dir.project = true
            model.components.add(dir)
            if (parent != null) {
                dir.parent = parent
                parent.children.add(dir)
            }

            for (e : listFiles(dir.location, "*")) {
                model.addToModel(e, monitor, dir)
            }
            return dir;
        } else if (!folderPath.nullOrEmpty) {
            // Folder   
            val dir = cViewModelExtensions.createDir
            dir.location = folderPath;
            dir.name = element.toString.componentName
            model.components.add(dir)
            if (parent != null) {
                dir.parent = parent
                parent.children.add(dir)
            }

            for (e : listFiles(dir.location, "*")) {
                model.addToModel(e, monitor, dir)
            }
            return dir;
        } else if (!filePath.nullOrEmpty) {
            // File
            val file = cViewModelExtensions.createFile; // CViewModelFactory.eINSTANCE.createFile;
            model.components.add(file);
            file.location = filePath;
            file.name = element.toString.componentName

            // Add all functions to the file
            if (!DiagramSynthesis.skipFileContent) {
                fillFileWithFunctions(model, file, monitor, DiagramSynthesis.parseFiles)
            }

            if (parent != null) {
                file.parent = parent
                parent.children.add(file)
            }
            return file;
        }

    }

    def componentName(String componentPath) {
        var i = componentPath.lastIndexOf("\\");
        var j = componentPath.lastIndexOf("/");

        if (j > 0) {
            i = j;
        }
        if (i > 0) {
            // Path or File?
            if (i == componentPath.length) {
                var i2 = componentPath.lastIndexOf("\\", i - 1);
                var j2 = componentPath.lastIndexOf("/", i - 1);
                if (j2 > 0) {
                    i2 = j2;
                }
                return componentPath.substring(i2 + 1);
            }
            return componentPath.substring(i + 1);
        } else {
            return componentPath;
        }
    }

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

    def fillFileWithFunctions(CViewModel model, Component fileComponent, IProgressMonitor monitor, boolean parse) {
        // val filePath = getFilePath(fileComponent.location);
        val filePath = fileComponent.location
        if (filePath == null || !((filePath.endsWith(".c") || filePath.endsWith(".h")))) {
            return;
        }
        
        println("fillFileWithFunctions '" + filePath + "'")
        val content = readFile(filePath)
        fileComponent.rawdata = String.valueOf(content)
        val tooltip = extractTooltip(fileComponent.rawdata)
        fileComponent.tooltip = tooltip

        if (parse) {
            val ast = CFileParser.parse(content)

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
                        if (binding instanceof CPPTypedef) {
                            // This binding is a typedef,
                            // fortunately referencing a struct
                            val type = binding.type
//                            CViewPlugin.printlnConsole("TYPEDEF " + theName + " >>> " + type)
                            
                            val typeTypedefComponent = createTypedef
                            model.components.add(typeTypedefComponent)
                            typeTypedefComponent.name = name.toString
                            typeTypedefComponent.referenceUnresolved = binding.type.toString
                            fileComponent.children.add(typeTypedefComponent)
                            typeTypedefComponent.parent = fileComponent
                        }
                        if (binding instanceof CPPClassType) {
                            val parent = name.parent
                            if (parent instanceof CPPASTCompositeTypeSpecifier) {
                                val typeSpec = parent as CPPASTCompositeTypeSpecifier
                                val typeSpecName = typeSpec.name
                                val IASTDeclaration[] decls = typeSpec.members // getDeclarations(false)
//                                CViewPlugin.printlnConsole("STRUCT " + typeSpec.name +" : ") //[" + typeSpec.rawSignature + "]")
                                
                                val structComponent = createStruct
                                model.components.add(structComponent)
                                structComponent.name = typeSpec.name.toString
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
                                            declComponent.referenceUnresolved = declType.toString 
                                            structComponent.children.add(declComponent)
                                            declComponent.parent = structComponent
                                            
                                            val declRawSig = decl.rawSignature
                                            val declName = declarator.name.toString
//                                            CViewPlugin.printlnConsole("   o " + declName + " [" + declType + "]")
                                        }
                                    }
//                                    CViewPlugin.printlnConsole("   r " + decl.rawSignature)
                                }
                            }

                        }
                        if (binding instanceof IFunction) {
                            if (name.definition) {
                                val functionComponent = cViewModelExtensions.createFunc
                                // model.addToModel(functionComponent, monitor, fileComponent)
                                model.components.add(functionComponent)
                                functionComponent.name = name.toString()
//                                val ITranslationUnit tu = name.originalNode.translationUnit.originatingTranslationUnit;
//                                if (tu != null) {
//                                        val IASTFileLocation loc = name.getFileLocation();
//                                        functionComponent.referenceLine = loc.startingLineNumber
//                                }
                                val IASTFileLocation loc = name.getFileLocation();
                                functionComponent.referenceLine = loc.startingLineNumber
                                functionComponent.rawdata = "";
                                functionComponent.location = fileComponent.location
                                fileComponent.children.add(functionComponent)
                                functionComponent.parent = fileComponent
                            // System.out.println("- D " + name.toString() + " ")
                            } else if (name.reference) {
                                val functionRefComponent = cViewModelExtensions.createFunc
                                // model.addToModel(functionComponent, monitor, fileComponent)
                                model.components.add(functionRefComponent)
                                functionRefComponent.name = "" + name.toString() + "()"

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

    override preCalculateModel(Object[] allselections) {
        var i = 0;
        for (Object element : allselections) {
            i = i + model.countModel(element)
        }
        return i;
    }

    /**
     *  MAIN ENTRY: CALCULATE THE MODEL
     */
    override calculateModel(Object[] allselections, IProgressMonitor monitor) {

        model = CViewModelFactory.eINSTANCE.createCViewModel();
        for (Object element : allselections) {
            val component = model.addToModel(element, monitor)
        }

        val connectionHooks = CViewPlugin.getRegisteredAnalysisHooks(false)
        // Initialize
        for (connectionHook : connectionHooks) {
            if (CViewPlugin.isEnabled(connectionHook.id)) {
                connectionHook.initialize(model);
            }
        }

        // Resolve references
        referenceMapping.clear
        // Build list of mappings
        for (component : model.components) {
                val String referenceType = component.type.literal
                val String referenceId = referenceType + "__@#$__" + component.name
                referenceMapping.put(referenceId, component)
                CViewPlugin.printlnConsole("INFO: Put Ref. '" + referenceId + "'")
        }
        // Resolve
        for (component : model.components) {
            if (component.isReference && !component.resolved) {
                val thisType = component.type.literal
                var String referenceType = thisType
                if (thisType == "DECL") {
                    referenceType = "TYPEDEF"
                } else if (thisType == "TYPEDEF") {
                    referenceType = "STRUCT"
                }
                val String referenceId = referenceType + "__@#$__" + component.referenceUnresolved
                if (referenceMapping.containsKey(referenceId)) {
                    val Component otherComponent = referenceMapping.get(referenceId)
                    // Here we set the reference if we have found it
                    component.reference = otherComponent
                    CViewPlugin.printlnConsole("INFO: Resolved '" + referenceId + "'")
                } else {
                    // Claim that we have not found
                    CViewPlugin.printlnConsole("ERRROR: Could not resolve '" + referenceId + "'")
                }
            }
        }

        // Now call connections extensions
        // println("MODEL: components=" + model.components.size);
        for (Component component : model.components) {
            // println("COMPONENT:" + component.type.getName().toString());
            for (connectionHook : connectionHooks) {
                if (CViewPlugin.isEnabled(connectionHook.id)) {
                    val connectionsToAdd = connectionHook.createConnections(component, model)
                    if (!connectionsToAdd.nullOrEmpty) {
                        model.connections.addAll(connectionsToAdd)
                    }
                }
            }
        }

        // Wrapup
        for (connectionHook : connectionHooks) {
            if (CViewPlugin.isEnabled(connectionHook.id)) {
                connectionHook.wrapup(model);
            }
        }

        return model;
    }

}
