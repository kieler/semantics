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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditMsg

@ViewSynthesisShared
class StructuralEditingHook extends SynthesisHook {
    // label mit registrieren (das im contextmenu eingetragen werden)
    // später auch textfelder einbauen die dann gefüllt werden müssen (bsp. für nächsten state)
    
    override processRegion(Region region, KNode node) {
        val String[] x = #{"Delete", "Rename", "ConcurrentRegion"}
        
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, [] )
    }
    
    override processState(State state, KNode node){
        val String[] x = #{"Delete", "Rename", "Successor", "Hirachical"}
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, [] )
    }
    
    override processTransition(Transition transition, KEdge edge) {
        val String[] x = #{"Delete", "newRoot","newDest"}
        edge.setProperty(KlighdProperties.STRUCTURED_EDITING, [] )
    }
    
}    