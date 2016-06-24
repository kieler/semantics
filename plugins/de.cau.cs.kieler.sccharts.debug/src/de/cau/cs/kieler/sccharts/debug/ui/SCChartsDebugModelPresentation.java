/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.debug.ui;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IEditorInput;

/**
 * TODO: Not quite sure, when this class methods are used.
 * 
 * @author lgr
 *
 */
public class SCChartsDebugModelPresentation extends LabelProvider implements IDebugModelPresentation {

	/**
	 * The ID of the debug context. Breakpoints are added to this ID and it will
	 * be searched only for breakpoints with this ID.
	 */
	public static String ID = "de.cau.cs.kieler.sccharts.debug.ui.presentation.scchartsDebugModelPresentation";

	@Override
	public IEditorInput getEditorInput(Object element) {
		return null;
	}

	@Override
	public String getEditorId(IEditorInput input, Object element) {
		return null;
	}

	@Override
	public void setAttribute(String attribute, Object value) {
	}

	@Override
	public void computeDetail(IValue value, IValueDetailListener listener) {
	}

}
