/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.yakindu.ui.editor.factory;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.SGraphFactory;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.ui.editor.providers.SemanticHints;
import org.yakindu.sct.ui.editor.wizards.DefaultDiagramInitializer;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory;

/**
 * Create a default diagram. This class is called when a new model is created.
 * 
 * @author wah
 * 
 */
public class SyncDiagramInitializer extends DefaultDiagramInitializer {

	private static final int INITIAL_REGION_X = 10;
	private static final int INITIAL_REGION_Y = 10;
	private static final int INITIAL_REGION_WIDTH = 800;
	private static final int INITIAL_REGION_HEIGHT = 400;
	private static final String INITIAL_REGION_NAME = "main region";

	private SGraphFactory factory = SGraphFactory.eINSTANCE;
	private SyncgraphFactory syncfactory = SyncgraphFactory.eINSTANCE;

	/**
	 * Remove the text compartment from the editor
	 */
	@Override
	protected void createTextCompartment(Statechart statechart,
			Diagram diagram, PreferencesHint preferencesHint) {
	}

	@Override
	public void initModel(Statechart statechart, Diagram diagram,
			PreferencesHint preferencesHint) {
		// Create an root Region
		Region region = factory.createRegion();
		// add the root Region to the Statechart
		statechart.getRegions().add(region);
		Node regionView = ViewService.createNode(diagram, region,
				SemanticHints.REGION, preferencesHint);
		setRegionViewLayoutConstraint(regionView);

		// Create the root State
		SyncState state = syncfactory.createSyncState();
		state.setName(statechart.getName());

		// create the state region
		Region stateregion = factory.createRegion();
		state.getRegions().add(stateregion);
		stateregion.setName(INITIAL_REGION_NAME);
		region.getVertices().add(state);
		Node stateNode = ViewService.createNode(
				getRegionCompartmentView(regionView), state,
				SemanticHints.STATE, preferencesHint);
		setStateViewLayoutConstraint(stateNode);

	}

	/**
	 * This method defines the Region view layout
	 * 
	 * @param regionView
	 */
	private static void setRegionViewLayoutConstraint(Node regionView) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(INITIAL_REGION_X);
		bounds.setY(INITIAL_REGION_Y);
		bounds.setHeight(INITIAL_REGION_HEIGHT);
		bounds.setWidth(INITIAL_REGION_WIDTH);
		regionView.setLayoutConstraint(bounds);
	}

	private static View getRegionCompartmentView(View regionView) {
		return (View) regionView.getChildren().get(1);
	}

	/**
	 * This method defines the default State View Layout
	 * 
	 * @param stateNode
	 */
	private static void setStateViewLayoutConstraint(Node stateNode) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(0);
		bounds.setY(0);
		bounds.setHeight(INITIAL_REGION_HEIGHT - 30);
		bounds.setWidth(INITIAL_REGION_WIDTH - 30);
		stateNode.setLayoutConstraint(bounds);
	}

}
