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
package de.cau.cs.kieler.railsl.ui.natures

import org.eclipse.core.resources.IProjectNature
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.resources.IProject

/**
 * @author stu121235
 *
 */
class RailSLNature implements IProjectNature {
    
    public static val NATURE_ID = "de.cau.cs.kieler.railsl.ui.RailSLNature"
    
    override configure() throws CoreException {
        
    }
    
    override deconfigure() throws CoreException {
        
    }
    
    override getProject() {
        return null
    }
    
    override setProject(IProject project) {
        
    }
    
}