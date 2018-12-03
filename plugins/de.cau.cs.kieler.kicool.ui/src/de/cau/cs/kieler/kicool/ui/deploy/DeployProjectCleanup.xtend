/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.deploy

import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.ui.IStartup
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchListener
import org.eclipse.ui.PlatformUI

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DeployProjectCleanup implements IStartup, IWorkbenchListener {
    
    public static val DO_CLEANUP = new Property("de.cau.cs.kieler.kicool.ui.deploy.cleanup", true)
    
    val store = PlatformUI.preferenceStore
    var Job cleanupJob

    override earlyStartup() {
        // init pref
        if (!store.contains(DO_CLEANUP.id)) {
            store.setDefault(DeployProjectCleanup.DO_CLEANUP.id, DeployProjectCleanup.DO_CLEANUP.^default)
        }
        PlatformUI.workbench?.addWorkbenchListener(DeployProjectCleanup.this)
    }

    override postShutdown(IWorkbench workbench) {
        cleanupJob?.join // Wait for cleanup to finish
    }

    override preShutdown(IWorkbench workbench, boolean forced) {
        if (!forced && store.getBoolean(DO_CLEANUP.id)) {
            cleanupJob = new Job("KiCool Project Cleanup") {
                
                override run(IProgressMonitor monitor) {
                    val projects = ProjectInfrastructure.createdTemporaryProjects.filter[exists].toList
                    monitor.beginTask("KiCool: Deleting temporary projects", projects.size)
                    for (project : projects) {
                        monitor.subTask("Deleting " + project.name)
                        project.delete(true, true, monitor)
                        monitor.worked(1)
                    }
                    monitor.done
                    return Status.OK_STATUS
                }
                
            }
            cleanupJob.rule = ResourcesPlugin.workspace.root // Lock workspace to keep access for deletion
            cleanupJob.schedule
        }
        return true // Allow shutdown
    }

}
