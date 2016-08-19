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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.circuit.klighd.CircuitDiagramSynthesis

/**
 * This class hides and unhides the tick wires of the circuit.
 * @author fry
 * 
 */
@ViewSynthesisShared
class TickWireHook extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions


    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.TickWireHook"
    public static final SynthesisOption SHOW_TICK_WIRES = SynthesisOption.createCheckOption("Tick wires.", true).
        setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(TickWireHook.ID);

        override executeAction(ActionContext context) {
            var KNode rootNode = context.KNode
        while(rootNode.eContainer != null){
            rootNode = rootNode.eContainer as KNode
        }
                val KNode logicRegion = rootNode.children.head.children.filter[labels.head.text == "Program Logic"].head
        
            for (KPort port : logicRegion.eAllContents.filter(KPort).toIterable) {

                if (port.labels.length > 0) {
                    val portLabel = port.labels.head.text
                    if (portLabel.equals("Tick")) {
                        if (!SHOW_TICK_WIRES.getBooleanValue) {
                            port.edges.forEach [ edge |
                                edge.getKRendering.invisible = true;
                                for (KPolyline line : edge.eAllContents.filter(KPolyline).toIterable) {
                                    val rend = line.getJunctionPointRendering()
                                    rend.invisible = true
                                }
                            ]
                        }
                        if (SHOW_TICK_WIRES.booleanValue) {
                            port.edges.forEach [ edge |
                                edge.getKRendering.invisible = false;
                                for (KPolyline line : edge.eAllContents.filter(KPolyline).toIterable) {
                                    val rend = line.getJunctionPointRendering()
                                    rend.invisible = false
                                }
                            ]
                        }
                    }
                }
            }
            return IAction$ActionResult.createResult(false);
        }

        def getBooleanValue(SynthesisOption option) {
            return parent.getBooleanValue(option);
        }

        def static getDisplayedSynthesisOptions() {
            return newLinkedList(SHOW_TICK_WIRES)
        }

    }
    