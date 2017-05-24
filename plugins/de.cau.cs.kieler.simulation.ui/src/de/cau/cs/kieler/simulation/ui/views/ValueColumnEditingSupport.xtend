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

import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.jface.viewers.CheckboxCellEditor
import org.eclipse.jface.viewers.EditingSupport
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TextCellEditor

/**
 * @author aas
 *
 */
class ValueColumnEditingSupport extends EditingSupport {
    private var TableViewer viewer

    new(TableViewer viewer) {
        super(viewer);
        this.viewer = viewer;
    }
    
    override protected canEdit(Object element) {
        return true
    }
    
    override protected getCellEditor(Object element) {
        if(element instanceof Variable){
            if(element.value instanceof String) {
                return new TextCellEditor(viewer.table)
            } else if(element.value instanceof Boolean) {
                return new CheckboxCellEditor(viewer.table)
            } else if(element.value instanceof Float
                      || element.value instanceof Double
                      || element.value instanceof Integer){
                return new TextCellEditor(viewer.table)
            }
        }
        return null
    }
    
    override protected getValue(Object element) {
        if(element instanceof Variable) {
            val v = if(element.isDirty) element.userValue else element.value 
            if(v instanceof String) {
                return v
            } else if(v instanceof Boolean) {
                return v
            } else if(v instanceof Float
                      || v instanceof Double
                      || v instanceof Integer){
                return v.toString
            }
        }
        return null 
    }
    
    override protected setValue(Object element, Object value) {
        if(element instanceof Variable){
            try {
                if(element.value instanceof Float){
                    element.userValue = Float.valueOf(value.toString)    
                } if(element.value instanceof Double){
                    element.userValue = Double.valueOf(value.toString)    
                } else if(element.value instanceof Integer){
                    element.userValue = Integer.valueOf(value.toString)
                } else {
                    element.userValue = value
                }
            } catch (NumberFormatException e) {
                throw new Exception("Can't set variable "+element.name+ " to "+value, e)
            }
            viewer.update(element, null);
        }
    }
}