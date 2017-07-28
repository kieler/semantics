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
package de.cau.cs.kieler.sccharts.legacy.ui

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
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import static de.cau.cs.kieler.sccharts.legacy.SCChartsLegacyConverter.*
import org.eclipse.ui.statushandlers.StatusManager

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LegacySCTConverterUI extends AbstractHandler {

    override execute(ExecutionEvent event) throws ExecutionException {
        val selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
        if (selection instanceof IStructuredSelection) {
            val files = <IFile>newLinkedList
            // Collect
            for (element : selection.iterator.toIterable) {
                files.addAll(collect(element as IResource))
            }
            
            if (!files.empty) {
                val job = new Job("Converting legacy SCCharts") {

                    override protected run(IProgressMonitor monitor) {
                        monitor.beginTask("Converting legacy SCCharts", files.size)
                        
                        // Process
                        for (file : files) {
                            monitor.subTask("Converting: " + file.projectRelativePath.toString)

                            if (monitor.canceled) return Status.CANCEL_STATUS
                            
                            try {
                                export(file, files)
                            } catch (Exception e) {
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.legacy.ui", e.message, e), StatusManager.LOG)
                                StatusManager.getManager().handle(new Status(Status.WARNING, "de.cau.cs.kieler.sccharts.legacy.ui", e.message, e.cause), StatusManager.SHOW)
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
        if (file.exists && file.fileExtension != null && file.fileExtension.endsWith(INPUT_EXTENSION)) {
            return newLinkedList(file)
        }
        return emptyList
    }
}
