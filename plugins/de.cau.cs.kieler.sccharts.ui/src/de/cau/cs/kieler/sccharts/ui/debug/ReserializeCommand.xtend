package de.cau.cs.kieler.sccharts.ui.debug

import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import java.util.List
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.ui.PlatformUI
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.progress.UIJob

class ReserializeCommand extends AbstractHandler {
    
    static val EXTENSION = "sctx"
    private static val sctxInjector = SCTXStandaloneSetup.doSetup
    
    override execute(ExecutionEvent event) throws ExecutionException {
        val selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
        if (selection instanceof IStructuredSelection) {
            val files = <IFile>newLinkedList
            // Collect
            for (element : selection.iterator.toIterable) {
                files.addAll(collect(element as IResource))
            }
            
            if (!files.empty) {
                val job = new UIJob("Reserializing SCCharts") {

                    override runInUIThread(IProgressMonitor monitor) {
                        monitor.beginTask("Reserializing SCCharts", files.size)
                        
                        // Process
                        for (file : files) {
                            monitor.subTask("Converting: " + file.projectRelativePath.toString)

                            if (monitor.canceled) return Status.CANCEL_STATUS
                            
                            try {
                                file.reserilaize
                            } catch (Exception e) {
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.ui", e.message, e), StatusManager.LOG)
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.ui", e.message, e.cause), StatusManager.SHOW)
                            }

                            monitor.worked(1)
                        }
                        
                        // Refresh
                        for (element : selection.iterator.filter(IResource).toIterable) {
                            if (element instanceof IFile) {
                                element.parent.refreshLocal(IResource.DEPTH_INFINITE, monitor)
                            } else {
                                element.refreshLocal(IResource.DEPTH_INFINITE, monitor)
                            }
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
    
    def void reserilaize(IFile file) {
        val br = new BufferedReader(new InputStreamReader(file.getContents()))
        
        var String line
        var search = true
        while((line = br.readLine()) !== null && search) {
            if (line.contains("//")) {
                if (MessageDialog.openQuestion(PlatformUI.getWorkbench()?.getActiveWorkbenchWindow()?.getShell(), "Reserializing File", "The source file " + file.name + " contains line comments that will be lost in reserialization.\nContinue?")) {
                    search = false
                } else {
                    return
                }
            }
        }
        
        // Get resource set
        val uri = URI.createFileURI(file.locationURI.normalize.path.toString)
        val resourceSet = sctxInjector.getInstance(XtextResourceSet)
        
        // Load file
        val resource = resourceSet.getResource(uri, true) as XtextResource
        val model = resource.contents.get(0)
        resource.contents.set(0, model.copy)
        
        // Save
        val options = newHashMap
        options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, false)
        resource.save(options)
    }
}
