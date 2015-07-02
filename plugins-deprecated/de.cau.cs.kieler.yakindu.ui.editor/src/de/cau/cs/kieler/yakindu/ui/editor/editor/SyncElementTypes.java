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

package de.cau.cs.kieler.yakindu.ui.editor.editor;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * This class defines constants that represent element types contributed in the
 * org.eclipse.gmf.runtime.emf.type.core.elementTypes extension point. It
 * defines the statechart, region, SyncState (initial, normal, and final
 * states), SyncTransition (weak abort, strong abort, and normal termination).
 * 
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public class SyncElementTypes extends AbstractElementTypeEnumerator {
	/** String constants **/
	private final static String STATECHART_ELEMENT = "org.yakindu.sct.ui.editor.Statechart";
	private final static String REGION_ELEMENT = "org.yakindu.sct.ui.editor.Region";
	private final static String SYNC_COMPOSITE_STATE_ELEMENT = "ode.cau.cs.kieler.yakindu.ui.editor.CompositeState";
	private final static String CHOICE_ELEMENT = "org.yakindu.sct.ui.editor.Choice";
	private final static String SYNC_STATE_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.state";
	private final static String SYNC_INITIAL_STATE_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.initialstate";
	private final static String SYNC_FINAL_STATE_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.finalstate";
	private final static String SYNC_WEAK_TRANSITION_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.weaktransition";
	private final static String SYNC_STRONG_TRANSITION_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.strongtransition";
	private final static String SYNC_NORMAL_TRANSITION_ELEMENT = "de.cau.cs.kieler.yakindu.ui.editor.normaltransition";

	/** Element Types **/
	public static final IElementType STATECHART = getElementType(STATECHART_ELEMENT);
	public static final IElementType REGION = getElementType(REGION_ELEMENT);
	public static final IElementType SYNC_COMPOSITE_STATE = getElementType(SYNC_COMPOSITE_STATE_ELEMENT);
	public static final IElementType CHOICE = getElementType(CHOICE_ELEMENT);

	public static IElementType getSyncStateElementType() {
		return getElementType(SYNC_STATE_ELEMENT);
	}

	public static IElementType getSyncInitialStateElementType() {
		return getElementType(SYNC_INITIAL_STATE_ELEMENT);
	}

	public static IElementType getSyncFinalStateElementType() {
		return getElementType(SYNC_FINAL_STATE_ELEMENT);
	}

	public static IElementType getSyncWeakAbortTransitionElementType() {
		return getElementType(SYNC_WEAK_TRANSITION_ELEMENT);
	}

	public static IElementType getSyncStrongAbortTransitionElementType() {
		return getElementType(SYNC_STRONG_TRANSITION_ELEMENT);
	}

	public static IElementType getSyncNormalTerminationTransitionElementType() {
		return getElementType(SYNC_NORMAL_TRANSITION_ELEMENT);
	}
}
