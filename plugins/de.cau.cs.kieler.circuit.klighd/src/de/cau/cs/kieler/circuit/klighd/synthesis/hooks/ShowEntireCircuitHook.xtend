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
package de.cau.cs.kieler.circuit.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.klighd.CircuitDiagramSynthesis
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData

/**
 * @author fry
 * 
 */
@ViewSynthesisShared
class ShowEntireCircuitHook extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions

    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.ShowEntireCircuitHook"
    public static final SynthesisOption SHOW_ENTIRE_CIRCUIT = SynthesisOption.createCheckOption("Entire Circuit.",
        false).setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(ShowEntireCircuitHook.ID);

    override executeAction(KNode rootNode) {

        val frame = rootNode.children.get(0)
        
        if (!SHOW_ENTIRE_CIRCUIT.getBooleanValue) {
            frame.getKRendering.invisible = true;
            frame.labels.head.KRendering.invisible = true;
        } else {
            frame.getKRendering.invisible = false;
            frame.labels.head.KRendering.invisible = false;
        }

        for (KNode node : frame.children) {
            println(node.labels.head)

            if (node.labels.length > 0) {
                val nodeLabel = node.labels.head.text

                if (!(nodeLabel == "Program Logic")) {

                    if (!SHOW_ENTIRE_CIRCUIT.getBooleanValue) {
                        node.getKRendering.invisible = true;
                        if (!node.eContents.empty) {
                            hideAllKGraphElements(node)
                        }

                    }
                    if (SHOW_ENTIRE_CIRCUIT.booleanValue) {
                        node.getKRendering.invisible = false;
                        if (!node.eContents.empty) {
                            showAllKGraphElements(node)
                        }
                    }
                }
            }
        }
        return IAction.ActionResult.createResult(false);
    }

    private def void showAllKGraphElements(KGraphElement elem) {
        if(elem instanceof KNode){
                for(KEdge edge : elem.incomingEdges){
                    edge.KRendering.invisible = false;
                }
            }
        for (KGraphElement content : elem.eAllContents.filter(KGraphElement).toIterable) {
            content.KRendering.invisible = false
            for (KRendering rend : content.KRendering.eAllContents.filter(KRendering).toIterable) {
                rend.invisible = false
            }
            if (content instanceof KEdge) {
                for (KPolyline line : content.eAllContents.filter(KPolyline).toIterable) {
                    val rend = line.getJunctionPointRendering()
                    rend.invisible = false
                }
            }

        }
    }

    private def void hideAllKGraphElements(KGraphElement elem) {
        if(elem instanceof KNode){
                for(KEdge edge : elem.incomingEdges){
                    edge.KRendering.invisible = true;
                }
            }
        for (KGraphElement content : elem.eAllContents.filter(KGraphElement).toIterable) {
            content.KRendering.invisible = true
            for (KRendering rend : content.KRendering.eAllContents.filter(KRendering).toIterable) {
                rend.invisible = true
            }
            
            if (content instanceof KEdge) {
                for (KPolyline line : content.eAllContents.filter(KPolyline).toIterable) {
                    val rend = line.getJunctionPointRendering()
                    rend.invisible = true
                }
            }

        }
    }

    def getBooleanValue(SynthesisOption option) {
        return parent.getBooleanValue(option);
    }

    def static getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_ENTIRE_CIRCUIT)
    }

}
