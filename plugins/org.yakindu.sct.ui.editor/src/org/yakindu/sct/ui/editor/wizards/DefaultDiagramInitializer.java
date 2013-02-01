/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.wizards;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.sct.model.sgraph.Entry;
import org.yakindu.sct.model.sgraph.EntryKind;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.SGraphFactory;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.ui.editor.providers.SemanticHints;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class DefaultDiagramInitializer implements IDiagramInitializer {

	private static final int INITIAL_REGION_WIDTH = 400;
	private static final int INITIAL_REGION_HEIGHT = 400;
	private static final String INITIAL_REGION_NAME = "main region";

	private static final int INITIAL_TEXT_COMPARTMENT_X = 10;
	private static final int INITIAL_TEXT_COMPARTMENT_Y = 10;
	private static final int INITIAL_TEXT_COMPARTMENT_HEIGHT = 400;
	private static final int INITIAL_TEXT_COMPARTMENT_WIDTH = 200;

	private static final int SPACING = 10;

	private SGraphFactory factory = SGraphFactory.eINSTANCE;

	public void initModel(Statechart statechart, Diagram diagram, PreferencesHint preferencesHint) {
		// Create a statechart
		// Create an initial region
		Region region = factory.createRegion();
		region.setName(INITIAL_REGION_NAME);
		statechart.getRegions().add(region);
		Node regionView = ViewService.createNode(diagram, region, SemanticHints.REGION, preferencesHint);
		setRegionViewLayoutConstraint(regionView);
		// // Create an initial state
		Entry initialState = factory.createEntry();
		initialState.setKind(EntryKind.INITIAL);
		region.getVertices().add(initialState);
		Node initialStateView = ViewService.createNode(getRegionCompartmentView(regionView), initialState,
				SemanticHints.ENTRY, preferencesHint);
		setInitialStateViewLayoutConstraint(initialStateView);
		// Create the first state
		State state = factory.createState();
		region.getVertices().add(state);
		Node stateNode = ViewService.createNode(getRegionCompartmentView(regionView), state, SemanticHints.STATE,
				preferencesHint);
		setStateViewLayoutConstraint(stateNode);
		// Create the transition from Initial State to State
		Transition transition = factory.createTransition();
		transition.setSource(initialState);
		transition.setTarget(state);
		initialState.getOutgoingTransitions().add(transition);
		ViewService.createEdge(initialStateView, stateNode, transition, SemanticHints.TRANSITION, preferencesHint);
		createTextCompartment(statechart, diagram, preferencesHint);

	}

	/**
	 * Create the textcompartment for events / variables
	 */
	protected void createTextCompartment(Statechart statechart, Diagram diagram, PreferencesHint preferencesHint) {
		Node textCompartment = ViewService.createNode(diagram, statechart, SemanticHints.STATECHART_TEXT,
				preferencesHint);
		setTextCompartmentLayoutConstraint(textCompartment);
	}

	private static void setStateViewLayoutConstraint(Node stateNode) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(40);
		bounds.setY(80);
		stateNode.setLayoutConstraint(bounds);
	}

	private static void setInitialStateViewLayoutConstraint(Node initialStateView) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(70);
		bounds.setY(20);
		initialStateView.setLayoutConstraint(bounds);
	}

	private static View getRegionCompartmentView(View regionView) {
		return (View) regionView.getChildren().get(1);
	}

	private static void setTextCompartmentLayoutConstraint(Node textCompartment) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(INITIAL_TEXT_COMPARTMENT_X);
		bounds.setY(INITIAL_TEXT_COMPARTMENT_Y);
		bounds.setHeight(INITIAL_TEXT_COMPARTMENT_HEIGHT);
		bounds.setWidth(INITIAL_TEXT_COMPARTMENT_WIDTH);
		textCompartment.setLayoutConstraint(bounds);
	}

	private static void setRegionViewLayoutConstraint(Node regionView) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		bounds.setX(INITIAL_TEXT_COMPARTMENT_WIDTH + INITIAL_TEXT_COMPARTMENT_X + SPACING);
		bounds.setY(INITIAL_TEXT_COMPARTMENT_Y);
		bounds.setHeight(INITIAL_REGION_HEIGHT);
		bounds.setWidth(INITIAL_REGION_WIDTH);
		regionView.setLayoutConstraint(bounds);
	}

}
