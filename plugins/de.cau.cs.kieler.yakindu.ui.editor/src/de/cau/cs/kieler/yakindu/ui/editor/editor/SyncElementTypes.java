package de.cau.cs.kieler.yakindu.ui.editor.editor;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * Helper class with {@link IElementType}s for the semantic elements and some
 * convenience methods.
 * 
 * @author wah
 * 
 */
public class SyncElementTypes extends AbstractElementTypeEnumerator {
	/** Element Types **/
	public static final IElementType STATECHART = getElementType("org.yakindu.sct.ui.editor.Statechart");
	public static final IElementType REGION = getElementType("org.yakindu.sct.ui.editor.Region");
	public static final IElementType SYNC_COMPOSITE_STATE =  getElementType("de.cau.cs.kieler.yakindu.ui.editor.CompositeState");
	public static final IElementType CHOICE = getElementType("org.yakindu.sct.ui.editor.Choice");
	
	
	public static IElementType getSyncStateElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.state");
	}
	public static IElementType getSyncInitialStateElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.initialstate");
	}
	
	public static IElementType getSyncFinalStateElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.finalstate");
	}
	
	public static IElementType getSyncWeakAbortTransitionElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.weaktransition");
	}
	
	public static IElementType getSyncStrongAbortTransitionElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.strongtransition");
	}
	
	public static IElementType getSyncNormalTerminationTransitionElementType(){
		return getElementType("de.cau.cs.kieler.yakindu.ui.editor.normaltransition");
	}
}
