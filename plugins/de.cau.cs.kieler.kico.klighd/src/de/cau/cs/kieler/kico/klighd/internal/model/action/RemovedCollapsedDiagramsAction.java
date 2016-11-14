/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal.model.action;

import org.eclipse.elk.core.klayoutdata.KLayoutDataFactory;
import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KGraphFactory;
import org.eclipse.elk.graph.KNode;

import com.google.inject.Guice;

import de.cau.cs.kieler.kico.klighd.internal.model.ModelChain;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;

/**
 * Removes all collapsed model from the model chain and hide surrounding boxes.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class RemovedCollapsedDiagramsAction implements IAction {

	/** The action ID. */
	public static final String ID = "de.cau.cs.kieler.kico.klighd.internal.model.action.RemovedCollapsedDiagramsAction";

	private static final KRenderingExtensions rendering = Guice.createInjector()
			.getInstance(KRenderingExtensions.class);

	/**
	 * {@inheritDoc}
	 */
	public ActionResult execute(final ActionContext context) {
		ModelChain modelChain = (ModelChain) context.getViewContext().getInputModel();
		KNode rootNode = context.getViewContext().getViewModel();

		rootNode.getChildren().removeIf(node -> !context.getContextViewer().isExpanded(node));
		if (!modelChain.isBlankMode()) {
			for (int i = 0; i < rootNode.getChildren().size(); i++) {
				KNode node = rootNode.getChildren().get(i);
				KContainerRendering container = node.getData(KContainerRendering.class);
				rendering.setInvisible(container, true);
				for (KRendering child : container.getChildren()) {
					rendering.setInvisible(child, true);
				}
				KEdge edge = node.getOutgoingEdges().get(0);
				if (edge != null) {
					edge.getLabels().clear();
					KPolyline line = edge.getData(KPolyline.class);
					rendering.setInvisible(line, true);
					rendering.setInvisible(line.getChildren().get(0), true);
				}
				edge = KGraphFactory.eINSTANCE.createKEdge();
				edge.setSource(node);
				edge.getData().add(KLayoutDataFactory.eINSTANCE.createKEdgeLayout());
				KPolyline line = KRenderingFactory.eINSTANCE.createKPolyline();
				rendering.setInvisible(line, true);
				edge.getData().add(line);
				if (i + 1 < rootNode.getChildren().size()) {
					edge.setTarget(rootNode.getChildren().get(i + 1));
				}
			}
		}

		return ActionResult.createResult(true);
	}

}
