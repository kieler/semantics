package de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend

import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend.KRenderingUtil
import com.google.inject.Inject
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency

class DependencyDiagramSynthesis extends AbstractTransformation<Dependencies, KNode> {
	
	@Inject
	extension KRenderingUtil
	
	override KNode transform(Dependencies model, TransformationContext<Dependencies, KNode> transformationContext) {
		
		val rootNode = KimlUtil::createInitializedNode;
		rootNode.KShapeLayout.setProperty(LayoutOptions::SPACING, Float::valueOf("15.0"));
	    rootNode.KShapeLayout.setProperty(LayoutOptions::DIRECTION, Direction::DOWN);
	    rootNode.KShapeLayout.setProperty(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
		
		val nodes = model.nodes;
		for (node : nodes) {
	    	node.createNodeFigure(rootNode);	
	    }
		
		
		val dependencies = model.dependencies;
		for (dependency : dependencies) {
	    	dependency.createDependencyFigure(rootNode);	
	    }

		
//		classifier.createAssociationConnections;
//		
//		model.filter(typeof(EPackage)).forEach[
//			val classifiers = it.EClassifiers;
//			classifiers.createClassifierFigures(rootNode);
//			classifiers.createAssociationConnections;
//		];
		
		return rootNode;
	}
	
	
def createNodeFigure(Node node, KNode rootNode) {
			val kNode = node.createRoundedRectangulareNode(25, 85);
			kNode.KRendering.add(factory.createKLineWidth.of(2));
			
			val color = factory.createKForegroundColor();
			if (node.id.endsWith("_S")) {
				color.setRed(0);
				color.setBlue(0);
				color.setGreen(0);
			}
			else {
				color.setRed(200);
				color.setBlue(200);
				color.setGreen(200);
			}
			kNode.KRendering.add(color);
			val nodeText = node.id.substring(0,node.id.length - 2);
			
			
			kNode.KRendering.add(factory.createKText.of(nodeText + " (" + node.priority + ")"));
			rootNode.children.add(kNode)
			return kNode
}
	
	
def createDependencyFigure(Dependency dependency, KNode rootNode) {
	    	
//		val edge = ref.createPolyLineEdge;
//		edge.KRendering.add(factory.createKLineWidth.of(2));
//		val ellipse = factory.createKEllipse;
//
//		val dpd = factory.createKDecoratorPlacementData;
//		dpd.location = Float::valueOf("0.99");
//		dpd.height = 10;
//		dpd.width = 10;
//		dpd.XOffset = -10;
//		dpd.YOffset = -5;
//		ellipse.placementData = dpd;
//		 
//		edge.KRendering.add(ellipse);
//		edge.source = ref.eContainer.node;
//		edge.target = ref.EType.node;
//		ref.eContainer.node.outgoingEdges.add(edge);
	    	
	    	
		val kEdge = dependency.createPolyLineEdge;
		kEdge.KRendering.add(factory.createKLineWidth.of(2));
		val ellipse = factory.createKEllipse;
		
		if (dependency instanceof SignalDependency) {
			val color = factory.createKForegroundColor();
			color.setRed(255);
			kEdge.KRendering.add(color);
		}
		else if (dependency instanceof ControlflowDependency) {
			val color = factory.createKForegroundColor();
			color.setBlue(255);
			kEdge.KRendering.add(color);
		}
		else if (dependency instanceof TransitionDependency) {
			val color = factory.createKForegroundColor();
			color.setGreen(255);
			kEdge.KRendering.add(color);
		}
		
		val dpd = factory.createKDecoratorPlacementData;
		dpd.location = Float::valueOf("0.95");
		dpd.height = 7;
		dpd.width = 7;
		dpd.XOffset = -5;
		dpd.YOffset = -5;
		ellipse.placementData = dpd;
		
			
		kEdge.KRendering.add(ellipse);
		kEdge.source = dependency.sourceNode.createNodeFigure(rootNode);
		kEdge.target = dependency.targetNode.createNodeFigure(rootNode);
		
		kEdge.source.outgoingEdges.add(kEdge);
		
		return kEdge
	}	
	
//	def createAssociationConnections(Iterable<EClassifier> classes) {
//		val list = classes.toList;
//		list.filter(typeof(EClass)).forEach[
//			it.EStructuralFeatures.filter(typeof(EReference))
//			    .filter[list.contains(it.EType)]
//		        .forEach[it.createAssociationConnection]
//		]
//	}
//	
//	def createAssociationConnection(EReference ref) {
//		val edge = ref.createPolyLineEdge;
//		edge.KRendering.add(factory.createKLineWidth.of(2));
//		val ellipse = factory.createKEllipse;
//
//		val dpd = factory.createKDecoratorPlacementData;
//		dpd.location = Float::valueOf("0.99");
//		dpd.height = 10;
//		dpd.width = 10;
//		dpd.XOffset = -10;
//		dpd.YOffset = -5;
//		ellipse.placementData = dpd;
//		 
//		edge.KRendering.add(ellipse);
//		edge.source = ref.eContainer.node;
//		edge.target = ref.EType.node;
//		ref.eContainer.node.outgoingEdges.add(edge);
//	}
}