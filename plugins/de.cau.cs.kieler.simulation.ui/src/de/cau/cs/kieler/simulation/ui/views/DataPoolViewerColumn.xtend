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
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.jface.resource.JFaceResources
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Font
import org.eclipse.swt.widgets.Display

/**
 * @author aas
 *
 */
class DataPoolViewerColumn extends ColumnLabelProvider{
    
    
    new() {
    }
    
    override Color getForeground(Object element) {
        if(element instanceof Variable) {
            if(element.isDirty)
                return Display.getDefault().getSystemColor(SWT.COLOR_DARK_MAGENTA)
        } else if(element instanceof Model) {
            return Display.getDefault().getSystemColor(SWT.COLOR_WHITE)
        }            
        return super.getForeground(element)
    }
    
    override Color getBackground(Object element) {
        if(element instanceof Model) {
            return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY)
        }            
        return super.getBackground(element)
    }
    
    override getFont(Object element) {
        if(element instanceof Variable) {
            if(element.isDirty)
                return boldFont
        }
        return super.getFont(element)
    }
    
    private def Font getBoldFont() {
        return JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT)
    }
}