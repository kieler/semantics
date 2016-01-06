package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.core.kgraph.KEdge

class LinkSynthesis  {
	
	 @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions
    
	def KEdge transform(Link link) {
		 //val edge = link.createEdge().associateWith(link);
		val edge = createEdge();
		
//        edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        
        // Connect with states
        edge.source = link.source.node
        edge.target = link.target.node
        
        return edge;
        
	}
	
	
}