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
package de.cau.cs.kieler.sccharts.ui.debug

import org.eclipse.debug.core.model.IValue
import org.eclipse.debug.ui.IDebugModelPresentation
import org.eclipse.debug.ui.IValueDetailListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.ui.IEditorInput

/** 
 * Representation of the debug model for SCCharts.
 * @author lgr
 */
class SCChartsDebugModelPresentation extends LabelProvider implements IDebugModelPresentation {
    /** 
     * The ID of the debug context. Breakpoints are added to this ID and it will
     * be searched only for breakpoints with this ID.
     */
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debug.scchartsDebugModelPresentation"

    override IEditorInput getEditorInput(Object element) {
        return null
    }

    override String getEditorId(IEditorInput input, Object element) {
        return null
    }

    override void setAttribute(String attribute, Object value) {
    }

    override void computeDetail(IValue value, IValueDetailListener listener) {
    }
}
