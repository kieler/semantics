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
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.yakindu.sct.ui.editor.editparts.RegionEditPart;

import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.ui.editor.figures.SyncRegionFigure;

/**
 * The SyncRegion editpart.
 * 
 * @author wah
 * 
 */
public class SyncRegionEditPart extends RegionEditPart {

	@Inject
	private SyncRegionFigure primaryShape;

	/**
	 * This method Returns the SyncRegion figure.
	 * 
	 * @return the SyncRegion figure.
	 */
	private SyncRegionFigure getPrimaryShape() {
		return primaryShape;
	}
}
