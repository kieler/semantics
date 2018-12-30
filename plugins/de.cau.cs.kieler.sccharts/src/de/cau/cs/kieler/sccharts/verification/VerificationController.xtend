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
 package de.cau.cs.kieler.sccharts.verification

import de.cau.cs.kieler.sccharts.verification.backend.VerificationBackendTask
import java.util.List
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.ICoreRunnable
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 */
class VerificationController implements VerificationControls {
   
    val VerificationContext context
   
    @Accessors(PUBLIC_GETTER) boolean running = false
    @Accessors(PUBLIC_GETTER) boolean asynchronous = false
    
    protected var List<VerificationBackendTask> tasks = newArrayList
    protected int currentTaskIndex
    
    // Async worker
    val Job asyncJob
    
    new(VerificationContext context) {
        this.context = context
        
        this.asyncJob = Job.create("Verification", new ICoreRunnable() {
            
            override run(IProgressMonitor monitor) throws CoreException {
                while(!monitor.canceled && currentTask !== null) {
                    monitor.taskName = currentTask.name
                    doCurrentVerificationTask
                }
                monitor.done()
            }
        })
        this.asyncJob.user = true
        this.asyncJob.priority = Job.INTERACTIVE
    }
    
    override start(boolean async) {
        if (running) {
            throw new IllegalStateException("Verification already running")
        }
        this.running = true
        this.asynchronous = async
        
        tasks = context.backend.getVerificationTasks(context)
        currentTaskIndex = if(tasks.isEmpty) -1 else 0
        
        if (asynchronous) {
            asyncJob.schedule()
        } else {
            while(currentTask !== null) {
                doCurrentVerificationTask
            }
        }
    }
   
    override stop() {
        if(!running) {
            return
        }
        
        if (asynchronous) {
            asyncJob.cancel
        }
        
        this.running = false
    }
    
    private def void doCurrentVerificationTask() {
        currentTask.run()
        currentTaskIndex++
    }
    
    private def VerificationBackendTask getCurrentTask() {
        if(tasks !== null && currentTaskIndex >= 0 && currentTaskIndex < tasks.size) {
            return tasks.get(currentTaskIndex)
        } else {
            return null
        }
    }
}
