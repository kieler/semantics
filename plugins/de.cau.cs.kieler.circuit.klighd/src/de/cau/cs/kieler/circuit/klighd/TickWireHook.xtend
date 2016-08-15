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
package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * @author fry
 * 
 */
 @ViewSynthesisShared
class TickWireHook extends SynthesisActionHook implements IAction {

    @Inject
    extension KRenderingExtensions
    extension KRenderingFactory = KRenderingFactory::eINSTANCE

//    @Inject
//    private CircuitDiagramSynthesis parent;
    
    
    public static final String ID = "de.cau.cs.kieler.circuit.klighd.TickWireHook"
    public static final SynthesisOption SHOW_TICK_WIRES = SynthesisOption.createCheckOption("Show tick wires.", true).
        setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(TickWireHook.ID);

       
        override executeAction(KNode rootNode) {
            for (KPort port : rootNode.eAllContents.filter(KPort).toIterable) {
                var tickWire = false;
                if(port.labels.length > 0){
                    val portLabel = port.labels.head.text
                    if(portLabel.equals("Tick")){
                        println("wirree")
                        tickWire = true
                        
                    }
                }
                if (!SHOW_TICK_WIRES.getBooleanValue && tickWire) {
                    println(port + " and " + port.labels.head)
                    port.edges.forEach[edge |
                        edge.KRendering.invisible = true;
                        
                    ]
                    
                } else if (SHOW_TICK_WIRES.booleanValue && !tickWire) {
                     port.edges.forEach[edge |
                        edge.KRendering.invisible = false;
                        
                    ]
                }
            }
            return ActionResult.createResult(true);
        }

        def getBooleanValue(SynthesisOption option) {
            return parent.getBooleanValue(option);
        }
        
        def static getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_TICK_WIRES)
         }

    }
    