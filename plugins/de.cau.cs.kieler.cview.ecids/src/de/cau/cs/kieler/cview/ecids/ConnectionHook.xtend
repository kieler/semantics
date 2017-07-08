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
package de.cau.cs.kieler.cview.ecids

import de.cau.cs.kieler.cview.hooks.AbstractConnectionHook
import de.cau.cs.kieler.cview.hooks.IConnectionHook
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject

/**
 * @author cmot
 *
 */
class ConnectionHook extends AbstractConnectionHook implements IConnectionHook {
    
    
     @Inject extension CViewModelExtensions
    
    override createConnections(Component component, CViewModel model) {
        
        val List<Connection> returnList = newArrayList()
        
        returnList.add(component.parent.connect(component))
        
        println(" ####### create connections for '" + component.name + "'")
        return null
    } 
    
}