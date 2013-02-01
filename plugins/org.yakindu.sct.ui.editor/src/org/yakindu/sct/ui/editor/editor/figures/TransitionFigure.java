/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.figures;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * 
 * @author muelder
 * 
 */
public class TransitionFigure extends PolylineConnectionEx {

	public TransitionFigure() {
		setLineWidth(1);
		setTargetDecoration(createTargetDecoration());
	}

	private RotatableDecoration createTargetDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setLineWidth(1);
		df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		return df;
	}
}
