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
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncMetaModelTypeFactory extends StatechartMetaModelTypeFactory {

	/** SyncCharts Elements ids **/
	public static final String NORMAL_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.normaltransition";
	public static final String STRONG_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.strongtransition";
	public static final String WEAK_TRANSITION_ID = "de.cau.cs.kieler.yakindu.ui.editor.weaktransition";
	public static final String SYNC_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.state";
	public static final String SYNC_INITIAL_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.initialstate";
	public static final String SYNC_FINAL_STATE_ID = "de.cau.cs.kieler.yakindu.ui.editor.finalstate";

	/** SyncCharts Elements icons **/
	public static final String ICON_STATE = "icons/obj16/State-16.png";
	public static final String ICON_INIT_STATE = "icons/obj16/Initial-State-16.png";
	public static final String ICON_FINAL_STATE = "icons/obj16/Final-State-16.png";
	public static final String ICON_NORMAL_TRANSITION = "icons/obj16/normal-termination-16.png";
	public static final String ICON_WEAK_TRANSITION = "icons/obj16/transition-16.png";
	public static final String ICON_STRONG_TRANSITION = "icons/obj16/strong-abortion-16.png";

	/** SyncCharts Elements names **/
	public static final String NAME_STATE = "State";
	public static final String NAME_INIT_STATE = "Initial State";
	public static final String NAME_FINAL_STATE = "Final State";
	public static final String NAME_NORMAL_TRANSITION = "Normal Termination";
	public static final String NAME_WEAK_TRANSITION = "Weak Abortion";
	public static final String NAME_STRONG_TRANSITION = "Strong Abortion";

	/**
	 * The transitionEditHelper allows the creation of different transition
	 * types (weak abortion, strong abortion, and normal termination).
	 */
	@Inject
	private Provider<SyncTransitionEditHelper> transitionEditHelper;

	/**
	 * The stateEditHelper allows the creation of initial state, state, and
	 * final states.
	 */
	@Inject
	private Provider<SyncStateEditHelper> stateEditHelper;

	@Override
	protected void registerCustomElementTypes(IMetaModelTypeAcceptor acceptor) {
		registerSyncTransition(acceptor);
		registerSyncState(acceptor);
	}

	/**
	 * Register the SyncState to the elements used to create a SyncCharts.
	 * Register the element id and the icon name.
	 * 
	 * @param acceptor
	 */
	private void registerSyncState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SYNC_STATE_ID,
				getUrlFromBundle(ICON_STATE), NAME_STATE,
				SyncgraphPackage.Literals.SYNC_STATE, stateEditHelper.get(),
				SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_INITIAL_STATE_ID,
				getUrlFromBundle(ICON_INIT_STATE), NAME_INIT_STATE,
				SyncgraphPackage.Literals.SYNC_STATE, stateEditHelper.get(),
				SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_FINAL_STATE_ID,
				getUrlFromBundle(ICON_FINAL_STATE), NAME_FINAL_STATE,
				SyncgraphPackage.Literals.SYNC_STATE, stateEditHelper.get(),
				SemanticHints.STATE));
	}

	/**
	 * Register the SyncTransition to the elements used to create a SyncCharts.
	 * Register the element id and the icon name.
	 * 
	 * @param acceptor
	 */
	protected void registerSyncTransition(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(NORMAL_TRANSITION_ID,
				getUrlFromBundle(ICON_NORMAL_TRANSITION),
				NAME_NORMAL_TRANSITION,
				SyncgraphPackage.Literals.SYNC_TRANSITION, transitionEditHelper
						.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(STRONG_TRANSITION_ID,
				getUrlFromBundle(ICON_STRONG_TRANSITION),
				NAME_STRONG_TRANSITION,
				SyncgraphPackage.Literals.SYNC_TRANSITION, transitionEditHelper
						.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(WEAK_TRANSITION_ID,
				getUrlFromBundle(ICON_WEAK_TRANSITION), NAME_WEAK_TRANSITION,
				SyncgraphPackage.Literals.SYNC_TRANSITION, transitionEditHelper
						.get(), SemanticHints.TRANSITION));
	}

	/**
	 * Returns the URL of a path.
	 * 
	 * @param imageFilePath
	 *            the image file path
	 * @return URL
	 */
	protected URL getUrlFromBundle(String imageFilePath) {
		URL result = FrameworkUtil.getBundle(this.getClass())
				.getBundleContext().getBundle().getEntry(imageFilePath);
		if (result == null) {
			try {
				result = new URL(imageFilePath);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
