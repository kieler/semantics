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

import com.google.inject.Inject
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import de.cau.cs.kieler.cview.klighd.DiagramSynthesis
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.io.File
import java.util.HashMap
import org.eclipse.core.runtime.IProgressMonitor
import de.cau.cs.kieler.cview.extensions.CViewLanguageExtensions

/**
 * @author cmot
 * 
 */
class KLighDController extends AbstractKLighDController {

    @Inject extension CViewModelExtensions
    @Inject extension CViewAnalysisExtensions
    @Inject extension CViewLanguageExtensions

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
                // TODO: Check
                val languageHook = CViewLanguageExtensions.getLanguage(filePath)
                if (languageHook != null) {
                    languageHook.modelCreateFileSubComponents(model, file, DiagramSynthesis.parseFiles)
                }
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

        // Resolve references
        referenceMapping.clear
        // Build list of mappings
        for (component : model.components) {
            if (monitor.canceled) {
                CViewPlugin.monitorCanceled = true
                return model
            }
            val String referenceType = component.type.literal
            val String referenceId = referenceType + "__@#$__" + component.name
            referenceMapping.put(referenceId, component)
        // CViewPlugin.printlnConsole("INFO: Put Ref. '" + referenceId + "'")
        }
        // Resolve
        CViewPlugin.printlnConsole("-------- RESOLVING START ------------")
        for (component : model.components) {
            if (monitor.canceled) {
                CViewPlugin.monitorCanceled = true
                return model
            }
            if (component.isReference && !component.resolved) {
                val thisType = component.type.literal
                var String referenceType = thisType
                if (thisType == "DECL") {
                    referenceType = "TYPEDEF"
                } else if (thisType == "TYPEDEF") {
                    referenceType = "STRUCT"
                }
                val String referenceId = referenceType + "__@#$__" + component.referenceUnresolved
                if ((!component.referenceUnresolved.nullOrEmpty) && referenceMapping.containsKey(referenceId)) {
                    val Component otherComponent = referenceMapping.get(referenceId)
                    // Here we set the reference if we have found it
                    component.reference = otherComponent
                    CViewPlugin.printlnConsole("INFO: Resolved '" + referenceId + "'")
                } else {
                    // Claim that we have not found
                    CViewPlugin.printlnConsole("ERROR: Could not resolve '" + referenceId + "'")
                }
            }
        }
        CViewPlugin.printlnConsole("-------- RESOLVING END ------------")

        printlnConsole("INFO: - Build-in connections")

        // Add language build-in connections
        if (model.connections.size == 0) {
            for (language : CViewPlugin.getRegisteredLanguageHooks(false)) {
                val connections = language.provideConnections(model, monitor)
                if (!connections.nullOrEmpty) {
                    model.connections.addAll(connections)
                }
            }
        }

        if (monitor.canceled) {
            CViewPlugin.monitorCanceled = true
            return model
        }

        val connectionHooks = CViewPlugin.getRegisteredAnalysisHooks(false)
        // Initialize
        for (connectionHook : connectionHooks) {
            if (monitor.canceled) {
                CViewPlugin.monitorCanceled = true
                return model
            }
            if (CViewPlugin.isEnabled(connectionHook.id)) {
                connectionHook.initialize(model, monitor);
            }
        }

        // Now call connections extensions
        // println("MODEL: components=" + model.components.size);
        for (Component component : model.components) {
            // println("COMPONENT:" + component.type.getName().toString());
            for (connectionHook : connectionHooks) {
                if (monitor.canceled) {
                    CViewPlugin.monitorCanceled = true
                    return model
                }
                if (CViewPlugin.isEnabled(connectionHook.id)) {
                    val connectionsToAdd = connectionHook.createConnections(component, model, monitor)
                    if (!connectionsToAdd.nullOrEmpty) {
                        model.connections.addAll(connectionsToAdd)
                    }
                }
            }
        }

        // Wrapup
        for (connectionHook : connectionHooks) {
            if (monitor.canceled) {
                CViewPlugin.monitorCanceled = true
                return model
            }
            if (CViewPlugin.isEnabled(connectionHook.id)) {
                connectionHook.wrapup(model, monitor);
            }
        }
        
        
        // Build ok
        CViewPlugin.monitorCanceled = false

        return model;
    }

}
