package de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.cau.cs.kieler.yakindu.ui.editor.editor.SyncElementTypes;

/**
 * Helper class with {@link IElementType}s for the semantic elements and some
 * convenience methods.
 * 
 * @author wah
 * 
 */
public final class SCCElementTypes extends SyncElementTypes {
	
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
