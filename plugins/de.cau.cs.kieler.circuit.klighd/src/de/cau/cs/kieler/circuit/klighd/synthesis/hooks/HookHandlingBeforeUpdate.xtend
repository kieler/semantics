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

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KPolyline
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.krendering.KRendering

/**
 * This class interprets the hooks of the diagram when it is created.
 * Every updateHookAction has to be registered here with the boolean value of the hook.
 * The parameter optionPairs is created in CircuitDiagramSynthesis.transform
 * @author fry
 */
class HookHandlingBeforeUpdate {
    @Inject extension KRenderingExtensions
    
    
    def updateDigram(KNode rootNode, List<Pair<String, Boolean>> optionPairs) {
        for(optionPair : optionPairs){
            switch(optionPair.key){
                case TickWireHook.ID : handleTickWireHook(optionPair.value,rootNode)
                case ResetWireHook.ID : handleResetWireHook(optionPair.value,rootNode)
                case ShowEntireCircuitHook.ID : handleShowEntireCircuitHook(optionPair.value,rootNode)
            }
        }
    }
    
    private def  handleShowEntireCircuitHook(Boolean hook, KNode rootNode) {
        val frame = rootNode.children.get(0)
        if (!hook) {
            frame.getKRendering.invisible = true;
            frame.labels.head.KRendering.invisible = true;
        } else {
            frame.getKRendering.invisible = false;
            frame.labels.head.KRendering.invisible = false;
        }

        for (KNode node : frame.children) {
           

            if (node.labels.length > 0) {
                val nodeLabel = node.labels.head.text

                if (!(nodeLabel == "Program Logic")) {

                    if (!hook) {
                        node.getKRendering.invisible = true;
                        if (!node.eContents.empty) {
                            changeVisibilityOfAllKGraphElements(node, true)
//                            hideAllKGraphElements(node)
                        }

                    }
                    if (hook) {
                        node.getKRendering.invisible = false;
                        if (!node.eContents.empty) {
                            changeVisibilityOfAllKGraphElements(node, false)
//                            showAllKGraphElements(node)
                        }
                    }
                }
            }
        }
    }
    
    private def  handleResetWireHook(Boolean hook, KNode rootNode) {
        for (KPort port : rootNode.eAllContents.filter(KPort).toIterable) {

                if (port.labels.length > 0) {
                    val portLabel = port.labels.head.text
                    
                    if (portLabel == "Reset_pre") {
                        
                        if (!hook) {
                            port.edges.forEach [ edge |
                                edge.getKRendering.invisible = true;
                                for (KPolyline line : edge.eAllContents.filter(KPolyline).toIterable) {
                                    val rend = line.getJunctionPointRendering()
                                    rend.invisible = true
                                }
                            ]
                        }
                        if (hook) {
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
    }
    
    private def handleTickWireHook(Boolean hook, KNode rootNode) {
        for (KPort port : rootNode.eAllContents.filter(KPort).toIterable) {

                if (port.labels.length > 0) {
                    val portLabel = port.labels.head.text
                    if (portLabel.equals("Tick")) {
                        if (!hook) {
                            port.edges.forEach [ edge |
                                edge.getKRendering.invisible = true;
                                for (KPolyline line : edge.eAllContents.filter(KPolyline).toIterable) {
                                    val rend = line.getJunctionPointRendering()
                                    rend.invisible = true
                                }
                            ]
                        }
                        if (hook) {
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
    }
    
    private def changeVisibilityOfAllKGraphElements(KGraphElement elem, boolean invisible) {
        if(elem instanceof KNode){
                for(KEdge edge : elem.incomingEdges){
                    edge.KRendering.invisible = invisible;
                }
            }
        for (KGraphElement content : elem.eAllContents.filter(KGraphElement).toIterable) {
            content.KRendering.invisible = invisible
            for (KRendering rend : content.KRendering.eAllContents.filter(KRendering).toIterable) {
                rend.invisible = invisible
            }
            if (content instanceof KEdge) {
                for (KPolyline line : content.eAllContents.filter(KPolyline).toIterable) {
                    val rend = line.getJunctionPointRendering()
                    rend.invisible = invisible
                }
            }

        }
    }
    
    
}