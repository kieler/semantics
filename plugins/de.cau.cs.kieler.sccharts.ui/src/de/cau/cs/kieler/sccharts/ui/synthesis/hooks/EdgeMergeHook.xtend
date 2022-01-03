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
import java.util.LinkedList
import de.cau.cs.kieler.klighd.kgraph.KEdge

@ViewSynthesisShared
class EdgeMergeHook extends SynthesisHook {

    
    /** The related synthesis option */
    public static final SynthesisOption MERGE_SIMILAR_EDGES = SynthesisOption.createCheckOption(EdgeMergeHook, "Merge Similar Edges",
            false).setCategory(GeneralSynthesisOptions::APPEARANCE);

    public static final IProperty<Boolean> EDGE_GROUP_REPRESENTATIVE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.edge_merge.is_group_representative", false);
        
    override getDisplayedSynthesisOptions() {
        return newLinkedList(de.cau.cs.kieler.sccharts.ui.synthesis.hooks.EdgeMergeHook.MERGE_SIMILAR_EDGES)
    }

    /** 
     * Invoked after a {@link State} is translated.
     * @param statethe state
     * @param nodethe translated state
     */
    override void processState(State state, KNode node) {
        var list = new LinkedList<KEdge>();
        for (out_edge: node.outgoingEdges) {
            if (out_edge.getProperty(EDGE_GROUP_REPRESENTATIVE) !== MERGE_SIMILAR_EDGES.booleanValue) {
                list.add(out_edge)
            }
        }
        for (edge:list) {
            var target = edge.target;
            target.incomingEdges.remove(edge)
        }
        node.outgoingEdges.removeAll(list)
    }

}