/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.NDimensionalArrayElement
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.jface.resource.JFaceResources
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Font
import org.eclipse.swt.widgets.Display

/**
 * Label provider for the columns in the data pool view.
 * 
 * @author aas
 *
 */
class DataPoolColumnLabelProvider extends ColumnLabelProvider{
    
    /**
     * Color for errors.
     */
    private var Color lightRed
    
    /**
     * Constructor
     */
    new() {
    }
    
    /**
     * Cells for models get a color that is readable with their dark background.
     * Cells for variables with user values get a highlighting color.
     * Otherwise the normal color is returned.
     * 
     * @param element The element in the cell
     */
    override Color getForeground(Object element) {
        if(element.isDirty) {
            return Display.getDefault().getSystemColor(SWT.COLOR_DARK_MAGENTA)
        } else if(element instanceof Model) {
            return Display.getDefault().getSystemColor(SWT.COLOR_WHITE)
        }            
        return super.getForeground(element)
    }
    
    /**
     * Cells for models get a dark color so that they clearly separate the variables of the different models.
     * Cells for variables with user values get a highlighting color.
     * Otherwise the normal color is returned.
     * 
     * @param element The element in the cell
     */
    override Color getBackground(Object element) {
        if(element instanceof Model) {
            return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY)
        } else if(element instanceof Variable) {
            // Check if there is an trace mismatch event associated with the variable
            val mismatch = DataPoolView.instance?.getTraceMismatch(element)
            if(mismatch != null) {
                if(lightRed == null) {
                    lightRed = new Color(Display.current, 255, 128, 128)
                }
                return lightRed
            }
        }
        return super.getBackground(element)
    }
    
    /**
     * Cells with a user value get a highlighting font.
     * 
     * @param element The element in the cell
     */
    override getFont(Object element) {
        if(element.isDirty) {
            return boldFont
        }
        return super.getFont(element)
    }
    
    /**
     * Returns the bold system font.
     * 
     * @return the bold system font
     */
    private def Font getBoldFont() {
        return JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT)
    }
    
    /**
     * Checks whether an element has a user value (only for Variables / NDimensionalArrayElements).
     * 
     * @param element The element in the cell
     * @return true if the element has a user value
     */
    private def boolean isDirty(Object element) {
        if(element instanceof Variable) {
            return element.isDirty
        } else if(element instanceof NDimensionalArrayElement) {
            return element.isDirty
        }
        return false
    }
}