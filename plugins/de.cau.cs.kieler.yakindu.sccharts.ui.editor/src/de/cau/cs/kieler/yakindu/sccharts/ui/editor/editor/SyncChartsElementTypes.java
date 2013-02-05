package de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * Helper class with {@link IElementType}s for the semantic elements and some
 * convenience methods.
 * 
 * @author wah
 * 
 */
public final class SyncChartsElementTypes extends AbstractElementTypeEnumerator {
	/** Element Types **/
	public static final IElementType STATECHART = getElementType("org.yakindu.sct.ui.editor.Statechart");
	public static final IElementType REGION = getElementType("org.yakindu.sct.ui.editor.Region");
	public static final IElementType SYNC_STATE = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.state");
	public static final IElementType SYNC_INITIAL_STATE = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.initialstate");
	public static final IElementType SYNC_FINAL_STATE = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.finalstate");
	public static final IElementType SYNC_COMPOSITE_STATE = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.CompositeState");
	public static final IElementType SYNC_ORTHOGONAL_STATE = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.OrthogonalState");
	public static final IElementType SYNC_WEAK_ABORT_TRANSITION = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.weaktransition");
	public static final IElementType SYNC_STRONG_ABORT_TRANSITION = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.strongtransition");
	public static final IElementType SYNC_NORMAL_TERMINATION_TRANSITION = getElementType("de.cau.cs.kieler.yakindu.sccharts.ui.editor.normaltransition");
	public static final IElementType CHOICE = getElementType("org.yakindu.sct.ui.editor.Choice");
}
