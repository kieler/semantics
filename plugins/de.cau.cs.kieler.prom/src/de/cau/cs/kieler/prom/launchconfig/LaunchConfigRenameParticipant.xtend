/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.launchconfig

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.ltk.core.refactoring.RefactoringStatus
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant

/**
 * @author aas
 */
class LaunchConfigRenameParticipant extends RenameParticipant {
    
    private IProject project
    
    override checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
        return new RefactoringStatus()
    }
    
    override createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        if(project != null)
            System.err.println(project.name)
    
        val newName = getArguments().getNewName()
        println(newName)
        
        return null
    }
    
    override getName() {
        return "KiCo Launch Config Rename Participant"
    }
    
    override protected initialize(Object element) {
        if(element instanceof IProject){
            project = element
        }
        return true
    }    
}
