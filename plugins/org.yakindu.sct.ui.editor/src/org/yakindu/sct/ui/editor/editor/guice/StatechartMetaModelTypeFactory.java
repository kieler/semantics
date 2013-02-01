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
package org.yakindu.sct.ui.editor.editor.guice;

import java.net.MalformedURLException;
import java.net.URL;

import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.edithelper.EntryEditHelper;
import org.yakindu.sct.ui.editor.edithelper.RegionEditHelper;
import org.yakindu.sct.ui.editor.edithelper.StateEditHelper;
import org.yakindu.sct.ui.editor.edithelper.StatechartEditHelper;
import org.yakindu.sct.ui.editor.edithelper.TransitionEditHelper;
import org.yakindu.sct.ui.editor.edithelper.VertexEditHelper;
import org.yakindu.sct.ui.editor.providers.SemanticHints;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

/**
 * Registers all required the {@link HintedMetamodelType}. To add custom element
 * types, you should override registerCustomElementTypes().
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
@Singleton
public class StatechartMetaModelTypeFactory extends
		AbstractMetaModelTypeFactory implements IMetaModelTypeFactory,
		SemanticHints {

	public static final String STATECHART_ID = "org.yakindu.sct.ui.editor.Statechart";
	public static final String REGION_ID = "org.yakindu.sct.ui.editor.Region";
	public static final String STATE_ID = "org.yakindu.sct.ui.editor.State";
	public static final String COMPOSITE_STATE_ID = "org.yakindu.sct.ui.editor.CompositeState";
	public static final String ORTHOGONAL_STATE_ID = "org.yakindu.sct.ui.editor.OrthogonalState";
	public static final String SUBMACHINE_STATE_ID = "org.yakindu.sct.ui.editor.SubmachineState";
	public static final String TRANSITION_ID = "org.yakindu.sct.ui.editor.Transition";
	public static final String CHOICE_ID = "org.yakindu.sct.ui.editor.Choice";
	public static final String ENTRY_ID = "org.yakindu.sct.ui.editor.Entry";
	public static final String DEEPHISTORY_ID = "org.yakindu.sct.ui.editor.DeepHistory";
	public static final String SHALLOWHISTORY_ID = "org.yakindu.sct.ui.editor.ShallowHistory";
	public static final String FINALSTATE_ID = "org.yakindu.sct.ui.editor.FinalState";
	public static final String SYNCHRONIZATION_ID = "org.yakindu.sct.ui.editor.Synchronization";

	@Inject
	protected Provider<StateEditHelper> stateEditHelper;
	@Inject
	protected Provider<VertexEditHelper> vertexEditHelper;
	@Inject
	protected Provider<TransitionEditHelper> transitionEditHelper;
	@Inject
	protected Provider<EntryEditHelper> entryEditHelper;
	@Inject
	protected Provider<StatechartEditHelper> statechartEditHelper;
	@Inject
	protected Provider<RegionEditHelper> regionEditHelper;

	private boolean initialized = false;

	public final void registerElementTypes(IMetaModelTypeAcceptor acceptor) {
		if (initialized)
			return;
		registerStatechart(acceptor);
		registerRegion(acceptor);
		registerState(acceptor);
		registerCompositeState(acceptor);
		registerOrthogonalState(acceptor);
		registerSubmachineState(acceptor);
		registerTransition(acceptor);
		registerChoice(acceptor);
		registerEntry(acceptor);
		registerShallowHistory(acceptor);
		registerDeepHistory(acceptor);
		registerFinalState(acceptor);
		registerSynchronization(acceptor);
		registerCustomElementTypes(acceptor);
		initialized = true;
	}

	/**
	 * Override to add custom MetaModel Types to the Registry
	 * @param acceptor 
	 */
	protected void registerCustomElementTypes(IMetaModelTypeAcceptor acceptor) {

	}

	protected void registerStatechart(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(STATECHART_ID,
				getUrlFromPlugin("icons/obj16/logo-16.png"), "Statechart",
				SGraphPackage.Literals.STATECHART, statechartEditHelper.get(),
				STATECHART));
	}

	protected void registerRegion(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(REGION_ID,
				getUrlFromPlugin("icons/obj16/Region-16.png"), "Region",
				SGraphPackage.Literals.REGION, regionEditHelper.get(), REGION));
	}

	protected void registerState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(STATE_ID,
				getUrlFromPlugin("icons/obj16/State-16.png"), "State",
				SGraphPackage.Literals.STATE, stateEditHelper.get(), STATE));
	}

	protected void registerCompositeState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(COMPOSITE_STATE_ID,
				getUrlFromPlugin("icons/obj16/State-16.png"), "CompositeState",
				SGraphPackage.Literals.STATE, stateEditHelper.get(), STATE));
	}

	protected void registerOrthogonalState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(ORTHOGONAL_STATE_ID,
				getUrlFromPlugin("icons/obj16/State-16.png"),
				"OrthogonalState", SGraphPackage.Literals.STATE,
				stateEditHelper.get(), STATE));
	}

	protected void registerSubmachineState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SUBMACHINE_STATE_ID,
				getUrlFromPlugin("icons/obj16/State-16.png"),
				"SubmachineState", SGraphPackage.Literals.STATE,
				stateEditHelper.get(), STATE));
	}

	protected void registerTransition(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(TRANSITION_ID,
				getUrlFromPlugin("icons/obj16/transition-16.png"),
				"Transition", SGraphPackage.Literals.TRANSITION,
				transitionEditHelper.get(), TRANSITION));
	}

	protected void registerChoice(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(CHOICE_ID,
				getUrlFromPlugin("icons/obj16/Choice-16.png"), "Choice",
				SGraphPackage.Literals.CHOICE, vertexEditHelper.get(), CHOICE));
	}

	protected void registerEntry(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(ENTRY_ID,
				getUrlFromPlugin("icons/obj16/Initial-State-16.png"), "Entry",
				SGraphPackage.Literals.ENTRY, entryEditHelper.get(), ENTRY));
	}

	protected void registerShallowHistory(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SHALLOWHISTORY_ID,
				getUrlFromPlugin("icons/obj16/Shallow-History-16.png"),
				"ShallowHistory", SGraphPackage.Literals.ENTRY, entryEditHelper
						.get(), SHALLOWHISTORY));
	}

	protected void registerDeepHistory(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(DEEPHISTORY_ID,
				getUrlFromPlugin("icons/obj16/Deep-History-16.png"),
				"DeepHistory", SGraphPackage.Literals.ENTRY, entryEditHelper
						.get(), DEEPHISTORY));
	}

	protected void registerFinalState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(FINALSTATE_ID,
				getUrlFromPlugin("icons/obj16/Final-State-16.png"),
				"FinalState", SGraphPackage.Literals.FINAL_STATE,
				vertexEditHelper.get(), FINALSTATE));
	}

	protected void registerSynchronization(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SYNCHRONIZATION_ID,
				getUrlFromPlugin("icons/obj16/Final-State-16.png"),
				"Synchronization", SGraphPackage.Literals.SYNCHRONIZATION,
				vertexEditHelper.get(), SYNCHRONIZATION));
	}

	protected URL getUrlFromPlugin(String imageFilePath) {
		URL result = DiagramActivator.getDefault().getBundle()
				.getEntry(imageFilePath);
		if (result == null) {
			try {
				result = new URL(imageFilePath);
			} catch (MalformedURLException e) {
				result = null;
			}
		}
		return result;
	}
}
