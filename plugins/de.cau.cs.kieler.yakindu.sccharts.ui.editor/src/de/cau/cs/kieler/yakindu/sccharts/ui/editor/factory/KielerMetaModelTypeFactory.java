package de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncgraphPackage;

import org.yakindu.sct.ui.editor.editor.guice.StatechartMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.providers.SemanticHints;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.helper.SyncStateEditHelper;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.helper.SyncTransitionEditHelper;

public class KielerMetaModelTypeFactory extends StatechartMetaModelTypeFactory {

	public static final String NORMAL_TRANSITION_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.normaltransition";
	public static final String STRONG_TRANSITION_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.strongtransition";
	public static final String WEAK_TRANSITION_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.weaktransition";

	public static final String SYNC_STATE_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.state";
	public static final String SYNC_INITIAL_STATE_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.initialstate";
	public static final String SYNC_FINAL_STATE_ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.finalstate";

	@Inject
	private Provider<SyncTransitionEditHelper> transitionEditHelper;

	@Inject
	private Provider<SyncStateEditHelper> stateEditHelper;

	@Override
	protected void registerCustomElementTypes(IMetaModelTypeAcceptor acceptor) {
		registerSyncTransition(acceptor);
		registerSyncState(acceptor);
	}

	private void registerSyncState(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(SYNC_STATE_ID,
				getUrlFromPlugin("icons/obj16/State-16.png"), "State",
				SyncgraphPackage.Literals.SYNC_STATE, stateEditHelper.get(),
				SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_INITIAL_STATE_ID,
				getUrlFromPlugin("icons/obj16/Initial-State-16.png"),
				"Initial State", SyncgraphPackage.Literals.SYNC_STATE,
				stateEditHelper.get(), SemanticHints.STATE));
		acceptor.accept(new HintedMetamodelType(SYNC_FINAL_STATE_ID,
				getUrlFromPlugin("icons/obj16/Final-State-16.png"),
				"Final State", SyncgraphPackage.Literals.SYNC_STATE,
				stateEditHelper.get(), SemanticHints.STATE));
	}

	protected void registerSyncTransition(IMetaModelTypeAcceptor acceptor) {
		acceptor.accept(new HintedMetamodelType(NORMAL_TRANSITION_ID,
				getUrlFromPlugin("icons/obj16/transition-16.png"),
				"Normal Termination", SyncgraphPackage.Literals.SYNC_TRANSITION,
				transitionEditHelper.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(STRONG_TRANSITION_ID,
				getUrlFromPlugin("icons/obj16/transition-strong-16.png"),
				"Strong Abortion", SyncgraphPackage.Literals.SYNC_TRANSITION,
				transitionEditHelper.get(), SemanticHints.TRANSITION));

		acceptor.accept(new HintedMetamodelType(WEAK_TRANSITION_ID,
				getUrlFromPlugin("icons/obj16/transition-weak-16.png"),
				"Weak Abortion", SyncgraphPackage.Literals.SYNC_TRANSITION,
				transitionEditHelper.get(), SemanticHints.TRANSITION));
	}

}
