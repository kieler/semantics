/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
package de.cau.cs.kieler.esterel.cec.sim.kivi;

import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.kivi.AbstractEffect;

/**
 * @author root
 * 
 */
@SuppressWarnings("restriction")
public class HighlightEsterelMarkerEffect extends AbstractEffect {

	private XtextEditor editor;

	private IMarker marker;
	private IGotoMarker gotoMarker;

	private Color originalColor;
	private Color originalBackgroundColor;

	private Color color;
	private Color backgroundColor;

	private TextStyle newTextStyle;
	private TextStyle oldTextStyle;

	/**
	 * @param marker
	 * @param color
	 * @param backgroundColor
	 * @param originalColor
	 * @param originalBackgroundColor
	 * @param editor
	 */
	public HighlightEsterelMarkerEffect(final IMarker marker,
			final Color color, final Color backgroundColor,
			final Color originalColor, final Color originalBackgroundColor,
			final XtextEditor editor) {
		this.marker = marker;
		this.gotoMarker = (IGotoMarker) editor.getAdapter(IGotoMarker.class);
		this.color = color;
		this.backgroundColor = backgroundColor;
		this.originalColor = originalColor;
		this.originalBackgroundColor = originalBackgroundColor;
		this.editor = editor;
		this.newTextStyle = null;
		this.oldTextStyle = null;
	}

	/**
	 * @param marker
	 * @param newTextStyle
	 * @param oldTextStyle
	 * @param editor
	 */
	public HighlightEsterelMarkerEffect(final IMarker marker,
			final TextStyle newTextStyle, final TextStyle oldTextStyle,
			final XtextEditor editor) {
		this.marker = marker;
		this.gotoMarker = (IGotoMarker) editor.getAdapter(IGotoMarker.class);
		this.newTextStyle = newTextStyle;
		this.oldTextStyle = oldTextStyle;
		this.editor = editor;
	}

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		if (gotoMarker != null) {
			gotoMarker.gotoMarker(marker);
		}
//		ISelection selection = new Selection();
//		Point p = editor.getSelectionProvider().setSelection(selection)
//				.getViewer().getTextWidget().getSelectionRange();
//		StyleRange range;
//		if (newTextStyle != null) {
//			range = new StyleRange(newTextStyle);
//			range.start = p.x;
//			range.length = p.y;
//		} else {
//			range = new StyleRange(p.x, p.y, color, backgroundColor);
//		}
//		editor.getViewer().getTextWidget().setStyleRange(range);
//		editor.getViewer().getTextWidget().setSelectionRange(p.x, 0);
	}

	@Override
	public void undo() {
//		if (gotoMarker != null) {
//			gotoMarker.gotoMarker(marker);
//		}
//		Point p = editor.getViewer().getTextWidget().getSelectionRange();
//		StyleRange range;
//		if (oldTextStyle != null) {
//			range = new StyleRange(oldTextStyle);
//			range.start = p.x;
//			range.length = p.y;
//		} else {
//			range = new StyleRange(p.x, p.y, originalColor,
//					originalBackgroundColor);
//		}
//		editor.getViewer().getTextWidget().setStyleRange(range);
//		editor.getViewer().getTextWidget().setSelectionRange(p.x, 0);
	}

	@Override
	public boolean isMergeable() {
		return false;
	}

	@Override
	public HighlightEsterelMarkerEffect clone() {
		if (newTextStyle != null && oldTextStyle != null) {
			return new HighlightEsterelMarkerEffect(marker, newTextStyle,
					oldTextStyle, editor);
		} else {
			return new HighlightEsterelMarkerEffect(marker, color,
					backgroundColor, color, backgroundColor, editor);
		}
	}

	void setColor(final Color color) {
		this.color = color;
	}

	void setBackgroundColor(final Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

}