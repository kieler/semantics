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
import de.cau.cs.kieler.kicool.System
import org.eclipse.ui.IEditorPart

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class EditPartSystemManager {
    
    private val editPartSystemMap = new HashMap<IEditorPart, System>
    
    def attachSystemToEditPart(IEditorPart part, System system) {
        editPartSystemMap.put(part, system)
    }
    
    def System get(IEditorPart part) {
        editPartSystemMap.get(part)
    }
    
    def remove(IEditorPart part) {
        editPartSystemMap.remove(part)
    }
    
    def findEditorFor(System system) {
        for(key : editPartSystemMap.keySet) {
            if (editPartSystemMap.get(key).equals(system)) return key
        }
        
        return null
    }
}