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

/**
 * @author cmot
 *
 */
class ConnectionHook extends AbstractConnectionHook implements IConnectionHook {
    
    override createConnections(Component component, CViewModel model) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    } 
    
}