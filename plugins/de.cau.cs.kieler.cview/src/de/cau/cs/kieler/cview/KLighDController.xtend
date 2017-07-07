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
import de.cau.cs.kieler.cview.hooks.IConnectionHook
import java.util.ArrayList

/**
 * @author cmot
 * 
 */
class KLighDController extends AbstractKLighDController {

    public static CViewModelExtensions cViewModelExtensions = new CViewModelExtensions();

    def Component addToModel(CViewModel model, Object element) {
        return model.addToModel(element, null)
    }

    def Component addToModel(CViewModel model, Object element, Component parent) {
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
                model.addToModel(e, dir)
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
                model.addToModel(e, dir)
            }
            return dir;
        } else if (!filePath.nullOrEmpty) {
            // File
            val file = cViewModelExtensions.createFile; // CViewModelFactory.eINSTANCE.createFile;
            file.location = filePath;
            file.name = element.toString.componentName
            model.components.add(file);
            
            // Add all functions to the file
            fillFileWithFunctions(file)

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

    def fillFileWithFunctions(Component fileComponent) {
        // val filePath = getFilePath(fileComponent.location);
        val filePath = fileComponent.location
        if (filePath != null) {
            val content = readFile(filePath);
            val ast = CFileParser.parse(content);

            val visitor = new ASTVisitor() {
                override int visit(IASTName name) {
                    if (name.active) {
                        val binding = name.resolveBinding
                        if (binding instanceof IFunction) {
                            if (name.definition) {
                                val functionComponent = cViewModelExtensions.createFunc
                                model.addToModel(functionComponent)
                                functionComponent.name = name.toString()
                                functionComponent.location = fileComponent.location
                                fileComponent.children.add(functionComponent)
                                functionComponent.parent = fileComponent
                                System.out.println("- D " + name.toString() + " ");
                            } else if (name.reference) {
                                System.out.println("- R " + name.toString() + " ");
                            }
                        }
                    }
                    return ASTVisitor.PROCESS_CONTINUE;
                }
            };
            visitor.shouldVisitNames = true;
            ast.accept(visitor);

        }

    }

    override calculateModel(Object[] allselections) {
        model = CViewModelFactory.eINSTANCE.createCViewModel();
        for (Object element : allselections) {
            val component = model.addToModel(element)
        }
        
        // Now call connections extensions
        for (Component component: model.components) {
           val connectionHooks = CViewPlugin.getRegisteredConnectionHooks(false)
           for (connectionHook : connectionHooks) {
              val connectionsToAdd = connectionHook.createConnections(component, model)
              if (!connectionsToAdd.nullOrEmpty) {
                  model.connections.addAll(connectionsToAdd)
              }
           }
        }
        
        return model;
    }

}
