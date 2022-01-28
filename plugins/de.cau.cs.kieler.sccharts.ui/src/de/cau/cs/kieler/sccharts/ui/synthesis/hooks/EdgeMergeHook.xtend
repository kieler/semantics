/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2021,2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.Scope
import org.eclipse.xtend.lib.annotations.Data
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.DeferredType
import java.util.HashMap
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.DelayType

@ViewSynthesisShared
class EdgeMergeHook extends SynthesisHook {
    
    
    /** The related synthesis option */
    public static final SynthesisOption MERGE_SIMILAR_EDGES = SynthesisOption.createCheckOption(EdgeMergeHook, "Merge Similar Edges",
            false).setCategory(GeneralSynthesisOptions::APPEARANCE);
        
    override getDisplayedSynthesisOptions() {
        return newLinkedList(de.cau.cs.kieler.sccharts.ui.synthesis.hooks.EdgeMergeHook.MERGE_SIMILAR_EDGES)
    }
    
    HashMap<EdgeGroupKey, KEdge> map = new HashMap<EdgeGroupKey,KEdge>();
    
    @Data
    static class EdgeGroupKey {
        State source;
        State target;
        PreemptionType preemption;
        HistoryType history;
        DeferredType deferred;
        DelayType delay;
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
        
        if (MERGE_SIMILAR_EDGES.booleanValue) {
            
            var key = new EdgeGroupKey(
                transition.sourceState, 
                transition.targetState, 
                transition.preemption, 
                transition.history, 
                transition.deferred, 
                transition.delay,
                transition.isNondeterministic
            );
            
            
            val rep = map.computeIfAbsent(key, [EdgeGroupKey _key | edge]); 
            
            if (edge != rep) {
                rep.labels.addAll(edge.labels)
                for (label : edge.labels) {
                    label.parent = rep
                }
                edge.source.outgoingEdges.remove(edge)
                edge.target.outgoingEdges.remove(edge)
            }
            
        }
    }

}
