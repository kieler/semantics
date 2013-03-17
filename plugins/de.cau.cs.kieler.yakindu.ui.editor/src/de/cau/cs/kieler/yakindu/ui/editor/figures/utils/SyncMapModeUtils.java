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
package de.cau.cs.kieler.yakindu.ui.editor.figures.utils;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

public final class SyncMapModeUtils {

	private SyncMapModeUtils() {
	}

	private static final int DEFAULT_NODE_WIDTH = 30;
	private static final int DEFAULT_NODE_HEIGHT = 30;

	public static Dimension getDefaultSizeDimension(IMapMode mode) {
		return new Dimension(mode.DPtoLP(DEFAULT_NODE_WIDTH),
				mode.DPtoLP(DEFAULT_NODE_HEIGHT));
	}

	public static final Dimension DEFAULT_SMALL_NODE_DIMENSION = new Dimension(
			15, 15);

	public static Dimension getMappedDimensions(IMapMode mode, Dimension d) {
		return new Dimension(mode.DPtoLP(d.width), mode.DPtoLP(d.height));
	}
}
