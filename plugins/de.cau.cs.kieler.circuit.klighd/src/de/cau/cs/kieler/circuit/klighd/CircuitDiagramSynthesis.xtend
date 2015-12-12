package de.cau.cs.kieler.circuit.klighd

import javax.inject.Inject

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

import static de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

import de.cau.cs.kieler.circuit.*
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.kiml.options.LayoutOptions
import java.util.EnumSet
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.kiml.util.KimlUtil

class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Circuit> {

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Circuit model) {
		val root = model.createNode().associateWith(model);

		model.nodes.forEach[n|root.children += transformNodes(n)]

		return root;
	}

	private def KNode transformNodes(Node node) {
		val circNode = node.createNode().associateWith(node);
		circNode.addRoundedRectangle(4, 4, 2);
		circNode.addInsideBottomCenteredNodeLabel(node.getName(), KlighdConstants.DEFAULT_FONT_SIZE,
			KlighdConstants.DEFAULT_FONT_NAME);
		circNode.addOutsideBottomLeftNodeLabel(node.getName() + "_" + node.nodeID);
		circNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
			EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

		val inputList = node.inputPorts;
		val outputList = node.outputPorts;

		for (port : inputList) {
			circNode.ports += port.createPort => [
				it.setPortSize(5, 5);
				it.addLayoutParam(LayoutOptions::OFFSET, 0.0f);
				it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST);
			]
		}
		for (port : outputList) {
			circNode.ports += port.createPort => [
				it.setPortSize(5, 5);
				it.addLayoutParam(LayoutOptions::OFFSET, 0.0f);
				it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::WEST);
			]
		}
		return circNode;
	}

	private def KEdge transformLinks(Link link) {

		val circLink = link.createEdge.associateWith(link)
		val label = KimlUtil.createInitializedLabel(circLink);
		// val labelText = link.name;
		val labelText = link.source.id;
		label.configureCenterEdgeLabel(labelText, KlighdConstants.DEFAULT_FONT_SIZE, KlighdConstants.DEFAULT_FONT_NAME);

		//circLink.targetPort = ;

		//////////MAYBE a Porttransformation would be better... :D 
	
	
		return circLink
	}

}
