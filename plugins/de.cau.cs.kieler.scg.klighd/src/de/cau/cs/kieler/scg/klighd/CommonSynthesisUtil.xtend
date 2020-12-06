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
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KIdentifier

/**
 * @author als
 */
class CommonSynthesisUtil {
    
    /**
     * Sets KGE ID.
     */
    def setKID(KGraphElement kge, String id) {
        if (kge !== null) {
            kge.data.removeIf[it instanceof KIdentifier] // prevents confusion if multiple ids existed
            val kident = KGraphFactory.eINSTANCE.createKIdentifier()
            kge.data += kident
            kident.id = id
        }
    }
    
}