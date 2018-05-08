package de.cau.cs.kieler.cview.klighd

import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.KLighDController
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil
import java.util.ArrayList
import java.util.HashSet

/** 
 * This class performs an action to highlight edges and nodes that are selected.
 * 
 * @author cmot
 */
class HighlightEdgesAction implements IAction {
	
	
	/** The action ID. */
    public static final String ID = "de.cau.cs.kieler.cview.HighlightEdgesAction";

	
	/** 
	 * Sets the alpha of an element to the desired value
	 * @param elem The graph element to change the alpha value
	 * @param alpha The alpha value
	 * @param considerChildren whether children should be considered when changing the alpha value
	 */
	def void setAlpha(KGraphElement elem, int alpha, boolean considerChildren) {
		val kRendering = elem.getData(typeof(KRendering))
		setRenderingAlpha(kRendering, alpha)
		if(considerChildren) {
			if(kRendering instanceof KContainerRendering) {
				for(child : kRendering.children) {
					setRenderingAlpha(child, alpha)
				}
			}
		}
	}
	
	/** 
	 * Sets the alpha of a rendering element
	 * @param kRendering The rendering to change the alpha value
	 * @param alpha The alpha value
	 */
	def setRenderingAlpha(KRendering kRendering, int alpha) {
		for(style : kRendering.styles) {
			if(style instanceof KForeground) {
				style.alpha = alpha
				style.targetAlpha = alpha 
			}
			if(style instanceof KBackground) {
				style.alpha = alpha
				style.targetAlpha = alpha
			}
		}
	}
	
	
	override execute(ActionContext context) {
		// Only highlight selection if option is active
		if(CViewPlugin.highlightSelection) {
			// Get the selected node
	        val domainElement = context.getDomainElement(context.getKNode());
	        val node = context.getKNode();
	        
	        if(domainElement instanceof Component) {
		        // The connections of the component
		        val connections = newHashSet
	        	// The edges representing all connections of the model
	        	val kEdges = new ArrayList<KEdge>()
	        	// All components connected to the selected node
	        	val comps = new HashSet<Component>()
	        	comps.add(domainElement)
	        	
	        	kEdges.addAll(node.incomingEdges)
	        	kEdges.addAll(node.outgoingEdges)
	        	
	        	// Add the connections represented by the edges connected to the clicked KNode.
	        	// This is required as the connected KEdge will only be the first (not the whole 
	        	// connection towards the neighboring node. Also, if only the connection of the 
	        	// component corresponding to the clicked KNode is regarded, connections from child 
	        	// nodes will be completely ignored when clicking on a parent node
	        	for(kEdge : kEdges) {
	        		connections.add(context.viewContext.getSourceElement(kEdge))
	        	}
	        	
	        	// Change all connected connections and components to alpha = 255 and all 
	        	// not connected connections and components to alpha = 100
	        	for(connection : KLighDController.model.connections) {
	        		if(connections.contains(connection)) {
	        			// Get the Graph Elements (edges, arrows, ports) corresponding to a connection
	        			for(elem : context.viewContext.getTargetElements(connection)) {
	        				if(elem instanceof KGraphElement) {
		        				setAlpha(elem, 255, true)
	        				}
	        				// And add all components connected to this edge
	        				if(elem instanceof KEdge) {
	        					comps.add(context.getDomainElement(elem.target))
	        					comps.add(context.getDomainElement(elem.source))
	        				}
	        			}
	        		} else {
	        			// Get all graph elements (edges, arrow, ports) corresponding to a connection
	        			for(elem : context.viewContext.getTargetElements(connection)) {
	        				if(elem instanceof KGraphElement) {
		        				setAlpha(elem, 70, true)
	        				}
	        			}
	        		}
	        	}
	        	
	        	// Change the alpha of all components
		        for(comp : KLighDController.model.components) {
		        	var alpha = 255
		        	// If the component is not connected, change the alpha to 100
		        	if(!comps.contains(comp)) {
		        		alpha = 100 
		        	}
		        	
		        	// Get the KNode corresponding to the component
		        	val elems = context.viewContext.getTargetElements(comp)
		        	for(elem : elems) {
		        		// Find whether we want to change the alpha. "White" nodes are the background nodes inside
		        		// a node. We do not want to change their alpha, thus we need to filter them out.
		        		if(elem instanceof KGraphElement) {
		        			val styles = elem.getData(typeof(KRendering)).styles
		        			for(style : styles) {
		        				if(style instanceof KBackground) {
		        					if(style != null && style.color != KRenderingUtil.getColor("WHITE")) {
		        						elem.setAlpha(alpha, true)
		        					}
		        				}
		        			}
		        		}
		        	}
		        }
	
	        }
			
		}
        
        return ActionResult.createResult(false);
	}
	
}