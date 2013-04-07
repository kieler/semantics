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

import java.net.MalformedURLException;
import java.net.URL;

import org.osgi.framework.FrameworkUtil;
import org.yakindu.sct.ui.editor.editor.guice.StatechartMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.editor.guice.AbstractMetaModelTypeFactory.HintedMetamodelType;
import org.yakindu.sct.ui.editor.providers.SemanticHints;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.ui.editor.helper.SyncStateEditHelper;
import de.cau.cs.kieler.yakindu.ui.editor.helper.SyncTransitionEditHelper;

/**
 * Registers all required the {@link HintedMetamodelType}. To add custom element
 * types, you should override registerCustomElementTypes().
 * 
 * @author wah
 * 
 */
public class SyncMetaModelTypeFactory extends StatechartMetaModelTypeFactory {

	public static final String NORMAL_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.normaltransition";
	public static final String STRONG_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.strongtransition";
	public static final String WEAK_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.weaktransition";

	public static final String SYNC_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.state";
	public static final String SYNC_INITIAL_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.initialstate";
	public static final String SYNC_FINAL_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.finalstate";

	@Inject
	private Provider<SyncTransitionEditHelper> transitionEditHelper;

	@Inject
	private Provider<SyncStateEditHelper> stateEditHelper;

	@Override
	protected void registerCustomElementTypes(IMetaModelTypeAcceptor acceptor) {
		registerSyncTransition(acceptor);
		registerSyncState(acceptor);
	}

	/**
	 * Register the SyncState
	 * 
	 * @param acceptor
	 */
	private void registerSyncState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SYNC_STATE_ID,
				getUrlFromMyPlugin("icons/obj16/State-16.png"), "State",
				SyncgraphPackage.Literals.SYNC_STATE, stateEditHelper.get(),
				SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_INITIAL_STATE_ID,
				getUrlFromMyPlugin("icons/obj16/Initial-State-16.png"),
				"Initial State", SyncgraphPackage.Literals.SYNC_STATE,
				stateEditHelper.get(), SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_FINAL_STATE_ID,
				getUrlFromMyPlugin("icons/obj16/Final-State-16.png"),
				"Final State", SyncgraphPackage.Literals.SYNC_STATE,
				stateEditHelper.get(), SemanticHints.STATE));
	}

	/**
	 * Register the SyncTransition
	 * 
	 * @param acceptor
	 */
	protected void registerSyncTransition(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(NORMAL_TRANSITION_ID,
				getUrlFromMyPlugin("icons/obj16/normal-termination-16.png"),
				"Normal Termination",
				SyncgraphPackage.Literals.SYNC_TRANSITION, transitionEditHelper
						.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(STRONG_TRANSITION_ID,
				getUrlFromMyPlugin("icons/obj16/strong-abortion-16.png"),
				"Strong Abortion", SyncgraphPackage.Literals.SYNC_TRANSITION,
				transitionEditHelper.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(WEAK_TRANSITION_ID,
				getUrlFromMyPlugin("icons/obj16/transition-16.png"),
				"Weak Abortion", SyncgraphPackage.Literals.SYNC_TRANSITION,
				transitionEditHelper.get(), SemanticHints.TRANSITION));
	}

	/**
	 * Returns the URL of a path.
	 * 
	 * @param imageFilePath
	 *            the image file path
	 * @return URL
	 */
	protected URL getUrlFromMyPlugin(String imageFilePath) {
		URL result = FrameworkUtil.getBundle(this.getClass())
				.getBundleContext().getBundle().getEntry(imageFilePath);
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
