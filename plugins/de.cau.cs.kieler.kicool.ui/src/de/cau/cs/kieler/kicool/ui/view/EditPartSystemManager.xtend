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
package de.cau.cs.kieler.kicool.ui.view

import java.util.HashMap
import org.eclipse.ui.IWorkbenchPart
import de.cau.cs.kieler.kicool.System

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class EditPartSystemManager {
    
    private val editPartSystemMap = new HashMap<IWorkbenchPart, System>
    
    def attachSystemToEditPart(IWorkbenchPart part, System system) {
        editPartSystemMap.put(part, system)
    }
    
    def System get(IWorkbenchPart part) {
        editPartSystemMap.get(part)
    }
    
    def remove(IWorkbenchPart part) {
        editPartSystemMap.remove(part)
    }
}