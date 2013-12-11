/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.klighd

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.ktm.extensions.TranformationMappingGraphUtility
import de.cau.cs.kieler.ktm.transformationmappinggraph.Model
import java.util.List
import javax.inject.Inject
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation
import de.cau.cs.kieler.klighd.KlighdConstants
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for Transformation Mapping Graphs.
 * 
 * @author als
 */
class ModelTransformationGraphDiagramSynthesis extends AbstractDiagramSynthesis<Model> {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KEdgeExtensions

	@Inject
	extension KPortExtensions

	@Inject
	extension KLabelExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KColorExtensions

	@Inject
	extension TranformationMappingGraphUtility

	// -------------------------------------------------------------------------
	// Display options
	private static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);

	override public getDisplayedSynthesisOptions() {
		return newLinkedList(SHOW_SHADOW);
	}

	override public getDisplayedLayoutOptions() {
		return newLinkedList(
			new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList),
			new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, newImmutableList(Direction::DOWN, Direction::RIGHT)),
			new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 255))
		);
	}

	// -------------------------------------------------------------------------
	// Some color and pattern constants
	private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
		[it.red = 248; it.green = 249; it.blue = 253];
	private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
		[it.red = 205; it.green = 220; it.blue = 243];

	// -------------------------------------------------------------------------
	// The Main entry transform function
	/**
     * Each Model is a element in a tree as doubly linked list.
     * This will transform the full tree and not only this single element.
     */
	override KNode transform(Model model) {
		val root = model.createNode();
		var rootModel = model.root;

		// currently only overview of transformation tree is available
		if (rootModel.transformedInto.empty) {//no transformations
			model.transformModelAsChildNode(root);
		} else {
			//iterate over all transformations and create nodes and edges
			rootModel.succeedingTransformations.forEach [ ModelTransformation trans |
				trans.createEdge() => [
					it.source = trans.source.transformModelAsChildNode(root);
					it.target = trans.target.transformModelAsChildNode(root);
					it.addPolyline.addArrowDecorator;
					it.createLabel.configureCenteralEdgeLabel(trans.id ,
						KlighdConstants::DEFAULT_FONT_SIZE, KlighdConstants::DEFAULT_FONT_NAME);
				]
			];
		}

		return root;
	}

	def KNode create node : createNode() transformModelAsChildNode(Model model, KNode root) {
		node.putToLookUpWith(model);

		//Model's visualization like States in SCCharts
		val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
		figure.lineWidth = 1;
		figure.foreground = "gray".color;
		figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

		if (SHOW_SHADOW.booleanValue) {
			figure.shadow = "black".color;
			figure.shadow.XOffset = 4;
			figure.shadow.YOffset = 4;
		}
		
		node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);

		figure.addText(model.name).putToLookUpWith(model) => [
			it.fontSize = 11;
			it.setFontBold(true);
			it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
		];

		//add child once to root
		root.children += node;
	}

}
