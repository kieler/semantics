package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions


class LinkSynthesis extends  AbstractDiagramSynthesis<Link>{
	
	 @Inject
    extension KPortExtensions
    
	 @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions
    	@Inject extension KPolylineExtensions
    
	def KEdge transformLink(Link link) {
		 //val edge = link.createEdge().associateWith(link);
		val edge = createEdge();
		
		switch (link.source) {
					Actor:
						edge.source = link.source.node
					Port: {
						edge.source = link.source.eContainer.node;
						edge.sourcePort = link.source.port
					}
				}

				switch (link.target) {
					Actor:
						edge.target = link.target.node
					Port: {
						edge.target = link.target.eContainer.node;
						edge.targetPort = link.target.port
					}
				}
				edge.addRoundedBendsPolyline(3).addJunctionPointDecorator;
        
        return edge;
        
	}
	
	override transform(Link model) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
}