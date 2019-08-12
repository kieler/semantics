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
package de.cau.cs.kieler.sccharts.ui.complexity

import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.scg.processors.analyzer.AbstractSCGComplexity
import java.io.File
import java.io.FileWriter
import java.util.Date
import java.util.List
import java.util.TreeMap
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.progress.UIJob
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author lgr
 *
 */
abstract class SCTXComplexityCalculationHandler extends AbstractHandler {
    
    static val EXTENSION = "sctx"
    static val sctxInjector = SCTXStandaloneSetup.doSetup
    
    abstract def String getCompilationSystemID()
    
    override execute(ExecutionEvent event) throws ExecutionException {
        val selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
        if (selection instanceof IStructuredSelection) {
            val files = <IFile>newLinkedList
            // Collect
            for (element : selection.iterator.toIterable) {
                files.addAll(collect(element as IResource))
            }
            
            if (!files.empty) {
                val job = new UIJob("Calculating Complexity") {

                    override runInUIThread(IProgressMonitor monitor) {
                        monitor.beginTask("Calculating Complexity", files.size)
                        
                        // Save Complexity results in Map as Filename->Complexity
                        var maxFileNameLength = 0
                        var complexityMap = new TreeMap<String, Integer>()
                        for (file : files) {
                            monitor.subTask("Calculating Complexity: " + file.projectRelativePath.toString)

                            if (monitor.canceled) return Status.CANCEL_STATUS
                            
                            try {
                                val complexity = file.complexity
                                maxFileNameLength = Math.max(file.name.length, maxFileNameLength)
                                complexityMap.put(file.projectRelativePath.toString, complexity)
                            } catch (Exception e) {
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.ui", e.message, e), StatusManager.LOG)
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.ui", e.message, e.cause), StatusManager.SHOW)
                            }
                            monitor.worked(1)
                        }
                        
                        // Format Results
                        val maxFileNameLengthFinal = maxFileNameLength
                        val stringBuilder = new StringBuilder
                        complexityMap.forEach[filepath, complexity| stringBuilder.append(formatFileLine(filepath, complexity, maxFileNameLengthFinal, false))]

                        // Write result File
                        var stamp = (new Date()).toString.replace(" ", "_").replace(":", "-")
                        var resultsFileName = "complexity_" + stamp + ".csv"
                        var projectPath = files.head?.project.location.toString
                        var newFile = new File(projectPath + File.separator + resultsFileName)
                        if (newFile.createNewFile) {
                            var writer = new FileWriter(newFile);
                            writer.write(stringBuilder.toString);
                            writer.close();
                        }

                        return Status.OK_STATUS
                    }
                    
                }
                job.user = true
                job.schedule
            }
        }
        return null;
    }
    
    def getComplexity(IFile file) {
        
        // Get resource set
        val uri = URI.createFileURI(file.locationURI.normalize.path.toString)
        val resourceSet = sctxInjector.getInstance(XtextResourceSet)
        
        // Load file
        val resource = resourceSet.getResource(uri, true) as XtextResource
        val model = resource.contents.get(0)
        
        // Calculate Complexity
        if (model instanceof SCCharts) {
            val context = Compile.createCompilationContext(compilationSystemID, model)
            context.compile
            val scgComplexityProcessor = context.processorInstancesSequence.last
            if (scgComplexityProcessor instanceof AbstractSCGComplexity) {
                val complexity = scgComplexityProcessor.environment.getProperty(AbstractSCGComplexity.COMPLEXITY)
                return complexity 
            }
        }
    }
    
    def formatFileLine(String filePath, int complexity, int maxFileNameLength, boolean tabular) {
        var separator = ""
        if (tabular) {
            for (var i = filePath.length; i <= maxFileNameLength; i++) {
                separator += " "
            }
        } else {
            separator = ","
        }
        
        return filePath + separator + complexity + "\n"
                
    }

    dispatch def List<IFile> collect(IProject project) {
        val list = newLinkedList
        for (member : project.members) {
            list.addAll(collect(member))
        }
        return list
    }

    dispatch def List<IFile> collect(IFolder folder) {
        val list = newLinkedList
        for (member : folder.members) {
            list.addAll(collect(member))
        }
        return list
    }

    dispatch def List<IFile> collect(IFile file) {
        if (file.exists && file.fileExtension !== null && file.fileExtension.endsWith(EXTENSION)) {
            return newLinkedList(file)
        }
        return emptyList
    }
}