/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
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
 * This class extends the DefaultDiagramInitializer to change the default
 * diagram created initially. This class is called when a new model is created.
 * The default diagram is composed of a main region, a main State and its
 * contained region.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncDiagramInitializer extends DefaultDiagramInitializer {

	private static final int INITIAL_REGION_X = 10;
	private static final int INITIAL_REGION_Y = 10;
	private static final int INITIAL_REGION_WIDTH = 800;
	private static final int INITIAL_REGION_HEIGHT = 400;
	private static final String INITIAL_REGION_NAME = "main region";
	private static final String INITIAL_STATE_NAME = "main region";

	private SGraphFactory factory = SGraphFactory.eINSTANCE;
	private SyncgraphFactory syncfactory = SyncgraphFactory.eINSTANCE;

	/**
	 * Remove the text compartment from the editor. The text compartment is the
	 * compartment located on the left side in yakindu sct editor were the
	 * declarations are made. This feature is no more needed in the new editor
	 * while the declarations are made whitin the state scope.
	 */
	@Override
	protected void createTextCompartment(Statechart statechart,
			Diagram diagram, PreferencesHint preferencesHint) {
	}

	/**
	 * This method initialize the default SyncCharts model. This invisible
	 * Statechart holds a root region. The root region holds the main state
	 * which holds a region.
	 */
	@Override
	public void initModel(Statechart statechart, Diagram diagram,
			PreferencesHint preferencesHint) {
		// Create a root Region.
		Region rootRegion = factory.createRegion();
		// add the root Region to the Statechart
		statechart.getRegions().add(rootRegion);
		Node regionView = ViewService.createNode(diagram, rootRegion,
				SemanticHints.REGION, preferencesHint);
		setRegionViewLayoutConstraint(regionView);

		// Create the root State
		SyncState mainState = syncfactory.createSyncState();
		mainState.setName(statechart.getName());

		// create the state region
		Region region = factory.createRegion();
		mainState.getRegions().add(region);
		region.setName(INITIAL_REGION_NAME);
		rootRegion.getVertices().add(mainState);
		Node stateNode = ViewService.createNode(
				getRegionCompartmentView(regionView), mainState,
				SemanticHints.STATE, preferencesHint);
		setStateViewLayoutConstraint(stateNode);

	}

	/**
	 * This method defines the Region view layout constraint.
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

	/**
	 * This method returns the region compartment view.
	 * 
	 * @param regionView
	 * @return
	 */
	private static View getRegionCompartmentView(View regionView) {
		return (View) regionView.getChildren().get(1);
	}

	/**
	 * This method defines the default State View Layout constraint.
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
