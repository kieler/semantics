/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ide.language.server

import de.cau.cs.kieler.klighd.lsp.interactive.INodeIdProvider
import de.cau.cs.kieler.sccharts.impl.ScopeImpl

/**
 * Service class that returns the id of regions or states.
 * 
 * @author sdo
 *
 */
class SCTXNodeIdProvider implements INodeIdProvider {
    
    override canHandle(Object graph) {
        return graph instanceof ScopeImpl
    }
    
    override getNodeId(Object element) {
        if (element instanceof ScopeImpl) {
            return element.name
        }
    }
    
}
