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
 * This class hides and unhides the reset wires of the circuit.
 * @author fry
 * 
 */
@ViewSynthesisShared
class ResetWireHook extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions


    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.ResetWireHook"
    public static final SynthesisOption SHOW_RESET_WIRES = SynthesisOption.createCheckOption("Reset wires.", true).
        setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(ResetWireHook.ID);

        override executeAction(KNode rootNode) {

            for (KPort port : rootNode.eAllContents.filter(KPort).toIterable) {

                if (port.labels.length > 0) {
                    val portLabel = port.labels.head.text
                    
                    if (portLabel == "Reset_pre") {
                        
                        if (!SHOW_RESET_WIRES.getBooleanValue) {
                            port.edges.forEach [ edge |
                                edge.getKRendering.invisible = true;
                                for (KPolyline line : edge.eAllContents.filter(KPolyline).toIterable) {
                                    val rend = line.getJunctionPointRendering()
                                    rend.invisible = true
                                }
                            ]
                        }
                        if (SHOW_RESET_WIRES.booleanValue) {
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
            return newLinkedList(SHOW_RESET_WIRES)
        }

    }
    