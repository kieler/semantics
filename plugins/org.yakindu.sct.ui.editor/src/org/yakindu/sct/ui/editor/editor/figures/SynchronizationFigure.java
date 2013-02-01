/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * 
 * @author andreas muelder
 * 
 */
public class SynchronizationFigure extends RoundedRectangle {

	private final static int defaultSize = 8;

	public SynchronizationFigure() {
		this.setLineWidth(1);
		this.setForegroundColor(ColorConstants.black);
		this.setBackgroundColor(ColorConstants.black);
		this.setPreferredSize(new Dimension(defaultSize, defaultSize));
	}
}
