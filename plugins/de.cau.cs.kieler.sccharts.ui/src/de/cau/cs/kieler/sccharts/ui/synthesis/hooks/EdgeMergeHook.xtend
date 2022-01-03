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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.Scope
import org.eclipse.xtend.lib.annotations.Data
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.DeferredType
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.HashSet

@ViewSynthesisShared
class EdgeMergeHook extends SynthesisHook {
    
    HashSet<EdgeGroupKey> map = new HashSet<EdgeGroupKey>();
    
    @Data
    static class EdgeGroupKey {
        State source;
        State target;
        PreemptionType preemption;
        HistoryType history;
        DeferredType deferred;
        boolean deterministic;
    }
    
    /** 
     * Invoked before the translation of the model starts.
     * @param scopethe input model
     * @param nodethe empty diagram root node
     */
    override void start(Scope scope, KNode node) {
        map.clear()
    }

    /** 
     * Invoked after a {@link Transition} is translated.
     * @param transitionthe transition
     * @param edgethe translated edge
     */
    override void processTransition(Transition transition, KEdge edge) {
        
        var key = new EdgeGroupKey(
            transition.sourceState, 
            transition.targetState, 
            transition.preemption, 
            transition.history, 
            transition.deferred, 
            transition.isNondeterministic
        );
        
        edge.setProperty(KlighdProperties.IS_EDGE_GROUP_ELEMENT, true)
        
        if (map.add(key)) {
            // first edge of a group is chosen as the representative
            edge.setProperty(KlighdProperties.IS_EDGE_GROUP_REPRESENTATIVE,true)
        }
        
    }

}