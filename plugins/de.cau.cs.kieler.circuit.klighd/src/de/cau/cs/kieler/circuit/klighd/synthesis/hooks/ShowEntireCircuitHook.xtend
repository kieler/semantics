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
import de.cau.cs.kieler.core.kgraph.KGraphFactory
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * This class hides and unhides several parts of the circuit. 
 * @author fry
 * 
 */
@ViewSynthesisShared
class ShowEntireCircuitHook extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions

    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.ShowEntireCircuitHook"
    public static final SynthesisOption SHOW_ENTIRE_CIRCUIT = SynthesisOption.createCheckOption("Entire Circuit.",
        false).setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(ShowEntireCircuitHook.ID);
    
    private KNode zoomInFrame = KGraphFactory.eINSTANCE.createKNode;
    private KNode zoomOutFrame = KGraphFactory.eINSTANCE.createKNode;
    
     override executeAction(ActionContext context) {
            val KNode rootNode = context.KNode

        val frame = rootNode.children.get(0)
        
        zoomOutFrame = frame;
        if (!SHOW_ENTIRE_CIRCUIT.getBooleanValue) {
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

                    if (!SHOW_ENTIRE_CIRCUIT.getBooleanValue) {
                        node.getKRendering.invisible = true;
                        if (!node.eContents.empty) {
                            changeVisibilityOfAllKGraphElements(node, true)
//                            hideAllKGraphElements(node)
                        }

                    }
                    if (SHOW_ENTIRE_CIRCUIT.booleanValue) {
                        node.getKRendering.invisible = false;
                        if (!node.eContents.empty) {
                            changeVisibilityOfAllKGraphElements(node, false)
//                            showAllKGraphElements(node)
                        }
                    }
                }
                else {
                    //make "program Logic" the zoomFrame
                    zoomInFrame = node
                }
            }
        }
        
        if(SHOW_ENTIRE_CIRCUIT.booleanValue){
                   context.getActiveViewer().centerOn(zoomOutFrame,1000);
//                   context.getActiveViewer().zoomToLevel(10,1000)
            
        }
        if(!SHOW_ENTIRE_CIRCUIT.booleanValue){
            
                   context.getActiveViewer().centerOn(zoomInFrame,1000);
//                    context.getActiveViewer().zoomToLevel(10,1000)
                   
        }
        
        return IAction.ActionResult.createResult(false);
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

   

   

    def getBooleanValue(SynthesisOption option) {
        return parent.getBooleanValue(option);
    }

    def static getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_ENTIRE_CIRCUIT)
    }
    
//    override additionalActions(ActionContext context){
//        if(SHOW_ENTIRE_CIRCUIT.booleanValue){
//                   context.getActiveViewer().centerOn(zoomOutFrame,0);
//                   context.getActiveViewer().zoomToLevel(10,1000)
//            
//        }
//        if(!SHOW_ENTIRE_CIRCUIT.booleanValue){
//            
//                   context.getActiveViewer()
////                   .zoom(ZOOM_TO_FOCUS,1000)
//                   .centerOn(zoomInFrame,0);
//                    context.getActiveViewer().zoomToLevel(10,1000)
//                   
//        }
//        return IAction.ActionResult.createResult(true);
//    }

}
